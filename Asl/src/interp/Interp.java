/**
 * Copyright (c) 2011, Jordi Cortadella
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *    * Redistributions of source code must retain the above copyright
 *      notice, this list of conditions and the following disclaimer.
 *    * Redistributions in binary form must reproduce the above copyright
 *      notice, this list of conditions and the following disclaimer in the
 *      documentation and/or other materials provided with the distribution.
 *    * Neither the name of the <organization> nor the
 *      names of its contributors may be used to endorse or promote products
 *      derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

package interp;

import parser.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/** Class that implements the interpreter of the language. */

public class Interp {

    final static class MyResult {
        private final Data value;
        private final String texto;
    
        public MyResult(Data first, String second) {
            this.value = first;
            this.texto = second;
        }
    
        public Data getData() {
            return value;
        }
    
        public String getTexto() {
            return texto;
        }
    }
    
    private BufferedWriter bw;
    
    
    

    /** Memory of the virtual machine. */
    private Stack Stack;

    /**
     * Map between function names (keys) and ASTs (values).
     * Each entry of the map stores the root of the AST
     * correponding to the function.
     */
    private HashMap<String,AslTree> FuncName2Tree;

    /** Standard input of the interpreter (System.in). */
    private Scanner stdin;

    /**
     * Stores the line number of the current statement.
     * The line number is used to report runtime errors.
     */
    private int linenumber = -1;

    /** File to write the trace of function calls. */
    private PrintWriter trace = null;

    /** Nested levels of function calls. */
    private int function_nesting = -1;
    
    /**
     * Constructor of the interpreter. It prepares the main
     * data structures for the execution of the main program.
     */
    public Interp(AslTree T, String tracefile) {
        assert T != null;
        MapFunctions(T);  // Creates the table to map function names into AST nodes
        PreProcessAST(T); // Some internal pre-processing ot the AST
        Stack = new Stack(); // Creates the memory of the virtual machine
        // Initializes the standard input of the program
        stdin = new Scanner (new BufferedReader(new InputStreamReader(System.in)));
        if (tracefile != null) {
            try {
                trace = new PrintWriter(new FileWriter(tracefile));
            } catch (IOException e) {
                System.err.println(e);
                System.exit(1);
            }
        }
        function_nesting = -1;
    }

    /** Runs the program by calling the main function without parameters. */
    public void Run() {
        String ruta = "Traduccion.java";
        File traduccion = new File(ruta);
        
        try {
            bw = new BufferedWriter(new FileWriter(traduccion));
            
            bw.write("public class Traduccion {"); bw.newLine();
            
            int fnum = 0;
            for (Map.Entry<String, AslTree> funciones : FuncName2Tree.entrySet()) {
                bw.newLine();
                
                String fname = funciones.getKey();
                translateFunction(fname);
                
                ++fnum;
            }
            
            bw.write("}");
            
            bw.close();
            
            // indenta segun los estandares de java
            Process p = Runtime.getRuntime().exec("astyle --style=java Traduccion.java");
        }
        catch (IOException exc) {
            System.out.println(exc.toString());
        }
    }

    /** Returns the contents of the stack trace */
    public String getStackTrace() {
        return Stack.getStackTrace(lineNumber());
    }

    /** Returns a summarized contents of the stack trace */
    public String getStackTrace(int nitems) {
        return Stack.getStackTrace(lineNumber(), nitems);
    }
    
    /**
     * Gathers information from the AST and creates the map from
     * function names to the corresponding AST nodes.
     */
    private void MapFunctions(AslTree T) {
        assert T != null && T.getType() == AslLexer.LIST_FUNCTIONS;
        FuncName2Tree = new HashMap<String,AslTree> ();
        int n = T.getChildCount();
        for (int i = 0; i < n; ++i) {
            AslTree f = T.getChild(i);
            assert f.getType() == AslLexer.FUNC;
            String fname = f.getChild(1).getText();
            if (FuncName2Tree.containsKey(fname)) {
                throw new RuntimeException("Multiple definitions of function " + fname);
            }
            FuncName2Tree.put(fname, f);
        } 
    }

    /**
     * Performs some pre-processing on the AST. Basically, it
     * calculates the value of the literals and stores a simpler
     * representation. See AslTree.java for details.
     */
    private void PreProcessAST(AslTree T) {
        if (T == null) return;
        switch(T.getType()) {
            case AslLexer.INT: T.setIntValue(); break;
            case AslLexer.STRING: T.setStringValue(); break;
            case AslLexer.BOOLEAN: T.setBooleanValue(); break;
            default: break;
        }
        int n = T.getChildCount();
        for (int i = 0; i < n; ++i) PreProcessAST(T.getChild(i));
    }

    /**
     * Gets the current line number. In case of a runtime error,
     * it returns the line number of the statement causing the
     * error.
     */
    public int lineNumber() { return linenumber; }

    /** Defines the current line number associated to an AST node. */
    private void setLineNumber(AslTree t) { linenumber = t.getLine();}

    /** Defines the current line number with a specific value */
    private void setLineNumber(int l) { linenumber = l;}
    
    private void translateFunction(String fname) throws IOException {
        System.out.println(fname);
        
        AslTree f = FuncName2Tree.get(fname);
        
        Stack.pushActivationRecord(fname,lineNumber());
        setLineNumber(f);
        
        String ftype = f.getChild(0).getText();
        if (fname.equals("main") && !ftype.equals("void")) 
            throw new RuntimeException ("function main must be void");
            
        if (fname.equals("main")) {
            bw.write("public static void main (String args[]) {");
        }
        else {
            bw.write("public static " + ftype + " " + fname + "(");
            AslTree fparams = f.getChild(2);
            for (int i = 0; i < fparams.getChildCount(); ++i) {
                String ptype = fparams.getChild(i).getChild(0).getText();
                String pname = fparams.getChild(i).getChild(1).getText();
                
                Stack.defineVariable(pname, new Data(ptype));
                
                if (i > 0) bw.write(", ");
                
                if (ptype.equals("int")) ptype = "Integer";
                else if (ptype.equals("bool")) ptype = "Boolean";
                else if (ptype.equals("float")) ptype = "Float";
                else if (ptype.equals("motor")) ptype = "Motor";
                
                if (fparams.getType() == AslLexer.PREF) {
                    bw.write(ptype + "& " + pname);
                }
                else {
                    bw.write(ptype + " " + pname);
                }
            }
            bw.write(") {"); bw.newLine();
        }
        
        AslTree finstr = f.getChild(3);
        translateListInstruction(finstr);
        
        
        
        if (f.getChildCount() == 5) {
            AslTree freturn = f.getChild(4).getChild(0);
            bw.write("return ");
            MyResult result = translateExpression(freturn);
            
            if (result.getData().getType() != (new Data(ftype)).getType()) {
                throw new RuntimeException ("Incompatible types in Function type and Return type");
            }
            bw.write(result.getTexto()+";"); bw.newLine();
        }
        
        Stack.popActivationRecord();
        
        bw.write("}"); bw.newLine();
    }
    
    private void translateListInstruction(AslTree t) throws IOException {
        assert t != null;
        for (int i = 0; i < t.getChildCount(); ++i) {
            translateInstruction(t.getChild(i));
            boolean comas = (t.getChild(i).getType() != AslLexer.WHILE) && (t.getChild(i).getType() != AslLexer.IF);
            if (comas) bw.write(";");
            bw.newLine();
        }
    }
    
    private void translateInstruction(AslTree t) throws IOException {
        assert t != null;
        setLineNumber(t);

        Data type;
        MyResult result;
        switch (t.getType()) {
        
            case AslLexer.ASSIGN:
                String vname = t.getChild(0).getText();
                
                // aqui necesitarios el tipo de la Expresion, pero aun no lo hemos evaluado
                //bw.write(vname + " = ");
                
                // translateExpression ya va imprimiento la parte derecha
                result = translateExpression(t.getChild(1));
                // aqui ya tenemos el tipo de la variable, pero ya ha escrito la parte derecha
                if (Stack.defineVariable(vname, result.getData())){
                    String tipo = "";
                    if (result.getData().getType() == Data.Type.INTEGER) tipo = "Integer";
                    if (result.getData().getType() == Data.Type.BOOLEAN) tipo = "Boolean";
                    if (result.getData().getType() == Data.Type.FLOAT) tipo = "Float";
                    if (result.getData().getType() == Data.Type.MOTOR) tipo = "MOTOR";
                    if (result.getData().getType() == Data.Type.VOID) {
                        throw new RuntimeException ("Assign of void type not valid");
                    }
                    
                    bw.write (tipo+" "+vname + " = " +result.getTexto());
                }else{
                    bw.write (vname + " = " +result.getTexto());
                }
                break;

            case AslLexer.IF:
                bw.write("if(");
                result = translateExpression(t.getChild(0));
                checkBoolean(result.getData());
                bw.write(result.getTexto()+") {"); bw.newLine();
                translateListInstruction(t.getChild(1));
                bw.write("}"); bw.newLine();
                
                if (t.getChildCount() == 3) {
                    bw.write("else {"); bw.newLine();
                    translateListInstruction(t.getChild(2));
                    bw.write("}");
                }
                bw.newLine();
                break;
                
            case AslLexer.WHILE:
                bw.write("while(");
                result = translateExpression(t.getChild(0));
                checkBoolean(result.getData());
                
                bw.write(result.getTexto()+") {"); bw.newLine();
                
                translateListInstruction(t.getChild(1));
                
                bw.write("}"); bw.newLine();
                break;
                
            case AslLexer.WRITE:
                bw.write("System.out.println(");
                if (t.getChild(0).getType() == AslLexer.STRING) bw.write(t.getChild(0).getText());
                else{
                    result = translateExpression(t.getChild(0));
                    bw.write(result.getTexto());
                }
                bw.write(")");
                break;

            case AslLexer.FUNCALL:
                result = translateExpression(t);
                if (result.getData().getType() != Data.Type.VOID){
                    throw new RuntimeException ("Return funcall not assigned");
                }
                bw.write(result.getTexto());
                break;

            default: assert false; // Should never happen
        }
    }
    
    private MyResult translateExpression(AslTree t) throws IOException {
        assert t != null;

        int previous_line = lineNumber();
        setLineNumber(t);
        int type = t.getType();

        Data value = null;
        MyResult ret = null;
        // Atoms
        switch (type) {
            case AslLexer.ID:
                value = new Data(Stack.getVariable(t.getText()));
                ret = new MyResult(value, t.getText());
                break;
            case AslLexer.INT:
                value = new Data(Data.Type.INTEGER);
                ret = new MyResult(value, t.getText());
                break;
            case AslLexer.BOOLEAN:
                value = new Data(Data.Type.BOOLEAN);
                ret = new MyResult(value, t.getText());
                break;
            case AslLexer.FLOAT:
                value = new Data(Data.Type.FLOAT);
                ret = new MyResult(value, t.getText());
                break;
            case AslLexer.DMOTOR:
                value = new Data(Data.Type.MOTOR);
                ret = new MyResult(value, t.getText());
                break;
            case AslLexer.FUNCALL:
                String fname = t.getChild(0).getText();
                AslTree func = null;
                checkFunctionExists(func,fname);
                func = FuncName2Tree.get(fname);
                checkTypeParams(func.getChild(2),t.getChild(1));
                value = new Data(func.getChild(0).getText());
                String funcion = fname+"(";
                for (int i = 0; i < t.getChild(1).getChildCount(); ++i) {
                    if (i > 0) funcion+=", "; //bw.write(", ");
                    funcion+=t.getChild(1).getChild(i).getText();
                }
                funcion+=")";
                ret = new MyResult(value, funcion);
                break;
            default: break;
        }
        
        /*
        switch (type){
            case AslLexer.GMOTOR:
                ret = translateExpression(t.getChild(1));
                checkMotor(ret.getData());
                break;
            case AslLexer.SMOTOR:
                value = evaluateExpression(t.getChild(1));
                checkMotor(value);
                if (t.getChildCount()>2){
                        Data valueAux = evaluateExpression(t.getChild(2));
                        checkNumerical(valueAux);
                        if (t.getChild(0).getText() != "setRadio" && t.getChild(0).getText() != "setSpeed"){ 
                                checkInteger(valueAux);
                        }
                }
                break;
            case AslLexer.GSENSOR:
                value = evaluateExpression(t.getChild(1));
                checkInteger(value);
                break;
            default: break;
        }
        */
        
        // Retrieve the original line and return
        if (value != null || ret !=null) {
            setLineNumber(previous_line);
            return ret;
        }
        
        // Unary operators
        if (t.getChildCount() == 1) {
            String texto = "";
            switch (type) {
                case AslLexer.PLUS:
                case AslLexer.MINUS:
                    if (type == AslLexer.PLUS) texto="+";
                    else if (type == AslLexer.MINUS) texto="-";
                    ret = translateExpression(t.getChild(0));
                    checkNumerical(ret.getData());
                    ret = new MyResult(ret.getData(),texto+ret.getTexto());
                    break;
                case AslLexer.NOT:
                    ret = translateExpression(t.getChild(0));
                    checkBoolean(ret.getData());
                    ret = new MyResult(ret.getData(),texto+ret.getTexto());
                    break;
                case AslLexer.SSLEEP:
                    ret = translateExpression(t.getChild(0));
                    checkNumerical(ret.getData());
                    break;
                default: assert false; // Should never happen
            }
            setLineNumber(previous_line);
            return ret;
        }

        // Two operands
        Data value2;
        MyResult ret2;
        String texto ="";
        ret = translateExpression(t.getChild(0));
        switch (type) {
            case AslLexer.EQUAL:
            case AslLexer.NOT_EQUAL:
            case AslLexer.LT:
            case AslLexer.LE:
            case AslLexer.GT:
            case AslLexer.GE:
                if (type == AslLexer.EQUAL) texto="==";
                else if (type == AslLexer.NOT_EQUAL) texto="!=";
                else if (type == AslLexer.LT) texto="<";
                else if (type == AslLexer.LE) texto="<=";
                else if (type == AslLexer.GT) texto=">";
                else if (type == AslLexer.GE) texto=">=";
                
                ret2 = translateExpression(t.getChild(1));
                checkNumerical(ret.getData()); checkNumerical(ret2.getData());
                if (ret.getData().getType() != ret2.getData().getType()) {
                  throw new RuntimeException ("Incompatible types in relational expression");
                }
                ret = new MyResult (new Data(Data.Type.BOOLEAN),ret.getTexto()+texto+ret2.getTexto());
                break;
            case AslLexer.PLUS:
            case AslLexer.MINUS:
            case AslLexer.MUL:
            case AslLexer.DIV:
                if (type == AslLexer.PLUS) texto=" + ";
                else if (type == AslLexer.MINUS)texto=" - ";
                else if (type == AslLexer.MUL) texto=" * ";
                else if (type == AslLexer.DIV) texto=" / ";
                
                ret2 = translateExpression(t.getChild(1));
                checkNumerical(ret.getData());checkNumerical(ret2.getData());
                if (ret.getData().getType() != ret2.getData().getType()) {
                  throw new RuntimeException ("Incompatible types in relational expression");
                }
                ret = new MyResult (ret.getData(),ret.getTexto()+texto+ret2.getTexto());
                break;
            case AslLexer.MOD:
                ret2 = translateExpression(t.getChild(1));             
                checkInteger(ret.getData()); checkInteger(ret2.getData());
                ret = new MyResult (ret.getData(),ret.getTexto()+texto+ret2.getTexto());
                break;
            case AslLexer.AND:
            case AslLexer.OR:
                checkBoolean(ret.getData());
                if (type == AslLexer.AND) texto=" && ";
                else if (type == AslLexer.OR) texto=" || ";
                
                ret2 = translateExpression(t.getChild(1));
                checkBoolean(ret2.getData());
                ret = new MyResult (ret.getData(),ret.getTexto()+texto+ret2.getTexto());
                break;
                
            default: assert false; // Should never happen
        }
        
        setLineNumber(previous_line);
        return ret;
    }
    
    
    /** Checks that the data is Boolean and raises an exception if it is not. */
    private void checkBoolean (Data b) {
        if (!b.isBoolean()) {
            throw new RuntimeException ("Expecting Boolean expression");
        }
    }
    
    /** Checks that the data is integer and raises an exception if it is not. */
    private void checkInteger (Data b) {
        if (!b.isInteger()) {
            throw new RuntimeException ("Expecting integer numerical expression");
        }
    }

    private void checkFloat (Data b) {
        if (!b.isFloat()) {
            throw new RuntimeException ("Expecting float numerical expression");
        }
    }

    private void checkNumerical (Data b) {
        if (!b.isInteger() && !b.isFloat()) {
            throw new RuntimeException ("Expecting numerical expression");
        }
    }

    private void checkMotor (Data b) {
        if (!b.isMotor()) {
            throw new RuntimeException ("Expecting Motor expression");
        }
    }
    
    private void checkFunctionExists(AslTree func, String name) {
        func = FuncName2Tree.get(name);
        if (func == null) {
            throw new RuntimeException ("Function not exist");
        }
    }
    
    private void checkTypeParams(AslTree params, AslTree args) {
        assert params.getChildCount() == args.getChildCount();
        
        for (int i = 0; i < args.getChildCount(); ++i) {
            Data param = Stack.getVariable(args.getChild(i).getText());
            String tipo = params.getChild(i).getChild(0).getText();
            
            if ((tipo == "bool" && param.getType() != Data.Type.BOOLEAN) ||
                (tipo == "int" && param.getType() != Data.Type.INTEGER) ||
                (tipo == "float" && param.getType() != Data.Type.FLOAT) ||
                (tipo == "motor" && param.getType() != Data.Type.MOTOR))
                throw new RuntimeException ("expected " + tipo + " param, found " + param.getType().toString());
        }
        
    }
}

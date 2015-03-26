// $ANTLR 3.4 /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g 2015-03-26 14:07:20

    package parser;
    import interp.AslTree;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


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
@SuppressWarnings({"all", "warnings", "unchecked"})
public class AslParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACELERAR", "AND", "ARGLIST", "ASSIGN", "AVANZAR", "BOOLEAN", "COMMENT", "DIV", "DMOTOR", "DO", "ELSE", "ENDFUNC", "ENDIF", "ENDWHILE", "EQUAL", "ESC_SEQ", "FALSE", "FLOAT", "FUNC", "FUNCALL", "GE", "GETCOLOR", "GETRADIO", "GETSPEED", "GETTOUCH", "GETULTRA", "GIRAR", "GMOTOR", "GSENSOR", "GT", "ID", "IF", "INT", "LE", "LIST_FUNCTIONS", "LIST_INSTR", "LT", "MINUS", "MOD", "MOTOR", "MUL", "NOT", "NOT_EQUAL", "OR", "PARAMS", "PARAR", "PLUS", "PREF", "PVALUE", "READ", "RETURN", "SETRADIO", "SETSPEED", "SLEEP", "SMOTOR", "SSLEEP", "STRING", "THEN", "TIPO", "TRUE", "WHILE", "WRITE", "WS", "'&'", "'('", "')'", "','", "'.'", "';'"
    };

    public static final int EOF=-1;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int ACELERAR=4;
    public static final int AND=5;
    public static final int ARGLIST=6;
    public static final int ASSIGN=7;
    public static final int AVANZAR=8;
    public static final int BOOLEAN=9;
    public static final int COMMENT=10;
    public static final int DIV=11;
    public static final int DMOTOR=12;
    public static final int DO=13;
    public static final int ELSE=14;
    public static final int ENDFUNC=15;
    public static final int ENDIF=16;
    public static final int ENDWHILE=17;
    public static final int EQUAL=18;
    public static final int ESC_SEQ=19;
    public static final int FALSE=20;
    public static final int FLOAT=21;
    public static final int FUNC=22;
    public static final int FUNCALL=23;
    public static final int GE=24;
    public static final int GETCOLOR=25;
    public static final int GETRADIO=26;
    public static final int GETSPEED=27;
    public static final int GETTOUCH=28;
    public static final int GETULTRA=29;
    public static final int GIRAR=30;
    public static final int GMOTOR=31;
    public static final int GSENSOR=32;
    public static final int GT=33;
    public static final int ID=34;
    public static final int IF=35;
    public static final int INT=36;
    public static final int LE=37;
    public static final int LIST_FUNCTIONS=38;
    public static final int LIST_INSTR=39;
    public static final int LT=40;
    public static final int MINUS=41;
    public static final int MOD=42;
    public static final int MOTOR=43;
    public static final int MUL=44;
    public static final int NOT=45;
    public static final int NOT_EQUAL=46;
    public static final int OR=47;
    public static final int PARAMS=48;
    public static final int PARAR=49;
    public static final int PLUS=50;
    public static final int PREF=51;
    public static final int PVALUE=52;
    public static final int READ=53;
    public static final int RETURN=54;
    public static final int SETRADIO=55;
    public static final int SETSPEED=56;
    public static final int SLEEP=57;
    public static final int SMOTOR=58;
    public static final int SSLEEP=59;
    public static final int STRING=60;
    public static final int THEN=61;
    public static final int TIPO=62;
    public static final int TRUE=63;
    public static final int WHILE=64;
    public static final int WRITE=65;
    public static final int WS=66;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public AslParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public AslParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return AslParser.tokenNames; }
    public String getGrammarFileName() { return "/home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:64:1: prog : ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) ;
    public final AslParser.prog_return prog() throws RecognitionException {
        AslParser.prog_return retval = new AslParser.prog_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EOF2=null;
        AslParser.func_return func1 =null;


        AslTree EOF2_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_func=new RewriteRuleSubtreeStream(adaptor,"rule func");
        try {
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:64:9: ( ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) )
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:64:11: ( func )+ EOF
            {
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:64:11: ( func )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==FUNC) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:64:11: func
            	    {
            	    pushFollow(FOLLOW_func_in_prog265);
            	    func1=func();

            	    state._fsp--;

            	    stream_func.add(func1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog268);  
            stream_EOF.add(EOF2);


            // AST REWRITE
            // elements: func
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 64:21: -> ^( LIST_FUNCTIONS ( func )+ )
            {
                // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:64:24: ^( LIST_FUNCTIONS ( func )+ )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(LIST_FUNCTIONS, "LIST_FUNCTIONS")
                , root_1);

                if ( !(stream_func.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_func.hasNext() ) {
                    adaptor.addChild(root_1, stream_func.nextTree());

                }
                stream_func.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class func_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "func"
    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:68:1: func : FUNC ^ ID params block_instructions ENDFUNC !;
    public final AslParser.func_return func() throws RecognitionException {
        AslParser.func_return retval = new AslParser.func_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token FUNC3=null;
        Token ID4=null;
        Token ENDFUNC7=null;
        AslParser.params_return params5 =null;

        AslParser.block_instructions_return block_instructions6 =null;


        AslTree FUNC3_tree=null;
        AslTree ID4_tree=null;
        AslTree ENDFUNC7_tree=null;

        try {
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:68:9: ( FUNC ^ ID params block_instructions ENDFUNC !)
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:68:11: FUNC ^ ID params block_instructions ENDFUNC !
            {
            root_0 = (AslTree)adaptor.nil();


            FUNC3=(Token)match(input,FUNC,FOLLOW_FUNC_in_func310); 
            FUNC3_tree = 
            (AslTree)adaptor.create(FUNC3)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(FUNC3_tree, root_0);


            ID4=(Token)match(input,ID,FOLLOW_ID_in_func313); 
            ID4_tree = 
            (AslTree)adaptor.create(ID4)
            ;
            adaptor.addChild(root_0, ID4_tree);


            pushFollow(FOLLOW_params_in_func315);
            params5=params();

            state._fsp--;

            adaptor.addChild(root_0, params5.getTree());

            pushFollow(FOLLOW_block_instructions_in_func317);
            block_instructions6=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions6.getTree());

            ENDFUNC7=(Token)match(input,ENDFUNC,FOLLOW_ENDFUNC_in_func319); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "func"


    public static class params_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "params"
    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:72:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
    public final AslParser.params_return params() throws RecognitionException {
        AslParser.params_return retval = new AslParser.params_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal8=null;
        Token char_literal10=null;
        AslParser.paramlist_return paramlist9 =null;


        AslTree char_literal8_tree=null;
        AslTree char_literal10_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:72:9: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:72:11: '(' ( paramlist )? ')'
            {
            char_literal8=(Token)match(input,68,FOLLOW_68_in_params339);  
            stream_68.add(char_literal8);


            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:72:15: ( paramlist )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==TIPO) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:72:15: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params341);
                    paramlist9=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist9.getTree());

                    }
                    break;

            }


            char_literal10=(Token)match(input,69,FOLLOW_69_in_params344);  
            stream_69.add(char_literal10);


            // AST REWRITE
            // elements: paramlist
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 72:30: -> ^( PARAMS ( paramlist )? )
            {
                // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:72:33: ^( PARAMS ( paramlist )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:72:42: ( paramlist )?
                if ( stream_paramlist.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramlist.nextTree());

                }
                stream_paramlist.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "params"


    public static class paramlist_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "paramlist"
    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:76:1: paramlist : param ( ',' ! param )* ;
    public final AslParser.paramlist_return paramlist() throws RecognitionException {
        AslParser.paramlist_return retval = new AslParser.paramlist_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal12=null;
        AslParser.param_return param11 =null;

        AslParser.param_return param13 =null;


        AslTree char_literal12_tree=null;

        try {
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:77:9: ( param ( ',' ! param )* )
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:77:11: param ( ',' ! param )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist379);
            param11=param();

            state._fsp--;

            adaptor.addChild(root_0, param11.getTree());

            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:77:17: ( ',' ! param )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==70) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:77:18: ',' ! param
            	    {
            	    char_literal12=(Token)match(input,70,FOLLOW_70_in_paramlist382); 

            	    pushFollow(FOLLOW_param_in_paramlist385);
            	    param13=param();

            	    state._fsp--;

            	    adaptor.addChild(root_0, param13.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "paramlist"


    public static class param_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "param"
    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:82:1: param : ( TIPO '&' id= ID -> ^( PREF TIPO ID ) | TIPO id= ID -> ^( PVALUE TIPO ID ) );
    public final AslParser.param_return param() throws RecognitionException {
        AslParser.param_return retval = new AslParser.param_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token id=null;
        Token TIPO14=null;
        Token char_literal15=null;
        Token TIPO16=null;

        AslTree id_tree=null;
        AslTree TIPO14_tree=null;
        AslTree char_literal15_tree=null;
        AslTree TIPO16_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_TIPO=new RewriteRuleTokenStream(adaptor,"token TIPO");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:82:9: ( TIPO '&' id= ID -> ^( PREF TIPO ID ) | TIPO id= ID -> ^( PVALUE TIPO ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==TIPO) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==67) ) {
                    alt4=1;
                }
                else if ( (LA4_1==ID) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:82:11: TIPO '&' id= ID
                    {
                    TIPO14=(Token)match(input,TIPO,FOLLOW_TIPO_in_param408);  
                    stream_TIPO.add(TIPO14);


                    char_literal15=(Token)match(input,67,FOLLOW_67_in_param410);  
                    stream_67.add(char_literal15);


                    id=(Token)match(input,ID,FOLLOW_ID_in_param414);  
                    stream_ID.add(id);


                    // AST REWRITE
                    // elements: TIPO, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 82:26: -> ^( PREF TIPO ID )
                    {
                        // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:82:29: ^( PREF TIPO ID )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(PREF, "PREF")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_TIPO.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:83:11: TIPO id= ID
                    {
                    TIPO16=(Token)match(input,TIPO,FOLLOW_TIPO_in_param436);  
                    stream_TIPO.add(TIPO16);


                    id=(Token)match(input,ID,FOLLOW_ID_in_param440);  
                    stream_ID.add(id);


                    // AST REWRITE
                    // elements: TIPO, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 83:22: -> ^( PVALUE TIPO ID )
                    {
                        // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:83:25: ^( PVALUE TIPO ID )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(PVALUE, "PVALUE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_TIPO.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "param"


    public static class block_instructions_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block_instructions"
    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:87:1: block_instructions : instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) ;
    public final AslParser.block_instructions_return block_instructions() throws RecognitionException {
        AslParser.block_instructions_return retval = new AslParser.block_instructions_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal18=null;
        AslParser.instruction_return instruction17 =null;

        AslParser.instruction_return instruction19 =null;


        AslTree char_literal18_tree=null;
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:88:9: ( instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:88:11: instruction ( ';' instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions476);
            instruction17=instruction();

            state._fsp--;

            stream_instruction.add(instruction17.getTree());

            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:88:23: ( ';' instruction )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==72) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:88:24: ';' instruction
            	    {
            	    char_literal18=(Token)match(input,72,FOLLOW_72_in_block_instructions479);  
            	    stream_72.add(char_literal18);


            	    pushFollow(FOLLOW_instruction_in_block_instructions481);
            	    instruction19=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction19.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            // AST REWRITE
            // elements: instruction
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 88:42: -> ^( LIST_INSTR ( instruction )+ )
            {
                // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:88:45: ^( LIST_INSTR ( instruction )+ )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(LIST_INSTR, "LIST_INSTR")
                , root_1);

                if ( !(stream_instruction.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_instruction.hasNext() ) {
                    adaptor.addChild(root_1, stream_instruction.nextTree());

                }
                stream_instruction.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "block_instructions"


    public static class instruction_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instruction"
    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:92:1: instruction : ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write || motor | sleep );
    public final AslParser.instruction_return instruction() throws RecognitionException {
        AslParser.instruction_return retval = new AslParser.instruction_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.assign_return assign20 =null;

        AslParser.ite_stmt_return ite_stmt21 =null;

        AslParser.while_stmt_return while_stmt22 =null;

        AslParser.funcall_return funcall23 =null;

        AslParser.return_stmt_return return_stmt24 =null;

        AslParser.read_return read25 =null;

        AslParser.write_return write26 =null;

        AslParser.motor_return motor27 =null;

        AslParser.sleep_return sleep28 =null;



        try {
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:93:9: ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write || motor | sleep )
            int alt6=10;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case 68:
                    {
                    alt6=4;
                    }
                    break;
                case 71:
                    {
                    alt6=9;
                    }
                    break;
                case EQUAL:
                    {
                    alt6=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }

                }
                break;
            case IF:
                {
                alt6=2;
                }
                break;
            case WHILE:
                {
                alt6=3;
                }
                break;
            case RETURN:
                {
                alt6=5;
                }
                break;
            case READ:
                {
                alt6=6;
                }
                break;
            case WRITE:
                {
                alt6=7;
                }
                break;
            case ELSE:
            case ENDFUNC:
            case ENDIF:
            case ENDWHILE:
            case 72:
                {
                alt6=8;
                }
                break;
            case SLEEP:
                {
                alt6=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:93:11: assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction518);
                    assign20=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign20.getTree());

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:94:11: ite_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction538);
                    ite_stmt21=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt21.getTree());

                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:95:11: while_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction556);
                    while_stmt22=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt22.getTree());

                    }
                    break;
                case 4 :
                    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:96:11: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction572);
                    funcall23=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall23.getTree());

                    }
                    break;
                case 5 :
                    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:97:11: return_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction591);
                    return_stmt24=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt24.getTree());

                    }
                    break;
                case 6 :
                    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:98:11: read
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_read_in_instruction606);
                    read25=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read25.getTree());

                    }
                    break;
                case 7 :
                    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:99:11: write
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_write_in_instruction628);
                    write26=write();

                    state._fsp--;

                    adaptor.addChild(root_0, write26.getTree());

                    }
                    break;
                case 8 :
                    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:101:9: 
                    {
                    root_0 = (AslTree)adaptor.nil();


                    }
                    break;
                case 9 :
                    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:101:11: motor
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_motor_in_instruction674);
                    motor27=motor();

                    state._fsp--;

                    adaptor.addChild(root_0, motor27.getTree());

                    }
                    break;
                case 10 :
                    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:102:11: sleep
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_sleep_in_instruction695);
                    sleep28=sleep();

                    state._fsp--;

                    adaptor.addChild(root_0, sleep28.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instruction"


    public static class motor_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "motor"
    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:105:1: motor : ( ID '.' b= AVANZAR '(' ( INT )? ')' -> ^( SMOTOR AVANZAR ID ( INT )? ) | ID '.' b= ACELERAR '(' INT ')' -> ^( SMOTOR ACELERAR ID INT ) | ID '.' b= PARAR '(' ')' -> ^( SMOTOR PARAR ID ) | ID '.' (b= SETRADIO |b= SETSPEED ) '(' (c= INT |c= FLOAT ) ')' -> ^( SMOTOR $b ID $c) );
    public final AslParser.motor_return motor() throws RecognitionException {
        AslParser.motor_return retval = new AslParser.motor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token b=null;
        Token c=null;
        Token ID29=null;
        Token char_literal30=null;
        Token char_literal31=null;
        Token INT32=null;
        Token char_literal33=null;
        Token ID34=null;
        Token char_literal35=null;
        Token char_literal36=null;
        Token INT37=null;
        Token char_literal38=null;
        Token ID39=null;
        Token char_literal40=null;
        Token char_literal41=null;
        Token char_literal42=null;
        Token ID43=null;
        Token char_literal44=null;
        Token char_literal45=null;
        Token char_literal46=null;

        AslTree b_tree=null;
        AslTree c_tree=null;
        AslTree ID29_tree=null;
        AslTree char_literal30_tree=null;
        AslTree char_literal31_tree=null;
        AslTree INT32_tree=null;
        AslTree char_literal33_tree=null;
        AslTree ID34_tree=null;
        AslTree char_literal35_tree=null;
        AslTree char_literal36_tree=null;
        AslTree INT37_tree=null;
        AslTree char_literal38_tree=null;
        AslTree ID39_tree=null;
        AslTree char_literal40_tree=null;
        AslTree char_literal41_tree=null;
        AslTree char_literal42_tree=null;
        AslTree ID43_tree=null;
        AslTree char_literal44_tree=null;
        AslTree char_literal45_tree=null;
        AslTree char_literal46_tree=null;
        RewriteRuleTokenStream stream_ACELERAR=new RewriteRuleTokenStream(adaptor,"token ACELERAR");
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_SETSPEED=new RewriteRuleTokenStream(adaptor,"token SETSPEED");
        RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_SETRADIO=new RewriteRuleTokenStream(adaptor,"token SETRADIO");
        RewriteRuleTokenStream stream_AVANZAR=new RewriteRuleTokenStream(adaptor,"token AVANZAR");
        RewriteRuleTokenStream stream_PARAR=new RewriteRuleTokenStream(adaptor,"token PARAR");

        try {
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:105:9: ( ID '.' b= AVANZAR '(' ( INT )? ')' -> ^( SMOTOR AVANZAR ID ( INT )? ) | ID '.' b= ACELERAR '(' INT ')' -> ^( SMOTOR ACELERAR ID INT ) | ID '.' b= PARAR '(' ')' -> ^( SMOTOR PARAR ID ) | ID '.' (b= SETRADIO |b= SETSPEED ) '(' (c= INT |c= FLOAT ) ')' -> ^( SMOTOR $b ID $c) )
            int alt10=4;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==71) ) {
                    switch ( input.LA(3) ) {
                    case AVANZAR:
                        {
                        alt10=1;
                        }
                        break;
                    case ACELERAR:
                        {
                        alt10=2;
                        }
                        break;
                    case PARAR:
                        {
                        alt10=3;
                        }
                        break;
                    case SETRADIO:
                    case SETSPEED:
                        {
                        alt10=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 2, input);

                        throw nvae;

                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:105:11: ID '.' b= AVANZAR '(' ( INT )? ')'
                    {
                    ID29=(Token)match(input,ID,FOLLOW_ID_in_motor724);  
                    stream_ID.add(ID29);


                    char_literal30=(Token)match(input,71,FOLLOW_71_in_motor726);  
                    stream_71.add(char_literal30);


                    b=(Token)match(input,AVANZAR,FOLLOW_AVANZAR_in_motor730);  
                    stream_AVANZAR.add(b);


                    char_literal31=(Token)match(input,68,FOLLOW_68_in_motor731);  
                    stream_68.add(char_literal31);


                    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:105:30: ( INT )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==INT) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:105:30: INT
                            {
                            INT32=(Token)match(input,INT,FOLLOW_INT_in_motor732);  
                            stream_INT.add(INT32);


                            }
                            break;

                    }


                    char_literal33=(Token)match(input,69,FOLLOW_69_in_motor734);  
                    stream_69.add(char_literal33);


                    // AST REWRITE
                    // elements: ID, AVANZAR, INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 105:38: -> ^( SMOTOR AVANZAR ID ( INT )? )
                    {
                        // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:105:41: ^( SMOTOR AVANZAR ID ( INT )? )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(SMOTOR, "SMOTOR")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_AVANZAR.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:105:61: ( INT )?
                        if ( stream_INT.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_INT.nextNode()
                            );

                        }
                        stream_INT.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:106:11: ID '.' b= ACELERAR '(' INT ')'
                    {
                    ID34=(Token)match(input,ID,FOLLOW_ID_in_motor759);  
                    stream_ID.add(ID34);


                    char_literal35=(Token)match(input,71,FOLLOW_71_in_motor761);  
                    stream_71.add(char_literal35);


                    b=(Token)match(input,ACELERAR,FOLLOW_ACELERAR_in_motor765);  
                    stream_ACELERAR.add(b);


                    char_literal36=(Token)match(input,68,FOLLOW_68_in_motor766);  
                    stream_68.add(char_literal36);


                    INT37=(Token)match(input,INT,FOLLOW_INT_in_motor767);  
                    stream_INT.add(INT37);


                    char_literal38=(Token)match(input,69,FOLLOW_69_in_motor768);  
                    stream_69.add(char_literal38);


                    // AST REWRITE
                    // elements: ID, ACELERAR, INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 106:38: -> ^( SMOTOR ACELERAR ID INT )
                    {
                        // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:106:41: ^( SMOTOR ACELERAR ID INT )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(SMOTOR, "SMOTOR")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ACELERAR.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_INT.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:107:11: ID '.' b= PARAR '(' ')'
                    {
                    ID39=(Token)match(input,ID,FOLLOW_ID_in_motor792);  
                    stream_ID.add(ID39);


                    char_literal40=(Token)match(input,71,FOLLOW_71_in_motor794);  
                    stream_71.add(char_literal40);


                    b=(Token)match(input,PARAR,FOLLOW_PARAR_in_motor798);  
                    stream_PARAR.add(b);


                    char_literal41=(Token)match(input,68,FOLLOW_68_in_motor799);  
                    stream_68.add(char_literal41);


                    char_literal42=(Token)match(input,69,FOLLOW_69_in_motor800);  
                    stream_69.add(char_literal42);


                    // AST REWRITE
                    // elements: PARAR, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 107:32: -> ^( SMOTOR PARAR ID )
                    {
                        // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:107:35: ^( SMOTOR PARAR ID )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(SMOTOR, "SMOTOR")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_PARAR.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:108:11: ID '.' (b= SETRADIO |b= SETSPEED ) '(' (c= INT |c= FLOAT ) ')'
                    {
                    ID43=(Token)match(input,ID,FOLLOW_ID_in_motor822);  
                    stream_ID.add(ID43);


                    char_literal44=(Token)match(input,71,FOLLOW_71_in_motor824);  
                    stream_71.add(char_literal44);


                    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:108:18: (b= SETRADIO |b= SETSPEED )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==SETRADIO) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==SETSPEED) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;

                    }
                    switch (alt8) {
                        case 1 :
                            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:108:19: b= SETRADIO
                            {
                            b=(Token)match(input,SETRADIO,FOLLOW_SETRADIO_in_motor829);  
                            stream_SETRADIO.add(b);


                            }
                            break;
                        case 2 :
                            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:108:30: b= SETSPEED
                            {
                            b=(Token)match(input,SETSPEED,FOLLOW_SETSPEED_in_motor833);  
                            stream_SETSPEED.add(b);


                            }
                            break;

                    }


                    char_literal45=(Token)match(input,68,FOLLOW_68_in_motor835);  
                    stream_68.add(char_literal45);


                    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:108:44: (c= INT |c= FLOAT )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==INT) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==FLOAT) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;

                    }
                    switch (alt9) {
                        case 1 :
                            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:108:45: c= INT
                            {
                            c=(Token)match(input,INT,FOLLOW_INT_in_motor839);  
                            stream_INT.add(c);


                            }
                            break;
                        case 2 :
                            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:108:51: c= FLOAT
                            {
                            c=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_motor843);  
                            stream_FLOAT.add(c);


                            }
                            break;

                    }


                    char_literal46=(Token)match(input,69,FOLLOW_69_in_motor845);  
                    stream_69.add(char_literal46);


                    // AST REWRITE
                    // elements: ID, b, c
                    // token labels: b, c
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_b=new RewriteRuleTokenStream(adaptor,"token b",b);
                    RewriteRuleTokenStream stream_c=new RewriteRuleTokenStream(adaptor,"token c",c);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 108:63: -> ^( SMOTOR $b ID $c)
                    {
                        // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:108:66: ^( SMOTOR $b ID $c)
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(SMOTOR, "SMOTOR")
                        , root_1);

                        adaptor.addChild(root_1, stream_b.nextNode());

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_c.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "motor"


    public static class sleep_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sleep"
    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:111:1: sleep : SLEEP '(' (c= INT |c= FLOAT ) ')' -> ^( SSLEEP $c) ;
    public final AslParser.sleep_return sleep() throws RecognitionException {
        AslParser.sleep_return retval = new AslParser.sleep_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token c=null;
        Token SLEEP47=null;
        Token char_literal48=null;
        Token char_literal49=null;

        AslTree c_tree=null;
        AslTree SLEEP47_tree=null;
        AslTree char_literal48_tree=null;
        AslTree char_literal49_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");
        RewriteRuleTokenStream stream_SLEEP=new RewriteRuleTokenStream(adaptor,"token SLEEP");

        try {
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:111:9: ( SLEEP '(' (c= INT |c= FLOAT ) ')' -> ^( SSLEEP $c) )
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:111:11: SLEEP '(' (c= INT |c= FLOAT ) ')'
            {
            SLEEP47=(Token)match(input,SLEEP,FOLLOW_SLEEP_in_sleep886);  
            stream_SLEEP.add(SLEEP47);


            char_literal48=(Token)match(input,68,FOLLOW_68_in_sleep888);  
            stream_68.add(char_literal48);


            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:111:21: (c= INT |c= FLOAT )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==INT) ) {
                alt11=1;
            }
            else if ( (LA11_0==FLOAT) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:111:22: c= INT
                    {
                    c=(Token)match(input,INT,FOLLOW_INT_in_sleep893);  
                    stream_INT.add(c);


                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:111:30: c= FLOAT
                    {
                    c=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_sleep899);  
                    stream_FLOAT.add(c);


                    }
                    break;

            }


            char_literal49=(Token)match(input,69,FOLLOW_69_in_sleep902);  
            stream_69.add(char_literal49);


            // AST REWRITE
            // elements: c
            // token labels: c
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_c=new RewriteRuleTokenStream(adaptor,"token c",c);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 111:43: -> ^( SSLEEP $c)
            {
                // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:111:46: ^( SSLEEP $c)
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(SSLEEP, "SSLEEP")
                , root_1);

                adaptor.addChild(root_1, stream_c.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "sleep"


    public static class assign_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assign"
    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:115:1: assign : esq eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] esq expr ) ;
    public final AslParser.assign_return assign() throws RecognitionException {
        AslParser.assign_return retval = new AslParser.assign_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        AslParser.esq_return esq50 =null;

        AslParser.expr_return expr51 =null;


        AslTree eq_tree=null;
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_esq=new RewriteRuleSubtreeStream(adaptor,"rule esq");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:115:9: ( esq eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] esq expr ) )
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:115:11: esq eq= EQUAL expr
            {
            pushFollow(FOLLOW_esq_in_assign930);
            esq50=esq();

            state._fsp--;

            stream_esq.add(esq50.getTree());

            eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign934);  
            stream_EQUAL.add(eq);


            pushFollow(FOLLOW_expr_in_assign936);
            expr51=expr();

            state._fsp--;

            stream_expr.add(expr51.getTree());

            // AST REWRITE
            // elements: expr, esq
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 115:29: -> ^( ASSIGN[$eq,\":=\"] esq expr )
            {
                // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:115:32: ^( ASSIGN[$eq,\":=\"] esq expr )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ASSIGN, eq, ":=")
                , root_1);

                adaptor.addChild(root_1, stream_esq.nextTree());

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assign"


    public static class esq_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "esq"
    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:118:1: esq : ID ;
    public final AslParser.esq_return esq() throws RecognitionException {
        AslParser.esq_return retval = new AslParser.esq_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID52=null;

        AslTree ID52_tree=null;

        try {
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:118:9: ( ID )
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:118:11: ID
            {
            root_0 = (AslTree)adaptor.nil();


            ID52=(Token)match(input,ID,FOLLOW_ID_in_esq976); 
            ID52_tree = 
            (AslTree)adaptor.create(ID52)
            ;
            adaptor.addChild(root_0, ID52_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "esq"


    public static class ite_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ite_stmt"
    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:122:1: ite_stmt : IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !;
    public final AslParser.ite_stmt_return ite_stmt() throws RecognitionException {
        AslParser.ite_stmt_return retval = new AslParser.ite_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token IF53=null;
        Token THEN55=null;
        Token ELSE57=null;
        Token ENDIF59=null;
        AslParser.expr_return expr54 =null;

        AslParser.block_instructions_return block_instructions56 =null;

        AslParser.block_instructions_return block_instructions58 =null;


        AslTree IF53_tree=null;
        AslTree THEN55_tree=null;
        AslTree ELSE57_tree=null;
        AslTree ENDIF59_tree=null;

        try {
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:122:9: ( IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !)
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:122:11: IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !
            {
            root_0 = (AslTree)adaptor.nil();


            IF53=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt993); 
            IF53_tree = 
            (AslTree)adaptor.create(IF53)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF53_tree, root_0);


            pushFollow(FOLLOW_expr_in_ite_stmt996);
            expr54=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr54.getTree());

            THEN55=(Token)match(input,THEN,FOLLOW_THEN_in_ite_stmt998); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt1001);
            block_instructions56=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions56.getTree());

            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:122:45: ( ELSE ! block_instructions )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==ELSE) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:122:46: ELSE ! block_instructions
                    {
                    ELSE57=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt1004); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt1007);
                    block_instructions58=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions58.getTree());

                    }
                    break;

            }


            ENDIF59=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ite_stmt1011); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ite_stmt"


    public static class while_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "while_stmt"
    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:126:1: while_stmt : WHILE ^ expr DO ! block_instructions ENDWHILE !;
    public final AslParser.while_stmt_return while_stmt() throws RecognitionException {
        AslParser.while_stmt_return retval = new AslParser.while_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WHILE60=null;
        Token DO62=null;
        Token ENDWHILE64=null;
        AslParser.expr_return expr61 =null;

        AslParser.block_instructions_return block_instructions63 =null;


        AslTree WHILE60_tree=null;
        AslTree DO62_tree=null;
        AslTree ENDWHILE64_tree=null;

        try {
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:127:9: ( WHILE ^ expr DO ! block_instructions ENDWHILE !)
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:127:11: WHILE ^ expr DO ! block_instructions ENDWHILE !
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE60=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt1038); 
            WHILE60_tree = 
            (AslTree)adaptor.create(WHILE60)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE60_tree, root_0);


            pushFollow(FOLLOW_expr_in_while_stmt1041);
            expr61=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr61.getTree());

            DO62=(Token)match(input,DO,FOLLOW_DO_in_while_stmt1043); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt1046);
            block_instructions63=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions63.getTree());

            ENDWHILE64=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_while_stmt1048); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "while_stmt"


    public static class return_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "return_stmt"
    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:131:1: return_stmt : RETURN ^ ( expr )? ;
    public final AslParser.return_stmt_return return_stmt() throws RecognitionException {
        AslParser.return_stmt_return retval = new AslParser.return_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RETURN65=null;
        AslParser.expr_return expr66 =null;


        AslTree RETURN65_tree=null;

        try {
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:132:9: ( RETURN ^ ( expr )? )
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:132:11: RETURN ^ ( expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            RETURN65=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt1075); 
            RETURN65_tree = 
            (AslTree)adaptor.create(RETURN65)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RETURN65_tree, root_0);


            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:132:19: ( expr )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0 >= FALSE && LA13_0 <= FLOAT)||LA13_0==GETCOLOR||(LA13_0 >= GETTOUCH && LA13_0 <= GETULTRA)||LA13_0==ID||LA13_0==INT||LA13_0==MINUS||LA13_0==MOTOR||LA13_0==NOT||LA13_0==PLUS||LA13_0==TRUE||LA13_0==68) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:132:19: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt1078);
                    expr66=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr66.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "return_stmt"


    public static class read_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "read"
    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:136:1: read : READ ^ esq ;
    public final AslParser.read_return read() throws RecognitionException {
        AslParser.read_return retval = new AslParser.read_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token READ67=null;
        AslParser.esq_return esq68 =null;


        AslTree READ67_tree=null;

        try {
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:136:9: ( READ ^ esq )
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:136:11: READ ^ esq
            {
            root_0 = (AslTree)adaptor.nil();


            READ67=(Token)match(input,READ,FOLLOW_READ_in_read1100); 
            READ67_tree = 
            (AslTree)adaptor.create(READ67)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(READ67_tree, root_0);


            pushFollow(FOLLOW_esq_in_read1103);
            esq68=esq();

            state._fsp--;

            adaptor.addChild(root_0, esq68.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "read"


    public static class write_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "write"
    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:140:1: write : WRITE ^ ( expr | STRING ) ;
    public final AslParser.write_return write() throws RecognitionException {
        AslParser.write_return retval = new AslParser.write_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WRITE69=null;
        Token STRING71=null;
        AslParser.expr_return expr70 =null;


        AslTree WRITE69_tree=null;
        AslTree STRING71_tree=null;

        try {
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:140:9: ( WRITE ^ ( expr | STRING ) )
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:140:11: WRITE ^ ( expr | STRING )
            {
            root_0 = (AslTree)adaptor.nil();


            WRITE69=(Token)match(input,WRITE,FOLLOW_WRITE_in_write1123); 
            WRITE69_tree = 
            (AslTree)adaptor.create(WRITE69)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WRITE69_tree, root_0);


            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:140:18: ( expr | STRING )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0 >= FALSE && LA14_0 <= FLOAT)||LA14_0==GETCOLOR||(LA14_0 >= GETTOUCH && LA14_0 <= GETULTRA)||LA14_0==ID||LA14_0==INT||LA14_0==MINUS||LA14_0==MOTOR||LA14_0==NOT||LA14_0==PLUS||LA14_0==TRUE||LA14_0==68) ) {
                alt14=1;
            }
            else if ( (LA14_0==STRING) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:140:19: expr
                    {
                    pushFollow(FOLLOW_expr_in_write1127);
                    expr70=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr70.getTree());

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:140:26: STRING
                    {
                    STRING71=(Token)match(input,STRING,FOLLOW_STRING_in_write1131); 
                    STRING71_tree = 
                    (AslTree)adaptor.create(STRING71)
                    ;
                    adaptor.addChild(root_0, STRING71_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "write"


    public static class expr_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:144:1: expr : boolterm ( OR ^ boolterm )* ;
    public final AslParser.expr_return expr() throws RecognitionException {
        AslParser.expr_return retval = new AslParser.expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OR73=null;
        AslParser.boolterm_return boolterm72 =null;

        AslParser.boolterm_return boolterm74 =null;


        AslTree OR73_tree=null;

        try {
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:144:9: ( boolterm ( OR ^ boolterm )* )
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:144:11: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr1154);
            boolterm72=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm72.getTree());

            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:144:20: ( OR ^ boolterm )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==OR) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:144:21: OR ^ boolterm
            	    {
            	    OR73=(Token)match(input,OR,FOLLOW_OR_in_expr1157); 
            	    OR73_tree = 
            	    (AslTree)adaptor.create(OR73)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR73_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr1160);
            	    boolterm74=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm74.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class boolterm_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolterm"
    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:147:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final AslParser.boolterm_return boolterm() throws RecognitionException {
        AslParser.boolterm_return retval = new AslParser.boolterm_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token AND76=null;
        AslParser.boolfact_return boolfact75 =null;

        AslParser.boolfact_return boolfact77 =null;


        AslTree AND76_tree=null;

        try {
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:147:9: ( boolfact ( AND ^ boolfact )* )
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:147:11: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm1178);
            boolfact75=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact75.getTree());

            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:147:20: ( AND ^ boolfact )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==AND) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:147:21: AND ^ boolfact
            	    {
            	    AND76=(Token)match(input,AND,FOLLOW_AND_in_boolterm1181); 
            	    AND76_tree = 
            	    (AslTree)adaptor.create(AND76)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND76_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm1184);
            	    boolfact77=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact77.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolterm"


    public static class boolfact_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolfact"
    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:150:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final AslParser.boolfact_return boolfact() throws RecognitionException {
        AslParser.boolfact_return retval = new AslParser.boolfact_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EQUAL79=null;
        Token NOT_EQUAL80=null;
        Token LT81=null;
        Token LE82=null;
        Token GT83=null;
        Token GE84=null;
        AslParser.num_expr_return num_expr78 =null;

        AslParser.num_expr_return num_expr85 =null;


        AslTree EQUAL79_tree=null;
        AslTree NOT_EQUAL80_tree=null;
        AslTree LT81_tree=null;
        AslTree LE82_tree=null;
        AslTree GT83_tree=null;
        AslTree GE84_tree=null;

        try {
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:150:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:150:11: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact1202);
            num_expr78=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr78.getTree());

            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:150:20: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==EQUAL||LA18_0==GE||LA18_0==GT||LA18_0==LE||LA18_0==LT||LA18_0==NOT_EQUAL) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:150:21: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:150:21: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt17=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt17=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt17=2;
                        }
                        break;
                    case LT:
                        {
                        alt17=3;
                        }
                        break;
                    case LE:
                        {
                        alt17=4;
                        }
                        break;
                    case GT:
                        {
                        alt17=5;
                        }
                        break;
                    case GE:
                        {
                        alt17=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;

                    }

                    switch (alt17) {
                        case 1 :
                            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:150:22: EQUAL ^
                            {
                            EQUAL79=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact1206); 
                            EQUAL79_tree = 
                            (AslTree)adaptor.create(EQUAL79)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(EQUAL79_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:150:31: NOT_EQUAL ^
                            {
                            NOT_EQUAL80=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact1211); 
                            NOT_EQUAL80_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL80)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL80_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:150:44: LT ^
                            {
                            LT81=(Token)match(input,LT,FOLLOW_LT_in_boolfact1216); 
                            LT81_tree = 
                            (AslTree)adaptor.create(LT81)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT81_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:150:50: LE ^
                            {
                            LE82=(Token)match(input,LE,FOLLOW_LE_in_boolfact1221); 
                            LE82_tree = 
                            (AslTree)adaptor.create(LE82)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE82_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:150:56: GT ^
                            {
                            GT83=(Token)match(input,GT,FOLLOW_GT_in_boolfact1226); 
                            GT83_tree = 
                            (AslTree)adaptor.create(GT83)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT83_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:150:62: GE ^
                            {
                            GE84=(Token)match(input,GE,FOLLOW_GE_in_boolfact1231); 
                            GE84_tree = 
                            (AslTree)adaptor.create(GE84)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE84_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact1235);
                    num_expr85=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr85.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolfact"


    public static class num_expr_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "num_expr"
    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:153:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final AslParser.num_expr_return num_expr() throws RecognitionException {
        AslParser.num_expr_return retval = new AslParser.num_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PLUS87=null;
        Token MINUS88=null;
        AslParser.term_return term86 =null;

        AslParser.term_return term89 =null;


        AslTree PLUS87_tree=null;
        AslTree MINUS88_tree=null;

        try {
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:153:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:153:11: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr1253);
            term86=term();

            state._fsp--;

            adaptor.addChild(root_0, term86.getTree());

            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:153:16: ( ( PLUS ^| MINUS ^) term )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==MINUS||LA20_0==PLUS) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:153:18: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:153:18: ( PLUS ^| MINUS ^)
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==PLUS) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==MINUS) ) {
            	        alt19=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:153:19: PLUS ^
            	            {
            	            PLUS87=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr1258); 
            	            PLUS87_tree = 
            	            (AslTree)adaptor.create(PLUS87)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS87_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:153:27: MINUS ^
            	            {
            	            MINUS88=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr1263); 
            	            MINUS88_tree = 
            	            (AslTree)adaptor.create(MINUS88)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS88_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr1267);
            	    term89=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term89.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "num_expr"


    public static class term_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:156:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final AslParser.term_return term() throws RecognitionException {
        AslParser.term_return retval = new AslParser.term_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MUL91=null;
        Token DIV92=null;
        Token MOD93=null;
        AslParser.factor_return factor90 =null;

        AslParser.factor_return factor94 =null;


        AslTree MUL91_tree=null;
        AslTree DIV92_tree=null;
        AslTree MOD93_tree=null;

        try {
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:156:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:156:11: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1289);
            factor90=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor90.getTree());

            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:156:18: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==DIV||LA22_0==MOD||LA22_0==MUL) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:156:20: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:156:20: ( MUL ^| DIV ^| MOD ^)
            	    int alt21=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt21=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt21=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt21=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt21) {
            	        case 1 :
            	            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:156:21: MUL ^
            	            {
            	            MUL91=(Token)match(input,MUL,FOLLOW_MUL_in_term1294); 
            	            MUL91_tree = 
            	            (AslTree)adaptor.create(MUL91)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MUL91_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:156:28: DIV ^
            	            {
            	            DIV92=(Token)match(input,DIV,FOLLOW_DIV_in_term1299); 
            	            DIV92_tree = 
            	            (AslTree)adaptor.create(DIV92)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV92_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:156:35: MOD ^
            	            {
            	            MOD93=(Token)match(input,MOD,FOLLOW_MOD_in_term1304); 
            	            MOD93_tree = 
            	            (AslTree)adaptor.create(MOD93)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD93_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1308);
            	    factor94=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor94.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:159:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final AslParser.factor_return factor() throws RecognitionException {
        AslParser.factor_return retval = new AslParser.factor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOT95=null;
        Token PLUS96=null;
        Token MINUS97=null;
        AslParser.atom_return atom98 =null;


        AslTree NOT95_tree=null;
        AslTree PLUS96_tree=null;
        AslTree MINUS97_tree=null;

        try {
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:159:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:159:11: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AslTree)adaptor.nil();


            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:159:11: ( NOT ^| PLUS ^| MINUS ^)?
            int alt23=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt23=1;
                    }
                    break;
                case PLUS:
                    {
                    alt23=2;
                    }
                    break;
                case MINUS:
                    {
                    alt23=3;
                    }
                    break;
            }

            switch (alt23) {
                case 1 :
                    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:159:12: NOT ^
                    {
                    NOT95=(Token)match(input,NOT,FOLLOW_NOT_in_factor1329); 
                    NOT95_tree = 
                    (AslTree)adaptor.create(NOT95)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOT95_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:159:19: PLUS ^
                    {
                    PLUS96=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1334); 
                    PLUS96_tree = 
                    (AslTree)adaptor.create(PLUS96)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLUS96_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:159:27: MINUS ^
                    {
                    MINUS97=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1339); 
                    MINUS97_tree = 
                    (AslTree)adaptor.create(MINUS97)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MINUS97_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1344);
            atom98=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom98.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "factor"


    public static class atom_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:165:1: atom : ( ID | INT | FLOAT |m= MOTOR '(' b= INT ')' -> ^( DMOTOR[m, \"MOTOR\"+$b.text] ) | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !| (b= GETCOLOR |b= GETULTRA |b= GETTOUCH ) '(' INT ')' -> ^( GSENSOR $b INT ) | ID '.' (b= GETSPEED |b= GETRADIO ) '(' ')' -> ^( GMOTOR $b ID ) );
    public final AslParser.atom_return atom() throws RecognitionException {
        AslParser.atom_return retval = new AslParser.atom_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token m=null;
        Token b=null;
        Token ID99=null;
        Token INT100=null;
        Token FLOAT101=null;
        Token char_literal102=null;
        Token char_literal103=null;
        Token char_literal105=null;
        Token char_literal107=null;
        Token char_literal108=null;
        Token INT109=null;
        Token char_literal110=null;
        Token ID111=null;
        Token char_literal112=null;
        Token char_literal113=null;
        Token char_literal114=null;
        AslParser.funcall_return funcall104 =null;

        AslParser.expr_return expr106 =null;


        AslTree m_tree=null;
        AslTree b_tree=null;
        AslTree ID99_tree=null;
        AslTree INT100_tree=null;
        AslTree FLOAT101_tree=null;
        AslTree char_literal102_tree=null;
        AslTree char_literal103_tree=null;
        AslTree char_literal105_tree=null;
        AslTree char_literal107_tree=null;
        AslTree char_literal108_tree=null;
        AslTree INT109_tree=null;
        AslTree char_literal110_tree=null;
        AslTree ID111_tree=null;
        AslTree char_literal112_tree=null;
        AslTree char_literal113_tree=null;
        AslTree char_literal114_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_GETCOLOR=new RewriteRuleTokenStream(adaptor,"token GETCOLOR");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_GETSPEED=new RewriteRuleTokenStream(adaptor,"token GETSPEED");
        RewriteRuleTokenStream stream_GETTOUCH=new RewriteRuleTokenStream(adaptor,"token GETTOUCH");
        RewriteRuleTokenStream stream_MOTOR=new RewriteRuleTokenStream(adaptor,"token MOTOR");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_GETRADIO=new RewriteRuleTokenStream(adaptor,"token GETRADIO");
        RewriteRuleTokenStream stream_GETULTRA=new RewriteRuleTokenStream(adaptor,"token GETULTRA");

        try {
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:165:9: ( ID | INT | FLOAT |m= MOTOR '(' b= INT ')' -> ^( DMOTOR[m, \"MOTOR\"+$b.text] ) | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !| (b= GETCOLOR |b= GETULTRA |b= GETTOUCH ) '(' INT ')' -> ^( GSENSOR $b INT ) | ID '.' (b= GETSPEED |b= GETRADIO ) '(' ')' -> ^( GMOTOR $b ID ) )
            int alt27=9;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case 68:
                    {
                    alt27=6;
                    }
                    break;
                case 71:
                    {
                    alt27=9;
                    }
                    break;
                case AND:
                case DIV:
                case DO:
                case ELSE:
                case ENDFUNC:
                case ENDIF:
                case ENDWHILE:
                case EQUAL:
                case GE:
                case GT:
                case LE:
                case LT:
                case MINUS:
                case MOD:
                case MUL:
                case NOT_EQUAL:
                case OR:
                case PLUS:
                case THEN:
                case 69:
                case 70:
                case 72:
                    {
                    alt27=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;

                }

                }
                break;
            case INT:
                {
                alt27=2;
                }
                break;
            case FLOAT:
                {
                alt27=3;
                }
                break;
            case MOTOR:
                {
                alt27=4;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt27=5;
                }
                break;
            case 68:
                {
                alt27=7;
                }
                break;
            case GETCOLOR:
            case GETTOUCH:
            case GETULTRA:
                {
                alt27=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }

            switch (alt27) {
                case 1 :
                    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:165:11: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID99=(Token)match(input,ID,FOLLOW_ID_in_atom1367); 
                    ID99_tree = 
                    (AslTree)adaptor.create(ID99)
                    ;
                    adaptor.addChild(root_0, ID99_tree);


                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:166:11: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT100=(Token)match(input,INT,FOLLOW_INT_in_atom1380); 
                    INT100_tree = 
                    (AslTree)adaptor.create(INT100)
                    ;
                    adaptor.addChild(root_0, INT100_tree);


                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:167:5: FLOAT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    FLOAT101=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_atom1386); 
                    FLOAT101_tree = 
                    (AslTree)adaptor.create(FLOAT101)
                    ;
                    adaptor.addChild(root_0, FLOAT101_tree);


                    }
                    break;
                case 4 :
                    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:168:11: m= MOTOR '(' b= INT ')'
                    {
                    m=(Token)match(input,MOTOR,FOLLOW_MOTOR_in_atom1400);  
                    stream_MOTOR.add(m);


                    char_literal102=(Token)match(input,68,FOLLOW_68_in_atom1402);  
                    stream_68.add(char_literal102);


                    b=(Token)match(input,INT,FOLLOW_INT_in_atom1406);  
                    stream_INT.add(b);


                    char_literal103=(Token)match(input,69,FOLLOW_69_in_atom1408);  
                    stream_69.add(char_literal103);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 168:33: -> ^( DMOTOR[m, \"MOTOR\"+$b.text] )
                    {
                        // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:168:36: ^( DMOTOR[m, \"MOTOR\"+$b.text] )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(DMOTOR, m, "MOTOR"+(b!=null?b.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:169:11: (b= TRUE |b= FALSE )
                    {
                    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:169:11: (b= TRUE |b= FALSE )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==TRUE) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==FALSE) ) {
                        alt24=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;

                    }
                    switch (alt24) {
                        case 1 :
                            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:169:12: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1430);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:169:21: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1436);  
                            stream_FALSE.add(b);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 169:30: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:169:33: ^( BOOLEAN[$b,$b.text] )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(BOOLEAN, b, (b!=null?b.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:170:11: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom1456);
                    funcall104=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall104.getTree());

                    }
                    break;
                case 7 :
                    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:171:11: '(' ! expr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    char_literal105=(Token)match(input,68,FOLLOW_68_in_atom1468); 

                    pushFollow(FOLLOW_expr_in_atom1471);
                    expr106=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr106.getTree());

                    char_literal107=(Token)match(input,69,FOLLOW_69_in_atom1473); 

                    }
                    break;
                case 8 :
                    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:172:11: (b= GETCOLOR |b= GETULTRA |b= GETTOUCH ) '(' INT ')'
                    {
                    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:172:11: (b= GETCOLOR |b= GETULTRA |b= GETTOUCH )
                    int alt25=3;
                    switch ( input.LA(1) ) {
                    case GETCOLOR:
                        {
                        alt25=1;
                        }
                        break;
                    case GETULTRA:
                        {
                        alt25=2;
                        }
                        break;
                    case GETTOUCH:
                        {
                        alt25=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;

                    }

                    switch (alt25) {
                        case 1 :
                            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:172:12: b= GETCOLOR
                            {
                            b=(Token)match(input,GETCOLOR,FOLLOW_GETCOLOR_in_atom1489);  
                            stream_GETCOLOR.add(b);


                            }
                            break;
                        case 2 :
                            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:172:25: b= GETULTRA
                            {
                            b=(Token)match(input,GETULTRA,FOLLOW_GETULTRA_in_atom1495);  
                            stream_GETULTRA.add(b);


                            }
                            break;
                        case 3 :
                            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:172:38: b= GETTOUCH
                            {
                            b=(Token)match(input,GETTOUCH,FOLLOW_GETTOUCH_in_atom1501);  
                            stream_GETTOUCH.add(b);


                            }
                            break;

                    }


                    char_literal108=(Token)match(input,68,FOLLOW_68_in_atom1504);  
                    stream_68.add(char_literal108);


                    INT109=(Token)match(input,INT,FOLLOW_INT_in_atom1506);  
                    stream_INT.add(INT109);


                    char_literal110=(Token)match(input,69,FOLLOW_69_in_atom1507);  
                    stream_69.add(char_literal110);


                    // AST REWRITE
                    // elements: b, INT
                    // token labels: b
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_b=new RewriteRuleTokenStream(adaptor,"token b",b);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 172:61: -> ^( GSENSOR $b INT )
                    {
                        // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:172:64: ^( GSENSOR $b INT )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(GSENSOR, "GSENSOR")
                        , root_1);

                        adaptor.addChild(root_1, stream_b.nextNode());

                        adaptor.addChild(root_1, 
                        stream_INT.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 9 :
                    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:174:11: ID '.' (b= GETSPEED |b= GETRADIO ) '(' ')'
                    {
                    ID111=(Token)match(input,ID,FOLLOW_ID_in_atom1583);  
                    stream_ID.add(ID111);


                    char_literal112=(Token)match(input,71,FOLLOW_71_in_atom1584);  
                    stream_71.add(char_literal112);


                    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:174:16: (b= GETSPEED |b= GETRADIO )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==GETSPEED) ) {
                        alt26=1;
                    }
                    else if ( (LA26_0==GETRADIO) ) {
                        alt26=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;

                    }
                    switch (alt26) {
                        case 1 :
                            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:174:17: b= GETSPEED
                            {
                            b=(Token)match(input,GETSPEED,FOLLOW_GETSPEED_in_atom1588);  
                            stream_GETSPEED.add(b);


                            }
                            break;
                        case 2 :
                            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:174:28: b= GETRADIO
                            {
                            b=(Token)match(input,GETRADIO,FOLLOW_GETRADIO_in_atom1592);  
                            stream_GETRADIO.add(b);


                            }
                            break;

                    }


                    char_literal113=(Token)match(input,68,FOLLOW_68_in_atom1594);  
                    stream_68.add(char_literal113);


                    char_literal114=(Token)match(input,69,FOLLOW_69_in_atom1595);  
                    stream_69.add(char_literal114);


                    // AST REWRITE
                    // elements: ID, b
                    // token labels: b
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_b=new RewriteRuleTokenStream(adaptor,"token b",b);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 174:46: -> ^( GMOTOR $b ID )
                    {
                        // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:174:49: ^( GMOTOR $b ID )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(GMOTOR, "GMOTOR")
                        , root_1);

                        adaptor.addChild(root_1, stream_b.nextNode());

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"


    public static class funcall_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcall"
    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:178:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final AslParser.funcall_return funcall() throws RecognitionException {
        AslParser.funcall_return retval = new AslParser.funcall_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID115=null;
        Token char_literal116=null;
        Token char_literal118=null;
        AslParser.expr_list_return expr_list117 =null;


        AslTree ID115_tree=null;
        AslTree char_literal116_tree=null;
        AslTree char_literal118_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:178:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:178:11: ID '(' ( expr_list )? ')'
            {
            ID115=(Token)match(input,ID,FOLLOW_ID_in_funcall1619);  
            stream_ID.add(ID115);


            char_literal116=(Token)match(input,68,FOLLOW_68_in_funcall1621);  
            stream_68.add(char_literal116);


            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:178:18: ( expr_list )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0 >= FALSE && LA28_0 <= FLOAT)||LA28_0==GETCOLOR||(LA28_0 >= GETTOUCH && LA28_0 <= GETULTRA)||LA28_0==ID||LA28_0==INT||LA28_0==MINUS||LA28_0==MOTOR||LA28_0==NOT||LA28_0==PLUS||LA28_0==TRUE||LA28_0==68) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:178:18: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall1623);
                    expr_list117=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list117.getTree());

                    }
                    break;

            }


            char_literal118=(Token)match(input,69,FOLLOW_69_in_funcall1626);  
            stream_69.add(char_literal118);


            // AST REWRITE
            // elements: ID, expr_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 178:33: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:178:36: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:178:49: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:178:59: ( expr_list )?
                if ( stream_expr_list.hasNext() ) {
                    adaptor.addChild(root_2, stream_expr_list.nextTree());

                }
                stream_expr_list.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "funcall"


    public static class expr_list_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_list"
    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:182:1: expr_list : expr ( ',' ! expr )* ;
    public final AslParser.expr_list_return expr_list() throws RecognitionException {
        AslParser.expr_list_return retval = new AslParser.expr_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal120=null;
        AslParser.expr_return expr119 =null;

        AslParser.expr_return expr121 =null;


        AslTree char_literal120_tree=null;

        try {
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:182:10: ( expr ( ',' ! expr )* )
            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:182:12: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list1658);
            expr119=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr119.getTree());

            // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:182:17: ( ',' ! expr )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==70) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // /home2/users/alumnes/1142214/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:182:18: ',' ! expr
            	    {
            	    char_literal120=(Token)match(input,70,FOLLOW_70_in_expr_list1661); 

            	    pushFollow(FOLLOW_expr_in_expr_list1664);
            	    expr121=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr121.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_list"

    // Delegated rules


 

    public static final BitSet FOLLOW_func_in_prog265 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_EOF_in_prog268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_func310 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_func313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_params_in_func315 = new BitSet(new long[]{0x0260000C00000000L,0x0000000000000103L});
    public static final BitSet FOLLOW_block_instructions_in_func317 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_params339 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_paramlist_in_params341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_params344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist379 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_paramlist382 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_param_in_paramlist385 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_TIPO_in_param408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_param410 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_param414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIPO_in_param436 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_param440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions476 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_block_instructions479 = new BitSet(new long[]{0x0260000C00000000L,0x0000000000000103L});
    public static final BitSet FOLLOW_instruction_in_block_instructions481 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_assign_in_instruction518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_instruction628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_motor_in_instruction674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sleep_in_instruction695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_motor724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_motor726 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_AVANZAR_in_motor730 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_motor731 = new BitSet(new long[]{0x0000001000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_motor732 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_motor734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_motor759 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_motor761 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ACELERAR_in_motor765 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_motor766 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_INT_in_motor767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_motor768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_motor792 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_motor794 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_PARAR_in_motor798 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_motor799 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_motor800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_motor822 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_motor824 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_SETRADIO_in_motor829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SETSPEED_in_motor833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_motor835 = new BitSet(new long[]{0x0000001000200000L});
    public static final BitSet FOLLOW_INT_in_motor839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_FLOAT_in_motor843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_motor845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLEEP_in_sleep886 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_sleep888 = new BitSet(new long[]{0x0000001000200000L});
    public static final BitSet FOLLOW_INT_in_sleep893 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_FLOAT_in_sleep899 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_sleep902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_esq_in_assign930 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUAL_in_assign934 = new BitSet(new long[]{0x80042A1432300000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expr_in_assign936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_esq976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt993 = new BitSet(new long[]{0x80042A1432300000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expr_in_ite_stmt996 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_THEN_in_ite_stmt998 = new BitSet(new long[]{0x0260000C00000000L,0x0000000000000103L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt1001 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt1004 = new BitSet(new long[]{0x0260000C00000000L,0x0000000000000103L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt1007 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ENDIF_in_ite_stmt1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt1038 = new BitSet(new long[]{0x80042A1432300000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expr_in_while_stmt1041 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_DO_in_while_stmt1043 = new BitSet(new long[]{0x0260000C00000000L,0x0000000000000103L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt1046 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ENDWHILE_in_while_stmt1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt1075 = new BitSet(new long[]{0x80042A1432300002L,0x0000000000000010L});
    public static final BitSet FOLLOW_expr_in_return_stmt1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read1100 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_esq_in_read1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write1123 = new BitSet(new long[]{0x90042A1432300000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expr_in_write1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_write1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr1154 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_OR_in_expr1157 = new BitSet(new long[]{0x80042A1432300000L,0x0000000000000010L});
    public static final BitSet FOLLOW_boolterm_in_expr1160 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1178 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_boolterm1181 = new BitSet(new long[]{0x80042A1432300000L,0x0000000000000010L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1184 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1202 = new BitSet(new long[]{0x0000412201040002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact1206 = new BitSet(new long[]{0x80042A1432300000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact1211 = new BitSet(new long[]{0x80042A1432300000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LT_in_boolfact1216 = new BitSet(new long[]{0x80042A1432300000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LE_in_boolfact1221 = new BitSet(new long[]{0x80042A1432300000L,0x0000000000000010L});
    public static final BitSet FOLLOW_GT_in_boolfact1226 = new BitSet(new long[]{0x80042A1432300000L,0x0000000000000010L});
    public static final BitSet FOLLOW_GE_in_boolfact1231 = new BitSet(new long[]{0x80042A1432300000L,0x0000000000000010L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr1253 = new BitSet(new long[]{0x0004020000000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr1258 = new BitSet(new long[]{0x80042A1432300000L,0x0000000000000010L});
    public static final BitSet FOLLOW_MINUS_in_num_expr1263 = new BitSet(new long[]{0x80042A1432300000L,0x0000000000000010L});
    public static final BitSet FOLLOW_term_in_num_expr1267 = new BitSet(new long[]{0x0004020000000002L});
    public static final BitSet FOLLOW_factor_in_term1289 = new BitSet(new long[]{0x0000140000000802L});
    public static final BitSet FOLLOW_MUL_in_term1294 = new BitSet(new long[]{0x80042A1432300000L,0x0000000000000010L});
    public static final BitSet FOLLOW_DIV_in_term1299 = new BitSet(new long[]{0x80042A1432300000L,0x0000000000000010L});
    public static final BitSet FOLLOW_MOD_in_term1304 = new BitSet(new long[]{0x80042A1432300000L,0x0000000000000010L});
    public static final BitSet FOLLOW_factor_in_term1308 = new BitSet(new long[]{0x0000140000000802L});
    public static final BitSet FOLLOW_NOT_in_factor1329 = new BitSet(new long[]{0x8000081432300000L,0x0000000000000010L});
    public static final BitSet FOLLOW_PLUS_in_factor1334 = new BitSet(new long[]{0x8000081432300000L,0x0000000000000010L});
    public static final BitSet FOLLOW_MINUS_in_factor1339 = new BitSet(new long[]{0x8000081432300000L,0x0000000000000010L});
    public static final BitSet FOLLOW_atom_in_factor1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_atom1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOTOR_in_atom1400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_atom1402 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_INT_in_atom1406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_atom1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_atom1468 = new BitSet(new long[]{0x80042A1432300000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expr_in_atom1471 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_atom1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GETCOLOR_in_atom1489 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_GETULTRA_in_atom1495 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_GETTOUCH_in_atom1501 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_atom1504 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_INT_in_atom1506 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_atom1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1583 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_atom1584 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_GETSPEED_in_atom1588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_GETRADIO_in_atom1592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_atom1594 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_atom1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall1619 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_funcall1621 = new BitSet(new long[]{0x80042A1432300000L,0x0000000000000030L});
    public static final BitSet FOLLOW_expr_list_in_funcall1623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_funcall1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list1658 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_expr_list1661 = new BitSet(new long[]{0x80042A1432300000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expr_in_expr_list1664 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});

}
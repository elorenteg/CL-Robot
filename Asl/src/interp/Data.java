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

/**
 * Class to represent data in the interpreter.
 * Each data item has a type and a value. The type can be integer
 * or Boolean. Each operation asserts that the operands have the
 * appropriate types.
 * All the arithmetic and Boolean operations are calculated in-place,
 * i.e., the result is stored in the same data.
 * The type VOID is used to represent void values on function returns.
 */

import parser.*;

public class Data {
    /** Types of data */
    public enum Type {VOID, BOOLEAN, INTEGER, MOTOR, ULTRA, TOUCH, COLOR;}

    /** Type of data*/
    private Type type;

    /** Constructor by Type */
    Data(Type t){ type = t; }

    /** Constructor for void data */
    Data() { type = Type.VOID; }

    /** Copy constructor */
    Data(Data d) { type = d.type; }
    
    /** Constructor by string with the type */
    Data(String tipo) {
        if (tipo.equals("bool")) type = Type.BOOLEAN;
        else if (tipo.equals("int")) type = Type.INTEGER;
        else if (tipo.equals("motor")) type = Type.MOTOR;
        else if (tipo.equals("void")) type = Type.VOID;
        else if (tipo.equals("ultra")) type = Type.ULTRA;
        else if (tipo.equals("touch")) type = Type.TOUCH;
        else if (tipo.equals("color")) type = Type.COLOR;
    }

    /** Returns the type of data */
    public Type getType() { return type; }

    /** Indicates whether the data is Boolean */
    public boolean isBoolean() { return type == Type.BOOLEAN; }

    /** Indicates whether the data is integer */
    public boolean isInteger() { return type == Type.INTEGER; }

    /** Indicates whether the data is void */
    public boolean isVoid() { return type == Type.VOID; }

    /** Indicates whether the data is a motor */
    public boolean isMotor() { return type == Type.MOTOR; }
    
    /** Indicates whether the data is an ultrasonic sensor */
    public boolean isUltra() { return type == Type.ULTRA; }
    
    /** Indicates whether the data is a touch sensor */
    public boolean isTouch() { return type == Type.TOUCH; }
    
    /** Indicates whether the data is color sensor */
    public boolean isColor() { return type == Type.COLOR; }
    
    /** Copies the value from another data */
    public void setData(Data d) { type = d.type; }
}

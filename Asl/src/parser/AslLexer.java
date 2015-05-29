// $ANTLR 3.4 /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g 2015-05-29 13:38:40

    package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AslLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int AND=4;
    public static final int ARGLIST=5;
    public static final int ASSIGN=6;
    public static final int AVANZAR=7;
    public static final int BOOLEAN=8;
    public static final int COMMENT=9;
    public static final int DIV=10;
    public static final int DMOTOR=11;
    public static final int DO=12;
    public static final int DSENSOR=13;
    public static final int ELSE=14;
    public static final int ENDFUNC=15;
    public static final int ENDIF=16;
    public static final int ENDWHILE=17;
    public static final int EQUAL=18;
    public static final int ESC_SEQ=19;
    public static final int FALSE=20;
    public static final int FUNC=21;
    public static final int FUNCALL=22;
    public static final int GE=23;
    public static final int GETCOLOR=24;
    public static final int GETTOUCH=25;
    public static final int GETULTRA=26;
    public static final int GLOB=27;
    public static final int GMOTOR=28;
    public static final int GSENSOR=29;
    public static final int GT=30;
    public static final int ID=31;
    public static final int IF=32;
    public static final int INCL=33;
    public static final int INCLUDE=34;
    public static final int INT=35;
    public static final int LE=36;
    public static final int LIST_FUNCTIONS=37;
    public static final int LIST_GLOBALS=38;
    public static final int LIST_INCLUDES=39;
    public static final int LIST_INSTR=40;
    public static final int LT=41;
    public static final int MGETTER=42;
    public static final int MINUS=43;
    public static final int MOD=44;
    public static final int MOTOR=45;
    public static final int MSETTER=46;
    public static final int MUL=47;
    public static final int NOT=48;
    public static final int NOT_EQUAL=49;
    public static final int OBJECT=50;
    public static final int OBJ_FUNC=51;
    public static final int OR=52;
    public static final int PARAMS=53;
    public static final int PARAR=54;
    public static final int PLUS=55;
    public static final int PREF=56;
    public static final int PROG=57;
    public static final int PVALUE=58;
    public static final int READ=59;
    public static final int RETURN=60;
    public static final int SENSOR=61;
    public static final int SLEEP=62;
    public static final int SMOTOR=63;
    public static final int SSLEEP=64;
    public static final int STRING=65;
    public static final int THEN=66;
    public static final int TIPO=67;
    public static final int TRUE=68;
    public static final int VOID=69;
    public static final int WHILE=70;
    public static final int WRITE=71;
    public static final int WS=72;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public AslLexer() {} 
    public AslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public AslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g"; }

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:6:7: ( '(' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:6:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:7:7: ( ')' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:7:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:8:7: ( ',' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:8:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:9:7: ( '.' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:9:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:10:7: ( ';' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:10:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:218:17: ( '=' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:218:19: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "NOT_EQUAL"
    public final void mNOT_EQUAL() throws RecognitionException {
        try {
            int _type = NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:219:17: ( '!=' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:219:19: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT_EQUAL"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:220:17: ( '<' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:220:19: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "LE"
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:221:17: ( '<=' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:221:19: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LE"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:222:17: ( '>' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:222:19: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "GE"
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:223:17: ( '>=' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:223:19: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GE"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:224:17: ( '+' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:224:19: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:225:17: ( '-' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:225:19: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MUL"
    public final void mMUL() throws RecognitionException {
        try {
            int _type = MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:226:17: ( '*' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:226:19: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MUL"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:227:17: ( '/' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:227:19: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:228:17: ( '%' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:228:19: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "INCLUDE"
    public final void mINCLUDE() throws RecognitionException {
        try {
            int _type = INCLUDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:229:17: ( 'include' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:229:19: 'include'
            {
            match("include"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INCLUDE"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:230:17: ( 'not' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:230:19: 'not'
            {
            match("not"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:231:17: ( 'and' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:231:19: 'and'
            {
            match("and"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:232:17: ( 'or' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:232:19: 'or'
            {
            match("or"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:233:17: ( 'if' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:233:19: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:234:17: ( 'then' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:234:19: 'then'
            {
            match("then"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:235:17: ( 'else' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:235:19: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "ENDIF"
    public final void mENDIF() throws RecognitionException {
        try {
            int _type = ENDIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:236:17: ( 'endif' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:236:19: 'endif'
            {
            match("endif"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDIF"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:237:17: ( 'while' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:237:19: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:238:17: ( 'do' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:238:19: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "ENDWHILE"
    public final void mENDWHILE() throws RecognitionException {
        try {
            int _type = ENDWHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:239:17: ( 'endwhile' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:239:19: 'endwhile'
            {
            match("endwhile"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDWHILE"

    // $ANTLR start "FUNC"
    public final void mFUNC() throws RecognitionException {
        try {
            int _type = FUNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:240:17: ( 'func' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:240:19: 'func'
            {
            match("func"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FUNC"

    // $ANTLR start "ENDFUNC"
    public final void mENDFUNC() throws RecognitionException {
        try {
            int _type = ENDFUNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:241:17: ( 'endfunc' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:241:19: 'endfunc'
            {
            match("endfunc"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDFUNC"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:242:17: ( 'return' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:242:19: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "READ"
    public final void mREAD() throws RecognitionException {
        try {
            int _type = READ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:243:17: ( 'read' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:243:19: 'read'
            {
            match("read"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "READ"

    // $ANTLR start "WRITE"
    public final void mWRITE() throws RecognitionException {
        try {
            int _type = WRITE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:244:17: ( 'write' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:244:19: 'write'
            {
            match("write"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WRITE"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:245:17: ( 'true' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:245:19: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:246:17: ( 'false' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:246:19: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "VOID"
    public final void mVOID() throws RecognitionException {
        try {
            int _type = VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:247:17: ( 'void' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:247:19: 'void'
            {
            match("void"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VOID"

    // $ANTLR start "TIPO"
    public final void mTIPO() throws RecognitionException {
        try {
            int _type = TIPO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:248:17: ( ( 'int' | 'bool' | 'motor' | 'touch' | 'ultra' | 'color' ) )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:248:19: ( 'int' | 'bool' | 'motor' | 'touch' | 'ultra' | 'color' )
            {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:248:19: ( 'int' | 'bool' | 'motor' | 'touch' | 'ultra' | 'color' )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 'i':
                {
                alt1=1;
                }
                break;
            case 'b':
                {
                alt1=2;
                }
                break;
            case 'm':
                {
                alt1=3;
                }
                break;
            case 't':
                {
                alt1=4;
                }
                break;
            case 'u':
                {
                alt1=5;
                }
                break;
            case 'c':
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:248:20: 'int'
                    {
                    match("int"); 



                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:248:26: 'bool'
                    {
                    match("bool"); 



                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:248:33: 'motor'
                    {
                    match("motor"); 



                    }
                    break;
                case 4 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:248:41: 'touch'
                    {
                    match("touch"); 



                    }
                    break;
                case 5 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:248:49: 'ultra'
                    {
                    match("ultra"); 



                    }
                    break;
                case 6 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:248:57: 'color'
                    {
                    match("color"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TIPO"

    // $ANTLR start "AVANZAR"
    public final void mAVANZAR() throws RecognitionException {
        try {
            int _type = AVANZAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:249:17: ( 'avanzar' | 'retroceder' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='a') ) {
                alt2=1;
            }
            else if ( (LA2_0=='r') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:249:19: 'avanzar'
                    {
                    match("avanzar"); 



                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:249:31: 'retroceder'
                    {
                    match("retroceder"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AVANZAR"

    // $ANTLR start "PARAR"
    public final void mPARAR() throws RecognitionException {
        try {
            int _type = PARAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:250:17: ( 'parar' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:250:19: 'parar'
            {
            match("parar"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PARAR"

    // $ANTLR start "MSETTER"
    public final void mMSETTER() throws RecognitionException {
        try {
            int _type = MSETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:251:17: ( ( 'setSpeed' | 'setPower' ) )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:251:19: ( 'setSpeed' | 'setPower' )
            {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:251:19: ( 'setSpeed' | 'setPower' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='s') ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='e') ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2=='t') ) {
                        int LA3_3 = input.LA(4);

                        if ( (LA3_3=='S') ) {
                            alt3=1;
                        }
                        else if ( (LA3_3=='P') ) {
                            alt3=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:251:20: 'setSpeed'
                    {
                    match("setSpeed"); 



                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:251:33: 'setPower'
                    {
                    match("setPower"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MSETTER"

    // $ANTLR start "MGETTER"
    public final void mMGETTER() throws RecognitionException {
        try {
            int _type = MGETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:252:17: ( ( 'getSpeed' | 'getPower' | 'isMoving' ) )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:252:19: ( 'getSpeed' | 'getPower' | 'isMoving' )
            {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:252:19: ( 'getSpeed' | 'getPower' | 'isMoving' )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='g') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='e') ) {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3=='t') ) {
                        int LA4_4 = input.LA(4);

                        if ( (LA4_4=='S') ) {
                            alt4=1;
                        }
                        else if ( (LA4_4=='P') ) {
                            alt4=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 4, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA4_0=='i') ) {
                alt4=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:252:20: 'getSpeed'
                    {
                    match("getSpeed"); 



                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:252:33: 'getPower'
                    {
                    match("getPower"); 



                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:252:46: 'isMoving'
                    {
                    match("isMoving"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MGETTER"

    // $ANTLR start "GETCOLOR"
    public final void mGETCOLOR() throws RecognitionException {
        try {
            int _type = GETCOLOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:253:17: ( 'getColor' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:253:19: 'getColor'
            {
            match("getColor"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GETCOLOR"

    // $ANTLR start "GETULTRA"
    public final void mGETULTRA() throws RecognitionException {
        try {
            int _type = GETULTRA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:254:17: ( 'getUltrasonic' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:254:19: 'getUltrasonic'
            {
            match("getUltrasonic"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GETULTRA"

    // $ANTLR start "GETTOUCH"
    public final void mGETTOUCH() throws RecognitionException {
        try {
            int _type = GETTOUCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:255:17: ( 'getTouch' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:255:19: 'getTouch'
            {
            match("getTouch"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GETTOUCH"

    // $ANTLR start "MOTOR"
    public final void mMOTOR() throws RecognitionException {
        try {
            int _type = MOTOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:256:17: ( 'MOTOR' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:256:19: 'MOTOR'
            {
            match("MOTOR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOTOR"

    // $ANTLR start "SENSOR"
    public final void mSENSOR() throws RecognitionException {
        try {
            int _type = SENSOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:257:17: ( ( 'ULTRA' | 'TOUCH' | 'COLOR' ) )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:257:19: ( 'ULTRA' | 'TOUCH' | 'COLOR' )
            {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:257:19: ( 'ULTRA' | 'TOUCH' | 'COLOR' )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 'U':
                {
                alt5=1;
                }
                break;
            case 'T':
                {
                alt5=2;
                }
                break;
            case 'C':
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:257:20: 'ULTRA'
                    {
                    match("ULTRA"); 



                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:257:28: 'TOUCH'
                    {
                    match("TOUCH"); 



                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:257:36: 'COLOR'
                    {
                    match("COLOR"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SENSOR"

    // $ANTLR start "OBJECT"
    public final void mOBJECT() throws RecognitionException {
        try {
            int _type = OBJECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:258:17: ( 'OBJECT' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:258:19: 'OBJECT'
            {
            match("OBJECT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OBJECT"

    // $ANTLR start "SLEEP"
    public final void mSLEEP() throws RecognitionException {
        try {
            int _type = SLEEP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:259:17: ( 'sleep' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:259:19: 'sleep'
            {
            match("sleep"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SLEEP"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:265:17: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:265:19: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:265:43: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='_'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:266:17: ( ( '-' )? ( '0' .. '9' )+ )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:266:19: ( '-' )? ( '0' .. '9' )+
            {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:266:19: ( '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='-') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:266:19: '-'
                    {
                    match('-'); 

                    }
                    break;

            }


            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:266:24: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:269:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='/') ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1=='/') ) {
                    alt12=1;
                }
                else if ( (LA12_1=='*') ) {
                    alt12=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:269:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:269:16: (~ ( '\\n' | '\\r' ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0 >= '\u0000' && LA9_0 <= '\t')||(LA9_0 >= '\u000B' && LA9_0 <= '\f')||(LA9_0 >= '\u000E' && LA9_0 <= '\uFFFF')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:269:30: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:269:30: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:270:11: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:270:16: ( options {greedy=false; } : . )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='*') ) {
                            int LA11_1 = input.LA(2);

                            if ( (LA11_1=='/') ) {
                                alt11=2;
                            }
                            else if ( ((LA11_1 >= '\u0000' && LA11_1 <= '.')||(LA11_1 >= '0' && LA11_1 <= '\uFFFF')) ) {
                                alt11=1;
                            }


                        }
                        else if ( ((LA11_0 >= '\u0000' && LA11_0 <= ')')||(LA11_0 >= '+' && LA11_0 <= '\uFFFF')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:270:44: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    match("*/"); 



                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:274:9: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:274:11: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:274:15: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='\\') ) {
                    alt13=1;
                }
                else if ( ((LA13_0 >= '\u0000' && LA13_0 <= '!')||(LA13_0 >= '#' && LA13_0 <= '[')||(LA13_0 >= ']' && LA13_0 <= '\uFFFF')) ) {
                    alt13=2;
                }


                switch (alt13) {
            	case 1 :
            	    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:274:17: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:274:27: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:279:9: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:279:11: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
            {
            match('\\'); 

            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:282:9: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:282:11: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:8: ( T__73 | T__74 | T__75 | T__76 | T__77 | EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | INCLUDE | NOT | AND | OR | IF | THEN | ELSE | ENDIF | WHILE | DO | ENDWHILE | FUNC | ENDFUNC | RETURN | READ | WRITE | TRUE | FALSE | VOID | TIPO | AVANZAR | PARAR | MSETTER | MGETTER | GETCOLOR | GETULTRA | GETTOUCH | MOTOR | SENSOR | OBJECT | SLEEP | ID | INT | COMMENT | STRING | WS )
        int alt14=52;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:10: T__73
                {
                mT__73(); 


                }
                break;
            case 2 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:16: T__74
                {
                mT__74(); 


                }
                break;
            case 3 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:22: T__75
                {
                mT__75(); 


                }
                break;
            case 4 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:28: T__76
                {
                mT__76(); 


                }
                break;
            case 5 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:34: T__77
                {
                mT__77(); 


                }
                break;
            case 6 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:40: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 7 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:46: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 8 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:56: LT
                {
                mLT(); 


                }
                break;
            case 9 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:59: LE
                {
                mLE(); 


                }
                break;
            case 10 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:62: GT
                {
                mGT(); 


                }
                break;
            case 11 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:65: GE
                {
                mGE(); 


                }
                break;
            case 12 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:68: PLUS
                {
                mPLUS(); 


                }
                break;
            case 13 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:73: MINUS
                {
                mMINUS(); 


                }
                break;
            case 14 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:79: MUL
                {
                mMUL(); 


                }
                break;
            case 15 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:83: DIV
                {
                mDIV(); 


                }
                break;
            case 16 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:87: MOD
                {
                mMOD(); 


                }
                break;
            case 17 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:91: INCLUDE
                {
                mINCLUDE(); 


                }
                break;
            case 18 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:99: NOT
                {
                mNOT(); 


                }
                break;
            case 19 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:103: AND
                {
                mAND(); 


                }
                break;
            case 20 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:107: OR
                {
                mOR(); 


                }
                break;
            case 21 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:110: IF
                {
                mIF(); 


                }
                break;
            case 22 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:113: THEN
                {
                mTHEN(); 


                }
                break;
            case 23 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:118: ELSE
                {
                mELSE(); 


                }
                break;
            case 24 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:123: ENDIF
                {
                mENDIF(); 


                }
                break;
            case 25 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:129: WHILE
                {
                mWHILE(); 


                }
                break;
            case 26 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:135: DO
                {
                mDO(); 


                }
                break;
            case 27 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:138: ENDWHILE
                {
                mENDWHILE(); 


                }
                break;
            case 28 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:147: FUNC
                {
                mFUNC(); 


                }
                break;
            case 29 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:152: ENDFUNC
                {
                mENDFUNC(); 


                }
                break;
            case 30 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:160: RETURN
                {
                mRETURN(); 


                }
                break;
            case 31 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:167: READ
                {
                mREAD(); 


                }
                break;
            case 32 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:172: WRITE
                {
                mWRITE(); 


                }
                break;
            case 33 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:178: TRUE
                {
                mTRUE(); 


                }
                break;
            case 34 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:183: FALSE
                {
                mFALSE(); 


                }
                break;
            case 35 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:189: VOID
                {
                mVOID(); 


                }
                break;
            case 36 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:194: TIPO
                {
                mTIPO(); 


                }
                break;
            case 37 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:199: AVANZAR
                {
                mAVANZAR(); 


                }
                break;
            case 38 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:207: PARAR
                {
                mPARAR(); 


                }
                break;
            case 39 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:213: MSETTER
                {
                mMSETTER(); 


                }
                break;
            case 40 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:221: MGETTER
                {
                mMGETTER(); 


                }
                break;
            case 41 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:229: GETCOLOR
                {
                mGETCOLOR(); 


                }
                break;
            case 42 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:238: GETULTRA
                {
                mGETULTRA(); 


                }
                break;
            case 43 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:247: GETTOUCH
                {
                mGETTOUCH(); 


                }
                break;
            case 44 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:256: MOTOR
                {
                mMOTOR(); 


                }
                break;
            case 45 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:262: SENSOR
                {
                mSENSOR(); 


                }
                break;
            case 46 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:269: OBJECT
                {
                mOBJECT(); 


                }
                break;
            case 47 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:276: SLEEP
                {
                mSLEEP(); 


                }
                break;
            case 48 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:282: ID
                {
                mID(); 


                }
                break;
            case 49 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:285: INT
                {
                mINT(); 


                }
                break;
            case 50 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:289: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 51 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:297: STRING
                {
                mSTRING(); 


                }
                break;
            case 52 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:304: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\10\uffff\1\53\1\55\1\uffff\1\56\1\uffff\1\60\1\uffff\27\46\13\uffff"+
        "\1\46\1\123\4\46\1\130\7\46\1\140\22\46\1\164\1\uffff\1\46\1\166"+
        "\1\167\1\46\1\uffff\7\46\1\uffff\23\46\1\uffff\1\46\2\uffff\1\46"+
        "\1\u009d\1\u009e\1\46\1\u00a0\5\46\1\u00a6\3\46\1\u00aa\1\u00ab"+
        "\1\164\24\46\2\uffff\1\164\1\uffff\1\u00c0\2\46\1\u00c3\1\u00c4"+
        "\1\uffff\1\u00c5\2\46\2\uffff\3\164\1\u00c8\2\46\1\u00cb\5\46\1"+
        "\u00d1\3\u00d2\4\46\1\uffff\2\46\3\uffff\1\u00d9\1\46\1\uffff\2"+
        "\46\1\uffff\5\46\2\uffff\1\u00e2\1\u00e3\1\46\1\u00e5\1\46\1\u00e7"+
        "\1\uffff\10\46\2\uffff\1\u00f0\1\uffff\1\u00f1\1\uffff\1\46\2\u00f3"+
        "\2\u00f0\1\u00f4\1\46\1\u00f6\2\uffff\1\46\2\uffff\1\46\1\uffff"+
        "\1\u00e5\3\46\1\u00fc\1\uffff";
    static final String DFA14_eofS =
        "\u00fd\uffff";
    static final String DFA14_minS =
        "\1\11\7\uffff\2\75\1\uffff\1\60\1\uffff\1\52\1\uffff\1\146\1\157"+
        "\1\156\1\162\1\150\1\154\1\150\1\157\1\141\1\145\3\157\1\154\1\157"+
        "\1\141\2\145\1\117\1\114\2\117\1\102\13\uffff\1\143\1\60\1\115\1"+
        "\164\1\144\1\141\1\60\1\145\2\165\1\163\1\144\2\151\1\60\1\156\1"+
        "\154\1\141\1\151\1\157\2\164\1\154\1\162\1\164\1\145\1\164\2\124"+
        "\1\125\1\114\1\112\1\154\1\60\1\uffff\1\157\2\60\1\156\1\uffff\1"+
        "\156\1\145\1\143\1\145\1\146\1\154\1\164\1\uffff\1\143\1\163\1\162"+
        "\2\144\1\154\1\157\1\162\1\157\1\141\1\120\1\145\1\103\1\117\1\122"+
        "\1\103\1\117\1\105\1\165\1\uffff\1\166\2\uffff\1\172\2\60\1\150"+
        "\1\60\1\146\1\150\1\165\2\145\1\60\1\145\1\162\1\157\3\60\1\162"+
        "\1\141\2\162\1\160\1\157\2\160\2\157\1\154\1\157\1\122\1\101\1\110"+
        "\1\122\1\103\1\144\1\151\1\141\2\uffff\1\60\1\uffff\1\60\1\151\1"+
        "\156\2\60\1\uffff\1\60\1\156\1\143\2\uffff\4\60\1\145\1\167\1\60"+
        "\1\145\1\167\1\154\1\164\1\165\4\60\1\124\1\145\1\156\1\162\1\uffff"+
        "\1\154\1\143\3\uffff\1\60\1\145\1\uffff\2\145\1\uffff\2\145\1\157"+
        "\1\162\1\143\2\uffff\2\60\1\147\1\60\1\145\1\60\1\uffff\2\144\1"+
        "\162\1\144\2\162\1\141\1\150\2\uffff\1\60\1\uffff\1\60\1\uffff\1"+
        "\145\5\60\1\163\1\60\2\uffff\1\162\2\uffff\1\157\1\uffff\1\60\1"+
        "\156\1\151\1\143\1\60\1\uffff";
    static final String DFA14_maxS =
        "\1\172\7\uffff\2\75\1\uffff\1\71\1\uffff\1\57\1\uffff\1\163\1\157"+
        "\1\166\2\162\1\156\1\162\1\157\1\165\1\145\3\157\1\154\1\157\1\141"+
        "\1\154\1\145\1\117\1\114\2\117\1\102\13\uffff\1\164\1\172\1\115"+
        "\1\164\1\144\1\141\1\172\1\145\2\165\1\163\1\144\2\151\1\172\1\156"+
        "\1\154\1\164\1\151\1\157\2\164\1\154\1\162\1\164\1\145\1\164\2\124"+
        "\1\125\1\114\1\112\1\154\1\172\1\uffff\1\157\2\172\1\156\1\uffff"+
        "\1\156\1\145\1\143\1\145\1\167\1\154\1\164\1\uffff\1\143\1\163\1"+
        "\165\2\144\1\154\1\157\1\162\1\157\1\141\1\123\1\145\1\125\1\117"+
        "\1\122\1\103\1\117\1\105\1\165\1\uffff\1\166\2\uffff\3\172\1\150"+
        "\1\172\1\146\1\150\1\165\2\145\1\172\1\145\1\162\1\157\3\172\1\162"+
        "\1\141\2\162\1\160\1\157\2\160\2\157\1\154\1\157\1\122\1\101\1\110"+
        "\1\122\1\103\1\144\1\151\1\141\2\uffff\1\172\1\uffff\1\172\1\151"+
        "\1\156\2\172\1\uffff\1\172\1\156\1\143\2\uffff\4\172\1\145\1\167"+
        "\1\172\1\145\1\167\1\154\1\164\1\165\4\172\1\124\1\145\1\156\1\162"+
        "\1\uffff\1\154\1\143\3\uffff\1\172\1\145\1\uffff\2\145\1\uffff\2"+
        "\145\1\157\1\162\1\143\2\uffff\2\172\1\147\1\172\1\145\1\172\1\uffff"+
        "\2\144\1\162\1\144\2\162\1\141\1\150\2\uffff\1\172\1\uffff\1\172"+
        "\1\uffff\1\145\5\172\1\163\1\172\2\uffff\1\162\2\uffff\1\157\1\uffff"+
        "\1\172\1\156\1\151\1\143\1\172\1\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\2\uffff\1\14\1\uffff\1\16\1"+
        "\uffff\1\20\27\uffff\1\60\1\61\1\63\1\64\1\11\1\10\1\13\1\12\1\15"+
        "\1\62\1\17\42\uffff\1\25\4\uffff\1\24\7\uffff\1\32\23\uffff\1\44"+
        "\1\uffff\1\22\1\23\45\uffff\1\26\1\41\1\uffff\1\27\5\uffff\1\34"+
        "\3\uffff\1\37\1\43\24\uffff\1\30\2\uffff\1\31\1\40\1\42\2\uffff"+
        "\1\46\2\uffff\1\57\5\uffff\1\54\1\55\6\uffff\1\36\10\uffff\1\56"+
        "\1\21\1\uffff\1\45\1\uffff\1\35\10\uffff\1\50\1\33\1\uffff\1\47"+
        "\1\51\1\uffff\1\53\5\uffff\1\52";
    static final String DFA14_specialS =
        "\u00fd\uffff}>";
    static final String[] DFA14_transitionS = {
            "\2\51\2\uffff\1\51\22\uffff\1\51\1\7\1\50\2\uffff\1\16\2\uffff"+
            "\1\1\1\2\1\14\1\12\1\3\1\13\1\4\1\15\12\47\1\uffff\1\5\1\10"+
            "\1\6\1\11\2\uffff\2\46\1\44\11\46\1\41\1\46\1\45\4\46\1\43\1"+
            "\42\5\46\4\uffff\1\46\1\uffff\1\21\1\32\1\35\1\26\1\24\1\27"+
            "\1\40\1\46\1\17\3\46\1\33\1\20\1\22\1\36\1\46\1\30\1\37\1\23"+
            "\1\34\1\31\1\25\3\46",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\52",
            "\1\54",
            "",
            "\12\47",
            "",
            "\1\57\4\uffff\1\57",
            "",
            "\1\62\7\uffff\1\61\4\uffff\1\63",
            "\1\64",
            "\1\65\7\uffff\1\66",
            "\1\67",
            "\1\70\6\uffff\1\72\2\uffff\1\71",
            "\1\73\1\uffff\1\74",
            "\1\75\11\uffff\1\76",
            "\1\77",
            "\1\101\23\uffff\1\100",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111\6\uffff\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\121\20\uffff\1\122",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\141",
            "\1\142",
            "\1\144\22\uffff\1\143",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\165",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\170",
            "",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\177\2\uffff\1\175\15\uffff\1\176",
            "\1\u0080",
            "\1\u0081",
            "",
            "\1\u0082",
            "\1\u0083",
            "\1\u0085\2\uffff\1\u0084",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008e\2\uffff\1\u008d",
            "\1\u008f",
            "\1\u0092\14\uffff\1\u0091\2\uffff\1\u0090\1\u0094\1\u0093",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "",
            "\1\u009b",
            "",
            "",
            "\1\u009c",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u009f",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00c1",
            "\1\u00c2",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00c6",
            "\1\u00c7",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00c9",
            "\1\u00ca",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "",
            "\1\u00d7",
            "\1\u00d8",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00da",
            "",
            "\1\u00db",
            "\1\u00dc",
            "",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00e4",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00e6",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u00f2",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00f5",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\1\u00f7",
            "",
            "",
            "\1\u00f8",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__73 | T__74 | T__75 | T__76 | T__77 | EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | INCLUDE | NOT | AND | OR | IF | THEN | ELSE | ENDIF | WHILE | DO | ENDWHILE | FUNC | ENDFUNC | RETURN | READ | WRITE | TRUE | FALSE | VOID | TIPO | AVANZAR | PARAR | MSETTER | MGETTER | GETCOLOR | GETULTRA | GETTOUCH | MOTOR | SENSOR | OBJECT | SLEEP | ID | INT | COMMENT | STRING | WS );";
        }
    }
 

}
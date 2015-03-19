// $ANTLR 3.4 /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g 2015-03-19 13:19:57

    package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AslLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int ACELERAR=4;
    public static final int AND=5;
    public static final int ARGLIST=6;
    public static final int ARRAYACC=7;
    public static final int ASSIGN=8;
    public static final int AVANZAR=9;
    public static final int BOOLEAN=10;
    public static final int COMMENT=11;
    public static final int DIV=12;
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
    public static final int TRUE=62;
    public static final int WHILE=63;
    public static final int WRITE=64;
    public static final int WS=65;

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

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:6:7: ( '&' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:6:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:7:7: ( '(' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:7:9: '('
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
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:8:7: ( ')' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:8:9: ')'
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
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:9:7: ( ',' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:9:9: ','
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
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:10:7: ( '.' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:10:9: '.'
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
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:11:7: ( ';' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:11:9: ';'
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
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:12:7: ( '[' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:12:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:13:7: ( ']' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:13:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:187:17: ( '=' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:187:19: '='
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
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:188:17: ( '!=' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:188:19: '!='
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
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:189:17: ( '<' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:189:19: '<'
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
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:190:17: ( '<=' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:190:19: '<='
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
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:191:17: ( '>' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:191:19: '>'
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
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:192:17: ( '>=' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:192:19: '>='
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
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:193:17: ( '+' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:193:19: '+'
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
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:194:17: ( '-' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:194:19: '-'
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
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:195:17: ( '*' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:195:19: '*'
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
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:196:17: ( '/' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:196:19: '/'
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
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:197:17: ( '%' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:197:19: '%'
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

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:198:17: ( 'not' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:198:19: 'not'
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
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:199:17: ( 'and' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:199:19: 'and'
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
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:200:17: ( 'or' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:200:19: 'or'
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
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:201:17: ( 'if' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:201:19: 'if'
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
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:202:17: ( 'then' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:202:19: 'then'
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
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:203:17: ( 'else' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:203:19: 'else'
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
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:204:17: ( 'endif' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:204:19: 'endif'
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
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:205:17: ( 'while' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:205:19: 'while'
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
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:206:17: ( 'do' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:206:19: 'do'
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
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:207:17: ( 'endwhile' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:207:19: 'endwhile'
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
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:208:17: ( 'func' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:208:19: 'func'
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
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:209:17: ( 'endfunc' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:209:19: 'endfunc'
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
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:210:17: ( 'return' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:210:19: 'return'
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
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:211:17: ( 'read' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:211:19: 'read'
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
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:212:17: ( 'write' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:212:19: 'write'
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
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:213:17: ( 'true' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:213:19: 'true'
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
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:214:17: ( 'false' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:214:19: 'false'
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

    // $ANTLR start "GETCOLOR"
    public final void mGETCOLOR() throws RecognitionException {
        try {
            int _type = GETCOLOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:217:17: ( 'getColor' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:217:19: 'getColor'
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
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:218:17: ( 'getUltrasonic' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:218:19: 'getUltrasonic'
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
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:219:17: ( 'getTouch' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:219:19: 'getTouch'
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

    // $ANTLR start "AVANZAR"
    public final void mAVANZAR() throws RecognitionException {
        try {
            int _type = AVANZAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:220:17: ( 'avanzar' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:220:19: 'avanzar'
            {
            match("avanzar"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AVANZAR"

    // $ANTLR start "GIRAR"
    public final void mGIRAR() throws RecognitionException {
        try {
            int _type = GIRAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:221:17: ( 'girar' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:221:19: 'girar'
            {
            match("girar"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GIRAR"

    // $ANTLR start "PARAR"
    public final void mPARAR() throws RecognitionException {
        try {
            int _type = PARAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:222:17: ( 'parar' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:222:19: 'parar'
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

    // $ANTLR start "ACELERAR"
    public final void mACELERAR() throws RecognitionException {
        try {
            int _type = ACELERAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:223:17: ( 'acelerar' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:223:19: 'acelerar'
            {
            match("acelerar"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ACELERAR"

    // $ANTLR start "SETSPEED"
    public final void mSETSPEED() throws RecognitionException {
        try {
            int _type = SETSPEED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:224:17: ( 'setSpeed' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:224:19: 'setSpeed'
            {
            match("setSpeed"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SETSPEED"

    // $ANTLR start "SETRADIO"
    public final void mSETRADIO() throws RecognitionException {
        try {
            int _type = SETRADIO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:225:17: ( 'setRadio' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:225:19: 'setRadio'
            {
            match("setRadio"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SETRADIO"

    // $ANTLR start "GETRADIO"
    public final void mGETRADIO() throws RecognitionException {
        try {
            int _type = GETRADIO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:226:17: ( 'getRadio' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:226:19: 'getRadio'
            {
            match("getRadio"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GETRADIO"

    // $ANTLR start "GETSPEED"
    public final void mGETSPEED() throws RecognitionException {
        try {
            int _type = GETSPEED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:227:17: ( 'getSpeed' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:227:19: 'getSpeed'
            {
            match("getSpeed"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GETSPEED"

    // $ANTLR start "SLEEP"
    public final void mSLEEP() throws RecognitionException {
        try {
            int _type = SLEEP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:228:17: ( 'sleep' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:228:19: 'sleep'
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

    // $ANTLR start "MOTOR"
    public final void mMOTOR() throws RecognitionException {
        try {
            int _type = MOTOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:231:17: ( 'MOTOR' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:231:19: 'MOTOR'
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

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:232:17: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:232:19: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:232:43: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
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
            	    break loop1;
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

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:233:17: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:233:19: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
            {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:233:19: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            match('.'); 

            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:233:33: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
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
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:234:17: ( ( '0' .. '9' )+ )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:234:19: ( '0' .. '9' )+
            {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:234:19: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                    alt4=1;
                }


                switch (alt4) {
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:237:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='/') ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1=='/') ) {
                    alt8=1;
                }
                else if ( (LA8_1=='*') ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:237:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:237:16: (~ ( '\\n' | '\\r' ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
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
                    	    break loop5;
                        }
                    } while (true);


                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:237:30: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:237:30: '\\r'
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
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:238:11: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:238:16: ( options {greedy=false; } : . )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='*') ) {
                            int LA7_1 = input.LA(2);

                            if ( (LA7_1=='/') ) {
                                alt7=2;
                            }
                            else if ( ((LA7_1 >= '\u0000' && LA7_1 <= '.')||(LA7_1 >= '0' && LA7_1 <= '\uFFFF')) ) {
                                alt7=1;
                            }


                        }
                        else if ( ((LA7_0 >= '\u0000' && LA7_0 <= ')')||(LA7_0 >= '+' && LA7_0 <= '\uFFFF')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:238:44: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
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
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:242:9: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:242:11: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:242:15: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\\') ) {
                    alt9=1;
                }
                else if ( ((LA9_0 >= '\u0000' && LA9_0 <= '!')||(LA9_0 >= '#' && LA9_0 <= '[')||(LA9_0 >= ']' && LA9_0 <= '\uFFFF')) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:242:17: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:242:27: ~ ( '\\\\' | '\"' )
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
            	    break loop9;
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
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:247:9: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:247:11: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:250:9: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:250:11: ( ' ' | '\\t' | '\\r' | '\\n' )
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
        // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:8: ( T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | THEN | ELSE | ENDIF | WHILE | DO | ENDWHILE | FUNC | ENDFUNC | RETURN | READ | WRITE | TRUE | FALSE | GETCOLOR | GETULTRA | GETTOUCH | AVANZAR | GIRAR | PARAR | ACELERAR | SETSPEED | SETRADIO | GETRADIO | GETSPEED | SLEEP | MOTOR | ID | FLOAT | INT | COMMENT | STRING | WS )
        int alt10=55;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:10: T__66
                {
                mT__66(); 


                }
                break;
            case 2 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:16: T__67
                {
                mT__67(); 


                }
                break;
            case 3 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:22: T__68
                {
                mT__68(); 


                }
                break;
            case 4 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:28: T__69
                {
                mT__69(); 


                }
                break;
            case 5 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:34: T__70
                {
                mT__70(); 


                }
                break;
            case 6 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:40: T__71
                {
                mT__71(); 


                }
                break;
            case 7 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:46: T__72
                {
                mT__72(); 


                }
                break;
            case 8 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:52: T__73
                {
                mT__73(); 


                }
                break;
            case 9 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:58: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 10 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:64: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 11 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:74: LT
                {
                mLT(); 


                }
                break;
            case 12 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:77: LE
                {
                mLE(); 


                }
                break;
            case 13 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:80: GT
                {
                mGT(); 


                }
                break;
            case 14 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:83: GE
                {
                mGE(); 


                }
                break;
            case 15 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:86: PLUS
                {
                mPLUS(); 


                }
                break;
            case 16 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:91: MINUS
                {
                mMINUS(); 


                }
                break;
            case 17 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:97: MUL
                {
                mMUL(); 


                }
                break;
            case 18 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:101: DIV
                {
                mDIV(); 


                }
                break;
            case 19 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:105: MOD
                {
                mMOD(); 


                }
                break;
            case 20 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:109: NOT
                {
                mNOT(); 


                }
                break;
            case 21 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:113: AND
                {
                mAND(); 


                }
                break;
            case 22 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:117: OR
                {
                mOR(); 


                }
                break;
            case 23 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:120: IF
                {
                mIF(); 


                }
                break;
            case 24 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:123: THEN
                {
                mTHEN(); 


                }
                break;
            case 25 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:128: ELSE
                {
                mELSE(); 


                }
                break;
            case 26 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:133: ENDIF
                {
                mENDIF(); 


                }
                break;
            case 27 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:139: WHILE
                {
                mWHILE(); 


                }
                break;
            case 28 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:145: DO
                {
                mDO(); 


                }
                break;
            case 29 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:148: ENDWHILE
                {
                mENDWHILE(); 


                }
                break;
            case 30 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:157: FUNC
                {
                mFUNC(); 


                }
                break;
            case 31 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:162: ENDFUNC
                {
                mENDFUNC(); 


                }
                break;
            case 32 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:170: RETURN
                {
                mRETURN(); 


                }
                break;
            case 33 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:177: READ
                {
                mREAD(); 


                }
                break;
            case 34 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:182: WRITE
                {
                mWRITE(); 


                }
                break;
            case 35 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:188: TRUE
                {
                mTRUE(); 


                }
                break;
            case 36 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:193: FALSE
                {
                mFALSE(); 


                }
                break;
            case 37 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:199: GETCOLOR
                {
                mGETCOLOR(); 


                }
                break;
            case 38 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:208: GETULTRA
                {
                mGETULTRA(); 


                }
                break;
            case 39 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:217: GETTOUCH
                {
                mGETTOUCH(); 


                }
                break;
            case 40 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:226: AVANZAR
                {
                mAVANZAR(); 


                }
                break;
            case 41 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:234: GIRAR
                {
                mGIRAR(); 


                }
                break;
            case 42 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:240: PARAR
                {
                mPARAR(); 


                }
                break;
            case 43 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:246: ACELERAR
                {
                mACELERAR(); 


                }
                break;
            case 44 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:255: SETSPEED
                {
                mSETSPEED(); 


                }
                break;
            case 45 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:264: SETRADIO
                {
                mSETRADIO(); 


                }
                break;
            case 46 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:273: GETRADIO
                {
                mGETRADIO(); 


                }
                break;
            case 47 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:282: GETSPEED
                {
                mGETSPEED(); 


                }
                break;
            case 48 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:291: SLEEP
                {
                mSLEEP(); 


                }
                break;
            case 49 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:297: MOTOR
                {
                mMOTOR(); 


                }
                break;
            case 50 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:303: ID
                {
                mID(); 


                }
                break;
            case 51 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:306: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 52 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:312: INT
                {
                mINT(); 


                }
                break;
            case 53 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:316: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 54 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:324: STRING
                {
                mSTRING(); 


                }
                break;
            case 55 :
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:1:331: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\13\uffff\1\45\1\47\3\uffff\1\51\1\uffff\16\40\1\uffff\1\101\10"+
        "\uffff\4\40\1\106\1\107\6\40\1\116\11\40\2\uffff\1\131\1\132\2\40"+
        "\2\uffff\6\40\1\uffff\12\40\2\uffff\2\40\1\166\1\167\1\170\5\40"+
        "\1\176\2\40\1\u0081\15\40\3\uffff\1\u008f\2\40\1\u0092\1\u0093\1"+
        "\uffff\1\u0094\1\40\1\uffff\5\40\1\u009b\1\u009c\2\40\1\u009f\1"+
        "\u00a0\2\40\1\uffff\2\40\3\uffff\1\u00a5\5\40\2\uffff\2\40\2\uffff"+
        "\1\u00ad\2\40\1\u00b0\1\uffff\7\40\1\uffff\1\u00b8\1\u00b9\1\uffff"+
        "\1\u00ba\1\40\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\u00c0\3\uffff\1"+
        "\40\5\uffff\3\40\1\u00c5\1\uffff";
    static final String DFA10_eofS =
        "\u00c6\uffff";
    static final String DFA10_minS =
        "\1\11\12\uffff\2\75\3\uffff\1\52\1\uffff\1\157\1\143\1\162\1\146"+
        "\1\150\1\154\1\150\1\157\1\141\2\145\1\141\1\145\1\117\1\uffff\1"+
        "\56\10\uffff\1\164\1\144\1\141\1\145\2\60\1\145\1\165\1\163\1\144"+
        "\2\151\1\60\1\156\1\154\1\141\1\164\2\162\1\164\1\145\1\124\2\uffff"+
        "\2\60\1\156\1\154\2\uffff\1\156\2\145\1\146\1\154\1\164\1\uffff"+
        "\1\143\1\163\1\165\1\144\1\103\2\141\1\122\1\145\1\117\2\uffff\1"+
        "\172\1\145\3\60\1\146\1\150\1\165\2\145\1\60\1\145\1\162\1\60\1"+
        "\157\1\154\1\157\1\141\1\160\2\162\1\160\1\141\1\160\1\122\1\141"+
        "\1\162\3\uffff\1\60\1\151\1\156\2\60\1\uffff\1\60\1\156\1\uffff"+
        "\1\154\1\164\1\165\1\144\1\145\2\60\1\145\1\144\2\60\1\162\1\141"+
        "\1\uffff\1\154\1\143\3\uffff\1\60\1\157\1\162\1\143\1\151\1\145"+
        "\2\uffff\1\145\1\151\2\uffff\1\60\1\162\1\145\1\60\1\uffff\1\162"+
        "\1\141\1\150\1\157\2\144\1\157\1\uffff\2\60\1\uffff\1\60\1\163\5"+
        "\60\3\uffff\1\157\5\uffff\1\156\1\151\1\143\1\60\1\uffff";
    static final String DFA10_maxS =
        "\1\172\12\uffff\2\75\3\uffff\1\57\1\uffff\1\157\1\166\1\162\1\146"+
        "\1\162\1\156\1\162\1\157\1\165\1\145\1\151\1\141\1\154\1\117\1\uffff"+
        "\1\71\10\uffff\1\164\1\144\1\141\1\145\2\172\1\145\1\165\1\163\1"+
        "\144\2\151\1\172\1\156\1\154\2\164\2\162\1\164\1\145\1\124\2\uffff"+
        "\2\172\1\156\1\154\2\uffff\1\156\2\145\1\167\1\154\1\164\1\uffff"+
        "\1\143\1\163\1\165\1\144\1\125\2\141\1\123\1\145\1\117\2\uffff\1"+
        "\172\1\145\3\172\1\146\1\150\1\165\2\145\1\172\1\145\1\162\1\172"+
        "\1\157\1\154\1\157\1\141\1\160\2\162\1\160\1\141\1\160\1\122\1\141"+
        "\1\162\3\uffff\1\172\1\151\1\156\2\172\1\uffff\1\172\1\156\1\uffff"+
        "\1\154\1\164\1\165\1\144\1\145\2\172\1\145\1\144\2\172\1\162\1\141"+
        "\1\uffff\1\154\1\143\3\uffff\1\172\1\157\1\162\1\143\1\151\1\145"+
        "\2\uffff\1\145\1\151\2\uffff\1\172\1\162\1\145\1\172\1\uffff\1\162"+
        "\1\141\1\150\1\157\2\144\1\157\1\uffff\2\172\1\uffff\1\172\1\163"+
        "\5\172\3\uffff\1\157\5\uffff\1\156\1\151\1\143\1\172\1\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff\1\17"+
        "\1\20\1\21\1\uffff\1\23\16\uffff\1\62\1\uffff\1\66\1\67\1\14\1\13"+
        "\1\16\1\15\1\65\1\22\26\uffff\1\63\1\64\4\uffff\1\26\1\27\6\uffff"+
        "\1\34\12\uffff\1\24\1\25\33\uffff\1\30\1\43\1\31\5\uffff\1\36\2"+
        "\uffff\1\41\15\uffff\1\32\2\uffff\1\33\1\42\1\44\6\uffff\1\51\1"+
        "\52\2\uffff\1\60\1\61\4\uffff\1\40\7\uffff\1\50\2\uffff\1\37\7\uffff"+
        "\1\53\1\35\1\45\1\uffff\1\47\1\56\1\57\1\54\1\55\4\uffff\1\46";
    static final String DFA10_specialS =
        "\u00c6\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\43\2\uffff\1\43\22\uffff\1\43\1\12\1\42\2\uffff\1\21\1\1"+
            "\1\uffff\1\2\1\3\1\17\1\15\1\4\1\16\1\5\1\20\12\41\1\uffff\1"+
            "\6\1\13\1\11\1\14\2\uffff\14\40\1\37\15\40\1\7\1\uffff\1\10"+
            "\1\uffff\1\40\1\uffff\1\23\2\40\1\31\1\27\1\32\1\34\1\40\1\25"+
            "\4\40\1\22\1\24\1\35\1\40\1\33\1\36\1\26\2\40\1\30\3\40",
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
            "\1\44",
            "\1\46",
            "",
            "",
            "",
            "\1\50\4\uffff\1\50",
            "",
            "\1\52",
            "\1\55\12\uffff\1\53\7\uffff\1\54",
            "\1\56",
            "\1\57",
            "\1\60\11\uffff\1\61",
            "\1\62\1\uffff\1\63",
            "\1\64\11\uffff\1\65",
            "\1\66",
            "\1\70\23\uffff\1\67",
            "\1\71",
            "\1\72\3\uffff\1\73",
            "\1\74",
            "\1\75\6\uffff\1\76",
            "\1\77",
            "",
            "\1\100\1\uffff\12\41",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\117",
            "\1\120",
            "\1\122\22\uffff\1\121",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\133",
            "\1\134",
            "",
            "",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\142\2\uffff\1\140\15\uffff\1\141",
            "\1\143",
            "\1\144",
            "",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151\16\uffff\1\154\1\155\1\153\1\152",
            "\1\156",
            "\1\157",
            "\1\161\1\160",
            "\1\162",
            "\1\163",
            "",
            "",
            "\1\164",
            "\1\165",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\177",
            "\1\u0080",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u0090",
            "\1\u0091",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u0095",
            "",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u009d",
            "\1\u009e",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00a1",
            "\1\u00a2",
            "",
            "\1\u00a3",
            "\1\u00a4",
            "",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "",
            "",
            "\1\u00ab",
            "\1\u00ac",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00ae",
            "\1\u00af",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00bb",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "",
            "\1\u00c1",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | THEN | ELSE | ENDIF | WHILE | DO | ENDWHILE | FUNC | ENDFUNC | RETURN | READ | WRITE | TRUE | FALSE | GETCOLOR | GETULTRA | GETTOUCH | AVANZAR | GIRAR | PARAR | ACELERAR | SETSPEED | SETRADIO | GETRADIO | GETSPEED | SLEEP | MOTOR | ID | FLOAT | INT | COMMENT | STRING | WS );";
        }
    }
 

}
// $ANTLR 3.4 /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g 2015-04-07 05:58:03

    package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AslLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
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
    public static final int GMOTOR=27;
    public static final int GSENSOR=28;
    public static final int GT=29;
    public static final int ID=30;
    public static final int IF=31;
    public static final int INT=32;
    public static final int LE=33;
    public static final int LIST_FUNCTIONS=34;
    public static final int LIST_INSTR=35;
    public static final int LT=36;
    public static final int MGETTER=37;
    public static final int MINUS=38;
    public static final int MOD=39;
    public static final int MOTOR=40;
    public static final int MSETTER=41;
    public static final int MUL=42;
    public static final int NOT=43;
    public static final int NOT_EQUAL=44;
    public static final int OR=45;
    public static final int PARAMS=46;
    public static final int PARAR=47;
    public static final int PLUS=48;
    public static final int PREF=49;
    public static final int PVALUE=50;
    public static final int READ=51;
    public static final int RETURN=52;
    public static final int SENSOR=53;
    public static final int SLEEP=54;
    public static final int SMOTOR=55;
    public static final int SSLEEP=56;
    public static final int STRING=57;
    public static final int THEN=58;
    public static final int TIPO=59;
    public static final int TRUE=60;
    public static final int VOID=61;
    public static final int WHILE=62;
    public static final int WRITE=63;
    public static final int WS=64;

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
    public String getGrammarFileName() { return "/home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g"; }

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:6:7: ( '(' )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:6:9: '('
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
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:7:7: ( ')' )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:7:9: ')'
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
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:8:7: ( ',' )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:8:9: ','
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
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:9:7: ( '.' )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:9:9: '.'
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
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:10:7: ( ';' )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:10:9: ';'
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
    // $ANTLR end "T__69"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:184:17: ( '=' )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:184:19: '='
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:185:17: ( '!=' )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:185:19: '!='
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:186:17: ( '<' )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:186:19: '<'
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:187:17: ( '<=' )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:187:19: '<='
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:188:17: ( '>' )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:188:19: '>'
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:189:17: ( '>=' )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:189:19: '>='
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:190:17: ( '+' )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:190:19: '+'
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:191:17: ( '-' )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:191:19: '-'
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:192:17: ( '*' )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:192:19: '*'
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:193:17: ( '/' )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:193:19: '/'
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:194:17: ( '%' )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:194:19: '%'
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:195:17: ( 'not' )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:195:19: 'not'
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:196:17: ( 'and' )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:196:19: 'and'
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:197:17: ( 'or' )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:197:19: 'or'
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:198:17: ( 'if' )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:198:19: 'if'
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:199:17: ( 'then' )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:199:19: 'then'
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:200:17: ( 'else' )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:200:19: 'else'
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:201:17: ( 'endif' )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:201:19: 'endif'
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:202:17: ( 'while' )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:202:19: 'while'
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:203:17: ( 'do' )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:203:19: 'do'
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:204:17: ( 'endwhile' )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:204:19: 'endwhile'
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:205:17: ( 'func' )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:205:19: 'func'
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:206:17: ( 'endfunc' )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:206:19: 'endfunc'
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:207:17: ( 'return' )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:207:19: 'return'
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:208:17: ( 'read' )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:208:19: 'read'
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:209:17: ( 'write' )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:209:19: 'write'
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:210:17: ( 'true' )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:210:19: 'true'
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:211:17: ( 'false' )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:211:19: 'false'
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:212:17: ( 'void' )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:212:19: 'void'
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:213:17: ( ( 'int' | 'bool' | 'motor' | 'touch' | 'ultra' | 'color' ) )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:213:19: ( 'int' | 'bool' | 'motor' | 'touch' | 'ultra' | 'color' )
            {
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:213:19: ( 'int' | 'bool' | 'motor' | 'touch' | 'ultra' | 'color' )
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
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:213:20: 'int'
                    {
                    match("int"); 



                    }
                    break;
                case 2 :
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:213:26: 'bool'
                    {
                    match("bool"); 



                    }
                    break;
                case 3 :
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:213:33: 'motor'
                    {
                    match("motor"); 



                    }
                    break;
                case 4 :
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:213:41: 'touch'
                    {
                    match("touch"); 



                    }
                    break;
                case 5 :
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:213:49: 'ultra'
                    {
                    match("ultra"); 



                    }
                    break;
                case 6 :
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:213:57: 'color'
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:214:17: ( 'avanzar' | 'retroceder' )
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
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:214:19: 'avanzar'
                    {
                    match("avanzar"); 



                    }
                    break;
                case 2 :
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:214:31: 'retroceder'
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:215:17: ( 'parar' )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:215:19: 'parar'
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:216:17: ( ( 'setSpeed' | 'setPower' ) )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:216:19: ( 'setSpeed' | 'setPower' )
            {
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:216:19: ( 'setSpeed' | 'setPower' )
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
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:216:20: 'setSpeed'
                    {
                    match("setSpeed"); 



                    }
                    break;
                case 2 :
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:216:33: 'setPower'
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:217:17: ( ( 'getSpeed' | 'getPower' | 'isMoving' ) )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:217:19: ( 'getSpeed' | 'getPower' | 'isMoving' )
            {
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:217:19: ( 'getSpeed' | 'getPower' | 'isMoving' )
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
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:217:20: 'getSpeed'
                    {
                    match("getSpeed"); 



                    }
                    break;
                case 2 :
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:217:33: 'getPower'
                    {
                    match("getPower"); 



                    }
                    break;
                case 3 :
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:217:46: 'isMoving'
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:218:17: ( 'getColor' )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:218:19: 'getColor'
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:219:17: ( 'getUltrasonic' )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:219:19: 'getUltrasonic'
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:220:17: ( 'getTouch' )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:220:19: 'getTouch'
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:221:17: ( 'MOTOR' )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:221:19: 'MOTOR'
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:222:17: ( ( 'ULTRA' | 'TOUCH' | 'COLOR' ) )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:222:19: ( 'ULTRA' | 'TOUCH' | 'COLOR' )
            {
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:222:19: ( 'ULTRA' | 'TOUCH' | 'COLOR' )
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
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:222:20: 'ULTRA'
                    {
                    match("ULTRA"); 



                    }
                    break;
                case 2 :
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:222:28: 'TOUCH'
                    {
                    match("TOUCH"); 



                    }
                    break;
                case 3 :
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:222:36: 'COLOR'
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

    // $ANTLR start "SLEEP"
    public final void mSLEEP() throws RecognitionException {
        try {
            int _type = SLEEP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:223:17: ( 'sleep' )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:223:19: 'sleep'
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:226:17: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:226:19: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:226:43: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='_'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:227:17: ( ( '-' )? ( '0' .. '9' )+ )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:227:19: ( '-' )? ( '0' .. '9' )+
            {
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:227:19: ( '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='-') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:227:19: '-'
                    {
                    match('-'); 

                    }
                    break;

            }


            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:227:24: ( '0' .. '9' )+
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
            	    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:230:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
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
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:230:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:230:16: (~ ( '\\n' | '\\r' ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0 >= '\u0000' && LA9_0 <= '\t')||(LA9_0 >= '\u000B' && LA9_0 <= '\f')||(LA9_0 >= '\u000E' && LA9_0 <= '\uFFFF')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:
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


                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:230:30: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:230:30: '\\r'
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
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:231:11: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:231:16: ( options {greedy=false; } : . )*
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
                    	    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:231:44: .
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:235:9: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:235:11: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:235:15: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
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
            	    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:235:17: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:235:27: ~ ( '\\\\' | '\"' )
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:240:9: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:240:11: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:243:9: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:243:11: ( ' ' | '\\t' | '\\r' | '\\n' )
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
        // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:8: ( T__65 | T__66 | T__67 | T__68 | T__69 | EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | THEN | ELSE | ENDIF | WHILE | DO | ENDWHILE | FUNC | ENDFUNC | RETURN | READ | WRITE | TRUE | FALSE | VOID | TIPO | AVANZAR | PARAR | MSETTER | MGETTER | GETCOLOR | GETULTRA | GETTOUCH | MOTOR | SENSOR | SLEEP | ID | INT | COMMENT | STRING | WS )
        int alt14=50;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:10: T__65
                {
                mT__65(); 


                }
                break;
            case 2 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:16: T__66
                {
                mT__66(); 


                }
                break;
            case 3 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:22: T__67
                {
                mT__67(); 


                }
                break;
            case 4 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:28: T__68
                {
                mT__68(); 


                }
                break;
            case 5 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:34: T__69
                {
                mT__69(); 


                }
                break;
            case 6 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:40: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 7 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:46: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 8 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:56: LT
                {
                mLT(); 


                }
                break;
            case 9 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:59: LE
                {
                mLE(); 


                }
                break;
            case 10 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:62: GT
                {
                mGT(); 


                }
                break;
            case 11 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:65: GE
                {
                mGE(); 


                }
                break;
            case 12 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:68: PLUS
                {
                mPLUS(); 


                }
                break;
            case 13 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:73: MINUS
                {
                mMINUS(); 


                }
                break;
            case 14 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:79: MUL
                {
                mMUL(); 


                }
                break;
            case 15 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:83: DIV
                {
                mDIV(); 


                }
                break;
            case 16 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:87: MOD
                {
                mMOD(); 


                }
                break;
            case 17 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:91: NOT
                {
                mNOT(); 


                }
                break;
            case 18 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:95: AND
                {
                mAND(); 


                }
                break;
            case 19 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:99: OR
                {
                mOR(); 


                }
                break;
            case 20 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:102: IF
                {
                mIF(); 


                }
                break;
            case 21 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:105: THEN
                {
                mTHEN(); 


                }
                break;
            case 22 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:110: ELSE
                {
                mELSE(); 


                }
                break;
            case 23 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:115: ENDIF
                {
                mENDIF(); 


                }
                break;
            case 24 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:121: WHILE
                {
                mWHILE(); 


                }
                break;
            case 25 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:127: DO
                {
                mDO(); 


                }
                break;
            case 26 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:130: ENDWHILE
                {
                mENDWHILE(); 


                }
                break;
            case 27 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:139: FUNC
                {
                mFUNC(); 


                }
                break;
            case 28 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:144: ENDFUNC
                {
                mENDFUNC(); 


                }
                break;
            case 29 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:152: RETURN
                {
                mRETURN(); 


                }
                break;
            case 30 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:159: READ
                {
                mREAD(); 


                }
                break;
            case 31 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:164: WRITE
                {
                mWRITE(); 


                }
                break;
            case 32 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:170: TRUE
                {
                mTRUE(); 


                }
                break;
            case 33 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:175: FALSE
                {
                mFALSE(); 


                }
                break;
            case 34 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:181: VOID
                {
                mVOID(); 


                }
                break;
            case 35 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:186: TIPO
                {
                mTIPO(); 


                }
                break;
            case 36 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:191: AVANZAR
                {
                mAVANZAR(); 


                }
                break;
            case 37 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:199: PARAR
                {
                mPARAR(); 


                }
                break;
            case 38 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:205: MSETTER
                {
                mMSETTER(); 


                }
                break;
            case 39 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:213: MGETTER
                {
                mMGETTER(); 


                }
                break;
            case 40 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:221: GETCOLOR
                {
                mGETCOLOR(); 


                }
                break;
            case 41 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:230: GETULTRA
                {
                mGETULTRA(); 


                }
                break;
            case 42 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:239: GETTOUCH
                {
                mGETTOUCH(); 


                }
                break;
            case 43 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:248: MOTOR
                {
                mMOTOR(); 


                }
                break;
            case 44 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:254: SENSOR
                {
                mSENSOR(); 


                }
                break;
            case 45 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:261: SLEEP
                {
                mSLEEP(); 


                }
                break;
            case 46 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:267: ID
                {
                mID(); 


                }
                break;
            case 47 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:270: INT
                {
                mINT(); 


                }
                break;
            case 48 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:274: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 49 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:282: STRING
                {
                mSTRING(); 


                }
                break;
            case 50 :
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:1:289: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\10\uffff\1\52\1\54\1\uffff\1\55\1\uffff\1\57\1\uffff\26\45\13\uffff"+
        "\3\45\1\122\1\123\11\45\1\135\20\45\1\157\1\160\1\45\2\uffff\1\162"+
        "\10\45\1\uffff\21\45\2\uffff\1\45\1\uffff\1\45\1\u0096\1\u0097\1"+
        "\45\1\u0099\5\45\1\u009f\3\45\1\u00a3\1\u00a4\1\162\22\45\2\uffff"+
        "\1\162\1\uffff\1\u00b7\2\45\1\u00ba\1\u00bb\1\uffff\1\u00bc\2\45"+
        "\2\uffff\3\162\1\u00bf\2\45\1\u00c2\5\45\1\u00c8\3\u00c9\2\45\1"+
        "\uffff\2\45\3\uffff\1\u00ce\1\45\1\uffff\2\45\1\uffff\5\45\2\uffff"+
        "\1\u00d7\2\45\1\u00da\1\uffff\10\45\1\uffff\1\u00e3\1\u00e4\1\uffff"+
        "\1\45\2\u00e6\2\u00e3\1\u00e7\1\45\1\u00e9\2\uffff\1\45\2\uffff"+
        "\1\45\1\uffff\1\u00d7\3\45\1\u00ef\1\uffff";
    static final String DFA14_eofS =
        "\u00f0\uffff";
    static final String DFA14_minS =
        "\1\11\7\uffff\2\75\1\uffff\1\60\1\uffff\1\52\1\uffff\1\157\1\156"+
        "\1\162\1\146\1\150\1\154\1\150\1\157\1\141\1\145\3\157\1\154\1\157"+
        "\1\141\2\145\1\117\1\114\2\117\13\uffff\1\164\1\144\1\141\2\60\1"+
        "\164\1\115\1\145\2\165\1\163\1\144\2\151\1\60\1\156\1\154\1\141"+
        "\1\151\1\157\2\164\1\154\1\162\1\164\1\145\1\164\2\124\1\125\1\114"+
        "\2\60\1\156\2\uffff\1\60\1\157\1\156\1\145\1\143\1\145\1\146\1\154"+
        "\1\164\1\uffff\1\143\1\163\1\162\2\144\1\154\1\157\1\162\1\157\1"+
        "\141\1\120\1\145\1\103\1\117\1\122\1\103\1\117\2\uffff\1\172\1\uffff"+
        "\1\166\2\60\1\150\1\60\1\146\1\150\1\165\2\145\1\60\1\145\1\162"+
        "\1\157\3\60\1\162\1\141\2\162\1\160\1\157\2\160\2\157\1\154\1\157"+
        "\1\122\1\101\1\110\1\122\1\141\1\151\2\uffff\1\60\1\uffff\1\60\1"+
        "\151\1\156\2\60\1\uffff\1\60\1\156\1\143\2\uffff\4\60\1\145\1\167"+
        "\1\60\1\145\1\167\1\154\1\164\1\165\4\60\1\162\1\156\1\uffff\1\154"+
        "\1\143\3\uffff\1\60\1\145\1\uffff\2\145\1\uffff\2\145\1\157\1\162"+
        "\1\143\2\uffff\1\60\1\147\1\145\1\60\1\uffff\2\144\1\162\1\144\2"+
        "\162\1\141\1\150\1\uffff\2\60\1\uffff\1\145\5\60\1\163\1\60\2\uffff"+
        "\1\162\2\uffff\1\157\1\uffff\1\60\1\156\1\151\1\143\1\60\1\uffff";
    static final String DFA14_maxS =
        "\1\172\7\uffff\2\75\1\uffff\1\71\1\uffff\1\57\1\uffff\1\157\1\166"+
        "\1\162\1\163\1\162\1\156\1\162\1\157\1\165\1\145\3\157\1\154\1\157"+
        "\1\141\1\154\1\145\1\117\1\114\2\117\13\uffff\1\164\1\144\1\141"+
        "\2\172\1\164\1\115\1\145\2\165\1\163\1\144\2\151\1\172\1\156\1\154"+
        "\1\164\1\151\1\157\2\164\1\154\1\162\1\164\1\145\1\164\2\124\1\125"+
        "\1\114\2\172\1\156\2\uffff\1\172\1\157\1\156\1\145\1\143\1\145\1"+
        "\167\1\154\1\164\1\uffff\1\143\1\163\1\165\2\144\1\154\1\157\1\162"+
        "\1\157\1\141\1\123\1\145\1\125\1\117\1\122\1\103\1\117\2\uffff\1"+
        "\172\1\uffff\1\166\2\172\1\150\1\172\1\146\1\150\1\165\2\145\1\172"+
        "\1\145\1\162\1\157\3\172\1\162\1\141\2\162\1\160\1\157\2\160\2\157"+
        "\1\154\1\157\1\122\1\101\1\110\1\122\1\141\1\151\2\uffff\1\172\1"+
        "\uffff\1\172\1\151\1\156\2\172\1\uffff\1\172\1\156\1\143\2\uffff"+
        "\4\172\1\145\1\167\1\172\1\145\1\167\1\154\1\164\1\165\4\172\1\162"+
        "\1\156\1\uffff\1\154\1\143\3\uffff\1\172\1\145\1\uffff\2\145\1\uffff"+
        "\2\145\1\157\1\162\1\143\2\uffff\1\172\1\147\1\145\1\172\1\uffff"+
        "\2\144\1\162\1\144\2\162\1\141\1\150\1\uffff\2\172\1\uffff\1\145"+
        "\5\172\1\163\1\172\2\uffff\1\162\2\uffff\1\157\1\uffff\1\172\1\156"+
        "\1\151\1\143\1\172\1\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\2\uffff\1\14\1\uffff\1\16\1"+
        "\uffff\1\20\26\uffff\1\56\1\57\1\61\1\62\1\11\1\10\1\13\1\12\1\15"+
        "\1\60\1\17\42\uffff\1\23\1\24\11\uffff\1\31\21\uffff\1\21\1\22\1"+
        "\uffff\1\43\43\uffff\1\25\1\40\1\uffff\1\26\5\uffff\1\33\3\uffff"+
        "\1\36\1\42\22\uffff\1\27\2\uffff\1\30\1\37\1\41\2\uffff\1\45\2\uffff"+
        "\1\55\5\uffff\1\53\1\54\4\uffff\1\35\10\uffff\1\44\2\uffff\1\34"+
        "\10\uffff\1\47\1\32\1\uffff\1\46\1\50\1\uffff\1\52\5\uffff\1\51";
    static final String DFA14_specialS =
        "\u00f0\uffff}>";
    static final String[] DFA14_transitionS = {
            "\2\50\2\uffff\1\50\22\uffff\1\50\1\7\1\47\2\uffff\1\16\2\uffff"+
            "\1\1\1\2\1\14\1\12\1\3\1\13\1\4\1\15\12\46\1\uffff\1\5\1\10"+
            "\1\6\1\11\2\uffff\2\45\1\44\11\45\1\41\6\45\1\43\1\42\5\45\4"+
            "\uffff\1\45\1\uffff\1\20\1\32\1\35\1\26\1\24\1\27\1\40\1\45"+
            "\1\22\3\45\1\33\1\17\1\21\1\36\1\45\1\30\1\37\1\23\1\34\1\31"+
            "\1\25\3\45",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\51",
            "\1\53",
            "",
            "\12\46",
            "",
            "\1\56\4\uffff\1\56",
            "",
            "\1\60",
            "\1\61\7\uffff\1\62",
            "\1\63",
            "\1\64\7\uffff\1\65\4\uffff\1\66",
            "\1\67\6\uffff\1\71\2\uffff\1\70",
            "\1\72\1\uffff\1\73",
            "\1\74\11\uffff\1\75",
            "\1\76",
            "\1\100\23\uffff\1\77",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110\6\uffff\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
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
            "\1\117",
            "\1\120",
            "\1\121",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\136",
            "\1\137",
            "\1\141\22\uffff\1\140",
            "\1\142",
            "\1\143",
            "\1\144",
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
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\161",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\172\2\uffff\1\170\15\uffff\1\171",
            "\1\173",
            "\1\174",
            "",
            "\1\175",
            "\1\176",
            "\1\u0080\2\uffff\1\177",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0089\2\uffff\1\u0088",
            "\1\u008a",
            "\1\u008d\14\uffff\1\u008c\2\uffff\1\u008b\1\u008f\1\u008e",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "",
            "",
            "\1\u0094",
            "",
            "\1\u0095",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0098",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
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
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00b8",
            "\1\u00b9",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00bd",
            "\1\u00be",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00c0",
            "\1\u00c1",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00ca",
            "\1\u00cb",
            "",
            "\1\u00cc",
            "\1\u00cd",
            "",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00cf",
            "",
            "\1\u00d0",
            "\1\u00d1",
            "",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00d8",
            "\1\u00d9",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u00e5",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00e8",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\1\u00ea",
            "",
            "",
            "\1\u00eb",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
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
            return "1:1: Tokens : ( T__65 | T__66 | T__67 | T__68 | T__69 | EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | THEN | ELSE | ENDIF | WHILE | DO | ENDWHILE | FUNC | ENDFUNC | RETURN | READ | WRITE | TRUE | FALSE | VOID | TIPO | AVANZAR | PARAR | MSETTER | MGETTER | GETCOLOR | GETULTRA | GETTOUCH | MOTOR | SENSOR | SLEEP | ID | INT | COMMENT | STRING | WS );";
        }
    }
 

}
// $ANTLR 3.4 /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g 2015-04-05 20:02:51

    package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AslLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
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
    public static final int VOID=64;
    public static final int WHILE=65;
    public static final int WRITE=66;
    public static final int WS=67;

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
    public String getGrammarFileName() { return "/home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g"; }

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:6:7: ( '&' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:6:9: '&'
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
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:7:7: ( '(' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:7:9: '('
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
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:8:7: ( ')' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:8:9: ')'
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
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:9:7: ( ',' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:9:9: ','
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
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:10:7: ( '.' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:10:9: '.'
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
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:11:7: ( ';' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:11:9: ';'
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
    // $ANTLR end "T__73"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:186:17: ( '=' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:186:19: '='
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
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:187:17: ( '!=' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:187:19: '!='
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
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:188:17: ( '<' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:188:19: '<'
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
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:189:17: ( '<=' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:189:19: '<='
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
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:190:17: ( '>' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:190:19: '>'
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
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:191:17: ( '>=' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:191:19: '>='
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
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:192:17: ( '+' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:192:19: '+'
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
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:193:17: ( '-' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:193:19: '-'
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
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:194:17: ( '*' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:194:19: '*'
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
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:195:17: ( '/' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:195:19: '/'
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
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:196:17: ( '%' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:196:19: '%'
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
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:197:17: ( 'not' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:197:19: 'not'
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
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:198:17: ( 'and' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:198:19: 'and'
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
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:199:17: ( 'or' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:199:19: 'or'
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
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:200:17: ( 'if' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:200:19: 'if'
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
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:201:17: ( 'then' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:201:19: 'then'
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
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:202:17: ( 'else' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:202:19: 'else'
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
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:203:17: ( 'endif' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:203:19: 'endif'
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
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:204:17: ( 'while' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:204:19: 'while'
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
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:205:17: ( 'do' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:205:19: 'do'
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
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:206:17: ( 'endwhile' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:206:19: 'endwhile'
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
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:207:17: ( 'func' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:207:19: 'func'
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
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:208:17: ( 'endfunc' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:208:19: 'endfunc'
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
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:209:17: ( 'return' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:209:19: 'return'
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
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:210:17: ( 'read' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:210:19: 'read'
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
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:211:17: ( 'write' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:211:19: 'write'
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
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:212:17: ( 'true' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:212:19: 'true'
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
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:213:17: ( 'false' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:213:19: 'false'
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
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:214:17: ( 'void' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:214:19: 'void'
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
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:215:17: ( ( 'int' | 'float' | 'bool' | 'motor' ) )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:215:19: ( 'int' | 'float' | 'bool' | 'motor' )
            {
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:215:19: ( 'int' | 'float' | 'bool' | 'motor' )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 'i':
                {
                alt1=1;
                }
                break;
            case 'f':
                {
                alt1=2;
                }
                break;
            case 'b':
                {
                alt1=3;
                }
                break;
            case 'm':
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:215:20: 'int'
                    {
                    match("int"); 



                    }
                    break;
                case 2 :
                    // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:215:26: 'float'
                    {
                    match("float"); 



                    }
                    break;
                case 3 :
                    // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:215:34: 'bool'
                    {
                    match("bool"); 



                    }
                    break;
                case 4 :
                    // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:215:41: 'motor'
                    {
                    match("motor"); 



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
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:216:17: ( 'avanzar' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:216:19: 'avanzar'
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
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:217:17: ( 'girar' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:217:19: 'girar'
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
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:218:17: ( 'parar' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:218:19: 'parar'
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
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:219:17: ( 'acelerar' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:219:19: 'acelerar'
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

    // $ANTLR start "GETRADIO"
    public final void mGETRADIO() throws RecognitionException {
        try {
            int _type = GETRADIO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:220:17: ( 'getRadio' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:220:19: 'getRadio'
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

    // $ANTLR start "SETRADIO"
    public final void mSETRADIO() throws RecognitionException {
        try {
            int _type = SETRADIO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:221:17: ( 'setRadio' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:221:19: 'setRadio'
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

    // $ANTLR start "GETSPEED"
    public final void mGETSPEED() throws RecognitionException {
        try {
            int _type = GETSPEED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:222:17: ( 'getSpeed' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:222:19: 'getSpeed'
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

    // $ANTLR start "SETSPEED"
    public final void mSETSPEED() throws RecognitionException {
        try {
            int _type = SETSPEED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:223:17: ( 'setSpeed' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:223:19: 'setSpeed'
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

    // $ANTLR start "GETCOLOR"
    public final void mGETCOLOR() throws RecognitionException {
        try {
            int _type = GETCOLOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:224:17: ( 'getColor' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:224:19: 'getColor'
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
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:225:17: ( 'getUltrasonic' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:225:19: 'getUltrasonic'
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
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:226:17: ( 'getTouch' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:226:19: 'getTouch'
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
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:227:17: ( 'MOTOR' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:227:19: 'MOTOR'
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

    // $ANTLR start "SLEEP"
    public final void mSLEEP() throws RecognitionException {
        try {
            int _type = SLEEP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:228:17: ( 'sleep' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:228:19: 'sleep'
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
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:231:17: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:231:19: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:231:43: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:
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
            	    break loop2;
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
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:232:17: ( ( '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:232:19: ( '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )+
            {
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:232:19: ( '-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='-') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:232:19: '-'
                    {
                    match('-'); 

                    }
                    break;

            }


            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:232:24: ( '0' .. '9' )+
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
            	    // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:
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


            match('.'); 

            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:232:38: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:233:17: ( ( '-' )? ( '0' .. '9' )+ )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:233:19: ( '-' )? ( '0' .. '9' )+
            {
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:233:19: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:233:19: '-'
                    {
                    match('-'); 

                    }
                    break;

            }


            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:233:24: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:
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
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:236:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='/') ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1=='/') ) {
                    alt11=1;
                }
                else if ( (LA11_1=='*') ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:236:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:236:16: (~ ( '\\n' | '\\r' ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0 >= '\u0000' && LA8_0 <= '\t')||(LA8_0 >= '\u000B' && LA8_0 <= '\f')||(LA8_0 >= '\u000E' && LA8_0 <= '\uFFFF')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:
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
                    	    break loop8;
                        }
                    } while (true);


                    // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:236:30: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:236:30: '\\r'
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
                    // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:237:11: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:237:16: ( options {greedy=false; } : . )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='*') ) {
                            int LA10_1 = input.LA(2);

                            if ( (LA10_1=='/') ) {
                                alt10=2;
                            }
                            else if ( ((LA10_1 >= '\u0000' && LA10_1 <= '.')||(LA10_1 >= '0' && LA10_1 <= '\uFFFF')) ) {
                                alt10=1;
                            }


                        }
                        else if ( ((LA10_0 >= '\u0000' && LA10_0 <= ')')||(LA10_0 >= '+' && LA10_0 <= '\uFFFF')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:237:44: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
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
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:241:9: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:241:11: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:241:15: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop12:
            do {
                int alt12=3;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='\\') ) {
                    alt12=1;
                }
                else if ( ((LA12_0 >= '\u0000' && LA12_0 <= '!')||(LA12_0 >= '#' && LA12_0 <= '[')||(LA12_0 >= ']' && LA12_0 <= '\uFFFF')) ) {
                    alt12=2;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:241:17: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:241:27: ~ ( '\\\\' | '\"' )
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
            	    break loop12;
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
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:246:9: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:246:11: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:249:9: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:249:11: ( ' ' | '\\t' | '\\r' | '\\n' )
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
        // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:8: ( T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | THEN | ELSE | ENDIF | WHILE | DO | ENDWHILE | FUNC | ENDFUNC | RETURN | READ | WRITE | TRUE | FALSE | VOID | TIPO | AVANZAR | GIRAR | PARAR | ACELERAR | GETRADIO | SETRADIO | GETSPEED | SETSPEED | GETCOLOR | GETULTRA | GETTOUCH | MOTOR | SLEEP | ID | FLOAT | INT | COMMENT | STRING | WS )
        int alt13=55;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:10: T__68
                {
                mT__68(); 


                }
                break;
            case 2 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:16: T__69
                {
                mT__69(); 


                }
                break;
            case 3 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:22: T__70
                {
                mT__70(); 


                }
                break;
            case 4 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:28: T__71
                {
                mT__71(); 


                }
                break;
            case 5 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:34: T__72
                {
                mT__72(); 


                }
                break;
            case 6 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:40: T__73
                {
                mT__73(); 


                }
                break;
            case 7 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:46: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 8 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:52: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 9 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:62: LT
                {
                mLT(); 


                }
                break;
            case 10 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:65: LE
                {
                mLE(); 


                }
                break;
            case 11 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:68: GT
                {
                mGT(); 


                }
                break;
            case 12 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:71: GE
                {
                mGE(); 


                }
                break;
            case 13 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:74: PLUS
                {
                mPLUS(); 


                }
                break;
            case 14 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:79: MINUS
                {
                mMINUS(); 


                }
                break;
            case 15 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:85: MUL
                {
                mMUL(); 


                }
                break;
            case 16 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:89: DIV
                {
                mDIV(); 


                }
                break;
            case 17 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:93: MOD
                {
                mMOD(); 


                }
                break;
            case 18 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:97: NOT
                {
                mNOT(); 


                }
                break;
            case 19 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:101: AND
                {
                mAND(); 


                }
                break;
            case 20 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:105: OR
                {
                mOR(); 


                }
                break;
            case 21 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:108: IF
                {
                mIF(); 


                }
                break;
            case 22 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:111: THEN
                {
                mTHEN(); 


                }
                break;
            case 23 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:116: ELSE
                {
                mELSE(); 


                }
                break;
            case 24 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:121: ENDIF
                {
                mENDIF(); 


                }
                break;
            case 25 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:127: WHILE
                {
                mWHILE(); 


                }
                break;
            case 26 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:133: DO
                {
                mDO(); 


                }
                break;
            case 27 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:136: ENDWHILE
                {
                mENDWHILE(); 


                }
                break;
            case 28 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:145: FUNC
                {
                mFUNC(); 


                }
                break;
            case 29 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:150: ENDFUNC
                {
                mENDFUNC(); 


                }
                break;
            case 30 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:158: RETURN
                {
                mRETURN(); 


                }
                break;
            case 31 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:165: READ
                {
                mREAD(); 


                }
                break;
            case 32 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:170: WRITE
                {
                mWRITE(); 


                }
                break;
            case 33 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:176: TRUE
                {
                mTRUE(); 


                }
                break;
            case 34 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:181: FALSE
                {
                mFALSE(); 


                }
                break;
            case 35 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:187: VOID
                {
                mVOID(); 


                }
                break;
            case 36 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:192: TIPO
                {
                mTIPO(); 


                }
                break;
            case 37 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:197: AVANZAR
                {
                mAVANZAR(); 


                }
                break;
            case 38 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:205: GIRAR
                {
                mGIRAR(); 


                }
                break;
            case 39 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:211: PARAR
                {
                mPARAR(); 


                }
                break;
            case 40 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:217: ACELERAR
                {
                mACELERAR(); 


                }
                break;
            case 41 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:226: GETRADIO
                {
                mGETRADIO(); 


                }
                break;
            case 42 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:235: SETRADIO
                {
                mSETRADIO(); 


                }
                break;
            case 43 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:244: GETSPEED
                {
                mGETSPEED(); 


                }
                break;
            case 44 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:253: SETSPEED
                {
                mSETSPEED(); 


                }
                break;
            case 45 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:262: GETCOLOR
                {
                mGETCOLOR(); 


                }
                break;
            case 46 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:271: GETULTRA
                {
                mGETULTRA(); 


                }
                break;
            case 47 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:280: GETTOUCH
                {
                mGETTOUCH(); 


                }
                break;
            case 48 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:289: MOTOR
                {
                mMOTOR(); 


                }
                break;
            case 49 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:295: SLEEP
                {
                mSLEEP(); 


                }
                break;
            case 50 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:301: ID
                {
                mID(); 


                }
                break;
            case 51 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:304: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 52 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:310: INT
                {
                mINT(); 


                }
                break;
            case 53 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:314: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 54 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:322: STRING
                {
                mSTRING(); 


                }
                break;
            case 55 :
                // /home/ester/Documentos/CL/robot-cl/Asl/src/parser/Asl.g:1:329: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\11\uffff\1\46\1\50\1\uffff\1\51\1\uffff\1\53\1\uffff\21\41\1\uffff"+
        "\1\110\11\uffff\4\41\1\115\1\116\7\41\1\126\15\41\2\uffff\1\145"+
        "\1\146\2\41\2\uffff\1\151\6\41\1\uffff\16\41\2\uffff\2\41\1\uffff"+
        "\1\u0087\1\u0088\1\u0089\5\41\1\u008f\3\41\1\u0093\1\u0094\1\151"+
        "\16\41\3\uffff\1\u00a3\2\41\1\u00a6\1\u00a7\1\uffff\1\u00a8\1\151"+
        "\1\41\2\uffff\1\151\1\u00aa\5\41\1\u00b0\2\41\1\u00b3\1\u00b4\2"+
        "\41\1\uffff\2\41\3\uffff\1\u00b9\1\uffff\5\41\1\uffff\2\41\2\uffff"+
        "\1\u00c1\2\41\1\u00c4\1\uffff\7\41\1\uffff\1\u00cc\1\u00cd\1\uffff"+
        "\1\u00ce\1\u00cf\1\u00d0\1\41\1\u00d2\1\u00d3\1\u00d4\5\uffff\1"+
        "\41\3\uffff\3\41\1\u00d9\1\uffff";
    static final String DFA13_eofS =
        "\u00da\uffff";
    static final String DFA13_minS =
        "\1\11\10\uffff\2\75\1\uffff\1\60\1\uffff\1\52\1\uffff\1\157\1\143"+
        "\1\162\1\146\1\150\1\154\1\150\1\157\1\141\1\145\3\157\1\145\1\141"+
        "\1\145\1\117\1\uffff\1\56\11\uffff\1\164\1\144\1\141\1\145\2\60"+
        "\1\164\1\145\1\165\1\163\1\144\2\151\1\60\1\156\1\154\1\157\1\141"+
        "\1\151\1\157\1\164\1\162\1\164\1\162\1\164\1\145\1\124\2\uffff\2"+
        "\60\1\156\1\154\2\uffff\1\60\1\156\2\145\1\146\1\154\1\164\1\uffff"+
        "\1\143\1\163\1\141\1\165\2\144\1\154\1\157\1\141\1\103\1\141\1\122"+
        "\1\145\1\117\2\uffff\1\172\1\145\1\uffff\3\60\1\146\1\150\1\165"+
        "\2\145\1\60\1\145\1\164\1\162\3\60\2\162\1\141\1\160\1\157\1\154"+
        "\1\157\1\162\1\141\2\160\1\122\1\141\1\162\3\uffff\1\60\1\151\1"+
        "\156\2\60\1\uffff\2\60\1\156\2\uffff\2\60\1\144\1\145\1\154\1\164"+
        "\1\165\1\60\1\144\1\145\2\60\1\162\1\141\1\uffff\1\154\1\143\3\uffff"+
        "\1\60\1\uffff\1\151\1\145\1\157\1\162\1\143\1\uffff\1\151\1\145"+
        "\2\uffff\1\60\1\162\1\145\1\60\1\uffff\1\157\1\144\1\162\1\141\1"+
        "\150\1\157\1\144\1\uffff\2\60\1\uffff\3\60\1\163\3\60\5\uffff\1"+
        "\157\3\uffff\1\156\1\151\1\143\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\172\10\uffff\2\75\1\uffff\1\71\1\uffff\1\57\1\uffff\1\157\1\166"+
        "\1\162\1\156\1\162\1\156\1\162\1\157\1\165\1\145\3\157\1\151\1\141"+
        "\1\154\1\117\1\uffff\1\71\11\uffff\1\164\1\144\1\141\1\145\2\172"+
        "\1\164\1\145\1\165\1\163\1\144\2\151\1\172\1\156\1\154\1\157\1\164"+
        "\1\151\1\157\1\164\1\162\1\164\1\162\1\164\1\145\1\124\2\uffff\2"+
        "\172\1\156\1\154\2\uffff\1\172\1\156\2\145\1\167\1\154\1\164\1\uffff"+
        "\1\143\1\163\1\141\1\165\2\144\1\154\1\157\1\141\1\125\1\141\1\123"+
        "\1\145\1\117\2\uffff\1\172\1\145\1\uffff\3\172\1\146\1\150\1\165"+
        "\2\145\1\172\1\145\1\164\1\162\3\172\2\162\1\141\1\160\1\157\1\154"+
        "\1\157\1\162\1\141\2\160\1\122\1\141\1\162\3\uffff\1\172\1\151\1"+
        "\156\2\172\1\uffff\2\172\1\156\2\uffff\2\172\1\144\1\145\1\154\1"+
        "\164\1\165\1\172\1\144\1\145\2\172\1\162\1\141\1\uffff\1\154\1\143"+
        "\3\uffff\1\172\1\uffff\1\151\1\145\1\157\1\162\1\143\1\uffff\1\151"+
        "\1\145\2\uffff\1\172\1\162\1\145\1\172\1\uffff\1\157\1\144\1\162"+
        "\1\141\1\150\1\157\1\144\1\uffff\2\172\1\uffff\3\172\1\163\3\172"+
        "\5\uffff\1\157\3\uffff\1\156\1\151\1\143\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff\1\15\1\uffff\1"+
        "\17\1\uffff\1\21\21\uffff\1\62\1\uffff\1\66\1\67\1\12\1\11\1\14"+
        "\1\13\1\16\1\65\1\20\33\uffff\1\63\1\64\4\uffff\1\24\1\25\7\uffff"+
        "\1\32\16\uffff\1\22\1\23\2\uffff\1\44\35\uffff\1\26\1\41\1\27\5"+
        "\uffff\1\34\3\uffff\1\37\1\43\16\uffff\1\30\2\uffff\1\31\1\40\1"+
        "\42\1\uffff\1\46\5\uffff\1\47\2\uffff\1\61\1\60\4\uffff\1\36\7\uffff"+
        "\1\45\2\uffff\1\35\7\uffff\1\50\1\33\1\51\1\53\1\55\1\uffff\1\57"+
        "\1\52\1\54\4\uffff\1\56";
    static final String DFA13_specialS =
        "\u00da\uffff}>";
    static final String[] DFA13_transitionS = {
            "\2\44\2\uffff\1\44\22\uffff\1\44\1\10\1\43\2\uffff\1\17\1\1"+
            "\1\uffff\1\2\1\3\1\15\1\13\1\4\1\14\1\5\1\16\12\42\1\uffff\1"+
            "\6\1\11\1\7\1\12\2\uffff\14\41\1\40\15\41\4\uffff\1\41\1\uffff"+
            "\1\21\1\33\1\41\1\27\1\25\1\30\1\35\1\41\1\23\3\41\1\34\1\20"+
            "\1\22\1\36\1\41\1\31\1\37\1\24\1\41\1\32\1\26\3\41",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\45",
            "\1\47",
            "",
            "\12\42",
            "",
            "\1\52\4\uffff\1\52",
            "",
            "\1\54",
            "\1\57\12\uffff\1\55\7\uffff\1\56",
            "\1\60",
            "\1\61\7\uffff\1\62",
            "\1\63\11\uffff\1\64",
            "\1\65\1\uffff\1\66",
            "\1\67\11\uffff\1\70",
            "\1\71",
            "\1\73\12\uffff\1\74\10\uffff\1\72",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\102\3\uffff\1\101",
            "\1\103",
            "\1\104\6\uffff\1\105",
            "\1\106",
            "",
            "\1\107\1\uffff\12\42",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\133\22\uffff\1\132",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\147",
            "\1\150",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\157\2\uffff\1\155\15\uffff\1\156",
            "\1\160",
            "\1\161",
            "",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\175\16\uffff\1\173\1\174\1\177\1\176",
            "\1\u0080",
            "\1\u0081\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "",
            "",
            "\1\u0085",
            "\1\u0086",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00a4",
            "\1\u00a5",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00a9",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00b1",
            "\1\u00b2",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00b5",
            "\1\u00b6",
            "",
            "\1\u00b7",
            "\1\u00b8",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "",
            "\1\u00bf",
            "\1\u00c0",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00c2",
            "\1\u00c3",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00d1",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d5",
            "",
            "",
            "",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | THEN | ELSE | ENDIF | WHILE | DO | ENDWHILE | FUNC | ENDFUNC | RETURN | READ | WRITE | TRUE | FALSE | VOID | TIPO | AVANZAR | GIRAR | PARAR | ACELERAR | GETRADIO | SETRADIO | GETSPEED | SETSPEED | GETCOLOR | GETULTRA | GETTOUCH | MOTOR | SLEEP | ID | FLOAT | INT | COMMENT | STRING | WS );";
        }
    }
 

}
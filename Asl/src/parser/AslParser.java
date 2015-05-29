// $ANTLR 3.4 /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g 2015-05-29 13:38:40

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGLIST", "ASSIGN", "AVANZAR", "BOOLEAN", "COMMENT", "DIV", "DMOTOR", "DO", "DSENSOR", "ELSE", "ENDFUNC", "ENDIF", "ENDWHILE", "EQUAL", "ESC_SEQ", "FALSE", "FUNC", "FUNCALL", "GE", "GETCOLOR", "GETTOUCH", "GETULTRA", "GLOB", "GMOTOR", "GSENSOR", "GT", "ID", "IF", "INCL", "INCLUDE", "INT", "LE", "LIST_FUNCTIONS", "LIST_GLOBALS", "LIST_INCLUDES", "LIST_INSTR", "LT", "MGETTER", "MINUS", "MOD", "MOTOR", "MSETTER", "MUL", "NOT", "NOT_EQUAL", "OBJECT", "OBJ_FUNC", "OR", "PARAMS", "PARAR", "PLUS", "PREF", "PROG", "PVALUE", "READ", "RETURN", "SENSOR", "SLEEP", "SMOTOR", "SSLEEP", "STRING", "THEN", "TIPO", "TRUE", "VOID", "WHILE", "WRITE", "WS", "'('", "')'", "','", "'.'", "';'"
    };

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
    public String getGrammarFileName() { return "/home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:71:1: prog : list_includes list_globals list_funcs -> ^( PROG list_includes list_globals list_funcs ) ;
    public final AslParser.prog_return prog() throws RecognitionException {
        AslParser.prog_return retval = new AslParser.prog_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.list_includes_return list_includes1 =null;

        AslParser.list_globals_return list_globals2 =null;

        AslParser.list_funcs_return list_funcs3 =null;


        RewriteRuleSubtreeStream stream_list_includes=new RewriteRuleSubtreeStream(adaptor,"rule list_includes");
        RewriteRuleSubtreeStream stream_list_globals=new RewriteRuleSubtreeStream(adaptor,"rule list_globals");
        RewriteRuleSubtreeStream stream_list_funcs=new RewriteRuleSubtreeStream(adaptor,"rule list_funcs");
        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:71:9: ( list_includes list_globals list_funcs -> ^( PROG list_includes list_globals list_funcs ) )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:71:11: list_includes list_globals list_funcs
            {
            pushFollow(FOLLOW_list_includes_in_prog317);
            list_includes1=list_includes();

            state._fsp--;

            stream_list_includes.add(list_includes1.getTree());

            pushFollow(FOLLOW_list_globals_in_prog319);
            list_globals2=list_globals();

            state._fsp--;

            stream_list_globals.add(list_globals2.getTree());

            pushFollow(FOLLOW_list_funcs_in_prog321);
            list_funcs3=list_funcs();

            state._fsp--;

            stream_list_funcs.add(list_funcs3.getTree());

            // AST REWRITE
            // elements: list_funcs, list_globals, list_includes
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 71:49: -> ^( PROG list_includes list_globals list_funcs )
            {
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:71:52: ^( PROG list_includes list_globals list_funcs )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(PROG, "PROG")
                , root_1);

                adaptor.addChild(root_1, stream_list_includes.nextTree());

                adaptor.addChild(root_1, stream_list_globals.nextTree());

                adaptor.addChild(root_1, stream_list_funcs.nextTree());

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


    public static class list_includes_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "list_includes"
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:74:1: list_includes : ( include )* -> ^( LIST_INCLUDES ( include )* ) ;
    public final AslParser.list_includes_return list_includes() throws RecognitionException {
        AslParser.list_includes_return retval = new AslParser.list_includes_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.include_return include4 =null;


        RewriteRuleSubtreeStream stream_include=new RewriteRuleSubtreeStream(adaptor,"rule include");
        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:75:9: ( ( include )* -> ^( LIST_INCLUDES ( include )* ) )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:75:11: ( include )*
            {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:75:11: ( include )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==INCLUDE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:75:11: include
            	    {
            	    pushFollow(FOLLOW_include_in_list_includes358);
            	    include4=include();

            	    state._fsp--;

            	    stream_include.add(include4.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // AST REWRITE
            // elements: include
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 75:20: -> ^( LIST_INCLUDES ( include )* )
            {
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:75:23: ^( LIST_INCLUDES ( include )* )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(LIST_INCLUDES, "LIST_INCLUDES")
                , root_1);

                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:75:39: ( include )*
                while ( stream_include.hasNext() ) {
                    adaptor.addChild(root_1, stream_include.nextTree());

                }
                stream_include.reset();

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
    // $ANTLR end "list_includes"


    public static class list_globals_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "list_globals"
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:78:1: list_globals : ( global ';' )* -> ^( LIST_GLOBALS ( global )* ) ;
    public final AslParser.list_globals_return list_globals() throws RecognitionException {
        AslParser.list_globals_return retval = new AslParser.list_globals_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal6=null;
        AslParser.global_return global5 =null;


        AslTree char_literal6_tree=null;
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleSubtreeStream stream_global=new RewriteRuleSubtreeStream(adaptor,"rule global");
        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:79:9: ( ( global ';' )* -> ^( LIST_GLOBALS ( global )* ) )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:79:11: ( global ';' )*
            {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:79:11: ( global ';' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ID) ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==ID) ) {
                        int LA2_4 = input.LA(3);

                        if ( (LA2_4==77) ) {
                            alt2=1;
                        }


                    }


                }
                else if ( (LA2_0==TIPO) ) {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==ID) ) {
                        int LA2_5 = input.LA(3);

                        if ( (LA2_5==77) ) {
                            alt2=1;
                        }


                    }


                }


                switch (alt2) {
            	case 1 :
            	    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:79:12: global ';'
            	    {
            	    pushFollow(FOLLOW_global_in_list_globals398);
            	    global5=global();

            	    state._fsp--;

            	    stream_global.add(global5.getTree());

            	    char_literal6=(Token)match(input,77,FOLLOW_77_in_list_globals400);  
            	    stream_77.add(char_literal6);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            // AST REWRITE
            // elements: global
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 79:25: -> ^( LIST_GLOBALS ( global )* )
            {
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:79:28: ^( LIST_GLOBALS ( global )* )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(LIST_GLOBALS, "LIST_GLOBALS")
                , root_1);

                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:79:43: ( global )*
                while ( stream_global.hasNext() ) {
                    adaptor.addChild(root_1, stream_global.nextTree());

                }
                stream_global.reset();

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
    // $ANTLR end "list_globals"


    public static class list_funcs_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "list_funcs"
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:82:1: list_funcs : ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) ;
    public final AslParser.list_funcs_return list_funcs() throws RecognitionException {
        AslParser.list_funcs_return retval = new AslParser.list_funcs_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EOF8=null;
        AslParser.func_return func7 =null;


        AslTree EOF8_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_func=new RewriteRuleSubtreeStream(adaptor,"rule func");
        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:83:9: ( ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:83:11: ( func )+ EOF
            {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:83:11: ( func )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ID||LA3_0==TIPO||LA3_0==VOID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:83:11: func
            	    {
            	    pushFollow(FOLLOW_func_in_list_funcs440);
            	    func7=func();

            	    state._fsp--;

            	    stream_func.add(func7.getTree());

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


            EOF8=(Token)match(input,EOF,FOLLOW_EOF_in_list_funcs443);  
            stream_EOF.add(EOF8);


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
            // 83:21: -> ^( LIST_FUNCTIONS ( func )+ )
            {
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:83:24: ^( LIST_FUNCTIONS ( func )+ )
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
    // $ANTLR end "list_funcs"


    public static class include_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "include"
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:86:1: include : INCLUDE p= ID '/' f= ID -> ^( INCL $p $f) ;
    public final AslParser.include_return include() throws RecognitionException {
        AslParser.include_return retval = new AslParser.include_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token p=null;
        Token f=null;
        Token INCLUDE9=null;
        Token char_literal10=null;

        AslTree p_tree=null;
        AslTree f_tree=null;
        AslTree INCLUDE9_tree=null;
        AslTree char_literal10_tree=null;
        RewriteRuleTokenStream stream_DIV=new RewriteRuleTokenStream(adaptor,"token DIV");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_INCLUDE=new RewriteRuleTokenStream(adaptor,"token INCLUDE");

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:86:9: ( INCLUDE p= ID '/' f= ID -> ^( INCL $p $f) )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:86:11: INCLUDE p= ID '/' f= ID
            {
            INCLUDE9=(Token)match(input,INCLUDE,FOLLOW_INCLUDE_in_include481);  
            stream_INCLUDE.add(INCLUDE9);


            p=(Token)match(input,ID,FOLLOW_ID_in_include485);  
            stream_ID.add(p);


            char_literal10=(Token)match(input,DIV,FOLLOW_DIV_in_include486);  
            stream_DIV.add(char_literal10);


            f=(Token)match(input,ID,FOLLOW_ID_in_include489);  
            stream_ID.add(f);


            // AST REWRITE
            // elements: f, p
            // token labels: f, p
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_f=new RewriteRuleTokenStream(adaptor,"token f",f);
            RewriteRuleTokenStream stream_p=new RewriteRuleTokenStream(adaptor,"token p",p);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 86:31: -> ^( INCL $p $f)
            {
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:86:34: ^( INCL $p $f)
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(INCL, "INCL")
                , root_1);

                adaptor.addChild(root_1, stream_p.nextNode());

                adaptor.addChild(root_1, stream_f.nextNode());

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
    // $ANTLR end "include"


    public static class global_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "global"
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:89:1: global : (t= ID id= ID -> ^( GLOB $t $id) | TIPO ID -> ^( GLOB TIPO ID ) );
    public final AslParser.global_return global() throws RecognitionException {
        AslParser.global_return retval = new AslParser.global_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token t=null;
        Token id=null;
        Token TIPO11=null;
        Token ID12=null;

        AslTree t_tree=null;
        AslTree id_tree=null;
        AslTree TIPO11_tree=null;
        AslTree ID12_tree=null;
        RewriteRuleTokenStream stream_TIPO=new RewriteRuleTokenStream(adaptor,"token TIPO");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:89:9: (t= ID id= ID -> ^( GLOB $t $id) | TIPO ID -> ^( GLOB TIPO ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==TIPO) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:89:11: t= ID id= ID
                    {
                    t=(Token)match(input,ID,FOLLOW_ID_in_global526);  
                    stream_ID.add(t);


                    id=(Token)match(input,ID,FOLLOW_ID_in_global530);  
                    stream_ID.add(id);


                    // AST REWRITE
                    // elements: id, t
                    // token labels: id, t
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_id=new RewriteRuleTokenStream(adaptor,"token id",id);
                    RewriteRuleTokenStream stream_t=new RewriteRuleTokenStream(adaptor,"token t",t);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 89:22: -> ^( GLOB $t $id)
                    {
                        // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:89:25: ^( GLOB $t $id)
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(GLOB, "GLOB")
                        , root_1);

                        adaptor.addChild(root_1, stream_t.nextNode());

                        adaptor.addChild(root_1, stream_id.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:90:11: TIPO ID
                    {
                    TIPO11=(Token)match(input,TIPO,FOLLOW_TIPO_in_global554);  
                    stream_TIPO.add(TIPO11);


                    ID12=(Token)match(input,ID,FOLLOW_ID_in_global556);  
                    stream_ID.add(ID12);


                    // AST REWRITE
                    // elements: ID, TIPO
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 90:19: -> ^( GLOB TIPO ID )
                    {
                        // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:90:22: ^( GLOB TIPO ID )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(GLOB, "GLOB")
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
    // $ANTLR end "global"


    public static class func_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "func"
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:94:1: func : (t= ID id= ID params block_instructions return_stmt ENDFUNC -> ^( FUNC $t $id params block_instructions return_stmt ) | TIPO ID params block_instructions return_stmt ENDFUNC -> ^( FUNC TIPO ID params block_instructions return_stmt ) | VOID ID params block_instructions ENDFUNC -> ^( FUNC VOID ID params block_instructions ) );
    public final AslParser.func_return func() throws RecognitionException {
        AslParser.func_return retval = new AslParser.func_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token t=null;
        Token id=null;
        Token ENDFUNC16=null;
        Token TIPO17=null;
        Token ID18=null;
        Token ENDFUNC22=null;
        Token VOID23=null;
        Token ID24=null;
        Token ENDFUNC27=null;
        AslParser.params_return params13 =null;

        AslParser.block_instructions_return block_instructions14 =null;

        AslParser.return_stmt_return return_stmt15 =null;

        AslParser.params_return params19 =null;

        AslParser.block_instructions_return block_instructions20 =null;

        AslParser.return_stmt_return return_stmt21 =null;

        AslParser.params_return params25 =null;

        AslParser.block_instructions_return block_instructions26 =null;


        AslTree t_tree=null;
        AslTree id_tree=null;
        AslTree ENDFUNC16_tree=null;
        AslTree TIPO17_tree=null;
        AslTree ID18_tree=null;
        AslTree ENDFUNC22_tree=null;
        AslTree VOID23_tree=null;
        AslTree ID24_tree=null;
        AslTree ENDFUNC27_tree=null;
        RewriteRuleTokenStream stream_ENDFUNC=new RewriteRuleTokenStream(adaptor,"token ENDFUNC");
        RewriteRuleTokenStream stream_TIPO=new RewriteRuleTokenStream(adaptor,"token TIPO");
        RewriteRuleTokenStream stream_VOID=new RewriteRuleTokenStream(adaptor,"token VOID");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_return_stmt=new RewriteRuleSubtreeStream(adaptor,"rule return_stmt");
        RewriteRuleSubtreeStream stream_block_instructions=new RewriteRuleSubtreeStream(adaptor,"rule block_instructions");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:94:9: (t= ID id= ID params block_instructions return_stmt ENDFUNC -> ^( FUNC $t $id params block_instructions return_stmt ) | TIPO ID params block_instructions return_stmt ENDFUNC -> ^( FUNC TIPO ID params block_instructions return_stmt ) | VOID ID params block_instructions ENDFUNC -> ^( FUNC VOID ID params block_instructions ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt5=1;
                }
                break;
            case TIPO:
                {
                alt5=2;
                }
                break;
            case VOID:
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
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:94:11: t= ID id= ID params block_instructions return_stmt ENDFUNC
                    {
                    t=(Token)match(input,ID,FOLLOW_ID_in_func601);  
                    stream_ID.add(t);


                    id=(Token)match(input,ID,FOLLOW_ID_in_func605);  
                    stream_ID.add(id);


                    pushFollow(FOLLOW_params_in_func607);
                    params13=params();

                    state._fsp--;

                    stream_params.add(params13.getTree());

                    pushFollow(FOLLOW_block_instructions_in_func609);
                    block_instructions14=block_instructions();

                    state._fsp--;

                    stream_block_instructions.add(block_instructions14.getTree());

                    pushFollow(FOLLOW_return_stmt_in_func611);
                    return_stmt15=return_stmt();

                    state._fsp--;

                    stream_return_stmt.add(return_stmt15.getTree());

                    ENDFUNC16=(Token)match(input,ENDFUNC,FOLLOW_ENDFUNC_in_func613);  
                    stream_ENDFUNC.add(ENDFUNC16);


                    // AST REWRITE
                    // elements: params, id, return_stmt, block_instructions, t
                    // token labels: id, t
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_id=new RewriteRuleTokenStream(adaptor,"token id",id);
                    RewriteRuleTokenStream stream_t=new RewriteRuleTokenStream(adaptor,"token t",t);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 94:68: -> ^( FUNC $t $id params block_instructions return_stmt )
                    {
                        // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:94:71: ^( FUNC $t $id params block_instructions return_stmt )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(FUNC, "FUNC")
                        , root_1);

                        adaptor.addChild(root_1, stream_t.nextNode());

                        adaptor.addChild(root_1, stream_id.nextNode());

                        adaptor.addChild(root_1, stream_params.nextTree());

                        adaptor.addChild(root_1, stream_block_instructions.nextTree());

                        adaptor.addChild(root_1, stream_return_stmt.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:95:11: TIPO ID params block_instructions return_stmt ENDFUNC
                    {
                    TIPO17=(Token)match(input,TIPO,FOLLOW_TIPO_in_func643);  
                    stream_TIPO.add(TIPO17);


                    ID18=(Token)match(input,ID,FOLLOW_ID_in_func645);  
                    stream_ID.add(ID18);


                    pushFollow(FOLLOW_params_in_func647);
                    params19=params();

                    state._fsp--;

                    stream_params.add(params19.getTree());

                    pushFollow(FOLLOW_block_instructions_in_func649);
                    block_instructions20=block_instructions();

                    state._fsp--;

                    stream_block_instructions.add(block_instructions20.getTree());

                    pushFollow(FOLLOW_return_stmt_in_func651);
                    return_stmt21=return_stmt();

                    state._fsp--;

                    stream_return_stmt.add(return_stmt21.getTree());

                    ENDFUNC22=(Token)match(input,ENDFUNC,FOLLOW_ENDFUNC_in_func653);  
                    stream_ENDFUNC.add(ENDFUNC22);


                    // AST REWRITE
                    // elements: ID, TIPO, block_instructions, params, return_stmt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 95:65: -> ^( FUNC TIPO ID params block_instructions return_stmt )
                    {
                        // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:95:68: ^( FUNC TIPO ID params block_instructions return_stmt )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(FUNC, "FUNC")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_TIPO.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_params.nextTree());

                        adaptor.addChild(root_1, stream_block_instructions.nextTree());

                        adaptor.addChild(root_1, stream_return_stmt.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:96:11: VOID ID params block_instructions ENDFUNC
                    {
                    VOID23=(Token)match(input,VOID,FOLLOW_VOID_in_func681);  
                    stream_VOID.add(VOID23);


                    ID24=(Token)match(input,ID,FOLLOW_ID_in_func683);  
                    stream_ID.add(ID24);


                    pushFollow(FOLLOW_params_in_func685);
                    params25=params();

                    state._fsp--;

                    stream_params.add(params25.getTree());

                    pushFollow(FOLLOW_block_instructions_in_func687);
                    block_instructions26=block_instructions();

                    state._fsp--;

                    stream_block_instructions.add(block_instructions26.getTree());

                    ENDFUNC27=(Token)match(input,ENDFUNC,FOLLOW_ENDFUNC_in_func689);  
                    stream_ENDFUNC.add(ENDFUNC27);


                    // AST REWRITE
                    // elements: block_instructions, params, ID, VOID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 96:53: -> ^( FUNC VOID ID params block_instructions )
                    {
                        // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:96:56: ^( FUNC VOID ID params block_instructions )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(FUNC, "FUNC")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_VOID.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_params.nextTree());

                        adaptor.addChild(root_1, stream_block_instructions.nextTree());

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
    // $ANTLR end "func"


    public static class params_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "params"
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:100:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
    public final AslParser.params_return params() throws RecognitionException {
        AslParser.params_return retval = new AslParser.params_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal28=null;
        Token char_literal30=null;
        AslParser.paramlist_return paramlist29 =null;


        AslTree char_literal28_tree=null;
        AslTree char_literal30_tree=null;
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:100:9: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:100:11: '(' ( paramlist )? ')'
            {
            char_literal28=(Token)match(input,73,FOLLOW_73_in_params722);  
            stream_73.add(char_literal28);


            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:100:15: ( paramlist )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID||LA6_0==TIPO) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:100:15: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params724);
                    paramlist29=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist29.getTree());

                    }
                    break;

            }


            char_literal30=(Token)match(input,74,FOLLOW_74_in_params727);  
            stream_74.add(char_literal30);


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
            // 100:30: -> ^( PARAMS ( paramlist )? )
            {
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:100:33: ^( PARAMS ( paramlist )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:100:42: ( paramlist )?
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
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:104:1: paramlist : param ( ',' ! param )* ;
    public final AslParser.paramlist_return paramlist() throws RecognitionException {
        AslParser.paramlist_return retval = new AslParser.paramlist_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal32=null;
        AslParser.param_return param31 =null;

        AslParser.param_return param33 =null;


        AslTree char_literal32_tree=null;

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:105:9: ( param ( ',' ! param )* )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:105:11: param ( ',' ! param )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist762);
            param31=param();

            state._fsp--;

            adaptor.addChild(root_0, param31.getTree());

            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:105:17: ( ',' ! param )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==75) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:105:18: ',' ! param
            	    {
            	    char_literal32=(Token)match(input,75,FOLLOW_75_in_paramlist765); 

            	    pushFollow(FOLLOW_param_in_paramlist768);
            	    param33=param();

            	    state._fsp--;

            	    adaptor.addChild(root_0, param33.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:110:1: param : ( TIPO id= ID -> ^( PVALUE TIPO ID ) |t= ID id= ID -> ^( PVALUE $t $id) );
    public final AslParser.param_return param() throws RecognitionException {
        AslParser.param_return retval = new AslParser.param_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token id=null;
        Token t=null;
        Token TIPO34=null;

        AslTree id_tree=null;
        AslTree t_tree=null;
        AslTree TIPO34_tree=null;
        RewriteRuleTokenStream stream_TIPO=new RewriteRuleTokenStream(adaptor,"token TIPO");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:110:9: ( TIPO id= ID -> ^( PVALUE TIPO ID ) |t= ID id= ID -> ^( PVALUE $t $id) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==TIPO) ) {
                alt8=1;
            }
            else if ( (LA8_0==ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:110:11: TIPO id= ID
                    {
                    TIPO34=(Token)match(input,TIPO,FOLLOW_TIPO_in_param791);  
                    stream_TIPO.add(TIPO34);


                    id=(Token)match(input,ID,FOLLOW_ID_in_param795);  
                    stream_ID.add(id);


                    // AST REWRITE
                    // elements: ID, TIPO
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 110:22: -> ^( PVALUE TIPO ID )
                    {
                        // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:110:25: ^( PVALUE TIPO ID )
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
                case 2 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:111:11: t= ID id= ID
                    {
                    t=(Token)match(input,ID,FOLLOW_ID_in_param819);  
                    stream_ID.add(t);


                    id=(Token)match(input,ID,FOLLOW_ID_in_param823);  
                    stream_ID.add(id);


                    // AST REWRITE
                    // elements: t, id
                    // token labels: id, t
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_id=new RewriteRuleTokenStream(adaptor,"token id",id);
                    RewriteRuleTokenStream stream_t=new RewriteRuleTokenStream(adaptor,"token t",t);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 111:22: -> ^( PVALUE $t $id)
                    {
                        // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:111:25: ^( PVALUE $t $id)
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(PVALUE, "PVALUE")
                        , root_1);

                        adaptor.addChild(root_1, stream_t.nextNode());

                        adaptor.addChild(root_1, stream_id.nextNode());

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
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:115:1: block_instructions : instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) ;
    public final AslParser.block_instructions_return block_instructions() throws RecognitionException {
        AslParser.block_instructions_return retval = new AslParser.block_instructions_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal36=null;
        AslParser.instruction_return instruction35 =null;

        AslParser.instruction_return instruction37 =null;


        AslTree char_literal36_tree=null;
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:116:9: ( instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:116:11: instruction ( ';' instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions861);
            instruction35=instruction();

            state._fsp--;

            stream_instruction.add(instruction35.getTree());

            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:116:23: ( ';' instruction )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==77) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:116:24: ';' instruction
            	    {
            	    char_literal36=(Token)match(input,77,FOLLOW_77_in_block_instructions864);  
            	    stream_77.add(char_literal36);


            	    pushFollow(FOLLOW_instruction_in_block_instructions866);
            	    instruction37=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction37.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
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
            // 116:42: -> ^( LIST_INSTR ( instruction )+ )
            {
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:116:45: ^( LIST_INSTR ( instruction )+ )
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
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:120:1: instruction : ( assign | ite_stmt | while_stmt | funcall | read | write || motor | obj_fun | sleep );
    public final AslParser.instruction_return instruction() throws RecognitionException {
        AslParser.instruction_return retval = new AslParser.instruction_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.assign_return assign38 =null;

        AslParser.ite_stmt_return ite_stmt39 =null;

        AslParser.while_stmt_return while_stmt40 =null;

        AslParser.funcall_return funcall41 =null;

        AslParser.read_return read42 =null;

        AslParser.write_return write43 =null;

        AslParser.motor_return motor44 =null;

        AslParser.obj_fun_return obj_fun45 =null;

        AslParser.sleep_return sleep46 =null;



        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:121:9: ( assign | ite_stmt | while_stmt | funcall | read | write || motor | obj_fun | sleep )
            int alt10=10;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case 73:
                    {
                    alt10=4;
                    }
                    break;
                case 76:
                    {
                    int LA10_9 = input.LA(3);

                    if ( (LA10_9==AVANZAR||LA10_9==MSETTER||LA10_9==PARAR) ) {
                        alt10=8;
                    }
                    else if ( (LA10_9==ID) ) {
                        alt10=9;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 9, input);

                        throw nvae;

                    }
                    }
                    break;
                case EQUAL:
                    {
                    alt10=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;

                }

                }
                break;
            case IF:
                {
                alt10=2;
                }
                break;
            case WHILE:
                {
                alt10=3;
                }
                break;
            case READ:
                {
                alt10=5;
                }
                break;
            case WRITE:
                {
                alt10=6;
                }
                break;
            case ELSE:
            case ENDFUNC:
            case ENDIF:
            case ENDWHILE:
            case RETURN:
            case 77:
                {
                alt10=7;
                }
                break;
            case SLEEP:
                {
                alt10=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:121:11: assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction903);
                    assign38=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign38.getTree());

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:122:11: ite_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction923);
                    ite_stmt39=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt39.getTree());

                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:123:11: while_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction941);
                    while_stmt40=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt40.getTree());

                    }
                    break;
                case 4 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:124:11: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction957);
                    funcall41=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall41.getTree());

                    }
                    break;
                case 5 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:125:11: read
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_read_in_instruction976);
                    read42=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read42.getTree());

                    }
                    break;
                case 6 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:126:11: write
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_write_in_instruction998);
                    write43=write();

                    state._fsp--;

                    adaptor.addChild(root_0, write43.getTree());

                    }
                    break;
                case 7 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:128:9: 
                    {
                    root_0 = (AslTree)adaptor.nil();


                    }
                    break;
                case 8 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:128:11: motor
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_motor_in_instruction1044);
                    motor44=motor();

                    state._fsp--;

                    adaptor.addChild(root_0, motor44.getTree());

                    }
                    break;
                case 9 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:129:11: obj_fun
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_obj_fun_in_instruction1065);
                    obj_fun45=obj_fun();

                    state._fsp--;

                    adaptor.addChild(root_0, obj_fun45.getTree());

                    }
                    break;
                case 10 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:130:11: sleep
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_sleep_in_instruction1077);
                    sleep46=sleep();

                    state._fsp--;

                    adaptor.addChild(root_0, sleep46.getTree());

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


    public static class obj_fun_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "obj_fun"
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:133:1: obj_fun : ID '.' funcall -> ^( OBJ_FUNC ID funcall ) ;
    public final AslParser.obj_fun_return obj_fun() throws RecognitionException {
        AslParser.obj_fun_return retval = new AslParser.obj_fun_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID47=null;
        Token char_literal48=null;
        AslParser.funcall_return funcall49 =null;


        AslTree ID47_tree=null;
        AslTree char_literal48_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_funcall=new RewriteRuleSubtreeStream(adaptor,"rule funcall");
        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:133:9: ( ID '.' funcall -> ^( OBJ_FUNC ID funcall ) )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:133:11: ID '.' funcall
            {
            ID47=(Token)match(input,ID,FOLLOW_ID_in_obj_fun1112);  
            stream_ID.add(ID47);


            char_literal48=(Token)match(input,76,FOLLOW_76_in_obj_fun1114);  
            stream_76.add(char_literal48);


            pushFollow(FOLLOW_funcall_in_obj_fun1116);
            funcall49=funcall();

            state._fsp--;

            stream_funcall.add(funcall49.getTree());

            // AST REWRITE
            // elements: ID, funcall
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 133:26: -> ^( OBJ_FUNC ID funcall )
            {
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:133:29: ^( OBJ_FUNC ID funcall )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(OBJ_FUNC, "OBJ_FUNC")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, stream_funcall.nextTree());

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
    // $ANTLR end "obj_fun"


    public static class motor_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "motor"
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:136:1: motor : ( ID '.' AVANZAR '(' (e1= expr ( ',' e2= expr )? )? ')' -> ^( SMOTOR AVANZAR ID ( $e1)? ( $e2)? ) | ID '.' PARAR '(' ')' -> ^( SMOTOR PARAR ID ) | ID '.' MSETTER '(' expr ')' -> ^( SMOTOR MSETTER ID expr ) );
    public final AslParser.motor_return motor() throws RecognitionException {
        AslParser.motor_return retval = new AslParser.motor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID50=null;
        Token char_literal51=null;
        Token AVANZAR52=null;
        Token char_literal53=null;
        Token char_literal54=null;
        Token char_literal55=null;
        Token ID56=null;
        Token char_literal57=null;
        Token PARAR58=null;
        Token char_literal59=null;
        Token char_literal60=null;
        Token ID61=null;
        Token char_literal62=null;
        Token MSETTER63=null;
        Token char_literal64=null;
        Token char_literal66=null;
        AslParser.expr_return e1 =null;

        AslParser.expr_return e2 =null;

        AslParser.expr_return expr65 =null;


        AslTree ID50_tree=null;
        AslTree char_literal51_tree=null;
        AslTree AVANZAR52_tree=null;
        AslTree char_literal53_tree=null;
        AslTree char_literal54_tree=null;
        AslTree char_literal55_tree=null;
        AslTree ID56_tree=null;
        AslTree char_literal57_tree=null;
        AslTree PARAR58_tree=null;
        AslTree char_literal59_tree=null;
        AslTree char_literal60_tree=null;
        AslTree ID61_tree=null;
        AslTree char_literal62_tree=null;
        AslTree MSETTER63_tree=null;
        AslTree char_literal64_tree=null;
        AslTree char_literal66_tree=null;
        RewriteRuleTokenStream stream_MSETTER=new RewriteRuleTokenStream(adaptor,"token MSETTER");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_AVANZAR=new RewriteRuleTokenStream(adaptor,"token AVANZAR");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_PARAR=new RewriteRuleTokenStream(adaptor,"token PARAR");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:136:9: ( ID '.' AVANZAR '(' (e1= expr ( ',' e2= expr )? )? ')' -> ^( SMOTOR AVANZAR ID ( $e1)? ( $e2)? ) | ID '.' PARAR '(' ')' -> ^( SMOTOR PARAR ID ) | ID '.' MSETTER '(' expr ')' -> ^( SMOTOR MSETTER ID expr ) )
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==76) ) {
                    switch ( input.LA(3) ) {
                    case AVANZAR:
                        {
                        alt13=1;
                        }
                        break;
                    case PARAR:
                        {
                        alt13=2;
                        }
                        break;
                    case MSETTER:
                        {
                        alt13=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 2, input);

                        throw nvae;

                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:136:11: ID '.' AVANZAR '(' (e1= expr ( ',' e2= expr )? )? ')'
                    {
                    ID50=(Token)match(input,ID,FOLLOW_ID_in_motor1145);  
                    stream_ID.add(ID50);


                    char_literal51=(Token)match(input,76,FOLLOW_76_in_motor1147);  
                    stream_76.add(char_literal51);


                    AVANZAR52=(Token)match(input,AVANZAR,FOLLOW_AVANZAR_in_motor1149);  
                    stream_AVANZAR.add(AVANZAR52);


                    char_literal53=(Token)match(input,73,FOLLOW_73_in_motor1151);  
                    stream_73.add(char_literal53);


                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:136:30: (e1= expr ( ',' e2= expr )? )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==FALSE||LA12_0==ID||LA12_0==INT||LA12_0==MINUS||LA12_0==MOTOR||LA12_0==NOT||LA12_0==OBJECT||LA12_0==PLUS||LA12_0==SENSOR||LA12_0==TRUE||LA12_0==73) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:136:31: e1= expr ( ',' e2= expr )?
                            {
                            pushFollow(FOLLOW_expr_in_motor1156);
                            e1=expr();

                            state._fsp--;

                            stream_expr.add(e1.getTree());

                            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:136:39: ( ',' e2= expr )?
                            int alt11=2;
                            int LA11_0 = input.LA(1);

                            if ( (LA11_0==75) ) {
                                alt11=1;
                            }
                            switch (alt11) {
                                case 1 :
                                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:136:40: ',' e2= expr
                                    {
                                    char_literal54=(Token)match(input,75,FOLLOW_75_in_motor1159);  
                                    stream_75.add(char_literal54);


                                    pushFollow(FOLLOW_expr_in_motor1162);
                                    e2=expr();

                                    state._fsp--;

                                    stream_expr.add(e2.getTree());

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    char_literal55=(Token)match(input,74,FOLLOW_74_in_motor1168);  
                    stream_74.add(char_literal55);


                    // AST REWRITE
                    // elements: e1, ID, AVANZAR, e2
                    // token labels: 
                    // rule labels: retval, e1, e2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.tree:null);
                    RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 136:59: -> ^( SMOTOR AVANZAR ID ( $e1)? ( $e2)? )
                    {
                        // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:136:62: ^( SMOTOR AVANZAR ID ( $e1)? ( $e2)? )
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

                        // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:136:83: ( $e1)?
                        if ( stream_e1.hasNext() ) {
                            adaptor.addChild(root_1, stream_e1.nextTree());

                        }
                        stream_e1.reset();

                        // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:136:88: ( $e2)?
                        if ( stream_e2.hasNext() ) {
                            adaptor.addChild(root_1, stream_e2.nextTree());

                        }
                        stream_e2.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:137:11: ID '.' PARAR '(' ')'
                    {
                    ID56=(Token)match(input,ID,FOLLOW_ID_in_motor1198);  
                    stream_ID.add(ID56);


                    char_literal57=(Token)match(input,76,FOLLOW_76_in_motor1200);  
                    stream_76.add(char_literal57);


                    PARAR58=(Token)match(input,PARAR,FOLLOW_PARAR_in_motor1202);  
                    stream_PARAR.add(PARAR58);


                    char_literal59=(Token)match(input,73,FOLLOW_73_in_motor1204);  
                    stream_73.add(char_literal59);


                    char_literal60=(Token)match(input,74,FOLLOW_74_in_motor1205);  
                    stream_74.add(char_literal60);


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
                    // 137:31: -> ^( SMOTOR PARAR ID )
                    {
                        // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:137:34: ^( SMOTOR PARAR ID )
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
                case 3 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:138:11: ID '.' MSETTER '(' expr ')'
                    {
                    ID61=(Token)match(input,ID,FOLLOW_ID_in_motor1227);  
                    stream_ID.add(ID61);


                    char_literal62=(Token)match(input,76,FOLLOW_76_in_motor1229);  
                    stream_76.add(char_literal62);


                    MSETTER63=(Token)match(input,MSETTER,FOLLOW_MSETTER_in_motor1231);  
                    stream_MSETTER.add(MSETTER63);


                    char_literal64=(Token)match(input,73,FOLLOW_73_in_motor1233);  
                    stream_73.add(char_literal64);


                    pushFollow(FOLLOW_expr_in_motor1235);
                    expr65=expr();

                    state._fsp--;

                    stream_expr.add(expr65.getTree());

                    char_literal66=(Token)match(input,74,FOLLOW_74_in_motor1237);  
                    stream_74.add(char_literal66);


                    // AST REWRITE
                    // elements: expr, ID, MSETTER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 138:39: -> ^( SMOTOR MSETTER ID expr )
                    {
                        // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:138:42: ^( SMOTOR MSETTER ID expr )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(SMOTOR, "SMOTOR")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_MSETTER.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_expr.nextTree());

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
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:141:1: sleep : SLEEP '(' ( expr )? ')' -> ^( SSLEEP ( expr )? ) ;
    public final AslParser.sleep_return sleep() throws RecognitionException {
        AslParser.sleep_return retval = new AslParser.sleep_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token SLEEP67=null;
        Token char_literal68=null;
        Token char_literal70=null;
        AslParser.expr_return expr69 =null;


        AslTree SLEEP67_tree=null;
        AslTree char_literal68_tree=null;
        AslTree char_literal70_tree=null;
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_SLEEP=new RewriteRuleTokenStream(adaptor,"token SLEEP");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:141:9: ( SLEEP '(' ( expr )? ')' -> ^( SSLEEP ( expr )? ) )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:141:11: SLEEP '(' ( expr )? ')'
            {
            SLEEP67=(Token)match(input,SLEEP,FOLLOW_SLEEP_in_sleep1276);  
            stream_SLEEP.add(SLEEP67);


            char_literal68=(Token)match(input,73,FOLLOW_73_in_sleep1278);  
            stream_73.add(char_literal68);


            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:141:21: ( expr )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==FALSE||LA14_0==ID||LA14_0==INT||LA14_0==MINUS||LA14_0==MOTOR||LA14_0==NOT||LA14_0==OBJECT||LA14_0==PLUS||LA14_0==SENSOR||LA14_0==TRUE||LA14_0==73) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:141:21: expr
                    {
                    pushFollow(FOLLOW_expr_in_sleep1280);
                    expr69=expr();

                    state._fsp--;

                    stream_expr.add(expr69.getTree());

                    }
                    break;

            }


            char_literal70=(Token)match(input,74,FOLLOW_74_in_sleep1283);  
            stream_74.add(char_literal70);


            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 141:31: -> ^( SSLEEP ( expr )? )
            {
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:141:34: ^( SSLEEP ( expr )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(SSLEEP, "SSLEEP")
                , root_1);

                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:141:43: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

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
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:145:1: assign : esq eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] esq expr ) ;
    public final AslParser.assign_return assign() throws RecognitionException {
        AslParser.assign_return retval = new AslParser.assign_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        AslParser.esq_return esq71 =null;

        AslParser.expr_return expr72 =null;


        AslTree eq_tree=null;
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_esq=new RewriteRuleSubtreeStream(adaptor,"rule esq");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:145:9: ( esq eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] esq expr ) )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:145:11: esq eq= EQUAL expr
            {
            pushFollow(FOLLOW_esq_in_assign1311);
            esq71=esq();

            state._fsp--;

            stream_esq.add(esq71.getTree());

            eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign1315);  
            stream_EQUAL.add(eq);


            pushFollow(FOLLOW_expr_in_assign1317);
            expr72=expr();

            state._fsp--;

            stream_expr.add(expr72.getTree());

            // AST REWRITE
            // elements: esq, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 145:29: -> ^( ASSIGN[$eq,\":=\"] esq expr )
            {
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:145:32: ^( ASSIGN[$eq,\":=\"] esq expr )
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
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:148:1: esq : ID ;
    public final AslParser.esq_return esq() throws RecognitionException {
        AslParser.esq_return retval = new AslParser.esq_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID73=null;

        AslTree ID73_tree=null;

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:148:9: ( ID )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:148:11: ID
            {
            root_0 = (AslTree)adaptor.nil();


            ID73=(Token)match(input,ID,FOLLOW_ID_in_esq1357); 
            ID73_tree = 
            (AslTree)adaptor.create(ID73)
            ;
            adaptor.addChild(root_0, ID73_tree);


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
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:152:1: ite_stmt : IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !;
    public final AslParser.ite_stmt_return ite_stmt() throws RecognitionException {
        AslParser.ite_stmt_return retval = new AslParser.ite_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token IF74=null;
        Token THEN76=null;
        Token ELSE78=null;
        Token ENDIF80=null;
        AslParser.expr_return expr75 =null;

        AslParser.block_instructions_return block_instructions77 =null;

        AslParser.block_instructions_return block_instructions79 =null;


        AslTree IF74_tree=null;
        AslTree THEN76_tree=null;
        AslTree ELSE78_tree=null;
        AslTree ENDIF80_tree=null;

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:152:9: ( IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !)
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:152:11: IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !
            {
            root_0 = (AslTree)adaptor.nil();


            IF74=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt1374); 
            IF74_tree = 
            (AslTree)adaptor.create(IF74)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF74_tree, root_0);


            pushFollow(FOLLOW_expr_in_ite_stmt1377);
            expr75=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr75.getTree());

            THEN76=(Token)match(input,THEN,FOLLOW_THEN_in_ite_stmt1379); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt1382);
            block_instructions77=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions77.getTree());

            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:152:45: ( ELSE ! block_instructions )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==ELSE) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:152:46: ELSE ! block_instructions
                    {
                    ELSE78=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt1385); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt1388);
                    block_instructions79=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions79.getTree());

                    }
                    break;

            }


            ENDIF80=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ite_stmt1392); 

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
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:156:1: while_stmt : WHILE ^ expr DO ! block_instructions ENDWHILE !;
    public final AslParser.while_stmt_return while_stmt() throws RecognitionException {
        AslParser.while_stmt_return retval = new AslParser.while_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WHILE81=null;
        Token DO83=null;
        Token ENDWHILE85=null;
        AslParser.expr_return expr82 =null;

        AslParser.block_instructions_return block_instructions84 =null;


        AslTree WHILE81_tree=null;
        AslTree DO83_tree=null;
        AslTree ENDWHILE85_tree=null;

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:157:9: ( WHILE ^ expr DO ! block_instructions ENDWHILE !)
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:157:11: WHILE ^ expr DO ! block_instructions ENDWHILE !
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE81=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt1419); 
            WHILE81_tree = 
            (AslTree)adaptor.create(WHILE81)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE81_tree, root_0);


            pushFollow(FOLLOW_expr_in_while_stmt1422);
            expr82=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr82.getTree());

            DO83=(Token)match(input,DO,FOLLOW_DO_in_while_stmt1424); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt1427);
            block_instructions84=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions84.getTree());

            ENDWHILE85=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_while_stmt1429); 

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
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:161:1: return_stmt : RETURN ^ expr ';' !;
    public final AslParser.return_stmt_return return_stmt() throws RecognitionException {
        AslParser.return_stmt_return retval = new AslParser.return_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RETURN86=null;
        Token char_literal88=null;
        AslParser.expr_return expr87 =null;


        AslTree RETURN86_tree=null;
        AslTree char_literal88_tree=null;

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:162:9: ( RETURN ^ expr ';' !)
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:162:11: RETURN ^ expr ';' !
            {
            root_0 = (AslTree)adaptor.nil();


            RETURN86=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt1456); 
            RETURN86_tree = 
            (AslTree)adaptor.create(RETURN86)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RETURN86_tree, root_0);


            pushFollow(FOLLOW_expr_in_return_stmt1459);
            expr87=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr87.getTree());

            char_literal88=(Token)match(input,77,FOLLOW_77_in_return_stmt1461); 

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
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:166:1: read : READ ^ esq ;
    public final AslParser.read_return read() throws RecognitionException {
        AslParser.read_return retval = new AslParser.read_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token READ89=null;
        AslParser.esq_return esq90 =null;


        AslTree READ89_tree=null;

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:166:9: ( READ ^ esq )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:166:11: READ ^ esq
            {
            root_0 = (AslTree)adaptor.nil();


            READ89=(Token)match(input,READ,FOLLOW_READ_in_read1483); 
            READ89_tree = 
            (AslTree)adaptor.create(READ89)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(READ89_tree, root_0);


            pushFollow(FOLLOW_esq_in_read1486);
            esq90=esq();

            state._fsp--;

            adaptor.addChild(root_0, esq90.getTree());

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
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:170:1: write : WRITE ^ ( expr | STRING ) ;
    public final AslParser.write_return write() throws RecognitionException {
        AslParser.write_return retval = new AslParser.write_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WRITE91=null;
        Token STRING93=null;
        AslParser.expr_return expr92 =null;


        AslTree WRITE91_tree=null;
        AslTree STRING93_tree=null;

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:170:9: ( WRITE ^ ( expr | STRING ) )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:170:11: WRITE ^ ( expr | STRING )
            {
            root_0 = (AslTree)adaptor.nil();


            WRITE91=(Token)match(input,WRITE,FOLLOW_WRITE_in_write1506); 
            WRITE91_tree = 
            (AslTree)adaptor.create(WRITE91)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WRITE91_tree, root_0);


            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:170:18: ( expr | STRING )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==FALSE||LA16_0==ID||LA16_0==INT||LA16_0==MINUS||LA16_0==MOTOR||LA16_0==NOT||LA16_0==OBJECT||LA16_0==PLUS||LA16_0==SENSOR||LA16_0==TRUE||LA16_0==73) ) {
                alt16=1;
            }
            else if ( (LA16_0==STRING) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:170:19: expr
                    {
                    pushFollow(FOLLOW_expr_in_write1510);
                    expr92=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr92.getTree());

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:170:26: STRING
                    {
                    STRING93=(Token)match(input,STRING,FOLLOW_STRING_in_write1514); 
                    STRING93_tree = 
                    (AslTree)adaptor.create(STRING93)
                    ;
                    adaptor.addChild(root_0, STRING93_tree);


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
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:174:1: expr : boolterm ( OR ^ boolterm )* ;
    public final AslParser.expr_return expr() throws RecognitionException {
        AslParser.expr_return retval = new AslParser.expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OR95=null;
        AslParser.boolterm_return boolterm94 =null;

        AslParser.boolterm_return boolterm96 =null;


        AslTree OR95_tree=null;

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:174:9: ( boolterm ( OR ^ boolterm )* )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:174:11: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr1537);
            boolterm94=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm94.getTree());

            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:174:20: ( OR ^ boolterm )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==OR) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:174:21: OR ^ boolterm
            	    {
            	    OR95=(Token)match(input,OR,FOLLOW_OR_in_expr1540); 
            	    OR95_tree = 
            	    (AslTree)adaptor.create(OR95)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR95_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr1543);
            	    boolterm96=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm96.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:177:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final AslParser.boolterm_return boolterm() throws RecognitionException {
        AslParser.boolterm_return retval = new AslParser.boolterm_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token AND98=null;
        AslParser.boolfact_return boolfact97 =null;

        AslParser.boolfact_return boolfact99 =null;


        AslTree AND98_tree=null;

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:177:9: ( boolfact ( AND ^ boolfact )* )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:177:11: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm1561);
            boolfact97=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact97.getTree());

            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:177:20: ( AND ^ boolfact )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==AND) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:177:21: AND ^ boolfact
            	    {
            	    AND98=(Token)match(input,AND,FOLLOW_AND_in_boolterm1564); 
            	    AND98_tree = 
            	    (AslTree)adaptor.create(AND98)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND98_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm1567);
            	    boolfact99=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact99.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:180:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final AslParser.boolfact_return boolfact() throws RecognitionException {
        AslParser.boolfact_return retval = new AslParser.boolfact_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EQUAL101=null;
        Token NOT_EQUAL102=null;
        Token LT103=null;
        Token LE104=null;
        Token GT105=null;
        Token GE106=null;
        AslParser.num_expr_return num_expr100 =null;

        AslParser.num_expr_return num_expr107 =null;


        AslTree EQUAL101_tree=null;
        AslTree NOT_EQUAL102_tree=null;
        AslTree LT103_tree=null;
        AslTree LE104_tree=null;
        AslTree GT105_tree=null;
        AslTree GE106_tree=null;

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:180:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:180:11: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact1585);
            num_expr100=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr100.getTree());

            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:180:20: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==EQUAL||LA20_0==GE||LA20_0==GT||LA20_0==LE||LA20_0==LT||LA20_0==NOT_EQUAL) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:180:21: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:180:21: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt19=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt19=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt19=2;
                        }
                        break;
                    case LT:
                        {
                        alt19=3;
                        }
                        break;
                    case LE:
                        {
                        alt19=4;
                        }
                        break;
                    case GT:
                        {
                        alt19=5;
                        }
                        break;
                    case GE:
                        {
                        alt19=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;

                    }

                    switch (alt19) {
                        case 1 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:180:22: EQUAL ^
                            {
                            EQUAL101=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact1589); 
                            EQUAL101_tree = 
                            (AslTree)adaptor.create(EQUAL101)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(EQUAL101_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:180:31: NOT_EQUAL ^
                            {
                            NOT_EQUAL102=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact1594); 
                            NOT_EQUAL102_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL102)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL102_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:180:44: LT ^
                            {
                            LT103=(Token)match(input,LT,FOLLOW_LT_in_boolfact1599); 
                            LT103_tree = 
                            (AslTree)adaptor.create(LT103)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT103_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:180:50: LE ^
                            {
                            LE104=(Token)match(input,LE,FOLLOW_LE_in_boolfact1604); 
                            LE104_tree = 
                            (AslTree)adaptor.create(LE104)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE104_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:180:56: GT ^
                            {
                            GT105=(Token)match(input,GT,FOLLOW_GT_in_boolfact1609); 
                            GT105_tree = 
                            (AslTree)adaptor.create(GT105)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT105_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:180:62: GE ^
                            {
                            GE106=(Token)match(input,GE,FOLLOW_GE_in_boolfact1614); 
                            GE106_tree = 
                            (AslTree)adaptor.create(GE106)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE106_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact1618);
                    num_expr107=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr107.getTree());

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
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:183:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final AslParser.num_expr_return num_expr() throws RecognitionException {
        AslParser.num_expr_return retval = new AslParser.num_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PLUS109=null;
        Token MINUS110=null;
        AslParser.term_return term108 =null;

        AslParser.term_return term111 =null;


        AslTree PLUS109_tree=null;
        AslTree MINUS110_tree=null;

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:183:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:183:11: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr1636);
            term108=term();

            state._fsp--;

            adaptor.addChild(root_0, term108.getTree());

            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:183:16: ( ( PLUS ^| MINUS ^) term )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==MINUS||LA22_0==PLUS) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:183:18: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:183:18: ( PLUS ^| MINUS ^)
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==PLUS) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==MINUS) ) {
            	        alt21=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:183:19: PLUS ^
            	            {
            	            PLUS109=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr1641); 
            	            PLUS109_tree = 
            	            (AslTree)adaptor.create(PLUS109)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS109_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:183:27: MINUS ^
            	            {
            	            MINUS110=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr1646); 
            	            MINUS110_tree = 
            	            (AslTree)adaptor.create(MINUS110)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS110_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr1650);
            	    term111=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term111.getTree());

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
    // $ANTLR end "num_expr"


    public static class term_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:186:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final AslParser.term_return term() throws RecognitionException {
        AslParser.term_return retval = new AslParser.term_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MUL113=null;
        Token DIV114=null;
        Token MOD115=null;
        AslParser.factor_return factor112 =null;

        AslParser.factor_return factor116 =null;


        AslTree MUL113_tree=null;
        AslTree DIV114_tree=null;
        AslTree MOD115_tree=null;

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:186:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:186:11: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1672);
            factor112=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor112.getTree());

            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:186:18: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==DIV||LA24_0==MOD||LA24_0==MUL) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:186:20: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:186:20: ( MUL ^| DIV ^| MOD ^)
            	    int alt23=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt23=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt23=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt23=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt23) {
            	        case 1 :
            	            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:186:21: MUL ^
            	            {
            	            MUL113=(Token)match(input,MUL,FOLLOW_MUL_in_term1677); 
            	            MUL113_tree = 
            	            (AslTree)adaptor.create(MUL113)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MUL113_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:186:28: DIV ^
            	            {
            	            DIV114=(Token)match(input,DIV,FOLLOW_DIV_in_term1682); 
            	            DIV114_tree = 
            	            (AslTree)adaptor.create(DIV114)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV114_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:186:35: MOD ^
            	            {
            	            MOD115=(Token)match(input,MOD,FOLLOW_MOD_in_term1687); 
            	            MOD115_tree = 
            	            (AslTree)adaptor.create(MOD115)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD115_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1691);
            	    factor116=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor116.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:189:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final AslParser.factor_return factor() throws RecognitionException {
        AslParser.factor_return retval = new AslParser.factor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOT117=null;
        Token PLUS118=null;
        Token MINUS119=null;
        AslParser.atom_return atom120 =null;


        AslTree NOT117_tree=null;
        AslTree PLUS118_tree=null;
        AslTree MINUS119_tree=null;

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:189:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:189:11: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AslTree)adaptor.nil();


            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:189:11: ( NOT ^| PLUS ^| MINUS ^)?
            int alt25=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt25=1;
                    }
                    break;
                case PLUS:
                    {
                    alt25=2;
                    }
                    break;
                case MINUS:
                    {
                    alt25=3;
                    }
                    break;
            }

            switch (alt25) {
                case 1 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:189:12: NOT ^
                    {
                    NOT117=(Token)match(input,NOT,FOLLOW_NOT_in_factor1712); 
                    NOT117_tree = 
                    (AslTree)adaptor.create(NOT117)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOT117_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:189:19: PLUS ^
                    {
                    PLUS118=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1717); 
                    PLUS118_tree = 
                    (AslTree)adaptor.create(PLUS118)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLUS118_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:189:27: MINUS ^
                    {
                    MINUS119=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1722); 
                    MINUS119_tree = 
                    (AslTree)adaptor.create(MINUS119)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MINUS119_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1727);
            atom120=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom120.getTree());

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
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:195:1: atom : ( ID | INT |m= MOTOR '(' b= INT ')' -> ^( DMOTOR[m, \"MOTOR\"+$b.text] ) |s= SENSOR '(' b= INT ')' -> ^( DSENSOR[s, $s.text+$b.text] ) | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | obj_fun | '(' ! expr ')' !| ID '.' (b= GETCOLOR |b= GETULTRA |b= GETTOUCH ) '(' ')' -> ^( GSENSOR $b ID ) | ID '.' b= MGETTER '(' ')' -> ^( GMOTOR $b ID ) | OBJECT '(' ID ')' -> ^( OBJECT ID ) );
    public final AslParser.atom_return atom() throws RecognitionException {
        AslParser.atom_return retval = new AslParser.atom_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token m=null;
        Token b=null;
        Token s=null;
        Token ID121=null;
        Token INT122=null;
        Token char_literal123=null;
        Token char_literal124=null;
        Token char_literal125=null;
        Token char_literal126=null;
        Token char_literal129=null;
        Token char_literal131=null;
        Token ID132=null;
        Token char_literal133=null;
        Token char_literal134=null;
        Token char_literal135=null;
        Token ID136=null;
        Token char_literal137=null;
        Token char_literal138=null;
        Token char_literal139=null;
        Token OBJECT140=null;
        Token char_literal141=null;
        Token ID142=null;
        Token char_literal143=null;
        AslParser.funcall_return funcall127 =null;

        AslParser.obj_fun_return obj_fun128 =null;

        AslParser.expr_return expr130 =null;


        AslTree m_tree=null;
        AslTree b_tree=null;
        AslTree s_tree=null;
        AslTree ID121_tree=null;
        AslTree INT122_tree=null;
        AslTree char_literal123_tree=null;
        AslTree char_literal124_tree=null;
        AslTree char_literal125_tree=null;
        AslTree char_literal126_tree=null;
        AslTree char_literal129_tree=null;
        AslTree char_literal131_tree=null;
        AslTree ID132_tree=null;
        AslTree char_literal133_tree=null;
        AslTree char_literal134_tree=null;
        AslTree char_literal135_tree=null;
        AslTree ID136_tree=null;
        AslTree char_literal137_tree=null;
        AslTree char_literal138_tree=null;
        AslTree char_literal139_tree=null;
        AslTree OBJECT140_tree=null;
        AslTree char_literal141_tree=null;
        AslTree ID142_tree=null;
        AslTree char_literal143_tree=null;
        RewriteRuleTokenStream stream_SENSOR=new RewriteRuleTokenStream(adaptor,"token SENSOR");
        RewriteRuleTokenStream stream_GETCOLOR=new RewriteRuleTokenStream(adaptor,"token GETCOLOR");
        RewriteRuleTokenStream stream_OBJECT=new RewriteRuleTokenStream(adaptor,"token OBJECT");
        RewriteRuleTokenStream stream_GETTOUCH=new RewriteRuleTokenStream(adaptor,"token GETTOUCH");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_MOTOR=new RewriteRuleTokenStream(adaptor,"token MOTOR");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_MGETTER=new RewriteRuleTokenStream(adaptor,"token MGETTER");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_GETULTRA=new RewriteRuleTokenStream(adaptor,"token GETULTRA");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:195:9: ( ID | INT |m= MOTOR '(' b= INT ')' -> ^( DMOTOR[m, \"MOTOR\"+$b.text] ) |s= SENSOR '(' b= INT ')' -> ^( DSENSOR[s, $s.text+$b.text] ) | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | obj_fun | '(' ! expr ')' !| ID '.' (b= GETCOLOR |b= GETULTRA |b= GETTOUCH ) '(' ')' -> ^( GSENSOR $b ID ) | ID '.' b= MGETTER '(' ')' -> ^( GMOTOR $b ID ) | OBJECT '(' ID ')' -> ^( OBJECT ID ) )
            int alt28=11;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case 73:
                    {
                    alt28=6;
                    }
                    break;
                case 76:
                    {
                    switch ( input.LA(3) ) {
                    case MGETTER:
                        {
                        alt28=10;
                        }
                        break;
                    case ID:
                        {
                        alt28=7;
                        }
                        break;
                    case GETCOLOR:
                    case GETTOUCH:
                    case GETULTRA:
                        {
                        alt28=9;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 9, input);

                        throw nvae;

                    }

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
                case RETURN:
                case THEN:
                case 74:
                case 75:
                case 77:
                    {
                    alt28=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;

                }

                }
                break;
            case INT:
                {
                alt28=2;
                }
                break;
            case MOTOR:
                {
                alt28=3;
                }
                break;
            case SENSOR:
                {
                alt28=4;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt28=5;
                }
                break;
            case 73:
                {
                alt28=8;
                }
                break;
            case OBJECT:
                {
                alt28=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }

            switch (alt28) {
                case 1 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:195:11: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID121=(Token)match(input,ID,FOLLOW_ID_in_atom1750); 
                    ID121_tree = 
                    (AslTree)adaptor.create(ID121)
                    ;
                    adaptor.addChild(root_0, ID121_tree);


                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:196:11: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT122=(Token)match(input,INT,FOLLOW_INT_in_atom1763); 
                    INT122_tree = 
                    (AslTree)adaptor.create(INT122)
                    ;
                    adaptor.addChild(root_0, INT122_tree);


                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:197:11: m= MOTOR '(' b= INT ')'
                    {
                    m=(Token)match(input,MOTOR,FOLLOW_MOTOR_in_atom1777);  
                    stream_MOTOR.add(m);


                    char_literal123=(Token)match(input,73,FOLLOW_73_in_atom1779);  
                    stream_73.add(char_literal123);


                    b=(Token)match(input,INT,FOLLOW_INT_in_atom1783);  
                    stream_INT.add(b);


                    char_literal124=(Token)match(input,74,FOLLOW_74_in_atom1785);  
                    stream_74.add(char_literal124);


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
                    // 197:33: -> ^( DMOTOR[m, \"MOTOR\"+$b.text] )
                    {
                        // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:197:36: ^( DMOTOR[m, \"MOTOR\"+$b.text] )
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
                case 4 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:198:11: s= SENSOR '(' b= INT ')'
                    {
                    s=(Token)match(input,SENSOR,FOLLOW_SENSOR_in_atom1806);  
                    stream_SENSOR.add(s);


                    char_literal125=(Token)match(input,73,FOLLOW_73_in_atom1808);  
                    stream_73.add(char_literal125);


                    b=(Token)match(input,INT,FOLLOW_INT_in_atom1812);  
                    stream_INT.add(b);


                    char_literal126=(Token)match(input,74,FOLLOW_74_in_atom1814);  
                    stream_74.add(char_literal126);


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
                    // 198:34: -> ^( DSENSOR[s, $s.text+$b.text] )
                    {
                        // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:198:37: ^( DSENSOR[s, $s.text+$b.text] )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(DSENSOR, s, (s!=null?s.getText():null)+(b!=null?b.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:199:11: (b= TRUE |b= FALSE )
                    {
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:199:11: (b= TRUE |b= FALSE )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==TRUE) ) {
                        alt26=1;
                    }
                    else if ( (LA26_0==FALSE) ) {
                        alt26=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;

                    }
                    switch (alt26) {
                        case 1 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:199:12: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1836);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:199:21: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1842);  
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
                    // 199:30: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:199:33: ^( BOOLEAN[$b,$b.text] )
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
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:200:11: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom1862);
                    funcall127=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall127.getTree());

                    }
                    break;
                case 7 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:201:11: obj_fun
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_obj_fun_in_atom1874);
                    obj_fun128=obj_fun();

                    state._fsp--;

                    adaptor.addChild(root_0, obj_fun128.getTree());

                    }
                    break;
                case 8 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:202:11: '(' ! expr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    char_literal129=(Token)match(input,73,FOLLOW_73_in_atom1886); 

                    pushFollow(FOLLOW_expr_in_atom1889);
                    expr130=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr130.getTree());

                    char_literal131=(Token)match(input,74,FOLLOW_74_in_atom1891); 

                    }
                    break;
                case 9 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:203:11: ID '.' (b= GETCOLOR |b= GETULTRA |b= GETTOUCH ) '(' ')'
                    {
                    ID132=(Token)match(input,ID,FOLLOW_ID_in_atom1904);  
                    stream_ID.add(ID132);


                    char_literal133=(Token)match(input,76,FOLLOW_76_in_atom1906);  
                    stream_76.add(char_literal133);


                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:203:18: (b= GETCOLOR |b= GETULTRA |b= GETTOUCH )
                    int alt27=3;
                    switch ( input.LA(1) ) {
                    case GETCOLOR:
                        {
                        alt27=1;
                        }
                        break;
                    case GETULTRA:
                        {
                        alt27=2;
                        }
                        break;
                    case GETTOUCH:
                        {
                        alt27=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;

                    }

                    switch (alt27) {
                        case 1 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:203:19: b= GETCOLOR
                            {
                            b=(Token)match(input,GETCOLOR,FOLLOW_GETCOLOR_in_atom1911);  
                            stream_GETCOLOR.add(b);


                            }
                            break;
                        case 2 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:203:32: b= GETULTRA
                            {
                            b=(Token)match(input,GETULTRA,FOLLOW_GETULTRA_in_atom1917);  
                            stream_GETULTRA.add(b);


                            }
                            break;
                        case 3 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:203:45: b= GETTOUCH
                            {
                            b=(Token)match(input,GETTOUCH,FOLLOW_GETTOUCH_in_atom1923);  
                            stream_GETTOUCH.add(b);


                            }
                            break;

                    }


                    char_literal134=(Token)match(input,73,FOLLOW_73_in_atom1926);  
                    stream_73.add(char_literal134);


                    char_literal135=(Token)match(input,74,FOLLOW_74_in_atom1928);  
                    stream_74.add(char_literal135);


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
                    // 203:65: -> ^( GSENSOR $b ID )
                    {
                        // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:203:68: ^( GSENSOR $b ID )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(GSENSOR, "GSENSOR")
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
                case 10 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:204:11: ID '.' b= MGETTER '(' ')'
                    {
                    ID136=(Token)match(input,ID,FOLLOW_ID_in_atom1951);  
                    stream_ID.add(ID136);


                    char_literal137=(Token)match(input,76,FOLLOW_76_in_atom1952);  
                    stream_76.add(char_literal137);


                    b=(Token)match(input,MGETTER,FOLLOW_MGETTER_in_atom1956);  
                    stream_MGETTER.add(b);


                    char_literal138=(Token)match(input,73,FOLLOW_73_in_atom1958);  
                    stream_73.add(char_literal138);


                    char_literal139=(Token)match(input,74,FOLLOW_74_in_atom1960);  
                    stream_74.add(char_literal139);


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
                    // 204:35: -> ^( GMOTOR $b ID )
                    {
                        // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:204:38: ^( GMOTOR $b ID )
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
                case 11 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:205:11: OBJECT '(' ID ')'
                    {
                    OBJECT140=(Token)match(input,OBJECT,FOLLOW_OBJECT_in_atom1983);  
                    stream_OBJECT.add(OBJECT140);


                    char_literal141=(Token)match(input,73,FOLLOW_73_in_atom1985);  
                    stream_73.add(char_literal141);


                    ID142=(Token)match(input,ID,FOLLOW_ID_in_atom1987);  
                    stream_ID.add(ID142);


                    char_literal143=(Token)match(input,74,FOLLOW_74_in_atom1989);  
                    stream_74.add(char_literal143);


                    // AST REWRITE
                    // elements: ID, OBJECT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 205:28: -> ^( OBJECT ID )
                    {
                        // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:205:31: ^( OBJECT ID )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        stream_OBJECT.nextNode()
                        , root_1);

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
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:209:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final AslParser.funcall_return funcall() throws RecognitionException {
        AslParser.funcall_return retval = new AslParser.funcall_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID144=null;
        Token char_literal145=null;
        Token char_literal147=null;
        AslParser.expr_list_return expr_list146 =null;


        AslTree ID144_tree=null;
        AslTree char_literal145_tree=null;
        AslTree char_literal147_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:209:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:209:11: ID '(' ( expr_list )? ')'
            {
            ID144=(Token)match(input,ID,FOLLOW_ID_in_funcall2015);  
            stream_ID.add(ID144);


            char_literal145=(Token)match(input,73,FOLLOW_73_in_funcall2017);  
            stream_73.add(char_literal145);


            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:209:18: ( expr_list )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==FALSE||LA29_0==ID||LA29_0==INT||LA29_0==MINUS||LA29_0==MOTOR||LA29_0==NOT||LA29_0==OBJECT||LA29_0==PLUS||LA29_0==SENSOR||LA29_0==TRUE||LA29_0==73) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:209:18: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall2019);
                    expr_list146=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list146.getTree());

                    }
                    break;

            }


            char_literal147=(Token)match(input,74,FOLLOW_74_in_funcall2022);  
            stream_74.add(char_literal147);


            // AST REWRITE
            // elements: expr_list, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 209:33: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:209:36: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:209:49: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:209:59: ( expr_list )?
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
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:213:1: expr_list : expr ( ',' ! expr )* ;
    public final AslParser.expr_list_return expr_list() throws RecognitionException {
        AslParser.expr_list_return retval = new AslParser.expr_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal149=null;
        AslParser.expr_return expr148 =null;

        AslParser.expr_return expr150 =null;


        AslTree char_literal149_tree=null;

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:214:9: ( expr ( ',' ! expr )* )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:214:11: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list2063);
            expr148=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr148.getTree());

            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:214:16: ( ',' ! expr )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==75) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:214:17: ',' ! expr
            	    {
            	    char_literal149=(Token)match(input,75,FOLLOW_75_in_expr_list2066); 

            	    pushFollow(FOLLOW_expr_in_expr_list2069);
            	    expr150=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr150.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
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


 

    public static final BitSet FOLLOW_list_includes_in_prog317 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_list_globals_in_prog319 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_list_funcs_in_prog321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_include_in_list_includes358 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_global_in_list_globals398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_list_globals400 = new BitSet(new long[]{0x0000000080000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_func_in_list_funcs440 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_EOF_in_list_funcs443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCLUDE_in_include481 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ID_in_include485 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_DIV_in_include486 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ID_in_include489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_global526 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ID_in_global530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIPO_in_global554 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ID_in_global556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_func601 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ID_in_func605 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_params_in_func607 = new BitSet(new long[]{0x4800000180000000L,0x00000000000020C0L});
    public static final BitSet FOLLOW_block_instructions_in_func609 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_return_stmt_in_func611 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIPO_in_func643 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ID_in_func645 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_params_in_func647 = new BitSet(new long[]{0x4800000180000000L,0x00000000000020C0L});
    public static final BitSet FOLLOW_block_instructions_in_func649 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_return_stmt_in_func651 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_func681 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ID_in_func683 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_params_in_func685 = new BitSet(new long[]{0x4800000180000000L,0x00000000000020C0L});
    public static final BitSet FOLLOW_block_instructions_in_func687 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_params722 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000408L});
    public static final BitSet FOLLOW_paramlist_in_params724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_params727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist762 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_paramlist765 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_param_in_paramlist768 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_TIPO_in_param791 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ID_in_param795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param819 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ID_in_param823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions861 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_block_instructions864 = new BitSet(new long[]{0x4800000180000000L,0x00000000000020C0L});
    public static final BitSet FOLLOW_instruction_in_block_instructions866 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_assign_in_instruction903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_instruction998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_motor_in_instruction1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_fun_in_instruction1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sleep_in_instruction1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_obj_fun1112 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_obj_fun1114 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_funcall_in_obj_fun1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_motor1145 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_motor1147 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_AVANZAR_in_motor1149 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_motor1151 = new BitSet(new long[]{0x2085280880100000L,0x0000000000000610L});
    public static final BitSet FOLLOW_expr_in_motor1156 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_75_in_motor1159 = new BitSet(new long[]{0x2085280880100000L,0x0000000000000210L});
    public static final BitSet FOLLOW_expr_in_motor1162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_motor1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_motor1198 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_motor1200 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_PARAR_in_motor1202 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_motor1204 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_motor1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_motor1227 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_motor1229 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_MSETTER_in_motor1231 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_motor1233 = new BitSet(new long[]{0x2085280880100000L,0x0000000000000210L});
    public static final BitSet FOLLOW_expr_in_motor1235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_motor1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLEEP_in_sleep1276 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_sleep1278 = new BitSet(new long[]{0x2085280880100000L,0x0000000000000610L});
    public static final BitSet FOLLOW_expr_in_sleep1280 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_sleep1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_esq_in_assign1311 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUAL_in_assign1315 = new BitSet(new long[]{0x2085280880100000L,0x0000000000000210L});
    public static final BitSet FOLLOW_expr_in_assign1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_esq1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt1374 = new BitSet(new long[]{0x2085280880100000L,0x0000000000000210L});
    public static final BitSet FOLLOW_expr_in_ite_stmt1377 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_THEN_in_ite_stmt1379 = new BitSet(new long[]{0x4800000180000000L,0x00000000000020C0L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt1382 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt1385 = new BitSet(new long[]{0x4800000180000000L,0x00000000000020C0L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt1388 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ENDIF_in_ite_stmt1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt1419 = new BitSet(new long[]{0x2085280880100000L,0x0000000000000210L});
    public static final BitSet FOLLOW_expr_in_while_stmt1422 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_DO_in_while_stmt1424 = new BitSet(new long[]{0x4800000180000000L,0x00000000000020C0L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt1427 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ENDWHILE_in_while_stmt1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt1456 = new BitSet(new long[]{0x2085280880100000L,0x0000000000000210L});
    public static final BitSet FOLLOW_expr_in_return_stmt1459 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_return_stmt1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read1483 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_esq_in_read1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write1506 = new BitSet(new long[]{0x2085280880100000L,0x0000000000000212L});
    public static final BitSet FOLLOW_expr_in_write1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_write1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr1537 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_OR_in_expr1540 = new BitSet(new long[]{0x2085280880100000L,0x0000000000000210L});
    public static final BitSet FOLLOW_boolterm_in_expr1543 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1561 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm1564 = new BitSet(new long[]{0x2085280880100000L,0x0000000000000210L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1567 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1585 = new BitSet(new long[]{0x0002021040840002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact1589 = new BitSet(new long[]{0x2085280880100000L,0x0000000000000210L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact1594 = new BitSet(new long[]{0x2085280880100000L,0x0000000000000210L});
    public static final BitSet FOLLOW_LT_in_boolfact1599 = new BitSet(new long[]{0x2085280880100000L,0x0000000000000210L});
    public static final BitSet FOLLOW_LE_in_boolfact1604 = new BitSet(new long[]{0x2085280880100000L,0x0000000000000210L});
    public static final BitSet FOLLOW_GT_in_boolfact1609 = new BitSet(new long[]{0x2085280880100000L,0x0000000000000210L});
    public static final BitSet FOLLOW_GE_in_boolfact1614 = new BitSet(new long[]{0x2085280880100000L,0x0000000000000210L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr1636 = new BitSet(new long[]{0x0080080000000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr1641 = new BitSet(new long[]{0x2085280880100000L,0x0000000000000210L});
    public static final BitSet FOLLOW_MINUS_in_num_expr1646 = new BitSet(new long[]{0x2085280880100000L,0x0000000000000210L});
    public static final BitSet FOLLOW_term_in_num_expr1650 = new BitSet(new long[]{0x0080080000000002L});
    public static final BitSet FOLLOW_factor_in_term1672 = new BitSet(new long[]{0x0000900000000402L});
    public static final BitSet FOLLOW_MUL_in_term1677 = new BitSet(new long[]{0x2085280880100000L,0x0000000000000210L});
    public static final BitSet FOLLOW_DIV_in_term1682 = new BitSet(new long[]{0x2085280880100000L,0x0000000000000210L});
    public static final BitSet FOLLOW_MOD_in_term1687 = new BitSet(new long[]{0x2085280880100000L,0x0000000000000210L});
    public static final BitSet FOLLOW_factor_in_term1691 = new BitSet(new long[]{0x0000900000000402L});
    public static final BitSet FOLLOW_NOT_in_factor1712 = new BitSet(new long[]{0x2004200880100000L,0x0000000000000210L});
    public static final BitSet FOLLOW_PLUS_in_factor1717 = new BitSet(new long[]{0x2004200880100000L,0x0000000000000210L});
    public static final BitSet FOLLOW_MINUS_in_factor1722 = new BitSet(new long[]{0x2004200880100000L,0x0000000000000210L});
    public static final BitSet FOLLOW_atom_in_factor1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOTOR_in_atom1777 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_atom1779 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_INT_in_atom1783 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_atom1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SENSOR_in_atom1806 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_atom1808 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_INT_in_atom1812 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_atom1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_fun_in_atom1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_atom1886 = new BitSet(new long[]{0x2085280880100000L,0x0000000000000210L});
    public static final BitSet FOLLOW_expr_in_atom1889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_atom1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1904 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_atom1906 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_GETCOLOR_in_atom1911 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_GETULTRA_in_atom1917 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_GETTOUCH_in_atom1923 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_atom1926 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_atom1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1951 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_atom1952 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_MGETTER_in_atom1956 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_atom1958 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_atom1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBJECT_in_atom1983 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_atom1985 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ID_in_atom1987 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_atom1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall2015 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_funcall2017 = new BitSet(new long[]{0x2085280880100000L,0x0000000000000610L});
    public static final BitSet FOLLOW_expr_list_in_funcall2019 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_funcall2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list2063 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_expr_list2066 = new BitSet(new long[]{0x2085280880100000L,0x0000000000000210L});
    public static final BitSet FOLLOW_expr_in_expr_list2069 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});

}
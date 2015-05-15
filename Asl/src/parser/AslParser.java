// $ANTLR 3.4 /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g 2015-05-15 16:34:22

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGLIST", "ASSIGN", "AVANZAR", "BOOLEAN", "COMMENT", "DIV", "DMOTOR", "DO", "DSENSOR", "ELSE", "ENDFUNC", "ENDIF", "ENDWHILE", "EQUAL", "ESC_SEQ", "FALSE", "FUNC", "FUNCALL", "GE", "GETCOLOR", "GETTOUCH", "GETULTRA", "GMOTOR", "GSENSOR", "GT", "ID", "IF", "INCL", "INCLUDE", "INT", "LE", "LIST_FUNCTIONS", "LIST_INCLUDES", "LIST_INSTR", "LT", "MGETTER", "MINUS", "MOD", "MOTOR", "MSETTER", "MUL", "NOT", "NOT_EQUAL", "OBJECT", "OR", "PARAMS", "PARAR", "PLUS", "PREF", "PROG", "PVALUE", "READ", "RETURN", "SENSOR", "SLEEP", "SMOTOR", "SSLEEP", "STRING", "THEN", "TIPO", "TRUE", "VOID", "WHILE", "WRITE", "WS", "'('", "')'", "','", "'.'", "';'"
    };

    public static final int EOF=-1;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
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
    public static final int INCL=32;
    public static final int INCLUDE=33;
    public static final int INT=34;
    public static final int LE=35;
    public static final int LIST_FUNCTIONS=36;
    public static final int LIST_INCLUDES=37;
    public static final int LIST_INSTR=38;
    public static final int LT=39;
    public static final int MGETTER=40;
    public static final int MINUS=41;
    public static final int MOD=42;
    public static final int MOTOR=43;
    public static final int MSETTER=44;
    public static final int MUL=45;
    public static final int NOT=46;
    public static final int NOT_EQUAL=47;
    public static final int OBJECT=48;
    public static final int OR=49;
    public static final int PARAMS=50;
    public static final int PARAR=51;
    public static final int PLUS=52;
    public static final int PREF=53;
    public static final int PROG=54;
    public static final int PVALUE=55;
    public static final int READ=56;
    public static final int RETURN=57;
    public static final int SENSOR=58;
    public static final int SLEEP=59;
    public static final int SMOTOR=60;
    public static final int SSLEEP=61;
    public static final int STRING=62;
    public static final int THEN=63;
    public static final int TIPO=64;
    public static final int TRUE=65;
    public static final int VOID=66;
    public static final int WHILE=67;
    public static final int WRITE=68;
    public static final int WS=69;

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
    public String getGrammarFileName() { return "/home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:69:1: prog : list_includes list_funcs -> ^( PROG list_includes list_funcs ) ;
    public final AslParser.prog_return prog() throws RecognitionException {
        AslParser.prog_return retval = new AslParser.prog_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.list_includes_return list_includes1 =null;

        AslParser.list_funcs_return list_funcs2 =null;


        RewriteRuleSubtreeStream stream_list_includes=new RewriteRuleSubtreeStream(adaptor,"rule list_includes");
        RewriteRuleSubtreeStream stream_list_funcs=new RewriteRuleSubtreeStream(adaptor,"rule list_funcs");
        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:69:8: ( list_includes list_funcs -> ^( PROG list_includes list_funcs ) )
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:69:10: list_includes list_funcs
            {
            pushFollow(FOLLOW_list_includes_in_prog296);
            list_includes1=list_includes();

            state._fsp--;

            stream_list_includes.add(list_includes1.getTree());

            pushFollow(FOLLOW_list_funcs_in_prog298);
            list_funcs2=list_funcs();

            state._fsp--;

            stream_list_funcs.add(list_funcs2.getTree());

            // AST REWRITE
            // elements: list_includes, list_funcs
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 69:35: -> ^( PROG list_includes list_funcs )
            {
                // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:69:38: ^( PROG list_includes list_funcs )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(PROG, "PROG")
                , root_1);

                adaptor.addChild(root_1, stream_list_includes.nextTree());

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
    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:72:1: list_includes : ( include )* -> ^( LIST_INCLUDES ( include )* ) ;
    public final AslParser.list_includes_return list_includes() throws RecognitionException {
        AslParser.list_includes_return retval = new AslParser.list_includes_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.include_return include3 =null;


        RewriteRuleSubtreeStream stream_include=new RewriteRuleSubtreeStream(adaptor,"rule include");
        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:72:15: ( ( include )* -> ^( LIST_INCLUDES ( include )* ) )
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:72:17: ( include )*
            {
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:72:17: ( include )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==INCLUDE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:72:17: include
            	    {
            	    pushFollow(FOLLOW_include_in_list_includes325);
            	    include3=include();

            	    state._fsp--;

            	    stream_include.add(include3.getTree());

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
            // 72:26: -> ^( LIST_INCLUDES ( include )* )
            {
                // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:72:29: ^( LIST_INCLUDES ( include )* )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(LIST_INCLUDES, "LIST_INCLUDES")
                , root_1);

                // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:72:45: ( include )*
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


    public static class list_funcs_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "list_funcs"
    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:74:1: list_funcs : ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) ;
    public final AslParser.list_funcs_return list_funcs() throws RecognitionException {
        AslParser.list_funcs_return retval = new AslParser.list_funcs_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EOF5=null;
        AslParser.func_return func4 =null;


        AslTree EOF5_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_func=new RewriteRuleSubtreeStream(adaptor,"rule func");
        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:74:12: ( ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) )
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:74:14: ( func )+ EOF
            {
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:74:14: ( func )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==TIPO||LA2_0==VOID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:74:14: func
            	    {
            	    pushFollow(FOLLOW_func_in_list_funcs347);
            	    func4=func();

            	    state._fsp--;

            	    stream_func.add(func4.getTree());

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


            EOF5=(Token)match(input,EOF,FOLLOW_EOF_in_list_funcs350);  
            stream_EOF.add(EOF5);


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
            // 74:24: -> ^( LIST_FUNCTIONS ( func )+ )
            {
                // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:74:27: ^( LIST_FUNCTIONS ( func )+ )
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
    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:77:1: include : INCLUDE p= ID '/' f= ID -> ^( INCL $p $f) ;
    public final AslParser.include_return include() throws RecognitionException {
        AslParser.include_return retval = new AslParser.include_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token p=null;
        Token f=null;
        Token INCLUDE6=null;
        Token char_literal7=null;

        AslTree p_tree=null;
        AslTree f_tree=null;
        AslTree INCLUDE6_tree=null;
        AslTree char_literal7_tree=null;
        RewriteRuleTokenStream stream_DIV=new RewriteRuleTokenStream(adaptor,"token DIV");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_INCLUDE=new RewriteRuleTokenStream(adaptor,"token INCLUDE");

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:77:9: ( INCLUDE p= ID '/' f= ID -> ^( INCL $p $f) )
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:77:11: INCLUDE p= ID '/' f= ID
            {
            INCLUDE6=(Token)match(input,INCLUDE,FOLLOW_INCLUDE_in_include384);  
            stream_INCLUDE.add(INCLUDE6);


            p=(Token)match(input,ID,FOLLOW_ID_in_include388);  
            stream_ID.add(p);


            char_literal7=(Token)match(input,DIV,FOLLOW_DIV_in_include389);  
            stream_DIV.add(char_literal7);


            f=(Token)match(input,ID,FOLLOW_ID_in_include392);  
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
            // 77:31: -> ^( INCL $p $f)
            {
                // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:77:34: ^( INCL $p $f)
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


    public static class func_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "func"
    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:83:1: func : ( TIPO ID params block_instructions return_stmt ENDFUNC -> ^( FUNC TIPO ID params block_instructions return_stmt ) | VOID ID params block_instructions ENDFUNC -> ^( FUNC VOID ID params block_instructions ) );
    public final AslParser.func_return func() throws RecognitionException {
        AslParser.func_return retval = new AslParser.func_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token TIPO8=null;
        Token ID9=null;
        Token ENDFUNC13=null;
        Token VOID14=null;
        Token ID15=null;
        Token ENDFUNC18=null;
        AslParser.params_return params10 =null;

        AslParser.block_instructions_return block_instructions11 =null;

        AslParser.return_stmt_return return_stmt12 =null;

        AslParser.params_return params16 =null;

        AslParser.block_instructions_return block_instructions17 =null;


        AslTree TIPO8_tree=null;
        AslTree ID9_tree=null;
        AslTree ENDFUNC13_tree=null;
        AslTree VOID14_tree=null;
        AslTree ID15_tree=null;
        AslTree ENDFUNC18_tree=null;
        RewriteRuleTokenStream stream_ENDFUNC=new RewriteRuleTokenStream(adaptor,"token ENDFUNC");
        RewriteRuleTokenStream stream_TIPO=new RewriteRuleTokenStream(adaptor,"token TIPO");
        RewriteRuleTokenStream stream_VOID=new RewriteRuleTokenStream(adaptor,"token VOID");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_return_stmt=new RewriteRuleSubtreeStream(adaptor,"rule return_stmt");
        RewriteRuleSubtreeStream stream_block_instructions=new RewriteRuleSubtreeStream(adaptor,"rule block_instructions");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:83:9: ( TIPO ID params block_instructions return_stmt ENDFUNC -> ^( FUNC TIPO ID params block_instructions return_stmt ) | VOID ID params block_instructions ENDFUNC -> ^( FUNC VOID ID params block_instructions ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==TIPO) ) {
                alt3=1;
            }
            else if ( (LA3_0==VOID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:83:11: TIPO ID params block_instructions return_stmt ENDFUNC
                    {
                    TIPO8=(Token)match(input,TIPO,FOLLOW_TIPO_in_func436);  
                    stream_TIPO.add(TIPO8);


                    ID9=(Token)match(input,ID,FOLLOW_ID_in_func438);  
                    stream_ID.add(ID9);


                    pushFollow(FOLLOW_params_in_func440);
                    params10=params();

                    state._fsp--;

                    stream_params.add(params10.getTree());

                    pushFollow(FOLLOW_block_instructions_in_func442);
                    block_instructions11=block_instructions();

                    state._fsp--;

                    stream_block_instructions.add(block_instructions11.getTree());

                    pushFollow(FOLLOW_return_stmt_in_func444);
                    return_stmt12=return_stmt();

                    state._fsp--;

                    stream_return_stmt.add(return_stmt12.getTree());

                    ENDFUNC13=(Token)match(input,ENDFUNC,FOLLOW_ENDFUNC_in_func446);  
                    stream_ENDFUNC.add(ENDFUNC13);


                    // AST REWRITE
                    // elements: params, TIPO, return_stmt, block_instructions, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 83:65: -> ^( FUNC TIPO ID params block_instructions return_stmt )
                    {
                        // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:83:68: ^( FUNC TIPO ID params block_instructions return_stmt )
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
                case 2 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:84:11: VOID ID params block_instructions ENDFUNC
                    {
                    VOID14=(Token)match(input,VOID,FOLLOW_VOID_in_func474);  
                    stream_VOID.add(VOID14);


                    ID15=(Token)match(input,ID,FOLLOW_ID_in_func476);  
                    stream_ID.add(ID15);


                    pushFollow(FOLLOW_params_in_func478);
                    params16=params();

                    state._fsp--;

                    stream_params.add(params16.getTree());

                    pushFollow(FOLLOW_block_instructions_in_func480);
                    block_instructions17=block_instructions();

                    state._fsp--;

                    stream_block_instructions.add(block_instructions17.getTree());

                    ENDFUNC18=(Token)match(input,ENDFUNC,FOLLOW_ENDFUNC_in_func482);  
                    stream_ENDFUNC.add(ENDFUNC18);


                    // AST REWRITE
                    // elements: VOID, params, block_instructions, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 84:53: -> ^( FUNC VOID ID params block_instructions )
                    {
                        // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:84:56: ^( FUNC VOID ID params block_instructions )
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
    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:88:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
    public final AslParser.params_return params() throws RecognitionException {
        AslParser.params_return retval = new AslParser.params_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal19=null;
        Token char_literal21=null;
        AslParser.paramlist_return paramlist20 =null;


        AslTree char_literal19_tree=null;
        AslTree char_literal21_tree=null;
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:88:9: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:88:11: '(' ( paramlist )? ')'
            {
            char_literal19=(Token)match(input,70,FOLLOW_70_in_params515);  
            stream_70.add(char_literal19);


            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:88:15: ( paramlist )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==TIPO) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:88:15: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params517);
                    paramlist20=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist20.getTree());

                    }
                    break;

            }


            char_literal21=(Token)match(input,71,FOLLOW_71_in_params520);  
            stream_71.add(char_literal21);


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
            // 88:30: -> ^( PARAMS ( paramlist )? )
            {
                // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:88:33: ^( PARAMS ( paramlist )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:88:42: ( paramlist )?
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
    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:92:1: paramlist : param ( ',' ! param )* ;
    public final AslParser.paramlist_return paramlist() throws RecognitionException {
        AslParser.paramlist_return retval = new AslParser.paramlist_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal23=null;
        AslParser.param_return param22 =null;

        AslParser.param_return param24 =null;


        AslTree char_literal23_tree=null;

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:93:9: ( param ( ',' ! param )* )
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:93:11: param ( ',' ! param )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist555);
            param22=param();

            state._fsp--;

            adaptor.addChild(root_0, param22.getTree());

            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:93:17: ( ',' ! param )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==72) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:93:18: ',' ! param
            	    {
            	    char_literal23=(Token)match(input,72,FOLLOW_72_in_paramlist558); 

            	    pushFollow(FOLLOW_param_in_paramlist561);
            	    param24=param();

            	    state._fsp--;

            	    adaptor.addChild(root_0, param24.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:98:1: param : TIPO id= ID -> ^( PVALUE TIPO ID ) ;
    public final AslParser.param_return param() throws RecognitionException {
        AslParser.param_return retval = new AslParser.param_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token id=null;
        Token TIPO25=null;

        AslTree id_tree=null;
        AslTree TIPO25_tree=null;
        RewriteRuleTokenStream stream_TIPO=new RewriteRuleTokenStream(adaptor,"token TIPO");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:98:9: ( TIPO id= ID -> ^( PVALUE TIPO ID ) )
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:98:11: TIPO id= ID
            {
            TIPO25=(Token)match(input,TIPO,FOLLOW_TIPO_in_param584);  
            stream_TIPO.add(TIPO25);


            id=(Token)match(input,ID,FOLLOW_ID_in_param588);  
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
            // 98:22: -> ^( PVALUE TIPO ID )
            {
                // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:98:25: ^( PVALUE TIPO ID )
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
    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:102:1: block_instructions : instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) ;
    public final AslParser.block_instructions_return block_instructions() throws RecognitionException {
        AslParser.block_instructions_return retval = new AslParser.block_instructions_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal27=null;
        AslParser.instruction_return instruction26 =null;

        AslParser.instruction_return instruction28 =null;


        AslTree char_literal27_tree=null;
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:103:9: ( instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:103:11: instruction ( ';' instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions624);
            instruction26=instruction();

            state._fsp--;

            stream_instruction.add(instruction26.getTree());

            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:103:23: ( ';' instruction )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==74) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:103:24: ';' instruction
            	    {
            	    char_literal27=(Token)match(input,74,FOLLOW_74_in_block_instructions627);  
            	    stream_74.add(char_literal27);


            	    pushFollow(FOLLOW_instruction_in_block_instructions629);
            	    instruction28=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction28.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
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
            // 103:42: -> ^( LIST_INSTR ( instruction )+ )
            {
                // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:103:45: ^( LIST_INSTR ( instruction )+ )
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
    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:107:1: instruction : ( assign | ite_stmt | while_stmt | funcall | read | write || motor | sleep );
    public final AslParser.instruction_return instruction() throws RecognitionException {
        AslParser.instruction_return retval = new AslParser.instruction_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.assign_return assign29 =null;

        AslParser.ite_stmt_return ite_stmt30 =null;

        AslParser.while_stmt_return while_stmt31 =null;

        AslParser.funcall_return funcall32 =null;

        AslParser.read_return read33 =null;

        AslParser.write_return write34 =null;

        AslParser.motor_return motor35 =null;

        AslParser.sleep_return sleep36 =null;



        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:108:9: ( assign | ite_stmt | while_stmt | funcall | read | write || motor | sleep )
            int alt7=9;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case 70:
                    {
                    alt7=4;
                    }
                    break;
                case 73:
                    {
                    alt7=8;
                    }
                    break;
                case EQUAL:
                    {
                    alt7=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }

                }
                break;
            case IF:
                {
                alt7=2;
                }
                break;
            case WHILE:
                {
                alt7=3;
                }
                break;
            case READ:
                {
                alt7=5;
                }
                break;
            case WRITE:
                {
                alt7=6;
                }
                break;
            case ELSE:
            case ENDFUNC:
            case ENDIF:
            case ENDWHILE:
            case RETURN:
            case 74:
                {
                alt7=7;
                }
                break;
            case SLEEP:
                {
                alt7=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:108:11: assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction666);
                    assign29=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign29.getTree());

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:109:11: ite_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction686);
                    ite_stmt30=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt30.getTree());

                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:110:11: while_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction704);
                    while_stmt31=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt31.getTree());

                    }
                    break;
                case 4 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:111:11: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction720);
                    funcall32=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall32.getTree());

                    }
                    break;
                case 5 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:112:11: read
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_read_in_instruction739);
                    read33=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read33.getTree());

                    }
                    break;
                case 6 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:113:11: write
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_write_in_instruction761);
                    write34=write();

                    state._fsp--;

                    adaptor.addChild(root_0, write34.getTree());

                    }
                    break;
                case 7 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:115:9: 
                    {
                    root_0 = (AslTree)adaptor.nil();


                    }
                    break;
                case 8 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:115:11: motor
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_motor_in_instruction807);
                    motor35=motor();

                    state._fsp--;

                    adaptor.addChild(root_0, motor35.getTree());

                    }
                    break;
                case 9 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:116:11: sleep
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_sleep_in_instruction828);
                    sleep36=sleep();

                    state._fsp--;

                    adaptor.addChild(root_0, sleep36.getTree());

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
    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:119:1: motor : ( ID '.' AVANZAR '(' (e1= expr ( ',' e2= expr )? )? ')' -> ^( SMOTOR AVANZAR ID ( $e1)? ( $e2)? ) | ID '.' PARAR '(' ')' -> ^( SMOTOR PARAR ID ) | ID '.' MSETTER '(' expr ')' -> ^( SMOTOR MSETTER ID expr ) );
    public final AslParser.motor_return motor() throws RecognitionException {
        AslParser.motor_return retval = new AslParser.motor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID37=null;
        Token char_literal38=null;
        Token AVANZAR39=null;
        Token char_literal40=null;
        Token char_literal41=null;
        Token char_literal42=null;
        Token ID43=null;
        Token char_literal44=null;
        Token PARAR45=null;
        Token char_literal46=null;
        Token char_literal47=null;
        Token ID48=null;
        Token char_literal49=null;
        Token MSETTER50=null;
        Token char_literal51=null;
        Token char_literal53=null;
        AslParser.expr_return e1 =null;

        AslParser.expr_return e2 =null;

        AslParser.expr_return expr52 =null;


        AslTree ID37_tree=null;
        AslTree char_literal38_tree=null;
        AslTree AVANZAR39_tree=null;
        AslTree char_literal40_tree=null;
        AslTree char_literal41_tree=null;
        AslTree char_literal42_tree=null;
        AslTree ID43_tree=null;
        AslTree char_literal44_tree=null;
        AslTree PARAR45_tree=null;
        AslTree char_literal46_tree=null;
        AslTree char_literal47_tree=null;
        AslTree ID48_tree=null;
        AslTree char_literal49_tree=null;
        AslTree MSETTER50_tree=null;
        AslTree char_literal51_tree=null;
        AslTree char_literal53_tree=null;
        RewriteRuleTokenStream stream_MSETTER=new RewriteRuleTokenStream(adaptor,"token MSETTER");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_AVANZAR=new RewriteRuleTokenStream(adaptor,"token AVANZAR");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_PARAR=new RewriteRuleTokenStream(adaptor,"token PARAR");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:119:9: ( ID '.' AVANZAR '(' (e1= expr ( ',' e2= expr )? )? ')' -> ^( SMOTOR AVANZAR ID ( $e1)? ( $e2)? ) | ID '.' PARAR '(' ')' -> ^( SMOTOR PARAR ID ) | ID '.' MSETTER '(' expr ')' -> ^( SMOTOR MSETTER ID expr ) )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==73) ) {
                    switch ( input.LA(3) ) {
                    case AVANZAR:
                        {
                        alt10=1;
                        }
                        break;
                    case PARAR:
                        {
                        alt10=2;
                        }
                        break;
                    case MSETTER:
                        {
                        alt10=3;
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
                    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:119:11: ID '.' AVANZAR '(' (e1= expr ( ',' e2= expr )? )? ')'
                    {
                    ID37=(Token)match(input,ID,FOLLOW_ID_in_motor857);  
                    stream_ID.add(ID37);


                    char_literal38=(Token)match(input,73,FOLLOW_73_in_motor859);  
                    stream_73.add(char_literal38);


                    AVANZAR39=(Token)match(input,AVANZAR,FOLLOW_AVANZAR_in_motor861);  
                    stream_AVANZAR.add(AVANZAR39);


                    char_literal40=(Token)match(input,70,FOLLOW_70_in_motor863);  
                    stream_70.add(char_literal40);


                    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:119:30: (e1= expr ( ',' e2= expr )? )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==FALSE||LA9_0==ID||LA9_0==INT||LA9_0==MINUS||LA9_0==MOTOR||LA9_0==NOT||LA9_0==OBJECT||LA9_0==PLUS||LA9_0==SENSOR||LA9_0==TRUE||LA9_0==70) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:119:31: e1= expr ( ',' e2= expr )?
                            {
                            pushFollow(FOLLOW_expr_in_motor868);
                            e1=expr();

                            state._fsp--;

                            stream_expr.add(e1.getTree());

                            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:119:39: ( ',' e2= expr )?
                            int alt8=2;
                            int LA8_0 = input.LA(1);

                            if ( (LA8_0==72) ) {
                                alt8=1;
                            }
                            switch (alt8) {
                                case 1 :
                                    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:119:40: ',' e2= expr
                                    {
                                    char_literal41=(Token)match(input,72,FOLLOW_72_in_motor871);  
                                    stream_72.add(char_literal41);


                                    pushFollow(FOLLOW_expr_in_motor874);
                                    e2=expr();

                                    state._fsp--;

                                    stream_expr.add(e2.getTree());

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    char_literal42=(Token)match(input,71,FOLLOW_71_in_motor880);  
                    stream_71.add(char_literal42);


                    // AST REWRITE
                    // elements: e1, e2, AVANZAR, ID
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
                    // 119:59: -> ^( SMOTOR AVANZAR ID ( $e1)? ( $e2)? )
                    {
                        // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:119:62: ^( SMOTOR AVANZAR ID ( $e1)? ( $e2)? )
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

                        // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:119:83: ( $e1)?
                        if ( stream_e1.hasNext() ) {
                            adaptor.addChild(root_1, stream_e1.nextTree());

                        }
                        stream_e1.reset();

                        // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:119:88: ( $e2)?
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
                    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:120:11: ID '.' PARAR '(' ')'
                    {
                    ID43=(Token)match(input,ID,FOLLOW_ID_in_motor910);  
                    stream_ID.add(ID43);


                    char_literal44=(Token)match(input,73,FOLLOW_73_in_motor912);  
                    stream_73.add(char_literal44);


                    PARAR45=(Token)match(input,PARAR,FOLLOW_PARAR_in_motor914);  
                    stream_PARAR.add(PARAR45);


                    char_literal46=(Token)match(input,70,FOLLOW_70_in_motor916);  
                    stream_70.add(char_literal46);


                    char_literal47=(Token)match(input,71,FOLLOW_71_in_motor917);  
                    stream_71.add(char_literal47);


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
                    // 120:31: -> ^( SMOTOR PARAR ID )
                    {
                        // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:120:34: ^( SMOTOR PARAR ID )
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
                    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:121:11: ID '.' MSETTER '(' expr ')'
                    {
                    ID48=(Token)match(input,ID,FOLLOW_ID_in_motor939);  
                    stream_ID.add(ID48);


                    char_literal49=(Token)match(input,73,FOLLOW_73_in_motor941);  
                    stream_73.add(char_literal49);


                    MSETTER50=(Token)match(input,MSETTER,FOLLOW_MSETTER_in_motor943);  
                    stream_MSETTER.add(MSETTER50);


                    char_literal51=(Token)match(input,70,FOLLOW_70_in_motor945);  
                    stream_70.add(char_literal51);


                    pushFollow(FOLLOW_expr_in_motor947);
                    expr52=expr();

                    state._fsp--;

                    stream_expr.add(expr52.getTree());

                    char_literal53=(Token)match(input,71,FOLLOW_71_in_motor949);  
                    stream_71.add(char_literal53);


                    // AST REWRITE
                    // elements: MSETTER, ID, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 121:39: -> ^( SMOTOR MSETTER ID expr )
                    {
                        // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:121:42: ^( SMOTOR MSETTER ID expr )
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
    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:124:1: sleep : SLEEP '(' expr ')' -> ^( SSLEEP expr ) ;
    public final AslParser.sleep_return sleep() throws RecognitionException {
        AslParser.sleep_return retval = new AslParser.sleep_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token SLEEP54=null;
        Token char_literal55=null;
        Token char_literal57=null;
        AslParser.expr_return expr56 =null;


        AslTree SLEEP54_tree=null;
        AslTree char_literal55_tree=null;
        AslTree char_literal57_tree=null;
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_SLEEP=new RewriteRuleTokenStream(adaptor,"token SLEEP");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:124:9: ( SLEEP '(' expr ')' -> ^( SSLEEP expr ) )
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:124:11: SLEEP '(' expr ')'
            {
            SLEEP54=(Token)match(input,SLEEP,FOLLOW_SLEEP_in_sleep988);  
            stream_SLEEP.add(SLEEP54);


            char_literal55=(Token)match(input,70,FOLLOW_70_in_sleep990);  
            stream_70.add(char_literal55);


            pushFollow(FOLLOW_expr_in_sleep992);
            expr56=expr();

            state._fsp--;

            stream_expr.add(expr56.getTree());

            char_literal57=(Token)match(input,71,FOLLOW_71_in_sleep994);  
            stream_71.add(char_literal57);


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
            // 124:30: -> ^( SSLEEP expr )
            {
                // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:124:33: ^( SSLEEP expr )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(SSLEEP, "SSLEEP")
                , root_1);

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
    // $ANTLR end "sleep"


    public static class assign_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assign"
    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:128:1: assign : esq eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] esq expr ) ;
    public final AslParser.assign_return assign() throws RecognitionException {
        AslParser.assign_return retval = new AslParser.assign_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        AslParser.esq_return esq58 =null;

        AslParser.expr_return expr59 =null;


        AslTree eq_tree=null;
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_esq=new RewriteRuleSubtreeStream(adaptor,"rule esq");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:128:9: ( esq eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] esq expr ) )
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:128:11: esq eq= EQUAL expr
            {
            pushFollow(FOLLOW_esq_in_assign1021);
            esq58=esq();

            state._fsp--;

            stream_esq.add(esq58.getTree());

            eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign1025);  
            stream_EQUAL.add(eq);


            pushFollow(FOLLOW_expr_in_assign1027);
            expr59=expr();

            state._fsp--;

            stream_expr.add(expr59.getTree());

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
            // 128:29: -> ^( ASSIGN[$eq,\":=\"] esq expr )
            {
                // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:128:32: ^( ASSIGN[$eq,\":=\"] esq expr )
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
    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:131:1: esq : ID ;
    public final AslParser.esq_return esq() throws RecognitionException {
        AslParser.esq_return retval = new AslParser.esq_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID60=null;

        AslTree ID60_tree=null;

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:131:9: ( ID )
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:131:11: ID
            {
            root_0 = (AslTree)adaptor.nil();


            ID60=(Token)match(input,ID,FOLLOW_ID_in_esq1067); 
            ID60_tree = 
            (AslTree)adaptor.create(ID60)
            ;
            adaptor.addChild(root_0, ID60_tree);


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
    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:135:1: ite_stmt : IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !;
    public final AslParser.ite_stmt_return ite_stmt() throws RecognitionException {
        AslParser.ite_stmt_return retval = new AslParser.ite_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token IF61=null;
        Token THEN63=null;
        Token ELSE65=null;
        Token ENDIF67=null;
        AslParser.expr_return expr62 =null;

        AslParser.block_instructions_return block_instructions64 =null;

        AslParser.block_instructions_return block_instructions66 =null;


        AslTree IF61_tree=null;
        AslTree THEN63_tree=null;
        AslTree ELSE65_tree=null;
        AslTree ENDIF67_tree=null;

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:135:9: ( IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !)
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:135:11: IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !
            {
            root_0 = (AslTree)adaptor.nil();


            IF61=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt1084); 
            IF61_tree = 
            (AslTree)adaptor.create(IF61)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF61_tree, root_0);


            pushFollow(FOLLOW_expr_in_ite_stmt1087);
            expr62=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr62.getTree());

            THEN63=(Token)match(input,THEN,FOLLOW_THEN_in_ite_stmt1089); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt1092);
            block_instructions64=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions64.getTree());

            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:135:45: ( ELSE ! block_instructions )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ELSE) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:135:46: ELSE ! block_instructions
                    {
                    ELSE65=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt1095); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt1098);
                    block_instructions66=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions66.getTree());

                    }
                    break;

            }


            ENDIF67=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ite_stmt1102); 

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
    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:139:1: while_stmt : WHILE ^ expr DO ! block_instructions ENDWHILE !;
    public final AslParser.while_stmt_return while_stmt() throws RecognitionException {
        AslParser.while_stmt_return retval = new AslParser.while_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WHILE68=null;
        Token DO70=null;
        Token ENDWHILE72=null;
        AslParser.expr_return expr69 =null;

        AslParser.block_instructions_return block_instructions71 =null;


        AslTree WHILE68_tree=null;
        AslTree DO70_tree=null;
        AslTree ENDWHILE72_tree=null;

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:140:9: ( WHILE ^ expr DO ! block_instructions ENDWHILE !)
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:140:11: WHILE ^ expr DO ! block_instructions ENDWHILE !
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE68=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt1129); 
            WHILE68_tree = 
            (AslTree)adaptor.create(WHILE68)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE68_tree, root_0);


            pushFollow(FOLLOW_expr_in_while_stmt1132);
            expr69=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr69.getTree());

            DO70=(Token)match(input,DO,FOLLOW_DO_in_while_stmt1134); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt1137);
            block_instructions71=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions71.getTree());

            ENDWHILE72=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_while_stmt1139); 

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
    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:144:1: return_stmt : RETURN ^ expr ;
    public final AslParser.return_stmt_return return_stmt() throws RecognitionException {
        AslParser.return_stmt_return retval = new AslParser.return_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RETURN73=null;
        AslParser.expr_return expr74 =null;


        AslTree RETURN73_tree=null;

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:145:9: ( RETURN ^ expr )
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:145:11: RETURN ^ expr
            {
            root_0 = (AslTree)adaptor.nil();


            RETURN73=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt1166); 
            RETURN73_tree = 
            (AslTree)adaptor.create(RETURN73)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RETURN73_tree, root_0);


            pushFollow(FOLLOW_expr_in_return_stmt1169);
            expr74=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr74.getTree());

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
    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:149:1: read : READ ^ esq ;
    public final AslParser.read_return read() throws RecognitionException {
        AslParser.read_return retval = new AslParser.read_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token READ75=null;
        AslParser.esq_return esq76 =null;


        AslTree READ75_tree=null;

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:149:9: ( READ ^ esq )
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:149:11: READ ^ esq
            {
            root_0 = (AslTree)adaptor.nil();


            READ75=(Token)match(input,READ,FOLLOW_READ_in_read1190); 
            READ75_tree = 
            (AslTree)adaptor.create(READ75)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(READ75_tree, root_0);


            pushFollow(FOLLOW_esq_in_read1193);
            esq76=esq();

            state._fsp--;

            adaptor.addChild(root_0, esq76.getTree());

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
    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:153:1: write : WRITE ^ ( expr | STRING ) ;
    public final AslParser.write_return write() throws RecognitionException {
        AslParser.write_return retval = new AslParser.write_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WRITE77=null;
        Token STRING79=null;
        AslParser.expr_return expr78 =null;


        AslTree WRITE77_tree=null;
        AslTree STRING79_tree=null;

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:153:9: ( WRITE ^ ( expr | STRING ) )
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:153:11: WRITE ^ ( expr | STRING )
            {
            root_0 = (AslTree)adaptor.nil();


            WRITE77=(Token)match(input,WRITE,FOLLOW_WRITE_in_write1213); 
            WRITE77_tree = 
            (AslTree)adaptor.create(WRITE77)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WRITE77_tree, root_0);


            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:153:18: ( expr | STRING )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==FALSE||LA12_0==ID||LA12_0==INT||LA12_0==MINUS||LA12_0==MOTOR||LA12_0==NOT||LA12_0==OBJECT||LA12_0==PLUS||LA12_0==SENSOR||LA12_0==TRUE||LA12_0==70) ) {
                alt12=1;
            }
            else if ( (LA12_0==STRING) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:153:19: expr
                    {
                    pushFollow(FOLLOW_expr_in_write1217);
                    expr78=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr78.getTree());

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:153:26: STRING
                    {
                    STRING79=(Token)match(input,STRING,FOLLOW_STRING_in_write1221); 
                    STRING79_tree = 
                    (AslTree)adaptor.create(STRING79)
                    ;
                    adaptor.addChild(root_0, STRING79_tree);


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
    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:157:1: expr : boolterm ( OR ^ boolterm )* ;
    public final AslParser.expr_return expr() throws RecognitionException {
        AslParser.expr_return retval = new AslParser.expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OR81=null;
        AslParser.boolterm_return boolterm80 =null;

        AslParser.boolterm_return boolterm82 =null;


        AslTree OR81_tree=null;

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:157:9: ( boolterm ( OR ^ boolterm )* )
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:157:11: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr1244);
            boolterm80=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm80.getTree());

            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:157:20: ( OR ^ boolterm )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==OR) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:157:21: OR ^ boolterm
            	    {
            	    OR81=(Token)match(input,OR,FOLLOW_OR_in_expr1247); 
            	    OR81_tree = 
            	    (AslTree)adaptor.create(OR81)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR81_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr1250);
            	    boolterm82=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm82.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:160:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final AslParser.boolterm_return boolterm() throws RecognitionException {
        AslParser.boolterm_return retval = new AslParser.boolterm_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token AND84=null;
        AslParser.boolfact_return boolfact83 =null;

        AslParser.boolfact_return boolfact85 =null;


        AslTree AND84_tree=null;

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:160:9: ( boolfact ( AND ^ boolfact )* )
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:160:11: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm1268);
            boolfact83=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact83.getTree());

            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:160:20: ( AND ^ boolfact )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==AND) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:160:21: AND ^ boolfact
            	    {
            	    AND84=(Token)match(input,AND,FOLLOW_AND_in_boolterm1271); 
            	    AND84_tree = 
            	    (AslTree)adaptor.create(AND84)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND84_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm1274);
            	    boolfact85=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact85.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:163:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final AslParser.boolfact_return boolfact() throws RecognitionException {
        AslParser.boolfact_return retval = new AslParser.boolfact_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EQUAL87=null;
        Token NOT_EQUAL88=null;
        Token LT89=null;
        Token LE90=null;
        Token GT91=null;
        Token GE92=null;
        AslParser.num_expr_return num_expr86 =null;

        AslParser.num_expr_return num_expr93 =null;


        AslTree EQUAL87_tree=null;
        AslTree NOT_EQUAL88_tree=null;
        AslTree LT89_tree=null;
        AslTree LE90_tree=null;
        AslTree GT91_tree=null;
        AslTree GE92_tree=null;

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:163:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:163:11: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact1292);
            num_expr86=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr86.getTree());

            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:163:20: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==EQUAL||LA16_0==GE||LA16_0==GT||LA16_0==LE||LA16_0==LT||LA16_0==NOT_EQUAL) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:163:21: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:163:21: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt15=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt15=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt15=2;
                        }
                        break;
                    case LT:
                        {
                        alt15=3;
                        }
                        break;
                    case LE:
                        {
                        alt15=4;
                        }
                        break;
                    case GT:
                        {
                        alt15=5;
                        }
                        break;
                    case GE:
                        {
                        alt15=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;

                    }

                    switch (alt15) {
                        case 1 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:163:22: EQUAL ^
                            {
                            EQUAL87=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact1296); 
                            EQUAL87_tree = 
                            (AslTree)adaptor.create(EQUAL87)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(EQUAL87_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:163:31: NOT_EQUAL ^
                            {
                            NOT_EQUAL88=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact1301); 
                            NOT_EQUAL88_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL88)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL88_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:163:44: LT ^
                            {
                            LT89=(Token)match(input,LT,FOLLOW_LT_in_boolfact1306); 
                            LT89_tree = 
                            (AslTree)adaptor.create(LT89)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT89_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:163:50: LE ^
                            {
                            LE90=(Token)match(input,LE,FOLLOW_LE_in_boolfact1311); 
                            LE90_tree = 
                            (AslTree)adaptor.create(LE90)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE90_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:163:56: GT ^
                            {
                            GT91=(Token)match(input,GT,FOLLOW_GT_in_boolfact1316); 
                            GT91_tree = 
                            (AslTree)adaptor.create(GT91)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT91_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:163:62: GE ^
                            {
                            GE92=(Token)match(input,GE,FOLLOW_GE_in_boolfact1321); 
                            GE92_tree = 
                            (AslTree)adaptor.create(GE92)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE92_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact1325);
                    num_expr93=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr93.getTree());

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
    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:166:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final AslParser.num_expr_return num_expr() throws RecognitionException {
        AslParser.num_expr_return retval = new AslParser.num_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PLUS95=null;
        Token MINUS96=null;
        AslParser.term_return term94 =null;

        AslParser.term_return term97 =null;


        AslTree PLUS95_tree=null;
        AslTree MINUS96_tree=null;

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:166:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:166:11: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr1343);
            term94=term();

            state._fsp--;

            adaptor.addChild(root_0, term94.getTree());

            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:166:16: ( ( PLUS ^| MINUS ^) term )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==MINUS||LA18_0==PLUS) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:166:18: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:166:18: ( PLUS ^| MINUS ^)
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==PLUS) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==MINUS) ) {
            	        alt17=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:166:19: PLUS ^
            	            {
            	            PLUS95=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr1348); 
            	            PLUS95_tree = 
            	            (AslTree)adaptor.create(PLUS95)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS95_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:166:27: MINUS ^
            	            {
            	            MINUS96=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr1353); 
            	            MINUS96_tree = 
            	            (AslTree)adaptor.create(MINUS96)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS96_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr1357);
            	    term97=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term97.getTree());

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
    // $ANTLR end "num_expr"


    public static class term_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:169:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final AslParser.term_return term() throws RecognitionException {
        AslParser.term_return retval = new AslParser.term_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MUL99=null;
        Token DIV100=null;
        Token MOD101=null;
        AslParser.factor_return factor98 =null;

        AslParser.factor_return factor102 =null;


        AslTree MUL99_tree=null;
        AslTree DIV100_tree=null;
        AslTree MOD101_tree=null;

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:169:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:169:11: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1379);
            factor98=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor98.getTree());

            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:169:18: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==DIV||LA20_0==MOD||LA20_0==MUL) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:169:20: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:169:20: ( MUL ^| DIV ^| MOD ^)
            	    int alt19=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt19=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt19=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt19=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt19) {
            	        case 1 :
            	            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:169:21: MUL ^
            	            {
            	            MUL99=(Token)match(input,MUL,FOLLOW_MUL_in_term1384); 
            	            MUL99_tree = 
            	            (AslTree)adaptor.create(MUL99)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MUL99_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:169:28: DIV ^
            	            {
            	            DIV100=(Token)match(input,DIV,FOLLOW_DIV_in_term1389); 
            	            DIV100_tree = 
            	            (AslTree)adaptor.create(DIV100)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV100_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:169:35: MOD ^
            	            {
            	            MOD101=(Token)match(input,MOD,FOLLOW_MOD_in_term1394); 
            	            MOD101_tree = 
            	            (AslTree)adaptor.create(MOD101)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD101_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1398);
            	    factor102=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor102.getTree());

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
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:172:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final AslParser.factor_return factor() throws RecognitionException {
        AslParser.factor_return retval = new AslParser.factor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOT103=null;
        Token PLUS104=null;
        Token MINUS105=null;
        AslParser.atom_return atom106 =null;


        AslTree NOT103_tree=null;
        AslTree PLUS104_tree=null;
        AslTree MINUS105_tree=null;

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:172:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:172:11: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AslTree)adaptor.nil();


            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:172:11: ( NOT ^| PLUS ^| MINUS ^)?
            int alt21=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt21=1;
                    }
                    break;
                case PLUS:
                    {
                    alt21=2;
                    }
                    break;
                case MINUS:
                    {
                    alt21=3;
                    }
                    break;
            }

            switch (alt21) {
                case 1 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:172:12: NOT ^
                    {
                    NOT103=(Token)match(input,NOT,FOLLOW_NOT_in_factor1419); 
                    NOT103_tree = 
                    (AslTree)adaptor.create(NOT103)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOT103_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:172:19: PLUS ^
                    {
                    PLUS104=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1424); 
                    PLUS104_tree = 
                    (AslTree)adaptor.create(PLUS104)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLUS104_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:172:27: MINUS ^
                    {
                    MINUS105=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1429); 
                    MINUS105_tree = 
                    (AslTree)adaptor.create(MINUS105)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MINUS105_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1434);
            atom106=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom106.getTree());

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
    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:178:1: atom : ( ID | INT |m= MOTOR '(' b= INT ')' -> ^( DMOTOR[m, \"MOTOR\"+$b.text] ) |s= SENSOR '(' b= INT ')' -> ^( DSENSOR[s, $s.text+$b.text] ) | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !| ID '.' (b= GETCOLOR |b= GETULTRA |b= GETTOUCH ) '(' ')' -> ^( GSENSOR $b ID ) | ID '.' b= MGETTER '(' ')' -> ^( GMOTOR $b ID ) | OBJECT '(' ID ')' -> ^( OBJECT ID ) );
    public final AslParser.atom_return atom() throws RecognitionException {
        AslParser.atom_return retval = new AslParser.atom_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token m=null;
        Token b=null;
        Token s=null;
        Token ID107=null;
        Token INT108=null;
        Token char_literal109=null;
        Token char_literal110=null;
        Token char_literal111=null;
        Token char_literal112=null;
        Token char_literal114=null;
        Token char_literal116=null;
        Token ID117=null;
        Token char_literal118=null;
        Token char_literal119=null;
        Token char_literal120=null;
        Token ID121=null;
        Token char_literal122=null;
        Token char_literal123=null;
        Token char_literal124=null;
        Token OBJECT125=null;
        Token char_literal126=null;
        Token ID127=null;
        Token char_literal128=null;
        AslParser.funcall_return funcall113 =null;

        AslParser.expr_return expr115 =null;


        AslTree m_tree=null;
        AslTree b_tree=null;
        AslTree s_tree=null;
        AslTree ID107_tree=null;
        AslTree INT108_tree=null;
        AslTree char_literal109_tree=null;
        AslTree char_literal110_tree=null;
        AslTree char_literal111_tree=null;
        AslTree char_literal112_tree=null;
        AslTree char_literal114_tree=null;
        AslTree char_literal116_tree=null;
        AslTree ID117_tree=null;
        AslTree char_literal118_tree=null;
        AslTree char_literal119_tree=null;
        AslTree char_literal120_tree=null;
        AslTree ID121_tree=null;
        AslTree char_literal122_tree=null;
        AslTree char_literal123_tree=null;
        AslTree char_literal124_tree=null;
        AslTree OBJECT125_tree=null;
        AslTree char_literal126_tree=null;
        AslTree ID127_tree=null;
        AslTree char_literal128_tree=null;
        RewriteRuleTokenStream stream_SENSOR=new RewriteRuleTokenStream(adaptor,"token SENSOR");
        RewriteRuleTokenStream stream_GETCOLOR=new RewriteRuleTokenStream(adaptor,"token GETCOLOR");
        RewriteRuleTokenStream stream_OBJECT=new RewriteRuleTokenStream(adaptor,"token OBJECT");
        RewriteRuleTokenStream stream_GETTOUCH=new RewriteRuleTokenStream(adaptor,"token GETTOUCH");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_MOTOR=new RewriteRuleTokenStream(adaptor,"token MOTOR");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_MGETTER=new RewriteRuleTokenStream(adaptor,"token MGETTER");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_GETULTRA=new RewriteRuleTokenStream(adaptor,"token GETULTRA");

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:178:9: ( ID | INT |m= MOTOR '(' b= INT ')' -> ^( DMOTOR[m, \"MOTOR\"+$b.text] ) |s= SENSOR '(' b= INT ')' -> ^( DSENSOR[s, $s.text+$b.text] ) | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !| ID '.' (b= GETCOLOR |b= GETULTRA |b= GETTOUCH ) '(' ')' -> ^( GSENSOR $b ID ) | ID '.' b= MGETTER '(' ')' -> ^( GMOTOR $b ID ) | OBJECT '(' ID ')' -> ^( OBJECT ID ) )
            int alt24=10;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case 70:
                    {
                    alt24=6;
                    }
                    break;
                case 73:
                    {
                    int LA24_9 = input.LA(3);

                    if ( (LA24_9==MGETTER) ) {
                        alt24=9;
                    }
                    else if ( ((LA24_9 >= GETCOLOR && LA24_9 <= GETULTRA)) ) {
                        alt24=8;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 9, input);

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
                case 71:
                case 72:
                case 74:
                    {
                    alt24=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;

                }

                }
                break;
            case INT:
                {
                alt24=2;
                }
                break;
            case MOTOR:
                {
                alt24=3;
                }
                break;
            case SENSOR:
                {
                alt24=4;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt24=5;
                }
                break;
            case 70:
                {
                alt24=7;
                }
                break;
            case OBJECT:
                {
                alt24=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }

            switch (alt24) {
                case 1 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:178:11: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID107=(Token)match(input,ID,FOLLOW_ID_in_atom1457); 
                    ID107_tree = 
                    (AslTree)adaptor.create(ID107)
                    ;
                    adaptor.addChild(root_0, ID107_tree);


                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:179:11: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT108=(Token)match(input,INT,FOLLOW_INT_in_atom1470); 
                    INT108_tree = 
                    (AslTree)adaptor.create(INT108)
                    ;
                    adaptor.addChild(root_0, INT108_tree);


                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:180:11: m= MOTOR '(' b= INT ')'
                    {
                    m=(Token)match(input,MOTOR,FOLLOW_MOTOR_in_atom1484);  
                    stream_MOTOR.add(m);


                    char_literal109=(Token)match(input,70,FOLLOW_70_in_atom1486);  
                    stream_70.add(char_literal109);


                    b=(Token)match(input,INT,FOLLOW_INT_in_atom1490);  
                    stream_INT.add(b);


                    char_literal110=(Token)match(input,71,FOLLOW_71_in_atom1492);  
                    stream_71.add(char_literal110);


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
                    // 180:33: -> ^( DMOTOR[m, \"MOTOR\"+$b.text] )
                    {
                        // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:180:36: ^( DMOTOR[m, \"MOTOR\"+$b.text] )
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
                    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:181:11: s= SENSOR '(' b= INT ')'
                    {
                    s=(Token)match(input,SENSOR,FOLLOW_SENSOR_in_atom1513);  
                    stream_SENSOR.add(s);


                    char_literal111=(Token)match(input,70,FOLLOW_70_in_atom1515);  
                    stream_70.add(char_literal111);


                    b=(Token)match(input,INT,FOLLOW_INT_in_atom1519);  
                    stream_INT.add(b);


                    char_literal112=(Token)match(input,71,FOLLOW_71_in_atom1521);  
                    stream_71.add(char_literal112);


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
                    // 181:34: -> ^( DSENSOR[s, $s.text+$b.text] )
                    {
                        // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:181:37: ^( DSENSOR[s, $s.text+$b.text] )
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
                    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:182:11: (b= TRUE |b= FALSE )
                    {
                    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:182:11: (b= TRUE |b= FALSE )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==TRUE) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==FALSE) ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;

                    }
                    switch (alt22) {
                        case 1 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:182:12: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1543);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:182:21: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1549);  
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
                    // 182:30: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:182:33: ^( BOOLEAN[$b,$b.text] )
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
                    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:183:11: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom1569);
                    funcall113=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall113.getTree());

                    }
                    break;
                case 7 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:184:11: '(' ! expr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    char_literal114=(Token)match(input,70,FOLLOW_70_in_atom1581); 

                    pushFollow(FOLLOW_expr_in_atom1584);
                    expr115=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr115.getTree());

                    char_literal116=(Token)match(input,71,FOLLOW_71_in_atom1586); 

                    }
                    break;
                case 8 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:185:11: ID '.' (b= GETCOLOR |b= GETULTRA |b= GETTOUCH ) '(' ')'
                    {
                    ID117=(Token)match(input,ID,FOLLOW_ID_in_atom1599);  
                    stream_ID.add(ID117);


                    char_literal118=(Token)match(input,73,FOLLOW_73_in_atom1601);  
                    stream_73.add(char_literal118);


                    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:185:18: (b= GETCOLOR |b= GETULTRA |b= GETTOUCH )
                    int alt23=3;
                    switch ( input.LA(1) ) {
                    case GETCOLOR:
                        {
                        alt23=1;
                        }
                        break;
                    case GETULTRA:
                        {
                        alt23=2;
                        }
                        break;
                    case GETTOUCH:
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
                            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:185:19: b= GETCOLOR
                            {
                            b=(Token)match(input,GETCOLOR,FOLLOW_GETCOLOR_in_atom1606);  
                            stream_GETCOLOR.add(b);


                            }
                            break;
                        case 2 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:185:32: b= GETULTRA
                            {
                            b=(Token)match(input,GETULTRA,FOLLOW_GETULTRA_in_atom1612);  
                            stream_GETULTRA.add(b);


                            }
                            break;
                        case 3 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:185:45: b= GETTOUCH
                            {
                            b=(Token)match(input,GETTOUCH,FOLLOW_GETTOUCH_in_atom1618);  
                            stream_GETTOUCH.add(b);


                            }
                            break;

                    }


                    char_literal119=(Token)match(input,70,FOLLOW_70_in_atom1621);  
                    stream_70.add(char_literal119);


                    char_literal120=(Token)match(input,71,FOLLOW_71_in_atom1623);  
                    stream_71.add(char_literal120);


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
                    // 185:65: -> ^( GSENSOR $b ID )
                    {
                        // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:185:68: ^( GSENSOR $b ID )
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
                case 9 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:186:11: ID '.' b= MGETTER '(' ')'
                    {
                    ID121=(Token)match(input,ID,FOLLOW_ID_in_atom1646);  
                    stream_ID.add(ID121);


                    char_literal122=(Token)match(input,73,FOLLOW_73_in_atom1647);  
                    stream_73.add(char_literal122);


                    b=(Token)match(input,MGETTER,FOLLOW_MGETTER_in_atom1651);  
                    stream_MGETTER.add(b);


                    char_literal123=(Token)match(input,70,FOLLOW_70_in_atom1653);  
                    stream_70.add(char_literal123);


                    char_literal124=(Token)match(input,71,FOLLOW_71_in_atom1655);  
                    stream_71.add(char_literal124);


                    // AST REWRITE
                    // elements: b, ID
                    // token labels: b
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_b=new RewriteRuleTokenStream(adaptor,"token b",b);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 186:35: -> ^( GMOTOR $b ID )
                    {
                        // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:186:38: ^( GMOTOR $b ID )
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
                case 10 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:187:11: OBJECT '(' ID ')'
                    {
                    OBJECT125=(Token)match(input,OBJECT,FOLLOW_OBJECT_in_atom1678);  
                    stream_OBJECT.add(OBJECT125);


                    char_literal126=(Token)match(input,70,FOLLOW_70_in_atom1680);  
                    stream_70.add(char_literal126);


                    ID127=(Token)match(input,ID,FOLLOW_ID_in_atom1682);  
                    stream_ID.add(ID127);


                    char_literal128=(Token)match(input,71,FOLLOW_71_in_atom1684);  
                    stream_71.add(char_literal128);


                    // AST REWRITE
                    // elements: OBJECT, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 187:28: -> ^( OBJECT ID )
                    {
                        // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:187:31: ^( OBJECT ID )
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
    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:191:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final AslParser.funcall_return funcall() throws RecognitionException {
        AslParser.funcall_return retval = new AslParser.funcall_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID129=null;
        Token char_literal130=null;
        Token char_literal132=null;
        AslParser.expr_list_return expr_list131 =null;


        AslTree ID129_tree=null;
        AslTree char_literal130_tree=null;
        AslTree char_literal132_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:191:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:191:11: ID '(' ( expr_list )? ')'
            {
            ID129=(Token)match(input,ID,FOLLOW_ID_in_funcall1710);  
            stream_ID.add(ID129);


            char_literal130=(Token)match(input,70,FOLLOW_70_in_funcall1712);  
            stream_70.add(char_literal130);


            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:191:18: ( expr_list )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==FALSE||LA25_0==ID||LA25_0==INT||LA25_0==MINUS||LA25_0==MOTOR||LA25_0==NOT||LA25_0==OBJECT||LA25_0==PLUS||LA25_0==SENSOR||LA25_0==TRUE||LA25_0==70) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:191:18: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall1714);
                    expr_list131=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list131.getTree());

                    }
                    break;

            }


            char_literal132=(Token)match(input,71,FOLLOW_71_in_funcall1717);  
            stream_71.add(char_literal132);


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
            // 191:33: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:191:36: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:191:49: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:191:59: ( expr_list )?
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
    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:195:1: expr_list : expr ( ',' ! expr )* ;
    public final AslParser.expr_list_return expr_list() throws RecognitionException {
        AslParser.expr_list_return retval = new AslParser.expr_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal134=null;
        AslParser.expr_return expr133 =null;

        AslParser.expr_return expr135 =null;


        AslTree char_literal134_tree=null;

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:195:10: ( expr ( ',' ! expr )* )
            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:195:12: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list1749);
            expr133=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr133.getTree());

            // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:195:17: ( ',' ! expr )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==72) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /home2/users/alumnes/1161255/dades/linux/CL/robot-cl/Asl/src/parser/Asl.g:195:18: ',' ! expr
            	    {
            	    char_literal134=(Token)match(input,72,FOLLOW_72_in_expr_list1752); 

            	    pushFollow(FOLLOW_expr_in_expr_list1755);
            	    expr135=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr135.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
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


 

    public static final BitSet FOLLOW_list_includes_in_prog296 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_list_funcs_in_prog298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_include_in_list_includes325 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_func_in_list_funcs347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_EOF_in_list_funcs350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCLUDE_in_include384 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_include388 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_DIV_in_include389 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_include392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIPO_in_func436 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_func438 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_params_in_func440 = new BitSet(new long[]{0x09000000C0000000L,0x0000000000000418L});
    public static final BitSet FOLLOW_block_instructions_in_func442 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_return_stmt_in_func444 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_func474 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_func476 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_params_in_func478 = new BitSet(new long[]{0x09000000C0000000L,0x0000000000000418L});
    public static final BitSet FOLLOW_block_instructions_in_func480 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_params515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000081L});
    public static final BitSet FOLLOW_paramlist_in_params517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_params520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist555 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_paramlist558 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_param_in_paramlist561 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_TIPO_in_param584 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_param588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions624 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_block_instructions627 = new BitSet(new long[]{0x09000000C0000000L,0x0000000000000418L});
    public static final BitSet FOLLOW_instruction_in_block_instructions629 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_assign_in_instruction666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_instruction761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_motor_in_instruction807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sleep_in_instruction828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_motor857 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_motor859 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_AVANZAR_in_motor861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_motor863 = new BitSet(new long[]{0x04114A0440100000L,0x00000000000000C2L});
    public static final BitSet FOLLOW_expr_in_motor868 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_72_in_motor871 = new BitSet(new long[]{0x04114A0440100000L,0x0000000000000042L});
    public static final BitSet FOLLOW_expr_in_motor874 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_motor880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_motor910 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_motor912 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_PARAR_in_motor914 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_motor916 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_motor917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_motor939 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_motor941 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_MSETTER_in_motor943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_motor945 = new BitSet(new long[]{0x04114A0440100000L,0x0000000000000042L});
    public static final BitSet FOLLOW_expr_in_motor947 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_motor949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLEEP_in_sleep988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_sleep990 = new BitSet(new long[]{0x04114A0440100000L,0x0000000000000042L});
    public static final BitSet FOLLOW_expr_in_sleep992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_sleep994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_esq_in_assign1021 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUAL_in_assign1025 = new BitSet(new long[]{0x04114A0440100000L,0x0000000000000042L});
    public static final BitSet FOLLOW_expr_in_assign1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_esq1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt1084 = new BitSet(new long[]{0x04114A0440100000L,0x0000000000000042L});
    public static final BitSet FOLLOW_expr_in_ite_stmt1087 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_THEN_in_ite_stmt1089 = new BitSet(new long[]{0x09000000C0000000L,0x0000000000000418L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt1092 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt1095 = new BitSet(new long[]{0x09000000C0000000L,0x0000000000000418L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt1098 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ENDIF_in_ite_stmt1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt1129 = new BitSet(new long[]{0x04114A0440100000L,0x0000000000000042L});
    public static final BitSet FOLLOW_expr_in_while_stmt1132 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_DO_in_while_stmt1134 = new BitSet(new long[]{0x09000000C0000000L,0x0000000000000418L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt1137 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ENDWHILE_in_while_stmt1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt1166 = new BitSet(new long[]{0x04114A0440100000L,0x0000000000000042L});
    public static final BitSet FOLLOW_expr_in_return_stmt1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read1190 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_esq_in_read1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write1213 = new BitSet(new long[]{0x44114A0440100000L,0x0000000000000042L});
    public static final BitSet FOLLOW_expr_in_write1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_write1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr1244 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_OR_in_expr1247 = new BitSet(new long[]{0x04114A0440100000L,0x0000000000000042L});
    public static final BitSet FOLLOW_boolterm_in_expr1250 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1268 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm1271 = new BitSet(new long[]{0x04114A0440100000L,0x0000000000000042L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1274 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1292 = new BitSet(new long[]{0x0000808820840002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact1296 = new BitSet(new long[]{0x04114A0440100000L,0x0000000000000042L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact1301 = new BitSet(new long[]{0x04114A0440100000L,0x0000000000000042L});
    public static final BitSet FOLLOW_LT_in_boolfact1306 = new BitSet(new long[]{0x04114A0440100000L,0x0000000000000042L});
    public static final BitSet FOLLOW_LE_in_boolfact1311 = new BitSet(new long[]{0x04114A0440100000L,0x0000000000000042L});
    public static final BitSet FOLLOW_GT_in_boolfact1316 = new BitSet(new long[]{0x04114A0440100000L,0x0000000000000042L});
    public static final BitSet FOLLOW_GE_in_boolfact1321 = new BitSet(new long[]{0x04114A0440100000L,0x0000000000000042L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr1343 = new BitSet(new long[]{0x0010020000000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr1348 = new BitSet(new long[]{0x04114A0440100000L,0x0000000000000042L});
    public static final BitSet FOLLOW_MINUS_in_num_expr1353 = new BitSet(new long[]{0x04114A0440100000L,0x0000000000000042L});
    public static final BitSet FOLLOW_term_in_num_expr1357 = new BitSet(new long[]{0x0010020000000002L});
    public static final BitSet FOLLOW_factor_in_term1379 = new BitSet(new long[]{0x0000240000000402L});
    public static final BitSet FOLLOW_MUL_in_term1384 = new BitSet(new long[]{0x04114A0440100000L,0x0000000000000042L});
    public static final BitSet FOLLOW_DIV_in_term1389 = new BitSet(new long[]{0x04114A0440100000L,0x0000000000000042L});
    public static final BitSet FOLLOW_MOD_in_term1394 = new BitSet(new long[]{0x04114A0440100000L,0x0000000000000042L});
    public static final BitSet FOLLOW_factor_in_term1398 = new BitSet(new long[]{0x0000240000000402L});
    public static final BitSet FOLLOW_NOT_in_factor1419 = new BitSet(new long[]{0x0401080440100000L,0x0000000000000042L});
    public static final BitSet FOLLOW_PLUS_in_factor1424 = new BitSet(new long[]{0x0401080440100000L,0x0000000000000042L});
    public static final BitSet FOLLOW_MINUS_in_factor1429 = new BitSet(new long[]{0x0401080440100000L,0x0000000000000042L});
    public static final BitSet FOLLOW_atom_in_factor1434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOTOR_in_atom1484 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_atom1486 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_INT_in_atom1490 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_atom1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SENSOR_in_atom1513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_atom1515 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_INT_in_atom1519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_atom1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_atom1581 = new BitSet(new long[]{0x04114A0440100000L,0x0000000000000042L});
    public static final BitSet FOLLOW_expr_in_atom1584 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_atom1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1599 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_atom1601 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_GETCOLOR_in_atom1606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_GETULTRA_in_atom1612 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_GETTOUCH_in_atom1618 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_atom1621 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_atom1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_atom1647 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_MGETTER_in_atom1651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_atom1653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_atom1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBJECT_in_atom1678 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_atom1680 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_atom1682 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_atom1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall1710 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_funcall1712 = new BitSet(new long[]{0x04114A0440100000L,0x00000000000000C2L});
    public static final BitSet FOLLOW_expr_list_in_funcall1714 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_funcall1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list1749 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_expr_list1752 = new BitSet(new long[]{0x04114A0440100000L,0x0000000000000042L});
    public static final BitSet FOLLOW_expr_in_expr_list1755 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});

}
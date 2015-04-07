// $ANTLR 3.4 /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g 2015-04-07 05:58:03

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGLIST", "ASSIGN", "AVANZAR", "BOOLEAN", "COMMENT", "DIV", "DMOTOR", "DO", "DSENSOR", "ELSE", "ENDFUNC", "ENDIF", "ENDWHILE", "EQUAL", "ESC_SEQ", "FALSE", "FUNC", "FUNCALL", "GE", "GETCOLOR", "GETTOUCH", "GETULTRA", "GMOTOR", "GSENSOR", "GT", "ID", "IF", "INT", "LE", "LIST_FUNCTIONS", "LIST_INSTR", "LT", "MGETTER", "MINUS", "MOD", "MOTOR", "MSETTER", "MUL", "NOT", "NOT_EQUAL", "OR", "PARAMS", "PARAR", "PLUS", "PREF", "PVALUE", "READ", "RETURN", "SENSOR", "SLEEP", "SMOTOR", "SSLEEP", "STRING", "THEN", "TIPO", "TRUE", "VOID", "WHILE", "WRITE", "WS", "'('", "')'", "','", "'.'", "';'"
    };

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
    public String getGrammarFileName() { return "/home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:65:1: prog : ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) ;
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
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:65:9: ( ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:65:11: ( func )+ EOF
            {
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:65:11: ( func )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==TIPO||LA1_0==VOID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:65:11: func
            	    {
            	    pushFollow(FOLLOW_func_in_prog275);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog278);  
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
            // 65:21: -> ^( LIST_FUNCTIONS ( func )+ )
            {
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:65:24: ^( LIST_FUNCTIONS ( func )+ )
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
    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:69:1: func : ( TIPO ID params block_instructions return_stmt ENDFUNC -> ^( FUNC TIPO ID params block_instructions return_stmt ) | VOID ID params block_instructions ENDFUNC -> ^( FUNC VOID ID params block_instructions ) );
    public final AslParser.func_return func() throws RecognitionException {
        AslParser.func_return retval = new AslParser.func_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token TIPO3=null;
        Token ID4=null;
        Token ENDFUNC8=null;
        Token VOID9=null;
        Token ID10=null;
        Token ENDFUNC13=null;
        AslParser.params_return params5 =null;

        AslParser.block_instructions_return block_instructions6 =null;

        AslParser.return_stmt_return return_stmt7 =null;

        AslParser.params_return params11 =null;

        AslParser.block_instructions_return block_instructions12 =null;


        AslTree TIPO3_tree=null;
        AslTree ID4_tree=null;
        AslTree ENDFUNC8_tree=null;
        AslTree VOID9_tree=null;
        AslTree ID10_tree=null;
        AslTree ENDFUNC13_tree=null;
        RewriteRuleTokenStream stream_ENDFUNC=new RewriteRuleTokenStream(adaptor,"token ENDFUNC");
        RewriteRuleTokenStream stream_TIPO=new RewriteRuleTokenStream(adaptor,"token TIPO");
        RewriteRuleTokenStream stream_VOID=new RewriteRuleTokenStream(adaptor,"token VOID");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_return_stmt=new RewriteRuleSubtreeStream(adaptor,"rule return_stmt");
        RewriteRuleSubtreeStream stream_block_instructions=new RewriteRuleSubtreeStream(adaptor,"rule block_instructions");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try {
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:69:9: ( TIPO ID params block_instructions return_stmt ENDFUNC -> ^( FUNC TIPO ID params block_instructions return_stmt ) | VOID ID params block_instructions ENDFUNC -> ^( FUNC VOID ID params block_instructions ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==TIPO) ) {
                alt2=1;
            }
            else if ( (LA2_0==VOID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:69:11: TIPO ID params block_instructions return_stmt ENDFUNC
                    {
                    TIPO3=(Token)match(input,TIPO,FOLLOW_TIPO_in_func320);  
                    stream_TIPO.add(TIPO3);


                    ID4=(Token)match(input,ID,FOLLOW_ID_in_func322);  
                    stream_ID.add(ID4);


                    pushFollow(FOLLOW_params_in_func324);
                    params5=params();

                    state._fsp--;

                    stream_params.add(params5.getTree());

                    pushFollow(FOLLOW_block_instructions_in_func326);
                    block_instructions6=block_instructions();

                    state._fsp--;

                    stream_block_instructions.add(block_instructions6.getTree());

                    pushFollow(FOLLOW_return_stmt_in_func328);
                    return_stmt7=return_stmt();

                    state._fsp--;

                    stream_return_stmt.add(return_stmt7.getTree());

                    ENDFUNC8=(Token)match(input,ENDFUNC,FOLLOW_ENDFUNC_in_func330);  
                    stream_ENDFUNC.add(ENDFUNC8);


                    // AST REWRITE
                    // elements: return_stmt, ID, TIPO, params, block_instructions
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 69:65: -> ^( FUNC TIPO ID params block_instructions return_stmt )
                    {
                        // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:69:68: ^( FUNC TIPO ID params block_instructions return_stmt )
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
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:70:11: VOID ID params block_instructions ENDFUNC
                    {
                    VOID9=(Token)match(input,VOID,FOLLOW_VOID_in_func358);  
                    stream_VOID.add(VOID9);


                    ID10=(Token)match(input,ID,FOLLOW_ID_in_func360);  
                    stream_ID.add(ID10);


                    pushFollow(FOLLOW_params_in_func362);
                    params11=params();

                    state._fsp--;

                    stream_params.add(params11.getTree());

                    pushFollow(FOLLOW_block_instructions_in_func364);
                    block_instructions12=block_instructions();

                    state._fsp--;

                    stream_block_instructions.add(block_instructions12.getTree());

                    ENDFUNC13=(Token)match(input,ENDFUNC,FOLLOW_ENDFUNC_in_func366);  
                    stream_ENDFUNC.add(ENDFUNC13);


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
                    // 70:53: -> ^( FUNC VOID ID params block_instructions )
                    {
                        // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:70:56: ^( FUNC VOID ID params block_instructions )
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
    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:74:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
    public final AslParser.params_return params() throws RecognitionException {
        AslParser.params_return retval = new AslParser.params_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal14=null;
        Token char_literal16=null;
        AslParser.paramlist_return paramlist15 =null;


        AslTree char_literal14_tree=null;
        AslTree char_literal16_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:74:9: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:74:11: '(' ( paramlist )? ')'
            {
            char_literal14=(Token)match(input,65,FOLLOW_65_in_params399);  
            stream_65.add(char_literal14);


            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:74:15: ( paramlist )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==TIPO) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:74:15: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params401);
                    paramlist15=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist15.getTree());

                    }
                    break;

            }


            char_literal16=(Token)match(input,66,FOLLOW_66_in_params404);  
            stream_66.add(char_literal16);


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
            // 74:30: -> ^( PARAMS ( paramlist )? )
            {
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:74:33: ^( PARAMS ( paramlist )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:74:42: ( paramlist )?
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
    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:78:1: paramlist : param ( ',' ! param )* ;
    public final AslParser.paramlist_return paramlist() throws RecognitionException {
        AslParser.paramlist_return retval = new AslParser.paramlist_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal18=null;
        AslParser.param_return param17 =null;

        AslParser.param_return param19 =null;


        AslTree char_literal18_tree=null;

        try {
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:79:9: ( param ( ',' ! param )* )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:79:11: param ( ',' ! param )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist439);
            param17=param();

            state._fsp--;

            adaptor.addChild(root_0, param17.getTree());

            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:79:17: ( ',' ! param )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==67) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:79:18: ',' ! param
            	    {
            	    char_literal18=(Token)match(input,67,FOLLOW_67_in_paramlist442); 

            	    pushFollow(FOLLOW_param_in_paramlist445);
            	    param19=param();

            	    state._fsp--;

            	    adaptor.addChild(root_0, param19.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:84:1: param : TIPO id= ID -> ^( PVALUE TIPO ID ) ;
    public final AslParser.param_return param() throws RecognitionException {
        AslParser.param_return retval = new AslParser.param_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token id=null;
        Token TIPO20=null;

        AslTree id_tree=null;
        AslTree TIPO20_tree=null;
        RewriteRuleTokenStream stream_TIPO=new RewriteRuleTokenStream(adaptor,"token TIPO");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:84:9: ( TIPO id= ID -> ^( PVALUE TIPO ID ) )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:84:11: TIPO id= ID
            {
            TIPO20=(Token)match(input,TIPO,FOLLOW_TIPO_in_param468);  
            stream_TIPO.add(TIPO20);


            id=(Token)match(input,ID,FOLLOW_ID_in_param472);  
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
            // 84:22: -> ^( PVALUE TIPO ID )
            {
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:84:25: ^( PVALUE TIPO ID )
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
    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:88:1: block_instructions : instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) ;
    public final AslParser.block_instructions_return block_instructions() throws RecognitionException {
        AslParser.block_instructions_return retval = new AslParser.block_instructions_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal22=null;
        AslParser.instruction_return instruction21 =null;

        AslParser.instruction_return instruction23 =null;


        AslTree char_literal22_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:89:9: ( instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:89:11: instruction ( ';' instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions508);
            instruction21=instruction();

            state._fsp--;

            stream_instruction.add(instruction21.getTree());

            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:89:23: ( ';' instruction )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==69) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:89:24: ';' instruction
            	    {
            	    char_literal22=(Token)match(input,69,FOLLOW_69_in_block_instructions511);  
            	    stream_69.add(char_literal22);


            	    pushFollow(FOLLOW_instruction_in_block_instructions513);
            	    instruction23=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction23.getTree());

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
            // 89:42: -> ^( LIST_INSTR ( instruction )+ )
            {
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:89:45: ^( LIST_INSTR ( instruction )+ )
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
    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:93:1: instruction : ( assign | ite_stmt | while_stmt | funcall | read | write || motor | sleep );
    public final AslParser.instruction_return instruction() throws RecognitionException {
        AslParser.instruction_return retval = new AslParser.instruction_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.assign_return assign24 =null;

        AslParser.ite_stmt_return ite_stmt25 =null;

        AslParser.while_stmt_return while_stmt26 =null;

        AslParser.funcall_return funcall27 =null;

        AslParser.read_return read28 =null;

        AslParser.write_return write29 =null;

        AslParser.motor_return motor30 =null;

        AslParser.sleep_return sleep31 =null;



        try {
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:94:9: ( assign | ite_stmt | while_stmt | funcall | read | write || motor | sleep )
            int alt6=9;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case 65:
                    {
                    alt6=4;
                    }
                    break;
                case 68:
                    {
                    alt6=8;
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
            case READ:
                {
                alt6=5;
                }
                break;
            case WRITE:
                {
                alt6=6;
                }
                break;
            case ELSE:
            case ENDFUNC:
            case ENDIF:
            case ENDWHILE:
            case RETURN:
            case 69:
                {
                alt6=7;
                }
                break;
            case SLEEP:
                {
                alt6=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:94:11: assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction550);
                    assign24=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign24.getTree());

                    }
                    break;
                case 2 :
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:95:11: ite_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction570);
                    ite_stmt25=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt25.getTree());

                    }
                    break;
                case 3 :
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:96:11: while_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction588);
                    while_stmt26=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt26.getTree());

                    }
                    break;
                case 4 :
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:97:11: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction604);
                    funcall27=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall27.getTree());

                    }
                    break;
                case 5 :
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:98:11: read
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_read_in_instruction623);
                    read28=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read28.getTree());

                    }
                    break;
                case 6 :
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:99:11: write
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_write_in_instruction645);
                    write29=write();

                    state._fsp--;

                    adaptor.addChild(root_0, write29.getTree());

                    }
                    break;
                case 7 :
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:101:9: 
                    {
                    root_0 = (AslTree)adaptor.nil();


                    }
                    break;
                case 8 :
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:101:11: motor
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_motor_in_instruction691);
                    motor30=motor();

                    state._fsp--;

                    adaptor.addChild(root_0, motor30.getTree());

                    }
                    break;
                case 9 :
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:102:11: sleep
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_sleep_in_instruction712);
                    sleep31=sleep();

                    state._fsp--;

                    adaptor.addChild(root_0, sleep31.getTree());

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
    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:105:1: motor : ( ID '.' AVANZAR '(' ( expr )? ')' -> ^( SMOTOR AVANZAR ID ( expr )? ) | ID '.' PARAR '(' ')' -> ^( SMOTOR PARAR ID ) | ID '.' MSETTER '(' expr ')' -> ^( SMOTOR MSETTER ID expr ) );
    public final AslParser.motor_return motor() throws RecognitionException {
        AslParser.motor_return retval = new AslParser.motor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID32=null;
        Token char_literal33=null;
        Token AVANZAR34=null;
        Token char_literal35=null;
        Token char_literal37=null;
        Token ID38=null;
        Token char_literal39=null;
        Token PARAR40=null;
        Token char_literal41=null;
        Token char_literal42=null;
        Token ID43=null;
        Token char_literal44=null;
        Token MSETTER45=null;
        Token char_literal46=null;
        Token char_literal48=null;
        AslParser.expr_return expr36 =null;

        AslParser.expr_return expr47 =null;


        AslTree ID32_tree=null;
        AslTree char_literal33_tree=null;
        AslTree AVANZAR34_tree=null;
        AslTree char_literal35_tree=null;
        AslTree char_literal37_tree=null;
        AslTree ID38_tree=null;
        AslTree char_literal39_tree=null;
        AslTree PARAR40_tree=null;
        AslTree char_literal41_tree=null;
        AslTree char_literal42_tree=null;
        AslTree ID43_tree=null;
        AslTree char_literal44_tree=null;
        AslTree MSETTER45_tree=null;
        AslTree char_literal46_tree=null;
        AslTree char_literal48_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_MSETTER=new RewriteRuleTokenStream(adaptor,"token MSETTER");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_AVANZAR=new RewriteRuleTokenStream(adaptor,"token AVANZAR");
        RewriteRuleTokenStream stream_PARAR=new RewriteRuleTokenStream(adaptor,"token PARAR");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:105:9: ( ID '.' AVANZAR '(' ( expr )? ')' -> ^( SMOTOR AVANZAR ID ( expr )? ) | ID '.' PARAR '(' ')' -> ^( SMOTOR PARAR ID ) | ID '.' MSETTER '(' expr ')' -> ^( SMOTOR MSETTER ID expr ) )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==68) ) {
                    switch ( input.LA(3) ) {
                    case AVANZAR:
                        {
                        alt8=1;
                        }
                        break;
                    case PARAR:
                        {
                        alt8=2;
                        }
                        break;
                    case MSETTER:
                        {
                        alt8=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 2, input);

                        throw nvae;

                    }

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
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:105:11: ID '.' AVANZAR '(' ( expr )? ')'
                    {
                    ID32=(Token)match(input,ID,FOLLOW_ID_in_motor741);  
                    stream_ID.add(ID32);


                    char_literal33=(Token)match(input,68,FOLLOW_68_in_motor743);  
                    stream_68.add(char_literal33);


                    AVANZAR34=(Token)match(input,AVANZAR,FOLLOW_AVANZAR_in_motor745);  
                    stream_AVANZAR.add(AVANZAR34);


                    char_literal35=(Token)match(input,65,FOLLOW_65_in_motor747);  
                    stream_65.add(char_literal35);


                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:105:30: ( expr )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==FALSE||LA7_0==ID||LA7_0==INT||LA7_0==MINUS||LA7_0==MOTOR||LA7_0==NOT||LA7_0==PLUS||LA7_0==SENSOR||LA7_0==TRUE||LA7_0==65) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:105:30: expr
                            {
                            pushFollow(FOLLOW_expr_in_motor749);
                            expr36=expr();

                            state._fsp--;

                            stream_expr.add(expr36.getTree());

                            }
                            break;

                    }


                    char_literal37=(Token)match(input,66,FOLLOW_66_in_motor752);  
                    stream_66.add(char_literal37);


                    // AST REWRITE
                    // elements: expr, ID, AVANZAR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 105:40: -> ^( SMOTOR AVANZAR ID ( expr )? )
                    {
                        // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:105:43: ^( SMOTOR AVANZAR ID ( expr )? )
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

                        // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:105:63: ( expr )?
                        if ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:106:11: ID '.' PARAR '(' ')'
                    {
                    ID38=(Token)match(input,ID,FOLLOW_ID_in_motor777);  
                    stream_ID.add(ID38);


                    char_literal39=(Token)match(input,68,FOLLOW_68_in_motor779);  
                    stream_68.add(char_literal39);


                    PARAR40=(Token)match(input,PARAR,FOLLOW_PARAR_in_motor781);  
                    stream_PARAR.add(PARAR40);


                    char_literal41=(Token)match(input,65,FOLLOW_65_in_motor783);  
                    stream_65.add(char_literal41);


                    char_literal42=(Token)match(input,66,FOLLOW_66_in_motor784);  
                    stream_66.add(char_literal42);


                    // AST REWRITE
                    // elements: ID, PARAR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 106:31: -> ^( SMOTOR PARAR ID )
                    {
                        // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:106:34: ^( SMOTOR PARAR ID )
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
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:107:11: ID '.' MSETTER '(' expr ')'
                    {
                    ID43=(Token)match(input,ID,FOLLOW_ID_in_motor806);  
                    stream_ID.add(ID43);


                    char_literal44=(Token)match(input,68,FOLLOW_68_in_motor808);  
                    stream_68.add(char_literal44);


                    MSETTER45=(Token)match(input,MSETTER,FOLLOW_MSETTER_in_motor810);  
                    stream_MSETTER.add(MSETTER45);


                    char_literal46=(Token)match(input,65,FOLLOW_65_in_motor812);  
                    stream_65.add(char_literal46);


                    pushFollow(FOLLOW_expr_in_motor814);
                    expr47=expr();

                    state._fsp--;

                    stream_expr.add(expr47.getTree());

                    char_literal48=(Token)match(input,66,FOLLOW_66_in_motor816);  
                    stream_66.add(char_literal48);


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
                    // 107:39: -> ^( SMOTOR MSETTER ID expr )
                    {
                        // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:107:42: ^( SMOTOR MSETTER ID expr )
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
    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:110:1: sleep : SLEEP '(' expr ')' -> ^( SSLEEP expr ) ;
    public final AslParser.sleep_return sleep() throws RecognitionException {
        AslParser.sleep_return retval = new AslParser.sleep_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token SLEEP49=null;
        Token char_literal50=null;
        Token char_literal52=null;
        AslParser.expr_return expr51 =null;


        AslTree SLEEP49_tree=null;
        AslTree char_literal50_tree=null;
        AslTree char_literal52_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_SLEEP=new RewriteRuleTokenStream(adaptor,"token SLEEP");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:110:9: ( SLEEP '(' expr ')' -> ^( SSLEEP expr ) )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:110:11: SLEEP '(' expr ')'
            {
            SLEEP49=(Token)match(input,SLEEP,FOLLOW_SLEEP_in_sleep855);  
            stream_SLEEP.add(SLEEP49);


            char_literal50=(Token)match(input,65,FOLLOW_65_in_sleep857);  
            stream_65.add(char_literal50);


            pushFollow(FOLLOW_expr_in_sleep859);
            expr51=expr();

            state._fsp--;

            stream_expr.add(expr51.getTree());

            char_literal52=(Token)match(input,66,FOLLOW_66_in_sleep861);  
            stream_66.add(char_literal52);


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
            // 110:30: -> ^( SSLEEP expr )
            {
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:110:33: ^( SSLEEP expr )
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
    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:114:1: assign : esq eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] esq expr ) ;
    public final AslParser.assign_return assign() throws RecognitionException {
        AslParser.assign_return retval = new AslParser.assign_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        AslParser.esq_return esq53 =null;

        AslParser.expr_return expr54 =null;


        AslTree eq_tree=null;
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_esq=new RewriteRuleSubtreeStream(adaptor,"rule esq");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:114:9: ( esq eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] esq expr ) )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:114:11: esq eq= EQUAL expr
            {
            pushFollow(FOLLOW_esq_in_assign888);
            esq53=esq();

            state._fsp--;

            stream_esq.add(esq53.getTree());

            eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign892);  
            stream_EQUAL.add(eq);


            pushFollow(FOLLOW_expr_in_assign894);
            expr54=expr();

            state._fsp--;

            stream_expr.add(expr54.getTree());

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
            // 114:29: -> ^( ASSIGN[$eq,\":=\"] esq expr )
            {
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:114:32: ^( ASSIGN[$eq,\":=\"] esq expr )
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
    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:117:1: esq : ID ;
    public final AslParser.esq_return esq() throws RecognitionException {
        AslParser.esq_return retval = new AslParser.esq_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID55=null;

        AslTree ID55_tree=null;

        try {
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:117:9: ( ID )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:117:11: ID
            {
            root_0 = (AslTree)adaptor.nil();


            ID55=(Token)match(input,ID,FOLLOW_ID_in_esq934); 
            ID55_tree = 
            (AslTree)adaptor.create(ID55)
            ;
            adaptor.addChild(root_0, ID55_tree);


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
    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:121:1: ite_stmt : IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !;
    public final AslParser.ite_stmt_return ite_stmt() throws RecognitionException {
        AslParser.ite_stmt_return retval = new AslParser.ite_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token IF56=null;
        Token THEN58=null;
        Token ELSE60=null;
        Token ENDIF62=null;
        AslParser.expr_return expr57 =null;

        AslParser.block_instructions_return block_instructions59 =null;

        AslParser.block_instructions_return block_instructions61 =null;


        AslTree IF56_tree=null;
        AslTree THEN58_tree=null;
        AslTree ELSE60_tree=null;
        AslTree ENDIF62_tree=null;

        try {
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:121:9: ( IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !)
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:121:11: IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !
            {
            root_0 = (AslTree)adaptor.nil();


            IF56=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt951); 
            IF56_tree = 
            (AslTree)adaptor.create(IF56)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF56_tree, root_0);


            pushFollow(FOLLOW_expr_in_ite_stmt954);
            expr57=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr57.getTree());

            THEN58=(Token)match(input,THEN,FOLLOW_THEN_in_ite_stmt956); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt959);
            block_instructions59=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions59.getTree());

            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:121:45: ( ELSE ! block_instructions )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ELSE) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:121:46: ELSE ! block_instructions
                    {
                    ELSE60=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt962); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt965);
                    block_instructions61=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions61.getTree());

                    }
                    break;

            }


            ENDIF62=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ite_stmt969); 

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
    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:125:1: while_stmt : WHILE ^ expr DO ! block_instructions ENDWHILE !;
    public final AslParser.while_stmt_return while_stmt() throws RecognitionException {
        AslParser.while_stmt_return retval = new AslParser.while_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WHILE63=null;
        Token DO65=null;
        Token ENDWHILE67=null;
        AslParser.expr_return expr64 =null;

        AslParser.block_instructions_return block_instructions66 =null;


        AslTree WHILE63_tree=null;
        AslTree DO65_tree=null;
        AslTree ENDWHILE67_tree=null;

        try {
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:126:9: ( WHILE ^ expr DO ! block_instructions ENDWHILE !)
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:126:11: WHILE ^ expr DO ! block_instructions ENDWHILE !
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE63=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt996); 
            WHILE63_tree = 
            (AslTree)adaptor.create(WHILE63)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE63_tree, root_0);


            pushFollow(FOLLOW_expr_in_while_stmt999);
            expr64=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr64.getTree());

            DO65=(Token)match(input,DO,FOLLOW_DO_in_while_stmt1001); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt1004);
            block_instructions66=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions66.getTree());

            ENDWHILE67=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_while_stmt1006); 

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
    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:130:1: return_stmt : RETURN ^ expr ;
    public final AslParser.return_stmt_return return_stmt() throws RecognitionException {
        AslParser.return_stmt_return retval = new AslParser.return_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RETURN68=null;
        AslParser.expr_return expr69 =null;


        AslTree RETURN68_tree=null;

        try {
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:131:9: ( RETURN ^ expr )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:131:11: RETURN ^ expr
            {
            root_0 = (AslTree)adaptor.nil();


            RETURN68=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt1033); 
            RETURN68_tree = 
            (AslTree)adaptor.create(RETURN68)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RETURN68_tree, root_0);


            pushFollow(FOLLOW_expr_in_return_stmt1036);
            expr69=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr69.getTree());

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
    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:135:1: read : READ ^ esq ;
    public final AslParser.read_return read() throws RecognitionException {
        AslParser.read_return retval = new AslParser.read_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token READ70=null;
        AslParser.esq_return esq71 =null;


        AslTree READ70_tree=null;

        try {
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:135:9: ( READ ^ esq )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:135:11: READ ^ esq
            {
            root_0 = (AslTree)adaptor.nil();


            READ70=(Token)match(input,READ,FOLLOW_READ_in_read1057); 
            READ70_tree = 
            (AslTree)adaptor.create(READ70)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(READ70_tree, root_0);


            pushFollow(FOLLOW_esq_in_read1060);
            esq71=esq();

            state._fsp--;

            adaptor.addChild(root_0, esq71.getTree());

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
    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:139:1: write : WRITE ^ ( expr | STRING ) ;
    public final AslParser.write_return write() throws RecognitionException {
        AslParser.write_return retval = new AslParser.write_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WRITE72=null;
        Token STRING74=null;
        AslParser.expr_return expr73 =null;


        AslTree WRITE72_tree=null;
        AslTree STRING74_tree=null;

        try {
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:139:9: ( WRITE ^ ( expr | STRING ) )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:139:11: WRITE ^ ( expr | STRING )
            {
            root_0 = (AslTree)adaptor.nil();


            WRITE72=(Token)match(input,WRITE,FOLLOW_WRITE_in_write1080); 
            WRITE72_tree = 
            (AslTree)adaptor.create(WRITE72)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WRITE72_tree, root_0);


            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:139:18: ( expr | STRING )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==FALSE||LA10_0==ID||LA10_0==INT||LA10_0==MINUS||LA10_0==MOTOR||LA10_0==NOT||LA10_0==PLUS||LA10_0==SENSOR||LA10_0==TRUE||LA10_0==65) ) {
                alt10=1;
            }
            else if ( (LA10_0==STRING) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:139:19: expr
                    {
                    pushFollow(FOLLOW_expr_in_write1084);
                    expr73=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr73.getTree());

                    }
                    break;
                case 2 :
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:139:26: STRING
                    {
                    STRING74=(Token)match(input,STRING,FOLLOW_STRING_in_write1088); 
                    STRING74_tree = 
                    (AslTree)adaptor.create(STRING74)
                    ;
                    adaptor.addChild(root_0, STRING74_tree);


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
    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:143:1: expr : boolterm ( OR ^ boolterm )* ;
    public final AslParser.expr_return expr() throws RecognitionException {
        AslParser.expr_return retval = new AslParser.expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OR76=null;
        AslParser.boolterm_return boolterm75 =null;

        AslParser.boolterm_return boolterm77 =null;


        AslTree OR76_tree=null;

        try {
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:143:9: ( boolterm ( OR ^ boolterm )* )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:143:11: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr1111);
            boolterm75=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm75.getTree());

            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:143:20: ( OR ^ boolterm )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==OR) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:143:21: OR ^ boolterm
            	    {
            	    OR76=(Token)match(input,OR,FOLLOW_OR_in_expr1114); 
            	    OR76_tree = 
            	    (AslTree)adaptor.create(OR76)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR76_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr1117);
            	    boolterm77=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm77.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:146:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final AslParser.boolterm_return boolterm() throws RecognitionException {
        AslParser.boolterm_return retval = new AslParser.boolterm_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token AND79=null;
        AslParser.boolfact_return boolfact78 =null;

        AslParser.boolfact_return boolfact80 =null;


        AslTree AND79_tree=null;

        try {
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:146:9: ( boolfact ( AND ^ boolfact )* )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:146:11: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm1135);
            boolfact78=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact78.getTree());

            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:146:20: ( AND ^ boolfact )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==AND) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:146:21: AND ^ boolfact
            	    {
            	    AND79=(Token)match(input,AND,FOLLOW_AND_in_boolterm1138); 
            	    AND79_tree = 
            	    (AslTree)adaptor.create(AND79)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND79_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm1141);
            	    boolfact80=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact80.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:149:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final AslParser.boolfact_return boolfact() throws RecognitionException {
        AslParser.boolfact_return retval = new AslParser.boolfact_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EQUAL82=null;
        Token NOT_EQUAL83=null;
        Token LT84=null;
        Token LE85=null;
        Token GT86=null;
        Token GE87=null;
        AslParser.num_expr_return num_expr81 =null;

        AslParser.num_expr_return num_expr88 =null;


        AslTree EQUAL82_tree=null;
        AslTree NOT_EQUAL83_tree=null;
        AslTree LT84_tree=null;
        AslTree LE85_tree=null;
        AslTree GT86_tree=null;
        AslTree GE87_tree=null;

        try {
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:149:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:149:11: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact1159);
            num_expr81=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr81.getTree());

            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:149:20: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==EQUAL||LA14_0==GE||LA14_0==GT||LA14_0==LE||LA14_0==LT||LA14_0==NOT_EQUAL) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:149:21: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:149:21: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt13=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt13=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt13=2;
                        }
                        break;
                    case LT:
                        {
                        alt13=3;
                        }
                        break;
                    case LE:
                        {
                        alt13=4;
                        }
                        break;
                    case GT:
                        {
                        alt13=5;
                        }
                        break;
                    case GE:
                        {
                        alt13=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;

                    }

                    switch (alt13) {
                        case 1 :
                            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:149:22: EQUAL ^
                            {
                            EQUAL82=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact1163); 
                            EQUAL82_tree = 
                            (AslTree)adaptor.create(EQUAL82)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(EQUAL82_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:149:31: NOT_EQUAL ^
                            {
                            NOT_EQUAL83=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact1168); 
                            NOT_EQUAL83_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL83)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL83_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:149:44: LT ^
                            {
                            LT84=(Token)match(input,LT,FOLLOW_LT_in_boolfact1173); 
                            LT84_tree = 
                            (AslTree)adaptor.create(LT84)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT84_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:149:50: LE ^
                            {
                            LE85=(Token)match(input,LE,FOLLOW_LE_in_boolfact1178); 
                            LE85_tree = 
                            (AslTree)adaptor.create(LE85)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE85_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:149:56: GT ^
                            {
                            GT86=(Token)match(input,GT,FOLLOW_GT_in_boolfact1183); 
                            GT86_tree = 
                            (AslTree)adaptor.create(GT86)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT86_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:149:62: GE ^
                            {
                            GE87=(Token)match(input,GE,FOLLOW_GE_in_boolfact1188); 
                            GE87_tree = 
                            (AslTree)adaptor.create(GE87)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE87_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact1192);
                    num_expr88=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr88.getTree());

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
    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:152:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final AslParser.num_expr_return num_expr() throws RecognitionException {
        AslParser.num_expr_return retval = new AslParser.num_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PLUS90=null;
        Token MINUS91=null;
        AslParser.term_return term89 =null;

        AslParser.term_return term92 =null;


        AslTree PLUS90_tree=null;
        AslTree MINUS91_tree=null;

        try {
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:152:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:152:11: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr1210);
            term89=term();

            state._fsp--;

            adaptor.addChild(root_0, term89.getTree());

            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:152:16: ( ( PLUS ^| MINUS ^) term )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==MINUS||LA16_0==PLUS) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:152:18: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:152:18: ( PLUS ^| MINUS ^)
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==PLUS) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==MINUS) ) {
            	        alt15=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:152:19: PLUS ^
            	            {
            	            PLUS90=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr1215); 
            	            PLUS90_tree = 
            	            (AslTree)adaptor.create(PLUS90)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS90_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:152:27: MINUS ^
            	            {
            	            MINUS91=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr1220); 
            	            MINUS91_tree = 
            	            (AslTree)adaptor.create(MINUS91)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS91_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr1224);
            	    term92=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term92.getTree());

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
    // $ANTLR end "num_expr"


    public static class term_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:155:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final AslParser.term_return term() throws RecognitionException {
        AslParser.term_return retval = new AslParser.term_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MUL94=null;
        Token DIV95=null;
        Token MOD96=null;
        AslParser.factor_return factor93 =null;

        AslParser.factor_return factor97 =null;


        AslTree MUL94_tree=null;
        AslTree DIV95_tree=null;
        AslTree MOD96_tree=null;

        try {
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:155:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:155:11: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1246);
            factor93=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor93.getTree());

            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:155:18: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==DIV||LA18_0==MOD||LA18_0==MUL) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:155:20: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:155:20: ( MUL ^| DIV ^| MOD ^)
            	    int alt17=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt17=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt17=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt17=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt17) {
            	        case 1 :
            	            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:155:21: MUL ^
            	            {
            	            MUL94=(Token)match(input,MUL,FOLLOW_MUL_in_term1251); 
            	            MUL94_tree = 
            	            (AslTree)adaptor.create(MUL94)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MUL94_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:155:28: DIV ^
            	            {
            	            DIV95=(Token)match(input,DIV,FOLLOW_DIV_in_term1256); 
            	            DIV95_tree = 
            	            (AslTree)adaptor.create(DIV95)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV95_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:155:35: MOD ^
            	            {
            	            MOD96=(Token)match(input,MOD,FOLLOW_MOD_in_term1261); 
            	            MOD96_tree = 
            	            (AslTree)adaptor.create(MOD96)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD96_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1265);
            	    factor97=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor97.getTree());

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
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:158:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final AslParser.factor_return factor() throws RecognitionException {
        AslParser.factor_return retval = new AslParser.factor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOT98=null;
        Token PLUS99=null;
        Token MINUS100=null;
        AslParser.atom_return atom101 =null;


        AslTree NOT98_tree=null;
        AslTree PLUS99_tree=null;
        AslTree MINUS100_tree=null;

        try {
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:158:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:158:11: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AslTree)adaptor.nil();


            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:158:11: ( NOT ^| PLUS ^| MINUS ^)?
            int alt19=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt19=1;
                    }
                    break;
                case PLUS:
                    {
                    alt19=2;
                    }
                    break;
                case MINUS:
                    {
                    alt19=3;
                    }
                    break;
            }

            switch (alt19) {
                case 1 :
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:158:12: NOT ^
                    {
                    NOT98=(Token)match(input,NOT,FOLLOW_NOT_in_factor1286); 
                    NOT98_tree = 
                    (AslTree)adaptor.create(NOT98)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOT98_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:158:19: PLUS ^
                    {
                    PLUS99=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1291); 
                    PLUS99_tree = 
                    (AslTree)adaptor.create(PLUS99)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLUS99_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:158:27: MINUS ^
                    {
                    MINUS100=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1296); 
                    MINUS100_tree = 
                    (AslTree)adaptor.create(MINUS100)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MINUS100_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1301);
            atom101=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom101.getTree());

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
    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:164:1: atom : ( ID | INT |m= MOTOR '(' b= INT ')' -> ^( DMOTOR[m, \"MOTOR\"+$b.text] ) |s= SENSOR '(' b= INT ')' -> ^( DSENSOR[s, $s.text+$b.text] ) | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !| ID '.' (b= GETCOLOR |b= GETULTRA |b= GETTOUCH ) '(' ')' -> ^( GSENSOR $b ID ) | ID '.' b= MGETTER '(' ')' -> ^( GMOTOR $b ID ) );
    public final AslParser.atom_return atom() throws RecognitionException {
        AslParser.atom_return retval = new AslParser.atom_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token m=null;
        Token b=null;
        Token s=null;
        Token ID102=null;
        Token INT103=null;
        Token char_literal104=null;
        Token char_literal105=null;
        Token char_literal106=null;
        Token char_literal107=null;
        Token char_literal109=null;
        Token char_literal111=null;
        Token ID112=null;
        Token char_literal113=null;
        Token char_literal114=null;
        Token char_literal115=null;
        Token ID116=null;
        Token char_literal117=null;
        Token char_literal118=null;
        Token char_literal119=null;
        AslParser.funcall_return funcall108 =null;

        AslParser.expr_return expr110 =null;


        AslTree m_tree=null;
        AslTree b_tree=null;
        AslTree s_tree=null;
        AslTree ID102_tree=null;
        AslTree INT103_tree=null;
        AslTree char_literal104_tree=null;
        AslTree char_literal105_tree=null;
        AslTree char_literal106_tree=null;
        AslTree char_literal107_tree=null;
        AslTree char_literal109_tree=null;
        AslTree char_literal111_tree=null;
        AslTree ID112_tree=null;
        AslTree char_literal113_tree=null;
        AslTree char_literal114_tree=null;
        AslTree char_literal115_tree=null;
        AslTree ID116_tree=null;
        AslTree char_literal117_tree=null;
        AslTree char_literal118_tree=null;
        AslTree char_literal119_tree=null;
        RewriteRuleTokenStream stream_SENSOR=new RewriteRuleTokenStream(adaptor,"token SENSOR");
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_GETCOLOR=new RewriteRuleTokenStream(adaptor,"token GETCOLOR");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_GETTOUCH=new RewriteRuleTokenStream(adaptor,"token GETTOUCH");
        RewriteRuleTokenStream stream_MOTOR=new RewriteRuleTokenStream(adaptor,"token MOTOR");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_MGETTER=new RewriteRuleTokenStream(adaptor,"token MGETTER");
        RewriteRuleTokenStream stream_GETULTRA=new RewriteRuleTokenStream(adaptor,"token GETULTRA");

        try {
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:164:9: ( ID | INT |m= MOTOR '(' b= INT ')' -> ^( DMOTOR[m, \"MOTOR\"+$b.text] ) |s= SENSOR '(' b= INT ')' -> ^( DSENSOR[s, $s.text+$b.text] ) | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !| ID '.' (b= GETCOLOR |b= GETULTRA |b= GETTOUCH ) '(' ')' -> ^( GSENSOR $b ID ) | ID '.' b= MGETTER '(' ')' -> ^( GMOTOR $b ID ) )
            int alt22=9;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case 65:
                    {
                    alt22=6;
                    }
                    break;
                case 68:
                    {
                    int LA22_8 = input.LA(3);

                    if ( (LA22_8==MGETTER) ) {
                        alt22=9;
                    }
                    else if ( ((LA22_8 >= GETCOLOR && LA22_8 <= GETULTRA)) ) {
                        alt22=8;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 8, input);

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
                case 66:
                case 67:
                case 69:
                    {
                    alt22=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;

                }

                }
                break;
            case INT:
                {
                alt22=2;
                }
                break;
            case MOTOR:
                {
                alt22=3;
                }
                break;
            case SENSOR:
                {
                alt22=4;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt22=5;
                }
                break;
            case 65:
                {
                alt22=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:164:11: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID102=(Token)match(input,ID,FOLLOW_ID_in_atom1324); 
                    ID102_tree = 
                    (AslTree)adaptor.create(ID102)
                    ;
                    adaptor.addChild(root_0, ID102_tree);


                    }
                    break;
                case 2 :
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:165:11: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT103=(Token)match(input,INT,FOLLOW_INT_in_atom1337); 
                    INT103_tree = 
                    (AslTree)adaptor.create(INT103)
                    ;
                    adaptor.addChild(root_0, INT103_tree);


                    }
                    break;
                case 3 :
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:166:11: m= MOTOR '(' b= INT ')'
                    {
                    m=(Token)match(input,MOTOR,FOLLOW_MOTOR_in_atom1351);  
                    stream_MOTOR.add(m);


                    char_literal104=(Token)match(input,65,FOLLOW_65_in_atom1353);  
                    stream_65.add(char_literal104);


                    b=(Token)match(input,INT,FOLLOW_INT_in_atom1357);  
                    stream_INT.add(b);


                    char_literal105=(Token)match(input,66,FOLLOW_66_in_atom1359);  
                    stream_66.add(char_literal105);


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
                    // 166:33: -> ^( DMOTOR[m, \"MOTOR\"+$b.text] )
                    {
                        // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:166:36: ^( DMOTOR[m, \"MOTOR\"+$b.text] )
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
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:167:11: s= SENSOR '(' b= INT ')'
                    {
                    s=(Token)match(input,SENSOR,FOLLOW_SENSOR_in_atom1380);  
                    stream_SENSOR.add(s);


                    char_literal106=(Token)match(input,65,FOLLOW_65_in_atom1382);  
                    stream_65.add(char_literal106);


                    b=(Token)match(input,INT,FOLLOW_INT_in_atom1386);  
                    stream_INT.add(b);


                    char_literal107=(Token)match(input,66,FOLLOW_66_in_atom1388);  
                    stream_66.add(char_literal107);


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
                    // 167:34: -> ^( DSENSOR[s, $s.text+$b.text] )
                    {
                        // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:167:37: ^( DSENSOR[s, $s.text+$b.text] )
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
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:168:11: (b= TRUE |b= FALSE )
                    {
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:168:11: (b= TRUE |b= FALSE )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==TRUE) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==FALSE) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;

                    }
                    switch (alt20) {
                        case 1 :
                            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:168:12: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1410);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:168:21: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1416);  
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
                    // 168:30: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:168:33: ^( BOOLEAN[$b,$b.text] )
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
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:169:11: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom1436);
                    funcall108=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall108.getTree());

                    }
                    break;
                case 7 :
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:170:11: '(' ! expr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    char_literal109=(Token)match(input,65,FOLLOW_65_in_atom1448); 

                    pushFollow(FOLLOW_expr_in_atom1451);
                    expr110=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr110.getTree());

                    char_literal111=(Token)match(input,66,FOLLOW_66_in_atom1453); 

                    }
                    break;
                case 8 :
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:171:11: ID '.' (b= GETCOLOR |b= GETULTRA |b= GETTOUCH ) '(' ')'
                    {
                    ID112=(Token)match(input,ID,FOLLOW_ID_in_atom1466);  
                    stream_ID.add(ID112);


                    char_literal113=(Token)match(input,68,FOLLOW_68_in_atom1468);  
                    stream_68.add(char_literal113);


                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:171:18: (b= GETCOLOR |b= GETULTRA |b= GETTOUCH )
                    int alt21=3;
                    switch ( input.LA(1) ) {
                    case GETCOLOR:
                        {
                        alt21=1;
                        }
                        break;
                    case GETULTRA:
                        {
                        alt21=2;
                        }
                        break;
                    case GETTOUCH:
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
                            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:171:19: b= GETCOLOR
                            {
                            b=(Token)match(input,GETCOLOR,FOLLOW_GETCOLOR_in_atom1473);  
                            stream_GETCOLOR.add(b);


                            }
                            break;
                        case 2 :
                            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:171:32: b= GETULTRA
                            {
                            b=(Token)match(input,GETULTRA,FOLLOW_GETULTRA_in_atom1479);  
                            stream_GETULTRA.add(b);


                            }
                            break;
                        case 3 :
                            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:171:45: b= GETTOUCH
                            {
                            b=(Token)match(input,GETTOUCH,FOLLOW_GETTOUCH_in_atom1485);  
                            stream_GETTOUCH.add(b);


                            }
                            break;

                    }


                    char_literal114=(Token)match(input,65,FOLLOW_65_in_atom1488);  
                    stream_65.add(char_literal114);


                    char_literal115=(Token)match(input,66,FOLLOW_66_in_atom1490);  
                    stream_66.add(char_literal115);


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
                    // 171:65: -> ^( GSENSOR $b ID )
                    {
                        // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:171:68: ^( GSENSOR $b ID )
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
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:172:11: ID '.' b= MGETTER '(' ')'
                    {
                    ID116=(Token)match(input,ID,FOLLOW_ID_in_atom1513);  
                    stream_ID.add(ID116);


                    char_literal117=(Token)match(input,68,FOLLOW_68_in_atom1514);  
                    stream_68.add(char_literal117);


                    b=(Token)match(input,MGETTER,FOLLOW_MGETTER_in_atom1518);  
                    stream_MGETTER.add(b);


                    char_literal118=(Token)match(input,65,FOLLOW_65_in_atom1520);  
                    stream_65.add(char_literal118);


                    char_literal119=(Token)match(input,66,FOLLOW_66_in_atom1522);  
                    stream_66.add(char_literal119);


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
                    // 172:35: -> ^( GMOTOR $b ID )
                    {
                        // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:172:38: ^( GMOTOR $b ID )
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
    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:176:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final AslParser.funcall_return funcall() throws RecognitionException {
        AslParser.funcall_return retval = new AslParser.funcall_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID120=null;
        Token char_literal121=null;
        Token char_literal123=null;
        AslParser.expr_list_return expr_list122 =null;


        AslTree ID120_tree=null;
        AslTree char_literal121_tree=null;
        AslTree char_literal123_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:176:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:176:11: ID '(' ( expr_list )? ')'
            {
            ID120=(Token)match(input,ID,FOLLOW_ID_in_funcall1552);  
            stream_ID.add(ID120);


            char_literal121=(Token)match(input,65,FOLLOW_65_in_funcall1554);  
            stream_65.add(char_literal121);


            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:176:18: ( expr_list )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==FALSE||LA23_0==ID||LA23_0==INT||LA23_0==MINUS||LA23_0==MOTOR||LA23_0==NOT||LA23_0==PLUS||LA23_0==SENSOR||LA23_0==TRUE||LA23_0==65) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:176:18: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall1556);
                    expr_list122=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list122.getTree());

                    }
                    break;

            }


            char_literal123=(Token)match(input,66,FOLLOW_66_in_funcall1559);  
            stream_66.add(char_literal123);


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
            // 176:33: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:176:36: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:176:49: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:176:59: ( expr_list )?
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
    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:180:1: expr_list : expr ( ',' ! expr )* ;
    public final AslParser.expr_list_return expr_list() throws RecognitionException {
        AslParser.expr_list_return retval = new AslParser.expr_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal125=null;
        AslParser.expr_return expr124 =null;

        AslParser.expr_return expr126 =null;


        AslTree char_literal125_tree=null;

        try {
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:180:10: ( expr ( ',' ! expr )* )
            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:180:12: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list1591);
            expr124=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr124.getTree());

            // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:180:17: ( ',' ! expr )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==67) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /home/jacknoddy/FIB/CL/robot-cl/Asl/src/parser/Asl.g:180:18: ',' ! expr
            	    {
            	    char_literal125=(Token)match(input,67,FOLLOW_67_in_expr_list1594); 

            	    pushFollow(FOLLOW_expr_in_expr_list1597);
            	    expr126=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr126.getTree());

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
    // $ANTLR end "expr_list"

    // Delegated rules


 

    public static final BitSet FOLLOW_func_in_prog275 = new BitSet(new long[]{0x2800000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIPO_in_func320 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_func322 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_params_in_func324 = new BitSet(new long[]{0xC0480000C0000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_block_instructions_in_func326 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_return_stmt_in_func328 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_func358 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_func360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_params_in_func362 = new BitSet(new long[]{0xC0480000C0000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_block_instructions_in_func364 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_params399 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_paramlist_in_params401 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_params404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist439 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_paramlist442 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_param_in_paramlist445 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_TIPO_in_param468 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_param472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions508 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_block_instructions511 = new BitSet(new long[]{0xC0480000C0000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_instruction_in_block_instructions513 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_assign_in_instruction550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_instruction645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_motor_in_instruction691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sleep_in_instruction712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_motor741 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_motor743 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_AVANZAR_in_motor745 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_motor747 = new BitSet(new long[]{0x1021094140100000L,0x0000000000000006L});
    public static final BitSet FOLLOW_expr_in_motor749 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_motor752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_motor777 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_motor779 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_PARAR_in_motor781 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_motor783 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_motor784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_motor806 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_motor808 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_MSETTER_in_motor810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_motor812 = new BitSet(new long[]{0x1021094140100000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_motor814 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_motor816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLEEP_in_sleep855 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_sleep857 = new BitSet(new long[]{0x1021094140100000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_sleep859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_sleep861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_esq_in_assign888 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUAL_in_assign892 = new BitSet(new long[]{0x1021094140100000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_assign894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_esq934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt951 = new BitSet(new long[]{0x1021094140100000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_ite_stmt954 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_THEN_in_ite_stmt956 = new BitSet(new long[]{0xC0480000C0000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt959 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt962 = new BitSet(new long[]{0xC0480000C0000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt965 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ENDIF_in_ite_stmt969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt996 = new BitSet(new long[]{0x1021094140100000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_while_stmt999 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_DO_in_while_stmt1001 = new BitSet(new long[]{0xC0480000C0000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt1004 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ENDWHILE_in_while_stmt1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt1033 = new BitSet(new long[]{0x1021094140100000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_return_stmt1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read1057 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_esq_in_read1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write1080 = new BitSet(new long[]{0x1221094140100000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_write1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_write1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr1111 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_OR_in_expr1114 = new BitSet(new long[]{0x1021094140100000L,0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr1117 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1135 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm1138 = new BitSet(new long[]{0x1021094140100000L,0x0000000000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1141 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1159 = new BitSet(new long[]{0x0000101220840002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact1163 = new BitSet(new long[]{0x1021094140100000L,0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact1168 = new BitSet(new long[]{0x1021094140100000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_boolfact1173 = new BitSet(new long[]{0x1021094140100000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LE_in_boolfact1178 = new BitSet(new long[]{0x1021094140100000L,0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_boolfact1183 = new BitSet(new long[]{0x1021094140100000L,0x0000000000000002L});
    public static final BitSet FOLLOW_GE_in_boolfact1188 = new BitSet(new long[]{0x1021094140100000L,0x0000000000000002L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr1210 = new BitSet(new long[]{0x0001004000000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr1215 = new BitSet(new long[]{0x1021094140100000L,0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_num_expr1220 = new BitSet(new long[]{0x1021094140100000L,0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr1224 = new BitSet(new long[]{0x0001004000000002L});
    public static final BitSet FOLLOW_factor_in_term1246 = new BitSet(new long[]{0x0000048000000402L});
    public static final BitSet FOLLOW_MUL_in_term1251 = new BitSet(new long[]{0x1021094140100000L,0x0000000000000002L});
    public static final BitSet FOLLOW_DIV_in_term1256 = new BitSet(new long[]{0x1021094140100000L,0x0000000000000002L});
    public static final BitSet FOLLOW_MOD_in_term1261 = new BitSet(new long[]{0x1021094140100000L,0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term1265 = new BitSet(new long[]{0x0000048000000402L});
    public static final BitSet FOLLOW_NOT_in_factor1286 = new BitSet(new long[]{0x1020010140100000L,0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_factor1291 = new BitSet(new long[]{0x1020010140100000L,0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_factor1296 = new BitSet(new long[]{0x1020010140100000L,0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_factor1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOTOR_in_atom1351 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_atom1353 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INT_in_atom1357 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_atom1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SENSOR_in_atom1380 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_atom1382 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INT_in_atom1386 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_atom1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_atom1448 = new BitSet(new long[]{0x1021094140100000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_atom1451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_atom1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1466 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_atom1468 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_GETCOLOR_in_atom1473 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_GETULTRA_in_atom1479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_GETTOUCH_in_atom1485 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_atom1488 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_atom1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_atom1514 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_MGETTER_in_atom1518 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_atom1520 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_atom1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall1552 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_funcall1554 = new BitSet(new long[]{0x1021094140100000L,0x0000000000000006L});
    public static final BitSet FOLLOW_expr_list_in_funcall1556 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_funcall1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list1591 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_expr_list1594 = new BitSet(new long[]{0x1021094140100000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list1597 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});

}
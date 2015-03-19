// $ANTLR 3.4 /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g 2015-03-19 13:19:56

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACELERAR", "AND", "ARGLIST", "ARRAYACC", "ASSIGN", "AVANZAR", "BOOLEAN", "COMMENT", "DIV", "DO", "ELSE", "ENDFUNC", "ENDIF", "ENDWHILE", "EQUAL", "ESC_SEQ", "FALSE", "FLOAT", "FUNC", "FUNCALL", "GE", "GETCOLOR", "GETRADIO", "GETSPEED", "GETTOUCH", "GETULTRA", "GIRAR", "GMOTOR", "GSENSOR", "GT", "ID", "IF", "INT", "LE", "LIST_FUNCTIONS", "LIST_INSTR", "LT", "MINUS", "MOD", "MOTOR", "MUL", "NOT", "NOT_EQUAL", "OR", "PARAMS", "PARAR", "PLUS", "PREF", "PVALUE", "READ", "RETURN", "SETRADIO", "SETSPEED", "SLEEP", "SMOTOR", "SSLEEP", "STRING", "THEN", "TRUE", "WHILE", "WRITE", "WS", "'&'", "'('", "')'", "','", "'.'", "';'", "'['", "']'"
    };

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
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:64:1: prog : ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) ;
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
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:64:9: ( ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:64:11: ( func )+ EOF
            {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:64:11: ( func )+
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
            	    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:64:11: func
            	    {
            	    pushFollow(FOLLOW_func_in_prog279);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog282);  
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
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:64:24: ^( LIST_FUNCTIONS ( func )+ )
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
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:68:1: func : FUNC ^ ID params block_instructions ENDFUNC !;
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
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:68:9: ( FUNC ^ ID params block_instructions ENDFUNC !)
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:68:11: FUNC ^ ID params block_instructions ENDFUNC !
            {
            root_0 = (AslTree)adaptor.nil();


            FUNC3=(Token)match(input,FUNC,FOLLOW_FUNC_in_func324); 
            FUNC3_tree = 
            (AslTree)adaptor.create(FUNC3)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(FUNC3_tree, root_0);


            ID4=(Token)match(input,ID,FOLLOW_ID_in_func327); 
            ID4_tree = 
            (AslTree)adaptor.create(ID4)
            ;
            adaptor.addChild(root_0, ID4_tree);


            pushFollow(FOLLOW_params_in_func329);
            params5=params();

            state._fsp--;

            adaptor.addChild(root_0, params5.getTree());

            pushFollow(FOLLOW_block_instructions_in_func331);
            block_instructions6=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions6.getTree());

            ENDFUNC7=(Token)match(input,ENDFUNC,FOLLOW_ENDFUNC_in_func333); 

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
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:72:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
    public final AslParser.params_return params() throws RecognitionException {
        AslParser.params_return retval = new AslParser.params_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal8=null;
        Token char_literal10=null;
        AslParser.paramlist_return paramlist9 =null;


        AslTree char_literal8_tree=null;
        AslTree char_literal10_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:72:9: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:72:11: '(' ( paramlist )? ')'
            {
            char_literal8=(Token)match(input,67,FOLLOW_67_in_params353);  
            stream_67.add(char_literal8);


            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:72:15: ( paramlist )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID||LA2_0==66) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:72:15: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params355);
                    paramlist9=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist9.getTree());

                    }
                    break;

            }


            char_literal10=(Token)match(input,68,FOLLOW_68_in_params358);  
            stream_68.add(char_literal10);


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
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:72:33: ^( PARAMS ( paramlist )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:72:42: ( paramlist )?
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
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:76:1: paramlist : param ( ',' ! param )* ;
    public final AslParser.paramlist_return paramlist() throws RecognitionException {
        AslParser.paramlist_return retval = new AslParser.paramlist_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal12=null;
        AslParser.param_return param11 =null;

        AslParser.param_return param13 =null;


        AslTree char_literal12_tree=null;

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:77:9: ( param ( ',' ! param )* )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:77:11: param ( ',' ! param )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist393);
            param11=param();

            state._fsp--;

            adaptor.addChild(root_0, param11.getTree());

            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:77:17: ( ',' ! param )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==69) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:77:18: ',' ! param
            	    {
            	    char_literal12=(Token)match(input,69,FOLLOW_69_in_paramlist396); 

            	    pushFollow(FOLLOW_param_in_paramlist399);
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
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:82:1: param : ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) );
    public final AslParser.param_return param() throws RecognitionException {
        AslParser.param_return retval = new AslParser.param_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token id=null;
        Token char_literal14=null;

        AslTree id_tree=null;
        AslTree char_literal14_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:82:9: ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==66) ) {
                alt4=1;
            }
            else if ( (LA4_0==ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:82:11: '&' id= ID
                    {
                    char_literal14=(Token)match(input,66,FOLLOW_66_in_param422);  
                    stream_66.add(char_literal14);


                    id=(Token)match(input,ID,FOLLOW_ID_in_param426);  
                    stream_ID.add(id);


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
                    // 82:21: -> ^( PREF[$id,$id.text] )
                    {
                        // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:82:24: ^( PREF[$id,$id.text] )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(PREF, id, (id!=null?id.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:83:11: id= ID
                    {
                    id=(Token)match(input,ID,FOLLOW_ID_in_param447);  
                    stream_ID.add(id);


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
                    // 83:17: -> ^( PVALUE[$id,$id.text] )
                    {
                        // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:83:20: ^( PVALUE[$id,$id.text] )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(PVALUE, id, (id!=null?id.getText():null))
                        , root_1);

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
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:87:1: block_instructions : instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) ;
    public final AslParser.block_instructions_return block_instructions() throws RecognitionException {
        AslParser.block_instructions_return retval = new AslParser.block_instructions_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal16=null;
        AslParser.instruction_return instruction15 =null;

        AslParser.instruction_return instruction17 =null;


        AslTree char_literal16_tree=null;
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:88:9: ( instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:88:11: instruction ( ';' instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions480);
            instruction15=instruction();

            state._fsp--;

            stream_instruction.add(instruction15.getTree());

            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:88:23: ( ';' instruction )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==71) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:88:24: ';' instruction
            	    {
            	    char_literal16=(Token)match(input,71,FOLLOW_71_in_block_instructions483);  
            	    stream_71.add(char_literal16);


            	    pushFollow(FOLLOW_instruction_in_block_instructions485);
            	    instruction17=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction17.getTree());

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
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:88:45: ^( LIST_INSTR ( instruction )+ )
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
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:92:1: instruction : ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write || motor | sleep );
    public final AslParser.instruction_return instruction() throws RecognitionException {
        AslParser.instruction_return retval = new AslParser.instruction_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.assign_return assign18 =null;

        AslParser.ite_stmt_return ite_stmt19 =null;

        AslParser.while_stmt_return while_stmt20 =null;

        AslParser.funcall_return funcall21 =null;

        AslParser.return_stmt_return return_stmt22 =null;

        AslParser.read_return read23 =null;

        AslParser.write_return write24 =null;

        AslParser.motor_return motor25 =null;

        AslParser.sleep_return sleep26 =null;



        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:93:9: ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write || motor | sleep )
            int alt6=10;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case EQUAL:
                case 72:
                    {
                    alt6=1;
                    }
                    break;
                case 67:
                    {
                    alt6=4;
                    }
                    break;
                case 70:
                    {
                    alt6=9;
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
            case 71:
                {
                alt6=8;
                }
                break;
            case ACELERAR:
            case AVANZAR:
            case PARAR:
                {
                alt6=9;
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
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:93:11: assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction522);
                    assign18=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign18.getTree());

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:94:11: ite_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction542);
                    ite_stmt19=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt19.getTree());

                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:95:11: while_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction560);
                    while_stmt20=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt20.getTree());

                    }
                    break;
                case 4 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:96:11: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction576);
                    funcall21=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall21.getTree());

                    }
                    break;
                case 5 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:97:11: return_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction595);
                    return_stmt22=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt22.getTree());

                    }
                    break;
                case 6 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:98:11: read
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_read_in_instruction610);
                    read23=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read23.getTree());

                    }
                    break;
                case 7 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:99:11: write
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_write_in_instruction632);
                    write24=write();

                    state._fsp--;

                    adaptor.addChild(root_0, write24.getTree());

                    }
                    break;
                case 8 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:101:9: 
                    {
                    root_0 = (AslTree)adaptor.nil();


                    }
                    break;
                case 9 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:101:11: motor
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_motor_in_instruction678);
                    motor25=motor();

                    state._fsp--;

                    adaptor.addChild(root_0, motor25.getTree());

                    }
                    break;
                case 10 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:102:11: sleep
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_sleep_in_instruction699);
                    sleep26=sleep();

                    state._fsp--;

                    adaptor.addChild(root_0, sleep26.getTree());

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
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:105:1: motor : ( ( ID '.' )? b= AVANZAR '(' ( INT )? ')' -> ^( SMOTOR ^( AVANZAR ( ID )? ) ( INT )? ) | ( ID '.' )? b= ACELERAR '(' INT ')' -> ^( SMOTOR ^( ACELERAR ( ID )? ) INT ) | ( ID '.' )? b= PARAR '(' ')' -> ^( SMOTOR ^( PARAR ( ID )? ) ) | ID '.' (b= SETRADIO |b= SETSPEED ) '(' (c= INT |c= FLOAT ) ')' -> ^( SMOTOR ^( $b ID ) $c) );
    public final AslParser.motor_return motor() throws RecognitionException {
        AslParser.motor_return retval = new AslParser.motor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token b=null;
        Token c=null;
        Token ID27=null;
        Token char_literal28=null;
        Token char_literal29=null;
        Token INT30=null;
        Token char_literal31=null;
        Token ID32=null;
        Token char_literal33=null;
        Token char_literal34=null;
        Token INT35=null;
        Token char_literal36=null;
        Token ID37=null;
        Token char_literal38=null;
        Token char_literal39=null;
        Token char_literal40=null;
        Token ID41=null;
        Token char_literal42=null;
        Token char_literal43=null;
        Token char_literal44=null;

        AslTree b_tree=null;
        AslTree c_tree=null;
        AslTree ID27_tree=null;
        AslTree char_literal28_tree=null;
        AslTree char_literal29_tree=null;
        AslTree INT30_tree=null;
        AslTree char_literal31_tree=null;
        AslTree ID32_tree=null;
        AslTree char_literal33_tree=null;
        AslTree char_literal34_tree=null;
        AslTree INT35_tree=null;
        AslTree char_literal36_tree=null;
        AslTree ID37_tree=null;
        AslTree char_literal38_tree=null;
        AslTree char_literal39_tree=null;
        AslTree char_literal40_tree=null;
        AslTree ID41_tree=null;
        AslTree char_literal42_tree=null;
        AslTree char_literal43_tree=null;
        AslTree char_literal44_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_ACELERAR=new RewriteRuleTokenStream(adaptor,"token ACELERAR");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_SETSPEED=new RewriteRuleTokenStream(adaptor,"token SETSPEED");
        RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_SETRADIO=new RewriteRuleTokenStream(adaptor,"token SETRADIO");
        RewriteRuleTokenStream stream_AVANZAR=new RewriteRuleTokenStream(adaptor,"token AVANZAR");
        RewriteRuleTokenStream stream_PARAR=new RewriteRuleTokenStream(adaptor,"token PARAR");

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:105:9: ( ( ID '.' )? b= AVANZAR '(' ( INT )? ')' -> ^( SMOTOR ^( AVANZAR ( ID )? ) ( INT )? ) | ( ID '.' )? b= ACELERAR '(' INT ')' -> ^( SMOTOR ^( ACELERAR ( ID )? ) INT ) | ( ID '.' )? b= PARAR '(' ')' -> ^( SMOTOR ^( PARAR ( ID )? ) ) | ID '.' (b= SETRADIO |b= SETSPEED ) '(' (c= INT |c= FLOAT ) ')' -> ^( SMOTOR ^( $b ID ) $c) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==70) ) {
                    switch ( input.LA(3) ) {
                    case AVANZAR:
                        {
                        alt13=1;
                        }
                        break;
                    case ACELERAR:
                        {
                        alt13=2;
                        }
                        break;
                    case PARAR:
                        {
                        alt13=3;
                        }
                        break;
                    case SETRADIO:
                    case SETSPEED:
                        {
                        alt13=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 5, input);

                        throw nvae;

                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;

                }
                }
                break;
            case AVANZAR:
                {
                alt13=1;
                }
                break;
            case ACELERAR:
                {
                alt13=2;
                }
                break;
            case PARAR:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:105:11: ( ID '.' )? b= AVANZAR '(' ( INT )? ')'
                    {
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:105:11: ( ID '.' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==ID) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:105:12: ID '.'
                            {
                            ID27=(Token)match(input,ID,FOLLOW_ID_in_motor729);  
                            stream_ID.add(ID27);


                            char_literal28=(Token)match(input,70,FOLLOW_70_in_motor731);  
                            stream_70.add(char_literal28);


                            }
                            break;

                    }


                    b=(Token)match(input,AVANZAR,FOLLOW_AVANZAR_in_motor737);  
                    stream_AVANZAR.add(b);


                    char_literal29=(Token)match(input,67,FOLLOW_67_in_motor738);  
                    stream_67.add(char_literal29);


                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:105:33: ( INT )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==INT) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:105:33: INT
                            {
                            INT30=(Token)match(input,INT,FOLLOW_INT_in_motor739);  
                            stream_INT.add(INT30);


                            }
                            break;

                    }


                    char_literal31=(Token)match(input,68,FOLLOW_68_in_motor741);  
                    stream_68.add(char_literal31);


                    // AST REWRITE
                    // elements: ID, INT, AVANZAR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 105:41: -> ^( SMOTOR ^( AVANZAR ( ID )? ) ( INT )? )
                    {
                        // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:105:44: ^( SMOTOR ^( AVANZAR ( ID )? ) ( INT )? )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(SMOTOR, "SMOTOR")
                        , root_1);

                        // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:105:53: ^( AVANZAR ( ID )? )
                        {
                        AslTree root_2 = (AslTree)adaptor.nil();
                        root_2 = (AslTree)adaptor.becomeRoot(
                        stream_AVANZAR.nextNode()
                        , root_2);

                        // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:105:63: ( ID )?
                        if ( stream_ID.hasNext() ) {
                            adaptor.addChild(root_2, 
                            stream_ID.nextNode()
                            );

                        }
                        stream_ID.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:105:68: ( INT )?
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
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:106:11: ( ID '.' )? b= ACELERAR '(' INT ')'
                    {
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:106:11: ( ID '.' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==ID) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:106:12: ID '.'
                            {
                            ID32=(Token)match(input,ID,FOLLOW_ID_in_motor770);  
                            stream_ID.add(ID32);


                            char_literal33=(Token)match(input,70,FOLLOW_70_in_motor772);  
                            stream_70.add(char_literal33);


                            }
                            break;

                    }


                    b=(Token)match(input,ACELERAR,FOLLOW_ACELERAR_in_motor778);  
                    stream_ACELERAR.add(b);


                    char_literal34=(Token)match(input,67,FOLLOW_67_in_motor779);  
                    stream_67.add(char_literal34);


                    INT35=(Token)match(input,INT,FOLLOW_INT_in_motor780);  
                    stream_INT.add(INT35);


                    char_literal36=(Token)match(input,68,FOLLOW_68_in_motor781);  
                    stream_68.add(char_literal36);


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
                    // 106:41: -> ^( SMOTOR ^( ACELERAR ( ID )? ) INT )
                    {
                        // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:106:44: ^( SMOTOR ^( ACELERAR ( ID )? ) INT )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(SMOTOR, "SMOTOR")
                        , root_1);

                        // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:106:53: ^( ACELERAR ( ID )? )
                        {
                        AslTree root_2 = (AslTree)adaptor.nil();
                        root_2 = (AslTree)adaptor.becomeRoot(
                        stream_ACELERAR.nextNode()
                        , root_2);

                        // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:106:64: ( ID )?
                        if ( stream_ID.hasNext() ) {
                            adaptor.addChild(root_2, 
                            stream_ID.nextNode()
                            );

                        }
                        stream_ID.reset();

                        adaptor.addChild(root_1, root_2);
                        }

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
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:107:11: ( ID '.' )? b= PARAR '(' ')'
                    {
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:107:11: ( ID '.' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==ID) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:107:12: ID '.'
                            {
                            ID37=(Token)match(input,ID,FOLLOW_ID_in_motor809);  
                            stream_ID.add(ID37);


                            char_literal38=(Token)match(input,70,FOLLOW_70_in_motor811);  
                            stream_70.add(char_literal38);


                            }
                            break;

                    }


                    b=(Token)match(input,PARAR,FOLLOW_PARAR_in_motor817);  
                    stream_PARAR.add(b);


                    char_literal39=(Token)match(input,67,FOLLOW_67_in_motor818);  
                    stream_67.add(char_literal39);


                    char_literal40=(Token)match(input,68,FOLLOW_68_in_motor819);  
                    stream_68.add(char_literal40);


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
                    // 107:35: -> ^( SMOTOR ^( PARAR ( ID )? ) )
                    {
                        // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:107:38: ^( SMOTOR ^( PARAR ( ID )? ) )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(SMOTOR, "SMOTOR")
                        , root_1);

                        // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:107:47: ^( PARAR ( ID )? )
                        {
                        AslTree root_2 = (AslTree)adaptor.nil();
                        root_2 = (AslTree)adaptor.becomeRoot(
                        stream_PARAR.nextNode()
                        , root_2);

                        // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:107:55: ( ID )?
                        if ( stream_ID.hasNext() ) {
                            adaptor.addChild(root_2, 
                            stream_ID.nextNode()
                            );

                        }
                        stream_ID.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:108:11: ID '.' (b= SETRADIO |b= SETSPEED ) '(' (c= INT |c= FLOAT ) ')'
                    {
                    ID41=(Token)match(input,ID,FOLLOW_ID_in_motor844);  
                    stream_ID.add(ID41);


                    char_literal42=(Token)match(input,70,FOLLOW_70_in_motor846);  
                    stream_70.add(char_literal42);


                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:108:18: (b= SETRADIO |b= SETSPEED )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==SETRADIO) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==SETSPEED) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;

                    }
                    switch (alt11) {
                        case 1 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:108:19: b= SETRADIO
                            {
                            b=(Token)match(input,SETRADIO,FOLLOW_SETRADIO_in_motor851);  
                            stream_SETRADIO.add(b);


                            }
                            break;
                        case 2 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:108:30: b= SETSPEED
                            {
                            b=(Token)match(input,SETSPEED,FOLLOW_SETSPEED_in_motor855);  
                            stream_SETSPEED.add(b);


                            }
                            break;

                    }


                    char_literal43=(Token)match(input,67,FOLLOW_67_in_motor857);  
                    stream_67.add(char_literal43);


                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:108:44: (c= INT |c= FLOAT )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==INT) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==FLOAT) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;

                    }
                    switch (alt12) {
                        case 1 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:108:45: c= INT
                            {
                            c=(Token)match(input,INT,FOLLOW_INT_in_motor861);  
                            stream_INT.add(c);


                            }
                            break;
                        case 2 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:108:51: c= FLOAT
                            {
                            c=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_motor865);  
                            stream_FLOAT.add(c);


                            }
                            break;

                    }


                    char_literal44=(Token)match(input,68,FOLLOW_68_in_motor867);  
                    stream_68.add(char_literal44);


                    // AST REWRITE
                    // elements: c, ID, b
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
                    // 108:63: -> ^( SMOTOR ^( $b ID ) $c)
                    {
                        // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:108:66: ^( SMOTOR ^( $b ID ) $c)
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(SMOTOR, "SMOTOR")
                        , root_1);

                        // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:108:75: ^( $b ID )
                        {
                        AslTree root_2 = (AslTree)adaptor.nil();
                        root_2 = (AslTree)adaptor.becomeRoot(stream_b.nextNode(), root_2);

                        adaptor.addChild(root_2, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, root_2);
                        }

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
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:111:1: sleep : SLEEP '(' (c= INT |c= FLOAT ) ')' -> ^( SSLEEP $c) ;
    public final AslParser.sleep_return sleep() throws RecognitionException {
        AslParser.sleep_return retval = new AslParser.sleep_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token c=null;
        Token SLEEP45=null;
        Token char_literal46=null;
        Token char_literal47=null;

        AslTree c_tree=null;
        AslTree SLEEP45_tree=null;
        AslTree char_literal46_tree=null;
        AslTree char_literal47_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");
        RewriteRuleTokenStream stream_SLEEP=new RewriteRuleTokenStream(adaptor,"token SLEEP");

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:111:9: ( SLEEP '(' (c= INT |c= FLOAT ) ')' -> ^( SSLEEP $c) )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:111:11: SLEEP '(' (c= INT |c= FLOAT ) ')'
            {
            SLEEP45=(Token)match(input,SLEEP,FOLLOW_SLEEP_in_sleep910);  
            stream_SLEEP.add(SLEEP45);


            char_literal46=(Token)match(input,67,FOLLOW_67_in_sleep912);  
            stream_67.add(char_literal46);


            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:111:21: (c= INT |c= FLOAT )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==INT) ) {
                alt14=1;
            }
            else if ( (LA14_0==FLOAT) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:111:22: c= INT
                    {
                    c=(Token)match(input,INT,FOLLOW_INT_in_sleep917);  
                    stream_INT.add(c);


                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:111:30: c= FLOAT
                    {
                    c=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_sleep923);  
                    stream_FLOAT.add(c);


                    }
                    break;

            }


            char_literal47=(Token)match(input,68,FOLLOW_68_in_sleep926);  
            stream_68.add(char_literal47);


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
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:111:46: ^( SSLEEP $c)
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
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:115:1: assign : esq eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] esq expr ) ;
    public final AslParser.assign_return assign() throws RecognitionException {
        AslParser.assign_return retval = new AslParser.assign_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        AslParser.esq_return esq48 =null;

        AslParser.expr_return expr49 =null;


        AslTree eq_tree=null;
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_esq=new RewriteRuleSubtreeStream(adaptor,"rule esq");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:115:9: ( esq eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] esq expr ) )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:115:11: esq eq= EQUAL expr
            {
            pushFollow(FOLLOW_esq_in_assign954);
            esq48=esq();

            state._fsp--;

            stream_esq.add(esq48.getTree());

            eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign958);  
            stream_EQUAL.add(eq);


            pushFollow(FOLLOW_expr_in_assign960);
            expr49=expr();

            state._fsp--;

            stream_expr.add(expr49.getTree());

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
            // 115:29: -> ^( ASSIGN[$eq,\":=\"] esq expr )
            {
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:115:32: ^( ASSIGN[$eq,\":=\"] esq expr )
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
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:118:1: esq : ( ID | ID b= '[' expr ']' -> ^( ARRAYACC[$b,\"[]\"] ID expr ) );
    public final AslParser.esq_return esq() throws RecognitionException {
        AslParser.esq_return retval = new AslParser.esq_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token b=null;
        Token ID50=null;
        Token ID51=null;
        Token char_literal53=null;
        AslParser.expr_return expr52 =null;


        AslTree b_tree=null;
        AslTree ID50_tree=null;
        AslTree ID51_tree=null;
        AslTree char_literal53_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:118:9: ( ID | ID b= '[' expr ']' -> ^( ARRAYACC[$b,\"[]\"] ID expr ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==ID) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==72) ) {
                    alt15=2;
                }
                else if ( ((LA15_1 >= ELSE && LA15_1 <= EQUAL)||LA15_1==71) ) {
                    alt15=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:118:11: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID50=(Token)match(input,ID,FOLLOW_ID_in_esq1000); 
                    ID50_tree = 
                    (AslTree)adaptor.create(ID50)
                    ;
                    adaptor.addChild(root_0, ID50_tree);


                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:119:11: ID b= '[' expr ']'
                    {
                    ID51=(Token)match(input,ID,FOLLOW_ID_in_esq1012);  
                    stream_ID.add(ID51);


                    b=(Token)match(input,72,FOLLOW_72_in_esq1016);  
                    stream_72.add(b);


                    pushFollow(FOLLOW_expr_in_esq1018);
                    expr52=expr();

                    state._fsp--;

                    stream_expr.add(expr52.getTree());

                    char_literal53=(Token)match(input,73,FOLLOW_73_in_esq1020);  
                    stream_73.add(char_literal53);


                    // AST REWRITE
                    // elements: expr, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 119:29: -> ^( ARRAYACC[$b,\"[]\"] ID expr )
                    {
                        // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:119:32: ^( ARRAYACC[$b,\"[]\"] ID expr )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(ARRAYACC, b, "[]")
                        , root_1);

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
    // $ANTLR end "esq"


    public static class ite_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ite_stmt"
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:123:1: ite_stmt : IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !;
    public final AslParser.ite_stmt_return ite_stmt() throws RecognitionException {
        AslParser.ite_stmt_return retval = new AslParser.ite_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token IF54=null;
        Token THEN56=null;
        Token ELSE58=null;
        Token ENDIF60=null;
        AslParser.expr_return expr55 =null;

        AslParser.block_instructions_return block_instructions57 =null;

        AslParser.block_instructions_return block_instructions59 =null;


        AslTree IF54_tree=null;
        AslTree THEN56_tree=null;
        AslTree ELSE58_tree=null;
        AslTree ENDIF60_tree=null;

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:123:9: ( IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !)
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:123:11: IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !
            {
            root_0 = (AslTree)adaptor.nil();


            IF54=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt1048); 
            IF54_tree = 
            (AslTree)adaptor.create(IF54)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF54_tree, root_0);


            pushFollow(FOLLOW_expr_in_ite_stmt1051);
            expr55=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr55.getTree());

            THEN56=(Token)match(input,THEN,FOLLOW_THEN_in_ite_stmt1053); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt1056);
            block_instructions57=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions57.getTree());

            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:123:45: ( ELSE ! block_instructions )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ELSE) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:123:46: ELSE ! block_instructions
                    {
                    ELSE58=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt1059); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt1062);
                    block_instructions59=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions59.getTree());

                    }
                    break;

            }


            ENDIF60=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ite_stmt1066); 

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
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:127:1: while_stmt : WHILE ^ expr DO ! block_instructions ENDWHILE !;
    public final AslParser.while_stmt_return while_stmt() throws RecognitionException {
        AslParser.while_stmt_return retval = new AslParser.while_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WHILE61=null;
        Token DO63=null;
        Token ENDWHILE65=null;
        AslParser.expr_return expr62 =null;

        AslParser.block_instructions_return block_instructions64 =null;


        AslTree WHILE61_tree=null;
        AslTree DO63_tree=null;
        AslTree ENDWHILE65_tree=null;

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:128:9: ( WHILE ^ expr DO ! block_instructions ENDWHILE !)
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:128:11: WHILE ^ expr DO ! block_instructions ENDWHILE !
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE61=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt1093); 
            WHILE61_tree = 
            (AslTree)adaptor.create(WHILE61)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE61_tree, root_0);


            pushFollow(FOLLOW_expr_in_while_stmt1096);
            expr62=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr62.getTree());

            DO63=(Token)match(input,DO,FOLLOW_DO_in_while_stmt1098); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt1101);
            block_instructions64=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions64.getTree());

            ENDWHILE65=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_while_stmt1103); 

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
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:132:1: return_stmt : RETURN ^ ( expr )? ;
    public final AslParser.return_stmt_return return_stmt() throws RecognitionException {
        AslParser.return_stmt_return retval = new AslParser.return_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RETURN66=null;
        AslParser.expr_return expr67 =null;


        AslTree RETURN66_tree=null;

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:133:9: ( RETURN ^ ( expr )? )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:133:11: RETURN ^ ( expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            RETURN66=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt1130); 
            RETURN66_tree = 
            (AslTree)adaptor.create(RETURN66)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RETURN66_tree, root_0);


            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:133:19: ( expr )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==FALSE||LA17_0==GETCOLOR||(LA17_0 >= GETTOUCH && LA17_0 <= GETULTRA)||LA17_0==ID||LA17_0==INT||LA17_0==MINUS||LA17_0==MOTOR||LA17_0==NOT||LA17_0==PLUS||LA17_0==TRUE||LA17_0==67) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:133:19: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt1133);
                    expr67=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr67.getTree());

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
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:137:1: read : READ ^ esq ;
    public final AslParser.read_return read() throws RecognitionException {
        AslParser.read_return retval = new AslParser.read_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token READ68=null;
        AslParser.esq_return esq69 =null;


        AslTree READ68_tree=null;

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:137:9: ( READ ^ esq )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:137:11: READ ^ esq
            {
            root_0 = (AslTree)adaptor.nil();


            READ68=(Token)match(input,READ,FOLLOW_READ_in_read1155); 
            READ68_tree = 
            (AslTree)adaptor.create(READ68)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(READ68_tree, root_0);


            pushFollow(FOLLOW_esq_in_read1158);
            esq69=esq();

            state._fsp--;

            adaptor.addChild(root_0, esq69.getTree());

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
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:141:1: write : WRITE ^ ( expr | STRING ) ;
    public final AslParser.write_return write() throws RecognitionException {
        AslParser.write_return retval = new AslParser.write_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WRITE70=null;
        Token STRING72=null;
        AslParser.expr_return expr71 =null;


        AslTree WRITE70_tree=null;
        AslTree STRING72_tree=null;

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:141:9: ( WRITE ^ ( expr | STRING ) )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:141:11: WRITE ^ ( expr | STRING )
            {
            root_0 = (AslTree)adaptor.nil();


            WRITE70=(Token)match(input,WRITE,FOLLOW_WRITE_in_write1178); 
            WRITE70_tree = 
            (AslTree)adaptor.create(WRITE70)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WRITE70_tree, root_0);


            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:141:18: ( expr | STRING )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==FALSE||LA18_0==GETCOLOR||(LA18_0 >= GETTOUCH && LA18_0 <= GETULTRA)||LA18_0==ID||LA18_0==INT||LA18_0==MINUS||LA18_0==MOTOR||LA18_0==NOT||LA18_0==PLUS||LA18_0==TRUE||LA18_0==67) ) {
                alt18=1;
            }
            else if ( (LA18_0==STRING) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:141:19: expr
                    {
                    pushFollow(FOLLOW_expr_in_write1182);
                    expr71=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr71.getTree());

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:141:26: STRING
                    {
                    STRING72=(Token)match(input,STRING,FOLLOW_STRING_in_write1186); 
                    STRING72_tree = 
                    (AslTree)adaptor.create(STRING72)
                    ;
                    adaptor.addChild(root_0, STRING72_tree);


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
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:145:1: expr : boolterm ( OR ^ boolterm )* ;
    public final AslParser.expr_return expr() throws RecognitionException {
        AslParser.expr_return retval = new AslParser.expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OR74=null;
        AslParser.boolterm_return boolterm73 =null;

        AslParser.boolterm_return boolterm75 =null;


        AslTree OR74_tree=null;

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:145:9: ( boolterm ( OR ^ boolterm )* )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:145:11: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr1209);
            boolterm73=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm73.getTree());

            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:145:20: ( OR ^ boolterm )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==OR) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:145:21: OR ^ boolterm
            	    {
            	    OR74=(Token)match(input,OR,FOLLOW_OR_in_expr1212); 
            	    OR74_tree = 
            	    (AslTree)adaptor.create(OR74)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR74_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr1215);
            	    boolterm75=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm75.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:148:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final AslParser.boolterm_return boolterm() throws RecognitionException {
        AslParser.boolterm_return retval = new AslParser.boolterm_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token AND77=null;
        AslParser.boolfact_return boolfact76 =null;

        AslParser.boolfact_return boolfact78 =null;


        AslTree AND77_tree=null;

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:148:9: ( boolfact ( AND ^ boolfact )* )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:148:11: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm1233);
            boolfact76=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact76.getTree());

            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:148:20: ( AND ^ boolfact )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==AND) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:148:21: AND ^ boolfact
            	    {
            	    AND77=(Token)match(input,AND,FOLLOW_AND_in_boolterm1236); 
            	    AND77_tree = 
            	    (AslTree)adaptor.create(AND77)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND77_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm1239);
            	    boolfact78=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact78.getTree());

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
    // $ANTLR end "boolterm"


    public static class boolfact_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolfact"
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:151:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final AslParser.boolfact_return boolfact() throws RecognitionException {
        AslParser.boolfact_return retval = new AslParser.boolfact_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EQUAL80=null;
        Token NOT_EQUAL81=null;
        Token LT82=null;
        Token LE83=null;
        Token GT84=null;
        Token GE85=null;
        AslParser.num_expr_return num_expr79 =null;

        AslParser.num_expr_return num_expr86 =null;


        AslTree EQUAL80_tree=null;
        AslTree NOT_EQUAL81_tree=null;
        AslTree LT82_tree=null;
        AslTree LE83_tree=null;
        AslTree GT84_tree=null;
        AslTree GE85_tree=null;

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:151:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:151:11: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact1257);
            num_expr79=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr79.getTree());

            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:151:20: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==EQUAL||LA22_0==GE||LA22_0==GT||LA22_0==LE||LA22_0==LT||LA22_0==NOT_EQUAL) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:151:21: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:151:21: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt21=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt21=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt21=2;
                        }
                        break;
                    case LT:
                        {
                        alt21=3;
                        }
                        break;
                    case LE:
                        {
                        alt21=4;
                        }
                        break;
                    case GT:
                        {
                        alt21=5;
                        }
                        break;
                    case GE:
                        {
                        alt21=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;

                    }

                    switch (alt21) {
                        case 1 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:151:22: EQUAL ^
                            {
                            EQUAL80=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact1261); 
                            EQUAL80_tree = 
                            (AslTree)adaptor.create(EQUAL80)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(EQUAL80_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:151:31: NOT_EQUAL ^
                            {
                            NOT_EQUAL81=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact1266); 
                            NOT_EQUAL81_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL81)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL81_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:151:44: LT ^
                            {
                            LT82=(Token)match(input,LT,FOLLOW_LT_in_boolfact1271); 
                            LT82_tree = 
                            (AslTree)adaptor.create(LT82)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT82_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:151:50: LE ^
                            {
                            LE83=(Token)match(input,LE,FOLLOW_LE_in_boolfact1276); 
                            LE83_tree = 
                            (AslTree)adaptor.create(LE83)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE83_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:151:56: GT ^
                            {
                            GT84=(Token)match(input,GT,FOLLOW_GT_in_boolfact1281); 
                            GT84_tree = 
                            (AslTree)adaptor.create(GT84)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT84_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:151:62: GE ^
                            {
                            GE85=(Token)match(input,GE,FOLLOW_GE_in_boolfact1286); 
                            GE85_tree = 
                            (AslTree)adaptor.create(GE85)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE85_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact1290);
                    num_expr86=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr86.getTree());

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
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:154:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final AslParser.num_expr_return num_expr() throws RecognitionException {
        AslParser.num_expr_return retval = new AslParser.num_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PLUS88=null;
        Token MINUS89=null;
        AslParser.term_return term87 =null;

        AslParser.term_return term90 =null;


        AslTree PLUS88_tree=null;
        AslTree MINUS89_tree=null;

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:154:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:154:11: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr1308);
            term87=term();

            state._fsp--;

            adaptor.addChild(root_0, term87.getTree());

            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:154:16: ( ( PLUS ^| MINUS ^) term )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==MINUS||LA24_0==PLUS) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:154:18: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:154:18: ( PLUS ^| MINUS ^)
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==PLUS) ) {
            	        alt23=1;
            	    }
            	    else if ( (LA23_0==MINUS) ) {
            	        alt23=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:154:19: PLUS ^
            	            {
            	            PLUS88=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr1313); 
            	            PLUS88_tree = 
            	            (AslTree)adaptor.create(PLUS88)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS88_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:154:27: MINUS ^
            	            {
            	            MINUS89=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr1318); 
            	            MINUS89_tree = 
            	            (AslTree)adaptor.create(MINUS89)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS89_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr1322);
            	    term90=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term90.getTree());

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
    // $ANTLR end "num_expr"


    public static class term_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:157:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final AslParser.term_return term() throws RecognitionException {
        AslParser.term_return retval = new AslParser.term_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MUL92=null;
        Token DIV93=null;
        Token MOD94=null;
        AslParser.factor_return factor91 =null;

        AslParser.factor_return factor95 =null;


        AslTree MUL92_tree=null;
        AslTree DIV93_tree=null;
        AslTree MOD94_tree=null;

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:157:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:157:11: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1344);
            factor91=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor91.getTree());

            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:157:18: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==DIV||LA26_0==MOD||LA26_0==MUL) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:157:20: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:157:20: ( MUL ^| DIV ^| MOD ^)
            	    int alt25=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt25=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt25=2;
            	        }
            	        break;
            	    case MOD:
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
            	            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:157:21: MUL ^
            	            {
            	            MUL92=(Token)match(input,MUL,FOLLOW_MUL_in_term1349); 
            	            MUL92_tree = 
            	            (AslTree)adaptor.create(MUL92)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MUL92_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:157:28: DIV ^
            	            {
            	            DIV93=(Token)match(input,DIV,FOLLOW_DIV_in_term1354); 
            	            DIV93_tree = 
            	            (AslTree)adaptor.create(DIV93)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV93_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:157:35: MOD ^
            	            {
            	            MOD94=(Token)match(input,MOD,FOLLOW_MOD_in_term1359); 
            	            MOD94_tree = 
            	            (AslTree)adaptor.create(MOD94)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD94_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1363);
            	    factor95=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor95.getTree());

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
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:160:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final AslParser.factor_return factor() throws RecognitionException {
        AslParser.factor_return retval = new AslParser.factor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOT96=null;
        Token PLUS97=null;
        Token MINUS98=null;
        AslParser.atom_return atom99 =null;


        AslTree NOT96_tree=null;
        AslTree PLUS97_tree=null;
        AslTree MINUS98_tree=null;

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:160:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:160:11: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AslTree)adaptor.nil();


            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:160:11: ( NOT ^| PLUS ^| MINUS ^)?
            int alt27=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt27=1;
                    }
                    break;
                case PLUS:
                    {
                    alt27=2;
                    }
                    break;
                case MINUS:
                    {
                    alt27=3;
                    }
                    break;
            }

            switch (alt27) {
                case 1 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:160:12: NOT ^
                    {
                    NOT96=(Token)match(input,NOT,FOLLOW_NOT_in_factor1384); 
                    NOT96_tree = 
                    (AslTree)adaptor.create(NOT96)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOT96_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:160:19: PLUS ^
                    {
                    PLUS97=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1389); 
                    PLUS97_tree = 
                    (AslTree)adaptor.create(PLUS97)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLUS97_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:160:27: MINUS ^
                    {
                    MINUS98=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1394); 
                    MINUS98_tree = 
                    (AslTree)adaptor.create(MINUS98)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MINUS98_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1399);
            atom99=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom99.getTree());

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
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:166:1: atom : ( ID | INT | MOTOR | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall ( -> funcall |b= '[' expr ']' -> ^( ARRAYACC[$b, \"[]\"] funcall expr ) ) | '(' ! expr ')' !| ID b= '[' expr ']' -> ^( ARRAYACC[$b, \"[]\"] ID expr ) | (b= GETCOLOR |b= GETULTRA |b= GETTOUCH ) '(' INT ')' -> ^( GSENSOR $b INT ) | ID '.' (b= GETSPEED |b= GETRADIO ) '(' ')' -> ^( GMOTOR ^( $b ID ) ) );
    public final AslParser.atom_return atom() throws RecognitionException {
        AslParser.atom_return retval = new AslParser.atom_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token b=null;
        Token ID100=null;
        Token INT101=null;
        Token MOTOR102=null;
        Token char_literal105=null;
        Token char_literal106=null;
        Token char_literal108=null;
        Token ID109=null;
        Token char_literal111=null;
        Token char_literal112=null;
        Token INT113=null;
        Token char_literal114=null;
        Token ID115=null;
        Token char_literal116=null;
        Token char_literal117=null;
        Token char_literal118=null;
        AslParser.funcall_return funcall103 =null;

        AslParser.expr_return expr104 =null;

        AslParser.expr_return expr107 =null;

        AslParser.expr_return expr110 =null;


        AslTree b_tree=null;
        AslTree ID100_tree=null;
        AslTree INT101_tree=null;
        AslTree MOTOR102_tree=null;
        AslTree char_literal105_tree=null;
        AslTree char_literal106_tree=null;
        AslTree char_literal108_tree=null;
        AslTree ID109_tree=null;
        AslTree char_literal111_tree=null;
        AslTree char_literal112_tree=null;
        AslTree INT113_tree=null;
        AslTree char_literal114_tree=null;
        AslTree ID115_tree=null;
        AslTree char_literal116_tree=null;
        AslTree char_literal117_tree=null;
        AslTree char_literal118_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_GETCOLOR=new RewriteRuleTokenStream(adaptor,"token GETCOLOR");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_GETTOUCH=new RewriteRuleTokenStream(adaptor,"token GETTOUCH");
        RewriteRuleTokenStream stream_GETRADIO=new RewriteRuleTokenStream(adaptor,"token GETRADIO");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_GETSPEED=new RewriteRuleTokenStream(adaptor,"token GETSPEED");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_GETULTRA=new RewriteRuleTokenStream(adaptor,"token GETULTRA");
        RewriteRuleSubtreeStream stream_funcall=new RewriteRuleSubtreeStream(adaptor,"rule funcall");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:166:9: ( ID | INT | MOTOR | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall ( -> funcall |b= '[' expr ']' -> ^( ARRAYACC[$b, \"[]\"] funcall expr ) ) | '(' ! expr ')' !| ID b= '[' expr ']' -> ^( ARRAYACC[$b, \"[]\"] ID expr ) | (b= GETCOLOR |b= GETULTRA |b= GETTOUCH ) '(' INT ')' -> ^( GSENSOR $b INT ) | ID '.' (b= GETSPEED |b= GETRADIO ) '(' ')' -> ^( GMOTOR ^( $b ID ) ) )
            int alt32=9;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case 67:
                    {
                    alt32=5;
                    }
                    break;
                case 72:
                    {
                    alt32=7;
                    }
                    break;
                case 70:
                    {
                    alt32=9;
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
                case 68:
                case 69:
                case 71:
                case 73:
                    {
                    alt32=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;

                }

                }
                break;
            case INT:
                {
                alt32=2;
                }
                break;
            case MOTOR:
                {
                alt32=3;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt32=4;
                }
                break;
            case 67:
                {
                alt32=6;
                }
                break;
            case GETCOLOR:
            case GETTOUCH:
            case GETULTRA:
                {
                alt32=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }

            switch (alt32) {
                case 1 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:166:11: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID100=(Token)match(input,ID,FOLLOW_ID_in_atom1422); 
                    ID100_tree = 
                    (AslTree)adaptor.create(ID100)
                    ;
                    adaptor.addChild(root_0, ID100_tree);


                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:167:11: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT101=(Token)match(input,INT,FOLLOW_INT_in_atom1435); 
                    INT101_tree = 
                    (AslTree)adaptor.create(INT101)
                    ;
                    adaptor.addChild(root_0, INT101_tree);


                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:168:11: MOTOR
                    {
                    root_0 = (AslTree)adaptor.nil();


                    MOTOR102=(Token)match(input,MOTOR,FOLLOW_MOTOR_in_atom1447); 
                    MOTOR102_tree = 
                    (AslTree)adaptor.create(MOTOR102)
                    ;
                    adaptor.addChild(root_0, MOTOR102_tree);


                    }
                    break;
                case 4 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:169:11: (b= TRUE |b= FALSE )
                    {
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:169:11: (b= TRUE |b= FALSE )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==TRUE) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==FALSE) ) {
                        alt28=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;

                    }
                    switch (alt28) {
                        case 1 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:169:12: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1462);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:169:21: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1468);  
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
                        // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:169:33: ^( BOOLEAN[$b,$b.text] )
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
                case 5 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:170:11: funcall ( -> funcall |b= '[' expr ']' -> ^( ARRAYACC[$b, \"[]\"] funcall expr ) )
                    {
                    pushFollow(FOLLOW_funcall_in_atom1488);
                    funcall103=funcall();

                    state._fsp--;

                    stream_funcall.add(funcall103.getTree());

                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:170:19: ( -> funcall |b= '[' expr ']' -> ^( ARRAYACC[$b, \"[]\"] funcall expr ) )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==AND||(LA29_0 >= DIV && LA29_0 <= EQUAL)||LA29_0==GE||LA29_0==GT||LA29_0==LE||(LA29_0 >= LT && LA29_0 <= MOD)||LA29_0==MUL||(LA29_0 >= NOT_EQUAL && LA29_0 <= OR)||LA29_0==PLUS||LA29_0==THEN||(LA29_0 >= 68 && LA29_0 <= 69)||LA29_0==71||LA29_0==73) ) {
                        alt29=1;
                    }
                    else if ( (LA29_0==72) ) {
                        alt29=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;

                    }
                    switch (alt29) {
                        case 1 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:170:21: 
                            {
                            // AST REWRITE
                            // elements: funcall
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AslTree)adaptor.nil();
                            // 170:21: -> funcall
                            {
                                adaptor.addChild(root_0, stream_funcall.nextTree());

                            }


                            retval.tree = root_0;

                            }
                            break;
                        case 2 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:170:34: b= '[' expr ']'
                            {
                            b=(Token)match(input,72,FOLLOW_72_in_atom1500);  
                            stream_72.add(b);


                            pushFollow(FOLLOW_expr_in_atom1502);
                            expr104=expr();

                            state._fsp--;

                            stream_expr.add(expr104.getTree());

                            char_literal105=(Token)match(input,73,FOLLOW_73_in_atom1504);  
                            stream_73.add(char_literal105);


                            // AST REWRITE
                            // elements: expr, funcall
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AslTree)adaptor.nil();
                            // 170:49: -> ^( ARRAYACC[$b, \"[]\"] funcall expr )
                            {
                                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:170:52: ^( ARRAYACC[$b, \"[]\"] funcall expr )
                                {
                                AslTree root_1 = (AslTree)adaptor.nil();
                                root_1 = (AslTree)adaptor.becomeRoot(
                                (AslTree)adaptor.create(ARRAYACC, b, "[]")
                                , root_1);

                                adaptor.addChild(root_1, stream_funcall.nextTree());

                                adaptor.addChild(root_1, stream_expr.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;

                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:171:11: '(' ! expr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    char_literal106=(Token)match(input,67,FOLLOW_67_in_atom1528); 

                    pushFollow(FOLLOW_expr_in_atom1531);
                    expr107=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr107.getTree());

                    char_literal108=(Token)match(input,68,FOLLOW_68_in_atom1533); 

                    }
                    break;
                case 7 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:172:11: ID b= '[' expr ']'
                    {
                    ID109=(Token)match(input,ID,FOLLOW_ID_in_atom1546);  
                    stream_ID.add(ID109);


                    b=(Token)match(input,72,FOLLOW_72_in_atom1550);  
                    stream_72.add(b);


                    pushFollow(FOLLOW_expr_in_atom1552);
                    expr110=expr();

                    state._fsp--;

                    stream_expr.add(expr110.getTree());

                    char_literal111=(Token)match(input,73,FOLLOW_73_in_atom1554);  
                    stream_73.add(char_literal111);


                    // AST REWRITE
                    // elements: expr, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 172:29: -> ^( ARRAYACC[$b, \"[]\"] ID expr )
                    {
                        // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:172:32: ^( ARRAYACC[$b, \"[]\"] ID expr )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(ARRAYACC, b, "[]")
                        , root_1);

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
                case 8 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:173:11: (b= GETCOLOR |b= GETULTRA |b= GETTOUCH ) '(' INT ')'
                    {
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:173:11: (b= GETCOLOR |b= GETULTRA |b= GETTOUCH )
                    int alt30=3;
                    switch ( input.LA(1) ) {
                    case GETCOLOR:
                        {
                        alt30=1;
                        }
                        break;
                    case GETULTRA:
                        {
                        alt30=2;
                        }
                        break;
                    case GETTOUCH:
                        {
                        alt30=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;

                    }

                    switch (alt30) {
                        case 1 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:173:12: b= GETCOLOR
                            {
                            b=(Token)match(input,GETCOLOR,FOLLOW_GETCOLOR_in_atom1580);  
                            stream_GETCOLOR.add(b);


                            }
                            break;
                        case 2 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:173:25: b= GETULTRA
                            {
                            b=(Token)match(input,GETULTRA,FOLLOW_GETULTRA_in_atom1586);  
                            stream_GETULTRA.add(b);


                            }
                            break;
                        case 3 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:173:38: b= GETTOUCH
                            {
                            b=(Token)match(input,GETTOUCH,FOLLOW_GETTOUCH_in_atom1592);  
                            stream_GETTOUCH.add(b);


                            }
                            break;

                    }


                    char_literal112=(Token)match(input,67,FOLLOW_67_in_atom1595);  
                    stream_67.add(char_literal112);


                    INT113=(Token)match(input,INT,FOLLOW_INT_in_atom1597);  
                    stream_INT.add(INT113);


                    char_literal114=(Token)match(input,68,FOLLOW_68_in_atom1598);  
                    stream_68.add(char_literal114);


                    // AST REWRITE
                    // elements: INT, b
                    // token labels: b
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_b=new RewriteRuleTokenStream(adaptor,"token b",b);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 173:61: -> ^( GSENSOR $b INT )
                    {
                        // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:173:64: ^( GSENSOR $b INT )
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
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:175:11: ID '.' (b= GETSPEED |b= GETRADIO ) '(' ')'
                    {
                    ID115=(Token)match(input,ID,FOLLOW_ID_in_atom1674);  
                    stream_ID.add(ID115);


                    char_literal116=(Token)match(input,70,FOLLOW_70_in_atom1675);  
                    stream_70.add(char_literal116);


                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:175:16: (b= GETSPEED |b= GETRADIO )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==GETSPEED) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==GETRADIO) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;

                    }
                    switch (alt31) {
                        case 1 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:175:17: b= GETSPEED
                            {
                            b=(Token)match(input,GETSPEED,FOLLOW_GETSPEED_in_atom1679);  
                            stream_GETSPEED.add(b);


                            }
                            break;
                        case 2 :
                            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:175:28: b= GETRADIO
                            {
                            b=(Token)match(input,GETRADIO,FOLLOW_GETRADIO_in_atom1683);  
                            stream_GETRADIO.add(b);


                            }
                            break;

                    }


                    char_literal117=(Token)match(input,67,FOLLOW_67_in_atom1685);  
                    stream_67.add(char_literal117);


                    char_literal118=(Token)match(input,68,FOLLOW_68_in_atom1686);  
                    stream_68.add(char_literal118);


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
                    // 175:46: -> ^( GMOTOR ^( $b ID ) )
                    {
                        // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:175:49: ^( GMOTOR ^( $b ID ) )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(GMOTOR, "GMOTOR")
                        , root_1);

                        // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:175:58: ^( $b ID )
                        {
                        AslTree root_2 = (AslTree)adaptor.nil();
                        root_2 = (AslTree)adaptor.becomeRoot(stream_b.nextNode(), root_2);

                        adaptor.addChild(root_2, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, root_2);
                        }

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
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:179:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final AslParser.funcall_return funcall() throws RecognitionException {
        AslParser.funcall_return retval = new AslParser.funcall_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID119=null;
        Token char_literal120=null;
        Token char_literal122=null;
        AslParser.expr_list_return expr_list121 =null;


        AslTree ID119_tree=null;
        AslTree char_literal120_tree=null;
        AslTree char_literal122_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:179:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:179:11: ID '(' ( expr_list )? ')'
            {
            ID119=(Token)match(input,ID,FOLLOW_ID_in_funcall1717);  
            stream_ID.add(ID119);


            char_literal120=(Token)match(input,67,FOLLOW_67_in_funcall1719);  
            stream_67.add(char_literal120);


            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:179:18: ( expr_list )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==FALSE||LA33_0==GETCOLOR||(LA33_0 >= GETTOUCH && LA33_0 <= GETULTRA)||LA33_0==ID||LA33_0==INT||LA33_0==MINUS||LA33_0==MOTOR||LA33_0==NOT||LA33_0==PLUS||LA33_0==TRUE||LA33_0==67) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:179:18: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall1721);
                    expr_list121=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list121.getTree());

                    }
                    break;

            }


            char_literal122=(Token)match(input,68,FOLLOW_68_in_funcall1724);  
            stream_68.add(char_literal122);


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
            // 179:33: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:179:36: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:179:49: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:179:59: ( expr_list )?
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
    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:183:1: expr_list : expr ( ',' ! expr )* ;
    public final AslParser.expr_list_return expr_list() throws RecognitionException {
        AslParser.expr_list_return retval = new AslParser.expr_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal124=null;
        AslParser.expr_return expr123 =null;

        AslParser.expr_return expr125 =null;


        AslTree char_literal124_tree=null;

        try {
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:183:10: ( expr ( ',' ! expr )* )
            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:183:12: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list1756);
            expr123=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr123.getTree());

            // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:183:17: ( ',' ! expr )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==69) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // /home2/users/alumnes/1161255/dades/linux/CL/Proyecto/robot-cl/Asl/src/parser/Asl.g:183:18: ',' ! expr
            	    {
            	    char_literal124=(Token)match(input,69,FOLLOW_69_in_expr_list1759); 

            	    pushFollow(FOLLOW_expr_in_expr_list1762);
            	    expr125=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr125.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
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


 

    public static final BitSet FOLLOW_func_in_prog279 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_EOF_in_prog282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_func324 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_func327 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_params_in_func329 = new BitSet(new long[]{0x8262000C00000210L,0x0000000000000081L});
    public static final BitSet FOLLOW_block_instructions_in_func331 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_params353 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_paramlist_in_params355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_params358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist393 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_paramlist396 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_param_in_paramlist399 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_66_in_param422 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_param426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions480 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_block_instructions483 = new BitSet(new long[]{0x8262000C00000210L,0x0000000000000081L});
    public static final BitSet FOLLOW_instruction_in_block_instructions485 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_assign_in_instruction522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_instruction632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_motor_in_instruction678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sleep_in_instruction699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_motor729 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_motor731 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_AVANZAR_in_motor737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_motor738 = new BitSet(new long[]{0x0000001000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_motor739 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_motor741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_motor770 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_motor772 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ACELERAR_in_motor778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_motor779 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_INT_in_motor780 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_motor781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_motor809 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_motor811 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_PARAR_in_motor817 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_motor818 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_motor819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_motor844 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_motor846 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_SETRADIO_in_motor851 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SETSPEED_in_motor855 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_motor857 = new BitSet(new long[]{0x0000001000200000L});
    public static final BitSet FOLLOW_INT_in_motor861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_FLOAT_in_motor865 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_motor867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLEEP_in_sleep910 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_sleep912 = new BitSet(new long[]{0x0000001000200000L});
    public static final BitSet FOLLOW_INT_in_sleep917 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_FLOAT_in_sleep923 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_sleep926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_esq_in_assign954 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUAL_in_assign958 = new BitSet(new long[]{0x40042A1432100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_assign960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_esq1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_esq1012 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_esq1016 = new BitSet(new long[]{0x40042A1432100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_esq1018 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_esq1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt1048 = new BitSet(new long[]{0x40042A1432100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_ite_stmt1051 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_THEN_in_ite_stmt1053 = new BitSet(new long[]{0x8262000C00000210L,0x0000000000000081L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt1056 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt1059 = new BitSet(new long[]{0x8262000C00000210L,0x0000000000000081L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt1062 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ENDIF_in_ite_stmt1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt1093 = new BitSet(new long[]{0x40042A1432100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_while_stmt1096 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_DO_in_while_stmt1098 = new BitSet(new long[]{0x8262000C00000210L,0x0000000000000081L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt1101 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ENDWHILE_in_while_stmt1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt1130 = new BitSet(new long[]{0x40042A1432100002L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_return_stmt1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read1155 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_esq_in_read1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write1178 = new BitSet(new long[]{0x50042A1432100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_write1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_write1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr1209 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_OR_in_expr1212 = new BitSet(new long[]{0x40042A1432100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_boolterm_in_expr1215 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1233 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_boolterm1236 = new BitSet(new long[]{0x40042A1432100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1239 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1257 = new BitSet(new long[]{0x0000412201040002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact1261 = new BitSet(new long[]{0x40042A1432100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact1266 = new BitSet(new long[]{0x40042A1432100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_LT_in_boolfact1271 = new BitSet(new long[]{0x40042A1432100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_LE_in_boolfact1276 = new BitSet(new long[]{0x40042A1432100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_GT_in_boolfact1281 = new BitSet(new long[]{0x40042A1432100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_GE_in_boolfact1286 = new BitSet(new long[]{0x40042A1432100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr1308 = new BitSet(new long[]{0x0004020000000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr1313 = new BitSet(new long[]{0x40042A1432100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_num_expr1318 = new BitSet(new long[]{0x40042A1432100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_term_in_num_expr1322 = new BitSet(new long[]{0x0004020000000002L});
    public static final BitSet FOLLOW_factor_in_term1344 = new BitSet(new long[]{0x0000140000001002L});
    public static final BitSet FOLLOW_MUL_in_term1349 = new BitSet(new long[]{0x40042A1432100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_term1354 = new BitSet(new long[]{0x40042A1432100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_in_term1359 = new BitSet(new long[]{0x40042A1432100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_factor_in_term1363 = new BitSet(new long[]{0x0000140000001002L});
    public static final BitSet FOLLOW_NOT_in_factor1384 = new BitSet(new long[]{0x4000081432100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_factor1389 = new BitSet(new long[]{0x4000081432100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_factor1394 = new BitSet(new long[]{0x4000081432100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_atom_in_factor1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOTOR_in_atom1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom1488 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_atom1500 = new BitSet(new long[]{0x40042A1432100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_atom1502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_atom1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_atom1528 = new BitSet(new long[]{0x40042A1432100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_atom1531 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_atom1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1546 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_atom1550 = new BitSet(new long[]{0x40042A1432100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_atom1552 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_atom1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GETCOLOR_in_atom1580 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_GETULTRA_in_atom1586 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_GETTOUCH_in_atom1592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_atom1595 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_INT_in_atom1597 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_atom1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1674 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_atom1675 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_GETSPEED_in_atom1679 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_GETRADIO_in_atom1683 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_atom1685 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_atom1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall1717 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_funcall1719 = new BitSet(new long[]{0x40042A1432100000L,0x0000000000000018L});
    public static final BitSet FOLLOW_expr_list_in_funcall1721 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_funcall1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list1756 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_expr_list1759 = new BitSet(new long[]{0x40042A1432100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_expr_list1762 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});

}
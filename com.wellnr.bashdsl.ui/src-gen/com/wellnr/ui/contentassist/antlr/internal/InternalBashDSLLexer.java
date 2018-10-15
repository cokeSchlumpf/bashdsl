package com.wellnr.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBashDSLLexer extends Lexer {
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_CODE_BLOCK=6;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalBashDSLLexer() {;} 
    public InternalBashDSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalBashDSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:11:7: ( '@GenerateReadme(' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:11:9: '@GenerateReadme('
            {
            match("@GenerateReadme("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:12:7: ( ')' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:12:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:13:7: ( ',' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:13:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:14:7: ( 'script' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:14:9: 'script'
            {
            match("script"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:15:7: ( '{' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:15:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:16:7: ( '}' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:16:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:17:7: ( 'copyright' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:17:9: 'copyright'
            {
            match("copyright"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:18:7: ( 'description' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:18:9: 'description'
            {
            match("description"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:19:7: ( 'argument' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:19:9: 'argument'
            {
            match("argument"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:20:7: ( 'optional argument' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:20:9: 'optional argument'
            {
            match("optional argument"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:21:7: ( 'with' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:21:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:22:7: ( 'default' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:22:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:23:7: ( 'env' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:23:9: 'env'
            {
            match("env"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:24:7: ( 'def' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:24:9: 'def'
            {
            match("def"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:25:7: ( 'reads remaining' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:25:9: 'reads remaining'
            {
            match("reads remaining"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:26:7: ( 'dynamic' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:26:9: 'dynamic'
            {
            match("dynamic"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:27:7: ( 'without parameter' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:27:9: 'without parameter'
            {
            match("without parameter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2214:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )* )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2214:11: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2214:31: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='-'||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_CODE_BLOCK"
    public final void mRULE_CODE_BLOCK() throws RecognitionException {
        try {
            int _type = RULE_CODE_BLOCK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2216:17: ( '{{{' ( options {greedy=false; } : . )* '}}}' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2216:19: '{{{' ( options {greedy=false; } : . )* '}}}'
            {
            match("{{{"); 

            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2216:25: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='}') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='}') ) {
                        int LA2_3 = input.LA(3);

                        if ( (LA2_3=='}') ) {
                            alt2=2;
                        }
                        else if ( ((LA2_3>='\u0000' && LA2_3<='|')||(LA2_3>='~' && LA2_3<='\uFFFF')) ) {
                            alt2=1;
                        }


                    }
                    else if ( ((LA2_1>='\u0000' && LA2_1<='|')||(LA2_1>='~' && LA2_1<='\uFFFF')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='|')||(LA2_0>='~' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2216:53: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match("}}}"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CODE_BLOCK"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2218:10: ( ( '0' .. '9' )+ )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2218:12: ( '0' .. '9' )+
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2218:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2218:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2220:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2220:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2220:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2220:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2220:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2220:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2220:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2220:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2220:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2220:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2220:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2222:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2222:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2222:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2222:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2224:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2224:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2224:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2224:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2224:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2224:41: ( '\\r' )? '\\n'
                    {
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2224:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2224:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2226:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2226:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2226:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2228:16: ( . )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2228:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | RULE_ID | RULE_CODE_BLOCK | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=25;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1:112: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 19 :
                // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1:120: RULE_CODE_BLOCK
                {
                mRULE_CODE_BLOCK(); 

                }
                break;
            case 20 :
                // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1:136: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 21 :
                // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1:145: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 22 :
                // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1:157: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 23 :
                // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1:173: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 24 :
                // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1:189: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 25 :
                // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1:197: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\24\2\uffff\1\31\1\33\1\uffff\7\31\2\uffff\3\24\5\uffff\1\31\4\uffff\10\31\5\uffff\3\31\1\70\4\31\1\75\5\31\1\uffff\3\31\1\107\1\uffff\11\31\1\uffff\1\31\1\122\7\31\2\uffff\2\31\1\134\1\135\5\31\2\uffff\1\143\1\31\1\uffff\1\145\1\31\3\uffff\1\31\1\150\1\uffff";
    static final String DFA12_eofS =
        "\151\uffff";
    static final String DFA12_minS =
        "\1\0\1\107\2\uffff\1\143\1\173\1\uffff\1\157\1\145\1\162\1\160\1\151\1\156\1\145\2\uffff\2\0\1\52\5\uffff\1\162\4\uffff\1\160\1\146\1\156\1\147\2\164\1\166\1\141\5\uffff\1\151\1\171\1\143\1\55\1\141\1\165\1\151\1\150\1\55\1\144\1\160\2\162\1\165\1\uffff\2\155\1\157\1\55\1\uffff\1\163\1\164\2\151\1\154\1\151\1\145\1\156\1\165\1\uffff\1\40\1\55\1\147\1\160\1\164\1\143\1\156\1\141\1\164\2\uffff\1\150\1\164\2\55\1\164\1\154\1\40\1\164\1\151\2\uffff\1\55\1\40\1\uffff\1\55\1\157\3\uffff\1\156\1\55\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\107\2\uffff\1\143\1\173\1\uffff\1\157\1\171\1\162\1\160\1\151\1\156\1\145\2\uffff\2\uffff\1\57\5\uffff\1\162\4\uffff\1\160\1\163\1\156\1\147\2\164\1\166\1\141\5\uffff\1\151\1\171\1\143\1\172\1\141\1\165\1\151\1\150\1\172\1\144\1\160\2\162\1\165\1\uffff\2\155\1\157\1\172\1\uffff\1\163\1\164\2\151\1\154\1\151\1\145\1\156\1\165\1\uffff\1\40\1\172\1\147\1\160\1\164\1\143\1\156\1\141\1\164\2\uffff\1\150\1\164\2\172\1\164\1\154\1\40\1\164\1\151\2\uffff\1\172\1\40\1\uffff\1\172\1\157\3\uffff\1\156\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\3\2\uffff\1\6\7\uffff\1\22\1\24\3\uffff\1\30\1\31\1\1\1\2\1\3\1\uffff\1\22\1\23\1\5\1\6\10\uffff\1\24\1\25\1\26\1\27\1\30\16\uffff\1\16\4\uffff\1\15\11\uffff\1\13\11\uffff\1\17\1\4\11\uffff\1\14\1\20\2\uffff\1\21\2\uffff\1\11\1\12\1\7\2\uffff\1\10";
    static final String DFA12_specialS =
        "\1\0\17\uffff\1\2\1\1\127\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\24\2\23\2\24\1\23\22\24\1\23\1\24\1\20\4\24\1\21\1\24\1\2\2\24\1\3\2\24\1\22\12\17\6\24\1\1\32\16\6\24\1\11\1\16\1\7\1\10\1\14\11\16\1\12\2\16\1\15\1\4\3\16\1\13\3\16\1\5\1\24\1\6\uff82\24",
            "\1\25",
            "",
            "",
            "\1\30",
            "\1\32",
            "",
            "\1\35",
            "\1\36\23\uffff\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "",
            "",
            "\0\46",
            "\0\46",
            "\1\47\4\uffff\1\50",
            "",
            "",
            "",
            "",
            "",
            "\1\52",
            "",
            "",
            "",
            "",
            "\1\53",
            "\1\55\14\uffff\1\54",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "",
            "",
            "",
            "",
            "",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\1\67\31\31",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\16\31\1\106\13\31",
            "",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "",
            "\1\121",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "",
            "",
            "\1\132",
            "\1\133",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "",
            "",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\144",
            "",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\146",
            "",
            "",
            "",
            "\1\147",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | RULE_ID | RULE_CODE_BLOCK | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='@') ) {s = 1;}

                        else if ( (LA12_0==')') ) {s = 2;}

                        else if ( (LA12_0==',') ) {s = 3;}

                        else if ( (LA12_0=='s') ) {s = 4;}

                        else if ( (LA12_0=='{') ) {s = 5;}

                        else if ( (LA12_0=='}') ) {s = 6;}

                        else if ( (LA12_0=='c') ) {s = 7;}

                        else if ( (LA12_0=='d') ) {s = 8;}

                        else if ( (LA12_0=='a') ) {s = 9;}

                        else if ( (LA12_0=='o') ) {s = 10;}

                        else if ( (LA12_0=='w') ) {s = 11;}

                        else if ( (LA12_0=='e') ) {s = 12;}

                        else if ( (LA12_0=='r') ) {s = 13;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='b'||(LA12_0>='f' && LA12_0<='n')||(LA12_0>='p' && LA12_0<='q')||(LA12_0>='t' && LA12_0<='v')||(LA12_0>='x' && LA12_0<='z')) ) {s = 14;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 15;}

                        else if ( (LA12_0=='\"') ) {s = 16;}

                        else if ( (LA12_0=='\'') ) {s = 17;}

                        else if ( (LA12_0=='/') ) {s = 18;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 19;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||LA12_0=='('||(LA12_0>='*' && LA12_0<='+')||(LA12_0>='-' && LA12_0<='.')||(LA12_0>=':' && LA12_0<='?')||(LA12_0>='[' && LA12_0<='`')||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_17 = input.LA(1);

                        s = -1;
                        if ( ((LA12_17>='\u0000' && LA12_17<='\uFFFF')) ) {s = 38;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_16 = input.LA(1);

                        s = -1;
                        if ( ((LA12_16>='\u0000' && LA12_16<='\uFFFF')) ) {s = 38;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
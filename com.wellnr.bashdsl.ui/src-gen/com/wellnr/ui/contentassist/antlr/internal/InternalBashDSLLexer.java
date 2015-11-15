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
    public static final int RULE_FILENAME=4;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_CODE_BLOCK=6;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=8;
    public static final int RULE_ML_COMMENT=9;

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

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:11:7: ( 'script' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:11:9: 'script'
            {
            match("script"); 


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
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:12:7: ( '{' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:12:9: '{'
            {
            match('{'); 

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
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:13:7: ( '}' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:13:9: '}'
            {
            match('}'); 

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
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:14:7: ( 'copyright' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:14:9: 'copyright'
            {
            match("copyright"); 


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
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:15:7: ( 'argument' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:15:9: 'argument'
            {
            match("argument"); 


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
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:16:7: ( 'with default' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:16:9: 'with default'
            {
            match("with default"); 


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
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:17:7: ( 'optional' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:17:9: 'optional'
            {
            match("optional"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "RULE_FILENAME"
    public final void mRULE_FILENAME() throws RecognitionException {
        try {
            int _type = RULE_FILENAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:841:15: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '.' | '0' .. '9' )* )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:841:17: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '.' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:841:41: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '.' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='-' && LA1_0<='.')||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:
            	    {
            	    if ( (input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
    // $ANTLR end "RULE_FILENAME"

    // $ANTLR start "RULE_CODE_BLOCK"
    public final void mRULE_CODE_BLOCK() throws RecognitionException {
        try {
            int _type = RULE_CODE_BLOCK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:843:17: ( '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:843:19: '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"'
            {
            match("\"\"\""); 

            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:843:25: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\"') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='\"') ) {
                        int LA2_3 = input.LA(3);

                        if ( (LA2_3=='\"') ) {
                            alt2=2;
                        }
                        else if ( ((LA2_3>='\u0000' && LA2_3<='!')||(LA2_3>='#' && LA2_3<='\uFFFF')) ) {
                            alt2=1;
                        }


                    }
                    else if ( ((LA2_1>='\u0000' && LA2_1<='!')||(LA2_1>='#' && LA2_1<='\uFFFF')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:843:53: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match("\"\"\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CODE_BLOCK"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:845:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:845:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:845:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:845:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:845:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:847:10: ( ( '0' .. '9' )+ )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:847:12: ( '0' .. '9' )+
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:847:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:847:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:849:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:849:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:849:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:849:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:849:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:849:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:849:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:849:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:849:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:849:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:849:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop7;
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
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:851:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:851:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:851:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:851:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:853:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:853:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:853:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:853:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop10;
                }
            } while (true);

            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:853:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:853:41: ( '\\r' )? '\\n'
                    {
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:853:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:853:41: '\\r'
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
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:855:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:855:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:855:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:857:16: ( . )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:857:18: .
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
        // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | RULE_FILENAME | RULE_CODE_BLOCK | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=16;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1:52: RULE_FILENAME
                {
                mRULE_FILENAME(); 

                }
                break;
            case 9 :
                // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1:66: RULE_CODE_BLOCK
                {
                mRULE_CODE_BLOCK(); 

                }
                break;
            case 10 :
                // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1:82: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 11 :
                // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1:90: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 12 :
                // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1:99: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 13 :
                // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1:111: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 14 :
                // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1:127: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 15 :
                // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1:143: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 16 :
                // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1:151: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\1\21\2\uffff\5\21\2\17\1\uffff\2\17\2\uffff\1\21\1\uffff\1\21\2\uffff\4\21\1\32\6\uffff\5\21\1\uffff\10\21\1\uffff\1\21\1\64\3\21\1\uffff\4\21\1\74\1\75\1\76\3\uffff";
    static final String DFA14_eofS =
        "\77\uffff";
    static final String DFA14_minS =
        "\1\0\1\60\2\uffff\5\60\1\0\1\101\1\uffff\1\0\1\52\2\uffff\1\60\1\uffff\1\60\2\uffff\4\60\1\42\6\uffff\5\60\1\uffff\3\60\1\40\4\60\1\uffff\1\60\1\55\3\60\1\uffff\4\60\3\55\3\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\172\2\uffff\5\172\1\uffff\1\172\1\uffff\1\uffff\1\57\2\uffff\1\172\1\uffff\1\172\2\uffff\4\172\1\42\6\uffff\5\172\1\uffff\10\172\1\uffff\5\172\1\uffff\7\172\3\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\1\3\7\uffff\1\13\2\uffff\1\17\1\20\1\uffff\1\10\1\uffff\1\2\1\3\5\uffff\1\14\1\12\1\13\1\15\1\16\1\17\5\uffff\1\11\10\uffff\1\6\5\uffff\1\1\7\uffff\1\5\1\7\1\4";
    static final String DFA14_specialS =
        "\1\2\10\uffff\1\1\2\uffff\1\0\62\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\17\2\16\2\17\1\16\22\17\1\16\1\17\1\11\4\17\1\14\7\17\1\15\12\13\7\17\32\10\3\17\1\12\1\10\1\17\1\5\1\10\1\4\13\10\1\7\3\10\1\1\3\10\1\6\3\10\1\2\1\17\1\3\uff82\17",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\2\22\1\20\27\22",
            "",
            "",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\16\22\1\25\13\22",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\21\22\1\26\10\22",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\10\22\1\27\21\22",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\17\22\1\30\12\22",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\42\32\1\31\uffdd\32",
            "\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\0\32",
            "\1\35\4\uffff\1\36",
            "",
            "",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\21\22\1\40\10\22",
            "",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "",
            "",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\17\22\1\41\12\22",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\6\22\1\42\23\22",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\23\22\1\43\6\22",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\23\22\1\44\6\22",
            "\1\45",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\10\22\1\46\21\22",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\30\22\1\47\1\22",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\24\22\1\50\5\22",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\7\22\1\51\22\22",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\10\22\1\52\21\22",
            "",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\17\22\1\53\12\22",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\21\22\1\54\10\22",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\14\22\1\55\15\22",
            "\1\56\17\uffff\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\16\22\1\57\13\22",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\23\22\1\60\6\22",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\10\22\1\61\21\22",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\4\22\1\62\25\22",
            "",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\15\22\1\63\14\22",
            "\2\21\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\6\22\1\65\23\22",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\15\22\1\66\14\22",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\1\67\31\22",
            "",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\7\22\1\70\22\22",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\23\22\1\71\6\22",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\13\22\1\72\16\22",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\23\22\1\73\6\22",
            "\2\21\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\2\21\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\2\21\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "",
            "",
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
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | RULE_FILENAME | RULE_CODE_BLOCK | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_12 = input.LA(1);

                        s = -1;
                        if ( ((LA14_12>='\u0000' && LA14_12<='\uFFFF')) ) {s = 26;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_9 = input.LA(1);

                        s = -1;
                        if ( (LA14_9=='\"') ) {s = 25;}

                        else if ( ((LA14_9>='\u0000' && LA14_9<='!')||(LA14_9>='#' && LA14_9<='\uFFFF')) ) {s = 26;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='s') ) {s = 1;}

                        else if ( (LA14_0=='{') ) {s = 2;}

                        else if ( (LA14_0=='}') ) {s = 3;}

                        else if ( (LA14_0=='c') ) {s = 4;}

                        else if ( (LA14_0=='a') ) {s = 5;}

                        else if ( (LA14_0=='w') ) {s = 6;}

                        else if ( (LA14_0=='o') ) {s = 7;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||LA14_0=='b'||(LA14_0>='d' && LA14_0<='n')||(LA14_0>='p' && LA14_0<='r')||(LA14_0>='t' && LA14_0<='v')||(LA14_0>='x' && LA14_0<='z')) ) {s = 8;}

                        else if ( (LA14_0=='\"') ) {s = 9;}

                        else if ( (LA14_0=='^') ) {s = 10;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 11;}

                        else if ( (LA14_0=='\'') ) {s = 12;}

                        else if ( (LA14_0=='/') ) {s = 13;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 14;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='.')||(LA14_0>=':' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 15;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
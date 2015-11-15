package com.wellnr.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.wellnr.services.BashDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBashDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_FILENAME", "RULE_STRING", "RULE_CODE_BLOCK", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'script'", "'{'", "'}'", "'copyright'", "'argument'", "'with default'", "'optional'"
    };
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


        public InternalBashDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBashDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBashDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g"; }


     
     	private BashDSLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(BashDSLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleDomainmodel"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:60:1: entryRuleDomainmodel : ruleDomainmodel EOF ;
    public final void entryRuleDomainmodel() throws RecognitionException {
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:61:1: ( ruleDomainmodel EOF )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:62:1: ruleDomainmodel EOF
            {
             before(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_ruleDomainmodel_in_entryRuleDomainmodel61);
            ruleDomainmodel();

            state._fsp--;

             after(grammarAccess.getDomainmodelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainmodel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:69:1: ruleDomainmodel : ( ( rule__Domainmodel__ElementsAssignment )* ) ;
    public final void ruleDomainmodel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:73:2: ( ( ( rule__Domainmodel__ElementsAssignment )* ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:74:1: ( ( rule__Domainmodel__ElementsAssignment )* )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:74:1: ( ( rule__Domainmodel__ElementsAssignment )* )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:75:1: ( rule__Domainmodel__ElementsAssignment )*
            {
             before(grammarAccess.getDomainmodelAccess().getElementsAssignment()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:76:1: ( rule__Domainmodel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:76:2: rule__Domainmodel__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Domainmodel__ElementsAssignment_in_ruleDomainmodel94);
            	    rule__Domainmodel__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDomainmodelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleScript"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:88:1: entryRuleScript : ruleScript EOF ;
    public final void entryRuleScript() throws RecognitionException {
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:89:1: ( ruleScript EOF )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:90:1: ruleScript EOF
            {
             before(grammarAccess.getScriptRule()); 
            pushFollow(FOLLOW_ruleScript_in_entryRuleScript122);
            ruleScript();

            state._fsp--;

             after(grammarAccess.getScriptRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScript129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScript"


    // $ANTLR start "ruleScript"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:97:1: ruleScript : ( ( rule__Script__Group__0 ) ) ;
    public final void ruleScript() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:101:2: ( ( ( rule__Script__Group__0 ) ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:102:1: ( ( rule__Script__Group__0 ) )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:102:1: ( ( rule__Script__Group__0 ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:103:1: ( rule__Script__Group__0 )
            {
             before(grammarAccess.getScriptAccess().getGroup()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:104:1: ( rule__Script__Group__0 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:104:2: rule__Script__Group__0
            {
            pushFollow(FOLLOW_rule__Script__Group__0_in_ruleScript155);
            rule__Script__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScriptAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScript"


    // $ANTLR start "entryRuleArgument"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:116:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:117:1: ( ruleArgument EOF )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:118:1: ruleArgument EOF
            {
             before(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument182);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getArgumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:125:1: ruleArgument : ( ( rule__Argument__Group__0 ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:129:2: ( ( ( rule__Argument__Group__0 ) ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:130:1: ( ( rule__Argument__Group__0 ) )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:130:1: ( ( rule__Argument__Group__0 ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:131:1: ( rule__Argument__Group__0 )
            {
             before(grammarAccess.getArgumentAccess().getGroup()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:132:1: ( rule__Argument__Group__0 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:132:2: rule__Argument__Group__0
            {
            pushFollow(FOLLOW_rule__Argument__Group__0_in_ruleArgument215);
            rule__Argument__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArgumentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArgument"


    // $ANTLR start "rule__Script__Group__0"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:146:1: rule__Script__Group__0 : rule__Script__Group__0__Impl rule__Script__Group__1 ;
    public final void rule__Script__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:150:1: ( rule__Script__Group__0__Impl rule__Script__Group__1 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:151:2: rule__Script__Group__0__Impl rule__Script__Group__1
            {
            pushFollow(FOLLOW_rule__Script__Group__0__Impl_in_rule__Script__Group__0249);
            rule__Script__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Script__Group__1_in_rule__Script__Group__0252);
            rule__Script__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__0"


    // $ANTLR start "rule__Script__Group__0__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:158:1: rule__Script__Group__0__Impl : ( 'script' ) ;
    public final void rule__Script__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:162:1: ( ( 'script' ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:163:1: ( 'script' )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:163:1: ( 'script' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:164:1: 'script'
            {
             before(grammarAccess.getScriptAccess().getScriptKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Script__Group__0__Impl280); 
             after(grammarAccess.getScriptAccess().getScriptKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__0__Impl"


    // $ANTLR start "rule__Script__Group__1"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:177:1: rule__Script__Group__1 : rule__Script__Group__1__Impl rule__Script__Group__2 ;
    public final void rule__Script__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:181:1: ( rule__Script__Group__1__Impl rule__Script__Group__2 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:182:2: rule__Script__Group__1__Impl rule__Script__Group__2
            {
            pushFollow(FOLLOW_rule__Script__Group__1__Impl_in_rule__Script__Group__1311);
            rule__Script__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Script__Group__2_in_rule__Script__Group__1314);
            rule__Script__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__1"


    // $ANTLR start "rule__Script__Group__1__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:189:1: rule__Script__Group__1__Impl : ( ( rule__Script__NameAssignment_1 ) ) ;
    public final void rule__Script__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:193:1: ( ( ( rule__Script__NameAssignment_1 ) ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:194:1: ( ( rule__Script__NameAssignment_1 ) )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:194:1: ( ( rule__Script__NameAssignment_1 ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:195:1: ( rule__Script__NameAssignment_1 )
            {
             before(grammarAccess.getScriptAccess().getNameAssignment_1()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:196:1: ( rule__Script__NameAssignment_1 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:196:2: rule__Script__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Script__NameAssignment_1_in_rule__Script__Group__1__Impl341);
            rule__Script__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getScriptAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__1__Impl"


    // $ANTLR start "rule__Script__Group__2"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:206:1: rule__Script__Group__2 : rule__Script__Group__2__Impl rule__Script__Group__3 ;
    public final void rule__Script__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:210:1: ( rule__Script__Group__2__Impl rule__Script__Group__3 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:211:2: rule__Script__Group__2__Impl rule__Script__Group__3
            {
            pushFollow(FOLLOW_rule__Script__Group__2__Impl_in_rule__Script__Group__2371);
            rule__Script__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Script__Group__3_in_rule__Script__Group__2374);
            rule__Script__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__2"


    // $ANTLR start "rule__Script__Group__2__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:218:1: rule__Script__Group__2__Impl : ( ( rule__Script__DescriptionAssignment_2 ) ) ;
    public final void rule__Script__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:222:1: ( ( ( rule__Script__DescriptionAssignment_2 ) ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:223:1: ( ( rule__Script__DescriptionAssignment_2 ) )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:223:1: ( ( rule__Script__DescriptionAssignment_2 ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:224:1: ( rule__Script__DescriptionAssignment_2 )
            {
             before(grammarAccess.getScriptAccess().getDescriptionAssignment_2()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:225:1: ( rule__Script__DescriptionAssignment_2 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:225:2: rule__Script__DescriptionAssignment_2
            {
            pushFollow(FOLLOW_rule__Script__DescriptionAssignment_2_in_rule__Script__Group__2__Impl401);
            rule__Script__DescriptionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getScriptAccess().getDescriptionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__2__Impl"


    // $ANTLR start "rule__Script__Group__3"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:235:1: rule__Script__Group__3 : rule__Script__Group__3__Impl rule__Script__Group__4 ;
    public final void rule__Script__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:239:1: ( rule__Script__Group__3__Impl rule__Script__Group__4 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:240:2: rule__Script__Group__3__Impl rule__Script__Group__4
            {
            pushFollow(FOLLOW_rule__Script__Group__3__Impl_in_rule__Script__Group__3431);
            rule__Script__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Script__Group__4_in_rule__Script__Group__3434);
            rule__Script__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__3"


    // $ANTLR start "rule__Script__Group__3__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:247:1: rule__Script__Group__3__Impl : ( ( rule__Script__Group_3__0 )? ) ;
    public final void rule__Script__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:251:1: ( ( ( rule__Script__Group_3__0 )? ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:252:1: ( ( rule__Script__Group_3__0 )? )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:252:1: ( ( rule__Script__Group_3__0 )? )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:253:1: ( rule__Script__Group_3__0 )?
            {
             before(grammarAccess.getScriptAccess().getGroup_3()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:254:1: ( rule__Script__Group_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:254:2: rule__Script__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Script__Group_3__0_in_rule__Script__Group__3__Impl461);
                    rule__Script__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScriptAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__3__Impl"


    // $ANTLR start "rule__Script__Group__4"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:264:1: rule__Script__Group__4 : rule__Script__Group__4__Impl rule__Script__Group__5 ;
    public final void rule__Script__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:268:1: ( rule__Script__Group__4__Impl rule__Script__Group__5 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:269:2: rule__Script__Group__4__Impl rule__Script__Group__5
            {
            pushFollow(FOLLOW_rule__Script__Group__4__Impl_in_rule__Script__Group__4492);
            rule__Script__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Script__Group__5_in_rule__Script__Group__4495);
            rule__Script__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__4"


    // $ANTLR start "rule__Script__Group__4__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:276:1: rule__Script__Group__4__Impl : ( '{' ) ;
    public final void rule__Script__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:280:1: ( ( '{' ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:281:1: ( '{' )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:281:1: ( '{' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:282:1: '{'
            {
             before(grammarAccess.getScriptAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__Script__Group__4__Impl523); 
             after(grammarAccess.getScriptAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__4__Impl"


    // $ANTLR start "rule__Script__Group__5"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:295:1: rule__Script__Group__5 : rule__Script__Group__5__Impl rule__Script__Group__6 ;
    public final void rule__Script__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:299:1: ( rule__Script__Group__5__Impl rule__Script__Group__6 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:300:2: rule__Script__Group__5__Impl rule__Script__Group__6
            {
            pushFollow(FOLLOW_rule__Script__Group__5__Impl_in_rule__Script__Group__5554);
            rule__Script__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Script__Group__6_in_rule__Script__Group__5557);
            rule__Script__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__5"


    // $ANTLR start "rule__Script__Group__5__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:307:1: rule__Script__Group__5__Impl : ( ( rule__Script__ArgumentsAssignment_5 )* ) ;
    public final void rule__Script__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:311:1: ( ( ( rule__Script__ArgumentsAssignment_5 )* ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:312:1: ( ( rule__Script__ArgumentsAssignment_5 )* )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:312:1: ( ( rule__Script__ArgumentsAssignment_5 )* )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:313:1: ( rule__Script__ArgumentsAssignment_5 )*
            {
             before(grammarAccess.getScriptAccess().getArgumentsAssignment_5()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:314:1: ( rule__Script__ArgumentsAssignment_5 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17||LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:314:2: rule__Script__ArgumentsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Script__ArgumentsAssignment_5_in_rule__Script__Group__5__Impl584);
            	    rule__Script__ArgumentsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getScriptAccess().getArgumentsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__5__Impl"


    // $ANTLR start "rule__Script__Group__6"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:324:1: rule__Script__Group__6 : rule__Script__Group__6__Impl rule__Script__Group__7 ;
    public final void rule__Script__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:328:1: ( rule__Script__Group__6__Impl rule__Script__Group__7 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:329:2: rule__Script__Group__6__Impl rule__Script__Group__7
            {
            pushFollow(FOLLOW_rule__Script__Group__6__Impl_in_rule__Script__Group__6615);
            rule__Script__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Script__Group__7_in_rule__Script__Group__6618);
            rule__Script__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__6"


    // $ANTLR start "rule__Script__Group__6__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:336:1: rule__Script__Group__6__Impl : ( ( rule__Script__CodeAssignment_6 )? ) ;
    public final void rule__Script__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:340:1: ( ( ( rule__Script__CodeAssignment_6 )? ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:341:1: ( ( rule__Script__CodeAssignment_6 )? )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:341:1: ( ( rule__Script__CodeAssignment_6 )? )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:342:1: ( rule__Script__CodeAssignment_6 )?
            {
             before(grammarAccess.getScriptAccess().getCodeAssignment_6()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:343:1: ( rule__Script__CodeAssignment_6 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_CODE_BLOCK) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:343:2: rule__Script__CodeAssignment_6
                    {
                    pushFollow(FOLLOW_rule__Script__CodeAssignment_6_in_rule__Script__Group__6__Impl645);
                    rule__Script__CodeAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScriptAccess().getCodeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__6__Impl"


    // $ANTLR start "rule__Script__Group__7"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:353:1: rule__Script__Group__7 : rule__Script__Group__7__Impl ;
    public final void rule__Script__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:357:1: ( rule__Script__Group__7__Impl )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:358:2: rule__Script__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Script__Group__7__Impl_in_rule__Script__Group__7676);
            rule__Script__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__7"


    // $ANTLR start "rule__Script__Group__7__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:364:1: rule__Script__Group__7__Impl : ( '}' ) ;
    public final void rule__Script__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:368:1: ( ( '}' ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:369:1: ( '}' )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:369:1: ( '}' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:370:1: '}'
            {
             before(grammarAccess.getScriptAccess().getRightCurlyBracketKeyword_7()); 
            match(input,15,FOLLOW_15_in_rule__Script__Group__7__Impl704); 
             after(grammarAccess.getScriptAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__7__Impl"


    // $ANTLR start "rule__Script__Group_3__0"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:399:1: rule__Script__Group_3__0 : rule__Script__Group_3__0__Impl rule__Script__Group_3__1 ;
    public final void rule__Script__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:403:1: ( rule__Script__Group_3__0__Impl rule__Script__Group_3__1 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:404:2: rule__Script__Group_3__0__Impl rule__Script__Group_3__1
            {
            pushFollow(FOLLOW_rule__Script__Group_3__0__Impl_in_rule__Script__Group_3__0751);
            rule__Script__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Script__Group_3__1_in_rule__Script__Group_3__0754);
            rule__Script__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group_3__0"


    // $ANTLR start "rule__Script__Group_3__0__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:411:1: rule__Script__Group_3__0__Impl : ( 'copyright' ) ;
    public final void rule__Script__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:415:1: ( ( 'copyright' ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:416:1: ( 'copyright' )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:416:1: ( 'copyright' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:417:1: 'copyright'
            {
             before(grammarAccess.getScriptAccess().getCopyrightKeyword_3_0()); 
            match(input,16,FOLLOW_16_in_rule__Script__Group_3__0__Impl782); 
             after(grammarAccess.getScriptAccess().getCopyrightKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group_3__0__Impl"


    // $ANTLR start "rule__Script__Group_3__1"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:430:1: rule__Script__Group_3__1 : rule__Script__Group_3__1__Impl ;
    public final void rule__Script__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:434:1: ( rule__Script__Group_3__1__Impl )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:435:2: rule__Script__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Script__Group_3__1__Impl_in_rule__Script__Group_3__1813);
            rule__Script__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group_3__1"


    // $ANTLR start "rule__Script__Group_3__1__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:441:1: rule__Script__Group_3__1__Impl : ( ( rule__Script__CopyrightAssignment_3_1 ) ) ;
    public final void rule__Script__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:445:1: ( ( ( rule__Script__CopyrightAssignment_3_1 ) ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:446:1: ( ( rule__Script__CopyrightAssignment_3_1 ) )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:446:1: ( ( rule__Script__CopyrightAssignment_3_1 ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:447:1: ( rule__Script__CopyrightAssignment_3_1 )
            {
             before(grammarAccess.getScriptAccess().getCopyrightAssignment_3_1()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:448:1: ( rule__Script__CopyrightAssignment_3_1 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:448:2: rule__Script__CopyrightAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Script__CopyrightAssignment_3_1_in_rule__Script__Group_3__1__Impl840);
            rule__Script__CopyrightAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getScriptAccess().getCopyrightAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group_3__1__Impl"


    // $ANTLR start "rule__Argument__Group__0"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:462:1: rule__Argument__Group__0 : rule__Argument__Group__0__Impl rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:466:1: ( rule__Argument__Group__0__Impl rule__Argument__Group__1 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:467:2: rule__Argument__Group__0__Impl rule__Argument__Group__1
            {
            pushFollow(FOLLOW_rule__Argument__Group__0__Impl_in_rule__Argument__Group__0874);
            rule__Argument__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__0877);
            rule__Argument__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__0"


    // $ANTLR start "rule__Argument__Group__0__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:474:1: rule__Argument__Group__0__Impl : ( ( rule__Argument__OptionalAssignment_0 )? ) ;
    public final void rule__Argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:478:1: ( ( ( rule__Argument__OptionalAssignment_0 )? ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:479:1: ( ( rule__Argument__OptionalAssignment_0 )? )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:479:1: ( ( rule__Argument__OptionalAssignment_0 )? )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:480:1: ( rule__Argument__OptionalAssignment_0 )?
            {
             before(grammarAccess.getArgumentAccess().getOptionalAssignment_0()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:481:1: ( rule__Argument__OptionalAssignment_0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:481:2: rule__Argument__OptionalAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Argument__OptionalAssignment_0_in_rule__Argument__Group__0__Impl904);
                    rule__Argument__OptionalAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArgumentAccess().getOptionalAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__0__Impl"


    // $ANTLR start "rule__Argument__Group__1"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:491:1: rule__Argument__Group__1 : rule__Argument__Group__1__Impl rule__Argument__Group__2 ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:495:1: ( rule__Argument__Group__1__Impl rule__Argument__Group__2 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:496:2: rule__Argument__Group__1__Impl rule__Argument__Group__2
            {
            pushFollow(FOLLOW_rule__Argument__Group__1__Impl_in_rule__Argument__Group__1935);
            rule__Argument__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__2_in_rule__Argument__Group__1938);
            rule__Argument__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__1"


    // $ANTLR start "rule__Argument__Group__1__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:503:1: rule__Argument__Group__1__Impl : ( 'argument' ) ;
    public final void rule__Argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:507:1: ( ( 'argument' ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:508:1: ( 'argument' )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:508:1: ( 'argument' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:509:1: 'argument'
            {
             before(grammarAccess.getArgumentAccess().getArgumentKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__Argument__Group__1__Impl966); 
             after(grammarAccess.getArgumentAccess().getArgumentKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__1__Impl"


    // $ANTLR start "rule__Argument__Group__2"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:522:1: rule__Argument__Group__2 : rule__Argument__Group__2__Impl rule__Argument__Group__3 ;
    public final void rule__Argument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:526:1: ( rule__Argument__Group__2__Impl rule__Argument__Group__3 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:527:2: rule__Argument__Group__2__Impl rule__Argument__Group__3
            {
            pushFollow(FOLLOW_rule__Argument__Group__2__Impl_in_rule__Argument__Group__2997);
            rule__Argument__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__3_in_rule__Argument__Group__21000);
            rule__Argument__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__2"


    // $ANTLR start "rule__Argument__Group__2__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:534:1: rule__Argument__Group__2__Impl : ( ( rule__Argument__NameAssignment_2 ) ) ;
    public final void rule__Argument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:538:1: ( ( ( rule__Argument__NameAssignment_2 ) ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:539:1: ( ( rule__Argument__NameAssignment_2 ) )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:539:1: ( ( rule__Argument__NameAssignment_2 ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:540:1: ( rule__Argument__NameAssignment_2 )
            {
             before(grammarAccess.getArgumentAccess().getNameAssignment_2()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:541:1: ( rule__Argument__NameAssignment_2 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:541:2: rule__Argument__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Argument__NameAssignment_2_in_rule__Argument__Group__2__Impl1027);
            rule__Argument__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getArgumentAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__2__Impl"


    // $ANTLR start "rule__Argument__Group__3"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:551:1: rule__Argument__Group__3 : rule__Argument__Group__3__Impl rule__Argument__Group__4 ;
    public final void rule__Argument__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:555:1: ( rule__Argument__Group__3__Impl rule__Argument__Group__4 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:556:2: rule__Argument__Group__3__Impl rule__Argument__Group__4
            {
            pushFollow(FOLLOW_rule__Argument__Group__3__Impl_in_rule__Argument__Group__31057);
            rule__Argument__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__4_in_rule__Argument__Group__31060);
            rule__Argument__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__3"


    // $ANTLR start "rule__Argument__Group__3__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:563:1: rule__Argument__Group__3__Impl : ( ( rule__Argument__Group_3__0 )? ) ;
    public final void rule__Argument__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:567:1: ( ( ( rule__Argument__Group_3__0 )? ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:568:1: ( ( rule__Argument__Group_3__0 )? )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:568:1: ( ( rule__Argument__Group_3__0 )? )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:569:1: ( rule__Argument__Group_3__0 )?
            {
             before(grammarAccess.getArgumentAccess().getGroup_3()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:570:1: ( rule__Argument__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:570:2: rule__Argument__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Argument__Group_3__0_in_rule__Argument__Group__3__Impl1087);
                    rule__Argument__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArgumentAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__3__Impl"


    // $ANTLR start "rule__Argument__Group__4"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:580:1: rule__Argument__Group__4 : rule__Argument__Group__4__Impl ;
    public final void rule__Argument__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:584:1: ( rule__Argument__Group__4__Impl )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:585:2: rule__Argument__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group__4__Impl_in_rule__Argument__Group__41118);
            rule__Argument__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__4"


    // $ANTLR start "rule__Argument__Group__4__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:591:1: rule__Argument__Group__4__Impl : ( ( rule__Argument__DescriptionAssignment_4 ) ) ;
    public final void rule__Argument__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:595:1: ( ( ( rule__Argument__DescriptionAssignment_4 ) ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:596:1: ( ( rule__Argument__DescriptionAssignment_4 ) )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:596:1: ( ( rule__Argument__DescriptionAssignment_4 ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:597:1: ( rule__Argument__DescriptionAssignment_4 )
            {
             before(grammarAccess.getArgumentAccess().getDescriptionAssignment_4()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:598:1: ( rule__Argument__DescriptionAssignment_4 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:598:2: rule__Argument__DescriptionAssignment_4
            {
            pushFollow(FOLLOW_rule__Argument__DescriptionAssignment_4_in_rule__Argument__Group__4__Impl1145);
            rule__Argument__DescriptionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getArgumentAccess().getDescriptionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__4__Impl"


    // $ANTLR start "rule__Argument__Group_3__0"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:618:1: rule__Argument__Group_3__0 : rule__Argument__Group_3__0__Impl rule__Argument__Group_3__1 ;
    public final void rule__Argument__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:622:1: ( rule__Argument__Group_3__0__Impl rule__Argument__Group_3__1 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:623:2: rule__Argument__Group_3__0__Impl rule__Argument__Group_3__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_3__0__Impl_in_rule__Argument__Group_3__01185);
            rule__Argument__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_3__1_in_rule__Argument__Group_3__01188);
            rule__Argument__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group_3__0"


    // $ANTLR start "rule__Argument__Group_3__0__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:630:1: rule__Argument__Group_3__0__Impl : ( 'with default' ) ;
    public final void rule__Argument__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:634:1: ( ( 'with default' ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:635:1: ( 'with default' )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:635:1: ( 'with default' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:636:1: 'with default'
            {
             before(grammarAccess.getArgumentAccess().getWithDefaultKeyword_3_0()); 
            match(input,18,FOLLOW_18_in_rule__Argument__Group_3__0__Impl1216); 
             after(grammarAccess.getArgumentAccess().getWithDefaultKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group_3__0__Impl"


    // $ANTLR start "rule__Argument__Group_3__1"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:649:1: rule__Argument__Group_3__1 : rule__Argument__Group_3__1__Impl ;
    public final void rule__Argument__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:653:1: ( rule__Argument__Group_3__1__Impl )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:654:2: rule__Argument__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_3__1__Impl_in_rule__Argument__Group_3__11247);
            rule__Argument__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group_3__1"


    // $ANTLR start "rule__Argument__Group_3__1__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:660:1: rule__Argument__Group_3__1__Impl : ( ( rule__Argument__DefaultAssignment_3_1 ) ) ;
    public final void rule__Argument__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:664:1: ( ( ( rule__Argument__DefaultAssignment_3_1 ) ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:665:1: ( ( rule__Argument__DefaultAssignment_3_1 ) )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:665:1: ( ( rule__Argument__DefaultAssignment_3_1 ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:666:1: ( rule__Argument__DefaultAssignment_3_1 )
            {
             before(grammarAccess.getArgumentAccess().getDefaultAssignment_3_1()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:667:1: ( rule__Argument__DefaultAssignment_3_1 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:667:2: rule__Argument__DefaultAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Argument__DefaultAssignment_3_1_in_rule__Argument__Group_3__1__Impl1274);
            rule__Argument__DefaultAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getArgumentAccess().getDefaultAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group_3__1__Impl"


    // $ANTLR start "rule__Domainmodel__ElementsAssignment"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:682:1: rule__Domainmodel__ElementsAssignment : ( ruleScript ) ;
    public final void rule__Domainmodel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:686:1: ( ( ruleScript ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:687:1: ( ruleScript )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:687:1: ( ruleScript )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:688:1: ruleScript
            {
             before(grammarAccess.getDomainmodelAccess().getElementsScriptParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleScript_in_rule__Domainmodel__ElementsAssignment1313);
            ruleScript();

            state._fsp--;

             after(grammarAccess.getDomainmodelAccess().getElementsScriptParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__ElementsAssignment"


    // $ANTLR start "rule__Script__NameAssignment_1"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:697:1: rule__Script__NameAssignment_1 : ( RULE_FILENAME ) ;
    public final void rule__Script__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:701:1: ( ( RULE_FILENAME ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:702:1: ( RULE_FILENAME )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:702:1: ( RULE_FILENAME )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:703:1: RULE_FILENAME
            {
             before(grammarAccess.getScriptAccess().getNameFILENAMETerminalRuleCall_1_0()); 
            match(input,RULE_FILENAME,FOLLOW_RULE_FILENAME_in_rule__Script__NameAssignment_11344); 
             after(grammarAccess.getScriptAccess().getNameFILENAMETerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__NameAssignment_1"


    // $ANTLR start "rule__Script__DescriptionAssignment_2"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:712:1: rule__Script__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Script__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:716:1: ( ( RULE_STRING ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:717:1: ( RULE_STRING )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:717:1: ( RULE_STRING )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:718:1: RULE_STRING
            {
             before(grammarAccess.getScriptAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Script__DescriptionAssignment_21375); 
             after(grammarAccess.getScriptAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__DescriptionAssignment_2"


    // $ANTLR start "rule__Script__CopyrightAssignment_3_1"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:727:1: rule__Script__CopyrightAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Script__CopyrightAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:731:1: ( ( RULE_STRING ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:732:1: ( RULE_STRING )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:732:1: ( RULE_STRING )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:733:1: RULE_STRING
            {
             before(grammarAccess.getScriptAccess().getCopyrightSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Script__CopyrightAssignment_3_11406); 
             after(grammarAccess.getScriptAccess().getCopyrightSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__CopyrightAssignment_3_1"


    // $ANTLR start "rule__Script__ArgumentsAssignment_5"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:742:1: rule__Script__ArgumentsAssignment_5 : ( ruleArgument ) ;
    public final void rule__Script__ArgumentsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:746:1: ( ( ruleArgument ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:747:1: ( ruleArgument )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:747:1: ( ruleArgument )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:748:1: ruleArgument
            {
             before(grammarAccess.getScriptAccess().getArgumentsArgumentParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__Script__ArgumentsAssignment_51437);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getScriptAccess().getArgumentsArgumentParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__ArgumentsAssignment_5"


    // $ANTLR start "rule__Script__CodeAssignment_6"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:757:1: rule__Script__CodeAssignment_6 : ( RULE_CODE_BLOCK ) ;
    public final void rule__Script__CodeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:761:1: ( ( RULE_CODE_BLOCK ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:762:1: ( RULE_CODE_BLOCK )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:762:1: ( RULE_CODE_BLOCK )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:763:1: RULE_CODE_BLOCK
            {
             before(grammarAccess.getScriptAccess().getCodeCODE_BLOCKTerminalRuleCall_6_0()); 
            match(input,RULE_CODE_BLOCK,FOLLOW_RULE_CODE_BLOCK_in_rule__Script__CodeAssignment_61468); 
             after(grammarAccess.getScriptAccess().getCodeCODE_BLOCKTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__CodeAssignment_6"


    // $ANTLR start "rule__Argument__OptionalAssignment_0"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:772:1: rule__Argument__OptionalAssignment_0 : ( ( 'optional' ) ) ;
    public final void rule__Argument__OptionalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:776:1: ( ( ( 'optional' ) ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:777:1: ( ( 'optional' ) )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:777:1: ( ( 'optional' ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:778:1: ( 'optional' )
            {
             before(grammarAccess.getArgumentAccess().getOptionalOptionalKeyword_0_0()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:779:1: ( 'optional' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:780:1: 'optional'
            {
             before(grammarAccess.getArgumentAccess().getOptionalOptionalKeyword_0_0()); 
            match(input,19,FOLLOW_19_in_rule__Argument__OptionalAssignment_01504); 
             after(grammarAccess.getArgumentAccess().getOptionalOptionalKeyword_0_0()); 

            }

             after(grammarAccess.getArgumentAccess().getOptionalOptionalKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__OptionalAssignment_0"


    // $ANTLR start "rule__Argument__NameAssignment_2"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:795:1: rule__Argument__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Argument__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:799:1: ( ( RULE_STRING ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:800:1: ( RULE_STRING )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:800:1: ( RULE_STRING )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:801:1: RULE_STRING
            {
             before(grammarAccess.getArgumentAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Argument__NameAssignment_21543); 
             after(grammarAccess.getArgumentAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__NameAssignment_2"


    // $ANTLR start "rule__Argument__DefaultAssignment_3_1"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:810:1: rule__Argument__DefaultAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Argument__DefaultAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:814:1: ( ( RULE_STRING ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:815:1: ( RULE_STRING )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:815:1: ( RULE_STRING )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:816:1: RULE_STRING
            {
             before(grammarAccess.getArgumentAccess().getDefaultSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Argument__DefaultAssignment_3_11574); 
             after(grammarAccess.getArgumentAccess().getDefaultSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__DefaultAssignment_3_1"


    // $ANTLR start "rule__Argument__DescriptionAssignment_4"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:825:1: rule__Argument__DescriptionAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Argument__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:829:1: ( ( RULE_STRING ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:830:1: ( RULE_STRING )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:830:1: ( RULE_STRING )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:831:1: RULE_STRING
            {
             before(grammarAccess.getArgumentAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Argument__DescriptionAssignment_41605); 
             after(grammarAccess.getArgumentAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__DescriptionAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDomainmodel_in_entryRuleDomainmodel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainmodel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domainmodel__ElementsAssignment_in_ruleDomainmodel94 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleScript_in_entryRuleScript122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScript129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__0_in_ruleScript155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__0_in_ruleArgument215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__0__Impl_in_rule__Script__Group__0249 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Script__Group__1_in_rule__Script__Group__0252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Script__Group__0__Impl280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__1__Impl_in_rule__Script__Group__1311 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Script__Group__2_in_rule__Script__Group__1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__NameAssignment_1_in_rule__Script__Group__1__Impl341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__2__Impl_in_rule__Script__Group__2371 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__Script__Group__3_in_rule__Script__Group__2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__DescriptionAssignment_2_in_rule__Script__Group__2__Impl401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__3__Impl_in_rule__Script__Group__3431 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__Script__Group__4_in_rule__Script__Group__3434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_3__0_in_rule__Script__Group__3__Impl461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__4__Impl_in_rule__Script__Group__4492 = new BitSet(new long[]{0x00000000000A8040L});
    public static final BitSet FOLLOW_rule__Script__Group__5_in_rule__Script__Group__4495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Script__Group__4__Impl523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__5__Impl_in_rule__Script__Group__5554 = new BitSet(new long[]{0x00000000000A8040L});
    public static final BitSet FOLLOW_rule__Script__Group__6_in_rule__Script__Group__5557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__ArgumentsAssignment_5_in_rule__Script__Group__5__Impl584 = new BitSet(new long[]{0x00000000000A0002L});
    public static final BitSet FOLLOW_rule__Script__Group__6__Impl_in_rule__Script__Group__6615 = new BitSet(new long[]{0x00000000000A8040L});
    public static final BitSet FOLLOW_rule__Script__Group__7_in_rule__Script__Group__6618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__CodeAssignment_6_in_rule__Script__Group__6__Impl645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__7__Impl_in_rule__Script__Group__7676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Script__Group__7__Impl704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_3__0__Impl_in_rule__Script__Group_3__0751 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Script__Group_3__1_in_rule__Script__Group_3__0754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Script__Group_3__0__Impl782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_3__1__Impl_in_rule__Script__Group_3__1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__CopyrightAssignment_3_1_in_rule__Script__Group_3__1__Impl840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__0__Impl_in_rule__Argument__Group__0874 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__0877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__OptionalAssignment_0_in_rule__Argument__Group__0__Impl904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__1__Impl_in_rule__Argument__Group__1935 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Argument__Group__2_in_rule__Argument__Group__1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Argument__Group__1__Impl966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__2__Impl_in_rule__Argument__Group__2997 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_rule__Argument__Group__3_in_rule__Argument__Group__21000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__NameAssignment_2_in_rule__Argument__Group__2__Impl1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__3__Impl_in_rule__Argument__Group__31057 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_rule__Argument__Group__4_in_rule__Argument__Group__31060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_3__0_in_rule__Argument__Group__3__Impl1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__4__Impl_in_rule__Argument__Group__41118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__DescriptionAssignment_4_in_rule__Argument__Group__4__Impl1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_3__0__Impl_in_rule__Argument__Group_3__01185 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Argument__Group_3__1_in_rule__Argument__Group_3__01188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Argument__Group_3__0__Impl1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_3__1__Impl_in_rule__Argument__Group_3__11247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__DefaultAssignment_3_1_in_rule__Argument__Group_3__1__Impl1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScript_in_rule__Domainmodel__ElementsAssignment1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FILENAME_in_rule__Script__NameAssignment_11344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Script__DescriptionAssignment_21375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Script__CopyrightAssignment_3_11406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__Script__ArgumentsAssignment_51437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CODE_BLOCK_in_rule__Script__CodeAssignment_61468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Argument__OptionalAssignment_01504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Argument__NameAssignment_21543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Argument__DefaultAssignment_3_11574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Argument__DescriptionAssignment_41605 = new BitSet(new long[]{0x0000000000000002L});

}
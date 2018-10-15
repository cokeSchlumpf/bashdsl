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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_CODE_BLOCK", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@GenerateReadme('", "')'", "','", "'script'", "'{'", "'}'", "'copyright'", "'description'", "'argument'", "'optional argument'", "'with'", "'default'", "'env'", "'def'", "'reads remaining'", "'dynamic'", "'without parameter'"
    };
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
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:69:1: ruleDomainmodel : ( ( rule__Domainmodel__Group__0 ) ) ;
    public final void ruleDomainmodel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:73:2: ( ( ( rule__Domainmodel__Group__0 ) ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:74:1: ( ( rule__Domainmodel__Group__0 ) )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:74:1: ( ( rule__Domainmodel__Group__0 ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:75:1: ( rule__Domainmodel__Group__0 )
            {
             before(grammarAccess.getDomainmodelAccess().getGroup()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:76:1: ( rule__Domainmodel__Group__0 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:76:2: rule__Domainmodel__Group__0
            {
            pushFollow(FOLLOW_rule__Domainmodel__Group__0_in_ruleDomainmodel94);
            rule__Domainmodel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDomainmodelAccess().getGroup()); 

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
            pushFollow(FOLLOW_ruleScript_in_entryRuleScript121);
            ruleScript();

            state._fsp--;

             after(grammarAccess.getScriptRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScript128); 

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
            pushFollow(FOLLOW_rule__Script__Group__0_in_ruleScript154);
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


    // $ANTLR start "entryRuleDescription"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:116:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:117:1: ( ruleDescription EOF )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:118:1: ruleDescription EOF
            {
             before(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_ruleDescription_in_entryRuleDescription181);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getDescriptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDescription188); 

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
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:125:1: ruleDescription : ( ( rule__Description__Group__0 ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:129:2: ( ( ( rule__Description__Group__0 ) ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:130:1: ( ( rule__Description__Group__0 ) )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:130:1: ( ( rule__Description__Group__0 ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:131:1: ( rule__Description__Group__0 )
            {
             before(grammarAccess.getDescriptionAccess().getGroup()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:132:1: ( rule__Description__Group__0 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:132:2: rule__Description__Group__0
            {
            pushFollow(FOLLOW_rule__Description__Group__0_in_ruleDescription214);
            rule__Description__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getGroup()); 

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
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleArgument"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:146:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:147:1: ( ruleArgument EOF )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:148:1: ruleArgument EOF
            {
             before(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument243);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getArgumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument250); 

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
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:155:1: ruleArgument : ( ( rule__Argument__Group__0 ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:159:2: ( ( ( rule__Argument__Group__0 ) ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:160:1: ( ( rule__Argument__Group__0 ) )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:160:1: ( ( rule__Argument__Group__0 ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:161:1: ( rule__Argument__Group__0 )
            {
             before(grammarAccess.getArgumentAccess().getGroup()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:162:1: ( rule__Argument__Group__0 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:162:2: rule__Argument__Group__0
            {
            pushFollow(FOLLOW_rule__Argument__Group__0_in_ruleArgument276);
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


    // $ANTLR start "entryRuleOptionalArgument"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:174:1: entryRuleOptionalArgument : ruleOptionalArgument EOF ;
    public final void entryRuleOptionalArgument() throws RecognitionException {
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:175:1: ( ruleOptionalArgument EOF )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:176:1: ruleOptionalArgument EOF
            {
             before(grammarAccess.getOptionalArgumentRule()); 
            pushFollow(FOLLOW_ruleOptionalArgument_in_entryRuleOptionalArgument303);
            ruleOptionalArgument();

            state._fsp--;

             after(grammarAccess.getOptionalArgumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionalArgument310); 

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
    // $ANTLR end "entryRuleOptionalArgument"


    // $ANTLR start "ruleOptionalArgument"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:183:1: ruleOptionalArgument : ( ( rule__OptionalArgument__Group__0 ) ) ;
    public final void ruleOptionalArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:187:2: ( ( ( rule__OptionalArgument__Group__0 ) ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:188:1: ( ( rule__OptionalArgument__Group__0 ) )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:188:1: ( ( rule__OptionalArgument__Group__0 ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:189:1: ( rule__OptionalArgument__Group__0 )
            {
             before(grammarAccess.getOptionalArgumentAccess().getGroup()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:190:1: ( rule__OptionalArgument__Group__0 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:190:2: rule__OptionalArgument__Group__0
            {
            pushFollow(FOLLOW_rule__OptionalArgument__Group__0_in_ruleOptionalArgument336);
            rule__OptionalArgument__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOptionalArgumentAccess().getGroup()); 

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
    // $ANTLR end "ruleOptionalArgument"


    // $ANTLR start "entryRuleEnvironmentVariable"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:202:1: entryRuleEnvironmentVariable : ruleEnvironmentVariable EOF ;
    public final void entryRuleEnvironmentVariable() throws RecognitionException {
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:203:1: ( ruleEnvironmentVariable EOF )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:204:1: ruleEnvironmentVariable EOF
            {
             before(grammarAccess.getEnvironmentVariableRule()); 
            pushFollow(FOLLOW_ruleEnvironmentVariable_in_entryRuleEnvironmentVariable363);
            ruleEnvironmentVariable();

            state._fsp--;

             after(grammarAccess.getEnvironmentVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnvironmentVariable370); 

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
    // $ANTLR end "entryRuleEnvironmentVariable"


    // $ANTLR start "ruleEnvironmentVariable"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:211:1: ruleEnvironmentVariable : ( ( rule__EnvironmentVariable__Group__0 ) ) ;
    public final void ruleEnvironmentVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:215:2: ( ( ( rule__EnvironmentVariable__Group__0 ) ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:216:1: ( ( rule__EnvironmentVariable__Group__0 ) )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:216:1: ( ( rule__EnvironmentVariable__Group__0 ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:217:1: ( rule__EnvironmentVariable__Group__0 )
            {
             before(grammarAccess.getEnvironmentVariableAccess().getGroup()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:218:1: ( rule__EnvironmentVariable__Group__0 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:218:2: rule__EnvironmentVariable__Group__0
            {
            pushFollow(FOLLOW_rule__EnvironmentVariable__Group__0_in_ruleEnvironmentVariable396);
            rule__EnvironmentVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentVariableAccess().getGroup()); 

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
    // $ANTLR end "ruleEnvironmentVariable"


    // $ANTLR start "entryRuleFunction"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:230:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:231:1: ( ruleFunction EOF )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:232:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction423);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getFunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction430); 

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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:239:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:243:2: ( ( ( rule__Function__Group__0 ) ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:244:1: ( ( rule__Function__Group__0 ) )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:244:1: ( ( rule__Function__Group__0 ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:245:1: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:246:1: ( rule__Function__Group__0 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:246:2: rule__Function__Group__0
            {
            pushFollow(FOLLOW_rule__Function__Group__0_in_ruleFunction456);
            rule__Function__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getGroup()); 

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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "rule__OptionalArgument__Alternatives_2"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:259:1: rule__OptionalArgument__Alternatives_2 : ( ( ( rule__OptionalArgument__Alternatives_2_0 ) ) | ( ( rule__OptionalArgument__IsBooleanAssignment_2_1 ) ) );
    public final void rule__OptionalArgument__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:263:1: ( ( ( rule__OptionalArgument__Alternatives_2_0 ) ) | ( ( rule__OptionalArgument__IsBooleanAssignment_2_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==22||LA1_0==26) ) {
                alt1=1;
            }
            else if ( (LA1_0==28) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:264:1: ( ( rule__OptionalArgument__Alternatives_2_0 ) )
                    {
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:264:1: ( ( rule__OptionalArgument__Alternatives_2_0 ) )
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:265:1: ( rule__OptionalArgument__Alternatives_2_0 )
                    {
                     before(grammarAccess.getOptionalArgumentAccess().getAlternatives_2_0()); 
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:266:1: ( rule__OptionalArgument__Alternatives_2_0 )
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:266:2: rule__OptionalArgument__Alternatives_2_0
                    {
                    pushFollow(FOLLOW_rule__OptionalArgument__Alternatives_2_0_in_rule__OptionalArgument__Alternatives_2493);
                    rule__OptionalArgument__Alternatives_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOptionalArgumentAccess().getAlternatives_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:270:6: ( ( rule__OptionalArgument__IsBooleanAssignment_2_1 ) )
                    {
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:270:6: ( ( rule__OptionalArgument__IsBooleanAssignment_2_1 ) )
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:271:1: ( rule__OptionalArgument__IsBooleanAssignment_2_1 )
                    {
                     before(grammarAccess.getOptionalArgumentAccess().getIsBooleanAssignment_2_1()); 
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:272:1: ( rule__OptionalArgument__IsBooleanAssignment_2_1 )
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:272:2: rule__OptionalArgument__IsBooleanAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__OptionalArgument__IsBooleanAssignment_2_1_in_rule__OptionalArgument__Alternatives_2511);
                    rule__OptionalArgument__IsBooleanAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getOptionalArgumentAccess().getIsBooleanAssignment_2_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__OptionalArgument__Alternatives_2"


    // $ANTLR start "rule__OptionalArgument__Alternatives_2_0"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:281:1: rule__OptionalArgument__Alternatives_2_0 : ( ( ( rule__OptionalArgument__Group_2_0_0__0 ) ) | ( ( rule__OptionalArgument__RemainingAssignment_2_0_1 ) ) );
    public final void rule__OptionalArgument__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:285:1: ( ( ( rule__OptionalArgument__Group_2_0_0__0 ) ) | ( ( rule__OptionalArgument__RemainingAssignment_2_0_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==22) ) {
                alt2=1;
            }
            else if ( (LA2_0==26) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:286:1: ( ( rule__OptionalArgument__Group_2_0_0__0 ) )
                    {
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:286:1: ( ( rule__OptionalArgument__Group_2_0_0__0 ) )
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:287:1: ( rule__OptionalArgument__Group_2_0_0__0 )
                    {
                     before(grammarAccess.getOptionalArgumentAccess().getGroup_2_0_0()); 
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:288:1: ( rule__OptionalArgument__Group_2_0_0__0 )
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:288:2: rule__OptionalArgument__Group_2_0_0__0
                    {
                    pushFollow(FOLLOW_rule__OptionalArgument__Group_2_0_0__0_in_rule__OptionalArgument__Alternatives_2_0544);
                    rule__OptionalArgument__Group_2_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOptionalArgumentAccess().getGroup_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:292:6: ( ( rule__OptionalArgument__RemainingAssignment_2_0_1 ) )
                    {
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:292:6: ( ( rule__OptionalArgument__RemainingAssignment_2_0_1 ) )
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:293:1: ( rule__OptionalArgument__RemainingAssignment_2_0_1 )
                    {
                     before(grammarAccess.getOptionalArgumentAccess().getRemainingAssignment_2_0_1()); 
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:294:1: ( rule__OptionalArgument__RemainingAssignment_2_0_1 )
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:294:2: rule__OptionalArgument__RemainingAssignment_2_0_1
                    {
                    pushFollow(FOLLOW_rule__OptionalArgument__RemainingAssignment_2_0_1_in_rule__OptionalArgument__Alternatives_2_0562);
                    rule__OptionalArgument__RemainingAssignment_2_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getOptionalArgumentAccess().getRemainingAssignment_2_0_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__OptionalArgument__Alternatives_2_0"


    // $ANTLR start "rule__Domainmodel__Group__0"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:305:1: rule__Domainmodel__Group__0 : rule__Domainmodel__Group__0__Impl rule__Domainmodel__Group__1 ;
    public final void rule__Domainmodel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:309:1: ( rule__Domainmodel__Group__0__Impl rule__Domainmodel__Group__1 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:310:2: rule__Domainmodel__Group__0__Impl rule__Domainmodel__Group__1
            {
            pushFollow(FOLLOW_rule__Domainmodel__Group__0__Impl_in_rule__Domainmodel__Group__0593);
            rule__Domainmodel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domainmodel__Group__1_in_rule__Domainmodel__Group__0596);
            rule__Domainmodel__Group__1();

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
    // $ANTLR end "rule__Domainmodel__Group__0"


    // $ANTLR start "rule__Domainmodel__Group__0__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:317:1: rule__Domainmodel__Group__0__Impl : ( '@GenerateReadme(' ) ;
    public final void rule__Domainmodel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:321:1: ( ( '@GenerateReadme(' ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:322:1: ( '@GenerateReadme(' )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:322:1: ( '@GenerateReadme(' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:323:1: '@GenerateReadme('
            {
             before(grammarAccess.getDomainmodelAccess().getGenerateReadmeKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Domainmodel__Group__0__Impl624); 
             after(grammarAccess.getDomainmodelAccess().getGenerateReadmeKeyword_0()); 

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
    // $ANTLR end "rule__Domainmodel__Group__0__Impl"


    // $ANTLR start "rule__Domainmodel__Group__1"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:336:1: rule__Domainmodel__Group__1 : rule__Domainmodel__Group__1__Impl rule__Domainmodel__Group__2 ;
    public final void rule__Domainmodel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:340:1: ( rule__Domainmodel__Group__1__Impl rule__Domainmodel__Group__2 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:341:2: rule__Domainmodel__Group__1__Impl rule__Domainmodel__Group__2
            {
            pushFollow(FOLLOW_rule__Domainmodel__Group__1__Impl_in_rule__Domainmodel__Group__1655);
            rule__Domainmodel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domainmodel__Group__2_in_rule__Domainmodel__Group__1658);
            rule__Domainmodel__Group__2();

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
    // $ANTLR end "rule__Domainmodel__Group__1"


    // $ANTLR start "rule__Domainmodel__Group__1__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:348:1: rule__Domainmodel__Group__1__Impl : ( ( rule__Domainmodel__ReadmeTitleAssignment_1 ) ) ;
    public final void rule__Domainmodel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:352:1: ( ( ( rule__Domainmodel__ReadmeTitleAssignment_1 ) ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:353:1: ( ( rule__Domainmodel__ReadmeTitleAssignment_1 ) )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:353:1: ( ( rule__Domainmodel__ReadmeTitleAssignment_1 ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:354:1: ( rule__Domainmodel__ReadmeTitleAssignment_1 )
            {
             before(grammarAccess.getDomainmodelAccess().getReadmeTitleAssignment_1()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:355:1: ( rule__Domainmodel__ReadmeTitleAssignment_1 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:355:2: rule__Domainmodel__ReadmeTitleAssignment_1
            {
            pushFollow(FOLLOW_rule__Domainmodel__ReadmeTitleAssignment_1_in_rule__Domainmodel__Group__1__Impl685);
            rule__Domainmodel__ReadmeTitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDomainmodelAccess().getReadmeTitleAssignment_1()); 

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
    // $ANTLR end "rule__Domainmodel__Group__1__Impl"


    // $ANTLR start "rule__Domainmodel__Group__2"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:365:1: rule__Domainmodel__Group__2 : rule__Domainmodel__Group__2__Impl rule__Domainmodel__Group__3 ;
    public final void rule__Domainmodel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:369:1: ( rule__Domainmodel__Group__2__Impl rule__Domainmodel__Group__3 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:370:2: rule__Domainmodel__Group__2__Impl rule__Domainmodel__Group__3
            {
            pushFollow(FOLLOW_rule__Domainmodel__Group__2__Impl_in_rule__Domainmodel__Group__2715);
            rule__Domainmodel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domainmodel__Group__3_in_rule__Domainmodel__Group__2718);
            rule__Domainmodel__Group__3();

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
    // $ANTLR end "rule__Domainmodel__Group__2"


    // $ANTLR start "rule__Domainmodel__Group__2__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:377:1: rule__Domainmodel__Group__2__Impl : ( ( rule__Domainmodel__Group_2__0 )? ) ;
    public final void rule__Domainmodel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:381:1: ( ( ( rule__Domainmodel__Group_2__0 )? ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:382:1: ( ( rule__Domainmodel__Group_2__0 )? )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:382:1: ( ( rule__Domainmodel__Group_2__0 )? )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:383:1: ( rule__Domainmodel__Group_2__0 )?
            {
             before(grammarAccess.getDomainmodelAccess().getGroup_2()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:384:1: ( rule__Domainmodel__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:384:2: rule__Domainmodel__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Domainmodel__Group_2__0_in_rule__Domainmodel__Group__2__Impl745);
                    rule__Domainmodel__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDomainmodelAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Domainmodel__Group__2__Impl"


    // $ANTLR start "rule__Domainmodel__Group__3"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:394:1: rule__Domainmodel__Group__3 : rule__Domainmodel__Group__3__Impl rule__Domainmodel__Group__4 ;
    public final void rule__Domainmodel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:398:1: ( rule__Domainmodel__Group__3__Impl rule__Domainmodel__Group__4 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:399:2: rule__Domainmodel__Group__3__Impl rule__Domainmodel__Group__4
            {
            pushFollow(FOLLOW_rule__Domainmodel__Group__3__Impl_in_rule__Domainmodel__Group__3776);
            rule__Domainmodel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domainmodel__Group__4_in_rule__Domainmodel__Group__3779);
            rule__Domainmodel__Group__4();

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
    // $ANTLR end "rule__Domainmodel__Group__3"


    // $ANTLR start "rule__Domainmodel__Group__3__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:406:1: rule__Domainmodel__Group__3__Impl : ( ')' ) ;
    public final void rule__Domainmodel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:410:1: ( ( ')' ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:411:1: ( ')' )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:411:1: ( ')' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:412:1: ')'
            {
             before(grammarAccess.getDomainmodelAccess().getRightParenthesisKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__Domainmodel__Group__3__Impl807); 
             after(grammarAccess.getDomainmodelAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Domainmodel__Group__3__Impl"


    // $ANTLR start "rule__Domainmodel__Group__4"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:425:1: rule__Domainmodel__Group__4 : rule__Domainmodel__Group__4__Impl ;
    public final void rule__Domainmodel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:429:1: ( rule__Domainmodel__Group__4__Impl )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:430:2: rule__Domainmodel__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Domainmodel__Group__4__Impl_in_rule__Domainmodel__Group__4838);
            rule__Domainmodel__Group__4__Impl();

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
    // $ANTLR end "rule__Domainmodel__Group__4"


    // $ANTLR start "rule__Domainmodel__Group__4__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:436:1: rule__Domainmodel__Group__4__Impl : ( ( rule__Domainmodel__ElementsAssignment_4 )* ) ;
    public final void rule__Domainmodel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:440:1: ( ( ( rule__Domainmodel__ElementsAssignment_4 )* ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:441:1: ( ( rule__Domainmodel__ElementsAssignment_4 )* )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:441:1: ( ( rule__Domainmodel__ElementsAssignment_4 )* )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:442:1: ( rule__Domainmodel__ElementsAssignment_4 )*
            {
             before(grammarAccess.getDomainmodelAccess().getElementsAssignment_4()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:443:1: ( rule__Domainmodel__ElementsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:443:2: rule__Domainmodel__ElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Domainmodel__ElementsAssignment_4_in_rule__Domainmodel__Group__4__Impl865);
            	    rule__Domainmodel__ElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getDomainmodelAccess().getElementsAssignment_4()); 

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
    // $ANTLR end "rule__Domainmodel__Group__4__Impl"


    // $ANTLR start "rule__Domainmodel__Group_2__0"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:463:1: rule__Domainmodel__Group_2__0 : rule__Domainmodel__Group_2__0__Impl rule__Domainmodel__Group_2__1 ;
    public final void rule__Domainmodel__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:467:1: ( rule__Domainmodel__Group_2__0__Impl rule__Domainmodel__Group_2__1 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:468:2: rule__Domainmodel__Group_2__0__Impl rule__Domainmodel__Group_2__1
            {
            pushFollow(FOLLOW_rule__Domainmodel__Group_2__0__Impl_in_rule__Domainmodel__Group_2__0906);
            rule__Domainmodel__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domainmodel__Group_2__1_in_rule__Domainmodel__Group_2__0909);
            rule__Domainmodel__Group_2__1();

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
    // $ANTLR end "rule__Domainmodel__Group_2__0"


    // $ANTLR start "rule__Domainmodel__Group_2__0__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:475:1: rule__Domainmodel__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Domainmodel__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:479:1: ( ( ',' ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:480:1: ( ',' )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:480:1: ( ',' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:481:1: ','
            {
             before(grammarAccess.getDomainmodelAccess().getCommaKeyword_2_0()); 
            match(input,14,FOLLOW_14_in_rule__Domainmodel__Group_2__0__Impl937); 
             after(grammarAccess.getDomainmodelAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__Domainmodel__Group_2__0__Impl"


    // $ANTLR start "rule__Domainmodel__Group_2__1"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:494:1: rule__Domainmodel__Group_2__1 : rule__Domainmodel__Group_2__1__Impl ;
    public final void rule__Domainmodel__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:498:1: ( rule__Domainmodel__Group_2__1__Impl )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:499:2: rule__Domainmodel__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Domainmodel__Group_2__1__Impl_in_rule__Domainmodel__Group_2__1968);
            rule__Domainmodel__Group_2__1__Impl();

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
    // $ANTLR end "rule__Domainmodel__Group_2__1"


    // $ANTLR start "rule__Domainmodel__Group_2__1__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:505:1: rule__Domainmodel__Group_2__1__Impl : ( ( rule__Domainmodel__ReadmeIntroAssignment_2_1 ) ) ;
    public final void rule__Domainmodel__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:509:1: ( ( ( rule__Domainmodel__ReadmeIntroAssignment_2_1 ) ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:510:1: ( ( rule__Domainmodel__ReadmeIntroAssignment_2_1 ) )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:510:1: ( ( rule__Domainmodel__ReadmeIntroAssignment_2_1 ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:511:1: ( rule__Domainmodel__ReadmeIntroAssignment_2_1 )
            {
             before(grammarAccess.getDomainmodelAccess().getReadmeIntroAssignment_2_1()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:512:1: ( rule__Domainmodel__ReadmeIntroAssignment_2_1 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:512:2: rule__Domainmodel__ReadmeIntroAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Domainmodel__ReadmeIntroAssignment_2_1_in_rule__Domainmodel__Group_2__1__Impl995);
            rule__Domainmodel__ReadmeIntroAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDomainmodelAccess().getReadmeIntroAssignment_2_1()); 

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
    // $ANTLR end "rule__Domainmodel__Group_2__1__Impl"


    // $ANTLR start "rule__Script__Group__0"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:526:1: rule__Script__Group__0 : rule__Script__Group__0__Impl rule__Script__Group__1 ;
    public final void rule__Script__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:530:1: ( rule__Script__Group__0__Impl rule__Script__Group__1 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:531:2: rule__Script__Group__0__Impl rule__Script__Group__1
            {
            pushFollow(FOLLOW_rule__Script__Group__0__Impl_in_rule__Script__Group__01029);
            rule__Script__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Script__Group__1_in_rule__Script__Group__01032);
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
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:538:1: rule__Script__Group__0__Impl : ( 'script' ) ;
    public final void rule__Script__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:542:1: ( ( 'script' ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:543:1: ( 'script' )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:543:1: ( 'script' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:544:1: 'script'
            {
             before(grammarAccess.getScriptAccess().getScriptKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Script__Group__0__Impl1060); 
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
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:557:1: rule__Script__Group__1 : rule__Script__Group__1__Impl rule__Script__Group__2 ;
    public final void rule__Script__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:561:1: ( rule__Script__Group__1__Impl rule__Script__Group__2 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:562:2: rule__Script__Group__1__Impl rule__Script__Group__2
            {
            pushFollow(FOLLOW_rule__Script__Group__1__Impl_in_rule__Script__Group__11091);
            rule__Script__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Script__Group__2_in_rule__Script__Group__11094);
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
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:569:1: rule__Script__Group__1__Impl : ( ( rule__Script__NameAssignment_1 ) ) ;
    public final void rule__Script__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:573:1: ( ( ( rule__Script__NameAssignment_1 ) ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:574:1: ( ( rule__Script__NameAssignment_1 ) )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:574:1: ( ( rule__Script__NameAssignment_1 ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:575:1: ( rule__Script__NameAssignment_1 )
            {
             before(grammarAccess.getScriptAccess().getNameAssignment_1()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:576:1: ( rule__Script__NameAssignment_1 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:576:2: rule__Script__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Script__NameAssignment_1_in_rule__Script__Group__1__Impl1121);
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
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:586:1: rule__Script__Group__2 : rule__Script__Group__2__Impl rule__Script__Group__3 ;
    public final void rule__Script__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:590:1: ( rule__Script__Group__2__Impl rule__Script__Group__3 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:591:2: rule__Script__Group__2__Impl rule__Script__Group__3
            {
            pushFollow(FOLLOW_rule__Script__Group__2__Impl_in_rule__Script__Group__21151);
            rule__Script__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Script__Group__3_in_rule__Script__Group__21154);
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
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:598:1: rule__Script__Group__2__Impl : ( ( rule__Script__DescriptionAssignment_2 ) ) ;
    public final void rule__Script__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:602:1: ( ( ( rule__Script__DescriptionAssignment_2 ) ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:603:1: ( ( rule__Script__DescriptionAssignment_2 ) )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:603:1: ( ( rule__Script__DescriptionAssignment_2 ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:604:1: ( rule__Script__DescriptionAssignment_2 )
            {
             before(grammarAccess.getScriptAccess().getDescriptionAssignment_2()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:605:1: ( rule__Script__DescriptionAssignment_2 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:605:2: rule__Script__DescriptionAssignment_2
            {
            pushFollow(FOLLOW_rule__Script__DescriptionAssignment_2_in_rule__Script__Group__2__Impl1181);
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
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:615:1: rule__Script__Group__3 : rule__Script__Group__3__Impl rule__Script__Group__4 ;
    public final void rule__Script__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:619:1: ( rule__Script__Group__3__Impl rule__Script__Group__4 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:620:2: rule__Script__Group__3__Impl rule__Script__Group__4
            {
            pushFollow(FOLLOW_rule__Script__Group__3__Impl_in_rule__Script__Group__31211);
            rule__Script__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Script__Group__4_in_rule__Script__Group__31214);
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
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:627:1: rule__Script__Group__3__Impl : ( ( rule__Script__Group_3__0 )? ) ;
    public final void rule__Script__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:631:1: ( ( ( rule__Script__Group_3__0 )? ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:632:1: ( ( rule__Script__Group_3__0 )? )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:632:1: ( ( rule__Script__Group_3__0 )? )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:633:1: ( rule__Script__Group_3__0 )?
            {
             before(grammarAccess.getScriptAccess().getGroup_3()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:634:1: ( rule__Script__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:634:2: rule__Script__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Script__Group_3__0_in_rule__Script__Group__3__Impl1241);
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
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:644:1: rule__Script__Group__4 : rule__Script__Group__4__Impl rule__Script__Group__5 ;
    public final void rule__Script__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:648:1: ( rule__Script__Group__4__Impl rule__Script__Group__5 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:649:2: rule__Script__Group__4__Impl rule__Script__Group__5
            {
            pushFollow(FOLLOW_rule__Script__Group__4__Impl_in_rule__Script__Group__41272);
            rule__Script__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Script__Group__5_in_rule__Script__Group__41275);
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
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:656:1: rule__Script__Group__4__Impl : ( '{' ) ;
    public final void rule__Script__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:660:1: ( ( '{' ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:661:1: ( '{' )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:661:1: ( '{' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:662:1: '{'
            {
             before(grammarAccess.getScriptAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__Script__Group__4__Impl1303); 
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
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:675:1: rule__Script__Group__5 : rule__Script__Group__5__Impl rule__Script__Group__6 ;
    public final void rule__Script__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:679:1: ( rule__Script__Group__5__Impl rule__Script__Group__6 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:680:2: rule__Script__Group__5__Impl rule__Script__Group__6
            {
            pushFollow(FOLLOW_rule__Script__Group__5__Impl_in_rule__Script__Group__51334);
            rule__Script__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Script__Group__6_in_rule__Script__Group__51337);
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
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:687:1: rule__Script__Group__5__Impl : ( ( rule__Script__LongDescriptionAssignment_5 )? ) ;
    public final void rule__Script__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:691:1: ( ( ( rule__Script__LongDescriptionAssignment_5 )? ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:692:1: ( ( rule__Script__LongDescriptionAssignment_5 )? )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:692:1: ( ( rule__Script__LongDescriptionAssignment_5 )? )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:693:1: ( rule__Script__LongDescriptionAssignment_5 )?
            {
             before(grammarAccess.getScriptAccess().getLongDescriptionAssignment_5()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:694:1: ( rule__Script__LongDescriptionAssignment_5 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:694:2: rule__Script__LongDescriptionAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Script__LongDescriptionAssignment_5_in_rule__Script__Group__5__Impl1364);
                    rule__Script__LongDescriptionAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScriptAccess().getLongDescriptionAssignment_5()); 

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
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:704:1: rule__Script__Group__6 : rule__Script__Group__6__Impl rule__Script__Group__7 ;
    public final void rule__Script__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:708:1: ( rule__Script__Group__6__Impl rule__Script__Group__7 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:709:2: rule__Script__Group__6__Impl rule__Script__Group__7
            {
            pushFollow(FOLLOW_rule__Script__Group__6__Impl_in_rule__Script__Group__61395);
            rule__Script__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Script__Group__7_in_rule__Script__Group__61398);
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
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:716:1: rule__Script__Group__6__Impl : ( ( rule__Script__VariablesAssignment_6 )* ) ;
    public final void rule__Script__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:720:1: ( ( ( rule__Script__VariablesAssignment_6 )* ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:721:1: ( ( rule__Script__VariablesAssignment_6 )* )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:721:1: ( ( rule__Script__VariablesAssignment_6 )* )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:722:1: ( rule__Script__VariablesAssignment_6 )*
            {
             before(grammarAccess.getScriptAccess().getVariablesAssignment_6()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:723:1: ( rule__Script__VariablesAssignment_6 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:723:2: rule__Script__VariablesAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Script__VariablesAssignment_6_in_rule__Script__Group__6__Impl1425);
            	    rule__Script__VariablesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getScriptAccess().getVariablesAssignment_6()); 

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
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:733:1: rule__Script__Group__7 : rule__Script__Group__7__Impl rule__Script__Group__8 ;
    public final void rule__Script__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:737:1: ( rule__Script__Group__7__Impl rule__Script__Group__8 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:738:2: rule__Script__Group__7__Impl rule__Script__Group__8
            {
            pushFollow(FOLLOW_rule__Script__Group__7__Impl_in_rule__Script__Group__71456);
            rule__Script__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Script__Group__8_in_rule__Script__Group__71459);
            rule__Script__Group__8();

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
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:745:1: rule__Script__Group__7__Impl : ( ( rule__Script__ArgumentsAssignment_7 )* ) ;
    public final void rule__Script__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:749:1: ( ( ( rule__Script__ArgumentsAssignment_7 )* ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:750:1: ( ( rule__Script__ArgumentsAssignment_7 )* )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:750:1: ( ( rule__Script__ArgumentsAssignment_7 )* )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:751:1: ( rule__Script__ArgumentsAssignment_7 )*
            {
             before(grammarAccess.getScriptAccess().getArgumentsAssignment_7()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:752:1: ( rule__Script__ArgumentsAssignment_7 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:752:2: rule__Script__ArgumentsAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Script__ArgumentsAssignment_7_in_rule__Script__Group__7__Impl1486);
            	    rule__Script__ArgumentsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getScriptAccess().getArgumentsAssignment_7()); 

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


    // $ANTLR start "rule__Script__Group__8"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:762:1: rule__Script__Group__8 : rule__Script__Group__8__Impl rule__Script__Group__9 ;
    public final void rule__Script__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:766:1: ( rule__Script__Group__8__Impl rule__Script__Group__9 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:767:2: rule__Script__Group__8__Impl rule__Script__Group__9
            {
            pushFollow(FOLLOW_rule__Script__Group__8__Impl_in_rule__Script__Group__81517);
            rule__Script__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Script__Group__9_in_rule__Script__Group__81520);
            rule__Script__Group__9();

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
    // $ANTLR end "rule__Script__Group__8"


    // $ANTLR start "rule__Script__Group__8__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:774:1: rule__Script__Group__8__Impl : ( ( rule__Script__OptArgumentsAssignment_8 )* ) ;
    public final void rule__Script__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:778:1: ( ( ( rule__Script__OptArgumentsAssignment_8 )* ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:779:1: ( ( rule__Script__OptArgumentsAssignment_8 )* )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:779:1: ( ( rule__Script__OptArgumentsAssignment_8 )* )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:780:1: ( rule__Script__OptArgumentsAssignment_8 )*
            {
             before(grammarAccess.getScriptAccess().getOptArgumentsAssignment_8()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:781:1: ( rule__Script__OptArgumentsAssignment_8 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:781:2: rule__Script__OptArgumentsAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__Script__OptArgumentsAssignment_8_in_rule__Script__Group__8__Impl1547);
            	    rule__Script__OptArgumentsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getScriptAccess().getOptArgumentsAssignment_8()); 

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
    // $ANTLR end "rule__Script__Group__8__Impl"


    // $ANTLR start "rule__Script__Group__9"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:791:1: rule__Script__Group__9 : rule__Script__Group__9__Impl rule__Script__Group__10 ;
    public final void rule__Script__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:795:1: ( rule__Script__Group__9__Impl rule__Script__Group__10 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:796:2: rule__Script__Group__9__Impl rule__Script__Group__10
            {
            pushFollow(FOLLOW_rule__Script__Group__9__Impl_in_rule__Script__Group__91578);
            rule__Script__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Script__Group__10_in_rule__Script__Group__91581);
            rule__Script__Group__10();

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
    // $ANTLR end "rule__Script__Group__9"


    // $ANTLR start "rule__Script__Group__9__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:803:1: rule__Script__Group__9__Impl : ( ( rule__Script__FunctionsAssignment_9 )* ) ;
    public final void rule__Script__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:807:1: ( ( ( rule__Script__FunctionsAssignment_9 )* ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:808:1: ( ( rule__Script__FunctionsAssignment_9 )* )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:808:1: ( ( rule__Script__FunctionsAssignment_9 )* )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:809:1: ( rule__Script__FunctionsAssignment_9 )*
            {
             before(grammarAccess.getScriptAccess().getFunctionsAssignment_9()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:810:1: ( rule__Script__FunctionsAssignment_9 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:810:2: rule__Script__FunctionsAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__Script__FunctionsAssignment_9_in_rule__Script__Group__9__Impl1608);
            	    rule__Script__FunctionsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getScriptAccess().getFunctionsAssignment_9()); 

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
    // $ANTLR end "rule__Script__Group__9__Impl"


    // $ANTLR start "rule__Script__Group__10"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:820:1: rule__Script__Group__10 : rule__Script__Group__10__Impl rule__Script__Group__11 ;
    public final void rule__Script__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:824:1: ( rule__Script__Group__10__Impl rule__Script__Group__11 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:825:2: rule__Script__Group__10__Impl rule__Script__Group__11
            {
            pushFollow(FOLLOW_rule__Script__Group__10__Impl_in_rule__Script__Group__101639);
            rule__Script__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Script__Group__11_in_rule__Script__Group__101642);
            rule__Script__Group__11();

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
    // $ANTLR end "rule__Script__Group__10"


    // $ANTLR start "rule__Script__Group__10__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:832:1: rule__Script__Group__10__Impl : ( ( rule__Script__CodeAssignment_10 ) ) ;
    public final void rule__Script__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:836:1: ( ( ( rule__Script__CodeAssignment_10 ) ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:837:1: ( ( rule__Script__CodeAssignment_10 ) )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:837:1: ( ( rule__Script__CodeAssignment_10 ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:838:1: ( rule__Script__CodeAssignment_10 )
            {
             before(grammarAccess.getScriptAccess().getCodeAssignment_10()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:839:1: ( rule__Script__CodeAssignment_10 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:839:2: rule__Script__CodeAssignment_10
            {
            pushFollow(FOLLOW_rule__Script__CodeAssignment_10_in_rule__Script__Group__10__Impl1669);
            rule__Script__CodeAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getScriptAccess().getCodeAssignment_10()); 

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
    // $ANTLR end "rule__Script__Group__10__Impl"


    // $ANTLR start "rule__Script__Group__11"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:849:1: rule__Script__Group__11 : rule__Script__Group__11__Impl ;
    public final void rule__Script__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:853:1: ( rule__Script__Group__11__Impl )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:854:2: rule__Script__Group__11__Impl
            {
            pushFollow(FOLLOW_rule__Script__Group__11__Impl_in_rule__Script__Group__111699);
            rule__Script__Group__11__Impl();

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
    // $ANTLR end "rule__Script__Group__11"


    // $ANTLR start "rule__Script__Group__11__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:860:1: rule__Script__Group__11__Impl : ( '}' ) ;
    public final void rule__Script__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:864:1: ( ( '}' ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:865:1: ( '}' )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:865:1: ( '}' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:866:1: '}'
            {
             before(grammarAccess.getScriptAccess().getRightCurlyBracketKeyword_11()); 
            match(input,17,FOLLOW_17_in_rule__Script__Group__11__Impl1727); 
             after(grammarAccess.getScriptAccess().getRightCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__Script__Group__11__Impl"


    // $ANTLR start "rule__Script__Group_3__0"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:903:1: rule__Script__Group_3__0 : rule__Script__Group_3__0__Impl rule__Script__Group_3__1 ;
    public final void rule__Script__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:907:1: ( rule__Script__Group_3__0__Impl rule__Script__Group_3__1 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:908:2: rule__Script__Group_3__0__Impl rule__Script__Group_3__1
            {
            pushFollow(FOLLOW_rule__Script__Group_3__0__Impl_in_rule__Script__Group_3__01782);
            rule__Script__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Script__Group_3__1_in_rule__Script__Group_3__01785);
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
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:915:1: rule__Script__Group_3__0__Impl : ( 'copyright' ) ;
    public final void rule__Script__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:919:1: ( ( 'copyright' ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:920:1: ( 'copyright' )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:920:1: ( 'copyright' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:921:1: 'copyright'
            {
             before(grammarAccess.getScriptAccess().getCopyrightKeyword_3_0()); 
            match(input,18,FOLLOW_18_in_rule__Script__Group_3__0__Impl1813); 
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
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:934:1: rule__Script__Group_3__1 : rule__Script__Group_3__1__Impl ;
    public final void rule__Script__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:938:1: ( rule__Script__Group_3__1__Impl )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:939:2: rule__Script__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Script__Group_3__1__Impl_in_rule__Script__Group_3__11844);
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
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:945:1: rule__Script__Group_3__1__Impl : ( ( rule__Script__CopyrightAssignment_3_1 ) ) ;
    public final void rule__Script__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:949:1: ( ( ( rule__Script__CopyrightAssignment_3_1 ) ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:950:1: ( ( rule__Script__CopyrightAssignment_3_1 ) )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:950:1: ( ( rule__Script__CopyrightAssignment_3_1 ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:951:1: ( rule__Script__CopyrightAssignment_3_1 )
            {
             before(grammarAccess.getScriptAccess().getCopyrightAssignment_3_1()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:952:1: ( rule__Script__CopyrightAssignment_3_1 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:952:2: rule__Script__CopyrightAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Script__CopyrightAssignment_3_1_in_rule__Script__Group_3__1__Impl1871);
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


    // $ANTLR start "rule__Description__Group__0"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:966:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:970:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:971:2: rule__Description__Group__0__Impl rule__Description__Group__1
            {
            pushFollow(FOLLOW_rule__Description__Group__0__Impl_in_rule__Description__Group__01905);
            rule__Description__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Description__Group__1_in_rule__Description__Group__01908);
            rule__Description__Group__1();

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
    // $ANTLR end "rule__Description__Group__0"


    // $ANTLR start "rule__Description__Group__0__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:978:1: rule__Description__Group__0__Impl : ( 'description' ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:982:1: ( ( 'description' ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:983:1: ( 'description' )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:983:1: ( 'description' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:984:1: 'description'
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Description__Group__0__Impl1936); 
             after(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 

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
    // $ANTLR end "rule__Description__Group__0__Impl"


    // $ANTLR start "rule__Description__Group__1"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:997:1: rule__Description__Group__1 : rule__Description__Group__1__Impl ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1001:1: ( rule__Description__Group__1__Impl )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1002:2: rule__Description__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Description__Group__1__Impl_in_rule__Description__Group__11967);
            rule__Description__Group__1__Impl();

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
    // $ANTLR end "rule__Description__Group__1"


    // $ANTLR start "rule__Description__Group__1__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1008:1: rule__Description__Group__1__Impl : ( ( rule__Description__ValueAssignment_1 ) ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1012:1: ( ( ( rule__Description__ValueAssignment_1 ) ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1013:1: ( ( rule__Description__ValueAssignment_1 ) )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1013:1: ( ( rule__Description__ValueAssignment_1 ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1014:1: ( rule__Description__ValueAssignment_1 )
            {
             before(grammarAccess.getDescriptionAccess().getValueAssignment_1()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1015:1: ( rule__Description__ValueAssignment_1 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1015:2: rule__Description__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Description__ValueAssignment_1_in_rule__Description__Group__1__Impl1994);
            rule__Description__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__Description__Group__1__Impl"


    // $ANTLR start "rule__Argument__Group__0"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1029:1: rule__Argument__Group__0 : rule__Argument__Group__0__Impl rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1033:1: ( rule__Argument__Group__0__Impl rule__Argument__Group__1 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1034:2: rule__Argument__Group__0__Impl rule__Argument__Group__1
            {
            pushFollow(FOLLOW_rule__Argument__Group__0__Impl_in_rule__Argument__Group__02028);
            rule__Argument__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__02031);
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
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1041:1: rule__Argument__Group__0__Impl : ( 'argument' ) ;
    public final void rule__Argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1045:1: ( ( 'argument' ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1046:1: ( 'argument' )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1046:1: ( 'argument' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1047:1: 'argument'
            {
             before(grammarAccess.getArgumentAccess().getArgumentKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Argument__Group__0__Impl2059); 
             after(grammarAccess.getArgumentAccess().getArgumentKeyword_0()); 

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
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1060:1: rule__Argument__Group__1 : rule__Argument__Group__1__Impl rule__Argument__Group__2 ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1064:1: ( rule__Argument__Group__1__Impl rule__Argument__Group__2 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1065:2: rule__Argument__Group__1__Impl rule__Argument__Group__2
            {
            pushFollow(FOLLOW_rule__Argument__Group__1__Impl_in_rule__Argument__Group__12090);
            rule__Argument__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__2_in_rule__Argument__Group__12093);
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
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1072:1: rule__Argument__Group__1__Impl : ( ( rule__Argument__NameAssignment_1 ) ) ;
    public final void rule__Argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1076:1: ( ( ( rule__Argument__NameAssignment_1 ) ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1077:1: ( ( rule__Argument__NameAssignment_1 ) )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1077:1: ( ( rule__Argument__NameAssignment_1 ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1078:1: ( rule__Argument__NameAssignment_1 )
            {
             before(grammarAccess.getArgumentAccess().getNameAssignment_1()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1079:1: ( rule__Argument__NameAssignment_1 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1079:2: rule__Argument__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Argument__NameAssignment_1_in_rule__Argument__Group__1__Impl2120);
            rule__Argument__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArgumentAccess().getNameAssignment_1()); 

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
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1089:1: rule__Argument__Group__2 : rule__Argument__Group__2__Impl rule__Argument__Group__3 ;
    public final void rule__Argument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1093:1: ( rule__Argument__Group__2__Impl rule__Argument__Group__3 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1094:2: rule__Argument__Group__2__Impl rule__Argument__Group__3
            {
            pushFollow(FOLLOW_rule__Argument__Group__2__Impl_in_rule__Argument__Group__22150);
            rule__Argument__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__3_in_rule__Argument__Group__22153);
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
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1101:1: rule__Argument__Group__2__Impl : ( ( rule__Argument__RemainingAssignment_2 )? ) ;
    public final void rule__Argument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1105:1: ( ( ( rule__Argument__RemainingAssignment_2 )? ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1106:1: ( ( rule__Argument__RemainingAssignment_2 )? )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1106:1: ( ( rule__Argument__RemainingAssignment_2 )? )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1107:1: ( rule__Argument__RemainingAssignment_2 )?
            {
             before(grammarAccess.getArgumentAccess().getRemainingAssignment_2()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1108:1: ( rule__Argument__RemainingAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1108:2: rule__Argument__RemainingAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Argument__RemainingAssignment_2_in_rule__Argument__Group__2__Impl2180);
                    rule__Argument__RemainingAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArgumentAccess().getRemainingAssignment_2()); 

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
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1118:1: rule__Argument__Group__3 : rule__Argument__Group__3__Impl ;
    public final void rule__Argument__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1122:1: ( rule__Argument__Group__3__Impl )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1123:2: rule__Argument__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group__3__Impl_in_rule__Argument__Group__32211);
            rule__Argument__Group__3__Impl();

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
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1129:1: rule__Argument__Group__3__Impl : ( ( rule__Argument__DescriptionAssignment_3 ) ) ;
    public final void rule__Argument__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1133:1: ( ( ( rule__Argument__DescriptionAssignment_3 ) ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1134:1: ( ( rule__Argument__DescriptionAssignment_3 ) )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1134:1: ( ( rule__Argument__DescriptionAssignment_3 ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1135:1: ( rule__Argument__DescriptionAssignment_3 )
            {
             before(grammarAccess.getArgumentAccess().getDescriptionAssignment_3()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1136:1: ( rule__Argument__DescriptionAssignment_3 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1136:2: rule__Argument__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_rule__Argument__DescriptionAssignment_3_in_rule__Argument__Group__3__Impl2238);
            rule__Argument__DescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getArgumentAccess().getDescriptionAssignment_3()); 

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


    // $ANTLR start "rule__OptionalArgument__Group__0"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1154:1: rule__OptionalArgument__Group__0 : rule__OptionalArgument__Group__0__Impl rule__OptionalArgument__Group__1 ;
    public final void rule__OptionalArgument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1158:1: ( rule__OptionalArgument__Group__0__Impl rule__OptionalArgument__Group__1 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1159:2: rule__OptionalArgument__Group__0__Impl rule__OptionalArgument__Group__1
            {
            pushFollow(FOLLOW_rule__OptionalArgument__Group__0__Impl_in_rule__OptionalArgument__Group__02276);
            rule__OptionalArgument__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OptionalArgument__Group__1_in_rule__OptionalArgument__Group__02279);
            rule__OptionalArgument__Group__1();

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
    // $ANTLR end "rule__OptionalArgument__Group__0"


    // $ANTLR start "rule__OptionalArgument__Group__0__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1166:1: rule__OptionalArgument__Group__0__Impl : ( 'optional argument' ) ;
    public final void rule__OptionalArgument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1170:1: ( ( 'optional argument' ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1171:1: ( 'optional argument' )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1171:1: ( 'optional argument' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1172:1: 'optional argument'
            {
             before(grammarAccess.getOptionalArgumentAccess().getOptionalArgumentKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__OptionalArgument__Group__0__Impl2307); 
             after(grammarAccess.getOptionalArgumentAccess().getOptionalArgumentKeyword_0()); 

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
    // $ANTLR end "rule__OptionalArgument__Group__0__Impl"


    // $ANTLR start "rule__OptionalArgument__Group__1"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1185:1: rule__OptionalArgument__Group__1 : rule__OptionalArgument__Group__1__Impl rule__OptionalArgument__Group__2 ;
    public final void rule__OptionalArgument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1189:1: ( rule__OptionalArgument__Group__1__Impl rule__OptionalArgument__Group__2 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1190:2: rule__OptionalArgument__Group__1__Impl rule__OptionalArgument__Group__2
            {
            pushFollow(FOLLOW_rule__OptionalArgument__Group__1__Impl_in_rule__OptionalArgument__Group__12338);
            rule__OptionalArgument__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OptionalArgument__Group__2_in_rule__OptionalArgument__Group__12341);
            rule__OptionalArgument__Group__2();

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
    // $ANTLR end "rule__OptionalArgument__Group__1"


    // $ANTLR start "rule__OptionalArgument__Group__1__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1197:1: rule__OptionalArgument__Group__1__Impl : ( ( rule__OptionalArgument__NameAssignment_1 ) ) ;
    public final void rule__OptionalArgument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1201:1: ( ( ( rule__OptionalArgument__NameAssignment_1 ) ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1202:1: ( ( rule__OptionalArgument__NameAssignment_1 ) )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1202:1: ( ( rule__OptionalArgument__NameAssignment_1 ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1203:1: ( rule__OptionalArgument__NameAssignment_1 )
            {
             before(grammarAccess.getOptionalArgumentAccess().getNameAssignment_1()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1204:1: ( rule__OptionalArgument__NameAssignment_1 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1204:2: rule__OptionalArgument__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__OptionalArgument__NameAssignment_1_in_rule__OptionalArgument__Group__1__Impl2368);
            rule__OptionalArgument__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionalArgumentAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__OptionalArgument__Group__1__Impl"


    // $ANTLR start "rule__OptionalArgument__Group__2"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1214:1: rule__OptionalArgument__Group__2 : rule__OptionalArgument__Group__2__Impl rule__OptionalArgument__Group__3 ;
    public final void rule__OptionalArgument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1218:1: ( rule__OptionalArgument__Group__2__Impl rule__OptionalArgument__Group__3 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1219:2: rule__OptionalArgument__Group__2__Impl rule__OptionalArgument__Group__3
            {
            pushFollow(FOLLOW_rule__OptionalArgument__Group__2__Impl_in_rule__OptionalArgument__Group__22398);
            rule__OptionalArgument__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OptionalArgument__Group__3_in_rule__OptionalArgument__Group__22401);
            rule__OptionalArgument__Group__3();

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
    // $ANTLR end "rule__OptionalArgument__Group__2"


    // $ANTLR start "rule__OptionalArgument__Group__2__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1226:1: rule__OptionalArgument__Group__2__Impl : ( ( rule__OptionalArgument__Alternatives_2 )? ) ;
    public final void rule__OptionalArgument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1230:1: ( ( ( rule__OptionalArgument__Alternatives_2 )? ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1231:1: ( ( rule__OptionalArgument__Alternatives_2 )? )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1231:1: ( ( rule__OptionalArgument__Alternatives_2 )? )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1232:1: ( rule__OptionalArgument__Alternatives_2 )?
            {
             before(grammarAccess.getOptionalArgumentAccess().getAlternatives_2()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1233:1: ( rule__OptionalArgument__Alternatives_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22||LA12_0==26||LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1233:2: rule__OptionalArgument__Alternatives_2
                    {
                    pushFollow(FOLLOW_rule__OptionalArgument__Alternatives_2_in_rule__OptionalArgument__Group__2__Impl2428);
                    rule__OptionalArgument__Alternatives_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOptionalArgumentAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__OptionalArgument__Group__2__Impl"


    // $ANTLR start "rule__OptionalArgument__Group__3"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1243:1: rule__OptionalArgument__Group__3 : rule__OptionalArgument__Group__3__Impl ;
    public final void rule__OptionalArgument__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1247:1: ( rule__OptionalArgument__Group__3__Impl )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1248:2: rule__OptionalArgument__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__OptionalArgument__Group__3__Impl_in_rule__OptionalArgument__Group__32459);
            rule__OptionalArgument__Group__3__Impl();

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
    // $ANTLR end "rule__OptionalArgument__Group__3"


    // $ANTLR start "rule__OptionalArgument__Group__3__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1254:1: rule__OptionalArgument__Group__3__Impl : ( ( rule__OptionalArgument__DescriptionAssignment_3 ) ) ;
    public final void rule__OptionalArgument__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1258:1: ( ( ( rule__OptionalArgument__DescriptionAssignment_3 ) ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1259:1: ( ( rule__OptionalArgument__DescriptionAssignment_3 ) )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1259:1: ( ( rule__OptionalArgument__DescriptionAssignment_3 ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1260:1: ( rule__OptionalArgument__DescriptionAssignment_3 )
            {
             before(grammarAccess.getOptionalArgumentAccess().getDescriptionAssignment_3()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1261:1: ( rule__OptionalArgument__DescriptionAssignment_3 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1261:2: rule__OptionalArgument__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_rule__OptionalArgument__DescriptionAssignment_3_in_rule__OptionalArgument__Group__3__Impl2486);
            rule__OptionalArgument__DescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOptionalArgumentAccess().getDescriptionAssignment_3()); 

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
    // $ANTLR end "rule__OptionalArgument__Group__3__Impl"


    // $ANTLR start "rule__OptionalArgument__Group_2_0_0__0"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1279:1: rule__OptionalArgument__Group_2_0_0__0 : rule__OptionalArgument__Group_2_0_0__0__Impl rule__OptionalArgument__Group_2_0_0__1 ;
    public final void rule__OptionalArgument__Group_2_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1283:1: ( rule__OptionalArgument__Group_2_0_0__0__Impl rule__OptionalArgument__Group_2_0_0__1 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1284:2: rule__OptionalArgument__Group_2_0_0__0__Impl rule__OptionalArgument__Group_2_0_0__1
            {
            pushFollow(FOLLOW_rule__OptionalArgument__Group_2_0_0__0__Impl_in_rule__OptionalArgument__Group_2_0_0__02524);
            rule__OptionalArgument__Group_2_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OptionalArgument__Group_2_0_0__1_in_rule__OptionalArgument__Group_2_0_0__02527);
            rule__OptionalArgument__Group_2_0_0__1();

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
    // $ANTLR end "rule__OptionalArgument__Group_2_0_0__0"


    // $ANTLR start "rule__OptionalArgument__Group_2_0_0__0__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1291:1: rule__OptionalArgument__Group_2_0_0__0__Impl : ( 'with' ) ;
    public final void rule__OptionalArgument__Group_2_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1295:1: ( ( 'with' ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1296:1: ( 'with' )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1296:1: ( 'with' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1297:1: 'with'
            {
             before(grammarAccess.getOptionalArgumentAccess().getWithKeyword_2_0_0_0()); 
            match(input,22,FOLLOW_22_in_rule__OptionalArgument__Group_2_0_0__0__Impl2555); 
             after(grammarAccess.getOptionalArgumentAccess().getWithKeyword_2_0_0_0()); 

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
    // $ANTLR end "rule__OptionalArgument__Group_2_0_0__0__Impl"


    // $ANTLR start "rule__OptionalArgument__Group_2_0_0__1"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1310:1: rule__OptionalArgument__Group_2_0_0__1 : rule__OptionalArgument__Group_2_0_0__1__Impl rule__OptionalArgument__Group_2_0_0__2 ;
    public final void rule__OptionalArgument__Group_2_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1314:1: ( rule__OptionalArgument__Group_2_0_0__1__Impl rule__OptionalArgument__Group_2_0_0__2 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1315:2: rule__OptionalArgument__Group_2_0_0__1__Impl rule__OptionalArgument__Group_2_0_0__2
            {
            pushFollow(FOLLOW_rule__OptionalArgument__Group_2_0_0__1__Impl_in_rule__OptionalArgument__Group_2_0_0__12586);
            rule__OptionalArgument__Group_2_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OptionalArgument__Group_2_0_0__2_in_rule__OptionalArgument__Group_2_0_0__12589);
            rule__OptionalArgument__Group_2_0_0__2();

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
    // $ANTLR end "rule__OptionalArgument__Group_2_0_0__1"


    // $ANTLR start "rule__OptionalArgument__Group_2_0_0__1__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1322:1: rule__OptionalArgument__Group_2_0_0__1__Impl : ( ( rule__OptionalArgument__DynamicDefaultAssignment_2_0_0_1 )? ) ;
    public final void rule__OptionalArgument__Group_2_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1326:1: ( ( ( rule__OptionalArgument__DynamicDefaultAssignment_2_0_0_1 )? ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1327:1: ( ( rule__OptionalArgument__DynamicDefaultAssignment_2_0_0_1 )? )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1327:1: ( ( rule__OptionalArgument__DynamicDefaultAssignment_2_0_0_1 )? )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1328:1: ( rule__OptionalArgument__DynamicDefaultAssignment_2_0_0_1 )?
            {
             before(grammarAccess.getOptionalArgumentAccess().getDynamicDefaultAssignment_2_0_0_1()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1329:1: ( rule__OptionalArgument__DynamicDefaultAssignment_2_0_0_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1329:2: rule__OptionalArgument__DynamicDefaultAssignment_2_0_0_1
                    {
                    pushFollow(FOLLOW_rule__OptionalArgument__DynamicDefaultAssignment_2_0_0_1_in_rule__OptionalArgument__Group_2_0_0__1__Impl2616);
                    rule__OptionalArgument__DynamicDefaultAssignment_2_0_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOptionalArgumentAccess().getDynamicDefaultAssignment_2_0_0_1()); 

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
    // $ANTLR end "rule__OptionalArgument__Group_2_0_0__1__Impl"


    // $ANTLR start "rule__OptionalArgument__Group_2_0_0__2"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1339:1: rule__OptionalArgument__Group_2_0_0__2 : rule__OptionalArgument__Group_2_0_0__2__Impl rule__OptionalArgument__Group_2_0_0__3 ;
    public final void rule__OptionalArgument__Group_2_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1343:1: ( rule__OptionalArgument__Group_2_0_0__2__Impl rule__OptionalArgument__Group_2_0_0__3 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1344:2: rule__OptionalArgument__Group_2_0_0__2__Impl rule__OptionalArgument__Group_2_0_0__3
            {
            pushFollow(FOLLOW_rule__OptionalArgument__Group_2_0_0__2__Impl_in_rule__OptionalArgument__Group_2_0_0__22647);
            rule__OptionalArgument__Group_2_0_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OptionalArgument__Group_2_0_0__3_in_rule__OptionalArgument__Group_2_0_0__22650);
            rule__OptionalArgument__Group_2_0_0__3();

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
    // $ANTLR end "rule__OptionalArgument__Group_2_0_0__2"


    // $ANTLR start "rule__OptionalArgument__Group_2_0_0__2__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1351:1: rule__OptionalArgument__Group_2_0_0__2__Impl : ( 'default' ) ;
    public final void rule__OptionalArgument__Group_2_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1355:1: ( ( 'default' ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1356:1: ( 'default' )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1356:1: ( 'default' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1357:1: 'default'
            {
             before(grammarAccess.getOptionalArgumentAccess().getDefaultKeyword_2_0_0_2()); 
            match(input,23,FOLLOW_23_in_rule__OptionalArgument__Group_2_0_0__2__Impl2678); 
             after(grammarAccess.getOptionalArgumentAccess().getDefaultKeyword_2_0_0_2()); 

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
    // $ANTLR end "rule__OptionalArgument__Group_2_0_0__2__Impl"


    // $ANTLR start "rule__OptionalArgument__Group_2_0_0__3"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1370:1: rule__OptionalArgument__Group_2_0_0__3 : rule__OptionalArgument__Group_2_0_0__3__Impl ;
    public final void rule__OptionalArgument__Group_2_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1374:1: ( rule__OptionalArgument__Group_2_0_0__3__Impl )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1375:2: rule__OptionalArgument__Group_2_0_0__3__Impl
            {
            pushFollow(FOLLOW_rule__OptionalArgument__Group_2_0_0__3__Impl_in_rule__OptionalArgument__Group_2_0_0__32709);
            rule__OptionalArgument__Group_2_0_0__3__Impl();

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
    // $ANTLR end "rule__OptionalArgument__Group_2_0_0__3"


    // $ANTLR start "rule__OptionalArgument__Group_2_0_0__3__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1381:1: rule__OptionalArgument__Group_2_0_0__3__Impl : ( ( rule__OptionalArgument__DefaultAssignment_2_0_0_3 ) ) ;
    public final void rule__OptionalArgument__Group_2_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1385:1: ( ( ( rule__OptionalArgument__DefaultAssignment_2_0_0_3 ) ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1386:1: ( ( rule__OptionalArgument__DefaultAssignment_2_0_0_3 ) )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1386:1: ( ( rule__OptionalArgument__DefaultAssignment_2_0_0_3 ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1387:1: ( rule__OptionalArgument__DefaultAssignment_2_0_0_3 )
            {
             before(grammarAccess.getOptionalArgumentAccess().getDefaultAssignment_2_0_0_3()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1388:1: ( rule__OptionalArgument__DefaultAssignment_2_0_0_3 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1388:2: rule__OptionalArgument__DefaultAssignment_2_0_0_3
            {
            pushFollow(FOLLOW_rule__OptionalArgument__DefaultAssignment_2_0_0_3_in_rule__OptionalArgument__Group_2_0_0__3__Impl2736);
            rule__OptionalArgument__DefaultAssignment_2_0_0_3();

            state._fsp--;


            }

             after(grammarAccess.getOptionalArgumentAccess().getDefaultAssignment_2_0_0_3()); 

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
    // $ANTLR end "rule__OptionalArgument__Group_2_0_0__3__Impl"


    // $ANTLR start "rule__EnvironmentVariable__Group__0"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1406:1: rule__EnvironmentVariable__Group__0 : rule__EnvironmentVariable__Group__0__Impl rule__EnvironmentVariable__Group__1 ;
    public final void rule__EnvironmentVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1410:1: ( rule__EnvironmentVariable__Group__0__Impl rule__EnvironmentVariable__Group__1 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1411:2: rule__EnvironmentVariable__Group__0__Impl rule__EnvironmentVariable__Group__1
            {
            pushFollow(FOLLOW_rule__EnvironmentVariable__Group__0__Impl_in_rule__EnvironmentVariable__Group__02774);
            rule__EnvironmentVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnvironmentVariable__Group__1_in_rule__EnvironmentVariable__Group__02777);
            rule__EnvironmentVariable__Group__1();

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
    // $ANTLR end "rule__EnvironmentVariable__Group__0"


    // $ANTLR start "rule__EnvironmentVariable__Group__0__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1418:1: rule__EnvironmentVariable__Group__0__Impl : ( 'env' ) ;
    public final void rule__EnvironmentVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1422:1: ( ( 'env' ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1423:1: ( 'env' )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1423:1: ( 'env' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1424:1: 'env'
            {
             before(grammarAccess.getEnvironmentVariableAccess().getEnvKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__EnvironmentVariable__Group__0__Impl2805); 
             after(grammarAccess.getEnvironmentVariableAccess().getEnvKeyword_0()); 

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
    // $ANTLR end "rule__EnvironmentVariable__Group__0__Impl"


    // $ANTLR start "rule__EnvironmentVariable__Group__1"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1437:1: rule__EnvironmentVariable__Group__1 : rule__EnvironmentVariable__Group__1__Impl rule__EnvironmentVariable__Group__2 ;
    public final void rule__EnvironmentVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1441:1: ( rule__EnvironmentVariable__Group__1__Impl rule__EnvironmentVariable__Group__2 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1442:2: rule__EnvironmentVariable__Group__1__Impl rule__EnvironmentVariable__Group__2
            {
            pushFollow(FOLLOW_rule__EnvironmentVariable__Group__1__Impl_in_rule__EnvironmentVariable__Group__12836);
            rule__EnvironmentVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnvironmentVariable__Group__2_in_rule__EnvironmentVariable__Group__12839);
            rule__EnvironmentVariable__Group__2();

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
    // $ANTLR end "rule__EnvironmentVariable__Group__1"


    // $ANTLR start "rule__EnvironmentVariable__Group__1__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1449:1: rule__EnvironmentVariable__Group__1__Impl : ( ( rule__EnvironmentVariable__NameAssignment_1 ) ) ;
    public final void rule__EnvironmentVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1453:1: ( ( ( rule__EnvironmentVariable__NameAssignment_1 ) ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1454:1: ( ( rule__EnvironmentVariable__NameAssignment_1 ) )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1454:1: ( ( rule__EnvironmentVariable__NameAssignment_1 ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1455:1: ( rule__EnvironmentVariable__NameAssignment_1 )
            {
             before(grammarAccess.getEnvironmentVariableAccess().getNameAssignment_1()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1456:1: ( rule__EnvironmentVariable__NameAssignment_1 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1456:2: rule__EnvironmentVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EnvironmentVariable__NameAssignment_1_in_rule__EnvironmentVariable__Group__1__Impl2866);
            rule__EnvironmentVariable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentVariableAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__EnvironmentVariable__Group__1__Impl"


    // $ANTLR start "rule__EnvironmentVariable__Group__2"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1466:1: rule__EnvironmentVariable__Group__2 : rule__EnvironmentVariable__Group__2__Impl rule__EnvironmentVariable__Group__3 ;
    public final void rule__EnvironmentVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1470:1: ( rule__EnvironmentVariable__Group__2__Impl rule__EnvironmentVariable__Group__3 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1471:2: rule__EnvironmentVariable__Group__2__Impl rule__EnvironmentVariable__Group__3
            {
            pushFollow(FOLLOW_rule__EnvironmentVariable__Group__2__Impl_in_rule__EnvironmentVariable__Group__22896);
            rule__EnvironmentVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnvironmentVariable__Group__3_in_rule__EnvironmentVariable__Group__22899);
            rule__EnvironmentVariable__Group__3();

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
    // $ANTLR end "rule__EnvironmentVariable__Group__2"


    // $ANTLR start "rule__EnvironmentVariable__Group__2__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1478:1: rule__EnvironmentVariable__Group__2__Impl : ( ( rule__EnvironmentVariable__Group_2__0 )? ) ;
    public final void rule__EnvironmentVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1482:1: ( ( ( rule__EnvironmentVariable__Group_2__0 )? ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1483:1: ( ( rule__EnvironmentVariable__Group_2__0 )? )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1483:1: ( ( rule__EnvironmentVariable__Group_2__0 )? )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1484:1: ( rule__EnvironmentVariable__Group_2__0 )?
            {
             before(grammarAccess.getEnvironmentVariableAccess().getGroup_2()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1485:1: ( rule__EnvironmentVariable__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1485:2: rule__EnvironmentVariable__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__EnvironmentVariable__Group_2__0_in_rule__EnvironmentVariable__Group__2__Impl2926);
                    rule__EnvironmentVariable__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnvironmentVariableAccess().getGroup_2()); 

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
    // $ANTLR end "rule__EnvironmentVariable__Group__2__Impl"


    // $ANTLR start "rule__EnvironmentVariable__Group__3"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1495:1: rule__EnvironmentVariable__Group__3 : rule__EnvironmentVariable__Group__3__Impl ;
    public final void rule__EnvironmentVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1499:1: ( rule__EnvironmentVariable__Group__3__Impl )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1500:2: rule__EnvironmentVariable__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EnvironmentVariable__Group__3__Impl_in_rule__EnvironmentVariable__Group__32957);
            rule__EnvironmentVariable__Group__3__Impl();

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
    // $ANTLR end "rule__EnvironmentVariable__Group__3"


    // $ANTLR start "rule__EnvironmentVariable__Group__3__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1506:1: rule__EnvironmentVariable__Group__3__Impl : ( ( rule__EnvironmentVariable__DescriptionAssignment_3 ) ) ;
    public final void rule__EnvironmentVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1510:1: ( ( ( rule__EnvironmentVariable__DescriptionAssignment_3 ) ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1511:1: ( ( rule__EnvironmentVariable__DescriptionAssignment_3 ) )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1511:1: ( ( rule__EnvironmentVariable__DescriptionAssignment_3 ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1512:1: ( rule__EnvironmentVariable__DescriptionAssignment_3 )
            {
             before(grammarAccess.getEnvironmentVariableAccess().getDescriptionAssignment_3()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1513:1: ( rule__EnvironmentVariable__DescriptionAssignment_3 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1513:2: rule__EnvironmentVariable__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_rule__EnvironmentVariable__DescriptionAssignment_3_in_rule__EnvironmentVariable__Group__3__Impl2984);
            rule__EnvironmentVariable__DescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentVariableAccess().getDescriptionAssignment_3()); 

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
    // $ANTLR end "rule__EnvironmentVariable__Group__3__Impl"


    // $ANTLR start "rule__EnvironmentVariable__Group_2__0"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1531:1: rule__EnvironmentVariable__Group_2__0 : rule__EnvironmentVariable__Group_2__0__Impl rule__EnvironmentVariable__Group_2__1 ;
    public final void rule__EnvironmentVariable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1535:1: ( rule__EnvironmentVariable__Group_2__0__Impl rule__EnvironmentVariable__Group_2__1 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1536:2: rule__EnvironmentVariable__Group_2__0__Impl rule__EnvironmentVariable__Group_2__1
            {
            pushFollow(FOLLOW_rule__EnvironmentVariable__Group_2__0__Impl_in_rule__EnvironmentVariable__Group_2__03022);
            rule__EnvironmentVariable__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnvironmentVariable__Group_2__1_in_rule__EnvironmentVariable__Group_2__03025);
            rule__EnvironmentVariable__Group_2__1();

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
    // $ANTLR end "rule__EnvironmentVariable__Group_2__0"


    // $ANTLR start "rule__EnvironmentVariable__Group_2__0__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1543:1: rule__EnvironmentVariable__Group_2__0__Impl : ( 'with' ) ;
    public final void rule__EnvironmentVariable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1547:1: ( ( 'with' ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1548:1: ( 'with' )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1548:1: ( 'with' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1549:1: 'with'
            {
             before(grammarAccess.getEnvironmentVariableAccess().getWithKeyword_2_0()); 
            match(input,22,FOLLOW_22_in_rule__EnvironmentVariable__Group_2__0__Impl3053); 
             after(grammarAccess.getEnvironmentVariableAccess().getWithKeyword_2_0()); 

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
    // $ANTLR end "rule__EnvironmentVariable__Group_2__0__Impl"


    // $ANTLR start "rule__EnvironmentVariable__Group_2__1"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1562:1: rule__EnvironmentVariable__Group_2__1 : rule__EnvironmentVariable__Group_2__1__Impl rule__EnvironmentVariable__Group_2__2 ;
    public final void rule__EnvironmentVariable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1566:1: ( rule__EnvironmentVariable__Group_2__1__Impl rule__EnvironmentVariable__Group_2__2 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1567:2: rule__EnvironmentVariable__Group_2__1__Impl rule__EnvironmentVariable__Group_2__2
            {
            pushFollow(FOLLOW_rule__EnvironmentVariable__Group_2__1__Impl_in_rule__EnvironmentVariable__Group_2__13084);
            rule__EnvironmentVariable__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnvironmentVariable__Group_2__2_in_rule__EnvironmentVariable__Group_2__13087);
            rule__EnvironmentVariable__Group_2__2();

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
    // $ANTLR end "rule__EnvironmentVariable__Group_2__1"


    // $ANTLR start "rule__EnvironmentVariable__Group_2__1__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1574:1: rule__EnvironmentVariable__Group_2__1__Impl : ( ( rule__EnvironmentVariable__DynamicDefaultAssignment_2_1 )? ) ;
    public final void rule__EnvironmentVariable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1578:1: ( ( ( rule__EnvironmentVariable__DynamicDefaultAssignment_2_1 )? ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1579:1: ( ( rule__EnvironmentVariable__DynamicDefaultAssignment_2_1 )? )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1579:1: ( ( rule__EnvironmentVariable__DynamicDefaultAssignment_2_1 )? )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1580:1: ( rule__EnvironmentVariable__DynamicDefaultAssignment_2_1 )?
            {
             before(grammarAccess.getEnvironmentVariableAccess().getDynamicDefaultAssignment_2_1()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1581:1: ( rule__EnvironmentVariable__DynamicDefaultAssignment_2_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1581:2: rule__EnvironmentVariable__DynamicDefaultAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__EnvironmentVariable__DynamicDefaultAssignment_2_1_in_rule__EnvironmentVariable__Group_2__1__Impl3114);
                    rule__EnvironmentVariable__DynamicDefaultAssignment_2_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnvironmentVariableAccess().getDynamicDefaultAssignment_2_1()); 

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
    // $ANTLR end "rule__EnvironmentVariable__Group_2__1__Impl"


    // $ANTLR start "rule__EnvironmentVariable__Group_2__2"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1591:1: rule__EnvironmentVariable__Group_2__2 : rule__EnvironmentVariable__Group_2__2__Impl rule__EnvironmentVariable__Group_2__3 ;
    public final void rule__EnvironmentVariable__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1595:1: ( rule__EnvironmentVariable__Group_2__2__Impl rule__EnvironmentVariable__Group_2__3 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1596:2: rule__EnvironmentVariable__Group_2__2__Impl rule__EnvironmentVariable__Group_2__3
            {
            pushFollow(FOLLOW_rule__EnvironmentVariable__Group_2__2__Impl_in_rule__EnvironmentVariable__Group_2__23145);
            rule__EnvironmentVariable__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnvironmentVariable__Group_2__3_in_rule__EnvironmentVariable__Group_2__23148);
            rule__EnvironmentVariable__Group_2__3();

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
    // $ANTLR end "rule__EnvironmentVariable__Group_2__2"


    // $ANTLR start "rule__EnvironmentVariable__Group_2__2__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1603:1: rule__EnvironmentVariable__Group_2__2__Impl : ( 'default' ) ;
    public final void rule__EnvironmentVariable__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1607:1: ( ( 'default' ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1608:1: ( 'default' )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1608:1: ( 'default' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1609:1: 'default'
            {
             before(grammarAccess.getEnvironmentVariableAccess().getDefaultKeyword_2_2()); 
            match(input,23,FOLLOW_23_in_rule__EnvironmentVariable__Group_2__2__Impl3176); 
             after(grammarAccess.getEnvironmentVariableAccess().getDefaultKeyword_2_2()); 

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
    // $ANTLR end "rule__EnvironmentVariable__Group_2__2__Impl"


    // $ANTLR start "rule__EnvironmentVariable__Group_2__3"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1622:1: rule__EnvironmentVariable__Group_2__3 : rule__EnvironmentVariable__Group_2__3__Impl ;
    public final void rule__EnvironmentVariable__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1626:1: ( rule__EnvironmentVariable__Group_2__3__Impl )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1627:2: rule__EnvironmentVariable__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__EnvironmentVariable__Group_2__3__Impl_in_rule__EnvironmentVariable__Group_2__33207);
            rule__EnvironmentVariable__Group_2__3__Impl();

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
    // $ANTLR end "rule__EnvironmentVariable__Group_2__3"


    // $ANTLR start "rule__EnvironmentVariable__Group_2__3__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1633:1: rule__EnvironmentVariable__Group_2__3__Impl : ( ( rule__EnvironmentVariable__DefaultAssignment_2_3 ) ) ;
    public final void rule__EnvironmentVariable__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1637:1: ( ( ( rule__EnvironmentVariable__DefaultAssignment_2_3 ) ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1638:1: ( ( rule__EnvironmentVariable__DefaultAssignment_2_3 ) )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1638:1: ( ( rule__EnvironmentVariable__DefaultAssignment_2_3 ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1639:1: ( rule__EnvironmentVariable__DefaultAssignment_2_3 )
            {
             before(grammarAccess.getEnvironmentVariableAccess().getDefaultAssignment_2_3()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1640:1: ( rule__EnvironmentVariable__DefaultAssignment_2_3 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1640:2: rule__EnvironmentVariable__DefaultAssignment_2_3
            {
            pushFollow(FOLLOW_rule__EnvironmentVariable__DefaultAssignment_2_3_in_rule__EnvironmentVariable__Group_2__3__Impl3234);
            rule__EnvironmentVariable__DefaultAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentVariableAccess().getDefaultAssignment_2_3()); 

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
    // $ANTLR end "rule__EnvironmentVariable__Group_2__3__Impl"


    // $ANTLR start "rule__Function__Group__0"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1658:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1662:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1663:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__03272);
            rule__Function__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__1_in_rule__Function__Group__03275);
            rule__Function__Group__1();

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
    // $ANTLR end "rule__Function__Group__0"


    // $ANTLR start "rule__Function__Group__0__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1670:1: rule__Function__Group__0__Impl : ( 'def' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1674:1: ( ( 'def' ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1675:1: ( 'def' )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1675:1: ( 'def' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1676:1: 'def'
            {
             before(grammarAccess.getFunctionAccess().getDefKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Function__Group__0__Impl3303); 
             after(grammarAccess.getFunctionAccess().getDefKeyword_0()); 

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
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1689:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1693:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1694:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__13334);
            rule__Function__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__2_in_rule__Function__Group__13337);
            rule__Function__Group__2();

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
    // $ANTLR end "rule__Function__Group__1"


    // $ANTLR start "rule__Function__Group__1__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1701:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1705:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1706:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1706:1: ( ( rule__Function__NameAssignment_1 ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1707:1: ( rule__Function__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1708:1: ( rule__Function__NameAssignment_1 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1708:2: rule__Function__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Function__NameAssignment_1_in_rule__Function__Group__1__Impl3364);
            rule__Function__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Function__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__2"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1718:1: rule__Function__Group__2 : rule__Function__Group__2__Impl ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1722:1: ( rule__Function__Group__2__Impl )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1723:2: rule__Function__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__23394);
            rule__Function__Group__2__Impl();

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
    // $ANTLR end "rule__Function__Group__2"


    // $ANTLR start "rule__Function__Group__2__Impl"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1729:1: rule__Function__Group__2__Impl : ( ( rule__Function__CodeAssignment_2 ) ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1733:1: ( ( ( rule__Function__CodeAssignment_2 ) ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1734:1: ( ( rule__Function__CodeAssignment_2 ) )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1734:1: ( ( rule__Function__CodeAssignment_2 ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1735:1: ( rule__Function__CodeAssignment_2 )
            {
             before(grammarAccess.getFunctionAccess().getCodeAssignment_2()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1736:1: ( rule__Function__CodeAssignment_2 )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1736:2: rule__Function__CodeAssignment_2
            {
            pushFollow(FOLLOW_rule__Function__CodeAssignment_2_in_rule__Function__Group__2__Impl3421);
            rule__Function__CodeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getCodeAssignment_2()); 

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
    // $ANTLR end "rule__Function__Group__2__Impl"


    // $ANTLR start "rule__Domainmodel__ReadmeTitleAssignment_1"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1753:1: rule__Domainmodel__ReadmeTitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Domainmodel__ReadmeTitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1757:1: ( ( RULE_STRING ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1758:1: ( RULE_STRING )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1758:1: ( RULE_STRING )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1759:1: RULE_STRING
            {
             before(grammarAccess.getDomainmodelAccess().getReadmeTitleSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Domainmodel__ReadmeTitleAssignment_13462); 
             after(grammarAccess.getDomainmodelAccess().getReadmeTitleSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Domainmodel__ReadmeTitleAssignment_1"


    // $ANTLR start "rule__Domainmodel__ReadmeIntroAssignment_2_1"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1768:1: rule__Domainmodel__ReadmeIntroAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Domainmodel__ReadmeIntroAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1772:1: ( ( RULE_STRING ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1773:1: ( RULE_STRING )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1773:1: ( RULE_STRING )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1774:1: RULE_STRING
            {
             before(grammarAccess.getDomainmodelAccess().getReadmeIntroSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Domainmodel__ReadmeIntroAssignment_2_13493); 
             after(grammarAccess.getDomainmodelAccess().getReadmeIntroSTRINGTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Domainmodel__ReadmeIntroAssignment_2_1"


    // $ANTLR start "rule__Domainmodel__ElementsAssignment_4"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1783:1: rule__Domainmodel__ElementsAssignment_4 : ( ruleScript ) ;
    public final void rule__Domainmodel__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1787:1: ( ( ruleScript ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1788:1: ( ruleScript )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1788:1: ( ruleScript )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1789:1: ruleScript
            {
             before(grammarAccess.getDomainmodelAccess().getElementsScriptParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleScript_in_rule__Domainmodel__ElementsAssignment_43524);
            ruleScript();

            state._fsp--;

             after(grammarAccess.getDomainmodelAccess().getElementsScriptParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Domainmodel__ElementsAssignment_4"


    // $ANTLR start "rule__Script__NameAssignment_1"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1798:1: rule__Script__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Script__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1802:1: ( ( RULE_ID ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1803:1: ( RULE_ID )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1803:1: ( RULE_ID )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1804:1: RULE_ID
            {
             before(grammarAccess.getScriptAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Script__NameAssignment_13555); 
             after(grammarAccess.getScriptAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1813:1: rule__Script__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Script__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1817:1: ( ( RULE_STRING ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1818:1: ( RULE_STRING )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1818:1: ( RULE_STRING )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1819:1: RULE_STRING
            {
             before(grammarAccess.getScriptAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Script__DescriptionAssignment_23586); 
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
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1828:1: rule__Script__CopyrightAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Script__CopyrightAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1832:1: ( ( RULE_STRING ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1833:1: ( RULE_STRING )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1833:1: ( RULE_STRING )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1834:1: RULE_STRING
            {
             before(grammarAccess.getScriptAccess().getCopyrightSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Script__CopyrightAssignment_3_13617); 
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


    // $ANTLR start "rule__Script__LongDescriptionAssignment_5"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1843:1: rule__Script__LongDescriptionAssignment_5 : ( ruleDescription ) ;
    public final void rule__Script__LongDescriptionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1847:1: ( ( ruleDescription ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1848:1: ( ruleDescription )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1848:1: ( ruleDescription )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1849:1: ruleDescription
            {
             before(grammarAccess.getScriptAccess().getLongDescriptionDescriptionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleDescription_in_rule__Script__LongDescriptionAssignment_53648);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getScriptAccess().getLongDescriptionDescriptionParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Script__LongDescriptionAssignment_5"


    // $ANTLR start "rule__Script__VariablesAssignment_6"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1858:1: rule__Script__VariablesAssignment_6 : ( ruleEnvironmentVariable ) ;
    public final void rule__Script__VariablesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1862:1: ( ( ruleEnvironmentVariable ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1863:1: ( ruleEnvironmentVariable )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1863:1: ( ruleEnvironmentVariable )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1864:1: ruleEnvironmentVariable
            {
             before(grammarAccess.getScriptAccess().getVariablesEnvironmentVariableParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleEnvironmentVariable_in_rule__Script__VariablesAssignment_63679);
            ruleEnvironmentVariable();

            state._fsp--;

             after(grammarAccess.getScriptAccess().getVariablesEnvironmentVariableParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Script__VariablesAssignment_6"


    // $ANTLR start "rule__Script__ArgumentsAssignment_7"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1873:1: rule__Script__ArgumentsAssignment_7 : ( ruleArgument ) ;
    public final void rule__Script__ArgumentsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1877:1: ( ( ruleArgument ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1878:1: ( ruleArgument )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1878:1: ( ruleArgument )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1879:1: ruleArgument
            {
             before(grammarAccess.getScriptAccess().getArgumentsArgumentParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__Script__ArgumentsAssignment_73710);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getScriptAccess().getArgumentsArgumentParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Script__ArgumentsAssignment_7"


    // $ANTLR start "rule__Script__OptArgumentsAssignment_8"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1888:1: rule__Script__OptArgumentsAssignment_8 : ( ruleOptionalArgument ) ;
    public final void rule__Script__OptArgumentsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1892:1: ( ( ruleOptionalArgument ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1893:1: ( ruleOptionalArgument )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1893:1: ( ruleOptionalArgument )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1894:1: ruleOptionalArgument
            {
             before(grammarAccess.getScriptAccess().getOptArgumentsOptionalArgumentParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleOptionalArgument_in_rule__Script__OptArgumentsAssignment_83741);
            ruleOptionalArgument();

            state._fsp--;

             after(grammarAccess.getScriptAccess().getOptArgumentsOptionalArgumentParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Script__OptArgumentsAssignment_8"


    // $ANTLR start "rule__Script__FunctionsAssignment_9"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1903:1: rule__Script__FunctionsAssignment_9 : ( ruleFunction ) ;
    public final void rule__Script__FunctionsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1907:1: ( ( ruleFunction ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1908:1: ( ruleFunction )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1908:1: ( ruleFunction )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1909:1: ruleFunction
            {
             before(grammarAccess.getScriptAccess().getFunctionsFunctionParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleFunction_in_rule__Script__FunctionsAssignment_93772);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getScriptAccess().getFunctionsFunctionParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Script__FunctionsAssignment_9"


    // $ANTLR start "rule__Script__CodeAssignment_10"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1918:1: rule__Script__CodeAssignment_10 : ( RULE_CODE_BLOCK ) ;
    public final void rule__Script__CodeAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1922:1: ( ( RULE_CODE_BLOCK ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1923:1: ( RULE_CODE_BLOCK )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1923:1: ( RULE_CODE_BLOCK )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1924:1: RULE_CODE_BLOCK
            {
             before(grammarAccess.getScriptAccess().getCodeCODE_BLOCKTerminalRuleCall_10_0()); 
            match(input,RULE_CODE_BLOCK,FOLLOW_RULE_CODE_BLOCK_in_rule__Script__CodeAssignment_103803); 
             after(grammarAccess.getScriptAccess().getCodeCODE_BLOCKTerminalRuleCall_10_0()); 

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
    // $ANTLR end "rule__Script__CodeAssignment_10"


    // $ANTLR start "rule__Description__ValueAssignment_1"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1933:1: rule__Description__ValueAssignment_1 : ( RULE_CODE_BLOCK ) ;
    public final void rule__Description__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1937:1: ( ( RULE_CODE_BLOCK ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1938:1: ( RULE_CODE_BLOCK )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1938:1: ( RULE_CODE_BLOCK )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1939:1: RULE_CODE_BLOCK
            {
             before(grammarAccess.getDescriptionAccess().getValueCODE_BLOCKTerminalRuleCall_1_0()); 
            match(input,RULE_CODE_BLOCK,FOLLOW_RULE_CODE_BLOCK_in_rule__Description__ValueAssignment_13834); 
             after(grammarAccess.getDescriptionAccess().getValueCODE_BLOCKTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Description__ValueAssignment_1"


    // $ANTLR start "rule__Argument__NameAssignment_1"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1948:1: rule__Argument__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Argument__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1952:1: ( ( RULE_STRING ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1953:1: ( RULE_STRING )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1953:1: ( RULE_STRING )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1954:1: RULE_STRING
            {
             before(grammarAccess.getArgumentAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Argument__NameAssignment_13865); 
             after(grammarAccess.getArgumentAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Argument__NameAssignment_1"


    // $ANTLR start "rule__Argument__RemainingAssignment_2"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1963:1: rule__Argument__RemainingAssignment_2 : ( ( 'reads remaining' ) ) ;
    public final void rule__Argument__RemainingAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1967:1: ( ( ( 'reads remaining' ) ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1968:1: ( ( 'reads remaining' ) )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1968:1: ( ( 'reads remaining' ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1969:1: ( 'reads remaining' )
            {
             before(grammarAccess.getArgumentAccess().getRemainingReadsRemainingKeyword_2_0()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1970:1: ( 'reads remaining' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1971:1: 'reads remaining'
            {
             before(grammarAccess.getArgumentAccess().getRemainingReadsRemainingKeyword_2_0()); 
            match(input,26,FOLLOW_26_in_rule__Argument__RemainingAssignment_23901); 
             after(grammarAccess.getArgumentAccess().getRemainingReadsRemainingKeyword_2_0()); 

            }

             after(grammarAccess.getArgumentAccess().getRemainingReadsRemainingKeyword_2_0()); 

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
    // $ANTLR end "rule__Argument__RemainingAssignment_2"


    // $ANTLR start "rule__Argument__DescriptionAssignment_3"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1986:1: rule__Argument__DescriptionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Argument__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1990:1: ( ( RULE_STRING ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1991:1: ( RULE_STRING )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1991:1: ( RULE_STRING )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:1992:1: RULE_STRING
            {
             before(grammarAccess.getArgumentAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Argument__DescriptionAssignment_33940); 
             after(grammarAccess.getArgumentAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Argument__DescriptionAssignment_3"


    // $ANTLR start "rule__OptionalArgument__NameAssignment_1"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2001:1: rule__OptionalArgument__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__OptionalArgument__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2005:1: ( ( RULE_STRING ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2006:1: ( RULE_STRING )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2006:1: ( RULE_STRING )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2007:1: RULE_STRING
            {
             before(grammarAccess.getOptionalArgumentAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__OptionalArgument__NameAssignment_13971); 
             after(grammarAccess.getOptionalArgumentAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__OptionalArgument__NameAssignment_1"


    // $ANTLR start "rule__OptionalArgument__DynamicDefaultAssignment_2_0_0_1"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2016:1: rule__OptionalArgument__DynamicDefaultAssignment_2_0_0_1 : ( ( 'dynamic' ) ) ;
    public final void rule__OptionalArgument__DynamicDefaultAssignment_2_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2020:1: ( ( ( 'dynamic' ) ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2021:1: ( ( 'dynamic' ) )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2021:1: ( ( 'dynamic' ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2022:1: ( 'dynamic' )
            {
             before(grammarAccess.getOptionalArgumentAccess().getDynamicDefaultDynamicKeyword_2_0_0_1_0()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2023:1: ( 'dynamic' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2024:1: 'dynamic'
            {
             before(grammarAccess.getOptionalArgumentAccess().getDynamicDefaultDynamicKeyword_2_0_0_1_0()); 
            match(input,27,FOLLOW_27_in_rule__OptionalArgument__DynamicDefaultAssignment_2_0_0_14007); 
             after(grammarAccess.getOptionalArgumentAccess().getDynamicDefaultDynamicKeyword_2_0_0_1_0()); 

            }

             after(grammarAccess.getOptionalArgumentAccess().getDynamicDefaultDynamicKeyword_2_0_0_1_0()); 

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
    // $ANTLR end "rule__OptionalArgument__DynamicDefaultAssignment_2_0_0_1"


    // $ANTLR start "rule__OptionalArgument__DefaultAssignment_2_0_0_3"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2039:1: rule__OptionalArgument__DefaultAssignment_2_0_0_3 : ( RULE_STRING ) ;
    public final void rule__OptionalArgument__DefaultAssignment_2_0_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2043:1: ( ( RULE_STRING ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2044:1: ( RULE_STRING )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2044:1: ( RULE_STRING )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2045:1: RULE_STRING
            {
             before(grammarAccess.getOptionalArgumentAccess().getDefaultSTRINGTerminalRuleCall_2_0_0_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__OptionalArgument__DefaultAssignment_2_0_0_34046); 
             after(grammarAccess.getOptionalArgumentAccess().getDefaultSTRINGTerminalRuleCall_2_0_0_3_0()); 

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
    // $ANTLR end "rule__OptionalArgument__DefaultAssignment_2_0_0_3"


    // $ANTLR start "rule__OptionalArgument__RemainingAssignment_2_0_1"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2054:1: rule__OptionalArgument__RemainingAssignment_2_0_1 : ( ( 'reads remaining' ) ) ;
    public final void rule__OptionalArgument__RemainingAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2058:1: ( ( ( 'reads remaining' ) ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2059:1: ( ( 'reads remaining' ) )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2059:1: ( ( 'reads remaining' ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2060:1: ( 'reads remaining' )
            {
             before(grammarAccess.getOptionalArgumentAccess().getRemainingReadsRemainingKeyword_2_0_1_0()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2061:1: ( 'reads remaining' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2062:1: 'reads remaining'
            {
             before(grammarAccess.getOptionalArgumentAccess().getRemainingReadsRemainingKeyword_2_0_1_0()); 
            match(input,26,FOLLOW_26_in_rule__OptionalArgument__RemainingAssignment_2_0_14082); 
             after(grammarAccess.getOptionalArgumentAccess().getRemainingReadsRemainingKeyword_2_0_1_0()); 

            }

             after(grammarAccess.getOptionalArgumentAccess().getRemainingReadsRemainingKeyword_2_0_1_0()); 

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
    // $ANTLR end "rule__OptionalArgument__RemainingAssignment_2_0_1"


    // $ANTLR start "rule__OptionalArgument__IsBooleanAssignment_2_1"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2077:1: rule__OptionalArgument__IsBooleanAssignment_2_1 : ( ( 'without parameter' ) ) ;
    public final void rule__OptionalArgument__IsBooleanAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2081:1: ( ( ( 'without parameter' ) ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2082:1: ( ( 'without parameter' ) )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2082:1: ( ( 'without parameter' ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2083:1: ( 'without parameter' )
            {
             before(grammarAccess.getOptionalArgumentAccess().getIsBooleanWithoutParameterKeyword_2_1_0()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2084:1: ( 'without parameter' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2085:1: 'without parameter'
            {
             before(grammarAccess.getOptionalArgumentAccess().getIsBooleanWithoutParameterKeyword_2_1_0()); 
            match(input,28,FOLLOW_28_in_rule__OptionalArgument__IsBooleanAssignment_2_14126); 
             after(grammarAccess.getOptionalArgumentAccess().getIsBooleanWithoutParameterKeyword_2_1_0()); 

            }

             after(grammarAccess.getOptionalArgumentAccess().getIsBooleanWithoutParameterKeyword_2_1_0()); 

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
    // $ANTLR end "rule__OptionalArgument__IsBooleanAssignment_2_1"


    // $ANTLR start "rule__OptionalArgument__DescriptionAssignment_3"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2100:1: rule__OptionalArgument__DescriptionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__OptionalArgument__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2104:1: ( ( RULE_STRING ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2105:1: ( RULE_STRING )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2105:1: ( RULE_STRING )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2106:1: RULE_STRING
            {
             before(grammarAccess.getOptionalArgumentAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__OptionalArgument__DescriptionAssignment_34165); 
             after(grammarAccess.getOptionalArgumentAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__OptionalArgument__DescriptionAssignment_3"


    // $ANTLR start "rule__EnvironmentVariable__NameAssignment_1"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2115:1: rule__EnvironmentVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnvironmentVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2119:1: ( ( RULE_ID ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2120:1: ( RULE_ID )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2120:1: ( RULE_ID )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2121:1: RULE_ID
            {
             before(grammarAccess.getEnvironmentVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnvironmentVariable__NameAssignment_14196); 
             after(grammarAccess.getEnvironmentVariableAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__EnvironmentVariable__NameAssignment_1"


    // $ANTLR start "rule__EnvironmentVariable__DynamicDefaultAssignment_2_1"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2130:1: rule__EnvironmentVariable__DynamicDefaultAssignment_2_1 : ( ( 'dynamic' ) ) ;
    public final void rule__EnvironmentVariable__DynamicDefaultAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2134:1: ( ( ( 'dynamic' ) ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2135:1: ( ( 'dynamic' ) )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2135:1: ( ( 'dynamic' ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2136:1: ( 'dynamic' )
            {
             before(grammarAccess.getEnvironmentVariableAccess().getDynamicDefaultDynamicKeyword_2_1_0()); 
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2137:1: ( 'dynamic' )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2138:1: 'dynamic'
            {
             before(grammarAccess.getEnvironmentVariableAccess().getDynamicDefaultDynamicKeyword_2_1_0()); 
            match(input,27,FOLLOW_27_in_rule__EnvironmentVariable__DynamicDefaultAssignment_2_14232); 
             after(grammarAccess.getEnvironmentVariableAccess().getDynamicDefaultDynamicKeyword_2_1_0()); 

            }

             after(grammarAccess.getEnvironmentVariableAccess().getDynamicDefaultDynamicKeyword_2_1_0()); 

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
    // $ANTLR end "rule__EnvironmentVariable__DynamicDefaultAssignment_2_1"


    // $ANTLR start "rule__EnvironmentVariable__DefaultAssignment_2_3"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2153:1: rule__EnvironmentVariable__DefaultAssignment_2_3 : ( RULE_STRING ) ;
    public final void rule__EnvironmentVariable__DefaultAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2157:1: ( ( RULE_STRING ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2158:1: ( RULE_STRING )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2158:1: ( RULE_STRING )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2159:1: RULE_STRING
            {
             before(grammarAccess.getEnvironmentVariableAccess().getDefaultSTRINGTerminalRuleCall_2_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EnvironmentVariable__DefaultAssignment_2_34271); 
             after(grammarAccess.getEnvironmentVariableAccess().getDefaultSTRINGTerminalRuleCall_2_3_0()); 

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
    // $ANTLR end "rule__EnvironmentVariable__DefaultAssignment_2_3"


    // $ANTLR start "rule__EnvironmentVariable__DescriptionAssignment_3"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2168:1: rule__EnvironmentVariable__DescriptionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__EnvironmentVariable__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2172:1: ( ( RULE_STRING ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2173:1: ( RULE_STRING )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2173:1: ( RULE_STRING )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2174:1: RULE_STRING
            {
             before(grammarAccess.getEnvironmentVariableAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EnvironmentVariable__DescriptionAssignment_34302); 
             after(grammarAccess.getEnvironmentVariableAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__EnvironmentVariable__DescriptionAssignment_3"


    // $ANTLR start "rule__Function__NameAssignment_1"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2183:1: rule__Function__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2187:1: ( ( RULE_ID ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2188:1: ( RULE_ID )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2188:1: ( RULE_ID )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2189:1: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Function__NameAssignment_14333); 
             after(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Function__NameAssignment_1"


    // $ANTLR start "rule__Function__CodeAssignment_2"
    // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2198:1: rule__Function__CodeAssignment_2 : ( RULE_CODE_BLOCK ) ;
    public final void rule__Function__CodeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2202:1: ( ( RULE_CODE_BLOCK ) )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2203:1: ( RULE_CODE_BLOCK )
            {
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2203:1: ( RULE_CODE_BLOCK )
            // ../com.wellnr.bashdsl.ui/src-gen/com/wellnr/ui/contentassist/antlr/internal/InternalBashDSL.g:2204:1: RULE_CODE_BLOCK
            {
             before(grammarAccess.getFunctionAccess().getCodeCODE_BLOCKTerminalRuleCall_2_0()); 
            match(input,RULE_CODE_BLOCK,FOLLOW_RULE_CODE_BLOCK_in_rule__Function__CodeAssignment_24364); 
             after(grammarAccess.getFunctionAccess().getCodeCODE_BLOCKTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Function__CodeAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDomainmodel_in_entryRuleDomainmodel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainmodel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domainmodel__Group__0_in_ruleDomainmodel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScript_in_entryRuleScript121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScript128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__0_in_ruleScript154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_entryRuleDescription181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDescription188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__Group__0_in_ruleDescription214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__0_in_ruleArgument276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalArgument_in_entryRuleOptionalArgument303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionalArgument310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalArgument__Group__0_in_ruleOptionalArgument336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnvironmentVariable_in_entryRuleEnvironmentVariable363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnvironmentVariable370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnvironmentVariable__Group__0_in_ruleEnvironmentVariable396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0_in_ruleFunction456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalArgument__Alternatives_2_0_in_rule__OptionalArgument__Alternatives_2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalArgument__IsBooleanAssignment_2_1_in_rule__OptionalArgument__Alternatives_2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalArgument__Group_2_0_0__0_in_rule__OptionalArgument__Alternatives_2_0544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalArgument__RemainingAssignment_2_0_1_in_rule__OptionalArgument__Alternatives_2_0562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domainmodel__Group__0__Impl_in_rule__Domainmodel__Group__0593 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Domainmodel__Group__1_in_rule__Domainmodel__Group__0596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Domainmodel__Group__0__Impl624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domainmodel__Group__1__Impl_in_rule__Domainmodel__Group__1655 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Domainmodel__Group__2_in_rule__Domainmodel__Group__1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domainmodel__ReadmeTitleAssignment_1_in_rule__Domainmodel__Group__1__Impl685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domainmodel__Group__2__Impl_in_rule__Domainmodel__Group__2715 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Domainmodel__Group__3_in_rule__Domainmodel__Group__2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domainmodel__Group_2__0_in_rule__Domainmodel__Group__2__Impl745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domainmodel__Group__3__Impl_in_rule__Domainmodel__Group__3776 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Domainmodel__Group__4_in_rule__Domainmodel__Group__3779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Domainmodel__Group__3__Impl807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domainmodel__Group__4__Impl_in_rule__Domainmodel__Group__4838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domainmodel__ElementsAssignment_4_in_rule__Domainmodel__Group__4__Impl865 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Domainmodel__Group_2__0__Impl_in_rule__Domainmodel__Group_2__0906 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Domainmodel__Group_2__1_in_rule__Domainmodel__Group_2__0909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Domainmodel__Group_2__0__Impl937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domainmodel__Group_2__1__Impl_in_rule__Domainmodel__Group_2__1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domainmodel__ReadmeIntroAssignment_2_1_in_rule__Domainmodel__Group_2__1__Impl995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__0__Impl_in_rule__Script__Group__01029 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Script__Group__1_in_rule__Script__Group__01032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Script__Group__0__Impl1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__1__Impl_in_rule__Script__Group__11091 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Script__Group__2_in_rule__Script__Group__11094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__NameAssignment_1_in_rule__Script__Group__1__Impl1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__2__Impl_in_rule__Script__Group__21151 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_rule__Script__Group__3_in_rule__Script__Group__21154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__DescriptionAssignment_2_in_rule__Script__Group__2__Impl1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__3__Impl_in_rule__Script__Group__31211 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_rule__Script__Group__4_in_rule__Script__Group__31214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_3__0_in_rule__Script__Group__3__Impl1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__4__Impl_in_rule__Script__Group__41272 = new BitSet(new long[]{0x0000000003380040L});
    public static final BitSet FOLLOW_rule__Script__Group__5_in_rule__Script__Group__41275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Script__Group__4__Impl1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__5__Impl_in_rule__Script__Group__51334 = new BitSet(new long[]{0x0000000003380040L});
    public static final BitSet FOLLOW_rule__Script__Group__6_in_rule__Script__Group__51337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__LongDescriptionAssignment_5_in_rule__Script__Group__5__Impl1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__6__Impl_in_rule__Script__Group__61395 = new BitSet(new long[]{0x0000000003380040L});
    public static final BitSet FOLLOW_rule__Script__Group__7_in_rule__Script__Group__61398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__VariablesAssignment_6_in_rule__Script__Group__6__Impl1425 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Script__Group__7__Impl_in_rule__Script__Group__71456 = new BitSet(new long[]{0x0000000003380040L});
    public static final BitSet FOLLOW_rule__Script__Group__8_in_rule__Script__Group__71459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__ArgumentsAssignment_7_in_rule__Script__Group__7__Impl1486 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Script__Group__8__Impl_in_rule__Script__Group__81517 = new BitSet(new long[]{0x0000000003380040L});
    public static final BitSet FOLLOW_rule__Script__Group__9_in_rule__Script__Group__81520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__OptArgumentsAssignment_8_in_rule__Script__Group__8__Impl1547 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Script__Group__9__Impl_in_rule__Script__Group__91578 = new BitSet(new long[]{0x0000000003380040L});
    public static final BitSet FOLLOW_rule__Script__Group__10_in_rule__Script__Group__91581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__FunctionsAssignment_9_in_rule__Script__Group__9__Impl1608 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Script__Group__10__Impl_in_rule__Script__Group__101639 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Script__Group__11_in_rule__Script__Group__101642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__CodeAssignment_10_in_rule__Script__Group__10__Impl1669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__11__Impl_in_rule__Script__Group__111699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Script__Group__11__Impl1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_3__0__Impl_in_rule__Script__Group_3__01782 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Script__Group_3__1_in_rule__Script__Group_3__01785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Script__Group_3__0__Impl1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_3__1__Impl_in_rule__Script__Group_3__11844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__CopyrightAssignment_3_1_in_rule__Script__Group_3__1__Impl1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__Group__0__Impl_in_rule__Description__Group__01905 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Description__Group__1_in_rule__Description__Group__01908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Description__Group__0__Impl1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__Group__1__Impl_in_rule__Description__Group__11967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__ValueAssignment_1_in_rule__Description__Group__1__Impl1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__0__Impl_in_rule__Argument__Group__02028 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__02031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Argument__Group__0__Impl2059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__1__Impl_in_rule__Argument__Group__12090 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_rule__Argument__Group__2_in_rule__Argument__Group__12093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__NameAssignment_1_in_rule__Argument__Group__1__Impl2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__2__Impl_in_rule__Argument__Group__22150 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_rule__Argument__Group__3_in_rule__Argument__Group__22153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__RemainingAssignment_2_in_rule__Argument__Group__2__Impl2180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__3__Impl_in_rule__Argument__Group__32211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__DescriptionAssignment_3_in_rule__Argument__Group__3__Impl2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalArgument__Group__0__Impl_in_rule__OptionalArgument__Group__02276 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OptionalArgument__Group__1_in_rule__OptionalArgument__Group__02279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__OptionalArgument__Group__0__Impl2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalArgument__Group__1__Impl_in_rule__OptionalArgument__Group__12338 = new BitSet(new long[]{0x0000000014400010L});
    public static final BitSet FOLLOW_rule__OptionalArgument__Group__2_in_rule__OptionalArgument__Group__12341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalArgument__NameAssignment_1_in_rule__OptionalArgument__Group__1__Impl2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalArgument__Group__2__Impl_in_rule__OptionalArgument__Group__22398 = new BitSet(new long[]{0x0000000014400010L});
    public static final BitSet FOLLOW_rule__OptionalArgument__Group__3_in_rule__OptionalArgument__Group__22401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalArgument__Alternatives_2_in_rule__OptionalArgument__Group__2__Impl2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalArgument__Group__3__Impl_in_rule__OptionalArgument__Group__32459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalArgument__DescriptionAssignment_3_in_rule__OptionalArgument__Group__3__Impl2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalArgument__Group_2_0_0__0__Impl_in_rule__OptionalArgument__Group_2_0_0__02524 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_rule__OptionalArgument__Group_2_0_0__1_in_rule__OptionalArgument__Group_2_0_0__02527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__OptionalArgument__Group_2_0_0__0__Impl2555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalArgument__Group_2_0_0__1__Impl_in_rule__OptionalArgument__Group_2_0_0__12586 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_rule__OptionalArgument__Group_2_0_0__2_in_rule__OptionalArgument__Group_2_0_0__12589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalArgument__DynamicDefaultAssignment_2_0_0_1_in_rule__OptionalArgument__Group_2_0_0__1__Impl2616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalArgument__Group_2_0_0__2__Impl_in_rule__OptionalArgument__Group_2_0_0__22647 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OptionalArgument__Group_2_0_0__3_in_rule__OptionalArgument__Group_2_0_0__22650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__OptionalArgument__Group_2_0_0__2__Impl2678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalArgument__Group_2_0_0__3__Impl_in_rule__OptionalArgument__Group_2_0_0__32709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalArgument__DefaultAssignment_2_0_0_3_in_rule__OptionalArgument__Group_2_0_0__3__Impl2736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnvironmentVariable__Group__0__Impl_in_rule__EnvironmentVariable__Group__02774 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnvironmentVariable__Group__1_in_rule__EnvironmentVariable__Group__02777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__EnvironmentVariable__Group__0__Impl2805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnvironmentVariable__Group__1__Impl_in_rule__EnvironmentVariable__Group__12836 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__EnvironmentVariable__Group__2_in_rule__EnvironmentVariable__Group__12839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnvironmentVariable__NameAssignment_1_in_rule__EnvironmentVariable__Group__1__Impl2866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnvironmentVariable__Group__2__Impl_in_rule__EnvironmentVariable__Group__22896 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__EnvironmentVariable__Group__3_in_rule__EnvironmentVariable__Group__22899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnvironmentVariable__Group_2__0_in_rule__EnvironmentVariable__Group__2__Impl2926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnvironmentVariable__Group__3__Impl_in_rule__EnvironmentVariable__Group__32957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnvironmentVariable__DescriptionAssignment_3_in_rule__EnvironmentVariable__Group__3__Impl2984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnvironmentVariable__Group_2__0__Impl_in_rule__EnvironmentVariable__Group_2__03022 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_rule__EnvironmentVariable__Group_2__1_in_rule__EnvironmentVariable__Group_2__03025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EnvironmentVariable__Group_2__0__Impl3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnvironmentVariable__Group_2__1__Impl_in_rule__EnvironmentVariable__Group_2__13084 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_rule__EnvironmentVariable__Group_2__2_in_rule__EnvironmentVariable__Group_2__13087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnvironmentVariable__DynamicDefaultAssignment_2_1_in_rule__EnvironmentVariable__Group_2__1__Impl3114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnvironmentVariable__Group_2__2__Impl_in_rule__EnvironmentVariable__Group_2__23145 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnvironmentVariable__Group_2__3_in_rule__EnvironmentVariable__Group_2__23148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EnvironmentVariable__Group_2__2__Impl3176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnvironmentVariable__Group_2__3__Impl_in_rule__EnvironmentVariable__Group_2__33207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnvironmentVariable__DefaultAssignment_2_3_in_rule__EnvironmentVariable__Group_2__3__Impl3234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__03272 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Function__Group__1_in_rule__Function__Group__03275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Function__Group__0__Impl3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__13334 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Function__Group__2_in_rule__Function__Group__13337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__NameAssignment_1_in_rule__Function__Group__1__Impl3364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__23394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__CodeAssignment_2_in_rule__Function__Group__2__Impl3421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Domainmodel__ReadmeTitleAssignment_13462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Domainmodel__ReadmeIntroAssignment_2_13493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScript_in_rule__Domainmodel__ElementsAssignment_43524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Script__NameAssignment_13555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Script__DescriptionAssignment_23586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Script__CopyrightAssignment_3_13617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rule__Script__LongDescriptionAssignment_53648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnvironmentVariable_in_rule__Script__VariablesAssignment_63679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__Script__ArgumentsAssignment_73710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalArgument_in_rule__Script__OptArgumentsAssignment_83741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_rule__Script__FunctionsAssignment_93772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CODE_BLOCK_in_rule__Script__CodeAssignment_103803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CODE_BLOCK_in_rule__Description__ValueAssignment_13834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Argument__NameAssignment_13865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Argument__RemainingAssignment_23901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Argument__DescriptionAssignment_33940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__OptionalArgument__NameAssignment_13971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__OptionalArgument__DynamicDefaultAssignment_2_0_0_14007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__OptionalArgument__DefaultAssignment_2_0_0_34046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__OptionalArgument__RemainingAssignment_2_0_14082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__OptionalArgument__IsBooleanAssignment_2_14126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__OptionalArgument__DescriptionAssignment_34165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnvironmentVariable__NameAssignment_14196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__EnvironmentVariable__DynamicDefaultAssignment_2_14232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EnvironmentVariable__DefaultAssignment_2_34271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EnvironmentVariable__DescriptionAssignment_34302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Function__NameAssignment_14333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CODE_BLOCK_in_rule__Function__CodeAssignment_24364 = new BitSet(new long[]{0x0000000000000002L});

}
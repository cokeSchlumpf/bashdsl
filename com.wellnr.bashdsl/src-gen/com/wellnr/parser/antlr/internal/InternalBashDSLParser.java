package com.wellnr.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.wellnr.services.BashDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBashDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_CODE_BLOCK", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@GenerateReadme('", "','", "')'", "'script'", "'copyright'", "'{'", "'}'", "'description'", "'argument'", "'reads remaining'", "'optional argument'", "'with'", "'dynamic'", "'default'", "'without parameter'", "'env'", "'def'"
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
    public String getGrammarFileName() { return "../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g"; }



     	private BashDSLGrammarAccess grammarAccess;
     	
        public InternalBashDSLParser(TokenStream input, BashDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Domainmodel";	
       	}
       	
       	@Override
       	protected BashDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDomainmodel"
    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:67:1: entryRuleDomainmodel returns [EObject current=null] : iv_ruleDomainmodel= ruleDomainmodel EOF ;
    public final EObject entryRuleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainmodel = null;


        try {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:68:2: (iv_ruleDomainmodel= ruleDomainmodel EOF )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:69:2: iv_ruleDomainmodel= ruleDomainmodel EOF
            {
             newCompositeNode(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_ruleDomainmodel_in_entryRuleDomainmodel75);
            iv_ruleDomainmodel=ruleDomainmodel();

            state._fsp--;

             current =iv_ruleDomainmodel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainmodel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:76:1: ruleDomainmodel returns [EObject current=null] : (otherlv_0= '@GenerateReadme(' ( (lv_readmeTitle_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_readmeIntro_3_0= RULE_STRING ) ) )? otherlv_4= ')' ( (lv_elements_5_0= ruleScript ) )* ) ;
    public final EObject ruleDomainmodel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_readmeTitle_1_0=null;
        Token otherlv_2=null;
        Token lv_readmeIntro_3_0=null;
        Token otherlv_4=null;
        EObject lv_elements_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:79:28: ( (otherlv_0= '@GenerateReadme(' ( (lv_readmeTitle_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_readmeIntro_3_0= RULE_STRING ) ) )? otherlv_4= ')' ( (lv_elements_5_0= ruleScript ) )* ) )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:80:1: (otherlv_0= '@GenerateReadme(' ( (lv_readmeTitle_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_readmeIntro_3_0= RULE_STRING ) ) )? otherlv_4= ')' ( (lv_elements_5_0= ruleScript ) )* )
            {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:80:1: (otherlv_0= '@GenerateReadme(' ( (lv_readmeTitle_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_readmeIntro_3_0= RULE_STRING ) ) )? otherlv_4= ')' ( (lv_elements_5_0= ruleScript ) )* )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:80:3: otherlv_0= '@GenerateReadme(' ( (lv_readmeTitle_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_readmeIntro_3_0= RULE_STRING ) ) )? otherlv_4= ')' ( (lv_elements_5_0= ruleScript ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleDomainmodel122); 

                	newLeafNode(otherlv_0, grammarAccess.getDomainmodelAccess().getGenerateReadmeKeyword_0());
                
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:84:1: ( (lv_readmeTitle_1_0= RULE_STRING ) )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:85:1: (lv_readmeTitle_1_0= RULE_STRING )
            {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:85:1: (lv_readmeTitle_1_0= RULE_STRING )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:86:3: lv_readmeTitle_1_0= RULE_STRING
            {
            lv_readmeTitle_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDomainmodel139); 

            			newLeafNode(lv_readmeTitle_1_0, grammarAccess.getDomainmodelAccess().getReadmeTitleSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDomainmodelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"readmeTitle",
                    		lv_readmeTitle_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:102:2: (otherlv_2= ',' ( (lv_readmeIntro_3_0= RULE_STRING ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:102:4: otherlv_2= ',' ( (lv_readmeIntro_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleDomainmodel157); 

                        	newLeafNode(otherlv_2, grammarAccess.getDomainmodelAccess().getCommaKeyword_2_0());
                        
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:106:1: ( (lv_readmeIntro_3_0= RULE_STRING ) )
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:107:1: (lv_readmeIntro_3_0= RULE_STRING )
                    {
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:107:1: (lv_readmeIntro_3_0= RULE_STRING )
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:108:3: lv_readmeIntro_3_0= RULE_STRING
                    {
                    lv_readmeIntro_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDomainmodel174); 

                    			newLeafNode(lv_readmeIntro_3_0, grammarAccess.getDomainmodelAccess().getReadmeIntroSTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDomainmodelRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"readmeIntro",
                            		lv_readmeIntro_3_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleDomainmodel193); 

                	newLeafNode(otherlv_4, grammarAccess.getDomainmodelAccess().getRightParenthesisKeyword_3());
                
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:128:1: ( (lv_elements_5_0= ruleScript ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:129:1: (lv_elements_5_0= ruleScript )
            	    {
            	    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:129:1: (lv_elements_5_0= ruleScript )
            	    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:130:3: lv_elements_5_0= ruleScript
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDomainmodelAccess().getElementsScriptParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleScript_in_ruleDomainmodel214);
            	    lv_elements_5_0=ruleScript();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDomainmodelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_5_0, 
            	            		"Script");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleScript"
    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:154:1: entryRuleScript returns [EObject current=null] : iv_ruleScript= ruleScript EOF ;
    public final EObject entryRuleScript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScript = null;


        try {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:155:2: (iv_ruleScript= ruleScript EOF )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:156:2: iv_ruleScript= ruleScript EOF
            {
             newCompositeNode(grammarAccess.getScriptRule()); 
            pushFollow(FOLLOW_ruleScript_in_entryRuleScript251);
            iv_ruleScript=ruleScript();

            state._fsp--;

             current =iv_ruleScript; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScript261); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScript"


    // $ANTLR start "ruleScript"
    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:163:1: ruleScript returns [EObject current=null] : (otherlv_0= 'script' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) (otherlv_3= 'copyright' ( (lv_copyright_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_longDescription_6_0= ruleDescription ) )? ( (lv_variables_7_0= ruleEnvironmentVariable ) )* ( (lv_arguments_8_0= ruleArgument ) )* ( (lv_optArguments_9_0= ruleOptionalArgument ) )* ( (lv_functions_10_0= ruleFunction ) )* ( (lv_code_11_0= RULE_CODE_BLOCK ) ) otherlv_12= '}' ) ;
    public final EObject ruleScript() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token lv_copyright_4_0=null;
        Token otherlv_5=null;
        Token lv_code_11_0=null;
        Token otherlv_12=null;
        EObject lv_longDescription_6_0 = null;

        EObject lv_variables_7_0 = null;

        EObject lv_arguments_8_0 = null;

        EObject lv_optArguments_9_0 = null;

        EObject lv_functions_10_0 = null;


         enterRule(); 
            
        try {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:166:28: ( (otherlv_0= 'script' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) (otherlv_3= 'copyright' ( (lv_copyright_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_longDescription_6_0= ruleDescription ) )? ( (lv_variables_7_0= ruleEnvironmentVariable ) )* ( (lv_arguments_8_0= ruleArgument ) )* ( (lv_optArguments_9_0= ruleOptionalArgument ) )* ( (lv_functions_10_0= ruleFunction ) )* ( (lv_code_11_0= RULE_CODE_BLOCK ) ) otherlv_12= '}' ) )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:167:1: (otherlv_0= 'script' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) (otherlv_3= 'copyright' ( (lv_copyright_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_longDescription_6_0= ruleDescription ) )? ( (lv_variables_7_0= ruleEnvironmentVariable ) )* ( (lv_arguments_8_0= ruleArgument ) )* ( (lv_optArguments_9_0= ruleOptionalArgument ) )* ( (lv_functions_10_0= ruleFunction ) )* ( (lv_code_11_0= RULE_CODE_BLOCK ) ) otherlv_12= '}' )
            {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:167:1: (otherlv_0= 'script' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) (otherlv_3= 'copyright' ( (lv_copyright_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_longDescription_6_0= ruleDescription ) )? ( (lv_variables_7_0= ruleEnvironmentVariable ) )* ( (lv_arguments_8_0= ruleArgument ) )* ( (lv_optArguments_9_0= ruleOptionalArgument ) )* ( (lv_functions_10_0= ruleFunction ) )* ( (lv_code_11_0= RULE_CODE_BLOCK ) ) otherlv_12= '}' )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:167:3: otherlv_0= 'script' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) (otherlv_3= 'copyright' ( (lv_copyright_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_longDescription_6_0= ruleDescription ) )? ( (lv_variables_7_0= ruleEnvironmentVariable ) )* ( (lv_arguments_8_0= ruleArgument ) )* ( (lv_optArguments_9_0= ruleOptionalArgument ) )* ( (lv_functions_10_0= ruleFunction ) )* ( (lv_code_11_0= RULE_CODE_BLOCK ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleScript298); 

                	newLeafNode(otherlv_0, grammarAccess.getScriptAccess().getScriptKeyword_0());
                
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:171:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:172:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:172:1: (lv_name_1_0= RULE_ID )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:173:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleScript315); 

            			newLeafNode(lv_name_1_0, grammarAccess.getScriptAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getScriptRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:189:2: ( (lv_description_2_0= RULE_STRING ) )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:190:1: (lv_description_2_0= RULE_STRING )
            {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:190:1: (lv_description_2_0= RULE_STRING )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:191:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleScript337); 

            			newLeafNode(lv_description_2_0, grammarAccess.getScriptAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getScriptRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:207:2: (otherlv_3= 'copyright' ( (lv_copyright_4_0= RULE_STRING ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:207:4: otherlv_3= 'copyright' ( (lv_copyright_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleScript355); 

                        	newLeafNode(otherlv_3, grammarAccess.getScriptAccess().getCopyrightKeyword_3_0());
                        
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:211:1: ( (lv_copyright_4_0= RULE_STRING ) )
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:212:1: (lv_copyright_4_0= RULE_STRING )
                    {
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:212:1: (lv_copyright_4_0= RULE_STRING )
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:213:3: lv_copyright_4_0= RULE_STRING
                    {
                    lv_copyright_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleScript372); 

                    			newLeafNode(lv_copyright_4_0, grammarAccess.getScriptAccess().getCopyrightSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getScriptRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"copyright",
                            		lv_copyright_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleScript391); 

                	newLeafNode(otherlv_5, grammarAccess.getScriptAccess().getLeftCurlyBracketKeyword_4());
                
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:233:1: ( (lv_longDescription_6_0= ruleDescription ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:234:1: (lv_longDescription_6_0= ruleDescription )
                    {
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:234:1: (lv_longDescription_6_0= ruleDescription )
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:235:3: lv_longDescription_6_0= ruleDescription
                    {
                     
                    	        newCompositeNode(grammarAccess.getScriptAccess().getLongDescriptionDescriptionParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDescription_in_ruleScript412);
                    lv_longDescription_6_0=ruleDescription();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getScriptRule());
                    	        }
                           		set(
                           			current, 
                           			"longDescription",
                            		lv_longDescription_6_0, 
                            		"Description");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:251:3: ( (lv_variables_7_0= ruleEnvironmentVariable ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==27) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:252:1: (lv_variables_7_0= ruleEnvironmentVariable )
            	    {
            	    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:252:1: (lv_variables_7_0= ruleEnvironmentVariable )
            	    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:253:3: lv_variables_7_0= ruleEnvironmentVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScriptAccess().getVariablesEnvironmentVariableParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnvironmentVariable_in_ruleScript434);
            	    lv_variables_7_0=ruleEnvironmentVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScriptRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variables",
            	            		lv_variables_7_0, 
            	            		"EnvironmentVariable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:269:3: ( (lv_arguments_8_0= ruleArgument ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:270:1: (lv_arguments_8_0= ruleArgument )
            	    {
            	    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:270:1: (lv_arguments_8_0= ruleArgument )
            	    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:271:3: lv_arguments_8_0= ruleArgument
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScriptAccess().getArgumentsArgumentParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleArgument_in_ruleScript456);
            	    lv_arguments_8_0=ruleArgument();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScriptRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"arguments",
            	            		lv_arguments_8_0, 
            	            		"Argument");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:287:3: ( (lv_optArguments_9_0= ruleOptionalArgument ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:288:1: (lv_optArguments_9_0= ruleOptionalArgument )
            	    {
            	    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:288:1: (lv_optArguments_9_0= ruleOptionalArgument )
            	    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:289:3: lv_optArguments_9_0= ruleOptionalArgument
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScriptAccess().getOptArgumentsOptionalArgumentParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOptionalArgument_in_ruleScript478);
            	    lv_optArguments_9_0=ruleOptionalArgument();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScriptRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"optArguments",
            	            		lv_optArguments_9_0, 
            	            		"OptionalArgument");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:305:3: ( (lv_functions_10_0= ruleFunction ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==28) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:306:1: (lv_functions_10_0= ruleFunction )
            	    {
            	    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:306:1: (lv_functions_10_0= ruleFunction )
            	    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:307:3: lv_functions_10_0= ruleFunction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScriptAccess().getFunctionsFunctionParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunction_in_ruleScript500);
            	    lv_functions_10_0=ruleFunction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScriptRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"functions",
            	            		lv_functions_10_0, 
            	            		"Function");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:323:3: ( (lv_code_11_0= RULE_CODE_BLOCK ) )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:324:1: (lv_code_11_0= RULE_CODE_BLOCK )
            {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:324:1: (lv_code_11_0= RULE_CODE_BLOCK )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:325:3: lv_code_11_0= RULE_CODE_BLOCK
            {
            lv_code_11_0=(Token)match(input,RULE_CODE_BLOCK,FOLLOW_RULE_CODE_BLOCK_in_ruleScript518); 

            			newLeafNode(lv_code_11_0, grammarAccess.getScriptAccess().getCodeCODE_BLOCKTerminalRuleCall_10_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getScriptRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"code",
                    		lv_code_11_0, 
                    		"CODE_BLOCK");
            	    

            }


            }

            otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleScript535); 

                	newLeafNode(otherlv_12, grammarAccess.getScriptAccess().getRightCurlyBracketKeyword_11());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScript"


    // $ANTLR start "entryRuleDescription"
    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:353:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:354:2: (iv_ruleDescription= ruleDescription EOF )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:355:2: iv_ruleDescription= ruleDescription EOF
            {
             newCompositeNode(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_ruleDescription_in_entryRuleDescription571);
            iv_ruleDescription=ruleDescription();

            state._fsp--;

             current =iv_ruleDescription; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDescription581); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:362:1: ruleDescription returns [EObject current=null] : (otherlv_0= 'description' ( (lv_value_1_0= RULE_CODE_BLOCK ) ) ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:365:28: ( (otherlv_0= 'description' ( (lv_value_1_0= RULE_CODE_BLOCK ) ) ) )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:366:1: (otherlv_0= 'description' ( (lv_value_1_0= RULE_CODE_BLOCK ) ) )
            {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:366:1: (otherlv_0= 'description' ( (lv_value_1_0= RULE_CODE_BLOCK ) ) )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:366:3: otherlv_0= 'description' ( (lv_value_1_0= RULE_CODE_BLOCK ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleDescription618); 

                	newLeafNode(otherlv_0, grammarAccess.getDescriptionAccess().getDescriptionKeyword_0());
                
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:370:1: ( (lv_value_1_0= RULE_CODE_BLOCK ) )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:371:1: (lv_value_1_0= RULE_CODE_BLOCK )
            {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:371:1: (lv_value_1_0= RULE_CODE_BLOCK )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:372:3: lv_value_1_0= RULE_CODE_BLOCK
            {
            lv_value_1_0=(Token)match(input,RULE_CODE_BLOCK,FOLLOW_RULE_CODE_BLOCK_in_ruleDescription635); 

            			newLeafNode(lv_value_1_0, grammarAccess.getDescriptionAccess().getValueCODE_BLOCKTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDescriptionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"CODE_BLOCK");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleArgument"
    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:398:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:399:2: (iv_ruleArgument= ruleArgument EOF )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:400:2: iv_ruleArgument= ruleArgument EOF
            {
             newCompositeNode(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument678);
            iv_ruleArgument=ruleArgument();

            state._fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument688); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:407:1: ruleArgument returns [EObject current=null] : (otherlv_0= 'argument' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_remaining_2_0= 'reads remaining' ) )? ( (lv_description_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_remaining_2_0=null;
        Token lv_description_3_0=null;

         enterRule(); 
            
        try {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:410:28: ( (otherlv_0= 'argument' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_remaining_2_0= 'reads remaining' ) )? ( (lv_description_3_0= RULE_STRING ) ) ) )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:411:1: (otherlv_0= 'argument' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_remaining_2_0= 'reads remaining' ) )? ( (lv_description_3_0= RULE_STRING ) ) )
            {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:411:1: (otherlv_0= 'argument' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_remaining_2_0= 'reads remaining' ) )? ( (lv_description_3_0= RULE_STRING ) ) )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:411:3: otherlv_0= 'argument' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_remaining_2_0= 'reads remaining' ) )? ( (lv_description_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleArgument725); 

                	newLeafNode(otherlv_0, grammarAccess.getArgumentAccess().getArgumentKeyword_0());
                
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:415:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:416:1: (lv_name_1_0= RULE_STRING )
            {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:416:1: (lv_name_1_0= RULE_STRING )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:417:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArgument742); 

            			newLeafNode(lv_name_1_0, grammarAccess.getArgumentAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getArgumentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:433:2: ( (lv_remaining_2_0= 'reads remaining' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:434:1: (lv_remaining_2_0= 'reads remaining' )
                    {
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:434:1: (lv_remaining_2_0= 'reads remaining' )
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:435:3: lv_remaining_2_0= 'reads remaining'
                    {
                    lv_remaining_2_0=(Token)match(input,21,FOLLOW_21_in_ruleArgument765); 

                            newLeafNode(lv_remaining_2_0, grammarAccess.getArgumentAccess().getRemainingReadsRemainingKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArgumentRule());
                    	        }
                           		setWithLastConsumed(current, "remaining", true, "reads remaining");
                    	    

                    }


                    }
                    break;

            }

            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:448:3: ( (lv_description_3_0= RULE_STRING ) )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:449:1: (lv_description_3_0= RULE_STRING )
            {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:449:1: (lv_description_3_0= RULE_STRING )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:450:3: lv_description_3_0= RULE_STRING
            {
            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArgument796); 

            			newLeafNode(lv_description_3_0, grammarAccess.getArgumentAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getArgumentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_3_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleOptionalArgument"
    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:474:1: entryRuleOptionalArgument returns [EObject current=null] : iv_ruleOptionalArgument= ruleOptionalArgument EOF ;
    public final EObject entryRuleOptionalArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionalArgument = null;


        try {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:475:2: (iv_ruleOptionalArgument= ruleOptionalArgument EOF )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:476:2: iv_ruleOptionalArgument= ruleOptionalArgument EOF
            {
             newCompositeNode(grammarAccess.getOptionalArgumentRule()); 
            pushFollow(FOLLOW_ruleOptionalArgument_in_entryRuleOptionalArgument837);
            iv_ruleOptionalArgument=ruleOptionalArgument();

            state._fsp--;

             current =iv_ruleOptionalArgument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionalArgument847); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOptionalArgument"


    // $ANTLR start "ruleOptionalArgument"
    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:483:1: ruleOptionalArgument returns [EObject current=null] : (otherlv_0= 'optional argument' ( (lv_name_1_0= RULE_STRING ) ) ( ( (otherlv_2= 'with' ( (lv_dynamicDefault_3_0= 'dynamic' ) )? otherlv_4= 'default' ( (lv_default_5_0= RULE_STRING ) ) ) | ( (lv_remaining_6_0= 'reads remaining' ) ) ) | ( (lv_isBoolean_7_0= 'without parameter' ) ) )? ( (lv_description_8_0= RULE_STRING ) ) ) ;
    public final EObject ruleOptionalArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_dynamicDefault_3_0=null;
        Token otherlv_4=null;
        Token lv_default_5_0=null;
        Token lv_remaining_6_0=null;
        Token lv_isBoolean_7_0=null;
        Token lv_description_8_0=null;

         enterRule(); 
            
        try {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:486:28: ( (otherlv_0= 'optional argument' ( (lv_name_1_0= RULE_STRING ) ) ( ( (otherlv_2= 'with' ( (lv_dynamicDefault_3_0= 'dynamic' ) )? otherlv_4= 'default' ( (lv_default_5_0= RULE_STRING ) ) ) | ( (lv_remaining_6_0= 'reads remaining' ) ) ) | ( (lv_isBoolean_7_0= 'without parameter' ) ) )? ( (lv_description_8_0= RULE_STRING ) ) ) )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:487:1: (otherlv_0= 'optional argument' ( (lv_name_1_0= RULE_STRING ) ) ( ( (otherlv_2= 'with' ( (lv_dynamicDefault_3_0= 'dynamic' ) )? otherlv_4= 'default' ( (lv_default_5_0= RULE_STRING ) ) ) | ( (lv_remaining_6_0= 'reads remaining' ) ) ) | ( (lv_isBoolean_7_0= 'without parameter' ) ) )? ( (lv_description_8_0= RULE_STRING ) ) )
            {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:487:1: (otherlv_0= 'optional argument' ( (lv_name_1_0= RULE_STRING ) ) ( ( (otherlv_2= 'with' ( (lv_dynamicDefault_3_0= 'dynamic' ) )? otherlv_4= 'default' ( (lv_default_5_0= RULE_STRING ) ) ) | ( (lv_remaining_6_0= 'reads remaining' ) ) ) | ( (lv_isBoolean_7_0= 'without parameter' ) ) )? ( (lv_description_8_0= RULE_STRING ) ) )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:487:3: otherlv_0= 'optional argument' ( (lv_name_1_0= RULE_STRING ) ) ( ( (otherlv_2= 'with' ( (lv_dynamicDefault_3_0= 'dynamic' ) )? otherlv_4= 'default' ( (lv_default_5_0= RULE_STRING ) ) ) | ( (lv_remaining_6_0= 'reads remaining' ) ) ) | ( (lv_isBoolean_7_0= 'without parameter' ) ) )? ( (lv_description_8_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleOptionalArgument884); 

                	newLeafNode(otherlv_0, grammarAccess.getOptionalArgumentAccess().getOptionalArgumentKeyword_0());
                
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:491:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:492:1: (lv_name_1_0= RULE_STRING )
            {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:492:1: (lv_name_1_0= RULE_STRING )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:493:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOptionalArgument901); 

            			newLeafNode(lv_name_1_0, grammarAccess.getOptionalArgumentAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOptionalArgumentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:509:2: ( ( (otherlv_2= 'with' ( (lv_dynamicDefault_3_0= 'dynamic' ) )? otherlv_4= 'default' ( (lv_default_5_0= RULE_STRING ) ) ) | ( (lv_remaining_6_0= 'reads remaining' ) ) ) | ( (lv_isBoolean_7_0= 'without parameter' ) ) )?
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21||LA12_0==23) ) {
                alt12=1;
            }
            else if ( (LA12_0==26) ) {
                alt12=2;
            }
            switch (alt12) {
                case 1 :
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:509:3: ( (otherlv_2= 'with' ( (lv_dynamicDefault_3_0= 'dynamic' ) )? otherlv_4= 'default' ( (lv_default_5_0= RULE_STRING ) ) ) | ( (lv_remaining_6_0= 'reads remaining' ) ) )
                    {
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:509:3: ( (otherlv_2= 'with' ( (lv_dynamicDefault_3_0= 'dynamic' ) )? otherlv_4= 'default' ( (lv_default_5_0= RULE_STRING ) ) ) | ( (lv_remaining_6_0= 'reads remaining' ) ) )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==23) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==21) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:509:4: (otherlv_2= 'with' ( (lv_dynamicDefault_3_0= 'dynamic' ) )? otherlv_4= 'default' ( (lv_default_5_0= RULE_STRING ) ) )
                            {
                            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:509:4: (otherlv_2= 'with' ( (lv_dynamicDefault_3_0= 'dynamic' ) )? otherlv_4= 'default' ( (lv_default_5_0= RULE_STRING ) ) )
                            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:509:6: otherlv_2= 'with' ( (lv_dynamicDefault_3_0= 'dynamic' ) )? otherlv_4= 'default' ( (lv_default_5_0= RULE_STRING ) )
                            {
                            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleOptionalArgument921); 

                                	newLeafNode(otherlv_2, grammarAccess.getOptionalArgumentAccess().getWithKeyword_2_0_0_0());
                                
                            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:513:1: ( (lv_dynamicDefault_3_0= 'dynamic' ) )?
                            int alt10=2;
                            int LA10_0 = input.LA(1);

                            if ( (LA10_0==24) ) {
                                alt10=1;
                            }
                            switch (alt10) {
                                case 1 :
                                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:514:1: (lv_dynamicDefault_3_0= 'dynamic' )
                                    {
                                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:514:1: (lv_dynamicDefault_3_0= 'dynamic' )
                                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:515:3: lv_dynamicDefault_3_0= 'dynamic'
                                    {
                                    lv_dynamicDefault_3_0=(Token)match(input,24,FOLLOW_24_in_ruleOptionalArgument939); 

                                            newLeafNode(lv_dynamicDefault_3_0, grammarAccess.getOptionalArgumentAccess().getDynamicDefaultDynamicKeyword_2_0_0_1_0());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getOptionalArgumentRule());
                                    	        }
                                           		setWithLastConsumed(current, "dynamicDefault", true, "dynamic");
                                    	    

                                    }


                                    }
                                    break;

                            }

                            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleOptionalArgument965); 

                                	newLeafNode(otherlv_4, grammarAccess.getOptionalArgumentAccess().getDefaultKeyword_2_0_0_2());
                                
                            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:532:1: ( (lv_default_5_0= RULE_STRING ) )
                            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:533:1: (lv_default_5_0= RULE_STRING )
                            {
                            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:533:1: (lv_default_5_0= RULE_STRING )
                            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:534:3: lv_default_5_0= RULE_STRING
                            {
                            lv_default_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOptionalArgument982); 

                            			newLeafNode(lv_default_5_0, grammarAccess.getOptionalArgumentAccess().getDefaultSTRINGTerminalRuleCall_2_0_0_3_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getOptionalArgumentRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"default",
                                    		lv_default_5_0, 
                                    		"STRING");
                            	    

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:551:6: ( (lv_remaining_6_0= 'reads remaining' ) )
                            {
                            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:551:6: ( (lv_remaining_6_0= 'reads remaining' ) )
                            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:552:1: (lv_remaining_6_0= 'reads remaining' )
                            {
                            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:552:1: (lv_remaining_6_0= 'reads remaining' )
                            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:553:3: lv_remaining_6_0= 'reads remaining'
                            {
                            lv_remaining_6_0=(Token)match(input,21,FOLLOW_21_in_ruleOptionalArgument1012); 

                                    newLeafNode(lv_remaining_6_0, grammarAccess.getOptionalArgumentAccess().getRemainingReadsRemainingKeyword_2_0_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getOptionalArgumentRule());
                            	        }
                                   		setWithLastConsumed(current, "remaining", true, "reads remaining");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:567:6: ( (lv_isBoolean_7_0= 'without parameter' ) )
                    {
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:567:6: ( (lv_isBoolean_7_0= 'without parameter' ) )
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:568:1: (lv_isBoolean_7_0= 'without parameter' )
                    {
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:568:1: (lv_isBoolean_7_0= 'without parameter' )
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:569:3: lv_isBoolean_7_0= 'without parameter'
                    {
                    lv_isBoolean_7_0=(Token)match(input,26,FOLLOW_26_in_ruleOptionalArgument1050); 

                            newLeafNode(lv_isBoolean_7_0, grammarAccess.getOptionalArgumentAccess().getIsBooleanWithoutParameterKeyword_2_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOptionalArgumentRule());
                    	        }
                           		setWithLastConsumed(current, "isBoolean", true, "without parameter");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:582:4: ( (lv_description_8_0= RULE_STRING ) )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:583:1: (lv_description_8_0= RULE_STRING )
            {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:583:1: (lv_description_8_0= RULE_STRING )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:584:3: lv_description_8_0= RULE_STRING
            {
            lv_description_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOptionalArgument1082); 

            			newLeafNode(lv_description_8_0, grammarAccess.getOptionalArgumentAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOptionalArgumentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_8_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptionalArgument"


    // $ANTLR start "entryRuleEnvironmentVariable"
    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:608:1: entryRuleEnvironmentVariable returns [EObject current=null] : iv_ruleEnvironmentVariable= ruleEnvironmentVariable EOF ;
    public final EObject entryRuleEnvironmentVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironmentVariable = null;


        try {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:609:2: (iv_ruleEnvironmentVariable= ruleEnvironmentVariable EOF )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:610:2: iv_ruleEnvironmentVariable= ruleEnvironmentVariable EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentVariableRule()); 
            pushFollow(FOLLOW_ruleEnvironmentVariable_in_entryRuleEnvironmentVariable1123);
            iv_ruleEnvironmentVariable=ruleEnvironmentVariable();

            state._fsp--;

             current =iv_ruleEnvironmentVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnvironmentVariable1133); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnvironmentVariable"


    // $ANTLR start "ruleEnvironmentVariable"
    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:617:1: ruleEnvironmentVariable returns [EObject current=null] : (otherlv_0= 'env' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with' ( (lv_dynamicDefault_3_0= 'dynamic' ) )? otherlv_4= 'default' ( (lv_default_5_0= RULE_STRING ) ) )? ( (lv_description_6_0= RULE_STRING ) ) ) ;
    public final EObject ruleEnvironmentVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_dynamicDefault_3_0=null;
        Token otherlv_4=null;
        Token lv_default_5_0=null;
        Token lv_description_6_0=null;

         enterRule(); 
            
        try {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:620:28: ( (otherlv_0= 'env' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with' ( (lv_dynamicDefault_3_0= 'dynamic' ) )? otherlv_4= 'default' ( (lv_default_5_0= RULE_STRING ) ) )? ( (lv_description_6_0= RULE_STRING ) ) ) )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:621:1: (otherlv_0= 'env' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with' ( (lv_dynamicDefault_3_0= 'dynamic' ) )? otherlv_4= 'default' ( (lv_default_5_0= RULE_STRING ) ) )? ( (lv_description_6_0= RULE_STRING ) ) )
            {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:621:1: (otherlv_0= 'env' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with' ( (lv_dynamicDefault_3_0= 'dynamic' ) )? otherlv_4= 'default' ( (lv_default_5_0= RULE_STRING ) ) )? ( (lv_description_6_0= RULE_STRING ) ) )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:621:3: otherlv_0= 'env' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with' ( (lv_dynamicDefault_3_0= 'dynamic' ) )? otherlv_4= 'default' ( (lv_default_5_0= RULE_STRING ) ) )? ( (lv_description_6_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleEnvironmentVariable1170); 

                	newLeafNode(otherlv_0, grammarAccess.getEnvironmentVariableAccess().getEnvKeyword_0());
                
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:625:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:626:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:626:1: (lv_name_1_0= RULE_ID )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:627:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnvironmentVariable1187); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEnvironmentVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnvironmentVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:643:2: (otherlv_2= 'with' ( (lv_dynamicDefault_3_0= 'dynamic' ) )? otherlv_4= 'default' ( (lv_default_5_0= RULE_STRING ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:643:4: otherlv_2= 'with' ( (lv_dynamicDefault_3_0= 'dynamic' ) )? otherlv_4= 'default' ( (lv_default_5_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleEnvironmentVariable1205); 

                        	newLeafNode(otherlv_2, grammarAccess.getEnvironmentVariableAccess().getWithKeyword_2_0());
                        
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:647:1: ( (lv_dynamicDefault_3_0= 'dynamic' ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==24) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:648:1: (lv_dynamicDefault_3_0= 'dynamic' )
                            {
                            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:648:1: (lv_dynamicDefault_3_0= 'dynamic' )
                            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:649:3: lv_dynamicDefault_3_0= 'dynamic'
                            {
                            lv_dynamicDefault_3_0=(Token)match(input,24,FOLLOW_24_in_ruleEnvironmentVariable1223); 

                                    newLeafNode(lv_dynamicDefault_3_0, grammarAccess.getEnvironmentVariableAccess().getDynamicDefaultDynamicKeyword_2_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getEnvironmentVariableRule());
                            	        }
                                   		setWithLastConsumed(current, "dynamicDefault", true, "dynamic");
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleEnvironmentVariable1249); 

                        	newLeafNode(otherlv_4, grammarAccess.getEnvironmentVariableAccess().getDefaultKeyword_2_2());
                        
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:666:1: ( (lv_default_5_0= RULE_STRING ) )
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:667:1: (lv_default_5_0= RULE_STRING )
                    {
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:667:1: (lv_default_5_0= RULE_STRING )
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:668:3: lv_default_5_0= RULE_STRING
                    {
                    lv_default_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnvironmentVariable1266); 

                    			newLeafNode(lv_default_5_0, grammarAccess.getEnvironmentVariableAccess().getDefaultSTRINGTerminalRuleCall_2_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnvironmentVariableRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"default",
                            		lv_default_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:684:4: ( (lv_description_6_0= RULE_STRING ) )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:685:1: (lv_description_6_0= RULE_STRING )
            {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:685:1: (lv_description_6_0= RULE_STRING )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:686:3: lv_description_6_0= RULE_STRING
            {
            lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnvironmentVariable1290); 

            			newLeafNode(lv_description_6_0, grammarAccess.getEnvironmentVariableAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnvironmentVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_6_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnvironmentVariable"


    // $ANTLR start "entryRuleFunction"
    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:710:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:711:2: (iv_ruleFunction= ruleFunction EOF )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:712:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction1331);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction1341); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:719:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) ( (lv_code_2_0= RULE_CODE_BLOCK ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_code_2_0=null;

         enterRule(); 
            
        try {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:722:28: ( (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) ( (lv_code_2_0= RULE_CODE_BLOCK ) ) ) )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:723:1: (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) ( (lv_code_2_0= RULE_CODE_BLOCK ) ) )
            {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:723:1: (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) ( (lv_code_2_0= RULE_CODE_BLOCK ) ) )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:723:3: otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) ( (lv_code_2_0= RULE_CODE_BLOCK ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleFunction1378); 

                	newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getDefKeyword_0());
                
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:727:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:728:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:728:1: (lv_name_1_0= RULE_ID )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:729:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction1395); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:745:2: ( (lv_code_2_0= RULE_CODE_BLOCK ) )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:746:1: (lv_code_2_0= RULE_CODE_BLOCK )
            {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:746:1: (lv_code_2_0= RULE_CODE_BLOCK )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:747:3: lv_code_2_0= RULE_CODE_BLOCK
            {
            lv_code_2_0=(Token)match(input,RULE_CODE_BLOCK,FOLLOW_RULE_CODE_BLOCK_in_ruleFunction1417); 

            			newLeafNode(lv_code_2_0, grammarAccess.getFunctionAccess().getCodeCODE_BLOCKTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"code",
                    		lv_code_2_0, 
                    		"CODE_BLOCK");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDomainmodel_in_entryRuleDomainmodel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainmodel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleDomainmodel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDomainmodel139 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleDomainmodel157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDomainmodel174 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDomainmodel193 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleScript_in_ruleDomainmodel214 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleScript_in_entryRuleScript251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScript261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleScript298 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleScript315 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleScript337 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleScript355 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleScript372 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleScript391 = new BitSet(new long[]{0x0000000018580040L});
    public static final BitSet FOLLOW_ruleDescription_in_ruleScript412 = new BitSet(new long[]{0x0000000018500040L});
    public static final BitSet FOLLOW_ruleEnvironmentVariable_in_ruleScript434 = new BitSet(new long[]{0x0000000018500040L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleScript456 = new BitSet(new long[]{0x0000000010500040L});
    public static final BitSet FOLLOW_ruleOptionalArgument_in_ruleScript478 = new BitSet(new long[]{0x0000000010400040L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleScript500 = new BitSet(new long[]{0x0000000010000040L});
    public static final BitSet FOLLOW_RULE_CODE_BLOCK_in_ruleScript518 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleScript535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_entryRuleDescription571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDescription581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleDescription618 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_CODE_BLOCK_in_ruleDescription635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleArgument725 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArgument742 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_21_in_ruleArgument765 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArgument796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalArgument_in_entryRuleOptionalArgument837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionalArgument847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOptionalArgument884 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOptionalArgument901 = new BitSet(new long[]{0x0000000004A00010L});
    public static final BitSet FOLLOW_23_in_ruleOptionalArgument921 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_ruleOptionalArgument939 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleOptionalArgument965 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOptionalArgument982 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21_in_ruleOptionalArgument1012 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_26_in_ruleOptionalArgument1050 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOptionalArgument1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnvironmentVariable_in_entryRuleEnvironmentVariable1123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnvironmentVariable1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleEnvironmentVariable1170 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnvironmentVariable1187 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_23_in_ruleEnvironmentVariable1205 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_ruleEnvironmentVariable1223 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleEnvironmentVariable1249 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnvironmentVariable1266 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnvironmentVariable1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction1331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleFunction1378 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction1395 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_CODE_BLOCK_in_ruleFunction1417 = new BitSet(new long[]{0x0000000000000002L});

}
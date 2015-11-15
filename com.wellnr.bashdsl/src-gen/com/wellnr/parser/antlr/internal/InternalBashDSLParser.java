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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_FILENAME", "RULE_STRING", "RULE_CODE_BLOCK", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'script'", "'copyright'", "'{'", "'}'", "'optional'", "'argument'", "'with default'"
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
    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:76:1: ruleDomainmodel returns [EObject current=null] : ( (lv_elements_0_0= ruleScript ) )* ;
    public final EObject ruleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:79:28: ( ( (lv_elements_0_0= ruleScript ) )* )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:80:1: ( (lv_elements_0_0= ruleScript ) )*
            {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:80:1: ( (lv_elements_0_0= ruleScript ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:81:1: (lv_elements_0_0= ruleScript )
            	    {
            	    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:81:1: (lv_elements_0_0= ruleScript )
            	    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:82:3: lv_elements_0_0= ruleScript
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDomainmodelAccess().getElementsScriptParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleScript_in_ruleDomainmodel130);
            	    lv_elements_0_0=ruleScript();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDomainmodelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_0_0, 
            	            		"Script");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:106:1: entryRuleScript returns [EObject current=null] : iv_ruleScript= ruleScript EOF ;
    public final EObject entryRuleScript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScript = null;


        try {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:107:2: (iv_ruleScript= ruleScript EOF )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:108:2: iv_ruleScript= ruleScript EOF
            {
             newCompositeNode(grammarAccess.getScriptRule()); 
            pushFollow(FOLLOW_ruleScript_in_entryRuleScript166);
            iv_ruleScript=ruleScript();

            state._fsp--;

             current =iv_ruleScript; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScript176); 

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
    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:115:1: ruleScript returns [EObject current=null] : (otherlv_0= 'script' ( (lv_name_1_0= RULE_FILENAME ) ) ( (lv_description_2_0= RULE_STRING ) ) (otherlv_3= 'copyright' ( (lv_copyright_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_arguments_6_0= ruleArgument ) )* ( (lv_code_7_0= RULE_CODE_BLOCK ) )? otherlv_8= '}' ) ;
    public final EObject ruleScript() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token lv_copyright_4_0=null;
        Token otherlv_5=null;
        Token lv_code_7_0=null;
        Token otherlv_8=null;
        EObject lv_arguments_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:118:28: ( (otherlv_0= 'script' ( (lv_name_1_0= RULE_FILENAME ) ) ( (lv_description_2_0= RULE_STRING ) ) (otherlv_3= 'copyright' ( (lv_copyright_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_arguments_6_0= ruleArgument ) )* ( (lv_code_7_0= RULE_CODE_BLOCK ) )? otherlv_8= '}' ) )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:119:1: (otherlv_0= 'script' ( (lv_name_1_0= RULE_FILENAME ) ) ( (lv_description_2_0= RULE_STRING ) ) (otherlv_3= 'copyright' ( (lv_copyright_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_arguments_6_0= ruleArgument ) )* ( (lv_code_7_0= RULE_CODE_BLOCK ) )? otherlv_8= '}' )
            {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:119:1: (otherlv_0= 'script' ( (lv_name_1_0= RULE_FILENAME ) ) ( (lv_description_2_0= RULE_STRING ) ) (otherlv_3= 'copyright' ( (lv_copyright_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_arguments_6_0= ruleArgument ) )* ( (lv_code_7_0= RULE_CODE_BLOCK ) )? otherlv_8= '}' )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:119:3: otherlv_0= 'script' ( (lv_name_1_0= RULE_FILENAME ) ) ( (lv_description_2_0= RULE_STRING ) ) (otherlv_3= 'copyright' ( (lv_copyright_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_arguments_6_0= ruleArgument ) )* ( (lv_code_7_0= RULE_CODE_BLOCK ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleScript213); 

                	newLeafNode(otherlv_0, grammarAccess.getScriptAccess().getScriptKeyword_0());
                
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:123:1: ( (lv_name_1_0= RULE_FILENAME ) )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:124:1: (lv_name_1_0= RULE_FILENAME )
            {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:124:1: (lv_name_1_0= RULE_FILENAME )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:125:3: lv_name_1_0= RULE_FILENAME
            {
            lv_name_1_0=(Token)match(input,RULE_FILENAME,FOLLOW_RULE_FILENAME_in_ruleScript230); 

            			newLeafNode(lv_name_1_0, grammarAccess.getScriptAccess().getNameFILENAMETerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getScriptRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"FILENAME");
            	    

            }


            }

            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:141:2: ( (lv_description_2_0= RULE_STRING ) )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:142:1: (lv_description_2_0= RULE_STRING )
            {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:142:1: (lv_description_2_0= RULE_STRING )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:143:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleScript252); 

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

            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:159:2: (otherlv_3= 'copyright' ( (lv_copyright_4_0= RULE_STRING ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:159:4: otherlv_3= 'copyright' ( (lv_copyright_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleScript270); 

                        	newLeafNode(otherlv_3, grammarAccess.getScriptAccess().getCopyrightKeyword_3_0());
                        
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:163:1: ( (lv_copyright_4_0= RULE_STRING ) )
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:164:1: (lv_copyright_4_0= RULE_STRING )
                    {
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:164:1: (lv_copyright_4_0= RULE_STRING )
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:165:3: lv_copyright_4_0= RULE_STRING
                    {
                    lv_copyright_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleScript287); 

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

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleScript306); 

                	newLeafNode(otherlv_5, grammarAccess.getScriptAccess().getLeftCurlyBracketKeyword_4());
                
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:185:1: ( (lv_arguments_6_0= ruleArgument ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=17 && LA3_0<=18)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:186:1: (lv_arguments_6_0= ruleArgument )
            	    {
            	    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:186:1: (lv_arguments_6_0= ruleArgument )
            	    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:187:3: lv_arguments_6_0= ruleArgument
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScriptAccess().getArgumentsArgumentParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleArgument_in_ruleScript327);
            	    lv_arguments_6_0=ruleArgument();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScriptRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"arguments",
            	            		lv_arguments_6_0, 
            	            		"Argument");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:203:3: ( (lv_code_7_0= RULE_CODE_BLOCK ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_CODE_BLOCK) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:204:1: (lv_code_7_0= RULE_CODE_BLOCK )
                    {
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:204:1: (lv_code_7_0= RULE_CODE_BLOCK )
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:205:3: lv_code_7_0= RULE_CODE_BLOCK
                    {
                    lv_code_7_0=(Token)match(input,RULE_CODE_BLOCK,FOLLOW_RULE_CODE_BLOCK_in_ruleScript345); 

                    			newLeafNode(lv_code_7_0, grammarAccess.getScriptAccess().getCodeCODE_BLOCKTerminalRuleCall_6_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getScriptRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"code",
                            		lv_code_7_0, 
                            		"CODE_BLOCK");
                    	    

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleScript363); 

                	newLeafNode(otherlv_8, grammarAccess.getScriptAccess().getRightCurlyBracketKeyword_7());
                

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


    // $ANTLR start "entryRuleArgument"
    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:233:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:234:2: (iv_ruleArgument= ruleArgument EOF )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:235:2: iv_ruleArgument= ruleArgument EOF
            {
             newCompositeNode(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument399);
            iv_ruleArgument=ruleArgument();

            state._fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument409); 

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
    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:242:1: ruleArgument returns [EObject current=null] : ( ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'argument' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'with default' ( (lv_default_4_0= RULE_STRING ) ) )? ( (lv_description_5_0= RULE_STRING ) ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_optional_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_default_4_0=null;
        Token lv_description_5_0=null;

         enterRule(); 
            
        try {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:245:28: ( ( ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'argument' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'with default' ( (lv_default_4_0= RULE_STRING ) ) )? ( (lv_description_5_0= RULE_STRING ) ) ) )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:246:1: ( ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'argument' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'with default' ( (lv_default_4_0= RULE_STRING ) ) )? ( (lv_description_5_0= RULE_STRING ) ) )
            {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:246:1: ( ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'argument' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'with default' ( (lv_default_4_0= RULE_STRING ) ) )? ( (lv_description_5_0= RULE_STRING ) ) )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:246:2: ( (lv_optional_0_0= 'optional' ) )? otherlv_1= 'argument' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'with default' ( (lv_default_4_0= RULE_STRING ) ) )? ( (lv_description_5_0= RULE_STRING ) )
            {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:246:2: ( (lv_optional_0_0= 'optional' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:247:1: (lv_optional_0_0= 'optional' )
                    {
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:247:1: (lv_optional_0_0= 'optional' )
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:248:3: lv_optional_0_0= 'optional'
                    {
                    lv_optional_0_0=(Token)match(input,17,FOLLOW_17_in_ruleArgument452); 

                            newLeafNode(lv_optional_0_0, grammarAccess.getArgumentAccess().getOptionalOptionalKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArgumentRule());
                    	        }
                           		setWithLastConsumed(current, "optional", true, "optional");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleArgument478); 

                	newLeafNode(otherlv_1, grammarAccess.getArgumentAccess().getArgumentKeyword_1());
                
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:265:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:266:1: (lv_name_2_0= RULE_STRING )
            {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:266:1: (lv_name_2_0= RULE_STRING )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:267:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArgument495); 

            			newLeafNode(lv_name_2_0, grammarAccess.getArgumentAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getArgumentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:283:2: (otherlv_3= 'with default' ( (lv_default_4_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:283:4: otherlv_3= 'with default' ( (lv_default_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleArgument513); 

                        	newLeafNode(otherlv_3, grammarAccess.getArgumentAccess().getWithDefaultKeyword_3_0());
                        
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:287:1: ( (lv_default_4_0= RULE_STRING ) )
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:288:1: (lv_default_4_0= RULE_STRING )
                    {
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:288:1: (lv_default_4_0= RULE_STRING )
                    // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:289:3: lv_default_4_0= RULE_STRING
                    {
                    lv_default_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArgument530); 

                    			newLeafNode(lv_default_4_0, grammarAccess.getArgumentAccess().getDefaultSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArgumentRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"default",
                            		lv_default_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:305:4: ( (lv_description_5_0= RULE_STRING ) )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:306:1: (lv_description_5_0= RULE_STRING )
            {
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:306:1: (lv_description_5_0= RULE_STRING )
            // ../com.wellnr.bashdsl/src-gen/com/wellnr/parser/antlr/internal/InternalBashDSL.g:307:3: lv_description_5_0= RULE_STRING
            {
            lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArgument554); 

            			newLeafNode(lv_description_5_0, grammarAccess.getArgumentAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getArgumentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_5_0, 
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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDomainmodel_in_entryRuleDomainmodel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainmodel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScript_in_ruleDomainmodel130 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleScript_in_entryRuleScript166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScript176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleScript213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_FILENAME_in_ruleScript230 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleScript252 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleScript270 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleScript287 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleScript306 = new BitSet(new long[]{0x0000000000070040L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleScript327 = new BitSet(new long[]{0x0000000000070040L});
    public static final BitSet FOLLOW_RULE_CODE_BLOCK_in_ruleScript345 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleScript363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument399 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleArgument452 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleArgument478 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArgument495 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_19_in_ruleArgument513 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArgument530 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArgument554 = new BitSet(new long[]{0x0000000000000002L});

}
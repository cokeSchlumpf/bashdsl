/*
 * generated by Xtext
 */
package com.wellnr.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import com.wellnr.services.BashDSLGrammarAccess;

public class BashDSLParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private BashDSLGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected com.wellnr.parser.antlr.internal.InternalBashDSLParser createParser(XtextTokenStream stream) {
		return new com.wellnr.parser.antlr.internal.InternalBashDSLParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Domainmodel";
	}
	
	public BashDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(BashDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}

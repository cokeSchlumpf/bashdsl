/*
 * generated by Xtext
 */
package com.wellnr.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import com.wellnr.services.BashDSLGrammarAccess;

public class BashDSLParser extends AbstractContentAssistParser {
	
	@Inject
	private BashDSLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected com.wellnr.ui.contentassist.antlr.internal.InternalBashDSLParser createParser() {
		com.wellnr.ui.contentassist.antlr.internal.InternalBashDSLParser result = new com.wellnr.ui.contentassist.antlr.internal.InternalBashDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAbstractArgumentAccess().getAlternatives(), "rule__AbstractArgument__Alternatives");
					put(grammarAccess.getOptionalArgumentAccess().getAlternatives_2(), "rule__OptionalArgument__Alternatives_2");
					put(grammarAccess.getOptionalArgumentAccess().getAlternatives_2_0(), "rule__OptionalArgument__Alternatives_2_0");
					put(grammarAccess.getDomainmodelAccess().getGroup(), "rule__Domainmodel__Group__0");
					put(grammarAccess.getDomainmodelAccess().getGroup_2(), "rule__Domainmodel__Group_2__0");
					put(grammarAccess.getScriptAccess().getGroup(), "rule__Script__Group__0");
					put(grammarAccess.getScriptAccess().getGroup_3(), "rule__Script__Group_3__0");
					put(grammarAccess.getDescriptionAccess().getGroup(), "rule__Description__Group__0");
					put(grammarAccess.getArgumentAccess().getGroup(), "rule__Argument__Group__0");
					put(grammarAccess.getOptionalArgumentAccess().getGroup(), "rule__OptionalArgument__Group__0");
					put(grammarAccess.getOptionalArgumentAccess().getGroup_2_0_0(), "rule__OptionalArgument__Group_2_0_0__0");
					put(grammarAccess.getEnvironmentVariableAccess().getGroup(), "rule__EnvironmentVariable__Group__0");
					put(grammarAccess.getEnvironmentVariableAccess().getGroup_2(), "rule__EnvironmentVariable__Group_2__0");
					put(grammarAccess.getFunctionAccess().getGroup(), "rule__Function__Group__0");
					put(grammarAccess.getDomainmodelAccess().getReadmeTitleAssignment_1(), "rule__Domainmodel__ReadmeTitleAssignment_1");
					put(grammarAccess.getDomainmodelAccess().getReadmeIntroAssignment_2_1(), "rule__Domainmodel__ReadmeIntroAssignment_2_1");
					put(grammarAccess.getDomainmodelAccess().getElementsAssignment_4(), "rule__Domainmodel__ElementsAssignment_4");
					put(grammarAccess.getScriptAccess().getNameAssignment_1(), "rule__Script__NameAssignment_1");
					put(grammarAccess.getScriptAccess().getDescriptionAssignment_2(), "rule__Script__DescriptionAssignment_2");
					put(grammarAccess.getScriptAccess().getCopyrightAssignment_3_1(), "rule__Script__CopyrightAssignment_3_1");
					put(grammarAccess.getScriptAccess().getLongDescriptionAssignment_5(), "rule__Script__LongDescriptionAssignment_5");
					put(grammarAccess.getScriptAccess().getVariablesAssignment_6(), "rule__Script__VariablesAssignment_6");
					put(grammarAccess.getScriptAccess().getArgumentsAssignment_7(), "rule__Script__ArgumentsAssignment_7");
					put(grammarAccess.getScriptAccess().getOptArgumentsAssignment_8(), "rule__Script__OptArgumentsAssignment_8");
					put(grammarAccess.getScriptAccess().getFunctionsAssignment_9(), "rule__Script__FunctionsAssignment_9");
					put(grammarAccess.getScriptAccess().getCodeAssignment_10(), "rule__Script__CodeAssignment_10");
					put(grammarAccess.getDescriptionAccess().getValueAssignment_1(), "rule__Description__ValueAssignment_1");
					put(grammarAccess.getArgumentAccess().getNameAssignment_1(), "rule__Argument__NameAssignment_1");
					put(grammarAccess.getArgumentAccess().getRemainingAssignment_2(), "rule__Argument__RemainingAssignment_2");
					put(grammarAccess.getArgumentAccess().getDescriptionAssignment_3(), "rule__Argument__DescriptionAssignment_3");
					put(grammarAccess.getOptionalArgumentAccess().getNameAssignment_1(), "rule__OptionalArgument__NameAssignment_1");
					put(grammarAccess.getOptionalArgumentAccess().getDynamicDefaultAssignment_2_0_0_1(), "rule__OptionalArgument__DynamicDefaultAssignment_2_0_0_1");
					put(grammarAccess.getOptionalArgumentAccess().getDefaultAssignment_2_0_0_3(), "rule__OptionalArgument__DefaultAssignment_2_0_0_3");
					put(grammarAccess.getOptionalArgumentAccess().getRemainingAssignment_2_0_1(), "rule__OptionalArgument__RemainingAssignment_2_0_1");
					put(grammarAccess.getOptionalArgumentAccess().getIsBooleanAssignment_2_1(), "rule__OptionalArgument__IsBooleanAssignment_2_1");
					put(grammarAccess.getOptionalArgumentAccess().getDescriptionAssignment_3(), "rule__OptionalArgument__DescriptionAssignment_3");
					put(grammarAccess.getEnvironmentVariableAccess().getNameAssignment_1(), "rule__EnvironmentVariable__NameAssignment_1");
					put(grammarAccess.getEnvironmentVariableAccess().getDynamicDefaultAssignment_2_1(), "rule__EnvironmentVariable__DynamicDefaultAssignment_2_1");
					put(grammarAccess.getEnvironmentVariableAccess().getDefaultAssignment_2_3(), "rule__EnvironmentVariable__DefaultAssignment_2_3");
					put(grammarAccess.getEnvironmentVariableAccess().getDescriptionAssignment_3(), "rule__EnvironmentVariable__DescriptionAssignment_3");
					put(grammarAccess.getFunctionAccess().getNameAssignment_1(), "rule__Function__NameAssignment_1");
					put(grammarAccess.getFunctionAccess().getCodeAssignment_2(), "rule__Function__CodeAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			com.wellnr.ui.contentassist.antlr.internal.InternalBashDSLParser typedParser = (com.wellnr.ui.contentassist.antlr.internal.InternalBashDSLParser) parser;
			typedParser.entryRuleDomainmodel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public BashDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(BashDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

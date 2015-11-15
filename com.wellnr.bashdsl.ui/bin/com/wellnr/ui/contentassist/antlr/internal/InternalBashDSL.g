/*
 * generated by Xtext
 */
grammar InternalBashDSL;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package com.wellnr.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}

@parser::members {
 
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

}




// Entry rule entryRuleDomainmodel
entryRuleDomainmodel 
:
{ before(grammarAccess.getDomainmodelRule()); }
	 ruleDomainmodel
{ after(grammarAccess.getDomainmodelRule()); } 
	 EOF 
;

// Rule Domainmodel
ruleDomainmodel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDomainmodelAccess().getElementsAssignment()); }
(rule__Domainmodel__ElementsAssignment)*
{ after(grammarAccess.getDomainmodelAccess().getElementsAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleScript
entryRuleScript 
:
{ before(grammarAccess.getScriptRule()); }
	 ruleScript
{ after(grammarAccess.getScriptRule()); } 
	 EOF 
;

// Rule Script
ruleScript
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getScriptAccess().getGroup()); }
(rule__Script__Group__0)
{ after(grammarAccess.getScriptAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleArgument
entryRuleArgument 
:
{ before(grammarAccess.getArgumentRule()); }
	 ruleArgument
{ after(grammarAccess.getArgumentRule()); } 
	 EOF 
;

// Rule Argument
ruleArgument
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getArgumentAccess().getGroup()); }
(rule__Argument__Group__0)
{ after(grammarAccess.getArgumentAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Script__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Script__Group__0__Impl
	rule__Script__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Script__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getScriptAccess().getScriptKeyword_0()); }

	'script' 

{ after(grammarAccess.getScriptAccess().getScriptKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Script__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Script__Group__1__Impl
	rule__Script__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Script__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getScriptAccess().getNameAssignment_1()); }
(rule__Script__NameAssignment_1)
{ after(grammarAccess.getScriptAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Script__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Script__Group__2__Impl
	rule__Script__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Script__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getScriptAccess().getDescriptionAssignment_2()); }
(rule__Script__DescriptionAssignment_2)
{ after(grammarAccess.getScriptAccess().getDescriptionAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Script__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Script__Group__3__Impl
	rule__Script__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Script__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getScriptAccess().getGroup_3()); }
(rule__Script__Group_3__0)?
{ after(grammarAccess.getScriptAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Script__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Script__Group__4__Impl
	rule__Script__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Script__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getScriptAccess().getLeftCurlyBracketKeyword_4()); }

	'{' 

{ after(grammarAccess.getScriptAccess().getLeftCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Script__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Script__Group__5__Impl
	rule__Script__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Script__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getScriptAccess().getArgumentsAssignment_5()); }
(rule__Script__ArgumentsAssignment_5)*
{ after(grammarAccess.getScriptAccess().getArgumentsAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Script__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Script__Group__6__Impl
	rule__Script__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Script__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getScriptAccess().getCodeAssignment_6()); }
(rule__Script__CodeAssignment_6)?
{ after(grammarAccess.getScriptAccess().getCodeAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Script__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Script__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Script__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getScriptAccess().getRightCurlyBracketKeyword_7()); }

	'}' 

{ after(grammarAccess.getScriptAccess().getRightCurlyBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__Script__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Script__Group_3__0__Impl
	rule__Script__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Script__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getScriptAccess().getCopyrightKeyword_3_0()); }

	'copyright' 

{ after(grammarAccess.getScriptAccess().getCopyrightKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Script__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Script__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Script__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getScriptAccess().getCopyrightAssignment_3_1()); }
(rule__Script__CopyrightAssignment_3_1)
{ after(grammarAccess.getScriptAccess().getCopyrightAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Argument__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group__0__Impl
	rule__Argument__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getOptionalAssignment_0()); }
(rule__Argument__OptionalAssignment_0)?
{ after(grammarAccess.getArgumentAccess().getOptionalAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Argument__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group__1__Impl
	rule__Argument__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getArgumentKeyword_1()); }

	'argument' 

{ after(grammarAccess.getArgumentAccess().getArgumentKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Argument__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group__2__Impl
	rule__Argument__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getNameAssignment_2()); }
(rule__Argument__NameAssignment_2)
{ after(grammarAccess.getArgumentAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Argument__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group__3__Impl
	rule__Argument__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getGroup_3()); }
(rule__Argument__Group_3__0)?
{ after(grammarAccess.getArgumentAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Argument__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getDescriptionAssignment_4()); }
(rule__Argument__DescriptionAssignment_4)
{ after(grammarAccess.getArgumentAccess().getDescriptionAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Argument__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group_3__0__Impl
	rule__Argument__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getWithDefaultKeyword_3_0()); }

	'with default' 

{ after(grammarAccess.getArgumentAccess().getWithDefaultKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Argument__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getDefaultAssignment_3_1()); }
(rule__Argument__DefaultAssignment_3_1)
{ after(grammarAccess.getArgumentAccess().getDefaultAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__Domainmodel__ElementsAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDomainmodelAccess().getElementsScriptParserRuleCall_0()); }
	ruleScript{ after(grammarAccess.getDomainmodelAccess().getElementsScriptParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Script__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getScriptAccess().getNameFILENAMETerminalRuleCall_1_0()); }
	RULE_FILENAME{ after(grammarAccess.getScriptAccess().getNameFILENAMETerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Script__DescriptionAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getScriptAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); }
	RULE_STRING{ after(grammarAccess.getScriptAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Script__CopyrightAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getScriptAccess().getCopyrightSTRINGTerminalRuleCall_3_1_0()); }
	RULE_STRING{ after(grammarAccess.getScriptAccess().getCopyrightSTRINGTerminalRuleCall_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Script__ArgumentsAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getScriptAccess().getArgumentsArgumentParserRuleCall_5_0()); }
	ruleArgument{ after(grammarAccess.getScriptAccess().getArgumentsArgumentParserRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Script__CodeAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getScriptAccess().getCodeCODE_BLOCKTerminalRuleCall_6_0()); }
	RULE_CODE_BLOCK{ after(grammarAccess.getScriptAccess().getCodeCODE_BLOCKTerminalRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__OptionalAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getOptionalOptionalKeyword_0_0()); }
(
{ before(grammarAccess.getArgumentAccess().getOptionalOptionalKeyword_0_0()); }

	'optional' 

{ after(grammarAccess.getArgumentAccess().getOptionalOptionalKeyword_0_0()); }
)

{ after(grammarAccess.getArgumentAccess().getOptionalOptionalKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	RULE_STRING{ after(grammarAccess.getArgumentAccess().getNameSTRINGTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__DefaultAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getDefaultSTRINGTerminalRuleCall_3_1_0()); }
	RULE_STRING{ after(grammarAccess.getArgumentAccess().getDefaultSTRINGTerminalRuleCall_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__DescriptionAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); }
	RULE_STRING{ after(grammarAccess.getArgumentAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_FILENAME : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'-'|'.'|'0'..'9')*;

RULE_CODE_BLOCK : '"""' ( options {greedy=false;} : . )*'"""';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


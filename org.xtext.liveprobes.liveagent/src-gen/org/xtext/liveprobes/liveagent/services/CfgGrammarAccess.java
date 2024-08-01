/*
 * generated by Xtext 2.33.0
 */
package org.xtext.liveprobes.liveagent.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class CfgGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class AgentConfigElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.liveprobes.liveagent.Cfg.AgentConfig");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAgentConfigKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cConfigAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cConfigConfigurationParserRuleCall_2_0 = (RuleCall)cConfigAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//AgentConfig:
		//    'AgentConfig' '{'
		//    config = Configuration
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'AgentConfig' '{'
		//config = Configuration
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'AgentConfig'
		public Keyword getAgentConfigKeyword_0() { return cAgentConfigKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//config = Configuration
		public Assignment getConfigAssignment_2() { return cConfigAssignment_2; }
		
		//Configuration
		public RuleCall getConfigConfigurationParserRuleCall_2_0() { return cConfigConfigurationParserRuleCall_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	public class ConfigurationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.liveprobes.liveagent.Cfg.Configuration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLanguageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cLanguageAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLanguageSTRINGTerminalRuleCall_2_0 = (RuleCall)cLanguageAssignment_2.eContents().get(0);
		private final Keyword cCompileKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cEqualsSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cCompileAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cCompileBOOLEANParserRuleCall_5_0 = (RuleCall)cCompileAssignment_5.eContents().get(0);
		private final Keyword cCompile_commandKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cCommandAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cCommandSTRINGTerminalRuleCall_8_0 = (RuleCall)cCommandAssignment_8.eContents().get(0);
		private final Keyword cRunner_pathKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cEqualsSignKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Assignment cPathAssignment_11 = (Assignment)cGroup.eContents().get(11);
		private final RuleCall cPathSTRINGTerminalRuleCall_11_0 = (RuleCall)cPathAssignment_11.eContents().get(0);
		private final Keyword cDap_serverKeyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Keyword cEqualsSignKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Assignment cDapAssignment_14 = (Assignment)cGroup.eContents().get(14);
		private final RuleCall cDapSTRINGTerminalRuleCall_14_0 = (RuleCall)cDapAssignment_14.eContents().get(0);
		private final Keyword cParserKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cEqualsSignKeyword_16 = (Keyword)cGroup.eContents().get(16);
		private final Assignment cParserAssignment_17 = (Assignment)cGroup.eContents().get(17);
		private final RuleCall cParserBOOLEANParserRuleCall_17_0 = (RuleCall)cParserAssignment_17.eContents().get(0);
		private final Keyword cIO_socketKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cEqualsSignKeyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Assignment cIoAssignment_20 = (Assignment)cGroup.eContents().get(20);
		private final RuleCall cIoBOOLEANParserRuleCall_20_0 = (RuleCall)cIoAssignment_20.eContents().get(0);
		private final Keyword cThread_IDKeyword_21 = (Keyword)cGroup.eContents().get(21);
		private final Keyword cEqualsSignKeyword_22 = (Keyword)cGroup.eContents().get(22);
		private final Assignment cThreadAssignment_23 = (Assignment)cGroup.eContents().get(23);
		private final RuleCall cThreadSTRINGTerminalRuleCall_23_0 = (RuleCall)cThreadAssignment_23.eContents().get(0);
		private final Keyword cAdapter_IDKeyword_24 = (Keyword)cGroup.eContents().get(24);
		private final Keyword cEqualsSignKeyword_25 = (Keyword)cGroup.eContents().get(25);
		private final Assignment cAdapterAssignment_26 = (Assignment)cGroup.eContents().get(26);
		private final RuleCall cAdapterSTRINGTerminalRuleCall_26_0 = (RuleCall)cAdapterAssignment_26.eContents().get(0);
		private final Keyword cRunner_breakpointKeyword_27 = (Keyword)cGroup.eContents().get(27);
		private final Keyword cEqualsSignKeyword_28 = (Keyword)cGroup.eContents().get(28);
		private final Assignment cBreakpointAssignment_29 = (Assignment)cGroup.eContents().get(29);
		private final RuleCall cBreakpointSTRINGTerminalRuleCall_29_0 = (RuleCall)cBreakpointAssignment_29.eContents().get(0);
		private final Keyword cLoad_commandKeyword_30 = (Keyword)cGroup.eContents().get(30);
		private final Keyword cEqualsSignKeyword_31 = (Keyword)cGroup.eContents().get(31);
		private final Assignment cLoadAssignment_32 = (Assignment)cGroup.eContents().get(32);
		private final RuleCall cLoadSTRINGTerminalRuleCall_32_0 = (RuleCall)cLoadAssignment_32.eContents().get(0);
		private final Keyword cExecute_commandKeyword_33 = (Keyword)cGroup.eContents().get(33);
		private final Keyword cEqualsSignKeyword_34 = (Keyword)cGroup.eContents().get(34);
		private final Assignment cExecAssignment_35 = (Assignment)cGroup.eContents().get(35);
		private final RuleCall cExecSTRINGTerminalRuleCall_35_0 = (RuleCall)cExecAssignment_35.eContents().get(0);
		private final Assignment cAdditionalConfigAssignment_36 = (Assignment)cGroup.eContents().get(36);
		private final Alternatives cAdditionalConfigAlternatives_36_0 = (Alternatives)cAdditionalConfigAssignment_36.eContents().get(0);
		private final RuleCall cAdditionalConfigBoolParserRuleCall_36_0_0 = (RuleCall)cAdditionalConfigAlternatives_36_0.eContents().get(0);
		private final RuleCall cAdditionalConfigLineParserRuleCall_36_0_1 = (RuleCall)cAdditionalConfigAlternatives_36_0.eContents().get(1);
		
		//Configuration:
		//    'Language' '=' language=STRING
		//    'compile' '=' compile=BOOLEAN
		//    'compile_command' '=' command=STRING
		//    'runner_path' '=' path=STRING
		//    'dap_server' '=' dap=STRING
		//    'parser' '=' parser=BOOLEAN
		//    'IO_socket' '=' io=BOOLEAN
		//    'thread_ID' '=' thread=STRING
		//    'adapter_ID' '=' adapter=STRING
		//    'runner_breakpoint' '=' breakpoint=STRING
		//    'load_command' '=' load=STRING
		//    'execute_command' '=' exec=STRING
		//    additionalConfig += (Bool | Line)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Language' '=' language=STRING
		//'compile' '=' compile=BOOLEAN
		//'compile_command' '=' command=STRING
		//'runner_path' '=' path=STRING
		//'dap_server' '=' dap=STRING
		//'parser' '=' parser=BOOLEAN
		//'IO_socket' '=' io=BOOLEAN
		//'thread_ID' '=' thread=STRING
		//'adapter_ID' '=' adapter=STRING
		//'runner_breakpoint' '=' breakpoint=STRING
		//'load_command' '=' load=STRING
		//'execute_command' '=' exec=STRING
		//additionalConfig += (Bool | Line)*
		public Group getGroup() { return cGroup; }
		
		//'Language'
		public Keyword getLanguageKeyword_0() { return cLanguageKeyword_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }
		
		//language=STRING
		public Assignment getLanguageAssignment_2() { return cLanguageAssignment_2; }
		
		//STRING
		public RuleCall getLanguageSTRINGTerminalRuleCall_2_0() { return cLanguageSTRINGTerminalRuleCall_2_0; }
		
		//'compile'
		public Keyword getCompileKeyword_3() { return cCompileKeyword_3; }
		
		//'='
		public Keyword getEqualsSignKeyword_4() { return cEqualsSignKeyword_4; }
		
		//compile=BOOLEAN
		public Assignment getCompileAssignment_5() { return cCompileAssignment_5; }
		
		//BOOLEAN
		public RuleCall getCompileBOOLEANParserRuleCall_5_0() { return cCompileBOOLEANParserRuleCall_5_0; }
		
		//'compile_command'
		public Keyword getCompile_commandKeyword_6() { return cCompile_commandKeyword_6; }
		
		//'='
		public Keyword getEqualsSignKeyword_7() { return cEqualsSignKeyword_7; }
		
		//command=STRING
		public Assignment getCommandAssignment_8() { return cCommandAssignment_8; }
		
		//STRING
		public RuleCall getCommandSTRINGTerminalRuleCall_8_0() { return cCommandSTRINGTerminalRuleCall_8_0; }
		
		//'runner_path'
		public Keyword getRunner_pathKeyword_9() { return cRunner_pathKeyword_9; }
		
		//'='
		public Keyword getEqualsSignKeyword_10() { return cEqualsSignKeyword_10; }
		
		//path=STRING
		public Assignment getPathAssignment_11() { return cPathAssignment_11; }
		
		//STRING
		public RuleCall getPathSTRINGTerminalRuleCall_11_0() { return cPathSTRINGTerminalRuleCall_11_0; }
		
		//'dap_server'
		public Keyword getDap_serverKeyword_12() { return cDap_serverKeyword_12; }
		
		//'='
		public Keyword getEqualsSignKeyword_13() { return cEqualsSignKeyword_13; }
		
		//dap=STRING
		public Assignment getDapAssignment_14() { return cDapAssignment_14; }
		
		//STRING
		public RuleCall getDapSTRINGTerminalRuleCall_14_0() { return cDapSTRINGTerminalRuleCall_14_0; }
		
		//'parser'
		public Keyword getParserKeyword_15() { return cParserKeyword_15; }
		
		//'='
		public Keyword getEqualsSignKeyword_16() { return cEqualsSignKeyword_16; }
		
		//parser=BOOLEAN
		public Assignment getParserAssignment_17() { return cParserAssignment_17; }
		
		//BOOLEAN
		public RuleCall getParserBOOLEANParserRuleCall_17_0() { return cParserBOOLEANParserRuleCall_17_0; }
		
		//'IO_socket'
		public Keyword getIO_socketKeyword_18() { return cIO_socketKeyword_18; }
		
		//'='
		public Keyword getEqualsSignKeyword_19() { return cEqualsSignKeyword_19; }
		
		//io=BOOLEAN
		public Assignment getIoAssignment_20() { return cIoAssignment_20; }
		
		//BOOLEAN
		public RuleCall getIoBOOLEANParserRuleCall_20_0() { return cIoBOOLEANParserRuleCall_20_0; }
		
		//'thread_ID'
		public Keyword getThread_IDKeyword_21() { return cThread_IDKeyword_21; }
		
		//'='
		public Keyword getEqualsSignKeyword_22() { return cEqualsSignKeyword_22; }
		
		//thread=STRING
		public Assignment getThreadAssignment_23() { return cThreadAssignment_23; }
		
		//STRING
		public RuleCall getThreadSTRINGTerminalRuleCall_23_0() { return cThreadSTRINGTerminalRuleCall_23_0; }
		
		//'adapter_ID'
		public Keyword getAdapter_IDKeyword_24() { return cAdapter_IDKeyword_24; }
		
		//'='
		public Keyword getEqualsSignKeyword_25() { return cEqualsSignKeyword_25; }
		
		//adapter=STRING
		public Assignment getAdapterAssignment_26() { return cAdapterAssignment_26; }
		
		//STRING
		public RuleCall getAdapterSTRINGTerminalRuleCall_26_0() { return cAdapterSTRINGTerminalRuleCall_26_0; }
		
		//'runner_breakpoint'
		public Keyword getRunner_breakpointKeyword_27() { return cRunner_breakpointKeyword_27; }
		
		//'='
		public Keyword getEqualsSignKeyword_28() { return cEqualsSignKeyword_28; }
		
		//breakpoint=STRING
		public Assignment getBreakpointAssignment_29() { return cBreakpointAssignment_29; }
		
		//STRING
		public RuleCall getBreakpointSTRINGTerminalRuleCall_29_0() { return cBreakpointSTRINGTerminalRuleCall_29_0; }
		
		//'load_command'
		public Keyword getLoad_commandKeyword_30() { return cLoad_commandKeyword_30; }
		
		//'='
		public Keyword getEqualsSignKeyword_31() { return cEqualsSignKeyword_31; }
		
		//load=STRING
		public Assignment getLoadAssignment_32() { return cLoadAssignment_32; }
		
		//STRING
		public RuleCall getLoadSTRINGTerminalRuleCall_32_0() { return cLoadSTRINGTerminalRuleCall_32_0; }
		
		//'execute_command'
		public Keyword getExecute_commandKeyword_33() { return cExecute_commandKeyword_33; }
		
		//'='
		public Keyword getEqualsSignKeyword_34() { return cEqualsSignKeyword_34; }
		
		//exec=STRING
		public Assignment getExecAssignment_35() { return cExecAssignment_35; }
		
		//STRING
		public RuleCall getExecSTRINGTerminalRuleCall_35_0() { return cExecSTRINGTerminalRuleCall_35_0; }
		
		//additionalConfig += (Bool | Line)*
		public Assignment getAdditionalConfigAssignment_36() { return cAdditionalConfigAssignment_36; }
		
		//(Bool | Line)
		public Alternatives getAdditionalConfigAlternatives_36_0() { return cAdditionalConfigAlternatives_36_0; }
		
		//Bool
		public RuleCall getAdditionalConfigBoolParserRuleCall_36_0_0() { return cAdditionalConfigBoolParserRuleCall_36_0_0; }
		
		//Line
		public RuleCall getAdditionalConfigLineParserRuleCall_36_0_1() { return cAdditionalConfigLineParserRuleCall_36_0_1; }
	}
	public class BoolElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.liveprobes.liveagent.Cfg.Bool");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCfgKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cValueBOOLEANParserRuleCall_3_0 = (RuleCall)cValueAssignment_3.eContents().get(0);
		
		//Bool:
		//    'cfg' name=ID '=' value=BOOLEAN
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'cfg' name=ID '=' value=BOOLEAN
		public Group getGroup() { return cGroup; }
		
		//'cfg'
		public Keyword getCfgKeyword_0() { return cCfgKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }
		
		//value=BOOLEAN
		public Assignment getValueAssignment_3() { return cValueAssignment_3; }
		
		//BOOLEAN
		public RuleCall getValueBOOLEANParserRuleCall_3_0() { return cValueBOOLEANParserRuleCall_3_0; }
	}
	public class LineElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.liveprobes.liveagent.Cfg.Line");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCfgKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cValueSTRINGTerminalRuleCall_3_0 = (RuleCall)cValueAssignment_3.eContents().get(0);
		
		//Line:
		//    'cfg' name=ID '=' value=STRING
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'cfg' name=ID '=' value=STRING
		public Group getGroup() { return cGroup; }
		
		//'cfg'
		public Keyword getCfgKeyword_0() { return cCfgKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }
		
		//value=STRING
		public Assignment getValueAssignment_3() { return cValueAssignment_3; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_3_0() { return cValueSTRINGTerminalRuleCall_3_0; }
	}
	public class BOOLEANElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.liveprobes.liveagent.Cfg.BOOLEAN");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cTrueKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cFalseKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//BOOLEAN:
		//    'True' | 'False'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'True' | 'False'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'True'
		public Keyword getTrueKeyword_0() { return cTrueKeyword_0; }
		
		//'False'
		public Keyword getFalseKeyword_1() { return cFalseKeyword_1; }
	}
	
	
	private final AgentConfigElements pAgentConfig;
	private final ConfigurationElements pConfiguration;
	private final BoolElements pBool;
	private final LineElements pLine;
	private final BOOLEANElements pBOOLEAN;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public CfgGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pAgentConfig = new AgentConfigElements();
		this.pConfiguration = new ConfigurationElements();
		this.pBool = new BoolElements();
		this.pLine = new LineElements();
		this.pBOOLEAN = new BOOLEANElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.liveprobes.liveagent.Cfg".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//AgentConfig:
	//    'AgentConfig' '{'
	//    config = Configuration
	//    '}';
	public AgentConfigElements getAgentConfigAccess() {
		return pAgentConfig;
	}
	
	public ParserRule getAgentConfigRule() {
		return getAgentConfigAccess().getRule();
	}
	
	//Configuration:
	//    'Language' '=' language=STRING
	//    'compile' '=' compile=BOOLEAN
	//    'compile_command' '=' command=STRING
	//    'runner_path' '=' path=STRING
	//    'dap_server' '=' dap=STRING
	//    'parser' '=' parser=BOOLEAN
	//    'IO_socket' '=' io=BOOLEAN
	//    'thread_ID' '=' thread=STRING
	//    'adapter_ID' '=' adapter=STRING
	//    'runner_breakpoint' '=' breakpoint=STRING
	//    'load_command' '=' load=STRING
	//    'execute_command' '=' exec=STRING
	//    additionalConfig += (Bool | Line)*
	//;
	public ConfigurationElements getConfigurationAccess() {
		return pConfiguration;
	}
	
	public ParserRule getConfigurationRule() {
		return getConfigurationAccess().getRule();
	}
	
	//Bool:
	//    'cfg' name=ID '=' value=BOOLEAN
	//;
	public BoolElements getBoolAccess() {
		return pBool;
	}
	
	public ParserRule getBoolRule() {
		return getBoolAccess().getRule();
	}
	
	//Line:
	//    'cfg' name=ID '=' value=STRING
	//;
	public LineElements getLineAccess() {
		return pLine;
	}
	
	public ParserRule getLineRule() {
		return getLineAccess().getRule();
	}
	
	//BOOLEAN:
	//    'True' | 'False'
	//;
	public BOOLEANElements getBOOLEANAccess() {
		return pBOOLEAN;
	}
	
	public ParserRule getBOOLEANRule() {
		return getBOOLEANAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}

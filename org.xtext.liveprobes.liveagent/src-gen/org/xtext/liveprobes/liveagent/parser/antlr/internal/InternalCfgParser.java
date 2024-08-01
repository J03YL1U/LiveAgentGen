package org.xtext.liveprobes.liveagent.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.liveprobes.liveagent.services.CfgGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCfgParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AgentConfig'", "'{'", "'}'", "'Language'", "'='", "'compile'", "'compile_command'", "'runner_path'", "'dap_server'", "'parser'", "'IO_socket'", "'thread_ID'", "'adapter_ID'", "'runner_breakpoint'", "'load_command'", "'execute_command'", "'cfg'", "'True'", "'False'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalCfgParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCfgParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCfgParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCfg.g"; }



     	private CfgGrammarAccess grammarAccess;

        public InternalCfgParser(TokenStream input, CfgGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "AgentConfig";
       	}

       	@Override
       	protected CfgGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAgentConfig"
    // InternalCfg.g:64:1: entryRuleAgentConfig returns [EObject current=null] : iv_ruleAgentConfig= ruleAgentConfig EOF ;
    public final EObject entryRuleAgentConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAgentConfig = null;


        try {
            // InternalCfg.g:64:52: (iv_ruleAgentConfig= ruleAgentConfig EOF )
            // InternalCfg.g:65:2: iv_ruleAgentConfig= ruleAgentConfig EOF
            {
             newCompositeNode(grammarAccess.getAgentConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAgentConfig=ruleAgentConfig();

            state._fsp--;

             current =iv_ruleAgentConfig; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAgentConfig"


    // $ANTLR start "ruleAgentConfig"
    // InternalCfg.g:71:1: ruleAgentConfig returns [EObject current=null] : (otherlv_0= 'AgentConfig' otherlv_1= '{' ( (lv_config_2_0= ruleConfiguration ) ) otherlv_3= '}' ) ;
    public final EObject ruleAgentConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_config_2_0 = null;



        	enterRule();

        try {
            // InternalCfg.g:77:2: ( (otherlv_0= 'AgentConfig' otherlv_1= '{' ( (lv_config_2_0= ruleConfiguration ) ) otherlv_3= '}' ) )
            // InternalCfg.g:78:2: (otherlv_0= 'AgentConfig' otherlv_1= '{' ( (lv_config_2_0= ruleConfiguration ) ) otherlv_3= '}' )
            {
            // InternalCfg.g:78:2: (otherlv_0= 'AgentConfig' otherlv_1= '{' ( (lv_config_2_0= ruleConfiguration ) ) otherlv_3= '}' )
            // InternalCfg.g:79:3: otherlv_0= 'AgentConfig' otherlv_1= '{' ( (lv_config_2_0= ruleConfiguration ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAgentConfigAccess().getAgentConfigKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAgentConfigAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCfg.g:87:3: ( (lv_config_2_0= ruleConfiguration ) )
            // InternalCfg.g:88:4: (lv_config_2_0= ruleConfiguration )
            {
            // InternalCfg.g:88:4: (lv_config_2_0= ruleConfiguration )
            // InternalCfg.g:89:5: lv_config_2_0= ruleConfiguration
            {

            					newCompositeNode(grammarAccess.getAgentConfigAccess().getConfigConfigurationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_config_2_0=ruleConfiguration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAgentConfigRule());
            					}
            					set(
            						current,
            						"config",
            						lv_config_2_0,
            						"org.xtext.liveprobes.liveagent.Cfg.Configuration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAgentConfigAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleAgentConfig"


    // $ANTLR start "entryRuleConfiguration"
    // InternalCfg.g:114:1: entryRuleConfiguration returns [EObject current=null] : iv_ruleConfiguration= ruleConfiguration EOF ;
    public final EObject entryRuleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration = null;


        try {
            // InternalCfg.g:114:54: (iv_ruleConfiguration= ruleConfiguration EOF )
            // InternalCfg.g:115:2: iv_ruleConfiguration= ruleConfiguration EOF
            {
             newCompositeNode(grammarAccess.getConfigurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfiguration=ruleConfiguration();

            state._fsp--;

             current =iv_ruleConfiguration; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConfiguration"


    // $ANTLR start "ruleConfiguration"
    // InternalCfg.g:121:1: ruleConfiguration returns [EObject current=null] : (otherlv_0= 'Language' otherlv_1= '=' ( (lv_language_2_0= RULE_STRING ) ) otherlv_3= 'compile' otherlv_4= '=' ( (lv_compile_5_0= ruleBOOLEAN ) ) otherlv_6= 'compile_command' otherlv_7= '=' ( (lv_command_8_0= RULE_STRING ) ) otherlv_9= 'runner_path' otherlv_10= '=' ( (lv_path_11_0= RULE_STRING ) ) otherlv_12= 'dap_server' otherlv_13= '=' ( (lv_dap_14_0= RULE_STRING ) ) otherlv_15= 'parser' otherlv_16= '=' ( (lv_parser_17_0= ruleBOOLEAN ) ) otherlv_18= 'IO_socket' otherlv_19= '=' ( (lv_io_20_0= ruleBOOLEAN ) ) otherlv_21= 'thread_ID' otherlv_22= '=' ( (lv_thread_23_0= RULE_STRING ) ) otherlv_24= 'adapter_ID' otherlv_25= '=' ( (lv_adapter_26_0= RULE_STRING ) ) otherlv_27= 'runner_breakpoint' otherlv_28= '=' ( (lv_breakpoint_29_0= RULE_STRING ) ) otherlv_30= 'load_command' otherlv_31= '=' ( (lv_load_32_0= RULE_STRING ) ) otherlv_33= 'execute_command' otherlv_34= '=' ( (lv_exec_35_0= RULE_STRING ) ) ( ( (lv_additionalConfig_36_1= ruleBool | lv_additionalConfig_36_2= ruleLine ) ) )* ) ;
    public final EObject ruleConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_language_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_command_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_path_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_dap_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token lv_thread_23_0=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token lv_adapter_26_0=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token lv_breakpoint_29_0=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token lv_load_32_0=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token lv_exec_35_0=null;
        AntlrDatatypeRuleToken lv_compile_5_0 = null;

        AntlrDatatypeRuleToken lv_parser_17_0 = null;

        AntlrDatatypeRuleToken lv_io_20_0 = null;

        EObject lv_additionalConfig_36_1 = null;

        EObject lv_additionalConfig_36_2 = null;



        	enterRule();

        try {
            // InternalCfg.g:127:2: ( (otherlv_0= 'Language' otherlv_1= '=' ( (lv_language_2_0= RULE_STRING ) ) otherlv_3= 'compile' otherlv_4= '=' ( (lv_compile_5_0= ruleBOOLEAN ) ) otherlv_6= 'compile_command' otherlv_7= '=' ( (lv_command_8_0= RULE_STRING ) ) otherlv_9= 'runner_path' otherlv_10= '=' ( (lv_path_11_0= RULE_STRING ) ) otherlv_12= 'dap_server' otherlv_13= '=' ( (lv_dap_14_0= RULE_STRING ) ) otherlv_15= 'parser' otherlv_16= '=' ( (lv_parser_17_0= ruleBOOLEAN ) ) otherlv_18= 'IO_socket' otherlv_19= '=' ( (lv_io_20_0= ruleBOOLEAN ) ) otherlv_21= 'thread_ID' otherlv_22= '=' ( (lv_thread_23_0= RULE_STRING ) ) otherlv_24= 'adapter_ID' otherlv_25= '=' ( (lv_adapter_26_0= RULE_STRING ) ) otherlv_27= 'runner_breakpoint' otherlv_28= '=' ( (lv_breakpoint_29_0= RULE_STRING ) ) otherlv_30= 'load_command' otherlv_31= '=' ( (lv_load_32_0= RULE_STRING ) ) otherlv_33= 'execute_command' otherlv_34= '=' ( (lv_exec_35_0= RULE_STRING ) ) ( ( (lv_additionalConfig_36_1= ruleBool | lv_additionalConfig_36_2= ruleLine ) ) )* ) )
            // InternalCfg.g:128:2: (otherlv_0= 'Language' otherlv_1= '=' ( (lv_language_2_0= RULE_STRING ) ) otherlv_3= 'compile' otherlv_4= '=' ( (lv_compile_5_0= ruleBOOLEAN ) ) otherlv_6= 'compile_command' otherlv_7= '=' ( (lv_command_8_0= RULE_STRING ) ) otherlv_9= 'runner_path' otherlv_10= '=' ( (lv_path_11_0= RULE_STRING ) ) otherlv_12= 'dap_server' otherlv_13= '=' ( (lv_dap_14_0= RULE_STRING ) ) otherlv_15= 'parser' otherlv_16= '=' ( (lv_parser_17_0= ruleBOOLEAN ) ) otherlv_18= 'IO_socket' otherlv_19= '=' ( (lv_io_20_0= ruleBOOLEAN ) ) otherlv_21= 'thread_ID' otherlv_22= '=' ( (lv_thread_23_0= RULE_STRING ) ) otherlv_24= 'adapter_ID' otherlv_25= '=' ( (lv_adapter_26_0= RULE_STRING ) ) otherlv_27= 'runner_breakpoint' otherlv_28= '=' ( (lv_breakpoint_29_0= RULE_STRING ) ) otherlv_30= 'load_command' otherlv_31= '=' ( (lv_load_32_0= RULE_STRING ) ) otherlv_33= 'execute_command' otherlv_34= '=' ( (lv_exec_35_0= RULE_STRING ) ) ( ( (lv_additionalConfig_36_1= ruleBool | lv_additionalConfig_36_2= ruleLine ) ) )* )
            {
            // InternalCfg.g:128:2: (otherlv_0= 'Language' otherlv_1= '=' ( (lv_language_2_0= RULE_STRING ) ) otherlv_3= 'compile' otherlv_4= '=' ( (lv_compile_5_0= ruleBOOLEAN ) ) otherlv_6= 'compile_command' otherlv_7= '=' ( (lv_command_8_0= RULE_STRING ) ) otherlv_9= 'runner_path' otherlv_10= '=' ( (lv_path_11_0= RULE_STRING ) ) otherlv_12= 'dap_server' otherlv_13= '=' ( (lv_dap_14_0= RULE_STRING ) ) otherlv_15= 'parser' otherlv_16= '=' ( (lv_parser_17_0= ruleBOOLEAN ) ) otherlv_18= 'IO_socket' otherlv_19= '=' ( (lv_io_20_0= ruleBOOLEAN ) ) otherlv_21= 'thread_ID' otherlv_22= '=' ( (lv_thread_23_0= RULE_STRING ) ) otherlv_24= 'adapter_ID' otherlv_25= '=' ( (lv_adapter_26_0= RULE_STRING ) ) otherlv_27= 'runner_breakpoint' otherlv_28= '=' ( (lv_breakpoint_29_0= RULE_STRING ) ) otherlv_30= 'load_command' otherlv_31= '=' ( (lv_load_32_0= RULE_STRING ) ) otherlv_33= 'execute_command' otherlv_34= '=' ( (lv_exec_35_0= RULE_STRING ) ) ( ( (lv_additionalConfig_36_1= ruleBool | lv_additionalConfig_36_2= ruleLine ) ) )* )
            // InternalCfg.g:129:3: otherlv_0= 'Language' otherlv_1= '=' ( (lv_language_2_0= RULE_STRING ) ) otherlv_3= 'compile' otherlv_4= '=' ( (lv_compile_5_0= ruleBOOLEAN ) ) otherlv_6= 'compile_command' otherlv_7= '=' ( (lv_command_8_0= RULE_STRING ) ) otherlv_9= 'runner_path' otherlv_10= '=' ( (lv_path_11_0= RULE_STRING ) ) otherlv_12= 'dap_server' otherlv_13= '=' ( (lv_dap_14_0= RULE_STRING ) ) otherlv_15= 'parser' otherlv_16= '=' ( (lv_parser_17_0= ruleBOOLEAN ) ) otherlv_18= 'IO_socket' otherlv_19= '=' ( (lv_io_20_0= ruleBOOLEAN ) ) otherlv_21= 'thread_ID' otherlv_22= '=' ( (lv_thread_23_0= RULE_STRING ) ) otherlv_24= 'adapter_ID' otherlv_25= '=' ( (lv_adapter_26_0= RULE_STRING ) ) otherlv_27= 'runner_breakpoint' otherlv_28= '=' ( (lv_breakpoint_29_0= RULE_STRING ) ) otherlv_30= 'load_command' otherlv_31= '=' ( (lv_load_32_0= RULE_STRING ) ) otherlv_33= 'execute_command' otherlv_34= '=' ( (lv_exec_35_0= RULE_STRING ) ) ( ( (lv_additionalConfig_36_1= ruleBool | lv_additionalConfig_36_2= ruleLine ) ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getConfigurationAccess().getLanguageKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getConfigurationAccess().getEqualsSignKeyword_1());
            		
            // InternalCfg.g:137:3: ( (lv_language_2_0= RULE_STRING ) )
            // InternalCfg.g:138:4: (lv_language_2_0= RULE_STRING )
            {
            // InternalCfg.g:138:4: (lv_language_2_0= RULE_STRING )
            // InternalCfg.g:139:5: lv_language_2_0= RULE_STRING
            {
            lv_language_2_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_language_2_0, grammarAccess.getConfigurationAccess().getLanguageSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigurationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"language",
            						lv_language_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getConfigurationAccess().getCompileKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getConfigurationAccess().getEqualsSignKeyword_4());
            		
            // InternalCfg.g:163:3: ( (lv_compile_5_0= ruleBOOLEAN ) )
            // InternalCfg.g:164:4: (lv_compile_5_0= ruleBOOLEAN )
            {
            // InternalCfg.g:164:4: (lv_compile_5_0= ruleBOOLEAN )
            // InternalCfg.g:165:5: lv_compile_5_0= ruleBOOLEAN
            {

            					newCompositeNode(grammarAccess.getConfigurationAccess().getCompileBOOLEANParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_compile_5_0=ruleBOOLEAN();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfigurationRule());
            					}
            					set(
            						current,
            						"compile",
            						lv_compile_5_0,
            						"org.xtext.liveprobes.liveagent.Cfg.BOOLEAN");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getConfigurationAccess().getCompile_commandKeyword_6());
            		
            otherlv_7=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getConfigurationAccess().getEqualsSignKeyword_7());
            		
            // InternalCfg.g:190:3: ( (lv_command_8_0= RULE_STRING ) )
            // InternalCfg.g:191:4: (lv_command_8_0= RULE_STRING )
            {
            // InternalCfg.g:191:4: (lv_command_8_0= RULE_STRING )
            // InternalCfg.g:192:5: lv_command_8_0= RULE_STRING
            {
            lv_command_8_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_command_8_0, grammarAccess.getConfigurationAccess().getCommandSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigurationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"command",
            						lv_command_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_9, grammarAccess.getConfigurationAccess().getRunner_pathKeyword_9());
            		
            otherlv_10=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_10, grammarAccess.getConfigurationAccess().getEqualsSignKeyword_10());
            		
            // InternalCfg.g:216:3: ( (lv_path_11_0= RULE_STRING ) )
            // InternalCfg.g:217:4: (lv_path_11_0= RULE_STRING )
            {
            // InternalCfg.g:217:4: (lv_path_11_0= RULE_STRING )
            // InternalCfg.g:218:5: lv_path_11_0= RULE_STRING
            {
            lv_path_11_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_path_11_0, grammarAccess.getConfigurationAccess().getPathSTRINGTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigurationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_11_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_12=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_12, grammarAccess.getConfigurationAccess().getDap_serverKeyword_12());
            		
            otherlv_13=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_13, grammarAccess.getConfigurationAccess().getEqualsSignKeyword_13());
            		
            // InternalCfg.g:242:3: ( (lv_dap_14_0= RULE_STRING ) )
            // InternalCfg.g:243:4: (lv_dap_14_0= RULE_STRING )
            {
            // InternalCfg.g:243:4: (lv_dap_14_0= RULE_STRING )
            // InternalCfg.g:244:5: lv_dap_14_0= RULE_STRING
            {
            lv_dap_14_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_dap_14_0, grammarAccess.getConfigurationAccess().getDapSTRINGTerminalRuleCall_14_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigurationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dap",
            						lv_dap_14_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_15=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_15, grammarAccess.getConfigurationAccess().getParserKeyword_15());
            		
            otherlv_16=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_16, grammarAccess.getConfigurationAccess().getEqualsSignKeyword_16());
            		
            // InternalCfg.g:268:3: ( (lv_parser_17_0= ruleBOOLEAN ) )
            // InternalCfg.g:269:4: (lv_parser_17_0= ruleBOOLEAN )
            {
            // InternalCfg.g:269:4: (lv_parser_17_0= ruleBOOLEAN )
            // InternalCfg.g:270:5: lv_parser_17_0= ruleBOOLEAN
            {

            					newCompositeNode(grammarAccess.getConfigurationAccess().getParserBOOLEANParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_14);
            lv_parser_17_0=ruleBOOLEAN();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfigurationRule());
            					}
            					set(
            						current,
            						"parser",
            						lv_parser_17_0,
            						"org.xtext.liveprobes.liveagent.Cfg.BOOLEAN");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_18=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_18, grammarAccess.getConfigurationAccess().getIO_socketKeyword_18());
            		
            otherlv_19=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_19, grammarAccess.getConfigurationAccess().getEqualsSignKeyword_19());
            		
            // InternalCfg.g:295:3: ( (lv_io_20_0= ruleBOOLEAN ) )
            // InternalCfg.g:296:4: (lv_io_20_0= ruleBOOLEAN )
            {
            // InternalCfg.g:296:4: (lv_io_20_0= ruleBOOLEAN )
            // InternalCfg.g:297:5: lv_io_20_0= ruleBOOLEAN
            {

            					newCompositeNode(grammarAccess.getConfigurationAccess().getIoBOOLEANParserRuleCall_20_0());
            				
            pushFollow(FOLLOW_15);
            lv_io_20_0=ruleBOOLEAN();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfigurationRule());
            					}
            					set(
            						current,
            						"io",
            						lv_io_20_0,
            						"org.xtext.liveprobes.liveagent.Cfg.BOOLEAN");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_21=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_21, grammarAccess.getConfigurationAccess().getThread_IDKeyword_21());
            		
            otherlv_22=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_22, grammarAccess.getConfigurationAccess().getEqualsSignKeyword_22());
            		
            // InternalCfg.g:322:3: ( (lv_thread_23_0= RULE_STRING ) )
            // InternalCfg.g:323:4: (lv_thread_23_0= RULE_STRING )
            {
            // InternalCfg.g:323:4: (lv_thread_23_0= RULE_STRING )
            // InternalCfg.g:324:5: lv_thread_23_0= RULE_STRING
            {
            lv_thread_23_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_thread_23_0, grammarAccess.getConfigurationAccess().getThreadSTRINGTerminalRuleCall_23_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigurationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"thread",
            						lv_thread_23_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_24=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_24, grammarAccess.getConfigurationAccess().getAdapter_IDKeyword_24());
            		
            otherlv_25=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_25, grammarAccess.getConfigurationAccess().getEqualsSignKeyword_25());
            		
            // InternalCfg.g:348:3: ( (lv_adapter_26_0= RULE_STRING ) )
            // InternalCfg.g:349:4: (lv_adapter_26_0= RULE_STRING )
            {
            // InternalCfg.g:349:4: (lv_adapter_26_0= RULE_STRING )
            // InternalCfg.g:350:5: lv_adapter_26_0= RULE_STRING
            {
            lv_adapter_26_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_adapter_26_0, grammarAccess.getConfigurationAccess().getAdapterSTRINGTerminalRuleCall_26_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigurationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"adapter",
            						lv_adapter_26_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_27=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_27, grammarAccess.getConfigurationAccess().getRunner_breakpointKeyword_27());
            		
            otherlv_28=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_28, grammarAccess.getConfigurationAccess().getEqualsSignKeyword_28());
            		
            // InternalCfg.g:374:3: ( (lv_breakpoint_29_0= RULE_STRING ) )
            // InternalCfg.g:375:4: (lv_breakpoint_29_0= RULE_STRING )
            {
            // InternalCfg.g:375:4: (lv_breakpoint_29_0= RULE_STRING )
            // InternalCfg.g:376:5: lv_breakpoint_29_0= RULE_STRING
            {
            lv_breakpoint_29_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_breakpoint_29_0, grammarAccess.getConfigurationAccess().getBreakpointSTRINGTerminalRuleCall_29_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigurationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"breakpoint",
            						lv_breakpoint_29_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_30=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_30, grammarAccess.getConfigurationAccess().getLoad_commandKeyword_30());
            		
            otherlv_31=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_31, grammarAccess.getConfigurationAccess().getEqualsSignKeyword_31());
            		
            // InternalCfg.g:400:3: ( (lv_load_32_0= RULE_STRING ) )
            // InternalCfg.g:401:4: (lv_load_32_0= RULE_STRING )
            {
            // InternalCfg.g:401:4: (lv_load_32_0= RULE_STRING )
            // InternalCfg.g:402:5: lv_load_32_0= RULE_STRING
            {
            lv_load_32_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_load_32_0, grammarAccess.getConfigurationAccess().getLoadSTRINGTerminalRuleCall_32_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigurationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"load",
            						lv_load_32_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_33=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_33, grammarAccess.getConfigurationAccess().getExecute_commandKeyword_33());
            		
            otherlv_34=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_34, grammarAccess.getConfigurationAccess().getEqualsSignKeyword_34());
            		
            // InternalCfg.g:426:3: ( (lv_exec_35_0= RULE_STRING ) )
            // InternalCfg.g:427:4: (lv_exec_35_0= RULE_STRING )
            {
            // InternalCfg.g:427:4: (lv_exec_35_0= RULE_STRING )
            // InternalCfg.g:428:5: lv_exec_35_0= RULE_STRING
            {
            lv_exec_35_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(lv_exec_35_0, grammarAccess.getConfigurationAccess().getExecSTRINGTerminalRuleCall_35_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigurationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"exec",
            						lv_exec_35_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalCfg.g:444:3: ( ( (lv_additionalConfig_36_1= ruleBool | lv_additionalConfig_36_2= ruleLine ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==27) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCfg.g:445:4: ( (lv_additionalConfig_36_1= ruleBool | lv_additionalConfig_36_2= ruleLine ) )
            	    {
            	    // InternalCfg.g:445:4: ( (lv_additionalConfig_36_1= ruleBool | lv_additionalConfig_36_2= ruleLine ) )
            	    // InternalCfg.g:446:5: (lv_additionalConfig_36_1= ruleBool | lv_additionalConfig_36_2= ruleLine )
            	    {
            	    // InternalCfg.g:446:5: (lv_additionalConfig_36_1= ruleBool | lv_additionalConfig_36_2= ruleLine )
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==27) ) {
            	        int LA1_1 = input.LA(2);

            	        if ( (LA1_1==RULE_ID) ) {
            	            int LA1_2 = input.LA(3);

            	            if ( (LA1_2==15) ) {
            	                int LA1_3 = input.LA(4);

            	                if ( (LA1_3==RULE_STRING) ) {
            	                    alt1=2;
            	                }
            	                else if ( ((LA1_3>=28 && LA1_3<=29)) ) {
            	                    alt1=1;
            	                }
            	                else {
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("", 1, 3, input);

            	                    throw nvae;
            	                }
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 1, 2, input);

            	                throw nvae;
            	            }
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 1, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalCfg.g:447:6: lv_additionalConfig_36_1= ruleBool
            	            {

            	            						newCompositeNode(grammarAccess.getConfigurationAccess().getAdditionalConfigBoolParserRuleCall_36_0_0());
            	            					
            	            pushFollow(FOLLOW_20);
            	            lv_additionalConfig_36_1=ruleBool();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getConfigurationRule());
            	            						}
            	            						add(
            	            							current,
            	            							"additionalConfig",
            	            							lv_additionalConfig_36_1,
            	            							"org.xtext.liveprobes.liveagent.Cfg.Bool");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalCfg.g:463:6: lv_additionalConfig_36_2= ruleLine
            	            {

            	            						newCompositeNode(grammarAccess.getConfigurationAccess().getAdditionalConfigLineParserRuleCall_36_0_1());
            	            					
            	            pushFollow(FOLLOW_20);
            	            lv_additionalConfig_36_2=ruleLine();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getConfigurationRule());
            	            						}
            	            						add(
            	            							current,
            	            							"additionalConfig",
            	            							lv_additionalConfig_36_2,
            	            							"org.xtext.liveprobes.liveagent.Cfg.Line");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


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
    // $ANTLR end "ruleConfiguration"


    // $ANTLR start "entryRuleBool"
    // InternalCfg.g:485:1: entryRuleBool returns [EObject current=null] : iv_ruleBool= ruleBool EOF ;
    public final EObject entryRuleBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBool = null;


        try {
            // InternalCfg.g:485:45: (iv_ruleBool= ruleBool EOF )
            // InternalCfg.g:486:2: iv_ruleBool= ruleBool EOF
            {
             newCompositeNode(grammarAccess.getBoolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBool=ruleBool();

            state._fsp--;

             current =iv_ruleBool; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBool"


    // $ANTLR start "ruleBool"
    // InternalCfg.g:492:1: ruleBool returns [EObject current=null] : (otherlv_0= 'cfg' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleBOOLEAN ) ) ) ;
    public final EObject ruleBool() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalCfg.g:498:2: ( (otherlv_0= 'cfg' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleBOOLEAN ) ) ) )
            // InternalCfg.g:499:2: (otherlv_0= 'cfg' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleBOOLEAN ) ) )
            {
            // InternalCfg.g:499:2: (otherlv_0= 'cfg' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleBOOLEAN ) ) )
            // InternalCfg.g:500:3: otherlv_0= 'cfg' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleBOOLEAN ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getBoolAccess().getCfgKeyword_0());
            		
            // InternalCfg.g:504:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCfg.g:505:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCfg.g:505:4: (lv_name_1_0= RULE_ID )
            // InternalCfg.g:506:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBoolAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoolRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getBoolAccess().getEqualsSignKeyword_2());
            		
            // InternalCfg.g:526:3: ( (lv_value_3_0= ruleBOOLEAN ) )
            // InternalCfg.g:527:4: (lv_value_3_0= ruleBOOLEAN )
            {
            // InternalCfg.g:527:4: (lv_value_3_0= ruleBOOLEAN )
            // InternalCfg.g:528:5: lv_value_3_0= ruleBOOLEAN
            {

            					newCompositeNode(grammarAccess.getBoolAccess().getValueBOOLEANParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleBOOLEAN();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoolRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.xtext.liveprobes.liveagent.Cfg.BOOLEAN");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleBool"


    // $ANTLR start "entryRuleLine"
    // InternalCfg.g:549:1: entryRuleLine returns [EObject current=null] : iv_ruleLine= ruleLine EOF ;
    public final EObject entryRuleLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLine = null;


        try {
            // InternalCfg.g:549:45: (iv_ruleLine= ruleLine EOF )
            // InternalCfg.g:550:2: iv_ruleLine= ruleLine EOF
            {
             newCompositeNode(grammarAccess.getLineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLine=ruleLine();

            state._fsp--;

             current =iv_ruleLine; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLine"


    // $ANTLR start "ruleLine"
    // InternalCfg.g:556:1: ruleLine returns [EObject current=null] : (otherlv_0= 'cfg' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleLine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalCfg.g:562:2: ( (otherlv_0= 'cfg' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ) )
            // InternalCfg.g:563:2: (otherlv_0= 'cfg' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )
            {
            // InternalCfg.g:563:2: (otherlv_0= 'cfg' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )
            // InternalCfg.g:564:3: otherlv_0= 'cfg' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getLineAccess().getCfgKeyword_0());
            		
            // InternalCfg.g:568:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCfg.g:569:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCfg.g:569:4: (lv_name_1_0= RULE_ID )
            // InternalCfg.g:570:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLineAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getLineAccess().getEqualsSignKeyword_2());
            		
            // InternalCfg.g:590:3: ( (lv_value_3_0= RULE_STRING ) )
            // InternalCfg.g:591:4: (lv_value_3_0= RULE_STRING )
            {
            // InternalCfg.g:591:4: (lv_value_3_0= RULE_STRING )
            // InternalCfg.g:592:5: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getLineAccess().getValueSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleLine"


    // $ANTLR start "entryRuleBOOLEAN"
    // InternalCfg.g:612:1: entryRuleBOOLEAN returns [String current=null] : iv_ruleBOOLEAN= ruleBOOLEAN EOF ;
    public final String entryRuleBOOLEAN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOLEAN = null;


        try {
            // InternalCfg.g:612:47: (iv_ruleBOOLEAN= ruleBOOLEAN EOF )
            // InternalCfg.g:613:2: iv_ruleBOOLEAN= ruleBOOLEAN EOF
            {
             newCompositeNode(grammarAccess.getBOOLEANRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBOOLEAN=ruleBOOLEAN();

            state._fsp--;

             current =iv_ruleBOOLEAN.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBOOLEAN"


    // $ANTLR start "ruleBOOLEAN"
    // InternalCfg.g:619:1: ruleBOOLEAN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'True' | kw= 'False' ) ;
    public final AntlrDatatypeRuleToken ruleBOOLEAN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCfg.g:625:2: ( (kw= 'True' | kw= 'False' ) )
            // InternalCfg.g:626:2: (kw= 'True' | kw= 'False' )
            {
            // InternalCfg.g:626:2: (kw= 'True' | kw= 'False' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==28) ) {
                alt3=1;
            }
            else if ( (LA3_0==29) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCfg.g:627:3: kw= 'True'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBOOLEANAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCfg.g:633:3: kw= 'False'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBOOLEANAccess().getFalseKeyword_1());
                    		

                    }
                    break;

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
    // $ANTLR end "ruleBOOLEAN"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});

}
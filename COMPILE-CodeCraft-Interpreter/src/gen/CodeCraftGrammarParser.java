// Generated from C:\Users\LorddMichael\git\CC\New folder\New folder\CodeCraft-Interpreter\COMPILE-CodeCraft-Interpreter\src\gen\CodeCraftGrammar.g4 by ANTLR 4.1

package gen;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CodeCraftGrammarParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRINT=1, PRINTLN=2, ABSOLUTE=3, DARKNESS=4, MINE=5, CHOKE=6, WETHER=7, 
		OTHERWISE=8, UNTIL=9, EXECUTE=10, AS=11, REPLY=12, NULL=13, INT=14, CHAR=15, 
		STRING=16, FLOAT=17, BOOLEAN=18, LPAREN=19, RPAREN=20, LBRACE=21, RBRACE=22, 
		SEMI=23, COMMA=24, ASSIGN=25, GT=26, LT=27, BANG=28, EQUAL=29, LE=30, 
		GE=31, NOTEQUAL=32, AND=33, OR=34, ADD=35, SUB=36, MUL=37, DIV=38, MOD=39, 
		IntegerLiteral=40, FloatingPointLiteral=41, CharacterLiteral=42, StringLiteral=43, 
		BooleanLiteral=44, ID=45, WS=46, COMMENT=47, LINE_COMMENT=48;
	public static final String[] tokenNames = {
		"<INVALID>", "'print'", "'println'", "'absolute'", "'darkness'", "'mine'", 
		"'choke'", "'wether'", "'otherwise'", "'until'", "'execute'", "'as'", 
		"'reply'", "'NULL'", "'int'", "'char'", "'string'", "'float'", "'boolean'", 
		"'('", "')'", "'{'", "'}'", "';'", "','", "'='", "'>'", "'<'", "'!'", 
		"'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'+'", "'-'", "'*'", "'/'", 
		"'%'", "IntegerLiteral", "FloatingPointLiteral", "CharacterLiteral", "StringLiteral", 
		"BooleanLiteral", "ID", "WS", "COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_program = 0, RULE_constantStatement = 1, RULE_variableDeclaration = 2, 
		RULE_dataType = 3, RULE_functionDeclaration = 4, RULE_returnType = 5, 
		RULE_parameterList = 6, RULE_parameter = 7, RULE_block = 8, RULE_mainFunction = 9, 
		RULE_statement = 10, RULE_assignmentStatement = 11, RULE_functionCallStatement = 12, 
		RULE_actualParameters = 13, RULE_ifStatement = 14, RULE_condition = 15, 
		RULE_whileStatement = 16, RULE_doWhileStatement = 17, RULE_forStatement = 18, 
		RULE_returnStatement = 19, RULE_expression = 20, RULE_numExpression = 21, 
		RULE_numTerm = 22, RULE_numFactor = 23, RULE_booleanExpression = 24, RULE_relationalOperator = 25, 
		RULE_booleanLogical = 26, RULE_booleanTerm = 27, RULE_booleanFactor = 28;
	public static final String[] ruleNames = {
		"program", "constantStatement", "variableDeclaration", "dataType", "functionDeclaration", 
		"returnType", "parameterList", "parameter", "block", "mainFunction", "statement", 
		"assignmentStatement", "functionCallStatement", "actualParameters", "ifStatement", 
		"condition", "whileStatement", "doWhileStatement", "forStatement", "returnStatement", 
		"expression", "numExpression", "numTerm", "numFactor", "booleanExpression", 
		"relationalOperator", "booleanLogical", "booleanTerm", "booleanFactor"
	};

	@Override
	public String getGrammarFileName() { return "CodeCraftGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public CodeCraftGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public TerminalNode EOF() { return getToken(CodeCraftGrammarParser.EOF, 0); }
		public ConstantStatementContext constantStatement(int i) {
			return getRuleContext(ConstantStatementContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public List<ConstantStatementContext> constantStatement() {
			return getRuleContexts(ConstantStatementContext.class);
		}
		public MainFunctionContext mainFunction() {
			return getRuleContext(MainFunctionContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABSOLUTE) {
				{
				{
				setState(58); constantStatement();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64); mainFunction();
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DARKNESS) | (1L << INT) | (1L << CHAR) | (1L << STRING) | (1L << FLOAT) | (1L << BOOLEAN))) != 0)) {
				{
				{
				setState(65); functionDeclaration();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantStatementContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(CodeCraftGrammarParser.ASSIGN, 0); }
		public TerminalNode ABSOLUTE() { return getToken(CodeCraftGrammarParser.ABSOLUTE, 0); }
		public TerminalNode SEMI() { return getToken(CodeCraftGrammarParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ConstantStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterConstantStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitConstantStatement(this);
		}
	}

	public final ConstantStatementContext constantStatement() throws RecognitionException {
		ConstantStatementContext _localctx = new ConstantStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_constantStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); match(ABSOLUTE);
			setState(74); variableDeclaration();
			setState(75); match(ASSIGN);
			setState(76); expression();
			setState(77); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CodeCraftGrammarParser.ID, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); dataType();
			setState(80); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(CodeCraftGrammarParser.BOOLEAN, 0); }
		public TerminalNode FLOAT() { return getToken(CodeCraftGrammarParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(CodeCraftGrammarParser.INT, 0); }
		public TerminalNode STRING() { return getToken(CodeCraftGrammarParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(CodeCraftGrammarParser.CHAR, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitDataType(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << STRING) | (1L << FLOAT) | (1L << BOOLEAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CodeCraftGrammarParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84); returnType();
			setState(85); match(ID);
			setState(86); parameterList();
			setState(87); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnTypeContext extends ParserRuleContext {
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
	 
		public ReturnTypeContext() { }
		public void copyFrom(ReturnTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnDarknessContext extends ReturnTypeContext {
		public TerminalNode DARKNESS() { return getToken(CodeCraftGrammarParser.DARKNESS, 0); }
		public ReturnDarknessContext(ReturnTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterReturnDarkness(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitReturnDarkness(this);
		}
	}
	public static class ReturnDataTypeContext extends ReturnTypeContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ReturnDataTypeContext(ReturnTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterReturnDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitReturnDataType(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_returnType);
		try {
			setState(91);
			switch (_input.LA(1)) {
			case INT:
			case CHAR:
			case STRING:
			case FLOAT:
			case BOOLEAN:
				_localctx = new ReturnDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(89); dataType();
				}
				break;
			case DARKNESS:
				_localctx = new ReturnDarknessContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(90); match(DARKNESS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(CodeCraftGrammarParser.COMMA); }
		public TerminalNode RPAREN() { return getToken(CodeCraftGrammarParser.RPAREN, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public TerminalNode LPAREN() { return getToken(CodeCraftGrammarParser.LPAREN, 0); }
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(CodeCraftGrammarParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); match(LPAREN);
			setState(95);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << STRING) | (1L << FLOAT) | (1L << BOOLEAN))) != 0)) {
				{
				setState(94); parameter();
				}
			}

			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(97); match(COMMA);
				setState(98); parameter();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CodeCraftGrammarParser.ID, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); dataType();
			setState(107); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode LBRACE() { return getToken(CodeCraftGrammarParser.LBRACE, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(CodeCraftGrammarParser.RBRACE, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109); match(LBRACE);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << PRINTLN) | (1L << CHOKE) | (1L << WETHER) | (1L << UNTIL) | (1L << EXECUTE) | (1L << AS) | (1L << REPLY) | (1L << INT) | (1L << CHAR) | (1L << STRING) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << LBRACE) | (1L << ID))) != 0)) {
				{
				{
				setState(110); statement();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainFunctionContext extends ParserRuleContext {
		public TerminalNode DARKNESS() { return getToken(CodeCraftGrammarParser.DARKNESS, 0); }
		public TerminalNode MINE() { return getToken(CodeCraftGrammarParser.MINE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public MainFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterMainFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitMainFunction(this);
		}
	}

	public final MainFunctionContext mainFunction() throws RecognitionException {
		MainFunctionContext _localctx = new MainFunctionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mainFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); match(DARKNESS);
			setState(119); match(MINE);
			setState(120); parameterList();
			setState(121); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignContext extends StatementContext {
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CodeCraftGrammarParser.SEMI, 0); }
		public AssignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitAssign(this);
		}
	}
	public static class ChokeContext extends StatementContext {
		public TerminalNode CHOKE() { return getToken(CodeCraftGrammarParser.CHOKE, 0); }
		public TerminalNode SEMI() { return getToken(CodeCraftGrammarParser.SEMI, 0); }
		public ChokeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterChoke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitChoke(this);
		}
	}
	public static class ForContext extends StatementContext {
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ForContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitFor(this);
		}
	}
	public static class IfContext extends StatementContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitIf(this);
		}
	}
	public static class ReturnContext extends StatementContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ReturnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitReturn(this);
		}
	}
	public static class BlockStatementContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitBlockStatement(this);
		}
	}
	public static class VarDecContext extends StatementContext {
		public TerminalNode SEMI() { return getToken(CodeCraftGrammarParser.SEMI, 0); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VarDecContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterVarDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitVarDec(this);
		}
	}
	public static class FuncCallContext extends StatementContext {
		public FunctionCallStatementContext functionCallStatement() {
			return getRuleContext(FunctionCallStatementContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CodeCraftGrammarParser.SEMI, 0); }
		public FuncCallContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitFuncCall(this);
		}
	}
	public static class DowhileContext extends StatementContext {
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public DowhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterDowhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitDowhile(this);
		}
	}
	public static class WhileContext extends StatementContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public WhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitWhile(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		try {
			setState(140);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new BlockStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(123); block();
				}
				break;

			case 2:
				_localctx = new VarDecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(124); variableDeclaration();
				setState(125); match(SEMI);
				}
				break;

			case 3:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(127); assignmentStatement();
				setState(128); match(SEMI);
				}
				break;

			case 4:
				_localctx = new FuncCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(130); functionCallStatement();
				setState(131); match(SEMI);
				}
				break;

			case 5:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(133); ifStatement();
				}
				break;

			case 6:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(134); whileStatement();
				}
				break;

			case 7:
				_localctx = new DowhileContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(135); doWhileStatement();
				}
				break;

			case 8:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(136); forStatement();
				}
				break;

			case 9:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(137); returnStatement();
				}
				break;

			case 10:
				_localctx = new ChokeContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(138); match(CHOKE);
				setState(139); match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentStatementContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(CodeCraftGrammarParser.ASSIGN, 0); }
		public TerminalNode ID() { return getToken(CodeCraftGrammarParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitAssignmentStatement(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); match(ID);
			setState(143); match(ASSIGN);
			setState(144); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallStatementContext extends ParserRuleContext {
		public FunctionCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallStatement; }
	 
		public FunctionCallStatementContext() { }
		public void copyFrom(FunctionCallStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncCallIDContext extends FunctionCallStatementContext {
		public ActualParametersContext actualParameters() {
			return getRuleContext(ActualParametersContext.class,0);
		}
		public TerminalNode ID() { return getToken(CodeCraftGrammarParser.ID, 0); }
		public FuncCallIDContext(FunctionCallStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterFuncCallID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitFuncCallID(this);
		}
	}
	public static class FuncCallPrintlnContext extends FunctionCallStatementContext {
		public ActualParametersContext actualParameters() {
			return getRuleContext(ActualParametersContext.class,0);
		}
		public TerminalNode PRINTLN() { return getToken(CodeCraftGrammarParser.PRINTLN, 0); }
		public FuncCallPrintlnContext(FunctionCallStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterFuncCallPrintln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitFuncCallPrintln(this);
		}
	}
	public static class FuncCallPrintContext extends FunctionCallStatementContext {
		public TerminalNode PRINT() { return getToken(CodeCraftGrammarParser.PRINT, 0); }
		public ActualParametersContext actualParameters() {
			return getRuleContext(ActualParametersContext.class,0);
		}
		public FuncCallPrintContext(FunctionCallStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterFuncCallPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitFuncCallPrint(this);
		}
	}

	public final FunctionCallStatementContext functionCallStatement() throws RecognitionException {
		FunctionCallStatementContext _localctx = new FunctionCallStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionCallStatement);
		try {
			setState(152);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new FuncCallIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(146); match(ID);
				setState(147); actualParameters();
				}
				break;
			case PRINT:
				_localctx = new FuncCallPrintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(148); match(PRINT);
				setState(149); actualParameters();
				}
				break;
			case PRINTLN:
				_localctx = new FuncCallPrintlnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(150); match(PRINTLN);
				setState(151); actualParameters();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActualParametersContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CodeCraftGrammarParser.COMMA); }
		public TerminalNode RPAREN() { return getToken(CodeCraftGrammarParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode LPAREN() { return getToken(CodeCraftGrammarParser.LPAREN, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(CodeCraftGrammarParser.COMMA, i);
		}
		public ActualParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterActualParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitActualParameters(this);
		}
	}

	public final ActualParametersContext actualParameters() throws RecognitionException {
		ActualParametersContext _localctx = new ActualParametersContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_actualParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); match(LPAREN);
			setState(156);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << PRINTLN) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << ID))) != 0)) {
				{
				setState(155); expression();
				}
			}

			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(158); match(COMMA);
				setState(159); expression();
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	 
		public IfStatementContext() { }
		public void copyFrom(IfStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfonlyContext extends IfStatementContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode WETHER() { return getToken(CodeCraftGrammarParser.WETHER, 0); }
		public IfonlyContext(IfStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterIfonly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitIfonly(this);
		}
	}
	public static class IfelseContext extends IfStatementContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode OTHERWISE() { return getToken(CodeCraftGrammarParser.OTHERWISE, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public TerminalNode WETHER() { return getToken(CodeCraftGrammarParser.WETHER, 0); }
		public IfelseContext(IfStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterIfelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitIfelse(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifStatement);
		try {
			setState(177);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new IfelseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(167); match(WETHER);
				setState(168); condition();
				setState(169); block();
				setState(170); match(OTHERWISE);
				setState(171); block();
				}
				break;

			case 2:
				_localctx = new IfonlyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(173); match(WETHER);
				setState(174); condition();
				setState(175); block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(CodeCraftGrammarParser.RPAREN, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CodeCraftGrammarParser.LPAREN, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179); match(LPAREN);
			setState(180); booleanExpression();
			setState(181); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(CodeCraftGrammarParser.UNTIL, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); match(UNTIL);
			setState(184); condition();
			setState(185); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileStatementContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode EXECUTE() { return getToken(CodeCraftGrammarParser.EXECUTE, 0); }
		public TerminalNode SEMI() { return getToken(CodeCraftGrammarParser.SEMI, 0); }
		public TerminalNode UNTIL() { return getToken(CodeCraftGrammarParser.UNTIL, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitDoWhileStatement(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187); match(EXECUTE);
			setState(188); block();
			setState(189); match(UNTIL);
			setState(190); condition();
			setState(191); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(CodeCraftGrammarParser.AS, 0); }
		public List<AssignmentStatementContext> assignmentStatement() {
			return getRuleContexts(AssignmentStatementContext.class);
		}
		public List<TerminalNode> SEMI() { return getTokens(CodeCraftGrammarParser.SEMI); }
		public TerminalNode RPAREN() { return getToken(CodeCraftGrammarParser.RPAREN, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement(int i) {
			return getRuleContext(AssignmentStatementContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI(int i) {
			return getToken(CodeCraftGrammarParser.SEMI, i);
		}
		public TerminalNode LPAREN() { return getToken(CodeCraftGrammarParser.LPAREN, 0); }
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193); match(AS);
			setState(194); match(LPAREN);
			setState(195); assignmentStatement();
			setState(196); match(SEMI);
			setState(197); booleanExpression();
			setState(198); match(SEMI);
			setState(199); assignmentStatement();
			setState(200); match(RPAREN);
			setState(201); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(CodeCraftGrammarParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode REPLY() { return getToken(CodeCraftGrammarParser.REPLY, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203); match(REPLY);
			setState(204); expression();
			setState(205); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringExprContext extends ExpressionContext {
		public TerminalNode StringLiteral() { return getToken(CodeCraftGrammarParser.StringLiteral, 0); }
		public StringExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterStringExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitStringExpr(this);
		}
	}
	public static class NumExprContext extends ExpressionContext {
		public NumExpressionContext numExpression() {
			return getRuleContext(NumExpressionContext.class,0);
		}
		public NumExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterNumExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitNumExpr(this);
		}
	}
	public static class FuncCallExprContext extends ExpressionContext {
		public FunctionCallStatementContext functionCallStatement() {
			return getRuleContext(FunctionCallStatementContext.class,0);
		}
		public FuncCallExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterFuncCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitFuncCallExpr(this);
		}
	}
	public static class IdExprContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(CodeCraftGrammarParser.ID, 0); }
		public IdExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitIdExpr(this);
		}
	}
	public static class NullExprContext extends ExpressionContext {
		public TerminalNode NULL() { return getToken(CodeCraftGrammarParser.NULL, 0); }
		public NullExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterNullExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitNullExpr(this);
		}
	}
	public static class BoolExprContext extends ExpressionContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public BoolExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitBoolExpr(this);
		}
	}
	public static class CharExprContext extends ExpressionContext {
		public TerminalNode CharacterLiteral() { return getToken(CodeCraftGrammarParser.CharacterLiteral, 0); }
		public CharExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterCharExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitCharExpr(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expression);
		try {
			setState(214);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new StringExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(207); match(StringLiteral);
				}
				break;

			case 2:
				_localctx = new CharExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(208); match(CharacterLiteral);
				}
				break;

			case 3:
				_localctx = new NumExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(209); numExpression();
				}
				break;

			case 4:
				_localctx = new BoolExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(210); booleanExpression();
				}
				break;

			case 5:
				_localctx = new FuncCallExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(211); functionCallStatement();
				}
				break;

			case 6:
				_localctx = new IdExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(212); match(ID);
				}
				break;

			case 7:
				_localctx = new NullExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(213); match(NULL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumExpressionContext extends ParserRuleContext {
		public NumExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numExpression; }
	 
		public NumExpressionContext() { }
		public void copyFrom(NumExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubContext extends NumExpressionContext {
		public NumExpressionContext numExpression() {
			return getRuleContext(NumExpressionContext.class,0);
		}
		public NumTermContext numTerm() {
			return getRuleContext(NumTermContext.class,0);
		}
		public TerminalNode SUB() { return getToken(CodeCraftGrammarParser.SUB, 0); }
		public SubContext(NumExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitSub(this);
		}
	}
	public static class TermContext extends NumExpressionContext {
		public NumTermContext numTerm() {
			return getRuleContext(NumTermContext.class,0);
		}
		public TermContext(NumExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitTerm(this);
		}
	}
	public static class AddContext extends NumExpressionContext {
		public NumExpressionContext numExpression() {
			return getRuleContext(NumExpressionContext.class,0);
		}
		public NumTermContext numTerm() {
			return getRuleContext(NumTermContext.class,0);
		}
		public TerminalNode ADD() { return getToken(CodeCraftGrammarParser.ADD, 0); }
		public AddContext(NumExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitAdd(this);
		}
	}

	public final NumExpressionContext numExpression() throws RecognitionException {
		NumExpressionContext _localctx = new NumExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_numExpression);
		try {
			setState(225);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new TermContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(216); numTerm();
				}
				break;

			case 2:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(217); numTerm();
				setState(218); match(ADD);
				setState(219); numExpression();
				}
				break;

			case 3:
				_localctx = new SubContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(221); numTerm();
				setState(222); match(SUB);
				setState(223); numExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumTermContext extends ParserRuleContext {
		public NumTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numTerm; }
	 
		public NumTermContext() { }
		public void copyFrom(NumTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ModContext extends NumTermContext {
		public NumFactorContext numFactor() {
			return getRuleContext(NumFactorContext.class,0);
		}
		public NumTermContext numTerm() {
			return getRuleContext(NumTermContext.class,0);
		}
		public TerminalNode MOD() { return getToken(CodeCraftGrammarParser.MOD, 0); }
		public ModContext(NumTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitMod(this);
		}
	}
	public static class DivContext extends NumTermContext {
		public TerminalNode DIV() { return getToken(CodeCraftGrammarParser.DIV, 0); }
		public NumFactorContext numFactor() {
			return getRuleContext(NumFactorContext.class,0);
		}
		public NumTermContext numTerm() {
			return getRuleContext(NumTermContext.class,0);
		}
		public DivContext(NumTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitDiv(this);
		}
	}
	public static class FactorContext extends NumTermContext {
		public NumFactorContext numFactor() {
			return getRuleContext(NumFactorContext.class,0);
		}
		public FactorContext(NumTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitFactor(this);
		}
	}
	public static class MulContext extends NumTermContext {
		public TerminalNode MUL() { return getToken(CodeCraftGrammarParser.MUL, 0); }
		public NumFactorContext numFactor() {
			return getRuleContext(NumFactorContext.class,0);
		}
		public NumTermContext numTerm() {
			return getRuleContext(NumTermContext.class,0);
		}
		public MulContext(NumTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitMul(this);
		}
	}

	public final NumTermContext numTerm() throws RecognitionException {
		NumTermContext _localctx = new NumTermContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_numTerm);
		try {
			setState(240);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new FactorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(227); numFactor();
				}
				break;

			case 2:
				_localctx = new MulContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(228); numFactor();
				setState(229); match(MUL);
				setState(230); numTerm();
				}
				break;

			case 3:
				_localctx = new DivContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(232); numFactor();
				setState(233); match(DIV);
				setState(234); numTerm();
				}
				break;

			case 4:
				_localctx = new ModContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(236); numFactor();
				setState(237); match(MOD);
				setState(238); numTerm();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumFactorContext extends ParserRuleContext {
		public NumFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numFactor; }
	 
		public NumFactorContext() { }
		public void copyFrom(NumFactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumVarContext extends NumFactorContext {
		public TerminalNode ID() { return getToken(CodeCraftGrammarParser.ID, 0); }
		public NumVarContext(NumFactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterNumVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitNumVar(this);
		}
	}
	public static class FactorIntContext extends NumFactorContext {
		public TerminalNode IntegerLiteral() { return getToken(CodeCraftGrammarParser.IntegerLiteral, 0); }
		public FactorIntContext(NumFactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterFactorInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitFactorInt(this);
		}
	}
	public static class ParensContext extends NumFactorContext {
		public TerminalNode RPAREN() { return getToken(CodeCraftGrammarParser.RPAREN, 0); }
		public NumExpressionContext numExpression() {
			return getRuleContext(NumExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CodeCraftGrammarParser.LPAREN, 0); }
		public ParensContext(NumFactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitParens(this);
		}
	}
	public static class FactorFloatContext extends NumFactorContext {
		public TerminalNode FloatingPointLiteral() { return getToken(CodeCraftGrammarParser.FloatingPointLiteral, 0); }
		public FactorFloatContext(NumFactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterFactorFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitFactorFloat(this);
		}
	}
	public static class FuncNumExprContext extends NumFactorContext {
		public FunctionCallStatementContext functionCallStatement() {
			return getRuleContext(FunctionCallStatementContext.class,0);
		}
		public FuncNumExprContext(NumFactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterFuncNumExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitFuncNumExpr(this);
		}
	}

	public final NumFactorContext numFactor() throws RecognitionException {
		NumFactorContext _localctx = new NumFactorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_numFactor);
		try {
			setState(250);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new ParensContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(242); match(LPAREN);
				setState(243); numExpression();
				setState(244); match(RPAREN);
				}
				break;

			case 2:
				_localctx = new FactorIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(246); match(IntegerLiteral);
				}
				break;

			case 3:
				_localctx = new FactorFloatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(247); match(FloatingPointLiteral);
				}
				break;

			case 4:
				_localctx = new FuncNumExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(248); functionCallStatement();
				}
				break;

			case 5:
				_localctx = new NumVarContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(249); match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalContext extends BooleanExpressionContext {
		public BooleanLogicalContext booleanLogical() {
			return getRuleContext(BooleanLogicalContext.class,0);
		}
		public LogicalContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitLogical(this);
		}
	}
	public static class RelationalContext extends BooleanExpressionContext {
		public RelationalOperatorContext relationalOperator() {
			return getRuleContext(RelationalOperatorContext.class,0);
		}
		public List<NumExpressionContext> numExpression() {
			return getRuleContexts(NumExpressionContext.class);
		}
		public NumExpressionContext numExpression(int i) {
			return getRuleContext(NumExpressionContext.class,i);
		}
		public RelationalContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterRelational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitRelational(this);
		}
	}
	public static class EqualContext extends BooleanExpressionContext {
		public BooleanLogicalContext booleanLogical() {
			return getRuleContext(BooleanLogicalContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(CodeCraftGrammarParser.EQUAL, 0); }
		public EqualContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitEqual(this);
		}
	}
	public static class NotequalContext extends BooleanExpressionContext {
		public BooleanLogicalContext booleanLogical() {
			return getRuleContext(BooleanLogicalContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode NOTEQUAL() { return getToken(CodeCraftGrammarParser.NOTEQUAL, 0); }
		public NotequalContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterNotequal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitNotequal(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_booleanExpression);
		try {
			setState(265);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new RelationalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(252); numExpression();
				setState(253); relationalOperator();
				setState(254); numExpression();
				}
				break;

			case 2:
				_localctx = new EqualContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(256); booleanLogical();
				setState(257); match(EQUAL);
				setState(258); booleanExpression();
				}
				break;

			case 3:
				_localctx = new NotequalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(260); booleanLogical();
				setState(261); match(NOTEQUAL);
				setState(262); booleanExpression();
				}
				break;

			case 4:
				_localctx = new LogicalContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(264); booleanLogical();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalOperatorContext extends ParserRuleContext {
		public RelationalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOperator; }
	 
		public RelationalOperatorContext() { }
		public void copyFrom(RelationalOperatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OpGreaterequalContext extends RelationalOperatorContext {
		public TerminalNode GE() { return getToken(CodeCraftGrammarParser.GE, 0); }
		public OpGreaterequalContext(RelationalOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterOpGreaterequal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitOpGreaterequal(this);
		}
	}
	public static class OpGreaterContext extends RelationalOperatorContext {
		public TerminalNode GT() { return getToken(CodeCraftGrammarParser.GT, 0); }
		public OpGreaterContext(RelationalOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterOpGreater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitOpGreater(this);
		}
	}
	public static class OpLessContext extends RelationalOperatorContext {
		public TerminalNode LT() { return getToken(CodeCraftGrammarParser.LT, 0); }
		public OpLessContext(RelationalOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterOpLess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitOpLess(this);
		}
	}
	public static class OpLessequalContext extends RelationalOperatorContext {
		public TerminalNode LE() { return getToken(CodeCraftGrammarParser.LE, 0); }
		public OpLessequalContext(RelationalOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterOpLessequal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitOpLessequal(this);
		}
	}
	public static class OpEqualContext extends RelationalOperatorContext {
		public TerminalNode EQUAL() { return getToken(CodeCraftGrammarParser.EQUAL, 0); }
		public OpEqualContext(RelationalOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterOpEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitOpEqual(this);
		}
	}
	public static class OpNotequalContext extends RelationalOperatorContext {
		public TerminalNode NOTEQUAL() { return getToken(CodeCraftGrammarParser.NOTEQUAL, 0); }
		public OpNotequalContext(RelationalOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterOpNotequal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitOpNotequal(this);
		}
	}

	public final RelationalOperatorContext relationalOperator() throws RecognitionException {
		RelationalOperatorContext _localctx = new RelationalOperatorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_relationalOperator);
		try {
			setState(273);
			switch (_input.LA(1)) {
			case EQUAL:
				_localctx = new OpEqualContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(267); match(EQUAL);
				}
				break;
			case NOTEQUAL:
				_localctx = new OpNotequalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(268); match(NOTEQUAL);
				}
				break;
			case GE:
				_localctx = new OpGreaterequalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(269); match(GE);
				}
				break;
			case LE:
				_localctx = new OpLessequalContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(270); match(LE);
				}
				break;
			case GT:
				_localctx = new OpGreaterContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(271); match(GT);
				}
				break;
			case LT:
				_localctx = new OpLessContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(272); match(LT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanLogicalContext extends ParserRuleContext {
		public BooleanLogicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLogical; }
	 
		public BooleanLogicalContext() { }
		public void copyFrom(BooleanLogicalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolTermContext extends BooleanLogicalContext {
		public BooleanTermContext booleanTerm() {
			return getRuleContext(BooleanTermContext.class,0);
		}
		public BoolTermContext(BooleanLogicalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterBoolTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitBoolTerm(this);
		}
	}
	public static class OrContext extends BooleanLogicalContext {
		public BooleanLogicalContext booleanLogical() {
			return getRuleContext(BooleanLogicalContext.class,0);
		}
		public TerminalNode OR() { return getToken(CodeCraftGrammarParser.OR, 0); }
		public BooleanTermContext booleanTerm() {
			return getRuleContext(BooleanTermContext.class,0);
		}
		public OrContext(BooleanLogicalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitOr(this);
		}
	}

	public final BooleanLogicalContext booleanLogical() throws RecognitionException {
		BooleanLogicalContext _localctx = new BooleanLogicalContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_booleanLogical);
		try {
			setState(280);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new OrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(275); booleanTerm();
				setState(276); match(OR);
				setState(277); booleanLogical();
				}
				break;

			case 2:
				_localctx = new BoolTermContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(279); booleanTerm();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanTermContext extends ParserRuleContext {
		public BooleanTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanTerm; }
	 
		public BooleanTermContext() { }
		public void copyFrom(BooleanTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolFactorContext extends BooleanTermContext {
		public BooleanFactorContext booleanFactor() {
			return getRuleContext(BooleanFactorContext.class,0);
		}
		public BoolFactorContext(BooleanTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterBoolFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitBoolFactor(this);
		}
	}
	public static class AndContext extends BooleanTermContext {
		public BooleanFactorContext booleanFactor() {
			return getRuleContext(BooleanFactorContext.class,0);
		}
		public TerminalNode AND() { return getToken(CodeCraftGrammarParser.AND, 0); }
		public BooleanTermContext booleanTerm() {
			return getRuleContext(BooleanTermContext.class,0);
		}
		public AndContext(BooleanTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitAnd(this);
		}
	}

	public final BooleanTermContext booleanTerm() throws RecognitionException {
		BooleanTermContext _localctx = new BooleanTermContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_booleanTerm);
		try {
			setState(287);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new AndContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(282); booleanFactor();
				setState(283); match(AND);
				setState(284); booleanTerm();
				}
				break;

			case 2:
				_localctx = new BoolFactorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(286); booleanFactor();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanFactorContext extends ParserRuleContext {
		public BooleanFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanFactor; }
	 
		public BooleanFactorContext() { }
		public void copyFrom(BooleanFactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolParenContext extends BooleanFactorContext {
		public TerminalNode RPAREN() { return getToken(CodeCraftGrammarParser.RPAREN, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CodeCraftGrammarParser.LPAREN, 0); }
		public BoolParenContext(BooleanFactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterBoolParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitBoolParen(this);
		}
	}
	public static class BoolVarContext extends BooleanFactorContext {
		public TerminalNode ID() { return getToken(CodeCraftGrammarParser.ID, 0); }
		public BoolVarContext(BooleanFactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterBoolVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitBoolVar(this);
		}
	}
	public static class BoolContext extends BooleanFactorContext {
		public TerminalNode BooleanLiteral() { return getToken(CodeCraftGrammarParser.BooleanLiteral, 0); }
		public BoolContext(BooleanFactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitBool(this);
		}
	}
	public static class BangContext extends BooleanFactorContext {
		public TerminalNode BANG() { return getToken(CodeCraftGrammarParser.BANG, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public BangContext(BooleanFactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterBang(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitBang(this);
		}
	}

	public final BooleanFactorContext booleanFactor() throws RecognitionException {
		BooleanFactorContext _localctx = new BooleanFactorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_booleanFactor);
		try {
			setState(297);
			switch (_input.LA(1)) {
			case LPAREN:
				_localctx = new BoolParenContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(289); match(LPAREN);
				setState(290); booleanExpression();
				setState(291); match(RPAREN);
				}
				break;
			case BANG:
				_localctx = new BangContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(293); match(BANG);
				setState(294); booleanExpression();
				}
				break;
			case BooleanLiteral:
				_localctx = new BoolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(295); match(BooleanLiteral);
				}
				break;
			case ID:
				_localctx = new BoolVarContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(296); match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\62\u012e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\7\2>\n\2\f\2\16"+
		"\2A\13\2\3\2\3\2\7\2E\n\2\f\2\16\2H\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\5\7^\n\7\3\b\3\b\5"+
		"\bb\n\b\3\b\3\b\7\bf\n\b\f\b\16\bi\13\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\7"+
		"\nr\n\n\f\n\16\nu\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u008f\n\f\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u009b\n\16\3\17\3\17"+
		"\5\17\u009f\n\17\3\17\3\17\7\17\u00a3\n\17\f\17\16\17\u00a6\13\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00b4\n\20"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00d9\n\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u00e4\n\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00f3\n\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\5\31\u00fd\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u010c\n\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u0114\n\33\3\34\3\34\3\34\3\34\3\34\5\34\u011b\n\34\3\35\3"+
		"\35\3\35\3\35\3\35\5\35\u0122\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\5\36\u012c\n\36\3\36\2\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:\2\3\3\2\20\24\u0140\2?\3\2\2\2\4K\3\2\2\2\6Q\3"+
		"\2\2\2\bT\3\2\2\2\nV\3\2\2\2\f]\3\2\2\2\16_\3\2\2\2\20l\3\2\2\2\22o\3"+
		"\2\2\2\24x\3\2\2\2\26\u008e\3\2\2\2\30\u0090\3\2\2\2\32\u009a\3\2\2\2"+
		"\34\u009c\3\2\2\2\36\u00b3\3\2\2\2 \u00b5\3\2\2\2\"\u00b9\3\2\2\2$\u00bd"+
		"\3\2\2\2&\u00c3\3\2\2\2(\u00cd\3\2\2\2*\u00d8\3\2\2\2,\u00e3\3\2\2\2."+
		"\u00f2\3\2\2\2\60\u00fc\3\2\2\2\62\u010b\3\2\2\2\64\u0113\3\2\2\2\66\u011a"+
		"\3\2\2\28\u0121\3\2\2\2:\u012b\3\2\2\2<>\5\4\3\2=<\3\2\2\2>A\3\2\2\2?"+
		"=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BF\5\24\13\2CE\5\n\6\2DC\3\2\2"+
		"\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\7\2\2\3J\3\3\2"+
		"\2\2KL\7\5\2\2LM\5\6\4\2MN\7\33\2\2NO\5*\26\2OP\7\31\2\2P\5\3\2\2\2QR"+
		"\5\b\5\2RS\7/\2\2S\7\3\2\2\2TU\t\2\2\2U\t\3\2\2\2VW\5\f\7\2WX\7/\2\2X"+
		"Y\5\16\b\2YZ\5\22\n\2Z\13\3\2\2\2[^\5\b\5\2\\^\7\6\2\2][\3\2\2\2]\\\3"+
		"\2\2\2^\r\3\2\2\2_a\7\25\2\2`b\5\20\t\2a`\3\2\2\2ab\3\2\2\2bg\3\2\2\2"+
		"cd\7\32\2\2df\5\20\t\2ec\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2"+
		"\2ig\3\2\2\2jk\7\26\2\2k\17\3\2\2\2lm\5\b\5\2mn\7/\2\2n\21\3\2\2\2os\7"+
		"\27\2\2pr\5\26\f\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2u"+
		"s\3\2\2\2vw\7\30\2\2w\23\3\2\2\2xy\7\6\2\2yz\7\7\2\2z{\5\16\b\2{|\5\22"+
		"\n\2|\25\3\2\2\2}\u008f\5\22\n\2~\177\5\6\4\2\177\u0080\7\31\2\2\u0080"+
		"\u008f\3\2\2\2\u0081\u0082\5\30\r\2\u0082\u0083\7\31\2\2\u0083\u008f\3"+
		"\2\2\2\u0084\u0085\5\32\16\2\u0085\u0086\7\31\2\2\u0086\u008f\3\2\2\2"+
		"\u0087\u008f\5\36\20\2\u0088\u008f\5\"\22\2\u0089\u008f\5$\23\2\u008a"+
		"\u008f\5&\24\2\u008b\u008f\5(\25\2\u008c\u008d\7\b\2\2\u008d\u008f\7\31"+
		"\2\2\u008e}\3\2\2\2\u008e~\3\2\2\2\u008e\u0081\3\2\2\2\u008e\u0084\3\2"+
		"\2\2\u008e\u0087\3\2\2\2\u008e\u0088\3\2\2\2\u008e\u0089\3\2\2\2\u008e"+
		"\u008a\3\2\2\2\u008e\u008b\3\2\2\2\u008e\u008c\3\2\2\2\u008f\27\3\2\2"+
		"\2\u0090\u0091\7/\2\2\u0091\u0092\7\33\2\2\u0092\u0093\5*\26\2\u0093\31"+
		"\3\2\2\2\u0094\u0095\7/\2\2\u0095\u009b\5\34\17\2\u0096\u0097\7\3\2\2"+
		"\u0097\u009b\5\34\17\2\u0098\u0099\7\4\2\2\u0099\u009b\5\34\17\2\u009a"+
		"\u0094\3\2\2\2\u009a\u0096\3\2\2\2\u009a\u0098\3\2\2\2\u009b\33\3\2\2"+
		"\2\u009c\u009e\7\25\2\2\u009d\u009f\5*\26\2\u009e\u009d\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a4\3\2\2\2\u00a0\u00a1\7\32\2\2\u00a1\u00a3\5"+
		"*\26\2\u00a2\u00a0\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\7\26"+
		"\2\2\u00a8\35\3\2\2\2\u00a9\u00aa\7\t\2\2\u00aa\u00ab\5 \21\2\u00ab\u00ac"+
		"\5\22\n\2\u00ac\u00ad\7\n\2\2\u00ad\u00ae\5\22\n\2\u00ae\u00b4\3\2\2\2"+
		"\u00af\u00b0\7\t\2\2\u00b0\u00b1\5 \21\2\u00b1\u00b2\5\22\n\2\u00b2\u00b4"+
		"\3\2\2\2\u00b3\u00a9\3\2\2\2\u00b3\u00af\3\2\2\2\u00b4\37\3\2\2\2\u00b5"+
		"\u00b6\7\25\2\2\u00b6\u00b7\5\62\32\2\u00b7\u00b8\7\26\2\2\u00b8!\3\2"+
		"\2\2\u00b9\u00ba\7\13\2\2\u00ba\u00bb\5 \21\2\u00bb\u00bc\5\22\n\2\u00bc"+
		"#\3\2\2\2\u00bd\u00be\7\f\2\2\u00be\u00bf\5\22\n\2\u00bf\u00c0\7\13\2"+
		"\2\u00c0\u00c1\5 \21\2\u00c1\u00c2\7\31\2\2\u00c2%\3\2\2\2\u00c3\u00c4"+
		"\7\r\2\2\u00c4\u00c5\7\25\2\2\u00c5\u00c6\5\30\r\2\u00c6\u00c7\7\31\2"+
		"\2\u00c7\u00c8\5\62\32\2\u00c8\u00c9\7\31\2\2\u00c9\u00ca\5\30\r\2\u00ca"+
		"\u00cb\7\26\2\2\u00cb\u00cc\5\22\n\2\u00cc\'\3\2\2\2\u00cd\u00ce\7\16"+
		"\2\2\u00ce\u00cf\5*\26\2\u00cf\u00d0\7\31\2\2\u00d0)\3\2\2\2\u00d1\u00d9"+
		"\7-\2\2\u00d2\u00d9\7,\2\2\u00d3\u00d9\5,\27\2\u00d4\u00d9\5\62\32\2\u00d5"+
		"\u00d9\5\32\16\2\u00d6\u00d9\7/\2\2\u00d7\u00d9\7\17\2\2\u00d8\u00d1\3"+
		"\2\2\2\u00d8\u00d2\3\2\2\2\u00d8\u00d3\3\2\2\2\u00d8\u00d4\3\2\2\2\u00d8"+
		"\u00d5\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9+\3\2\2\2"+
		"\u00da\u00e4\5.\30\2\u00db\u00dc\5.\30\2\u00dc\u00dd\7%\2\2\u00dd\u00de"+
		"\5,\27\2\u00de\u00e4\3\2\2\2\u00df\u00e0\5.\30\2\u00e0\u00e1\7&\2\2\u00e1"+
		"\u00e2\5,\27\2\u00e2\u00e4\3\2\2\2\u00e3\u00da\3\2\2\2\u00e3\u00db\3\2"+
		"\2\2\u00e3\u00df\3\2\2\2\u00e4-\3\2\2\2\u00e5\u00f3\5\60\31\2\u00e6\u00e7"+
		"\5\60\31\2\u00e7\u00e8\7\'\2\2\u00e8\u00e9\5.\30\2\u00e9\u00f3\3\2\2\2"+
		"\u00ea\u00eb\5\60\31\2\u00eb\u00ec\7(\2\2\u00ec\u00ed\5.\30\2\u00ed\u00f3"+
		"\3\2\2\2\u00ee\u00ef\5\60\31\2\u00ef\u00f0\7)\2\2\u00f0\u00f1\5.\30\2"+
		"\u00f1\u00f3\3\2\2\2\u00f2\u00e5\3\2\2\2\u00f2\u00e6\3\2\2\2\u00f2\u00ea"+
		"\3\2\2\2\u00f2\u00ee\3\2\2\2\u00f3/\3\2\2\2\u00f4\u00f5\7\25\2\2\u00f5"+
		"\u00f6\5,\27\2\u00f6\u00f7\7\26\2\2\u00f7\u00fd\3\2\2\2\u00f8\u00fd\7"+
		"*\2\2\u00f9\u00fd\7+\2\2\u00fa\u00fd\5\32\16\2\u00fb\u00fd\7/\2\2\u00fc"+
		"\u00f4\3\2\2\2\u00fc\u00f8\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fc\u00fa\3\2"+
		"\2\2\u00fc\u00fb\3\2\2\2\u00fd\61\3\2\2\2\u00fe\u00ff\5,\27\2\u00ff\u0100"+
		"\5\64\33\2\u0100\u0101\5,\27\2\u0101\u010c\3\2\2\2\u0102\u0103\5\66\34"+
		"\2\u0103\u0104\7\37\2\2\u0104\u0105\5\62\32\2\u0105\u010c\3\2\2\2\u0106"+
		"\u0107\5\66\34\2\u0107\u0108\7\"\2\2\u0108\u0109\5\62\32\2\u0109\u010c"+
		"\3\2\2\2\u010a\u010c\5\66\34\2\u010b\u00fe\3\2\2\2\u010b\u0102\3\2\2\2"+
		"\u010b\u0106\3\2\2\2\u010b\u010a\3\2\2\2\u010c\63\3\2\2\2\u010d\u0114"+
		"\7\37\2\2\u010e\u0114\7\"\2\2\u010f\u0114\7!\2\2\u0110\u0114\7 \2\2\u0111"+
		"\u0114\7\34\2\2\u0112\u0114\7\35\2\2\u0113\u010d\3\2\2\2\u0113\u010e\3"+
		"\2\2\2\u0113\u010f\3\2\2\2\u0113\u0110\3\2\2\2\u0113\u0111\3\2\2\2\u0113"+
		"\u0112\3\2\2\2\u0114\65\3\2\2\2\u0115\u0116\58\35\2\u0116\u0117\7$\2\2"+
		"\u0117\u0118\5\66\34\2\u0118\u011b\3\2\2\2\u0119\u011b\58\35\2\u011a\u0115"+
		"\3\2\2\2\u011a\u0119\3\2\2\2\u011b\67\3\2\2\2\u011c\u011d\5:\36\2\u011d"+
		"\u011e\7#\2\2\u011e\u011f\58\35\2\u011f\u0122\3\2\2\2\u0120\u0122\5:\36"+
		"\2\u0121\u011c\3\2\2\2\u0121\u0120\3\2\2\2\u01229\3\2\2\2\u0123\u0124"+
		"\7\25\2\2\u0124\u0125\5\62\32\2\u0125\u0126\7\26\2\2\u0126\u012c\3\2\2"+
		"\2\u0127\u0128\7\36\2\2\u0128\u012c\5\62\32\2\u0129\u012c\7.\2\2\u012a"+
		"\u012c\7/\2\2\u012b\u0123\3\2\2\2\u012b\u0127\3\2\2\2\u012b\u0129\3\2"+
		"\2\2\u012b\u012a\3\2\2\2\u012c;\3\2\2\2\26?F]ags\u008e\u009a\u009e\u00a4"+
		"\u00b3\u00d8\u00e3\u00f2\u00fc\u010b\u0113\u011a\u0121\u012b";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
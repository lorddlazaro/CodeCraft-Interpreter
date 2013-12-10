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
		RULE_returnStatement = 19, RULE_expression = 20;
	public static final String[] ruleNames = {
		"program", "constantStatement", "variableDeclaration", "dataType", "functionDeclaration", 
		"returnType", "parameterList", "parameter", "block", "mainFunction", "statement", 
		"assignmentStatement", "functionCallStatement", "actualParameters", "ifStatement", 
		"condition", "whileStatement", "doWhileStatement", "forStatement", "returnStatement", 
		"expression"
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
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABSOLUTE) {
				{
				{
				setState(42); constantStatement();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48); mainFunction();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DARKNESS) | (1L << INT) | (1L << CHAR) | (1L << STRING) | (1L << FLOAT) | (1L << BOOLEAN))) != 0)) {
				{
				{
				setState(49); functionDeclaration();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55); match(EOF);
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
		public TerminalNode ID() { return getToken(CodeCraftGrammarParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
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
			setState(57); match(ABSOLUTE);
			setState(58); dataType();
			setState(59); match(ID);
			setState(60); match(ASSIGN);
			setState(61); expression(0);
			setState(62); match(SEMI);
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
			setState(64); dataType();
			setState(65); match(ID);
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
			setState(67);
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
			setState(69); returnType();
			setState(70); match(ID);
			setState(71); parameterList();
			setState(72); block();
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
			setState(76);
			switch (_input.LA(1)) {
			case INT:
			case CHAR:
			case STRING:
			case FLOAT:
			case BOOLEAN:
				_localctx = new ReturnDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(74); dataType();
				}
				break;
			case DARKNESS:
				_localctx = new ReturnDarknessContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(75); match(DARKNESS);
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
			setState(78); match(LPAREN);
			setState(80);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << STRING) | (1L << FLOAT) | (1L << BOOLEAN))) != 0)) {
				{
				setState(79); parameter();
				}
			}

			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(82); match(COMMA);
				setState(83); parameter();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89); match(RPAREN);
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
			setState(91); dataType();
			setState(92); match(ID);
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
			setState(94); match(LBRACE);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << PRINTLN) | (1L << CHOKE) | (1L << WETHER) | (1L << UNTIL) | (1L << EXECUTE) | (1L << AS) | (1L << REPLY) | (1L << INT) | (1L << CHAR) | (1L << STRING) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << LBRACE) | (1L << ID))) != 0)) {
				{
				{
				setState(95); statement();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101); match(RBRACE);
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
			setState(103); match(DARKNESS);
			setState(104); match(MINE);
			setState(105); parameterList();
			setState(106); block();
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
			setState(125);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new BlockStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(108); block();
				}
				break;

			case 2:
				_localctx = new VarDecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(109); variableDeclaration();
				setState(110); match(SEMI);
				}
				break;

			case 3:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(112); assignmentStatement();
				setState(113); match(SEMI);
				}
				break;

			case 4:
				_localctx = new FuncCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(115); functionCallStatement();
				setState(116); match(SEMI);
				}
				break;

			case 5:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(118); ifStatement();
				}
				break;

			case 6:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(119); whileStatement();
				}
				break;

			case 7:
				_localctx = new DowhileContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(120); doWhileStatement();
				}
				break;

			case 8:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(121); forStatement();
				}
				break;

			case 9:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(122); returnStatement();
				}
				break;

			case 10:
				_localctx = new ChokeContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(123); match(CHOKE);
				setState(124); match(SEMI);
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
			setState(127); match(ID);
			setState(128); match(ASSIGN);
			setState(129); expression(0);
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
			setState(137);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new FuncCallIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(131); match(ID);
				setState(132); actualParameters();
				}
				break;
			case PRINT:
				_localctx = new FuncCallPrintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(133); match(PRINT);
				setState(134); actualParameters();
				}
				break;
			case PRINTLN:
				_localctx = new FuncCallPrintlnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(135); match(PRINTLN);
				setState(136); actualParameters();
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
			setState(139); match(LPAREN);
			setState(141);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << ID))) != 0)) {
				{
				setState(140); expression(0);
				}
			}

			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(143); match(COMMA);
				setState(144); expression(0);
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150); match(RPAREN);
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
			setState(162);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new IfelseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(152); match(WETHER);
				setState(153); condition();
				setState(154); block();
				setState(155); match(OTHERWISE);
				setState(156); block();
				}
				break;

			case 2:
				_localctx = new IfonlyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(158); match(WETHER);
				setState(159); condition();
				setState(160); block();
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			setState(164); match(LPAREN);
			setState(165); expression(0);
			setState(166); match(RPAREN);
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
			setState(168); match(UNTIL);
			setState(169); condition();
			setState(170); block();
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
			setState(172); match(EXECUTE);
			setState(173); block();
			setState(174); match(UNTIL);
			setState(175); condition();
			setState(176); match(SEMI);
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
		public AssignmentStatementContext assignmentStatement(int i) {
			return getRuleContext(AssignmentStatementContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			setState(178); match(AS);
			setState(179); match(LPAREN);
			setState(180); assignmentStatement();
			setState(181); match(SEMI);
			setState(182); expression(0);
			setState(183); match(SEMI);
			setState(184); assignmentStatement();
			setState(185); match(RPAREN);
			setState(186); block();
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
			setState(188); match(REPLY);
			setState(189); expression(0);
			setState(190); match(SEMI);
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
		public int _p;
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class AndExprContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AndExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitAndExpr(this);
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
	public static class FuncCallExprContext extends ExpressionContext {
		public ActualParametersContext actualParameters() {
			return getRuleContext(ActualParametersContext.class,0);
		}
		public TerminalNode ID() { return getToken(CodeCraftGrammarParser.ID, 0); }
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
	public static class FloatExprContext extends ExpressionContext {
		public TerminalNode FloatingPointLiteral() { return getToken(CodeCraftGrammarParser.FloatingPointLiteral, 0); }
		public FloatExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterFloatExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitFloatExpr(this);
		}
	}
	public static class BoolExprContext extends ExpressionContext {
		public TerminalNode BooleanLiteral() { return getToken(CodeCraftGrammarParser.BooleanLiteral, 0); }
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
	public static class BangExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BangExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterBangExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitBangExpr(this);
		}
	}
	public static class MultdivmodExprContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public MultdivmodExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterMultdivmodExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitMultdivmodExpr(this);
		}
	}
	public static class OrExprContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public OrExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitOrExpr(this);
		}
	}
	public static class AddminusExprContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AddminusExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterAddminusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitAddminusExpr(this);
		}
	}
	public static class IntExprContext extends ExpressionContext {
		public TerminalNode IntegerLiteral() { return getToken(CodeCraftGrammarParser.IntegerLiteral, 0); }
		public IntExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterIntExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitIntExpr(this);
		}
	}
	public static class ParensExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParensExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterParensExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitParensExpr(this);
		}
	}
	public static class RelationalExprContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public RelationalExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterRelationalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitRelationalExpr(this);
		}
	}
	public static class EqualityExprContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public EqualityExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterEqualityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitEqualityExpr(this);
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

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new BangExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(193); match(BANG);
				setState(194); expression(16);
				}
				break;

			case 2:
				{
				_localctx = new ParensExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(195); match(LPAREN);
				setState(196); expression(0);
				setState(197); match(RPAREN);
				}
				break;

			case 3:
				{
				_localctx = new IntExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199); match(IntegerLiteral);
				}
				break;

			case 4:
				{
				_localctx = new BoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(200); match(BooleanLiteral);
				}
				break;

			case 5:
				{
				_localctx = new FloatExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201); match(FloatingPointLiteral);
				}
				break;

			case 6:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(202); match(StringLiteral);
				}
				break;

			case 7:
				{
				_localctx = new CharExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(203); match(CharacterLiteral);
				}
				break;

			case 8:
				{
				_localctx = new FuncCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(204); match(ID);
				setState(205); actualParameters();
				}
				break;

			case 9:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(206); match(ID);
				}
				break;

			case 10:
				{
				_localctx = new NullExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(207); match(NULL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(228);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new MultdivmodExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(210);
						if (!(14 >= _localctx._p)) throw new FailedPredicateException(this, "14 >= $_p");
						setState(211);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(212); expression(15);
						}
						break;

					case 2:
						{
						_localctx = new AddminusExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(213);
						if (!(13 >= _localctx._p)) throw new FailedPredicateException(this, "13 >= $_p");
						setState(214);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(215); expression(14);
						}
						break;

					case 3:
						{
						_localctx = new RelationalExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(216);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(217);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << LE) | (1L << GE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(218); expression(13);
						}
						break;

					case 4:
						{
						_localctx = new EqualityExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(219);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(220);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(221); expression(12);
						}
						break;

					case 5:
						{
						_localctx = new AndExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(222);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(223); match(AND);
						setState(224); expression(11);
						}
						break;

					case 6:
						{
						_localctx = new OrExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(225);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(226); match(OR);
						setState(227); expression(10);
						}
						break;
					}
					} 
				}
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 14 >= _localctx._p;

		case 1: return 13 >= _localctx._p;

		case 2: return 12 >= _localctx._p;

		case 3: return 11 >= _localctx._p;

		case 4: return 10 >= _localctx._p;

		case 5: return 9 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\62\u00ec\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\7\2.\n\2\f\2\16\2\61\13\2"+
		"\3\2\3\2\7\2\65\n\2\f\2\16\28\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\5\7O\n\7\3\b\3\b\5\b"+
		"S\n\b\3\b\3\b\7\bW\n\b\f\b\16\bZ\13\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\7\n"+
		"c\n\n\f\n\16\nf\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0080\n\f\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u008c\n\16\3\17\3\17\5"+
		"\17\u0090\n\17\3\17\3\17\7\17\u0094\n\17\f\17\16\17\u0097\13\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00a5\n\20"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u00d3\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u00e7\n\26\f\26\16"+
		"\26\u00ea\13\26\3\26\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*\2\7\3\2\20\24\3\2\')\3\2%&\4\2\34\35 !\4\2\37\37\"\"\u00f9\2/\3\2\2"+
		"\2\4;\3\2\2\2\6B\3\2\2\2\bE\3\2\2\2\nG\3\2\2\2\fN\3\2\2\2\16P\3\2\2\2"+
		"\20]\3\2\2\2\22`\3\2\2\2\24i\3\2\2\2\26\177\3\2\2\2\30\u0081\3\2\2\2\32"+
		"\u008b\3\2\2\2\34\u008d\3\2\2\2\36\u00a4\3\2\2\2 \u00a6\3\2\2\2\"\u00aa"+
		"\3\2\2\2$\u00ae\3\2\2\2&\u00b4\3\2\2\2(\u00be\3\2\2\2*\u00d2\3\2\2\2,"+
		".\5\4\3\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61"+
		"/\3\2\2\2\62\66\5\24\13\2\63\65\5\n\6\2\64\63\3\2\2\2\658\3\2\2\2\66\64"+
		"\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2\29:\7\2\2\3:\3\3\2\2\2;<"+
		"\7\5\2\2<=\5\b\5\2=>\7/\2\2>?\7\33\2\2?@\5*\26\2@A\7\31\2\2A\5\3\2\2\2"+
		"BC\5\b\5\2CD\7/\2\2D\7\3\2\2\2EF\t\2\2\2F\t\3\2\2\2GH\5\f\7\2HI\7/\2\2"+
		"IJ\5\16\b\2JK\5\22\n\2K\13\3\2\2\2LO\5\b\5\2MO\7\6\2\2NL\3\2\2\2NM\3\2"+
		"\2\2O\r\3\2\2\2PR\7\25\2\2QS\5\20\t\2RQ\3\2\2\2RS\3\2\2\2SX\3\2\2\2TU"+
		"\7\32\2\2UW\5\20\t\2VT\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2"+
		"ZX\3\2\2\2[\\\7\26\2\2\\\17\3\2\2\2]^\5\b\5\2^_\7/\2\2_\21\3\2\2\2`d\7"+
		"\27\2\2ac\5\26\f\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2f"+
		"d\3\2\2\2gh\7\30\2\2h\23\3\2\2\2ij\7\6\2\2jk\7\7\2\2kl\5\16\b\2lm\5\22"+
		"\n\2m\25\3\2\2\2n\u0080\5\22\n\2op\5\6\4\2pq\7\31\2\2q\u0080\3\2\2\2r"+
		"s\5\30\r\2st\7\31\2\2t\u0080\3\2\2\2uv\5\32\16\2vw\7\31\2\2w\u0080\3\2"+
		"\2\2x\u0080\5\36\20\2y\u0080\5\"\22\2z\u0080\5$\23\2{\u0080\5&\24\2|\u0080"+
		"\5(\25\2}~\7\b\2\2~\u0080\7\31\2\2\177n\3\2\2\2\177o\3\2\2\2\177r\3\2"+
		"\2\2\177u\3\2\2\2\177x\3\2\2\2\177y\3\2\2\2\177z\3\2\2\2\177{\3\2\2\2"+
		"\177|\3\2\2\2\177}\3\2\2\2\u0080\27\3\2\2\2\u0081\u0082\7/\2\2\u0082\u0083"+
		"\7\33\2\2\u0083\u0084\5*\26\2\u0084\31\3\2\2\2\u0085\u0086\7/\2\2\u0086"+
		"\u008c\5\34\17\2\u0087\u0088\7\3\2\2\u0088\u008c\5\34\17\2\u0089\u008a"+
		"\7\4\2\2\u008a\u008c\5\34\17\2\u008b\u0085\3\2\2\2\u008b\u0087\3\2\2\2"+
		"\u008b\u0089\3\2\2\2\u008c\33\3\2\2\2\u008d\u008f\7\25\2\2\u008e\u0090"+
		"\5*\26\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0095\3\2\2\2\u0091"+
		"\u0092\7\32\2\2\u0092\u0094\5*\26\2\u0093\u0091\3\2\2\2\u0094\u0097\3"+
		"\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0098\u0099\7\26\2\2\u0099\35\3\2\2\2\u009a\u009b\7\t\2"+
		"\2\u009b\u009c\5 \21\2\u009c\u009d\5\22\n\2\u009d\u009e\7\n\2\2\u009e"+
		"\u009f\5\22\n\2\u009f\u00a5\3\2\2\2\u00a0\u00a1\7\t\2\2\u00a1\u00a2\5"+
		" \21\2\u00a2\u00a3\5\22\n\2\u00a3\u00a5\3\2\2\2\u00a4\u009a\3\2\2\2\u00a4"+
		"\u00a0\3\2\2\2\u00a5\37\3\2\2\2\u00a6\u00a7\7\25\2\2\u00a7\u00a8\5*\26"+
		"\2\u00a8\u00a9\7\26\2\2\u00a9!\3\2\2\2\u00aa\u00ab\7\13\2\2\u00ab\u00ac"+
		"\5 \21\2\u00ac\u00ad\5\22\n\2\u00ad#\3\2\2\2\u00ae\u00af\7\f\2\2\u00af"+
		"\u00b0\5\22\n\2\u00b0\u00b1\7\13\2\2\u00b1\u00b2\5 \21\2\u00b2\u00b3\7"+
		"\31\2\2\u00b3%\3\2\2\2\u00b4\u00b5\7\r\2\2\u00b5\u00b6\7\25\2\2\u00b6"+
		"\u00b7\5\30\r\2\u00b7\u00b8\7\31\2\2\u00b8\u00b9\5*\26\2\u00b9\u00ba\7"+
		"\31\2\2\u00ba\u00bb\5\30\r\2\u00bb\u00bc\7\26\2\2\u00bc\u00bd\5\22\n\2"+
		"\u00bd\'\3\2\2\2\u00be\u00bf\7\16\2\2\u00bf\u00c0\5*\26\2\u00c0\u00c1"+
		"\7\31\2\2\u00c1)\3\2\2\2\u00c2\u00c3\b\26\1\2\u00c3\u00c4\7\36\2\2\u00c4"+
		"\u00d3\5*\26\2\u00c5\u00c6\7\25\2\2\u00c6\u00c7\5*\26\2\u00c7\u00c8\7"+
		"\26\2\2\u00c8\u00d3\3\2\2\2\u00c9\u00d3\7*\2\2\u00ca\u00d3\7.\2\2\u00cb"+
		"\u00d3\7+\2\2\u00cc\u00d3\7-\2\2\u00cd\u00d3\7,\2\2\u00ce\u00cf\7/\2\2"+
		"\u00cf\u00d3\5\34\17\2\u00d0\u00d3\7/\2\2\u00d1\u00d3\7\17\2\2\u00d2\u00c2"+
		"\3\2\2\2\u00d2\u00c5\3\2\2\2\u00d2\u00c9\3\2\2\2\u00d2\u00ca\3\2\2\2\u00d2"+
		"\u00cb\3\2\2\2\u00d2\u00cc\3\2\2\2\u00d2\u00cd\3\2\2\2\u00d2\u00ce\3\2"+
		"\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00e8\3\2\2\2\u00d4"+
		"\u00d5\6\26\2\3\u00d5\u00d6\t\3\2\2\u00d6\u00e7\5*\26\2\u00d7\u00d8\6"+
		"\26\3\3\u00d8\u00d9\t\4\2\2\u00d9\u00e7\5*\26\2\u00da\u00db\6\26\4\3\u00db"+
		"\u00dc\t\5\2\2\u00dc\u00e7\5*\26\2\u00dd\u00de\6\26\5\3\u00de\u00df\t"+
		"\6\2\2\u00df\u00e7\5*\26\2\u00e0\u00e1\6\26\6\3\u00e1\u00e2\7#\2\2\u00e2"+
		"\u00e7\5*\26\2\u00e3\u00e4\6\26\7\3\u00e4\u00e5\7$\2\2\u00e5\u00e7\5*"+
		"\26\2\u00e6\u00d4\3\2\2\2\u00e6\u00d7\3\2\2\2\u00e6\u00da\3\2\2\2\u00e6"+
		"\u00dd\3\2\2\2\u00e6\u00e0\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e7\u00ea\3\2"+
		"\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9+\3\2\2\2\u00ea\u00e8"+
		"\3\2\2\2\20/\66NRXd\177\u008b\u008f\u0095\u00a4\u00d2\u00e6\u00e8";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
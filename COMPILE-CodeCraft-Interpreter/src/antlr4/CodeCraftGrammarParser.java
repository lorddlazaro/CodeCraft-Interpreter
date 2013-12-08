// Generated from C:\Users\LorddMichael\eclipse workspace\COMPILE-CodeCraft-Interpreter\src\antlr4\CodeCraftGrammar.g4 by ANTLR 4.1

package antlr4;

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
		PRINT=1, PRINTLN=2, SUMMON=3, PARTY=4, ABSOLUTE=5, DARKNESS=6, MINE=7, 
		CHOKE=8, PROLONG=9, WETHER=10, OTHERWISE=11, UNTIL=12, EXECUTE=13, AS=14, 
		REPLY=15, NULL=16, INT=17, CHAR=18, STRING=19, FLOAT=20, BOOLEAN=21, LPAREN=22, 
		RPAREN=23, LBRACE=24, RBRACE=25, LBRACK=26, RBRACK=27, SEMI=28, COMMA=29, 
		DOT=30, ASSIGN=31, GT=32, LT=33, BANG=34, EQUAL=35, LE=36, GE=37, NOTEQUAL=38, 
		AND=39, OR=40, ADD=41, SUB=42, MUL=43, DIV=44, MOD=45, IntegerLiteral=46, 
		FloatingPointLiteral=47, CharacterLiteral=48, StringLiteral=49, BooleanLiteral=50, 
		ID=51, WS=52, COMMENT=53, LINE_COMMENT=54;
	public static final String[] tokenNames = {
		"<INVALID>", "'print'", "'println'", "'summon'", "'party'", "'absolute'", 
		"'darkness'", "'mine'", "'choke'", "'prolong'", "'wether'", "'otherwise'", 
		"'until'", "'execute'", "'as'", "'reply'", "'NULL'", "'int'", "'char'", 
		"'string'", "'float'", "'boolean'", "'('", "')'", "'{'", "'}'", "'['", 
		"']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'=='", "'<='", 
		"'>='", "'!='", "'&&'", "'||'", "'+'", "'-'", "'*'", "'/'", "'%'", "IntegerLiteral", 
		"FloatingPointLiteral", "CharacterLiteral", "StringLiteral", "BooleanLiteral", 
		"ID", "WS", "COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_program = 0, RULE_constantStatement = 1, RULE_variableDeclaration = 2, 
		RULE_dataType = 3, RULE_functionList = 4, RULE_functionDeclaration = 5, 
		RULE_returnType = 6, RULE_parameterList = 7, RULE_parameter = 8, RULE_block = 9, 
		RULE_mainFunction = 10, RULE_statement = 11, RULE_assignmentStatement = 12, 
		RULE_functionCallStatement = 13, RULE_actualParameterList = 14, RULE_actualParameters = 15, 
		RULE_ifStatement = 16, RULE_condition = 17, RULE_whileStatement = 18, 
		RULE_doWhileStatement = 19, RULE_forStatement = 20, RULE_returnStatement = 21, 
		RULE_expression = 22, RULE_numExpression = 23, RULE_numTerm = 24, RULE_numFactor = 25, 
		RULE_booleanExpression = 26, RULE_relationalOperator = 27, RULE_booleanLogical = 28, 
		RULE_booleanTerm = 29, RULE_booleanFactor = 30;
	public static final String[] ruleNames = {
		"program", "constantStatement", "variableDeclaration", "dataType", "functionList", 
		"functionDeclaration", "returnType", "parameterList", "parameter", "block", 
		"mainFunction", "statement", "assignmentStatement", "functionCallStatement", 
		"actualParameterList", "actualParameters", "ifStatement", "condition", 
		"whileStatement", "doWhileStatement", "forStatement", "returnStatement", 
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
		public TerminalNode EOF() { return getToken(CodeCraftGrammarParser.EOF, 0); }
		public ConstantStatementContext constantStatement(int i) {
			return getRuleContext(ConstantStatementContext.class,i);
		}
		public FunctionListContext functionList() {
			return getRuleContext(FunctionListContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABSOLUTE) {
				{
				{
				setState(62); constantStatement();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68); mainFunction();
			setState(69); functionList();
			setState(70); match(EOF);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitConstantStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantStatementContext constantStatement() throws RecognitionException {
		ConstantStatementContext _localctx = new ConstantStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_constantStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); match(ABSOLUTE);
			setState(73); dataType();
			setState(74); match(ID);
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
		public TerminalNode SEMI() { return getToken(CodeCraftGrammarParser.SEMI, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
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
			setState(81); match(SEMI);
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
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DataTypeBooleanContext extends DataTypeContext {
		public TerminalNode BOOLEAN() { return getToken(CodeCraftGrammarParser.BOOLEAN, 0); }
		public DataTypeBooleanContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterDataTypeBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitDataTypeBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitDataTypeBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DataTypeStringContext extends DataTypeContext {
		public TerminalNode STRING() { return getToken(CodeCraftGrammarParser.STRING, 0); }
		public DataTypeStringContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterDataTypeString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitDataTypeString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitDataTypeString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DataTypeIntContext extends DataTypeContext {
		public TerminalNode INT() { return getToken(CodeCraftGrammarParser.INT, 0); }
		public DataTypeIntContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterDataTypeInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitDataTypeInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitDataTypeInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DataTypeFloatContext extends DataTypeContext {
		public TerminalNode FLOAT() { return getToken(CodeCraftGrammarParser.FLOAT, 0); }
		public DataTypeFloatContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterDataTypeFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitDataTypeFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitDataTypeFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DataTypeCharContext extends DataTypeContext {
		public TerminalNode CHAR() { return getToken(CodeCraftGrammarParser.CHAR, 0); }
		public DataTypeCharContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterDataTypeChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitDataTypeChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitDataTypeChar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dataType);
		try {
			setState(88);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new DataTypeIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(83); match(INT);
				}
				break;
			case FLOAT:
				_localctx = new DataTypeFloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(84); match(FLOAT);
				}
				break;
			case CHAR:
				_localctx = new DataTypeCharContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(85); match(CHAR);
				}
				break;
			case STRING:
				_localctx = new DataTypeStringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(86); match(STRING);
				}
				break;
			case BOOLEAN:
				_localctx = new DataTypeBooleanContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(87); match(BOOLEAN);
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

	public static class FunctionListContext extends ParserRuleContext {
		public FunctionListContext functionList() {
			return getRuleContext(FunctionListContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public FunctionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterFunctionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitFunctionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitFunctionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionListContext functionList() throws RecognitionException {
		FunctionListContext _localctx = new FunctionListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionList);
		try {
			setState(94);
			switch (_input.LA(1)) {
			case DARKNESS:
			case INT:
			case CHAR:
			case STRING:
			case FLOAT:
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(90); functionDeclaration();
				setState(91); functionList();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CodeCraftGrammarParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(CodeCraftGrammarParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CodeCraftGrammarParser.LPAREN, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96); returnType();
			setState(97); match(ID);
			setState(98); match(LPAREN);
			setState(100);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << STRING) | (1L << FLOAT) | (1L << BOOLEAN))) != 0)) {
				{
				setState(99); parameterList();
				}
			}

			setState(102); match(RPAREN);
			setState(103); block();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitReturnDarkness(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitReturnDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_returnType);
		try {
			setState(107);
			switch (_input.LA(1)) {
			case INT:
			case CHAR:
			case STRING:
			case FLOAT:
			case BOOLEAN:
				_localctx = new ReturnDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(105); dataType();
				}
				break;
			case DARKNESS:
				_localctx = new ReturnDarknessContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(106); match(DARKNESS);
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
		public ParameterListContext parameterList(int i) {
			return getRuleContext(ParameterListContext.class,i);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public List<ParameterListContext> parameterList() {
			return getRuleContexts(ParameterListContext.class);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109); parameter();
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(110); match(COMMA);
					setState(111); parameterList();
					}
					} 
				}
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117); dataType();
			setState(118); match(ID);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); match(LBRACE);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << PRINTLN) | (1L << CHOKE) | (1L << WETHER) | (1L << UNTIL) | (1L << EXECUTE) | (1L << AS) | (1L << REPLY) | (1L << INT) | (1L << CHAR) | (1L << STRING) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << LBRACE) | (1L << ID))) != 0)) {
				{
				{
				setState(121); statement();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127); match(RBRACE);
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
		public TerminalNode RPAREN() { return getToken(CodeCraftGrammarParser.RPAREN, 0); }
		public TerminalNode DARKNESS() { return getToken(CodeCraftGrammarParser.DARKNESS, 0); }
		public TerminalNode MINE() { return getToken(CodeCraftGrammarParser.MINE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CodeCraftGrammarParser.LPAREN, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitMainFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainFunctionContext mainFunction() throws RecognitionException {
		MainFunctionContext _localctx = new MainFunctionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mainFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); match(DARKNESS);
			setState(130); match(MINE);
			setState(131); match(LPAREN);
			setState(132); parameterList();
			setState(133); match(RPAREN);
			setState(134); block();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitChoke(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDecContext extends StatementContext {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitVarDec(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitDowhile(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		try {
			setState(151);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new BlockStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(136); block();
				}
				break;

			case 2:
				_localctx = new VarDecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(137); variableDeclaration();
				}
				break;

			case 3:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(138); assignmentStatement();
				setState(139); match(SEMI);
				}
				break;

			case 4:
				_localctx = new FuncCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(141); functionCallStatement();
				setState(142); match(SEMI);
				}
				break;

			case 5:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(144); ifStatement();
				}
				break;

			case 6:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(145); whileStatement();
				}
				break;

			case 7:
				_localctx = new DowhileContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(146); doWhileStatement();
				}
				break;

			case 8:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(147); forStatement();
				}
				break;

			case 9:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(148); returnStatement();
				}
				break;

			case 10:
				_localctx = new ChokeContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(149); match(CHOKE);
				setState(150); match(SEMI);
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
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
	 
		public AssignmentStatementContext() { }
		public void copyFrom(AssignmentStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignExprContext extends AssignmentStatementContext {
		public TerminalNode ASSIGN() { return getToken(CodeCraftGrammarParser.ASSIGN, 0); }
		public TerminalNode ID() { return getToken(CodeCraftGrammarParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignExprContext(AssignmentStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignFuncCallContext extends AssignmentStatementContext {
		public FunctionCallStatementContext functionCallStatement() {
			return getRuleContext(FunctionCallStatementContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CodeCraftGrammarParser.ASSIGN, 0); }
		public TerminalNode ID() { return getToken(CodeCraftGrammarParser.ID, 0); }
		public AssignFuncCallContext(AssignmentStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterAssignFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitAssignFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitAssignFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignmentStatement);
		try {
			setState(159);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new AssignExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(153); match(ID);
				setState(154); match(ASSIGN);
				setState(155); expression();
				}
				break;

			case 2:
				_localctx = new AssignFuncCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(156); match(ID);
				setState(157); match(ASSIGN);
				setState(158); functionCallStatement();
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
		public TerminalNode ID() { return getToken(CodeCraftGrammarParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(CodeCraftGrammarParser.RPAREN, 0); }
		public ActualParameterListContext actualParameterList() {
			return getRuleContext(ActualParameterListContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CodeCraftGrammarParser.LPAREN, 0); }
		public FuncCallIDContext(FunctionCallStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterFuncCallID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitFuncCallID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitFuncCallID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCallPrintlnContext extends FunctionCallStatementContext {
		public TerminalNode RPAREN() { return getToken(CodeCraftGrammarParser.RPAREN, 0); }
		public ActualParameterListContext actualParameterList() {
			return getRuleContext(ActualParameterListContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CodeCraftGrammarParser.LPAREN, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitFuncCallPrintln(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCallPrintContext extends FunctionCallStatementContext {
		public TerminalNode PRINT() { return getToken(CodeCraftGrammarParser.PRINT, 0); }
		public TerminalNode RPAREN() { return getToken(CodeCraftGrammarParser.RPAREN, 0); }
		public ActualParameterListContext actualParameterList() {
			return getRuleContext(ActualParameterListContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CodeCraftGrammarParser.LPAREN, 0); }
		public FuncCallPrintContext(FunctionCallStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterFuncCallPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitFuncCallPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitFuncCallPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallStatementContext functionCallStatement() throws RecognitionException {
		FunctionCallStatementContext _localctx = new FunctionCallStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionCallStatement);
		try {
			setState(176);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new FuncCallIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(161); match(ID);
				setState(162); match(LPAREN);
				setState(163); actualParameterList();
				setState(164); match(RPAREN);
				}
				break;
			case PRINT:
				_localctx = new FuncCallPrintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(166); match(PRINT);
				setState(167); match(LPAREN);
				setState(168); actualParameterList();
				setState(169); match(RPAREN);
				}
				break;
			case PRINTLN:
				_localctx = new FuncCallPrintlnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(171); match(PRINTLN);
				setState(172); match(LPAREN);
				setState(173); actualParameterList();
				setState(174); match(RPAREN);
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

	public static class ActualParameterListContext extends ParserRuleContext {
		public ActualParametersContext actualParameters() {
			return getRuleContext(ActualParametersContext.class,0);
		}
		public ActualParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterActualParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitActualParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitActualParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualParameterListContext actualParameterList() throws RecognitionException {
		ActualParameterListContext _localctx = new ActualParameterListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_actualParameterList);
		try {
			setState(180);
			switch (_input.LA(1)) {
			case PRINT:
			case PRINTLN:
			case NULL:
			case LPAREN:
			case BANG:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case BooleanLiteral:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(178); actualParameters();
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
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
		public ActualParametersContext actualParameters() {
			return getRuleContext(ActualParametersContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CodeCraftGrammarParser.COMMA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitActualParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualParametersContext actualParameters() throws RecognitionException {
		ActualParametersContext _localctx = new ActualParametersContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_actualParameters);
		try {
			setState(187);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(182); expression();
				}
				setState(183); match(COMMA);
				setState(184); actualParameters();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(186); expression();
				}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitIfonly(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitIfelse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ifStatement);
		try {
			setState(199);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new IfelseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(189); match(WETHER);
				setState(190); condition();
				setState(191); block();
				setState(192); match(OTHERWISE);
				setState(193); block();
				}
				break;

			case 2:
				_localctx = new IfonlyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(195); match(WETHER);
				setState(196); condition();
				setState(197); block();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201); match(LPAREN);
			setState(202); booleanExpression();
			setState(203); match(RPAREN);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205); match(UNTIL);
			setState(206); condition();
			setState(207); block();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209); match(EXECUTE);
			setState(210); block();
			setState(211); match(UNTIL);
			setState(212); condition();
			setState(213); match(SEMI);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215); match(AS);
			setState(216); match(LPAREN);
			setState(217); assignmentStatement();
			setState(218); match(SEMI);
			setState(219); booleanExpression();
			setState(220); match(SEMI);
			setState(221); assignmentStatement();
			setState(222); match(RPAREN);
			setState(223); block();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225); match(REPLY);
			setState(226); expression();
			setState(227); match(SEMI);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitStringExpr(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitNumExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(CodeCraftGrammarParser.ID, 0); }
		public VarContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitNullExpr(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncExprContext extends ExpressionContext {
		public FunctionCallStatementContext functionCallStatement() {
			return getRuleContext(FunctionCallStatementContext.class,0);
		}
		public FuncExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).enterFuncExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeCraftGrammarListener ) ((CodeCraftGrammarListener)listener).exitFuncExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitFuncExpr(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitCharExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expression);
		try {
			setState(236);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new StringExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(229); match(StringLiteral);
				}
				break;

			case 2:
				_localctx = new CharExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(230); match(CharacterLiteral);
				}
				break;

			case 3:
				_localctx = new NumExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(231); numExpression();
				}
				break;

			case 4:
				_localctx = new BoolExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(232); booleanExpression();
				}
				break;

			case 5:
				_localctx = new FuncExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(233); functionCallStatement();
				}
				break;

			case 6:
				_localctx = new VarContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(234); match(ID);
				}
				break;

			case 7:
				_localctx = new NullExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(235); match(NULL);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumExpressionContext numExpression() throws RecognitionException {
		NumExpressionContext _localctx = new NumExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_numExpression);
		try {
			setState(247);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new TermContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(238); numTerm();
				}
				break;

			case 2:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(239); numTerm();
				setState(240); match(ADD);
				setState(241); numExpression();
				}
				break;

			case 3:
				_localctx = new SubContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(243); numTerm();
				setState(244); match(SUB);
				setState(245); numExpression();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitMod(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumTermContext numTerm() throws RecognitionException {
		NumTermContext _localctx = new NumTermContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_numTerm);
		try {
			setState(262);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new FactorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(249); numFactor();
				}
				break;

			case 2:
				_localctx = new MulContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(250); numFactor();
				setState(251); match(MUL);
				setState(252); numTerm();
				}
				break;

			case 3:
				_localctx = new DivContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(254); numFactor();
				setState(255); match(DIV);
				setState(256); numTerm();
				}
				break;

			case 4:
				_localctx = new ModContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(258); numFactor();
				setState(259); match(MOD);
				setState(260); numTerm();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitNumVar(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitFactorInt(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitFactorFloat(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitFuncNumExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumFactorContext numFactor() throws RecognitionException {
		NumFactorContext _localctx = new NumFactorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_numFactor);
		try {
			setState(272);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new ParensContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(264); match(LPAREN);
				setState(265); numExpression();
				setState(266); match(RPAREN);
				}
				break;

			case 2:
				_localctx = new FactorIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(268); match(IntegerLiteral);
				}
				break;

			case 3:
				_localctx = new FactorFloatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(269); match(FloatingPointLiteral);
				}
				break;

			case 4:
				_localctx = new FuncNumExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(270); functionCallStatement();
				}
				break;

			case 5:
				_localctx = new NumVarContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(271); match(ID);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitLogical(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitRelational(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitNotequal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_booleanExpression);
		try {
			setState(287);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new RelationalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(274); numExpression();
				setState(275); relationalOperator();
				setState(276); numExpression();
				}
				break;

			case 2:
				_localctx = new EqualContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(278); booleanLogical();
				setState(279); match(EQUAL);
				setState(280); booleanExpression();
				}
				break;

			case 3:
				_localctx = new NotequalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(282); booleanLogical();
				setState(283); match(NOTEQUAL);
				setState(284); booleanExpression();
				}
				break;

			case 4:
				_localctx = new LogicalContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(286); booleanLogical();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitOpGreaterequal(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitOpGreater(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitOpLess(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitOpLessequal(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitOpEqual(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitOpNotequal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalOperatorContext relationalOperator() throws RecognitionException {
		RelationalOperatorContext _localctx = new RelationalOperatorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_relationalOperator);
		try {
			setState(295);
			switch (_input.LA(1)) {
			case EQUAL:
				_localctx = new OpEqualContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(289); match(EQUAL);
				}
				break;
			case NOTEQUAL:
				_localctx = new OpNotequalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(290); match(NOTEQUAL);
				}
				break;
			case GE:
				_localctx = new OpGreaterequalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(291); match(GE);
				}
				break;
			case LE:
				_localctx = new OpLessequalContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(292); match(LE);
				}
				break;
			case GT:
				_localctx = new OpGreaterContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(293); match(GT);
				}
				break;
			case LT:
				_localctx = new OpLessContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(294); match(LT);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitBoolTerm(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLogicalContext booleanLogical() throws RecognitionException {
		BooleanLogicalContext _localctx = new BooleanLogicalContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_booleanLogical);
		try {
			setState(302);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new OrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(297); booleanTerm();
				setState(298); match(OR);
				setState(299); booleanLogical();
				}
				break;

			case 2:
				_localctx = new BoolTermContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(301); booleanTerm();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitBoolFactor(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanTermContext booleanTerm() throws RecognitionException {
		BooleanTermContext _localctx = new BooleanTermContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_booleanTerm);
		try {
			setState(309);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new AndContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(304); booleanFactor();
				setState(305); match(AND);
				setState(306); booleanTerm();
				}
				break;

			case 2:
				_localctx = new BoolFactorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(308); booleanFactor();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitBoolParen(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitBoolVar(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeCraftGrammarVisitor ) return ((CodeCraftGrammarVisitor<? extends T>)visitor).visitBang(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanFactorContext booleanFactor() throws RecognitionException {
		BooleanFactorContext _localctx = new BooleanFactorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_booleanFactor);
		try {
			setState(319);
			switch (_input.LA(1)) {
			case LPAREN:
				_localctx = new BoolParenContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(311); match(LPAREN);
				setState(312); booleanExpression();
				setState(313); match(RPAREN);
				}
				break;
			case BANG:
				_localctx = new BangContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(315); match(BANG);
				setState(316); booleanExpression();
				}
				break;
			case BooleanLiteral:
				_localctx = new BoolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(317); match(BooleanLiteral);
				}
				break;
			case ID:
				_localctx = new BoolVarContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(318); match(ID);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\38\u0144\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\7\2B\n\2\f\2\16\2E\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5[\n\5\3\6\3\6\3\6\3\6\5\6a\n\6\3"+
		"\7\3\7\3\7\3\7\5\7g\n\7\3\7\3\7\3\7\3\b\3\b\5\bn\n\b\3\t\3\t\3\t\7\ts"+
		"\n\t\f\t\16\tv\13\t\3\n\3\n\3\n\3\13\3\13\7\13}\n\13\f\13\16\13\u0080"+
		"\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u009a\n\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\5\16\u00a2\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b3\n\17\3\20\3\20\5\20\u00b7\n"+
		"\20\3\21\3\21\3\21\3\21\3\21\5\21\u00be\n\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u00ca\n\22\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\5\30\u00ef\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u00fa\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u0109\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0113"+
		"\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u0122\n\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u012a\n\35\3\36\3"+
		"\36\3\36\3\36\3\36\5\36\u0131\n\36\3\37\3\37\3\37\3\37\3\37\5\37\u0138"+
		"\n\37\3 \3 \3 \3 \3 \3 \3 \3 \5 \u0142\n \3 \2!\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2\2\u0159\2C\3\2\2\2\4J\3\2\2"+
		"\2\6Q\3\2\2\2\bZ\3\2\2\2\n`\3\2\2\2\fb\3\2\2\2\16m\3\2\2\2\20o\3\2\2\2"+
		"\22w\3\2\2\2\24z\3\2\2\2\26\u0083\3\2\2\2\30\u0099\3\2\2\2\32\u00a1\3"+
		"\2\2\2\34\u00b2\3\2\2\2\36\u00b6\3\2\2\2 \u00bd\3\2\2\2\"\u00c9\3\2\2"+
		"\2$\u00cb\3\2\2\2&\u00cf\3\2\2\2(\u00d3\3\2\2\2*\u00d9\3\2\2\2,\u00e3"+
		"\3\2\2\2.\u00ee\3\2\2\2\60\u00f9\3\2\2\2\62\u0108\3\2\2\2\64\u0112\3\2"+
		"\2\2\66\u0121\3\2\2\28\u0129\3\2\2\2:\u0130\3\2\2\2<\u0137\3\2\2\2>\u0141"+
		"\3\2\2\2@B\5\4\3\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2E"+
		"C\3\2\2\2FG\5\26\f\2GH\5\n\6\2HI\7\2\2\3I\3\3\2\2\2JK\7\7\2\2KL\5\b\5"+
		"\2LM\7\65\2\2MN\7!\2\2NO\5.\30\2OP\7\36\2\2P\5\3\2\2\2QR\5\b\5\2RS\7\65"+
		"\2\2ST\7\36\2\2T\7\3\2\2\2U[\7\23\2\2V[\7\26\2\2W[\7\24\2\2X[\7\25\2\2"+
		"Y[\7\27\2\2ZU\3\2\2\2ZV\3\2\2\2ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2[\t\3\2\2"+
		"\2\\]\5\f\7\2]^\5\n\6\2^a\3\2\2\2_a\3\2\2\2`\\\3\2\2\2`_\3\2\2\2a\13\3"+
		"\2\2\2bc\5\16\b\2cd\7\65\2\2df\7\30\2\2eg\5\20\t\2fe\3\2\2\2fg\3\2\2\2"+
		"gh\3\2\2\2hi\7\31\2\2ij\5\24\13\2j\r\3\2\2\2kn\5\b\5\2ln\7\b\2\2mk\3\2"+
		"\2\2ml\3\2\2\2n\17\3\2\2\2ot\5\22\n\2pq\7\37\2\2qs\5\20\t\2rp\3\2\2\2"+
		"sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\21\3\2\2\2vt\3\2\2\2wx\5\b\5\2xy\7\65"+
		"\2\2y\23\3\2\2\2z~\7\32\2\2{}\5\30\r\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2"+
		"\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7\33\2"+
		"\2\u0082\25\3\2\2\2\u0083\u0084\7\b\2\2\u0084\u0085\7\t\2\2\u0085\u0086"+
		"\7\30\2\2\u0086\u0087\5\20\t\2\u0087\u0088\7\31\2\2\u0088\u0089\5\24\13"+
		"\2\u0089\27\3\2\2\2\u008a\u009a\5\24\13\2\u008b\u009a\5\6\4\2\u008c\u008d"+
		"\5\32\16\2\u008d\u008e\7\36\2\2\u008e\u009a\3\2\2\2\u008f\u0090\5\34\17"+
		"\2\u0090\u0091\7\36\2\2\u0091\u009a\3\2\2\2\u0092\u009a\5\"\22\2\u0093"+
		"\u009a\5&\24\2\u0094\u009a\5(\25\2\u0095\u009a\5*\26\2\u0096\u009a\5,"+
		"\27\2\u0097\u0098\7\n\2\2\u0098\u009a\7\36\2\2\u0099\u008a\3\2\2\2\u0099"+
		"\u008b\3\2\2\2\u0099\u008c\3\2\2\2\u0099\u008f\3\2\2\2\u0099\u0092\3\2"+
		"\2\2\u0099\u0093\3\2\2\2\u0099\u0094\3\2\2\2\u0099\u0095\3\2\2\2\u0099"+
		"\u0096\3\2\2\2\u0099\u0097\3\2\2\2\u009a\31\3\2\2\2\u009b\u009c\7\65\2"+
		"\2\u009c\u009d\7!\2\2\u009d\u00a2\5.\30\2\u009e\u009f\7\65\2\2\u009f\u00a0"+
		"\7!\2\2\u00a0\u00a2\5\34\17\2\u00a1\u009b\3\2\2\2\u00a1\u009e\3\2\2\2"+
		"\u00a2\33\3\2\2\2\u00a3\u00a4\7\65\2\2\u00a4\u00a5\7\30\2\2\u00a5\u00a6"+
		"\5\36\20\2\u00a6\u00a7\7\31\2\2\u00a7\u00b3\3\2\2\2\u00a8\u00a9\7\3\2"+
		"\2\u00a9\u00aa\7\30\2\2\u00aa\u00ab\5\36\20\2\u00ab\u00ac\7\31\2\2\u00ac"+
		"\u00b3\3\2\2\2\u00ad\u00ae\7\4\2\2\u00ae\u00af\7\30\2\2\u00af\u00b0\5"+
		"\36\20\2\u00b0\u00b1\7\31\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00a3\3\2\2\2"+
		"\u00b2\u00a8\3\2\2\2\u00b2\u00ad\3\2\2\2\u00b3\35\3\2\2\2\u00b4\u00b7"+
		"\5 \21\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7"+
		"\37\3\2\2\2\u00b8\u00b9\5.\30\2\u00b9\u00ba\7\37\2\2\u00ba\u00bb\5 \21"+
		"\2\u00bb\u00be\3\2\2\2\u00bc\u00be\5.\30\2\u00bd\u00b8\3\2\2\2\u00bd\u00bc"+
		"\3\2\2\2\u00be!\3\2\2\2\u00bf\u00c0\7\f\2\2\u00c0\u00c1\5$\23\2\u00c1"+
		"\u00c2\5\24\13\2\u00c2\u00c3\7\r\2\2\u00c3\u00c4\5\24\13\2\u00c4\u00ca"+
		"\3\2\2\2\u00c5\u00c6\7\f\2\2\u00c6\u00c7\5$\23\2\u00c7\u00c8\5\24\13\2"+
		"\u00c8\u00ca\3\2\2\2\u00c9\u00bf\3\2\2\2\u00c9\u00c5\3\2\2\2\u00ca#\3"+
		"\2\2\2\u00cb\u00cc\7\30\2\2\u00cc\u00cd\5\66\34\2\u00cd\u00ce\7\31\2\2"+
		"\u00ce%\3\2\2\2\u00cf\u00d0\7\16\2\2\u00d0\u00d1\5$\23\2\u00d1\u00d2\5"+
		"\24\13\2\u00d2\'\3\2\2\2\u00d3\u00d4\7\17\2\2\u00d4\u00d5\5\24\13\2\u00d5"+
		"\u00d6\7\16\2\2\u00d6\u00d7\5$\23\2\u00d7\u00d8\7\36\2\2\u00d8)\3\2\2"+
		"\2\u00d9\u00da\7\20\2\2\u00da\u00db\7\30\2\2\u00db\u00dc\5\32\16\2\u00dc"+
		"\u00dd\7\36\2\2\u00dd\u00de\5\66\34\2\u00de\u00df\7\36\2\2\u00df\u00e0"+
		"\5\32\16\2\u00e0\u00e1\7\31\2\2\u00e1\u00e2\5\24\13\2\u00e2+\3\2\2\2\u00e3"+
		"\u00e4\7\21\2\2\u00e4\u00e5\5.\30\2\u00e5\u00e6\7\36\2\2\u00e6-\3\2\2"+
		"\2\u00e7\u00ef\7\63\2\2\u00e8\u00ef\7\62\2\2\u00e9\u00ef\5\60\31\2\u00ea"+
		"\u00ef\5\66\34\2\u00eb\u00ef\5\34\17\2\u00ec\u00ef\7\65\2\2\u00ed\u00ef"+
		"\7\22\2\2\u00ee\u00e7\3\2\2\2\u00ee\u00e8\3\2\2\2\u00ee\u00e9\3\2\2\2"+
		"\u00ee\u00ea\3\2\2\2\u00ee\u00eb\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed"+
		"\3\2\2\2\u00ef/\3\2\2\2\u00f0\u00fa\5\62\32\2\u00f1\u00f2\5\62\32\2\u00f2"+
		"\u00f3\7+\2\2\u00f3\u00f4\5\60\31\2\u00f4\u00fa\3\2\2\2\u00f5\u00f6\5"+
		"\62\32\2\u00f6\u00f7\7,\2\2\u00f7\u00f8\5\60\31\2\u00f8\u00fa\3\2\2\2"+
		"\u00f9\u00f0\3\2\2\2\u00f9\u00f1\3\2\2\2\u00f9\u00f5\3\2\2\2\u00fa\61"+
		"\3\2\2\2\u00fb\u0109\5\64\33\2\u00fc\u00fd\5\64\33\2\u00fd\u00fe\7-\2"+
		"\2\u00fe\u00ff\5\62\32\2\u00ff\u0109\3\2\2\2\u0100\u0101\5\64\33\2\u0101"+
		"\u0102\7.\2\2\u0102\u0103\5\62\32\2\u0103\u0109\3\2\2\2\u0104\u0105\5"+
		"\64\33\2\u0105\u0106\7/\2\2\u0106\u0107\5\62\32\2\u0107\u0109\3\2\2\2"+
		"\u0108\u00fb\3\2\2\2\u0108\u00fc\3\2\2\2\u0108\u0100\3\2\2\2\u0108\u0104"+
		"\3\2\2\2\u0109\63\3\2\2\2\u010a\u010b\7\30\2\2\u010b\u010c\5\60\31\2\u010c"+
		"\u010d\7\31\2\2\u010d\u0113\3\2\2\2\u010e\u0113\7\60\2\2\u010f\u0113\7"+
		"\61\2\2\u0110\u0113\5\34\17\2\u0111\u0113\7\65\2\2\u0112\u010a\3\2\2\2"+
		"\u0112\u010e\3\2\2\2\u0112\u010f\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0111"+
		"\3\2\2\2\u0113\65\3\2\2\2\u0114\u0115\5\60\31\2\u0115\u0116\58\35\2\u0116"+
		"\u0117\5\60\31\2\u0117\u0122\3\2\2\2\u0118\u0119\5:\36\2\u0119\u011a\7"+
		"%\2\2\u011a\u011b\5\66\34\2\u011b\u0122\3\2\2\2\u011c\u011d\5:\36\2\u011d"+
		"\u011e\7(\2\2\u011e\u011f\5\66\34\2\u011f\u0122\3\2\2\2\u0120\u0122\5"+
		":\36\2\u0121\u0114\3\2\2\2\u0121\u0118\3\2\2\2\u0121\u011c\3\2\2\2\u0121"+
		"\u0120\3\2\2\2\u0122\67\3\2\2\2\u0123\u012a\7%\2\2\u0124\u012a\7(\2\2"+
		"\u0125\u012a\7\'\2\2\u0126\u012a\7&\2\2\u0127\u012a\7\"\2\2\u0128\u012a"+
		"\7#\2\2\u0129\u0123\3\2\2\2\u0129\u0124\3\2\2\2\u0129\u0125\3\2\2\2\u0129"+
		"\u0126\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u0128\3\2\2\2\u012a9\3\2\2\2"+
		"\u012b\u012c\5<\37\2\u012c\u012d\7*\2\2\u012d\u012e\5:\36\2\u012e\u0131"+
		"\3\2\2\2\u012f\u0131\5<\37\2\u0130\u012b\3\2\2\2\u0130\u012f\3\2\2\2\u0131"+
		";\3\2\2\2\u0132\u0133\5> \2\u0133\u0134\7)\2\2\u0134\u0135\5<\37\2\u0135"+
		"\u0138\3\2\2\2\u0136\u0138\5> \2\u0137\u0132\3\2\2\2\u0137\u0136\3\2\2"+
		"\2\u0138=\3\2\2\2\u0139\u013a\7\30\2\2\u013a\u013b\5\66\34\2\u013b\u013c"+
		"\7\31\2\2\u013c\u0142\3\2\2\2\u013d\u013e\7$\2\2\u013e\u0142\5\66\34\2"+
		"\u013f\u0142\7\64\2\2\u0140\u0142\7\65\2\2\u0141\u0139\3\2\2\2\u0141\u013d"+
		"\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0140\3\2\2\2\u0142?\3\2\2\2\30CZ`"+
		"fmt~\u0099\u00a1\u00b2\u00b6\u00bd\u00c9\u00ee\u00f9\u0108\u0112\u0121"+
		"\u0129\u0130\u0137\u0141";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
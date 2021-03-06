// Generated from C:\Users\LorddMichael\git\CC\New folder\New folder\CodeCraft-Interpreter\COMPILE-CodeCraft-Interpreter\src\gen\CodeCraftGrammar.g4 by ANTLR 4.1

package gen;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CodeCraftGrammarLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'print'", "'println'", "'absolute'", "'darkness'", "'mine'", "'choke'", 
		"'wether'", "'otherwise'", "'until'", "'execute'", "'as'", "'reply'", 
		"'NULL'", "'int'", "'char'", "'string'", "'float'", "'boolean'", "'('", 
		"')'", "'{'", "'}'", "';'", "','", "'='", "'>'", "'<'", "'!'", "'=='", 
		"'<='", "'>='", "'!='", "'&&'", "'||'", "'+'", "'-'", "'*'", "'/'", "'%'", 
		"IntegerLiteral", "FloatingPointLiteral", "CharacterLiteral", "StringLiteral", 
		"BooleanLiteral", "ID", "WS", "COMMENT", "LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"PRINT", "PRINTLN", "ABSOLUTE", "DARKNESS", "MINE", "CHOKE", "WETHER", 
		"OTHERWISE", "UNTIL", "EXECUTE", "AS", "REPLY", "NULL", "INT", "CHAR", 
		"STRING", "FLOAT", "BOOLEAN", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
		"SEMI", "COMMA", "ASSIGN", "GT", "LT", "BANG", "EQUAL", "LE", "GE", "NOTEQUAL", 
		"AND", "OR", "ADD", "SUB", "MUL", "DIV", "MOD", "IntegerLiteral", "Digits", 
		"Digit", "NonZeroDigit", "FloatingPointLiteral", "CharacterLiteral", "SingleCharacter", 
		"StringLiteral", "StringCharacters", "StringCharacter", "EscapeSequence", 
		"BooleanLiteral", "ID", "Letter", "LetterOrDigit", "WS", "COMMENT", "LINE_COMMENT"
	};


	public CodeCraftGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CodeCraftGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 54: WS_action((RuleContext)_localctx, actionIndex); break;

		case 55: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 56: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}
	private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 52: return Letter_sempred((RuleContext)_localctx, predIndex);

		case 53: return LetterOrDigit_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean LetterOrDigit_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return Character.isJavaIdentifierPart(_input.LA(-1));

		case 3: return Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}
	private boolean Letter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return Character.isJavaIdentifierStart(_input.LA(-1));

		case 1: return Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\62\u0198\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3"+
		"(\3)\3)\3)\3)\5)\u0120\n)\3*\3*\3*\3*\3*\5*\u0127\n*\3+\3+\5+\u012b\n"+
		"+\3,\3,\3-\3-\3-\5-\u0132\n-\3-\3-\5-\u0136\n-\3.\3.\3.\3.\3.\3.\3.\3"+
		".\5.\u0140\n.\3/\3/\3\60\3\60\5\60\u0146\n\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\61\5\61\u014e\n\61\3\62\3\62\5\62\u0152\n\62\3\63\3\63\3\63\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0160\n\64\3\65\3\65\7\65"+
		"\u0164\n\65\f\65\16\65\u0167\13\65\3\66\3\66\3\66\3\66\3\66\3\66\5\66"+
		"\u016f\n\66\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u0177\n\67\38\68\u017a"+
		"\n8\r8\168\u017b\38\38\39\39\39\39\79\u0184\n9\f9\169\u0187\139\39\39"+
		"\39\39\39\3:\3:\3:\3:\7:\u0192\n:\f:\16:\u0195\13:\3:\3:\3\u0185;\3\3"+
		"\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1"+
		"\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1"+
		"-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1"+
		"C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S\2\1U\2\1W\2\1Y+\1[,\1]\2\1_-\1a\2\1"+
		"c\2\1e\2\1g.\1i/\1k\2\1m\2\1o\60\2q\61\3s\62\4\3\2\r\3\2\63;\4\2))^^\4"+
		"\2$$^^\n\2$$))^^ddhhppttvv\6\2&&C\\aac|\4\2\2\u0101\ud802\udc01\3\2\ud802"+
		"\udc01\3\2\udc02\ue001\7\2&&\62;C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17"+
		"\17\u01a1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2_\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2o\3\2\2\2\2q\3\2"+
		"\2\2\2s\3\2\2\2\3u\3\2\2\2\5{\3\2\2\2\7\u0083\3\2\2\2\t\u008c\3\2\2\2"+
		"\13\u0095\3\2\2\2\r\u009a\3\2\2\2\17\u00a0\3\2\2\2\21\u00a7\3\2\2\2\23"+
		"\u00b1\3\2\2\2\25\u00b7\3\2\2\2\27\u00bf\3\2\2\2\31\u00c2\3\2\2\2\33\u00c8"+
		"\3\2\2\2\35\u00cd\3\2\2\2\37\u00d1\3\2\2\2!\u00d6\3\2\2\2#\u00dd\3\2\2"+
		"\2%\u00e3\3\2\2\2\'\u00eb\3\2\2\2)\u00ed\3\2\2\2+\u00ef\3\2\2\2-\u00f1"+
		"\3\2\2\2/\u00f3\3\2\2\2\61\u00f5\3\2\2\2\63\u00f7\3\2\2\2\65\u00f9\3\2"+
		"\2\2\67\u00fb\3\2\2\29\u00fd\3\2\2\2;\u00ff\3\2\2\2=\u0102\3\2\2\2?\u0105"+
		"\3\2\2\2A\u0108\3\2\2\2C\u010b\3\2\2\2E\u010e\3\2\2\2G\u0111\3\2\2\2I"+
		"\u0113\3\2\2\2K\u0115\3\2\2\2M\u0117\3\2\2\2O\u0119\3\2\2\2Q\u011f\3\2"+
		"\2\2S\u0126\3\2\2\2U\u012a\3\2\2\2W\u012c\3\2\2\2Y\u0135\3\2\2\2[\u013f"+
		"\3\2\2\2]\u0141\3\2\2\2_\u0143\3\2\2\2a\u014d\3\2\2\2c\u0151\3\2\2\2e"+
		"\u0153\3\2\2\2g\u015f\3\2\2\2i\u0161\3\2\2\2k\u016e\3\2\2\2m\u0176\3\2"+
		"\2\2o\u0179\3\2\2\2q\u017f\3\2\2\2s\u018d\3\2\2\2uv\7r\2\2vw\7t\2\2wx"+
		"\7k\2\2xy\7p\2\2yz\7v\2\2z\4\3\2\2\2{|\7r\2\2|}\7t\2\2}~\7k\2\2~\177\7"+
		"p\2\2\177\u0080\7v\2\2\u0080\u0081\7n\2\2\u0081\u0082\7p\2\2\u0082\6\3"+
		"\2\2\2\u0083\u0084\7c\2\2\u0084\u0085\7d\2\2\u0085\u0086\7u\2\2\u0086"+
		"\u0087\7q\2\2\u0087\u0088\7n\2\2\u0088\u0089\7w\2\2\u0089\u008a\7v\2\2"+
		"\u008a\u008b\7g\2\2\u008b\b\3\2\2\2\u008c\u008d\7f\2\2\u008d\u008e\7c"+
		"\2\2\u008e\u008f\7t\2\2\u008f\u0090\7m\2\2\u0090\u0091\7p\2\2\u0091\u0092"+
		"\7g\2\2\u0092\u0093\7u\2\2\u0093\u0094\7u\2\2\u0094\n\3\2\2\2\u0095\u0096"+
		"\7o\2\2\u0096\u0097\7k\2\2\u0097\u0098\7p\2\2\u0098\u0099\7g\2\2\u0099"+
		"\f\3\2\2\2\u009a\u009b\7e\2\2\u009b\u009c\7j\2\2\u009c\u009d\7q\2\2\u009d"+
		"\u009e\7m\2\2\u009e\u009f\7g\2\2\u009f\16\3\2\2\2\u00a0\u00a1\7y\2\2\u00a1"+
		"\u00a2\7g\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4\7j\2\2\u00a4\u00a5\7g\2\2"+
		"\u00a5\u00a6\7t\2\2\u00a6\20\3\2\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7"+
		"v\2\2\u00a9\u00aa\7j\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7t\2\2\u00ac\u00ad"+
		"\7y\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7u\2\2\u00af\u00b0\7g\2\2\u00b0"+
		"\22\3\2\2\2\u00b1\u00b2\7w\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4\7v\2\2\u00b4"+
		"\u00b5\7k\2\2\u00b5\u00b6\7n\2\2\u00b6\24\3\2\2\2\u00b7\u00b8\7g\2\2\u00b8"+
		"\u00b9\7z\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7e\2\2\u00bb\u00bc\7w\2\2"+
		"\u00bc\u00bd\7v\2\2\u00bd\u00be\7g\2\2\u00be\26\3\2\2\2\u00bf\u00c0\7"+
		"c\2\2\u00c0\u00c1\7u\2\2\u00c1\30\3\2\2\2\u00c2\u00c3\7t\2\2\u00c3\u00c4"+
		"\7g\2\2\u00c4\u00c5\7r\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7\7{\2\2\u00c7"+
		"\32\3\2\2\2\u00c8\u00c9\7P\2\2\u00c9\u00ca\7W\2\2\u00ca\u00cb\7N\2\2\u00cb"+
		"\u00cc\7N\2\2\u00cc\34\3\2\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7p\2\2\u00cf"+
		"\u00d0\7v\2\2\u00d0\36\3\2\2\2\u00d1\u00d2\7e\2\2\u00d2\u00d3\7j\2\2\u00d3"+
		"\u00d4\7c\2\2\u00d4\u00d5\7t\2\2\u00d5 \3\2\2\2\u00d6\u00d7\7u\2\2\u00d7"+
		"\u00d8\7v\2\2\u00d8\u00d9\7t\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7p\2\2"+
		"\u00db\u00dc\7i\2\2\u00dc\"\3\2\2\2\u00dd\u00de\7h\2\2\u00de\u00df\7n"+
		"\2\2\u00df\u00e0\7q\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7v\2\2\u00e2$\3"+
		"\2\2\2\u00e3\u00e4\7d\2\2\u00e4\u00e5\7q\2\2\u00e5\u00e6\7q\2\2\u00e6"+
		"\u00e7\7n\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7c\2\2\u00e9\u00ea\7p\2\2"+
		"\u00ea&\3\2\2\2\u00eb\u00ec\7*\2\2\u00ec(\3\2\2\2\u00ed\u00ee\7+\2\2\u00ee"+
		"*\3\2\2\2\u00ef\u00f0\7}\2\2\u00f0,\3\2\2\2\u00f1\u00f2\7\177\2\2\u00f2"+
		".\3\2\2\2\u00f3\u00f4\7=\2\2\u00f4\60\3\2\2\2\u00f5\u00f6\7.\2\2\u00f6"+
		"\62\3\2\2\2\u00f7\u00f8\7?\2\2\u00f8\64\3\2\2\2\u00f9\u00fa\7@\2\2\u00fa"+
		"\66\3\2\2\2\u00fb\u00fc\7>\2\2\u00fc8\3\2\2\2\u00fd\u00fe\7#\2\2\u00fe"+
		":\3\2\2\2\u00ff\u0100\7?\2\2\u0100\u0101\7?\2\2\u0101<\3\2\2\2\u0102\u0103"+
		"\7>\2\2\u0103\u0104\7?\2\2\u0104>\3\2\2\2\u0105\u0106\7@\2\2\u0106\u0107"+
		"\7?\2\2\u0107@\3\2\2\2\u0108\u0109\7#\2\2\u0109\u010a\7?\2\2\u010aB\3"+
		"\2\2\2\u010b\u010c\7(\2\2\u010c\u010d\7(\2\2\u010dD\3\2\2\2\u010e\u010f"+
		"\7~\2\2\u010f\u0110\7~\2\2\u0110F\3\2\2\2\u0111\u0112\7-\2\2\u0112H\3"+
		"\2\2\2\u0113\u0114\7/\2\2\u0114J\3\2\2\2\u0115\u0116\7,\2\2\u0116L\3\2"+
		"\2\2\u0117\u0118\7\61\2\2\u0118N\3\2\2\2\u0119\u011a\7\'\2\2\u011aP\3"+
		"\2\2\2\u011b\u0120\7\62\2\2\u011c\u011d\5W,\2\u011d\u011e\5S*\2\u011e"+
		"\u0120\3\2\2\2\u011f\u011b\3\2\2\2\u011f\u011c\3\2\2\2\u0120R\3\2\2\2"+
		"\u0121\u0127\5U+\2\u0122\u0123\5U+\2\u0123\u0124\5S*\2\u0124\u0127\3\2"+
		"\2\2\u0125\u0127\3\2\2\2\u0126\u0121\3\2\2\2\u0126\u0122\3\2\2\2\u0126"+
		"\u0125\3\2\2\2\u0127T\3\2\2\2\u0128\u012b\7\62\2\2\u0129\u012b\5W,\2\u012a"+
		"\u0128\3\2\2\2\u012a\u0129\3\2\2\2\u012bV\3\2\2\2\u012c\u012d\t\2\2\2"+
		"\u012dX\3\2\2\2\u012e\u012f\5S*\2\u012f\u0131\7\60\2\2\u0130\u0132\5S"+
		"*\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0136\3\2\2\2\u0133"+
		"\u0134\7\60\2\2\u0134\u0136\5S*\2\u0135\u012e\3\2\2\2\u0135\u0133\3\2"+
		"\2\2\u0136Z\3\2\2\2\u0137\u0138\7)\2\2\u0138\u0139\5]/\2\u0139\u013a\7"+
		")\2\2\u013a\u0140\3\2\2\2\u013b\u013c\7)\2\2\u013c\u013d\5e\63\2\u013d"+
		"\u013e\7)\2\2\u013e\u0140\3\2\2\2\u013f\u0137\3\2\2\2\u013f\u013b\3\2"+
		"\2\2\u0140\\\3\2\2\2\u0141\u0142\n\3\2\2\u0142^\3\2\2\2\u0143\u0145\7"+
		"$\2\2\u0144\u0146\5a\61\2\u0145\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
		"\u0147\3\2\2\2\u0147\u0148\7$\2\2\u0148`\3\2\2\2\u0149\u014e\5c\62\2\u014a"+
		"\u014b\5c\62\2\u014b\u014c\5a\61\2\u014c\u014e\3\2\2\2\u014d\u0149\3\2"+
		"\2\2\u014d\u014a\3\2\2\2\u014eb\3\2\2\2\u014f\u0152\n\4\2\2\u0150\u0152"+
		"\5e\63\2\u0151\u014f\3\2\2\2\u0151\u0150\3\2\2\2\u0152d\3\2\2\2\u0153"+
		"\u0154\7^\2\2\u0154\u0155\t\5\2\2\u0155f\3\2\2\2\u0156\u0157\7v\2\2\u0157"+
		"\u0158\7t\2\2\u0158\u0159\7w\2\2\u0159\u0160\7g\2\2\u015a\u015b\7h\2\2"+
		"\u015b\u015c\7c\2\2\u015c\u015d\7n\2\2\u015d\u015e\7u\2\2\u015e\u0160"+
		"\7g\2\2\u015f\u0156\3\2\2\2\u015f\u015a\3\2\2\2\u0160h\3\2\2\2\u0161\u0165"+
		"\5k\66\2\u0162\u0164\5m\67\2\u0163\u0162\3\2\2\2\u0164\u0167\3\2\2\2\u0165"+
		"\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166j\3\2\2\2\u0167\u0165\3\2\2\2"+
		"\u0168\u016f\t\6\2\2\u0169\u016a\n\7\2\2\u016a\u016f\6\66\2\2\u016b\u016c"+
		"\t\b\2\2\u016c\u016d\t\t\2\2\u016d\u016f\6\66\3\2\u016e\u0168\3\2\2\2"+
		"\u016e\u0169\3\2\2\2\u016e\u016b\3\2\2\2\u016fl\3\2\2\2\u0170\u0177\t"+
		"\n\2\2\u0171\u0172\n\7\2\2\u0172\u0177\6\67\4\2\u0173\u0174\t\b\2\2\u0174"+
		"\u0175\t\t\2\2\u0175\u0177\6\67\5\2\u0176\u0170\3\2\2\2\u0176\u0171\3"+
		"\2\2\2\u0176\u0173\3\2\2\2\u0177n\3\2\2\2\u0178\u017a\t\13\2\2\u0179\u0178"+
		"\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c"+
		"\u017d\3\2\2\2\u017d\u017e\b8\2\2\u017ep\3\2\2\2\u017f\u0180\7\61\2\2"+
		"\u0180\u0181\7,\2\2\u0181\u0185\3\2\2\2\u0182\u0184\13\2\2\2\u0183\u0182"+
		"\3\2\2\2\u0184\u0187\3\2\2\2\u0185\u0186\3\2\2\2\u0185\u0183\3\2\2\2\u0186"+
		"\u0188\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u0189\7,\2\2\u0189\u018a\7\61"+
		"\2\2\u018a\u018b\3\2\2\2\u018b\u018c\b9\3\2\u018cr\3\2\2\2\u018d\u018e"+
		"\7\61\2\2\u018e\u018f\7\61\2\2\u018f\u0193\3\2\2\2\u0190\u0192\n\f\2\2"+
		"\u0191\u0190\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194"+
		"\3\2\2\2\u0194\u0196\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0197\b:\4\2\u0197"+
		"t\3\2\2\2\23\2\u011f\u0126\u012a\u0131\u0135\u013f\u0145\u014d\u0151\u015f"+
		"\u0165\u016e\u0176\u017b\u0185\u0193";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
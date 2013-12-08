// Generated from C:\Users\LorddMichael\eclipse workspace\COMPILE-CodeCraft-Interpreter\src\antlr4\CodeCraftGrammar.g4 by ANTLR 4.1

package antlr4;

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
		PRINT=1, PRINTLN=2, SUMMON=3, PARTY=4, ABSOLUTE=5, DARKNESS=6, MINE=7, 
		CHOKE=8, PROLONG=9, WETHER=10, OTHERWISE=11, UNTIL=12, EXECUTE=13, AS=14, 
		REPLY=15, NULL=16, INT=17, CHAR=18, STRING=19, FLOAT=20, BOOLEAN=21, LPAREN=22, 
		RPAREN=23, LBRACE=24, RBRACE=25, LBRACK=26, RBRACK=27, SEMI=28, COMMA=29, 
		DOT=30, ASSIGN=31, GT=32, LT=33, BANG=34, EQUAL=35, LE=36, GE=37, NOTEQUAL=38, 
		AND=39, OR=40, ADD=41, SUB=42, MUL=43, DIV=44, MOD=45, IntegerLiteral=46, 
		FloatingPointLiteral=47, CharacterLiteral=48, StringLiteral=49, BooleanLiteral=50, 
		ID=51, WS=52, COMMENT=53, LINE_COMMENT=54;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'print'", "'println'", "'summon'", "'party'", "'absolute'", "'darkness'", 
		"'mine'", "'choke'", "'prolong'", "'wether'", "'otherwise'", "'until'", 
		"'execute'", "'as'", "'reply'", "'NULL'", "'int'", "'char'", "'string'", 
		"'float'", "'boolean'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", 
		"','", "'.'", "'='", "'>'", "'<'", "'!'", "'=='", "'<='", "'>='", "'!='", 
		"'&&'", "'||'", "'+'", "'-'", "'*'", "'/'", "'%'", "IntegerLiteral", "FloatingPointLiteral", 
		"CharacterLiteral", "StringLiteral", "BooleanLiteral", "ID", "WS", "COMMENT", 
		"LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"PRINT", "PRINTLN", "SUMMON", "PARTY", "ABSOLUTE", "DARKNESS", "MINE", 
		"CHOKE", "PROLONG", "WETHER", "OTHERWISE", "UNTIL", "EXECUTE", "AS", "REPLY", 
		"NULL", "INT", "CHAR", "STRING", "FLOAT", "BOOLEAN", "LPAREN", "RPAREN", 
		"LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", 
		"GT", "LT", "BANG", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "ADD", 
		"SUB", "MUL", "DIV", "MOD", "IntegerLiteral", "Digits", "Digit", "NonZeroDigit", 
		"FloatingPointLiteral", "CharacterLiteral", "SingleCharacter", "StringLiteral", 
		"StringCharacters", "StringCharacter", "EscapeSequence", "BooleanLiteral", 
		"ID", "Letter", "LetterOrDigit", "WS", "COMMENT", "LINE_COMMENT"
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
		case 60: WS_action((RuleContext)_localctx, actionIndex); break;

		case 61: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 62: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		case 58: return Letter_sempred((RuleContext)_localctx, predIndex);

		case 59: return LetterOrDigit_sempred((RuleContext)_localctx, predIndex);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\28\u01bf\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%"+
		"\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3."+
		"\3/\3/\3/\3/\5/\u0147\n/\3\60\3\60\3\60\3\60\3\60\5\60\u014e\n\60\3\61"+
		"\3\61\5\61\u0152\n\61\3\62\3\62\3\63\3\63\3\63\5\63\u0159\n\63\3\63\3"+
		"\63\5\63\u015d\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0167"+
		"\n\64\3\65\3\65\3\66\3\66\5\66\u016d\n\66\3\66\3\66\3\67\3\67\3\67\3\67"+
		"\5\67\u0175\n\67\38\38\58\u0179\n8\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3"+
		":\5:\u0187\n:\3;\3;\7;\u018b\n;\f;\16;\u018e\13;\3<\3<\3<\3<\3<\3<\5<"+
		"\u0196\n<\3=\3=\3=\3=\3=\3=\5=\u019e\n=\3>\6>\u01a1\n>\r>\16>\u01a2\3"+
		">\3>\3?\3?\3?\3?\7?\u01ab\n?\f?\16?\u01ae\13?\3?\3?\3?\3?\3?\3@\3@\3@"+
		"\3@\7@\u01b9\n@\f@\16@\u01bc\13@\3@\3@\3\u01acA\3\3\1\5\4\1\7\5\1\t\6"+
		"\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35"+
		"\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1"+
		"\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1"+
		"M(\1O)\1Q*\1S+\1U,\1W-\1Y.\1[/\1]\60\1_\2\1a\2\1c\2\1e\61\1g\62\1i\2\1"+
		"k\63\1m\2\1o\2\1q\2\1s\64\1u\65\1w\2\1y\2\1{\66\2}\67\3\1778\4\3\2\r\3"+
		"\2\63;\4\2))^^\4\2$$^^\n\2$$))^^ddhhppttvv\6\2&&C\\aac|\4\2\2\u0101\ud802"+
		"\udc01\3\2\ud802\udc01\3\2\udc02\ue001\7\2&&\62;C\\aac|\5\2\13\f\16\17"+
		"\"\"\4\2\f\f\17\17\u01c8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2k\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2{\3\2\2"+
		"\2\2}\3\2\2\2\2\177\3\2\2\2\3\u0081\3\2\2\2\5\u0087\3\2\2\2\7\u008f\3"+
		"\2\2\2\t\u0096\3\2\2\2\13\u009c\3\2\2\2\r\u00a5\3\2\2\2\17\u00ae\3\2\2"+
		"\2\21\u00b3\3\2\2\2\23\u00b9\3\2\2\2\25\u00c1\3\2\2\2\27\u00c8\3\2\2\2"+
		"\31\u00d2\3\2\2\2\33\u00d8\3\2\2\2\35\u00e0\3\2\2\2\37\u00e3\3\2\2\2!"+
		"\u00e9\3\2\2\2#\u00ee\3\2\2\2%\u00f2\3\2\2\2\'\u00f7\3\2\2\2)\u00fe\3"+
		"\2\2\2+\u0104\3\2\2\2-\u010c\3\2\2\2/\u010e\3\2\2\2\61\u0110\3\2\2\2\63"+
		"\u0112\3\2\2\2\65\u0114\3\2\2\2\67\u0116\3\2\2\29\u0118\3\2\2\2;\u011a"+
		"\3\2\2\2=\u011c\3\2\2\2?\u011e\3\2\2\2A\u0120\3\2\2\2C\u0122\3\2\2\2E"+
		"\u0124\3\2\2\2G\u0126\3\2\2\2I\u0129\3\2\2\2K\u012c\3\2\2\2M\u012f\3\2"+
		"\2\2O\u0132\3\2\2\2Q\u0135\3\2\2\2S\u0138\3\2\2\2U\u013a\3\2\2\2W\u013c"+
		"\3\2\2\2Y\u013e\3\2\2\2[\u0140\3\2\2\2]\u0146\3\2\2\2_\u014d\3\2\2\2a"+
		"\u0151\3\2\2\2c\u0153\3\2\2\2e\u015c\3\2\2\2g\u0166\3\2\2\2i\u0168\3\2"+
		"\2\2k\u016a\3\2\2\2m\u0174\3\2\2\2o\u0178\3\2\2\2q\u017a\3\2\2\2s\u0186"+
		"\3\2\2\2u\u0188\3\2\2\2w\u0195\3\2\2\2y\u019d\3\2\2\2{\u01a0\3\2\2\2}"+
		"\u01a6\3\2\2\2\177\u01b4\3\2\2\2\u0081\u0082\7r\2\2\u0082\u0083\7t\2\2"+
		"\u0083\u0084\7k\2\2\u0084\u0085\7p\2\2\u0085\u0086\7v\2\2\u0086\4\3\2"+
		"\2\2\u0087\u0088\7r\2\2\u0088\u0089\7t\2\2\u0089\u008a\7k\2\2\u008a\u008b"+
		"\7p\2\2\u008b\u008c\7v\2\2\u008c\u008d\7n\2\2\u008d\u008e\7p\2\2\u008e"+
		"\6\3\2\2\2\u008f\u0090\7u\2\2\u0090\u0091\7w\2\2\u0091\u0092\7o\2\2\u0092"+
		"\u0093\7o\2\2\u0093\u0094\7q\2\2\u0094\u0095\7p\2\2\u0095\b\3\2\2\2\u0096"+
		"\u0097\7r\2\2\u0097\u0098\7c\2\2\u0098\u0099\7t\2\2\u0099\u009a\7v\2\2"+
		"\u009a\u009b\7{\2\2\u009b\n\3\2\2\2\u009c\u009d\7c\2\2\u009d\u009e\7d"+
		"\2\2\u009e\u009f\7u\2\2\u009f\u00a0\7q\2\2\u00a0\u00a1\7n\2\2\u00a1\u00a2"+
		"\7w\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4\7g\2\2\u00a4\f\3\2\2\2\u00a5\u00a6"+
		"\7f\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7t\2\2\u00a8\u00a9\7m\2\2\u00a9"+
		"\u00aa\7p\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7u\2\2\u00ac\u00ad\7u\2\2"+
		"\u00ad\16\3\2\2\2\u00ae\u00af\7o\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7"+
		"p\2\2\u00b1\u00b2\7g\2\2\u00b2\20\3\2\2\2\u00b3\u00b4\7e\2\2\u00b4\u00b5"+
		"\7j\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7\7m\2\2\u00b7\u00b8\7g\2\2\u00b8"+
		"\22\3\2\2\2\u00b9\u00ba\7r\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7q\2\2\u00bc"+
		"\u00bd\7n\2\2\u00bd\u00be\7q\2\2\u00be\u00bf\7p\2\2\u00bf\u00c0\7i\2\2"+
		"\u00c0\24\3\2\2\2\u00c1\u00c2\7y\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7"+
		"v\2\2\u00c4\u00c5\7j\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7t\2\2\u00c7\26"+
		"\3\2\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb\7j\2\2\u00cb"+
		"\u00cc\7g\2\2\u00cc\u00cd\7t\2\2\u00cd\u00ce\7y\2\2\u00ce\u00cf\7k\2\2"+
		"\u00cf\u00d0\7u\2\2\u00d0\u00d1\7g\2\2\u00d1\30\3\2\2\2\u00d2\u00d3\7"+
		"w\2\2\u00d3\u00d4\7p\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7"+
		"\7n\2\2\u00d7\32\3\2\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7z\2\2\u00da\u00db"+
		"\7g\2\2\u00db\u00dc\7e\2\2\u00dc\u00dd\7w\2\2\u00dd\u00de\7v\2\2\u00de"+
		"\u00df\7g\2\2\u00df\34\3\2\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7u\2\2\u00e2"+
		"\36\3\2\2\2\u00e3\u00e4\7t\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7r\2\2\u00e6"+
		"\u00e7\7n\2\2\u00e7\u00e8\7{\2\2\u00e8 \3\2\2\2\u00e9\u00ea\7P\2\2\u00ea"+
		"\u00eb\7W\2\2\u00eb\u00ec\7N\2\2\u00ec\u00ed\7N\2\2\u00ed\"\3\2\2\2\u00ee"+
		"\u00ef\7k\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1\7v\2\2\u00f1$\3\2\2\2\u00f2"+
		"\u00f3\7e\2\2\u00f3\u00f4\7j\2\2\u00f4\u00f5\7c\2\2\u00f5\u00f6\7t\2\2"+
		"\u00f6&\3\2\2\2\u00f7\u00f8\7u\2\2\u00f8\u00f9\7v\2\2\u00f9\u00fa\7t\2"+
		"\2\u00fa\u00fb\7k\2\2\u00fb\u00fc\7p\2\2\u00fc\u00fd\7i\2\2\u00fd(\3\2"+
		"\2\2\u00fe\u00ff\7h\2\2\u00ff\u0100\7n\2\2\u0100\u0101\7q\2\2\u0101\u0102"+
		"\7c\2\2\u0102\u0103\7v\2\2\u0103*\3\2\2\2\u0104\u0105\7d\2\2\u0105\u0106"+
		"\7q\2\2\u0106\u0107\7q\2\2\u0107\u0108\7n\2\2\u0108\u0109\7g\2\2\u0109"+
		"\u010a\7c\2\2\u010a\u010b\7p\2\2\u010b,\3\2\2\2\u010c\u010d\7*\2\2\u010d"+
		".\3\2\2\2\u010e\u010f\7+\2\2\u010f\60\3\2\2\2\u0110\u0111\7}\2\2\u0111"+
		"\62\3\2\2\2\u0112\u0113\7\177\2\2\u0113\64\3\2\2\2\u0114\u0115\7]\2\2"+
		"\u0115\66\3\2\2\2\u0116\u0117\7_\2\2\u01178\3\2\2\2\u0118\u0119\7=\2\2"+
		"\u0119:\3\2\2\2\u011a\u011b\7.\2\2\u011b<\3\2\2\2\u011c\u011d\7\60\2\2"+
		"\u011d>\3\2\2\2\u011e\u011f\7?\2\2\u011f@\3\2\2\2\u0120\u0121\7@\2\2\u0121"+
		"B\3\2\2\2\u0122\u0123\7>\2\2\u0123D\3\2\2\2\u0124\u0125\7#\2\2\u0125F"+
		"\3\2\2\2\u0126\u0127\7?\2\2\u0127\u0128\7?\2\2\u0128H\3\2\2\2\u0129\u012a"+
		"\7>\2\2\u012a\u012b\7?\2\2\u012bJ\3\2\2\2\u012c\u012d\7@\2\2\u012d\u012e"+
		"\7?\2\2\u012eL\3\2\2\2\u012f\u0130\7#\2\2\u0130\u0131\7?\2\2\u0131N\3"+
		"\2\2\2\u0132\u0133\7(\2\2\u0133\u0134\7(\2\2\u0134P\3\2\2\2\u0135\u0136"+
		"\7~\2\2\u0136\u0137\7~\2\2\u0137R\3\2\2\2\u0138\u0139\7-\2\2\u0139T\3"+
		"\2\2\2\u013a\u013b\7/\2\2\u013bV\3\2\2\2\u013c\u013d\7,\2\2\u013dX\3\2"+
		"\2\2\u013e\u013f\7\61\2\2\u013fZ\3\2\2\2\u0140\u0141\7\'\2\2\u0141\\\3"+
		"\2\2\2\u0142\u0147\7\62\2\2\u0143\u0144\5c\62\2\u0144\u0145\5_\60\2\u0145"+
		"\u0147\3\2\2\2\u0146\u0142\3\2\2\2\u0146\u0143\3\2\2\2\u0147^\3\2\2\2"+
		"\u0148\u014e\5a\61\2\u0149\u014a\5a\61\2\u014a\u014b\5_\60\2\u014b\u014e"+
		"\3\2\2\2\u014c\u014e\3\2\2\2\u014d\u0148\3\2\2\2\u014d\u0149\3\2\2\2\u014d"+
		"\u014c\3\2\2\2\u014e`\3\2\2\2\u014f\u0152\7\62\2\2\u0150\u0152\5c\62\2"+
		"\u0151\u014f\3\2\2\2\u0151\u0150\3\2\2\2\u0152b\3\2\2\2\u0153\u0154\t"+
		"\2\2\2\u0154d\3\2\2\2\u0155\u0156\5_\60\2\u0156\u0158\7\60\2\2\u0157\u0159"+
		"\5_\60\2\u0158\u0157\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015d\3\2\2\2\u015a"+
		"\u015b\7\60\2\2\u015b\u015d\5_\60\2\u015c\u0155\3\2\2\2\u015c\u015a\3"+
		"\2\2\2\u015df\3\2\2\2\u015e\u015f\7)\2\2\u015f\u0160\5i\65\2\u0160\u0161"+
		"\7)\2\2\u0161\u0167\3\2\2\2\u0162\u0163\7)\2\2\u0163\u0164\5q9\2\u0164"+
		"\u0165\7)\2\2\u0165\u0167\3\2\2\2\u0166\u015e\3\2\2\2\u0166\u0162\3\2"+
		"\2\2\u0167h\3\2\2\2\u0168\u0169\n\3\2\2\u0169j\3\2\2\2\u016a\u016c\7$"+
		"\2\2\u016b\u016d\5m\67\2\u016c\u016b\3\2\2\2\u016c\u016d\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016e\u016f\7$\2\2\u016fl\3\2\2\2\u0170\u0175\5o8\2\u0171"+
		"\u0172\5o8\2\u0172\u0173\5m\67\2\u0173\u0175\3\2\2\2\u0174\u0170\3\2\2"+
		"\2\u0174\u0171\3\2\2\2\u0175n\3\2\2\2\u0176\u0179\n\4\2\2\u0177\u0179"+
		"\5q9\2\u0178\u0176\3\2\2\2\u0178\u0177\3\2\2\2\u0179p\3\2\2\2\u017a\u017b"+
		"\7^\2\2\u017b\u017c\t\5\2\2\u017cr\3\2\2\2\u017d\u017e\7v\2\2\u017e\u017f"+
		"\7t\2\2\u017f\u0180\7w\2\2\u0180\u0187\7g\2\2\u0181\u0182\7h\2\2\u0182"+
		"\u0183\7c\2\2\u0183\u0184\7n\2\2\u0184\u0185\7u\2\2\u0185\u0187\7g\2\2"+
		"\u0186\u017d\3\2\2\2\u0186\u0181\3\2\2\2\u0187t\3\2\2\2\u0188\u018c\5"+
		"w<\2\u0189\u018b\5y=\2\u018a\u0189\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a"+
		"\3\2\2\2\u018c\u018d\3\2\2\2\u018dv\3\2\2\2\u018e\u018c\3\2\2\2\u018f"+
		"\u0196\t\6\2\2\u0190\u0191\n\7\2\2\u0191\u0196\6<\2\2\u0192\u0193\t\b"+
		"\2\2\u0193\u0194\t\t\2\2\u0194\u0196\6<\3\2\u0195\u018f\3\2\2\2\u0195"+
		"\u0190\3\2\2\2\u0195\u0192\3\2\2\2\u0196x\3\2\2\2\u0197\u019e\t\n\2\2"+
		"\u0198\u0199\n\7\2\2\u0199\u019e\6=\4\2\u019a\u019b\t\b\2\2\u019b\u019c"+
		"\t\t\2\2\u019c\u019e\6=\5\2\u019d\u0197\3\2\2\2\u019d\u0198\3\2\2\2\u019d"+
		"\u019a\3\2\2\2\u019ez\3\2\2\2\u019f\u01a1\t\13\2\2\u01a0\u019f\3\2\2\2"+
		"\u01a1\u01a2\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4"+
		"\3\2\2\2\u01a4\u01a5\b>\2\2\u01a5|\3\2\2\2\u01a6\u01a7\7\61\2\2\u01a7"+
		"\u01a8\7,\2\2\u01a8\u01ac\3\2\2\2\u01a9\u01ab\13\2\2\2\u01aa\u01a9\3\2"+
		"\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad"+
		"\u01af\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b0\7,\2\2\u01b0\u01b1\7\61"+
		"\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\b?\3\2\u01b3~\3\2\2\2\u01b4\u01b5"+
		"\7\61\2\2\u01b5\u01b6\7\61\2\2\u01b6\u01ba\3\2\2\2\u01b7\u01b9\n\f\2\2"+
		"\u01b8\u01b7\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb"+
		"\3\2\2\2\u01bb\u01bd\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd\u01be\b@\4\2\u01be"+
		"\u0080\3\2\2\2\23\2\u0146\u014d\u0151\u0158\u015c\u0166\u016c\u0174\u0178"+
		"\u0186\u018c\u0195\u019d\u01a2\u01ac\u01ba";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
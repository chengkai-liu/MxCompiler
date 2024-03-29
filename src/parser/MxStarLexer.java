// Generated from MxStar.g4 by ANTLR 4.8

package parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MxStarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, Bool=33, Int=34, String=35, Void=36, If=37, Else=38, For=39, 
		While=40, Break=41, Continue=42, Return=43, New=44, Class=45, This=46, 
		WhiteSpace=47, NewLine=48, LineComment=49, BlockComment=50, BoolConst=51, 
		IntConst=52, StringConst=53, NullConst=54, Identifier=55;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "Bool", 
			"Int", "String", "Void", "If", "Else", "For", "While", "Break", "Continue", 
			"Return", "New", "Class", "This", "WhiteSpace", "NewLine", "LineComment", 
			"BlockComment", "BoolConst", "IntConst", "StringConst", "NullConst", 
			"Identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'{'", "'}'", "'('", "')'", "','", "'='", "'['", "']'", 
			"'.'", "'++'", "'--'", "'+'", "'-'", "'~'", "'!'", "'*'", "'/'", "'%'", 
			"'>>'", "'<<'", "'<'", "'>'", "'<='", "'>='", "'!='", "'=='", "'&'", 
			"'^'", "'|'", "'&&'", "'||'", "'bool'", "'int'", "'string'", "'void'", 
			"'if'", "'else'", "'for'", "'while'", "'break'", "'continue'", "'return'", 
			"'new'", "'class'", "'this'", null, null, null, null, null, null, null, 
			"'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "Bool", "Int", 
			"String", "Void", "If", "Else", "For", "While", "Break", "Continue", 
			"Return", "New", "Class", "This", "WhiteSpace", "NewLine", "LineComment", 
			"BlockComment", "BoolConst", "IntConst", "StringConst", "NullConst", 
			"Identifier"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public MxStarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MxStar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u015c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3"+
		"$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)"+
		"\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,"+
		"\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\6\60\u0109"+
		"\n\60\r\60\16\60\u010a\3\60\3\60\3\61\3\61\5\61\u0111\n\61\3\61\5\61\u0114"+
		"\n\61\3\61\3\61\3\62\3\62\3\62\3\62\7\62\u011c\n\62\f\62\16\62\u011f\13"+
		"\62\3\62\3\62\3\63\3\63\3\63\3\63\7\63\u0127\n\63\f\63\16\63\u012a\13"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\5\64\u013a\n\64\3\65\3\65\7\65\u013e\n\65\f\65\16\65\u0141\13\65\3"+
		"\65\5\65\u0144\n\65\3\66\3\66\3\66\3\66\7\66\u014a\n\66\f\66\16\66\u014d"+
		"\13\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\78\u0158\n8\f8\168\u015b"+
		"\138\3\u0128\29\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8o9\3\2\n\4\2\13\13\"\"\4\2\f\f\17\17\3\2\63;\3\2\62;\6\2"+
		"\f\f\17\17$$^^\5\2$$^^pp\4\2C\\c|\6\2\62;C\\aac|\2\u0166\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\3"+
		"q\3\2\2\2\5s\3\2\2\2\7u\3\2\2\2\tw\3\2\2\2\13y\3\2\2\2\r{\3\2\2\2\17}"+
		"\3\2\2\2\21\177\3\2\2\2\23\u0081\3\2\2\2\25\u0083\3\2\2\2\27\u0085\3\2"+
		"\2\2\31\u0088\3\2\2\2\33\u008b\3\2\2\2\35\u008d\3\2\2\2\37\u008f\3\2\2"+
		"\2!\u0091\3\2\2\2#\u0093\3\2\2\2%\u0095\3\2\2\2\'\u0097\3\2\2\2)\u0099"+
		"\3\2\2\2+\u009c\3\2\2\2-\u009f\3\2\2\2/\u00a1\3\2\2\2\61\u00a3\3\2\2\2"+
		"\63\u00a6\3\2\2\2\65\u00a9\3\2\2\2\67\u00ac\3\2\2\29\u00af\3\2\2\2;\u00b1"+
		"\3\2\2\2=\u00b3\3\2\2\2?\u00b5\3\2\2\2A\u00b8\3\2\2\2C\u00bb\3\2\2\2E"+
		"\u00c0\3\2\2\2G\u00c4\3\2\2\2I\u00cb\3\2\2\2K\u00d0\3\2\2\2M\u00d3\3\2"+
		"\2\2O\u00d8\3\2\2\2Q\u00dc\3\2\2\2S\u00e2\3\2\2\2U\u00e8\3\2\2\2W\u00f1"+
		"\3\2\2\2Y\u00f8\3\2\2\2[\u00fc\3\2\2\2]\u0102\3\2\2\2_\u0108\3\2\2\2a"+
		"\u0113\3\2\2\2c\u0117\3\2\2\2e\u0122\3\2\2\2g\u0139\3\2\2\2i\u0143\3\2"+
		"\2\2k\u0145\3\2\2\2m\u0150\3\2\2\2o\u0155\3\2\2\2qr\7=\2\2r\4\3\2\2\2"+
		"st\7}\2\2t\6\3\2\2\2uv\7\177\2\2v\b\3\2\2\2wx\7*\2\2x\n\3\2\2\2yz\7+\2"+
		"\2z\f\3\2\2\2{|\7.\2\2|\16\3\2\2\2}~\7?\2\2~\20\3\2\2\2\177\u0080\7]\2"+
		"\2\u0080\22\3\2\2\2\u0081\u0082\7_\2\2\u0082\24\3\2\2\2\u0083\u0084\7"+
		"\60\2\2\u0084\26\3\2\2\2\u0085\u0086\7-\2\2\u0086\u0087\7-\2\2\u0087\30"+
		"\3\2\2\2\u0088\u0089\7/\2\2\u0089\u008a\7/\2\2\u008a\32\3\2\2\2\u008b"+
		"\u008c\7-\2\2\u008c\34\3\2\2\2\u008d\u008e\7/\2\2\u008e\36\3\2\2\2\u008f"+
		"\u0090\7\u0080\2\2\u0090 \3\2\2\2\u0091\u0092\7#\2\2\u0092\"\3\2\2\2\u0093"+
		"\u0094\7,\2\2\u0094$\3\2\2\2\u0095\u0096\7\61\2\2\u0096&\3\2\2\2\u0097"+
		"\u0098\7\'\2\2\u0098(\3\2\2\2\u0099\u009a\7@\2\2\u009a\u009b\7@\2\2\u009b"+
		"*\3\2\2\2\u009c\u009d\7>\2\2\u009d\u009e\7>\2\2\u009e,\3\2\2\2\u009f\u00a0"+
		"\7>\2\2\u00a0.\3\2\2\2\u00a1\u00a2\7@\2\2\u00a2\60\3\2\2\2\u00a3\u00a4"+
		"\7>\2\2\u00a4\u00a5\7?\2\2\u00a5\62\3\2\2\2\u00a6\u00a7\7@\2\2\u00a7\u00a8"+
		"\7?\2\2\u00a8\64\3\2\2\2\u00a9\u00aa\7#\2\2\u00aa\u00ab\7?\2\2\u00ab\66"+
		"\3\2\2\2\u00ac\u00ad\7?\2\2\u00ad\u00ae\7?\2\2\u00ae8\3\2\2\2\u00af\u00b0"+
		"\7(\2\2\u00b0:\3\2\2\2\u00b1\u00b2\7`\2\2\u00b2<\3\2\2\2\u00b3\u00b4\7"+
		"~\2\2\u00b4>\3\2\2\2\u00b5\u00b6\7(\2\2\u00b6\u00b7\7(\2\2\u00b7@\3\2"+
		"\2\2\u00b8\u00b9\7~\2\2\u00b9\u00ba\7~\2\2\u00baB\3\2\2\2\u00bb\u00bc"+
		"\7d\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7q\2\2\u00be\u00bf\7n\2\2\u00bf"+
		"D\3\2\2\2\u00c0\u00c1\7k\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7v\2\2\u00c3"+
		"F\3\2\2\2\u00c4\u00c5\7u\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7\7t\2\2\u00c7"+
		"\u00c8\7k\2\2\u00c8\u00c9\7p\2\2\u00c9\u00ca\7i\2\2\u00caH\3\2\2\2\u00cb"+
		"\u00cc\7x\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7f\2\2"+
		"\u00cfJ\3\2\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7h\2\2\u00d2L\3\2\2\2\u00d3"+
		"\u00d4\7g\2\2\u00d4\u00d5\7n\2\2\u00d5\u00d6\7u\2\2\u00d6\u00d7\7g\2\2"+
		"\u00d7N\3\2\2\2\u00d8\u00d9\7h\2\2\u00d9\u00da\7q\2\2\u00da\u00db\7t\2"+
		"\2\u00dbP\3\2\2\2\u00dc\u00dd\7y\2\2\u00dd\u00de\7j\2\2\u00de\u00df\7"+
		"k\2\2\u00df\u00e0\7n\2\2\u00e0\u00e1\7g\2\2\u00e1R\3\2\2\2\u00e2\u00e3"+
		"\7d\2\2\u00e3\u00e4\7t\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7c\2\2\u00e6"+
		"\u00e7\7m\2\2\u00e7T\3\2\2\2\u00e8\u00e9\7e\2\2\u00e9\u00ea\7q\2\2\u00ea"+
		"\u00eb\7p\2\2\u00eb\u00ec\7v\2\2\u00ec\u00ed\7k\2\2\u00ed\u00ee\7p\2\2"+
		"\u00ee\u00ef\7w\2\2\u00ef\u00f0\7g\2\2\u00f0V\3\2\2\2\u00f1\u00f2\7t\2"+
		"\2\u00f2\u00f3\7g\2\2\u00f3\u00f4\7v\2\2\u00f4\u00f5\7w\2\2\u00f5\u00f6"+
		"\7t\2\2\u00f6\u00f7\7p\2\2\u00f7X\3\2\2\2\u00f8\u00f9\7p\2\2\u00f9\u00fa"+
		"\7g\2\2\u00fa\u00fb\7y\2\2\u00fbZ\3\2\2\2\u00fc\u00fd\7e\2\2\u00fd\u00fe"+
		"\7n\2\2\u00fe\u00ff\7c\2\2\u00ff\u0100\7u\2\2\u0100\u0101\7u\2\2\u0101"+
		"\\\3\2\2\2\u0102\u0103\7v\2\2\u0103\u0104\7j\2\2\u0104\u0105\7k\2\2\u0105"+
		"\u0106\7u\2\2\u0106^\3\2\2\2\u0107\u0109\t\2\2\2\u0108\u0107\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2"+
		"\2\2\u010c\u010d\b\60\2\2\u010d`\3\2\2\2\u010e\u0110\7\17\2\2\u010f\u0111"+
		"\7\f\2\2\u0110\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0114\3\2\2\2\u0112"+
		"\u0114\7\f\2\2\u0113\u010e\3\2\2\2\u0113\u0112\3\2\2\2\u0114\u0115\3\2"+
		"\2\2\u0115\u0116\b\61\2\2\u0116b\3\2\2\2\u0117\u0118\7\61\2\2\u0118\u0119"+
		"\7\61\2\2\u0119\u011d\3\2\2\2\u011a\u011c\n\3\2\2\u011b\u011a\3\2\2\2"+
		"\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120"+
		"\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0121\b\62\2\2\u0121d\3\2\2\2\u0122"+
		"\u0123\7\61\2\2\u0123\u0124\7,\2\2\u0124\u0128\3\2\2\2\u0125\u0127\13"+
		"\2\2\2\u0126\u0125\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0129\3\2\2\2\u0128"+
		"\u0126\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012c\7,"+
		"\2\2\u012c\u012d\7\61\2\2\u012d\u012e\3\2\2\2\u012e\u012f\b\63\2\2\u012f"+
		"f\3\2\2\2\u0130\u0131\7v\2\2\u0131\u0132\7t\2\2\u0132\u0133\7w\2\2\u0133"+
		"\u013a\7g\2\2\u0134\u0135\7h\2\2\u0135\u0136\7c\2\2\u0136\u0137\7n\2\2"+
		"\u0137\u0138\7u\2\2\u0138\u013a\7g\2\2\u0139\u0130\3\2\2\2\u0139\u0134"+
		"\3\2\2\2\u013ah\3\2\2\2\u013b\u013f\t\4\2\2\u013c\u013e\t\5\2\2\u013d"+
		"\u013c\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2"+
		"\2\2\u0140\u0144\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0144\7\62\2\2\u0143"+
		"\u013b\3\2\2\2\u0143\u0142\3\2\2\2\u0144j\3\2\2\2\u0145\u014b\7$\2\2\u0146"+
		"\u014a\n\6\2\2\u0147\u0148\7^\2\2\u0148\u014a\t\7\2\2\u0149\u0146\3\2"+
		"\2\2\u0149\u0147\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014c\u014e\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u014f\7$"+
		"\2\2\u014fl\3\2\2\2\u0150\u0151\7p\2\2\u0151\u0152\7w\2\2\u0152\u0153"+
		"\7n\2\2\u0153\u0154\7n\2\2\u0154n\3\2\2\2\u0155\u0159\t\b\2\2\u0156\u0158"+
		"\t\t\2\2\u0157\u0156\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015ap\3\2\2\2\u015b\u0159\3\2\2\2\16\2\u010a\u0110\u0113"+
		"\u011d\u0128\u0139\u013f\u0143\u0149\u014b\u0159\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
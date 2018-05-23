package gen;// Generated from D:/Nastya/Java/MatVecCompiler/src\Grammar.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, O_BRACKET=2, C_BRACKET=3, O_FIGURE_BRACKET=4, C_FIGURE_BRACKET=5, 
		MATRIX=6, VECTOR=7, IF=8, ELSE=9, FOR=10, WHILE=11, RETURN=12, FUNCTION=13, 
		SHOW=14, LENGTH=15, GET=16, ADD=17, REMOVE=18, ASSIGN=19, DOT=20, COMMA=21, 
		PLUS=22, MINUS=23, MULTIPLY=24, SEMICOLON=25, EQUAL=26, NON_EQUAL=27, 
		LESS=28, GREATER=29, SPACE=30, NAME=31, NUMBER=32, STRING=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "O_BRACKET", "C_BRACKET", "O_FIGURE_BRACKET", "C_FIGURE_BRACKET", 
		"MATRIX", "VECTOR", "IF", "ELSE", "FOR", "WHILE", "RETURN", "FUNCTION", 
		"SHOW", "LENGTH", "GET", "ADD", "REMOVE", "ASSIGN", "DOT", "COMMA", "PLUS", 
		"MINUS", "MULTIPLY", "SEMICOLON", "EQUAL", "NON_EQUAL", "LESS", "GREATER", 
		"SPACE", "NAME", "NUMBER", "STRING"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'program'", "'('", "')'", "'{'", "'}'", "'matrix'", "'vector'", 
		"'if'", "'else'", "'for'", "'while'", "'return'", "'func'", "'show'", 
		"'length'", "'get'", "'add'", "'remove'", "'='", "'.'", "','", "'+'", 
		"'-'", "'*'", "';'", "'=='", "'!='", "'<'", "'>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "O_BRACKET", "C_BRACKET", "O_FIGURE_BRACKET", "C_FIGURE_BRACKET", 
		"MATRIX", "VECTOR", "IF", "ELSE", "FOR", "WHILE", "RETURN", "FUNCTION", 
		"SHOW", "LENGTH", "GET", "ADD", "REMOVE", "ASSIGN", "DOT", "COMMA", "PLUS", 
		"MINUS", "MULTIPLY", "SEMICOLON", "EQUAL", "NON_EQUAL", "LESS", "GREATER", 
		"SPACE", "NAME", "NUMBER", "STRING"
	};
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u00cf\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\6\37\u00b6\n\37\r\37\16\37\u00b7\3\37\3"+
		"\37\3 \3 \7 \u00be\n \f \16 \u00c1\13 \3!\6!\u00c4\n!\r!\16!\u00c5\3\""+
		"\3\"\6\"\u00ca\n\"\r\"\16\"\u00cb\3\"\3\"\3\u00cb\2#\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#\3\2\6\5\2"+
		"\13\f\17\17\"\"\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\2\u00d2\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2\5M\3\2\2\2\7O\3\2\2\2"+
		"\tQ\3\2\2\2\13S\3\2\2\2\rU\3\2\2\2\17\\\3\2\2\2\21c\3\2\2\2\23f\3\2\2"+
		"\2\25k\3\2\2\2\27o\3\2\2\2\31u\3\2\2\2\33|\3\2\2\2\35\u0081\3\2\2\2\37"+
		"\u0086\3\2\2\2!\u008d\3\2\2\2#\u0091\3\2\2\2%\u0095\3\2\2\2\'\u009c\3"+
		"\2\2\2)\u009e\3\2\2\2+\u00a0\3\2\2\2-\u00a2\3\2\2\2/\u00a4\3\2\2\2\61"+
		"\u00a6\3\2\2\2\63\u00a8\3\2\2\2\65\u00aa\3\2\2\2\67\u00ad\3\2\2\29\u00b0"+
		"\3\2\2\2;\u00b2\3\2\2\2=\u00b5\3\2\2\2?\u00bb\3\2\2\2A\u00c3\3\2\2\2C"+
		"\u00c7\3\2\2\2EF\7r\2\2FG\7t\2\2GH\7q\2\2HI\7i\2\2IJ\7t\2\2JK\7c\2\2K"+
		"L\7o\2\2L\4\3\2\2\2MN\7*\2\2N\6\3\2\2\2OP\7+\2\2P\b\3\2\2\2QR\7}\2\2R"+
		"\n\3\2\2\2ST\7\177\2\2T\f\3\2\2\2UV\7o\2\2VW\7c\2\2WX\7v\2\2XY\7t\2\2"+
		"YZ\7k\2\2Z[\7z\2\2[\16\3\2\2\2\\]\7x\2\2]^\7g\2\2^_\7e\2\2_`\7v\2\2`a"+
		"\7q\2\2ab\7t\2\2b\20\3\2\2\2cd\7k\2\2de\7h\2\2e\22\3\2\2\2fg\7g\2\2gh"+
		"\7n\2\2hi\7u\2\2ij\7g\2\2j\24\3\2\2\2kl\7h\2\2lm\7q\2\2mn\7t\2\2n\26\3"+
		"\2\2\2op\7y\2\2pq\7j\2\2qr\7k\2\2rs\7n\2\2st\7g\2\2t\30\3\2\2\2uv\7t\2"+
		"\2vw\7g\2\2wx\7v\2\2xy\7w\2\2yz\7t\2\2z{\7p\2\2{\32\3\2\2\2|}\7h\2\2}"+
		"~\7w\2\2~\177\7p\2\2\177\u0080\7e\2\2\u0080\34\3\2\2\2\u0081\u0082\7u"+
		"\2\2\u0082\u0083\7j\2\2\u0083\u0084\7q\2\2\u0084\u0085\7y\2\2\u0085\36"+
		"\3\2\2\2\u0086\u0087\7n\2\2\u0087\u0088\7g\2\2\u0088\u0089\7p\2\2\u0089"+
		"\u008a\7i\2\2\u008a\u008b\7v\2\2\u008b\u008c\7j\2\2\u008c \3\2\2\2\u008d"+
		"\u008e\7i\2\2\u008e\u008f\7g\2\2\u008f\u0090\7v\2\2\u0090\"\3\2\2\2\u0091"+
		"\u0092\7c\2\2\u0092\u0093\7f\2\2\u0093\u0094\7f\2\2\u0094$\3\2\2\2\u0095"+
		"\u0096\7t\2\2\u0096\u0097\7g\2\2\u0097\u0098\7o\2\2\u0098\u0099\7q\2\2"+
		"\u0099\u009a\7x\2\2\u009a\u009b\7g\2\2\u009b&\3\2\2\2\u009c\u009d\7?\2"+
		"\2\u009d(\3\2\2\2\u009e\u009f\7\60\2\2\u009f*\3\2\2\2\u00a0\u00a1\7.\2"+
		"\2\u00a1,\3\2\2\2\u00a2\u00a3\7-\2\2\u00a3.\3\2\2\2\u00a4\u00a5\7/\2\2"+
		"\u00a5\60\3\2\2\2\u00a6\u00a7\7,\2\2\u00a7\62\3\2\2\2\u00a8\u00a9\7=\2"+
		"\2\u00a9\64\3\2\2\2\u00aa\u00ab\7?\2\2\u00ab\u00ac\7?\2\2\u00ac\66\3\2"+
		"\2\2\u00ad\u00ae\7#\2\2\u00ae\u00af\7?\2\2\u00af8\3\2\2\2\u00b0\u00b1"+
		"\7>\2\2\u00b1:\3\2\2\2\u00b2\u00b3\7@\2\2\u00b3<\3\2\2\2\u00b4\u00b6\t"+
		"\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\b\37\2\2\u00ba>\3\2\2\2"+
		"\u00bb\u00bf\t\3\2\2\u00bc\u00be\t\4\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c1"+
		"\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0@\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c2\u00c4\t\5\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6B\3\2\2\2\u00c7\u00c9"+
		"\7$\2\2\u00c8\u00ca\13\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\7$"+
		"\2\2\u00ceD\3\2\2\2\7\2\u00b7\u00bf\u00c5\u00cb\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from c:\Users\arycl\Documents\Music-generator\lib\Music.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MusicLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, NOME=8, VALUE=9, 
		NOTE=10, TIME=11, SPACE=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "NOME", "VALUE", 
			"NOTE", "TIME", "SPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'begin'", "'<'", "'>'", "'end'", "'metro'", "'times'", "'play'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "NOME", "VALUE", "NOTE", 
			"TIME", "SPACE"
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


	public MusicLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Music.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16X\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\6\t<\n\t\r\t\16\t=\3\n\6\nA\n\n\r\n\16\nB\3\13\3\13\3\13\3\f"+
		"\6\fI\n\f\r\f\16\fJ\3\f\3\f\6\fO\n\f\r\f\16\fP\5\fS\n\f\3\r\3\r\3\r\3"+
		"\r\2\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\3\2"+
		"\7\4\2C\\c|\3\2\62;\3\2CH\3\2\64;\5\2\13\f\17\17\"\"\2\\\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3"+
		"\33\3\2\2\2\5!\3\2\2\2\7#\3\2\2\2\t%\3\2\2\2\13)\3\2\2\2\r/\3\2\2\2\17"+
		"\65\3\2\2\2\21;\3\2\2\2\23@\3\2\2\2\25D\3\2\2\2\27H\3\2\2\2\31T\3\2\2"+
		"\2\33\34\7d\2\2\34\35\7g\2\2\35\36\7i\2\2\36\37\7k\2\2\37 \7p\2\2 \4\3"+
		"\2\2\2!\"\7>\2\2\"\6\3\2\2\2#$\7@\2\2$\b\3\2\2\2%&\7g\2\2&\'\7p\2\2\'"+
		"(\7f\2\2(\n\3\2\2\2)*\7o\2\2*+\7g\2\2+,\7v\2\2,-\7t\2\2-.\7q\2\2.\f\3"+
		"\2\2\2/\60\7v\2\2\60\61\7k\2\2\61\62\7o\2\2\62\63\7g\2\2\63\64\7u\2\2"+
		"\64\16\3\2\2\2\65\66\7r\2\2\66\67\7n\2\2\678\7c\2\289\7{\2\29\20\3\2\2"+
		"\2:<\t\2\2\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\22\3\2\2\2?A\t\3"+
		"\2\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\24\3\2\2\2DE\t\4\2\2EF\t"+
		"\5\2\2F\26\3\2\2\2GI\t\3\2\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2K"+
		"R\3\2\2\2LN\7\60\2\2MO\t\3\2\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2"+
		"QS\3\2\2\2RL\3\2\2\2RS\3\2\2\2S\30\3\2\2\2TU\t\6\2\2UV\3\2\2\2VW\b\r\2"+
		"\2W\32\3\2\2\2\b\2=BJPR\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
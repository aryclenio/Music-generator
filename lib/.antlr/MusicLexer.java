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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, NOME=7, VALUE=8, NOTE=9, 
		TIME=10, SPACE=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "NOME", "VALUE", "NOTE", 
			"TIME", "SPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'begin <'", "'>'", "'end'", "'metro'", "'times'", "'play'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "NOME", "VALUE", "NOTE", "TIME", 
			"SPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\rV\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\6\b:\n\b\r\b\16\b;\3\t\6\t?\n\t\r\t\16\t@\3\n\3\n\3\n\3\13\6\13G\n\13"+
		"\r\13\16\13H\3\13\3\13\6\13M\n\13\r\13\16\13N\5\13Q\n\13\3\f\3\f\3\f\3"+
		"\f\2\2\r\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\3\2\7\4\2"+
		"C\\c|\3\2\62;\3\2CH\3\2\64;\5\2\13\f\17\17\"\"\2Z\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\31\3\2\2\2\5!\3\2\2"+
		"\2\7#\3\2\2\2\t\'\3\2\2\2\13-\3\2\2\2\r\63\3\2\2\2\179\3\2\2\2\21>\3\2"+
		"\2\2\23B\3\2\2\2\25F\3\2\2\2\27R\3\2\2\2\31\32\7d\2\2\32\33\7g\2\2\33"+
		"\34\7i\2\2\34\35\7k\2\2\35\36\7p\2\2\36\37\7\"\2\2\37 \7>\2\2 \4\3\2\2"+
		"\2!\"\7@\2\2\"\6\3\2\2\2#$\7g\2\2$%\7p\2\2%&\7f\2\2&\b\3\2\2\2\'(\7o\2"+
		"\2()\7g\2\2)*\7v\2\2*+\7t\2\2+,\7q\2\2,\n\3\2\2\2-.\7v\2\2./\7k\2\2/\60"+
		"\7o\2\2\60\61\7g\2\2\61\62\7u\2\2\62\f\3\2\2\2\63\64\7r\2\2\64\65\7n\2"+
		"\2\65\66\7c\2\2\66\67\7{\2\2\67\16\3\2\2\28:\t\2\2\298\3\2\2\2:;\3\2\2"+
		"\2;9\3\2\2\2;<\3\2\2\2<\20\3\2\2\2=?\t\3\2\2>=\3\2\2\2?@\3\2\2\2@>\3\2"+
		"\2\2@A\3\2\2\2A\22\3\2\2\2BC\t\4\2\2CD\t\5\2\2D\24\3\2\2\2EG\t\3\2\2F"+
		"E\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2IP\3\2\2\2JL\7\60\2\2KM\t\3\2\2"+
		"LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PJ\3\2\2\2PQ\3\2\2\2"+
		"Q\26\3\2\2\2RS\t\6\2\2ST\3\2\2\2TU\b\f\2\2U\30\3\2\2\2\b\2;@HNP\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
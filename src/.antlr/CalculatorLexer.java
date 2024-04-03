// Generated from c:/Users/gabri/OneDrive/Documentos/Faculdade/9 periodo/Construção de Interpretadores/codigos_python/antlr/src/calculator.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, NUMBER=3, INTEGER=4, DECIMAL=5, PLUS=6, MINUS=7, MULTIPLY=8, 
		DIVIDE=9, MODULO=10, POWER=11, REAL_DIVIDE=12, RES=13, MEM=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "NUMBER", "INTEGER", "DECIMAL", "PLUS", "MINUS", "MULTIPLY", 
			"DIVIDE", "MODULO", "POWER", "REAL_DIVIDE", "RES", "MEM", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", null, null, null, "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'^'", "'|'", "'RES'", "'MEM'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "NUMBER", "INTEGER", "DECIMAL", "PLUS", "MINUS", "MULTIPLY", 
			"DIVIDE", "MODULO", "POWER", "REAL_DIVIDE", "RES", "MEM", "WS"
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


	public CalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "calculator.g4"; }

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
		"\u0004\u0000\u000fT\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0003"+
		"\u0002&\b\u0002\u0001\u0003\u0004\u0003)\b\u0003\u000b\u0003\f\u0003*"+
		"\u0001\u0004\u0004\u0004.\b\u0004\u000b\u0004\f\u0004/\u0001\u0004\u0001"+
		"\u0004\u0004\u00044\b\u0004\u000b\u0004\f\u00045\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0004\u000eO\b"+
		"\u000e\u000b\u000e\f\u000eP\u0001\u000e\u0001\u000e\u0000\u0000\u000f"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u0001\u0000\u0002\u0001\u000009\u0003\u0000\t\n\r\r  X\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0001\u001f\u0001\u0000\u0000\u0000\u0003!\u0001"+
		"\u0000\u0000\u0000\u0005%\u0001\u0000\u0000\u0000\u0007(\u0001\u0000\u0000"+
		"\u0000\t-\u0001\u0000\u0000\u0000\u000b7\u0001\u0000\u0000\u0000\r9\u0001"+
		"\u0000\u0000\u0000\u000f;\u0001\u0000\u0000\u0000\u0011=\u0001\u0000\u0000"+
		"\u0000\u0013?\u0001\u0000\u0000\u0000\u0015A\u0001\u0000\u0000\u0000\u0017"+
		"C\u0001\u0000\u0000\u0000\u0019E\u0001\u0000\u0000\u0000\u001bI\u0001"+
		"\u0000\u0000\u0000\u001dN\u0001\u0000\u0000\u0000\u001f \u0005(\u0000"+
		"\u0000 \u0002\u0001\u0000\u0000\u0000!\"\u0005)\u0000\u0000\"\u0004\u0001"+
		"\u0000\u0000\u0000#&\u0003\u0007\u0003\u0000$&\u0003\t\u0004\u0000%#\u0001"+
		"\u0000\u0000\u0000%$\u0001\u0000\u0000\u0000&\u0006\u0001\u0000\u0000"+
		"\u0000\')\u0007\u0000\u0000\u0000(\'\u0001\u0000\u0000\u0000)*\u0001\u0000"+
		"\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+\b\u0001"+
		"\u0000\u0000\u0000,.\u0007\u0000\u0000\u0000-,\u0001\u0000\u0000\u0000"+
		"./\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000"+
		"\u000001\u0001\u0000\u0000\u000013\u0005.\u0000\u000024\u0007\u0000\u0000"+
		"\u000032\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000053\u0001\u0000"+
		"\u0000\u000056\u0001\u0000\u0000\u00006\n\u0001\u0000\u0000\u000078\u0005"+
		"+\u0000\u00008\f\u0001\u0000\u0000\u00009:\u0005-\u0000\u0000:\u000e\u0001"+
		"\u0000\u0000\u0000;<\u0005*\u0000\u0000<\u0010\u0001\u0000\u0000\u0000"+
		"=>\u0005/\u0000\u0000>\u0012\u0001\u0000\u0000\u0000?@\u0005%\u0000\u0000"+
		"@\u0014\u0001\u0000\u0000\u0000AB\u0005^\u0000\u0000B\u0016\u0001\u0000"+
		"\u0000\u0000CD\u0005|\u0000\u0000D\u0018\u0001\u0000\u0000\u0000EF\u0005"+
		"R\u0000\u0000FG\u0005E\u0000\u0000GH\u0005S\u0000\u0000H\u001a\u0001\u0000"+
		"\u0000\u0000IJ\u0005M\u0000\u0000JK\u0005E\u0000\u0000KL\u0005M\u0000"+
		"\u0000L\u001c\u0001\u0000\u0000\u0000MO\u0007\u0001\u0000\u0000NM\u0001"+
		"\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000"+
		"PQ\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RS\u0006\u000e\u0000"+
		"\u0000S\u001e\u0001\u0000\u0000\u0000\u0006\u0000%*/5P\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from gramatyka.g4 by ANTLR 4.7.1
package pl.edu.agh.compilers;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramatykaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, OR=2, FUN=3, IF=4, ELSIF=5, ELSE=6, WHILE=7, FOR=8, SWITCH=9, CASE=10, 
		DEFAULT=11, RETURN=12, BREAK=13, LPAR=14, RPAR=15, LCURL=16, RCURL=17, 
		ASSIGN=18, PLUS=19, MINUS=20, MULTIPLY=21, DIVIDE=22, EQUAL=23, LT=24, 
		GT=25, LE=26, GE=27, SEMICOL=28, DOT=29, COMMA=30, STRING_LITERAL=31, 
		IDENT=32, NUM_INT=33, NUM_REAL=34, WS=35;
	public static final int
		RULE_program = 0, RULE_identifier = 1, RULE_value = 2, RULE_number = 3, 
		RULE_functionCall = 4, RULE_functionDeclaration = 5, RULE_values = 6, 
		RULE_argumentsDeclaration = 7, RULE_arguments = 8, RULE_functionBody = 9, 
		RULE_r_return = 10, RULE_instructions = 11, RULE_instruction = 12, RULE_assigment = 13, 
		RULE_mathOperation = 14, RULE_operand = 15, RULE_operator = 16, RULE_r_if = 17, 
		RULE_elsif = 18, RULE_r_else = 19, RULE_logicalOperation = 20, RULE_logicalOperand = 21, 
		RULE_logicalOperator = 22, RULE_r_while = 23, RULE_r_for = 24, RULE_loopBody = 25, 
		RULE_r_switch = 26, RULE_switchContent = 27, RULE_r_case = 28, RULE_r_default = 29;
	public static final String[] ruleNames = {
		"program", "identifier", "value", "number", "functionCall", "functionDeclaration", 
		"values", "argumentsDeclaration", "arguments", "functionBody", "r_return", 
		"instructions", "instruction", "assigment", "mathOperation", "operand", 
		"operator", "r_if", "elsif", "r_else", "logicalOperation", "logicalOperand", 
		"logicalOperator", "r_while", "r_for", "loopBody", "r_switch", "switchContent", 
		"r_case", "r_default"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'and'", "'or'", "'fun'", "'if'", "'elsif'", "'else'", "'while'", 
		"'for'", "'switch'", "'case'", "'default'", "'return'", "'break'", "'('", 
		"')'", "'{'", "'}'", "'='", "'+'", "'-'", "'*'", "'/'", "'=='", "'<'", 
		"'>'", "'<='", "'>='", "';'", "'.'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AND", "OR", "FUN", "IF", "ELSIF", "ELSE", "WHILE", "FOR", "SWITCH", 
		"CASE", "DEFAULT", "RETURN", "BREAK", "LPAR", "RPAR", "LCURL", "RCURL", 
		"ASSIGN", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "EQUAL", "LT", "GT", 
		"LE", "GE", "SEMICOL", "DOT", "COMMA", "STRING_LITERAL", "IDENT", "NUM_INT", 
		"NUM_REAL", "WS"
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

	@Override
	public String getGrammarFileName() { return "gramatyka.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramatykaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(62); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(62);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUN:
					{
					setState(60);
					functionDeclaration();
					}
					break;
				case IF:
				case WHILE:
				case FOR:
				case SWITCH:
				case IDENT:
					{
					setState(61);
					instructions();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(64); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUN) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << SWITCH) | (1L << IDENT))) != 0) );
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(gramatykaParser.IDENT, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(IDENT);
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

	public static class ValueContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(gramatykaParser.STRING_LITERAL, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_value);
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				number();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(STRING_LITERAL);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUM_INT() { return getToken(gramatykaParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(gramatykaParser.NUM_REAL, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_la = _input.LA(1);
			if ( !(_la==NUM_INT || _la==NUM_REAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class FunctionCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(gramatykaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(gramatykaParser.RPAR, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			identifier();
			setState(75);
			match(LPAR);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << IDENT) | (1L << NUM_INT) | (1L << NUM_REAL))) != 0)) {
				{
				setState(76);
				arguments();
				}
			}

			setState(79);
			match(RPAR);
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
		public TerminalNode FUN() { return getToken(gramatykaParser.FUN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(gramatykaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(gramatykaParser.RPAR, 0); }
		public TerminalNode LCURL() { return getToken(gramatykaParser.LCURL, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(gramatykaParser.RCURL, 0); }
		public ArgumentsDeclarationContext argumentsDeclaration() {
			return getRuleContext(ArgumentsDeclarationContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
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
			setState(81);
			match(FUN);
			setState(82);
			identifier();
			setState(83);
			match(LPAR);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(84);
				argumentsDeclaration();
				}
			}

			setState(87);
			match(RPAR);
			setState(88);
			match(LCURL);
			setState(89);
			functionBody();
			setState(90);
			match(RCURL);
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

	public static class ValuesContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MathOperationContext mathOperation() {
			return getRuleContext(MathOperationContext.class,0);
		}
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_values);
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				mathOperation();
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

	public static class ArgumentsDeclarationContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(gramatykaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(gramatykaParser.COMMA, i);
		}
		public ArgumentsDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentsDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterArgumentsDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitArgumentsDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitArgumentsDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsDeclarationContext argumentsDeclaration() throws RecognitionException {
		ArgumentsDeclarationContext _localctx = new ArgumentsDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_argumentsDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			identifier();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(98);
				match(COMMA);
				setState(99);
				identifier();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(gramatykaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(gramatykaParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			values();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(106);
				match(COMMA);
				setState(107);
				values();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FunctionBodyContext extends ParserRuleContext {
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public R_returnContext r_return() {
			return getRuleContext(R_returnContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << SWITCH) | (1L << IDENT))) != 0)) {
				{
				setState(113);
				instructions();
				}
			}

			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(116);
				r_return();
				}
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

	public static class R_returnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(gramatykaParser.RETURN, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public R_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterR_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitR_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitR_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_returnContext r_return() throws RecognitionException {
		R_returnContext _localctx = new R_returnContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_r_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(RETURN);
			setState(120);
			values();
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

	public static class InstructionsContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitInstructions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitInstructions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_instructions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(123); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(122);
					instruction();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(125); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class InstructionContext extends ParserRuleContext {
		public AssigmentContext assigment() {
			return getRuleContext(AssigmentContext.class,0);
		}
		public R_ifContext r_if() {
			return getRuleContext(R_ifContext.class,0);
		}
		public R_whileContext r_while() {
			return getRuleContext(R_whileContext.class,0);
		}
		public R_forContext r_for() {
			return getRuleContext(R_forContext.class,0);
		}
		public R_switchContext r_switch() {
			return getRuleContext(R_switchContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_instruction);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				assigment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				r_if();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				r_while();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				r_for();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(131);
				r_switch();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(132);
				functionCall();
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

	public static class AssigmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(gramatykaParser.ASSIGN, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public AssigmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterAssigment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitAssigment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitAssigment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssigmentContext assigment() throws RecognitionException {
		AssigmentContext _localctx = new AssigmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assigment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			identifier();
			setState(136);
			match(ASSIGN);
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(137);
				values();
				}
				break;
			case 2:
				{
				setState(138);
				functionCall();
				}
				break;
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

	public static class MathOperationContext extends ParserRuleContext {
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public MathOperationContext mathOperation() {
			return getRuleContext(MathOperationContext.class,0);
		}
		public MathOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterMathOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitMathOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitMathOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathOperationContext mathOperation() throws RecognitionException {
		MathOperationContext _localctx = new MathOperationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_mathOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			operand();
			setState(142);
			operator();
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(143);
				operand();
				}
				break;
			case 2:
				{
				setState(144);
				mathOperation();
				}
				break;
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

	public static class OperandContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_operand);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				number();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				identifier();
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(gramatykaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(gramatykaParser.MINUS, 0); }
		public TerminalNode MULTIPLY() { return getToken(gramatykaParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(gramatykaParser.DIVIDE, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLY) | (1L << DIVIDE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class R_ifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(gramatykaParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(gramatykaParser.LPAR, 0); }
		public LogicalOperationContext logicalOperation() {
			return getRuleContext(LogicalOperationContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(gramatykaParser.RPAR, 0); }
		public TerminalNode LCURL() { return getToken(gramatykaParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(gramatykaParser.RCURL, 0); }
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public List<ElsifContext> elsif() {
			return getRuleContexts(ElsifContext.class);
		}
		public ElsifContext elsif(int i) {
			return getRuleContext(ElsifContext.class,i);
		}
		public R_elseContext r_else() {
			return getRuleContext(R_elseContext.class,0);
		}
		public R_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterR_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitR_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitR_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_ifContext r_if() throws RecognitionException {
		R_ifContext _localctx = new R_ifContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_r_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(IF);
			setState(154);
			match(LPAR);
			setState(155);
			logicalOperation();
			setState(156);
			match(RPAR);
			setState(157);
			match(LCURL);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << SWITCH) | (1L << IDENT))) != 0)) {
				{
				setState(158);
				instructions();
				}
			}

			setState(161);
			match(RCURL);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSIF) {
				{
				{
				setState(162);
				elsif();
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(168);
				r_else();
				}
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

	public static class ElsifContext extends ParserRuleContext {
		public TerminalNode ELSIF() { return getToken(gramatykaParser.ELSIF, 0); }
		public TerminalNode LPAR() { return getToken(gramatykaParser.LPAR, 0); }
		public LogicalOperationContext logicalOperation() {
			return getRuleContext(LogicalOperationContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(gramatykaParser.RPAR, 0); }
		public TerminalNode LCURL() { return getToken(gramatykaParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(gramatykaParser.RCURL, 0); }
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public ElsifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterElsif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitElsif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitElsif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsifContext elsif() throws RecognitionException {
		ElsifContext _localctx = new ElsifContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_elsif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(ELSIF);
			setState(172);
			match(LPAR);
			setState(173);
			logicalOperation();
			setState(174);
			match(RPAR);
			setState(175);
			match(LCURL);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << SWITCH) | (1L << IDENT))) != 0)) {
				{
				setState(176);
				instructions();
				}
			}

			setState(179);
			match(RCURL);
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

	public static class R_elseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(gramatykaParser.ELSE, 0); }
		public TerminalNode LCURL() { return getToken(gramatykaParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(gramatykaParser.RCURL, 0); }
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public R_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterR_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitR_else(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitR_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_elseContext r_else() throws RecognitionException {
		R_elseContext _localctx = new R_elseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_r_else);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(ELSE);
			setState(182);
			match(LCURL);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << SWITCH) | (1L << IDENT))) != 0)) {
				{
				setState(183);
				instructions();
				}
			}

			setState(186);
			match(RCURL);
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

	public static class LogicalOperationContext extends ParserRuleContext {
		public List<LogicalOperandContext> logicalOperand() {
			return getRuleContexts(LogicalOperandContext.class);
		}
		public LogicalOperandContext logicalOperand(int i) {
			return getRuleContext(LogicalOperandContext.class,i);
		}
		public LogicalOperatorContext logicalOperator() {
			return getRuleContext(LogicalOperatorContext.class,0);
		}
		public LogicalOperationContext logicalOperation() {
			return getRuleContext(LogicalOperationContext.class,0);
		}
		public LogicalOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterLogicalOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitLogicalOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitLogicalOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOperationContext logicalOperation() throws RecognitionException {
		LogicalOperationContext _localctx = new LogicalOperationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_logicalOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			logicalOperand();
			setState(189);
			logicalOperator();
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(190);
				logicalOperand();
				}
				break;
			case 2:
				{
				setState(191);
				logicalOperation();
				}
				break;
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

	public static class LogicalOperandContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LogicalOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterLogicalOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitLogicalOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitLogicalOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOperandContext logicalOperand() throws RecognitionException {
		LogicalOperandContext _localctx = new LogicalOperandContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_logicalOperand);
		try {
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				number();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				identifier();
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

	public static class LogicalOperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(gramatykaParser.EQUAL, 0); }
		public TerminalNode LT() { return getToken(gramatykaParser.LT, 0); }
		public TerminalNode GT() { return getToken(gramatykaParser.GT, 0); }
		public TerminalNode LE() { return getToken(gramatykaParser.LE, 0); }
		public TerminalNode GE() { return getToken(gramatykaParser.GE, 0); }
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterLogicalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitLogicalOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitLogicalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << LT) | (1L << GT) | (1L << LE) | (1L << GE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class R_whileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(gramatykaParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(gramatykaParser.LPAR, 0); }
		public LogicalOperationContext logicalOperation() {
			return getRuleContext(LogicalOperationContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(gramatykaParser.RPAR, 0); }
		public TerminalNode LCURL() { return getToken(gramatykaParser.LCURL, 0); }
		public LoopBodyContext loopBody() {
			return getRuleContext(LoopBodyContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(gramatykaParser.RCURL, 0); }
		public R_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterR_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitR_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitR_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_whileContext r_while() throws RecognitionException {
		R_whileContext _localctx = new R_whileContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_r_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(WHILE);
			setState(201);
			match(LPAR);
			setState(202);
			logicalOperation();
			setState(203);
			match(RPAR);
			setState(204);
			match(LCURL);
			setState(205);
			loopBody();
			setState(206);
			match(RCURL);
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

	public static class R_forContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(gramatykaParser.FOR, 0); }
		public TerminalNode LPAR() { return getToken(gramatykaParser.LPAR, 0); }
		public List<AssigmentContext> assigment() {
			return getRuleContexts(AssigmentContext.class);
		}
		public AssigmentContext assigment(int i) {
			return getRuleContext(AssigmentContext.class,i);
		}
		public List<TerminalNode> SEMICOL() { return getTokens(gramatykaParser.SEMICOL); }
		public TerminalNode SEMICOL(int i) {
			return getToken(gramatykaParser.SEMICOL, i);
		}
		public LogicalOperationContext logicalOperation() {
			return getRuleContext(LogicalOperationContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(gramatykaParser.RPAR, 0); }
		public TerminalNode LCURL() { return getToken(gramatykaParser.LCURL, 0); }
		public LoopBodyContext loopBody() {
			return getRuleContext(LoopBodyContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(gramatykaParser.RCURL, 0); }
		public R_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterR_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitR_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitR_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_forContext r_for() throws RecognitionException {
		R_forContext _localctx = new R_forContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_r_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(FOR);
			setState(209);
			match(LPAR);
			setState(210);
			assigment();
			setState(211);
			match(SEMICOL);
			setState(212);
			logicalOperation();
			setState(213);
			match(SEMICOL);
			setState(214);
			assigment();
			setState(215);
			match(RPAR);
			setState(216);
			match(LCURL);
			setState(217);
			loopBody();
			setState(218);
			match(RCURL);
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

	public static class LoopBodyContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<TerminalNode> BREAK() { return getTokens(gramatykaParser.BREAK); }
		public TerminalNode BREAK(int i) {
			return getToken(gramatykaParser.BREAK, i);
		}
		public LoopBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterLoopBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitLoopBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitLoopBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopBodyContext loopBody() throws RecognitionException {
		LoopBodyContext _localctx = new LoopBodyContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_loopBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << SWITCH) | (1L << BREAK) | (1L << IDENT))) != 0)) {
				{
				setState(222);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
				case WHILE:
				case FOR:
				case SWITCH:
				case IDENT:
					{
					setState(220);
					instruction();
					}
					break;
				case BREAK:
					{
					setState(221);
					match(BREAK);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class R_switchContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(gramatykaParser.SWITCH, 0); }
		public TerminalNode LPAR() { return getToken(gramatykaParser.LPAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(gramatykaParser.RPAR, 0); }
		public TerminalNode LCURL() { return getToken(gramatykaParser.LCURL, 0); }
		public SwitchContentContext switchContent() {
			return getRuleContext(SwitchContentContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(gramatykaParser.RCURL, 0); }
		public R_switchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_switch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterR_switch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitR_switch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitR_switch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_switchContext r_switch() throws RecognitionException {
		R_switchContext _localctx = new R_switchContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_r_switch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(SWITCH);
			setState(228);
			match(LPAR);
			setState(229);
			identifier();
			setState(230);
			match(RPAR);
			setState(231);
			match(LCURL);
			setState(232);
			switchContent();
			setState(233);
			match(RCURL);
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

	public static class SwitchContentContext extends ParserRuleContext {
		public List<R_caseContext> r_case() {
			return getRuleContexts(R_caseContext.class);
		}
		public R_caseContext r_case(int i) {
			return getRuleContext(R_caseContext.class,i);
		}
		public R_defaultContext r_default() {
			return getRuleContext(R_defaultContext.class,0);
		}
		public SwitchContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterSwitchContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitSwitchContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitSwitchContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchContentContext switchContent() throws RecognitionException {
		SwitchContentContext _localctx = new SwitchContentContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_switchContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(235);
				r_case();
				}
				}
				setState(238); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE );
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(240);
				r_default();
				}
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

	public static class R_caseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(gramatykaParser.CASE, 0); }
		public TerminalNode LPAR() { return getToken(gramatykaParser.LPAR, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(gramatykaParser.RPAR, 0); }
		public TerminalNode LCURL() { return getToken(gramatykaParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(gramatykaParser.RCURL, 0); }
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(gramatykaParser.BREAK, 0); }
		public R_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterR_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitR_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitR_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_caseContext r_case() throws RecognitionException {
		R_caseContext _localctx = new R_caseContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_r_case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(CASE);
			setState(244);
			match(LPAR);
			setState(245);
			values();
			setState(246);
			match(RPAR);
			setState(247);
			match(LCURL);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << SWITCH) | (1L << IDENT))) != 0)) {
				{
				setState(248);
				instructions();
				}
			}

			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(251);
				match(BREAK);
				}
			}

			setState(254);
			match(RCURL);
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

	public static class R_defaultContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(gramatykaParser.DEFAULT, 0); }
		public TerminalNode LCURL() { return getToken(gramatykaParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(gramatykaParser.RCURL, 0); }
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(gramatykaParser.BREAK, 0); }
		public R_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterR_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitR_default(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitR_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_defaultContext r_default() throws RecognitionException {
		R_defaultContext _localctx = new R_defaultContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_r_default);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(DEFAULT);
			setState(257);
			match(LCURL);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << SWITCH) | (1L << IDENT))) != 0)) {
				{
				setState(258);
				instructions();
				}
			}

			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(261);
				match(BREAK);
				}
			}

			setState(264);
			match(RCURL);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u010d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\6"+
		"\2A\n\2\r\2\16\2B\3\3\3\3\3\4\3\4\5\4I\n\4\3\5\3\5\3\6\3\6\3\6\5\6P\n"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7X\n\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5"+
		"\bb\n\b\3\t\3\t\3\t\7\tg\n\t\f\t\16\tj\13\t\3\n\3\n\3\n\7\no\n\n\f\n\16"+
		"\nr\13\n\3\13\5\13u\n\13\3\13\5\13x\n\13\3\f\3\f\3\f\3\r\6\r~\n\r\r\r"+
		"\16\r\177\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0088\n\16\3\17\3\17\3\17"+
		"\3\17\5\17\u008e\n\17\3\20\3\20\3\20\3\20\5\20\u0094\n\20\3\21\3\21\5"+
		"\21\u0098\n\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00a2\n\23"+
		"\3\23\3\23\7\23\u00a6\n\23\f\23\16\23\u00a9\13\23\3\23\5\23\u00ac\n\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00b4\n\24\3\24\3\24\3\25\3\25\3\25"+
		"\5\25\u00bb\n\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u00c3\n\26\3\27\3"+
		"\27\5\27\u00c7\n\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\7\33\u00e1\n\33\f\33\16\33\u00e4\13\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\6\35\u00ef\n\35\r\35\16\35\u00f0\3\35\5\35\u00f4\n\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u00fc\n\36\3\36\5\36\u00ff\n\36\3"+
		"\36\3\36\3\37\3\37\3\37\5\37\u0106\n\37\3\37\5\37\u0109\n\37\3\37\3\37"+
		"\3\37\2\2 \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<\2\5\3\2#$\3\2\25\30\3\2\31\35\2\u0111\2@\3\2\2\2\4D\3\2\2\2\6H\3\2"+
		"\2\2\bJ\3\2\2\2\nL\3\2\2\2\fS\3\2\2\2\16a\3\2\2\2\20c\3\2\2\2\22k\3\2"+
		"\2\2\24t\3\2\2\2\26y\3\2\2\2\30}\3\2\2\2\32\u0087\3\2\2\2\34\u0089\3\2"+
		"\2\2\36\u008f\3\2\2\2 \u0097\3\2\2\2\"\u0099\3\2\2\2$\u009b\3\2\2\2&\u00ad"+
		"\3\2\2\2(\u00b7\3\2\2\2*\u00be\3\2\2\2,\u00c6\3\2\2\2.\u00c8\3\2\2\2\60"+
		"\u00ca\3\2\2\2\62\u00d2\3\2\2\2\64\u00e2\3\2\2\2\66\u00e5\3\2\2\28\u00ee"+
		"\3\2\2\2:\u00f5\3\2\2\2<\u0102\3\2\2\2>A\5\f\7\2?A\5\30\r\2@>\3\2\2\2"+
		"@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\3\3\2\2\2DE\7\"\2\2E\5\3\2\2"+
		"\2FI\5\b\5\2GI\7!\2\2HF\3\2\2\2HG\3\2\2\2I\7\3\2\2\2JK\t\2\2\2K\t\3\2"+
		"\2\2LM\5\4\3\2MO\7\20\2\2NP\5\22\n\2ON\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\7"+
		"\21\2\2R\13\3\2\2\2ST\7\5\2\2TU\5\4\3\2UW\7\20\2\2VX\5\20\t\2WV\3\2\2"+
		"\2WX\3\2\2\2XY\3\2\2\2YZ\7\21\2\2Z[\7\22\2\2[\\\5\24\13\2\\]\7\23\2\2"+
		"]\r\3\2\2\2^b\5\6\4\2_b\5\4\3\2`b\5\36\20\2a^\3\2\2\2a_\3\2\2\2a`\3\2"+
		"\2\2b\17\3\2\2\2ch\5\4\3\2de\7 \2\2eg\5\4\3\2fd\3\2\2\2gj\3\2\2\2hf\3"+
		"\2\2\2hi\3\2\2\2i\21\3\2\2\2jh\3\2\2\2kp\5\16\b\2lm\7 \2\2mo\5\16\b\2"+
		"nl\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\23\3\2\2\2rp\3\2\2\2su\5\30"+
		"\r\2ts\3\2\2\2tu\3\2\2\2uw\3\2\2\2vx\5\26\f\2wv\3\2\2\2wx\3\2\2\2x\25"+
		"\3\2\2\2yz\7\16\2\2z{\5\16\b\2{\27\3\2\2\2|~\5\32\16\2}|\3\2\2\2~\177"+
		"\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\31\3\2\2\2\u0081\u0088\5"+
		"\34\17\2\u0082\u0088\5$\23\2\u0083\u0088\5\60\31\2\u0084\u0088\5\62\32"+
		"\2\u0085\u0088\5\66\34\2\u0086\u0088\5\n\6\2\u0087\u0081\3\2\2\2\u0087"+
		"\u0082\3\2\2\2\u0087\u0083\3\2\2\2\u0087\u0084\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0087\u0086\3\2\2\2\u0088\33\3\2\2\2\u0089\u008a\5\4\3\2\u008a\u008d"+
		"\7\24\2\2\u008b\u008e\5\16\b\2\u008c\u008e\5\n\6\2\u008d\u008b\3\2\2\2"+
		"\u008d\u008c\3\2\2\2\u008e\35\3\2\2\2\u008f\u0090\5 \21\2\u0090\u0093"+
		"\5\"\22\2\u0091\u0094\5 \21\2\u0092\u0094\5\36\20\2\u0093\u0091\3\2\2"+
		"\2\u0093\u0092\3\2\2\2\u0094\37\3\2\2\2\u0095\u0098\5\b\5\2\u0096\u0098"+
		"\5\4\3\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098!\3\2\2\2\u0099"+
		"\u009a\t\3\2\2\u009a#\3\2\2\2\u009b\u009c\7\6\2\2\u009c\u009d\7\20\2\2"+
		"\u009d\u009e\5*\26\2\u009e\u009f\7\21\2\2\u009f\u00a1\7\22\2\2\u00a0\u00a2"+
		"\5\30\r\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2"+
		"\u00a3\u00a7\7\23\2\2\u00a4\u00a6\5&\24\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9"+
		"\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00aa\u00ac\5(\25\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac%\3\2\2\2\u00ad\u00ae\7\7\2\2\u00ae\u00af\7\20\2\2\u00af\u00b0"+
		"\5*\26\2\u00b0\u00b1\7\21\2\2\u00b1\u00b3\7\22\2\2\u00b2\u00b4\5\30\r"+
		"\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6"+
		"\7\23\2\2\u00b6\'\3\2\2\2\u00b7\u00b8\7\b\2\2\u00b8\u00ba\7\22\2\2\u00b9"+
		"\u00bb\5\30\r\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3"+
		"\2\2\2\u00bc\u00bd\7\23\2\2\u00bd)\3\2\2\2\u00be\u00bf\5,\27\2\u00bf\u00c2"+
		"\5.\30\2\u00c0\u00c3\5,\27\2\u00c1\u00c3\5*\26\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c1\3\2\2\2\u00c3+\3\2\2\2\u00c4\u00c7\5\b\5\2\u00c5\u00c7\5\4\3\2"+
		"\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7-\3\2\2\2\u00c8\u00c9\t"+
		"\4\2\2\u00c9/\3\2\2\2\u00ca\u00cb\7\t\2\2\u00cb\u00cc\7\20\2\2\u00cc\u00cd"+
		"\5*\26\2\u00cd\u00ce\7\21\2\2\u00ce\u00cf\7\22\2\2\u00cf\u00d0\5\64\33"+
		"\2\u00d0\u00d1\7\23\2\2\u00d1\61\3\2\2\2\u00d2\u00d3\7\n\2\2\u00d3\u00d4"+
		"\7\20\2\2\u00d4\u00d5\5\34\17\2\u00d5\u00d6\7\36\2\2\u00d6\u00d7\5*\26"+
		"\2\u00d7\u00d8\7\36\2\2\u00d8\u00d9\5\34\17\2\u00d9\u00da\7\21\2\2\u00da"+
		"\u00db\7\22\2\2\u00db\u00dc\5\64\33\2\u00dc\u00dd\7\23\2\2\u00dd\63\3"+
		"\2\2\2\u00de\u00e1\5\32\16\2\u00df\u00e1\7\17\2\2\u00e0\u00de\3\2\2\2"+
		"\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3"+
		"\3\2\2\2\u00e3\65\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\7\13\2\2\u00e6"+
		"\u00e7\7\20\2\2\u00e7\u00e8\5\4\3\2\u00e8\u00e9\7\21\2\2\u00e9\u00ea\7"+
		"\22\2\2\u00ea\u00eb\58\35\2\u00eb\u00ec\7\23\2\2\u00ec\67\3\2\2\2\u00ed"+
		"\u00ef\5:\36\2\u00ee\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00ee\3\2"+
		"\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f4\5<\37\2\u00f3"+
		"\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f49\3\2\2\2\u00f5\u00f6\7\f\2\2"+
		"\u00f6\u00f7\7\20\2\2\u00f7\u00f8\5\16\b\2\u00f8\u00f9\7\21\2\2\u00f9"+
		"\u00fb\7\22\2\2\u00fa\u00fc\5\30\r\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3"+
		"\2\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00ff\7\17\2\2\u00fe\u00fd\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\7\23\2\2\u0101;\3\2\2\2"+
		"\u0102\u0103\7\r\2\2\u0103\u0105\7\22\2\2\u0104\u0106\5\30\r\2\u0105\u0104"+
		"\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0109\7\17\2\2"+
		"\u0108\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b"+
		"\7\23\2\2\u010b=\3\2\2\2 @BHOWahptw\177\u0087\u008d\u0093\u0097\u00a1"+
		"\u00a7\u00ab\u00b3\u00ba\u00c2\u00c6\u00e0\u00e2\u00f0\u00f3\u00fb\u00fe"+
		"\u0105\u0108";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
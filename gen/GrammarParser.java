// Generated from D:/Nastya/Java/MatVecCompiler/src\Grammar.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, O_BRACKET=2, C_BRACKET=3, O_FIGURE_BRACKET=4, C_FIGURE_BRACKET=5, 
		VECTOR=6, MATRIX=7, NAME=8, NUMBER=9, STRING=10, IF=11, ELSE=12, FOR=13, 
		WHILE=14, RETURN=15, FUNCTION=16, SHOW=17, LENGTH=18, GET=19, ADD=20, 
		REMOVE=21, ASSIGN=22, DOT=23, COMMA=24, PLUS=25, MINUS=26, MULTIPLY=27, 
		SEMICOLON=28, EQUAL=29, NON_EQUAL=30, LESS=31, GREATER=32, WS=33;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_declaration = 2, RULE_set = 3, 
		RULE_vectorAssignment = 4, RULE_matrixAssignment = 5, RULE_assignment = 6, 
		RULE_showFunct = 7, RULE_getFunct = 8, RULE_lengthFunct = 9, RULE_addFunct = 10, 
		RULE_removeFunct = 11, RULE_inputSignature = 12, RULE_functionCall = 13, 
		RULE_type = 14, RULE_signatureFunction = 15, RULE_functionReturn = 16, 
		RULE_functionNonReturn = 17, RULE_blockReturn = 18, RULE_blockNonReturn = 19, 
		RULE_compareExpr = 20, RULE_compareOp = 21, RULE_compare = 22, RULE_elseBlock = 23, 
		RULE_ifBlock = 24, RULE_whileBlock = 25, RULE_forBlock = 26, RULE_expression = 27, 
		RULE_content = 28;
	public static final String[] ruleNames = {
		"program", "block", "declaration", "set", "vectorAssignment", "matrixAssignment", 
		"assignment", "showFunct", "getFunct", "lengthFunct", "addFunct", "removeFunct", 
		"inputSignature", "functionCall", "type", "signatureFunction", "functionReturn", 
		"functionNonReturn", "blockReturn", "blockNonReturn", "compareExpr", "compareOp", 
		"compare", "elseBlock", "ifBlock", "whileBlock", "forBlock", "expression", 
		"content"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'main'", "'('", "')'", "'{'", "'}'", "'vector'", "'matrix'", null, 
		null, null, "'if'", "'else'", "'for'", "'while'", "'return'", "'func'", 
		"'show'", "'length'", "'get'", "'add'", "'remove'", "'='", "'.'", "','", 
		"'+'", "'-'", "'*'", "';'", "'=='", "'!='", "'<'", "'>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "O_BRACKET", "C_BRACKET", "O_FIGURE_BRACKET", "C_FIGURE_BRACKET", 
		"VECTOR", "MATRIX", "NAME", "NUMBER", "STRING", "IF", "ELSE", "FOR", "WHILE", 
		"RETURN", "FUNCTION", "SHOW", "LENGTH", "GET", "ADD", "REMOVE", "ASSIGN", 
		"DOT", "COMMA", "PLUS", "MINUS", "MULTIPLY", "SEMICOLON", "EQUAL", "NON_EQUAL", 
		"LESS", "GREATER", "WS"
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
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<FunctionReturnContext> functionReturn() {
			return getRuleContexts(FunctionReturnContext.class);
		}
		public FunctionReturnContext functionReturn(int i) {
			return getRuleContext(FunctionReturnContext.class,i);
		}
		public List<FunctionNonReturnContext> functionNonReturn() {
			return getRuleContexts(FunctionNonReturnContext.class);
		}
		public FunctionNonReturnContext functionNonReturn(int i) {
			return getRuleContext(FunctionNonReturnContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(58);
			match(T__0);
			setState(59);
			block();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				setState(62);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(60);
					functionReturn();
					}
					break;
				case 2:
					{
					setState(61);
					functionNonReturn();
					}
					break;
				}
				}
				setState(66);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode O_FIGURE_BRACKET() { return getToken(GrammarParser.O_FIGURE_BRACKET, 0); }
		public TerminalNode C_FIGURE_BRACKET() { return getToken(GrammarParser.C_FIGURE_BRACKET, 0); }
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(O_FIGURE_BRACKET);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VECTOR) | (1L << MATRIX) | (1L << NAME) | (1L << IF) | (1L << FOR) | (1L << WHILE))) != 0)) {
				{
				{
				setState(68);
				content();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			match(C_FIGURE_BRACKET);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NAME() { return getToken(GrammarParser.NAME, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			type();
			setState(77);
			match(NAME);
			setState(78);
			match(SEMICOLON);
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

	public static class SetContext extends ParserRuleContext {
		public TerminalNode O_FIGURE_BRACKET() { return getToken(GrammarParser.O_FIGURE_BRACKET, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(GrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(GrammarParser.NUMBER, i);
		}
		public TerminalNode C_FIGURE_BRACKET() { return getToken(GrammarParser.C_FIGURE_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(O_FIGURE_BRACKET);
			setState(81);
			match(NUMBER);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(82);
				match(COMMA);
				setState(83);
				match(NUMBER);
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			match(C_FIGURE_BRACKET);
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

	public static class VectorAssignmentContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GrammarParser.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public TerminalNode VECTOR() { return getToken(GrammarParser.VECTOR, 0); }
		public VectorAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vectorAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVectorAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVectorAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitVectorAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VectorAssignmentContext vectorAssignment() throws RecognitionException {
		VectorAssignmentContext _localctx = new VectorAssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_vectorAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VECTOR) {
				{
				setState(91);
				match(VECTOR);
				}
			}

			setState(94);
			match(NAME);
			setState(95);
			match(ASSIGN);
			setState(96);
			set();
			setState(97);
			match(SEMICOLON);
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

	public static class MatrixAssignmentContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GrammarParser.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public TerminalNode O_FIGURE_BRACKET() { return getToken(GrammarParser.O_FIGURE_BRACKET, 0); }
		public List<SetContext> set() {
			return getRuleContexts(SetContext.class);
		}
		public SetContext set(int i) {
			return getRuleContext(SetContext.class,i);
		}
		public TerminalNode C_FIGURE_BRACKET() { return getToken(GrammarParser.C_FIGURE_BRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public TerminalNode MATRIX() { return getToken(GrammarParser.MATRIX, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public MatrixAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrixAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMatrixAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMatrixAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitMatrixAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatrixAssignmentContext matrixAssignment() throws RecognitionException {
		MatrixAssignmentContext _localctx = new MatrixAssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_matrixAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MATRIX) {
				{
				setState(99);
				match(MATRIX);
				}
			}

			setState(102);
			match(NAME);
			setState(103);
			match(ASSIGN);
			setState(104);
			match(O_FIGURE_BRACKET);
			setState(105);
			set();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(106);
				match(COMMA);
				setState(107);
				set();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			match(C_FIGURE_BRACKET);
			setState(114);
			match(SEMICOLON);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GrammarParser.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VECTOR || _la==MATRIX) {
				{
				setState(116);
				type();
				}
			}

			setState(119);
			match(NAME);
			setState(120);
			match(ASSIGN);
			setState(121);
			expression();
			setState(122);
			match(SEMICOLON);
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

	public static class ShowFunctContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GrammarParser.NAME, 0); }
		public TerminalNode DOT() { return getToken(GrammarParser.DOT, 0); }
		public TerminalNode SHOW() { return getToken(GrammarParser.SHOW, 0); }
		public TerminalNode O_BRACKET() { return getToken(GrammarParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(GrammarParser.C_BRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public ShowFunctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showFunct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterShowFunct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitShowFunct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitShowFunct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowFunctContext showFunct() throws RecognitionException {
		ShowFunctContext _localctx = new ShowFunctContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_showFunct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(NAME);
			setState(125);
			match(DOT);
			setState(126);
			match(SHOW);
			setState(127);
			match(O_BRACKET);
			setState(128);
			match(C_BRACKET);
			setState(129);
			match(SEMICOLON);
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

	public static class GetFunctContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GrammarParser.NAME, 0); }
		public TerminalNode DOT() { return getToken(GrammarParser.DOT, 0); }
		public TerminalNode GET() { return getToken(GrammarParser.GET, 0); }
		public TerminalNode O_BRACKET() { return getToken(GrammarParser.O_BRACKET, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(GrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(GrammarParser.NUMBER, i);
		}
		public TerminalNode C_BRACKET() { return getToken(GrammarParser.C_BRACKET, 0); }
		public TerminalNode COMMA() { return getToken(GrammarParser.COMMA, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public GetFunctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getFunct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterGetFunct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitGetFunct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitGetFunct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetFunctContext getFunct() throws RecognitionException {
		GetFunctContext _localctx = new GetFunctContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_getFunct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(NAME);
			setState(132);
			match(DOT);
			setState(133);
			match(GET);
			setState(134);
			match(O_BRACKET);
			setState(135);
			match(NUMBER);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(136);
				match(COMMA);
				setState(137);
				match(NUMBER);
				}
			}

			setState(140);
			match(C_BRACKET);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(141);
				match(SEMICOLON);
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

	public static class LengthFunctContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GrammarParser.NAME, 0); }
		public TerminalNode DOT() { return getToken(GrammarParser.DOT, 0); }
		public TerminalNode LENGTH() { return getToken(GrammarParser.LENGTH, 0); }
		public TerminalNode O_BRACKET() { return getToken(GrammarParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(GrammarParser.C_BRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public LengthFunctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lengthFunct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLengthFunct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLengthFunct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLengthFunct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LengthFunctContext lengthFunct() throws RecognitionException {
		LengthFunctContext _localctx = new LengthFunctContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lengthFunct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(NAME);
			setState(145);
			match(DOT);
			setState(146);
			match(LENGTH);
			setState(147);
			match(O_BRACKET);
			setState(148);
			match(C_BRACKET);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(149);
				match(SEMICOLON);
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

	public static class AddFunctContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GrammarParser.NAME, 0); }
		public TerminalNode DOT() { return getToken(GrammarParser.DOT, 0); }
		public TerminalNode ADD() { return getToken(GrammarParser.ADD, 0); }
		public TerminalNode O_BRACKET() { return getToken(GrammarParser.O_BRACKET, 0); }
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public TerminalNode C_BRACKET() { return getToken(GrammarParser.C_BRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public AddFunctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addFunct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAddFunct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAddFunct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAddFunct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddFunctContext addFunct() throws RecognitionException {
		AddFunctContext _localctx = new AddFunctContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_addFunct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(NAME);
			setState(153);
			match(DOT);
			setState(154);
			match(ADD);
			setState(155);
			match(O_BRACKET);
			setState(156);
			match(NUMBER);
			setState(157);
			match(C_BRACKET);
			setState(158);
			match(SEMICOLON);
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

	public static class RemoveFunctContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GrammarParser.NAME, 0); }
		public TerminalNode DOT() { return getToken(GrammarParser.DOT, 0); }
		public TerminalNode REMOVE() { return getToken(GrammarParser.REMOVE, 0); }
		public TerminalNode O_BRACKET() { return getToken(GrammarParser.O_BRACKET, 0); }
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public TerminalNode C_BRACKET() { return getToken(GrammarParser.C_BRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public RemoveFunctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_removeFunct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRemoveFunct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRemoveFunct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitRemoveFunct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RemoveFunctContext removeFunct() throws RecognitionException {
		RemoveFunctContext _localctx = new RemoveFunctContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_removeFunct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(NAME);
			setState(161);
			match(DOT);
			setState(162);
			match(REMOVE);
			setState(163);
			match(O_BRACKET);
			setState(164);
			match(NUMBER);
			setState(165);
			match(C_BRACKET);
			setState(166);
			match(SEMICOLON);
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

	public static class InputSignatureContext extends ParserRuleContext {
		public TerminalNode O_BRACKET() { return getToken(GrammarParser.O_BRACKET, 0); }
		public List<TerminalNode> NAME() { return getTokens(GrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GrammarParser.NAME, i);
		}
		public TerminalNode C_BRACKET() { return getToken(GrammarParser.C_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public InputSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterInputSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitInputSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitInputSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputSignatureContext inputSignature() throws RecognitionException {
		InputSignatureContext _localctx = new InputSignatureContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_inputSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(O_BRACKET);
			setState(169);
			match(NAME);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(170);
				match(COMMA);
				setState(171);
				match(NAME);
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177);
			match(C_BRACKET);
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
		public TerminalNode NAME() { return getToken(GrammarParser.NAME, 0); }
		public InputSignatureContext inputSignature() {
			return getRuleContext(InputSignatureContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public TerminalNode O_BRACKET() { return getToken(GrammarParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(GrammarParser.C_BRACKET, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(NAME);
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(180);
				inputSignature();
				}
				break;
			case 2:
				{
				{
				setState(181);
				match(O_BRACKET);
				setState(182);
				match(C_BRACKET);
				}
				}
				break;
			}
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(185);
				match(SEMICOLON);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode MATRIX() { return getToken(GrammarParser.MATRIX, 0); }
		public TerminalNode VECTOR() { return getToken(GrammarParser.VECTOR, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_la = _input.LA(1);
			if ( !(_la==VECTOR || _la==MATRIX) ) {
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

	public static class SignatureFunctionContext extends ParserRuleContext {
		public TerminalNode O_BRACKET() { return getToken(GrammarParser.O_BRACKET, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> NAME() { return getTokens(GrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GrammarParser.NAME, i);
		}
		public TerminalNode C_BRACKET() { return getToken(GrammarParser.C_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public SignatureFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signatureFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSignatureFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSignatureFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSignatureFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignatureFunctionContext signatureFunction() throws RecognitionException {
		SignatureFunctionContext _localctx = new SignatureFunctionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_signatureFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(O_BRACKET);
			setState(191);
			type();
			setState(192);
			match(NAME);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(193);
				match(COMMA);
				setState(194);
				type();
				setState(195);
				match(NAME);
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			match(C_BRACKET);
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

	public static class FunctionReturnContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(GrammarParser.FUNCTION, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NAME() { return getToken(GrammarParser.NAME, 0); }
		public BlockReturnContext blockReturn() {
			return getRuleContext(BlockReturnContext.class,0);
		}
		public SignatureFunctionContext signatureFunction() {
			return getRuleContext(SignatureFunctionContext.class,0);
		}
		public TerminalNode O_BRACKET() { return getToken(GrammarParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(GrammarParser.C_BRACKET, 0); }
		public FunctionReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFunctionReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFunctionReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFunctionReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionReturnContext functionReturn() throws RecognitionException {
		FunctionReturnContext _localctx = new FunctionReturnContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_functionReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(FUNCTION);
			setState(205);
			type();
			setState(206);
			match(NAME);
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(207);
				signatureFunction();
				}
				break;
			case 2:
				{
				{
				setState(208);
				match(O_BRACKET);
				setState(209);
				match(C_BRACKET);
				}
				}
				break;
			}
			setState(212);
			blockReturn();
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

	public static class FunctionNonReturnContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(GrammarParser.FUNCTION, 0); }
		public TerminalNode NAME() { return getToken(GrammarParser.NAME, 0); }
		public BlockNonReturnContext blockNonReturn() {
			return getRuleContext(BlockNonReturnContext.class,0);
		}
		public SignatureFunctionContext signatureFunction() {
			return getRuleContext(SignatureFunctionContext.class,0);
		}
		public TerminalNode O_BRACKET() { return getToken(GrammarParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(GrammarParser.C_BRACKET, 0); }
		public FunctionNonReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionNonReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFunctionNonReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFunctionNonReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFunctionNonReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNonReturnContext functionNonReturn() throws RecognitionException {
		FunctionNonReturnContext _localctx = new FunctionNonReturnContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functionNonReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(FUNCTION);
			setState(215);
			match(NAME);
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(216);
				signatureFunction();
				}
				break;
			case 2:
				{
				{
				setState(217);
				match(O_BRACKET);
				setState(218);
				match(C_BRACKET);
				}
				}
				break;
			}
			setState(221);
			blockNonReturn();
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

	public static class BlockReturnContext extends ParserRuleContext {
		public TerminalNode O_FIGURE_BRACKET() { return getToken(GrammarParser.O_FIGURE_BRACKET, 0); }
		public TerminalNode RETURN() { return getToken(GrammarParser.RETURN, 0); }
		public TerminalNode NAME() { return getToken(GrammarParser.NAME, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public TerminalNode C_FIGURE_BRACKET() { return getToken(GrammarParser.C_FIGURE_BRACKET, 0); }
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public BlockReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBlockReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBlockReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBlockReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockReturnContext blockReturn() throws RecognitionException {
		BlockReturnContext _localctx = new BlockReturnContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_blockReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(O_FIGURE_BRACKET);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VECTOR) | (1L << MATRIX) | (1L << NAME) | (1L << IF) | (1L << FOR) | (1L << WHILE))) != 0)) {
				{
				{
				setState(224);
				content();
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230);
			match(RETURN);
			setState(231);
			match(NAME);
			setState(232);
			match(SEMICOLON);
			setState(233);
			match(C_FIGURE_BRACKET);
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

	public static class BlockNonReturnContext extends ParserRuleContext {
		public TerminalNode O_FIGURE_BRACKET() { return getToken(GrammarParser.O_FIGURE_BRACKET, 0); }
		public TerminalNode RETURN() { return getToken(GrammarParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public TerminalNode C_FIGURE_BRACKET() { return getToken(GrammarParser.C_FIGURE_BRACKET, 0); }
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public BlockNonReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockNonReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBlockNonReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBlockNonReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBlockNonReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockNonReturnContext blockNonReturn() throws RecognitionException {
		BlockNonReturnContext _localctx = new BlockNonReturnContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_blockNonReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(O_FIGURE_BRACKET);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VECTOR) | (1L << MATRIX) | (1L << NAME) | (1L << IF) | (1L << FOR) | (1L << WHILE))) != 0)) {
				{
				{
				setState(236);
				content();
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(242);
			match(RETURN);
			setState(243);
			match(SEMICOLON);
			setState(244);
			match(C_FIGURE_BRACKET);
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

	public static class CompareExprContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(GrammarParser.EQUAL, 0); }
		public TerminalNode NON_EQUAL() { return getToken(GrammarParser.NON_EQUAL, 0); }
		public TerminalNode LESS() { return getToken(GrammarParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(GrammarParser.GREATER, 0); }
		public CompareExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCompareExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCompareExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCompareExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareExprContext compareExpr() throws RecognitionException {
		CompareExprContext _localctx = new CompareExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_compareExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NON_EQUAL) | (1L << LESS) | (1L << GREATER))) != 0)) ) {
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

	public static class CompareOpContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public GetFunctContext getFunct() {
			return getRuleContext(GetFunctContext.class,0);
		}
		public LengthFunctContext lengthFunct() {
			return getRuleContext(LengthFunctContext.class,0);
		}
		public CompareOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCompareOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCompareOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCompareOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareOpContext compareOp() throws RecognitionException {
		CompareOpContext _localctx = new CompareOpContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_compareOp);
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				getFunct();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				lengthFunct();
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

	public static class CompareContext extends ParserRuleContext {
		public List<CompareOpContext> compareOp() {
			return getRuleContexts(CompareOpContext.class);
		}
		public CompareOpContext compareOp(int i) {
			return getRuleContext(CompareOpContext.class,i);
		}
		public CompareExprContext compareExpr() {
			return getRuleContext(CompareExprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(GrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GrammarParser.MINUS, 0); }
		public TerminalNode MULTIPLY() { return getToken(GrammarParser.MULTIPLY, 0); }
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_compare);
		int _la;
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				compareOp();
				setState(254);
				compareExpr();
				setState(255);
				compareOp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				compareOp();
				setState(258);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLY))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(259);
				compareOp();
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

	public static class ElseBlockContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(GrammarParser.ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitElseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(ELSE);
			setState(264);
			block();
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

	public static class IfBlockContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GrammarParser.IF, 0); }
		public TerminalNode O_BRACKET() { return getToken(GrammarParser.O_BRACKET, 0); }
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public TerminalNode C_BRACKET() { return getToken(GrammarParser.C_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(IF);
			setState(267);
			match(O_BRACKET);
			setState(268);
			compare();
			setState(269);
			match(C_BRACKET);
			setState(270);
			block();
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(271);
				elseBlock();
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

	public static class WhileBlockContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(GrammarParser.WHILE, 0); }
		public TerminalNode O_BRACKET() { return getToken(GrammarParser.O_BRACKET, 0); }
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public TerminalNode C_BRACKET() { return getToken(GrammarParser.C_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitWhileBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileBlockContext whileBlock() throws RecognitionException {
		WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_whileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(WHILE);
			setState(275);
			match(O_BRACKET);
			setState(276);
			compare();
			setState(277);
			match(C_BRACKET);
			setState(278);
			block();
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

	public static class ForBlockContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(GrammarParser.FOR, 0); }
		public TerminalNode O_BRACKET() { return getToken(GrammarParser.O_BRACKET, 0); }
		public List<CompareOpContext> compareOp() {
			return getRuleContexts(CompareOpContext.class);
		}
		public CompareOpContext compareOp(int i) {
			return getRuleContext(CompareOpContext.class,i);
		}
		public TerminalNode C_BRACKET() { return getToken(GrammarParser.C_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(GrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GrammarParser.MINUS, 0); }
		public TerminalNode MULTIPLY() { return getToken(GrammarParser.MULTIPLY, 0); }
		public ForBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterForBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitForBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitForBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForBlockContext forBlock() throws RecognitionException {
		ForBlockContext _localctx = new ForBlockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_forBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(FOR);
			setState(281);
			match(O_BRACKET);
			setState(282);
			compareOp();
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLY))) != 0)) {
				{
				setState(283);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLY))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(284);
				compareOp();
				}
			}

			setState(287);
			match(C_BRACKET);
			setState(288);
			block();
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
		public List<TerminalNode> NAME() { return getTokens(GrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GrammarParser.NAME, i);
		}
		public TerminalNode PLUS() { return getToken(GrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GrammarParser.MINUS, 0); }
		public TerminalNode MULTIPLY() { return getToken(GrammarParser.MULTIPLY, 0); }
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expression);
		int _la;
		try {
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				match(NAME);
				setState(291);
				match(PLUS);
				setState(292);
				match(NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				match(NAME);
				setState(294);
				match(MINUS);
				setState(295);
				match(NAME);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				match(NAME);
				setState(297);
				match(MULTIPLY);
				setState(298);
				_la = _input.LA(1);
				if ( !(_la==NAME || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(299);
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

	public static class ContentContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public VectorAssignmentContext vectorAssignment() {
			return getRuleContext(VectorAssignmentContext.class,0);
		}
		public MatrixAssignmentContext matrixAssignment() {
			return getRuleContext(MatrixAssignmentContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ShowFunctContext showFunct() {
			return getRuleContext(ShowFunctContext.class,0);
		}
		public AddFunctContext addFunct() {
			return getRuleContext(AddFunctContext.class,0);
		}
		public RemoveFunctContext removeFunct() {
			return getRuleContext(RemoveFunctContext.class,0);
		}
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public WhileBlockContext whileBlock() {
			return getRuleContext(WhileBlockContext.class,0);
		}
		public ForBlockContext forBlock() {
			return getRuleContext(ForBlockContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_content);
		try {
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				vectorAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(304);
				matrixAssignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(305);
				assignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(306);
				showFunct();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(307);
				addFunct();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(308);
				removeFunct();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(309);
				ifBlock();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(310);
				whileBlock();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(311);
				forBlock();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(312);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u013e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\2\7\2"+
		"A\n\2\f\2\16\2D\13\2\3\3\3\3\7\3H\n\3\f\3\16\3K\13\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\7\5W\n\5\f\5\16\5Z\13\5\3\5\3\5\3\6\5\6_\n\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\5\7g\n\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7o\n\7\f\7\16"+
		"\7r\13\7\3\7\3\7\3\7\3\b\5\bx\n\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008d\n\n\3\n\3\n\5\n\u0091"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0099\n\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16"+
		"\u00af\n\16\f\16\16\16\u00b2\13\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17"+
		"\u00ba\n\17\3\17\5\17\u00bd\n\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\7\21\u00c8\n\21\f\21\16\21\u00cb\13\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\5\22\u00d5\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u00de\n\23\3\23\3\23\3\24\3\24\7\24\u00e4\n\24\f\24\16\24\u00e7"+
		"\13\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\7\25\u00f0\n\25\f\25\16\25\u00f3"+
		"\13\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\5\27\u00fe\n\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0108\n\30\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0113\n\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\5\34\u0120\n\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u012f\n\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u013c\n\36\3\36\2\2\37\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\6\3\2\b"+
		"\t\3\2\37\"\3\2\33\35\3\2\n\13\2\u0145\2<\3\2\2\2\4E\3\2\2\2\6N\3\2\2"+
		"\2\bR\3\2\2\2\n^\3\2\2\2\ff\3\2\2\2\16w\3\2\2\2\20~\3\2\2\2\22\u0085\3"+
		"\2\2\2\24\u0092\3\2\2\2\26\u009a\3\2\2\2\30\u00a2\3\2\2\2\32\u00aa\3\2"+
		"\2\2\34\u00b5\3\2\2\2\36\u00be\3\2\2\2 \u00c0\3\2\2\2\"\u00ce\3\2\2\2"+
		"$\u00d8\3\2\2\2&\u00e1\3\2\2\2(\u00ed\3\2\2\2*\u00f8\3\2\2\2,\u00fd\3"+
		"\2\2\2.\u0107\3\2\2\2\60\u0109\3\2\2\2\62\u010c\3\2\2\2\64\u0114\3\2\2"+
		"\2\66\u011a\3\2\2\28\u012e\3\2\2\2:\u013b\3\2\2\2<=\7\3\2\2=B\5\4\3\2"+
		">A\5\"\22\2?A\5$\23\2@>\3\2\2\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2"+
		"\2C\3\3\2\2\2DB\3\2\2\2EI\7\6\2\2FH\5:\36\2GF\3\2\2\2HK\3\2\2\2IG\3\2"+
		"\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7\7\2\2M\5\3\2\2\2NO\5\36\20\2OP"+
		"\7\n\2\2PQ\7\36\2\2Q\7\3\2\2\2RS\7\6\2\2SX\7\13\2\2TU\7\32\2\2UW\7\13"+
		"\2\2VT\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\7"+
		"\7\2\2\\\t\3\2\2\2]_\7\b\2\2^]\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\7\n\2\2a"+
		"b\7\30\2\2bc\5\b\5\2cd\7\36\2\2d\13\3\2\2\2eg\7\t\2\2fe\3\2\2\2fg\3\2"+
		"\2\2gh\3\2\2\2hi\7\n\2\2ij\7\30\2\2jk\7\6\2\2kp\5\b\5\2lm\7\32\2\2mo\5"+
		"\b\5\2nl\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2st\7"+
		"\7\2\2tu\7\36\2\2u\r\3\2\2\2vx\5\36\20\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2"+
		"yz\7\n\2\2z{\7\30\2\2{|\58\35\2|}\7\36\2\2}\17\3\2\2\2~\177\7\n\2\2\177"+
		"\u0080\7\31\2\2\u0080\u0081\7\23\2\2\u0081\u0082\7\4\2\2\u0082\u0083\7"+
		"\5\2\2\u0083\u0084\7\36\2\2\u0084\21\3\2\2\2\u0085\u0086\7\n\2\2\u0086"+
		"\u0087\7\31\2\2\u0087\u0088\7\25\2\2\u0088\u0089\7\4\2\2\u0089\u008c\7"+
		"\13\2\2\u008a\u008b\7\32\2\2\u008b\u008d\7\13\2\2\u008c\u008a\3\2\2\2"+
		"\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\7\5\2\2\u008f\u0091"+
		"\7\36\2\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\23\3\2\2\2\u0092"+
		"\u0093\7\n\2\2\u0093\u0094\7\31\2\2\u0094\u0095\7\24\2\2\u0095\u0096\7"+
		"\4\2\2\u0096\u0098\7\5\2\2\u0097\u0099\7\36\2\2\u0098\u0097\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\25\3\2\2\2\u009a\u009b\7\n\2\2\u009b\u009c\7\31\2"+
		"\2\u009c\u009d\7\26\2\2\u009d\u009e\7\4\2\2\u009e\u009f\7\13\2\2\u009f"+
		"\u00a0\7\5\2\2\u00a0\u00a1\7\36\2\2\u00a1\27\3\2\2\2\u00a2\u00a3\7\n\2"+
		"\2\u00a3\u00a4\7\31\2\2\u00a4\u00a5\7\27\2\2\u00a5\u00a6\7\4\2\2\u00a6"+
		"\u00a7\7\13\2\2\u00a7\u00a8\7\5\2\2\u00a8\u00a9\7\36\2\2\u00a9\31\3\2"+
		"\2\2\u00aa\u00ab\7\4\2\2\u00ab\u00b0\7\n\2\2\u00ac\u00ad\7\32\2\2\u00ad"+
		"\u00af\7\n\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2"+
		"\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3"+
		"\u00b4\7\5\2\2\u00b4\33\3\2\2\2\u00b5\u00b9\7\n\2\2\u00b6\u00ba\5\32\16"+
		"\2\u00b7\u00b8\7\4\2\2\u00b8\u00ba\7\5\2\2\u00b9\u00b6\3\2\2\2\u00b9\u00b7"+
		"\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00bd\7\36\2\2\u00bc\u00bb\3\2\2\2"+
		"\u00bc\u00bd\3\2\2\2\u00bd\35\3\2\2\2\u00be\u00bf\t\2\2\2\u00bf\37\3\2"+
		"\2\2\u00c0\u00c1\7\4\2\2\u00c1\u00c2\5\36\20\2\u00c2\u00c9\7\n\2\2\u00c3"+
		"\u00c4\7\32\2\2\u00c4\u00c5\5\36\20\2\u00c5\u00c6\7\n\2\2\u00c6\u00c8"+
		"\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\7\5"+
		"\2\2\u00cd!\3\2\2\2\u00ce\u00cf\7\22\2\2\u00cf\u00d0\5\36\20\2\u00d0\u00d4"+
		"\7\n\2\2\u00d1\u00d5\5 \21\2\u00d2\u00d3\7\4\2\2\u00d3\u00d5\7\5\2\2\u00d4"+
		"\u00d1\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\5&"+
		"\24\2\u00d7#\3\2\2\2\u00d8\u00d9\7\22\2\2\u00d9\u00dd\7\n\2\2\u00da\u00de"+
		"\5 \21\2\u00db\u00dc\7\4\2\2\u00dc\u00de\7\5\2\2\u00dd\u00da\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\5(\25\2\u00e0%\3\2\2\2"+
		"\u00e1\u00e5\7\6\2\2\u00e2\u00e4\5:\36\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7"+
		"\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e8\u00e9\7\21\2\2\u00e9\u00ea\7\n\2\2\u00ea\u00eb\7"+
		"\36\2\2\u00eb\u00ec\7\7\2\2\u00ec\'\3\2\2\2\u00ed\u00f1\7\6\2\2\u00ee"+
		"\u00f0\5:\36\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2"+
		"\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4"+
		"\u00f5\7\21\2\2\u00f5\u00f6\7\36\2\2\u00f6\u00f7\7\7\2\2\u00f7)\3\2\2"+
		"\2\u00f8\u00f9\t\3\2\2\u00f9+\3\2\2\2\u00fa\u00fe\7\13\2\2\u00fb\u00fe"+
		"\5\22\n\2\u00fc\u00fe\5\24\13\2\u00fd\u00fa\3\2\2\2\u00fd\u00fb\3\2\2"+
		"\2\u00fd\u00fc\3\2\2\2\u00fe-\3\2\2\2\u00ff\u0100\5,\27\2\u0100\u0101"+
		"\5*\26\2\u0101\u0102\5,\27\2\u0102\u0108\3\2\2\2\u0103\u0104\5,\27\2\u0104"+
		"\u0105\t\4\2\2\u0105\u0106\5,\27\2\u0106\u0108\3\2\2\2\u0107\u00ff\3\2"+
		"\2\2\u0107\u0103\3\2\2\2\u0108/\3\2\2\2\u0109\u010a\7\16\2\2\u010a\u010b"+
		"\5\4\3\2\u010b\61\3\2\2\2\u010c\u010d\7\r\2\2\u010d\u010e\7\4\2\2\u010e"+
		"\u010f\5.\30\2\u010f\u0110\7\5\2\2\u0110\u0112\5\4\3\2\u0111\u0113\5\60"+
		"\31\2\u0112\u0111\3\2\2\2\u0112\u0113\3\2\2\2\u0113\63\3\2\2\2\u0114\u0115"+
		"\7\20\2\2\u0115\u0116\7\4\2\2\u0116\u0117\5.\30\2\u0117\u0118\7\5\2\2"+
		"\u0118\u0119\5\4\3\2\u0119\65\3\2\2\2\u011a\u011b\7\17\2\2\u011b\u011c"+
		"\7\4\2\2\u011c\u011f\5,\27\2\u011d\u011e\t\4\2\2\u011e\u0120\5,\27\2\u011f"+
		"\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\7\5"+
		"\2\2\u0122\u0123\5\4\3\2\u0123\67\3\2\2\2\u0124\u0125\7\n\2\2\u0125\u0126"+
		"\7\33\2\2\u0126\u012f\7\n\2\2\u0127\u0128\7\n\2\2\u0128\u0129\7\34\2\2"+
		"\u0129\u012f\7\n\2\2\u012a\u012b\7\n\2\2\u012b\u012c\7\35\2\2\u012c\u012f"+
		"\t\5\2\2\u012d\u012f\5\34\17\2\u012e\u0124\3\2\2\2\u012e\u0127\3\2\2\2"+
		"\u012e\u012a\3\2\2\2\u012e\u012d\3\2\2\2\u012f9\3\2\2\2\u0130\u013c\5"+
		"\6\4\2\u0131\u013c\5\n\6\2\u0132\u013c\5\f\7\2\u0133\u013c\5\16\b\2\u0134"+
		"\u013c\5\20\t\2\u0135\u013c\5\26\f\2\u0136\u013c\5\30\r\2\u0137\u013c"+
		"\5\62\32\2\u0138\u013c\5\64\33\2\u0139\u013c\5\66\34\2\u013a\u013c\5\34"+
		"\17\2\u013b\u0130\3\2\2\2\u013b\u0131\3\2\2\2\u013b\u0132\3\2\2\2\u013b"+
		"\u0133\3\2\2\2\u013b\u0134\3\2\2\2\u013b\u0135\3\2\2\2\u013b\u0136\3\2"+
		"\2\2\u013b\u0137\3\2\2\2\u013b\u0138\3\2\2\2\u013b\u0139\3\2\2\2\u013b"+
		"\u013a\3\2\2\2\u013c;\3\2\2\2\33@BIX^fpw\u008c\u0090\u0098\u00b0\u00b9"+
		"\u00bc\u00c9\u00d4\u00dd\u00e5\u00f1\u00fd\u0107\u0112\u011f\u012e\u013b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
package gen;// Generated from D:/Nastya/Java/MatVecCompiler/src\Grammar.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, O_BRACKET=2, C_BRACKET=3, O_FIGURE_BRACKET=4, C_FIGURE_BRACKET=5, 
		MATRIX=6, VECTOR=7, IF=8, ELSE=9, FOR=10, WHILE=11, RETURN=12, FUNCTION=13, 
		PRINT=14, LENGTH=15, NCOL=16, NROW=17, GET=18, ADD=19, REMOVE=20, ASSIGN=21, 
		DOT=22, COMMA=23, PLUS=24, MINUS=25, MULTIPLY=26, SEMICOLON=27, EQUAL=28, 
		NON_EQUAL=29, LESS=30, GREATER=31, SPACE=32, NAME=33, NUMBER=34, STRING=35;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_declaration = 2, RULE_set = 3, 
		RULE_vectorAssignment = 4, RULE_matrixAssignment = 5, RULE_assignment = 6, 
		RULE_printFunc = 7, RULE_getFunc = 8, RULE_lengthFunc = 9, RULE_ncolFunc = 10, 
		RULE_nrowFunc = 11, RULE_addFunc = 12, RULE_removeFunc = 13, RULE_inputSignature = 14, 
		RULE_functionCall = 15, RULE_type = 16, RULE_signatureFunction = 17, RULE_functionReturn = 18, 
		RULE_functionNonReturn = 19, RULE_blockReturn = 20, RULE_blockNonReturn = 21, 
		RULE_compareExpr = 22, RULE_compareOp = 23, RULE_compare = 24, RULE_elseBlock = 25, 
		RULE_ifBlock = 26, RULE_whileBlock = 27, RULE_forBlock = 28, RULE_expression = 29, 
		RULE_content = 30;
	public static final String[] ruleNames = {
		"program", "block", "declaration", "set", "vectorAssignment", "matrixAssignment", 
		"assignment", "printFunc", "getFunc", "lengthFunc", "ncolFunc", "nrowFunc", 
		"addFunc", "removeFunc", "inputSignature", "functionCall", "type", "signatureFunction", 
		"functionReturn", "functionNonReturn", "blockReturn", "blockNonReturn", 
		"compareExpr", "compareOp", "compare", "elseBlock", "ifBlock", "whileBlock", 
		"forBlock", "expression", "content"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'main'", "'('", "')'", "'{'", "'}'", "'matrix'", "'vector'", "'if'", 
		"'else'", "'for'", "'while'", "'return'", "'func'", "'print'", "'length'", 
		"'ncol'", "'nrow'", "'get'", "'add'", "'remove'", "'='", "'.'", "','", 
		"'+'", "'-'", "'*'", "';'", "'=='", "'!='", "'<'", "'>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "O_BRACKET", "C_BRACKET", "O_FIGURE_BRACKET", "C_FIGURE_BRACKET", 
		"MATRIX", "VECTOR", "IF", "ELSE", "FOR", "WHILE", "RETURN", "FUNCTION", 
		"PRINT", "LENGTH", "NCOL", "NROW", "GET", "ADD", "REMOVE", "ASSIGN", "DOT", 
		"COMMA", "PLUS", "MINUS", "MULTIPLY", "SEMICOLON", "EQUAL", "NON_EQUAL", 
		"LESS", "GREATER", "SPACE", "NAME", "NUMBER", "STRING"
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
			setState(62);
			match(T__0);
			setState(63);
			block();
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				setState(66);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(64);
					functionReturn();
					}
					break;
				case 2:
					{
					setState(65);
					functionNonReturn();
					}
					break;
				}
				}
				setState(70);
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
			setState(71);
			match(O_FIGURE_BRACKET);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MATRIX) | (1L << VECTOR) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << NAME))) != 0)) {
				{
				{
				setState(72);
				content();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
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
			setState(80);
			type();
			setState(81);
			match(NAME);
			setState(82);
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
			setState(84);
			match(O_FIGURE_BRACKET);
			setState(85);
			match(NUMBER);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(86);
				match(COMMA);
				setState(87);
				match(NUMBER);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
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
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VECTOR) {
				{
				setState(95);
				match(VECTOR);
				}
			}

			setState(98);
			match(NAME);
			setState(99);
			match(ASSIGN);
			setState(100);
			set();
			setState(101);
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
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MATRIX) {
				{
				setState(103);
				match(MATRIX);
				}
			}

			setState(106);
			match(NAME);
			setState(107);
			match(ASSIGN);
			setState(108);
			match(O_FIGURE_BRACKET);
			setState(109);
			set();
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(110);
				match(COMMA);
				setState(111);
				set();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			match(C_FIGURE_BRACKET);
			setState(118);
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
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MATRIX || _la==VECTOR) {
				{
				setState(120);
				type();
				}
			}

			setState(123);
			match(NAME);
			setState(124);
			match(ASSIGN);
			setState(125);
			expression();
			setState(126);
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

	public static class PrintFuncContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GrammarParser.NAME, 0); }
		public TerminalNode DOT() { return getToken(GrammarParser.DOT, 0); }
		public TerminalNode PRINT() { return getToken(GrammarParser.PRINT, 0); }
		public TerminalNode O_BRACKET() { return getToken(GrammarParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(GrammarParser.C_BRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public PrintFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPrintFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPrintFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPrintFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintFuncContext printFunc() throws RecognitionException {
		PrintFuncContext _localctx = new PrintFuncContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_printFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(NAME);
			setState(129);
			match(DOT);
			setState(130);
			match(PRINT);
			setState(131);
			match(O_BRACKET);
			setState(132);
			match(C_BRACKET);
			setState(133);
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

	public static class GetFuncContext extends ParserRuleContext {
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
		public GetFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterGetFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitGetFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitGetFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetFuncContext getFunc() throws RecognitionException {
		GetFuncContext _localctx = new GetFuncContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_getFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(NAME);
			setState(136);
			match(DOT);
			setState(137);
			match(GET);
			setState(138);
			match(O_BRACKET);
			setState(139);
			match(NUMBER);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(140);
				match(COMMA);
				setState(141);
				match(NUMBER);
				}
			}

			setState(144);
			match(C_BRACKET);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(145);
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

	public static class LengthFuncContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GrammarParser.NAME, 0); }
		public TerminalNode DOT() { return getToken(GrammarParser.DOT, 0); }
		public TerminalNode LENGTH() { return getToken(GrammarParser.LENGTH, 0); }
		public TerminalNode O_BRACKET() { return getToken(GrammarParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(GrammarParser.C_BRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public LengthFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lengthFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLengthFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLengthFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLengthFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LengthFuncContext lengthFunc() throws RecognitionException {
		LengthFuncContext _localctx = new LengthFuncContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lengthFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(NAME);
			setState(149);
			match(DOT);
			setState(150);
			match(LENGTH);
			setState(151);
			match(O_BRACKET);
			setState(152);
			match(C_BRACKET);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(153);
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

	public static class NcolFuncContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GrammarParser.NAME, 0); }
		public TerminalNode DOT() { return getToken(GrammarParser.DOT, 0); }
		public TerminalNode NCOL() { return getToken(GrammarParser.NCOL, 0); }
		public TerminalNode O_BRACKET() { return getToken(GrammarParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(GrammarParser.C_BRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public NcolFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ncolFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNcolFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNcolFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitNcolFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NcolFuncContext ncolFunc() throws RecognitionException {
		NcolFuncContext _localctx = new NcolFuncContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ncolFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(NAME);
			setState(157);
			match(DOT);
			setState(158);
			match(NCOL);
			setState(159);
			match(O_BRACKET);
			setState(160);
			match(C_BRACKET);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(161);
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

	public static class NrowFuncContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GrammarParser.NAME, 0); }
		public TerminalNode DOT() { return getToken(GrammarParser.DOT, 0); }
		public TerminalNode NROW() { return getToken(GrammarParser.NROW, 0); }
		public TerminalNode O_BRACKET() { return getToken(GrammarParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(GrammarParser.C_BRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public NrowFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nrowFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNrowFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNrowFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitNrowFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NrowFuncContext nrowFunc() throws RecognitionException {
		NrowFuncContext _localctx = new NrowFuncContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_nrowFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(NAME);
			setState(165);
			match(DOT);
			setState(166);
			match(NROW);
			setState(167);
			match(O_BRACKET);
			setState(168);
			match(C_BRACKET);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(169);
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

	public static class AddFuncContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GrammarParser.NAME, 0); }
		public TerminalNode DOT() { return getToken(GrammarParser.DOT, 0); }
		public TerminalNode ADD() { return getToken(GrammarParser.ADD, 0); }
		public TerminalNode O_BRACKET() { return getToken(GrammarParser.O_BRACKET, 0); }
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public TerminalNode C_BRACKET() { return getToken(GrammarParser.C_BRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public AddFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAddFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAddFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAddFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddFuncContext addFunc() throws RecognitionException {
		AddFuncContext _localctx = new AddFuncContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_addFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(NAME);
			setState(173);
			match(DOT);
			setState(174);
			match(ADD);
			setState(175);
			match(O_BRACKET);
			setState(176);
			match(NUMBER);
			setState(177);
			match(C_BRACKET);
			setState(178);
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

	public static class RemoveFuncContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GrammarParser.NAME, 0); }
		public TerminalNode DOT() { return getToken(GrammarParser.DOT, 0); }
		public TerminalNode REMOVE() { return getToken(GrammarParser.REMOVE, 0); }
		public TerminalNode O_BRACKET() { return getToken(GrammarParser.O_BRACKET, 0); }
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public TerminalNode C_BRACKET() { return getToken(GrammarParser.C_BRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public RemoveFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_removeFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRemoveFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRemoveFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitRemoveFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RemoveFuncContext removeFunc() throws RecognitionException {
		RemoveFuncContext _localctx = new RemoveFuncContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_removeFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(NAME);
			setState(181);
			match(DOT);
			setState(182);
			match(REMOVE);
			setState(183);
			match(O_BRACKET);
			setState(184);
			match(NUMBER);
			setState(185);
			match(C_BRACKET);
			setState(186);
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
		enterRule(_localctx, 28, RULE_inputSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(O_BRACKET);
			setState(189);
			match(NAME);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(190);
				match(COMMA);
				setState(191);
				match(NAME);
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197);
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
		enterRule(_localctx, 30, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(NAME);
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(200);
				inputSignature();
				}
				break;
			case 2:
				{
				{
				setState(201);
				match(O_BRACKET);
				setState(202);
				match(C_BRACKET);
				}
				}
				break;
			}
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(205);
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
		enterRule(_localctx, 32, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_la = _input.LA(1);
			if ( !(_la==MATRIX || _la==VECTOR) ) {
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
		enterRule(_localctx, 34, RULE_signatureFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(O_BRACKET);
			setState(211);
			type();
			setState(212);
			match(NAME);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(213);
				match(COMMA);
				setState(214);
				type();
				setState(215);
				match(NAME);
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
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
		enterRule(_localctx, 36, RULE_functionReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(FUNCTION);
			setState(225);
			type();
			setState(226);
			match(NAME);
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(227);
				signatureFunction();
				}
				break;
			case 2:
				{
				{
				setState(228);
				match(O_BRACKET);
				setState(229);
				match(C_BRACKET);
				}
				}
				break;
			}
			setState(232);
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
		enterRule(_localctx, 38, RULE_functionNonReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(FUNCTION);
			setState(235);
			match(NAME);
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(236);
				signatureFunction();
				}
				break;
			case 2:
				{
				{
				setState(237);
				match(O_BRACKET);
				setState(238);
				match(C_BRACKET);
				}
				}
				break;
			}
			setState(241);
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
		enterRule(_localctx, 40, RULE_blockReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(O_FIGURE_BRACKET);
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MATRIX) | (1L << VECTOR) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << NAME))) != 0)) {
				{
				{
				setState(244);
				content();
				}
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(250);
			match(RETURN);
			setState(251);
			match(NAME);
			setState(252);
			match(SEMICOLON);
			setState(253);
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
		enterRule(_localctx, 42, RULE_blockNonReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(O_FIGURE_BRACKET);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MATRIX) | (1L << VECTOR) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << NAME))) != 0)) {
				{
				{
				setState(256);
				content();
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(262);
			match(RETURN);
			setState(263);
			match(SEMICOLON);
			setState(264);
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
		enterRule(_localctx, 44, RULE_compareExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
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
		public GetFuncContext getFunc() {
			return getRuleContext(GetFuncContext.class,0);
		}
		public LengthFuncContext lengthFunc() {
			return getRuleContext(LengthFuncContext.class,0);
		}
		public NcolFuncContext ncolFunc() {
			return getRuleContext(NcolFuncContext.class,0);
		}
		public NrowFuncContext nrowFunc() {
			return getRuleContext(NrowFuncContext.class,0);
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
		enterRule(_localctx, 46, RULE_compareOp);
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				getFunc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(270);
				lengthFunc();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(271);
				ncolFunc();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(272);
				nrowFunc();
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
		enterRule(_localctx, 48, RULE_compare);
		int _la;
		try {
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				compareOp();
				setState(276);
				compareExpr();
				setState(277);
				compareOp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				compareOp();
				setState(280);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLY))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(281);
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
		enterRule(_localctx, 50, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(ELSE);
			setState(286);
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
		enterRule(_localctx, 52, RULE_ifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(IF);
			setState(289);
			match(O_BRACKET);
			setState(290);
			compare();
			setState(291);
			match(C_BRACKET);
			setState(292);
			block();
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(293);
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
		enterRule(_localctx, 54, RULE_whileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(WHILE);
			setState(297);
			match(O_BRACKET);
			setState(298);
			compare();
			setState(299);
			match(C_BRACKET);
			setState(300);
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
		enterRule(_localctx, 56, RULE_forBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(FOR);
			setState(303);
			match(O_BRACKET);
			setState(304);
			compareOp();
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLY))) != 0)) {
				{
				setState(305);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLY))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(306);
				compareOp();
				}
			}

			setState(309);
			match(C_BRACKET);
			setState(310);
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
		enterRule(_localctx, 58, RULE_expression);
		int _la;
		try {
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				match(NAME);
				setState(313);
				match(PLUS);
				setState(314);
				match(NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				match(NAME);
				setState(316);
				match(MINUS);
				setState(317);
				match(NAME);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(318);
				match(NAME);
				setState(319);
				match(MULTIPLY);
				setState(320);
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
				setState(321);
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
		public PrintFuncContext printFunc() {
			return getRuleContext(PrintFuncContext.class,0);
		}
		public AddFuncContext addFunc() {
			return getRuleContext(AddFuncContext.class,0);
		}
		public RemoveFuncContext removeFunc() {
			return getRuleContext(RemoveFuncContext.class,0);
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
		enterRule(_localctx, 60, RULE_content);
		try {
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				vectorAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(326);
				matrixAssignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(327);
				assignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(328);
				printFunc();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(329);
				addFunc();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(330);
				removeFunc();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(331);
				ifBlock();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(332);
				whileBlock();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(333);
				forBlock();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(334);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u0154\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\2\7\2E\n\2\f\2\16\2H\13\2\3\3\3\3\7\3L\n\3\f\3\16\3O\13\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5[\n\5\f\5\16\5^\13\5\3\5\3\5"+
		"\3\6\5\6c\n\6\3\6\3\6\3\6\3\6\3\6\3\7\5\7k\n\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\7\7s\n\7\f\7\16\7v\13\7\3\7\3\7\3\7\3\b\5\b|\n\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0091\n\n"+
		"\3\n\3\n\5\n\u0095\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u009d\n\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a5\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ad"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u00c3\n\20\f\20\16\20\u00c6\13"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00ce\n\21\3\21\5\21\u00d1\n\21"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00dc\n\23\f\23\16"+
		"\23\u00df\13\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00e9\n\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u00f2\n\25\3\25\3\25\3\26\3\26"+
		"\7\26\u00f8\n\26\f\26\16\26\u00fb\13\26\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\7\27\u0104\n\27\f\27\16\27\u0107\13\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\5\31\u0114\n\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u011e\n\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u0129\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\5\36\u0136\n\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\5\37\u0145\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0152"+
		"\n \3 \2\2!\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>\2\6\3\2\b\t\3\2\36!\3\2\32\34\3\2#$\2\u015d\2@\3\2\2\2\4I\3\2\2\2"+
		"\6R\3\2\2\2\bV\3\2\2\2\nb\3\2\2\2\fj\3\2\2\2\16{\3\2\2\2\20\u0082\3\2"+
		"\2\2\22\u0089\3\2\2\2\24\u0096\3\2\2\2\26\u009e\3\2\2\2\30\u00a6\3\2\2"+
		"\2\32\u00ae\3\2\2\2\34\u00b6\3\2\2\2\36\u00be\3\2\2\2 \u00c9\3\2\2\2\""+
		"\u00d2\3\2\2\2$\u00d4\3\2\2\2&\u00e2\3\2\2\2(\u00ec\3\2\2\2*\u00f5\3\2"+
		"\2\2,\u0101\3\2\2\2.\u010c\3\2\2\2\60\u0113\3\2\2\2\62\u011d\3\2\2\2\64"+
		"\u011f\3\2\2\2\66\u0122\3\2\2\28\u012a\3\2\2\2:\u0130\3\2\2\2<\u0144\3"+
		"\2\2\2>\u0151\3\2\2\2@A\7\3\2\2AF\5\4\3\2BE\5&\24\2CE\5(\25\2DB\3\2\2"+
		"\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\3\3\2\2\2HF\3\2\2\2IM\7\6"+
		"\2\2JL\5> \2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2"+
		"\2PQ\7\7\2\2Q\5\3\2\2\2RS\5\"\22\2ST\7#\2\2TU\7\35\2\2U\7\3\2\2\2VW\7"+
		"\6\2\2W\\\7$\2\2XY\7\31\2\2Y[\7$\2\2ZX\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\"+
		"]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7\7\2\2`\t\3\2\2\2ac\7\t\2\2ba\3\2\2"+
		"\2bc\3\2\2\2cd\3\2\2\2de\7#\2\2ef\7\27\2\2fg\5\b\5\2gh\7\35\2\2h\13\3"+
		"\2\2\2ik\7\b\2\2ji\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\7#\2\2mn\7\27\2\2no\7"+
		"\6\2\2ot\5\b\5\2pq\7\31\2\2qs\5\b\5\2rp\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu"+
		"\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7\7\2\2xy\7\35\2\2y\r\3\2\2\2z|\5\"\22"+
		"\2{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7#\2\2~\177\7\27\2\2\177\u0080\5<\37"+
		"\2\u0080\u0081\7\35\2\2\u0081\17\3\2\2\2\u0082\u0083\7#\2\2\u0083\u0084"+
		"\7\30\2\2\u0084\u0085\7\20\2\2\u0085\u0086\7\4\2\2\u0086\u0087\7\5\2\2"+
		"\u0087\u0088\7\35\2\2\u0088\21\3\2\2\2\u0089\u008a\7#\2\2\u008a\u008b"+
		"\7\30\2\2\u008b\u008c\7\24\2\2\u008c\u008d\7\4\2\2\u008d\u0090\7$\2\2"+
		"\u008e\u008f\7\31\2\2\u008f\u0091\7$\2\2\u0090\u008e\3\2\2\2\u0090\u0091"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\7\5\2\2\u0093\u0095\7\35\2\2"+
		"\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\23\3\2\2\2\u0096\u0097"+
		"\7#\2\2\u0097\u0098\7\30\2\2\u0098\u0099\7\21\2\2\u0099\u009a\7\4\2\2"+
		"\u009a\u009c\7\5\2\2\u009b\u009d\7\35\2\2\u009c\u009b\3\2\2\2\u009c\u009d"+
		"\3\2\2\2\u009d\25\3\2\2\2\u009e\u009f\7#\2\2\u009f\u00a0\7\30\2\2\u00a0"+
		"\u00a1\7\22\2\2\u00a1\u00a2\7\4\2\2\u00a2\u00a4\7\5\2\2\u00a3\u00a5\7"+
		"\35\2\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\27\3\2\2\2\u00a6"+
		"\u00a7\7#\2\2\u00a7\u00a8\7\30\2\2\u00a8\u00a9\7\23\2\2\u00a9\u00aa\7"+
		"\4\2\2\u00aa\u00ac\7\5\2\2\u00ab\u00ad\7\35\2\2\u00ac\u00ab\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\31\3\2\2\2\u00ae\u00af\7#\2\2\u00af\u00b0\7\30\2"+
		"\2\u00b0\u00b1\7\25\2\2\u00b1\u00b2\7\4\2\2\u00b2\u00b3\7$\2\2\u00b3\u00b4"+
		"\7\5\2\2\u00b4\u00b5\7\35\2\2\u00b5\33\3\2\2\2\u00b6\u00b7\7#\2\2\u00b7"+
		"\u00b8\7\30\2\2\u00b8\u00b9\7\26\2\2\u00b9\u00ba\7\4\2\2\u00ba\u00bb\7"+
		"$\2\2\u00bb\u00bc\7\5\2\2\u00bc\u00bd\7\35\2\2\u00bd\35\3\2\2\2\u00be"+
		"\u00bf\7\4\2\2\u00bf\u00c4\7#\2\2\u00c0\u00c1\7\31\2\2\u00c1\u00c3\7#"+
		"\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7\5"+
		"\2\2\u00c8\37\3\2\2\2\u00c9\u00cd\7#\2\2\u00ca\u00ce\5\36\20\2\u00cb\u00cc"+
		"\7\4\2\2\u00cc\u00ce\7\5\2\2\u00cd\u00ca\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce"+
		"\u00d0\3\2\2\2\u00cf\u00d1\7\35\2\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3"+
		"\2\2\2\u00d1!\3\2\2\2\u00d2\u00d3\t\2\2\2\u00d3#\3\2\2\2\u00d4\u00d5\7"+
		"\4\2\2\u00d5\u00d6\5\"\22\2\u00d6\u00dd\7#\2\2\u00d7\u00d8\7\31\2\2\u00d8"+
		"\u00d9\5\"\22\2\u00d9\u00da\7#\2\2\u00da\u00dc\3\2\2\2\u00db\u00d7\3\2"+
		"\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00e0\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\7\5\2\2\u00e1%\3\2\2\2"+
		"\u00e2\u00e3\7\17\2\2\u00e3\u00e4\5\"\22\2\u00e4\u00e8\7#\2\2\u00e5\u00e9"+
		"\5$\23\2\u00e6\u00e7\7\4\2\2\u00e7\u00e9\7\5\2\2\u00e8\u00e5\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\5*\26\2\u00eb\'\3\2\2\2"+
		"\u00ec\u00ed\7\17\2\2\u00ed\u00f1\7#\2\2\u00ee\u00f2\5$\23\2\u00ef\u00f0"+
		"\7\4\2\2\u00f0\u00f2\7\5\2\2\u00f1\u00ee\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3\u00f4\5,\27\2\u00f4)\3\2\2\2\u00f5\u00f9\7\6\2\2"+
		"\u00f6\u00f8\5> \2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7"+
		"\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc"+
		"\u00fd\7\16\2\2\u00fd\u00fe\7#\2\2\u00fe\u00ff\7\35\2\2\u00ff\u0100\7"+
		"\7\2\2\u0100+\3\2\2\2\u0101\u0105\7\6\2\2\u0102\u0104\5> \2\u0103\u0102"+
		"\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\7\16\2\2\u0109\u010a\7"+
		"\35\2\2\u010a\u010b\7\7\2\2\u010b-\3\2\2\2\u010c\u010d\t\3\2\2\u010d/"+
		"\3\2\2\2\u010e\u0114\7$\2\2\u010f\u0114\5\22\n\2\u0110\u0114\5\24\13\2"+
		"\u0111\u0114\5\26\f\2\u0112\u0114\5\30\r\2\u0113\u010e\3\2\2\2\u0113\u010f"+
		"\3\2\2\2\u0113\u0110\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114"+
		"\61\3\2\2\2\u0115\u0116\5\60\31\2\u0116\u0117\5.\30\2\u0117\u0118\5\60"+
		"\31\2\u0118\u011e\3\2\2\2\u0119\u011a\5\60\31\2\u011a\u011b\t\4\2\2\u011b"+
		"\u011c\5\60\31\2\u011c\u011e\3\2\2\2\u011d\u0115\3\2\2\2\u011d\u0119\3"+
		"\2\2\2\u011e\63\3\2\2\2\u011f\u0120\7\13\2\2\u0120\u0121\5\4\3\2\u0121"+
		"\65\3\2\2\2\u0122\u0123\7\n\2\2\u0123\u0124\7\4\2\2\u0124\u0125\5\62\32"+
		"\2\u0125\u0126\7\5\2\2\u0126\u0128\5\4\3\2\u0127\u0129\5\64\33\2\u0128"+
		"\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129\67\3\2\2\2\u012a\u012b\7\r\2"+
		"\2\u012b\u012c\7\4\2\2\u012c\u012d\5\62\32\2\u012d\u012e\7\5\2\2\u012e"+
		"\u012f\5\4\3\2\u012f9\3\2\2\2\u0130\u0131\7\f\2\2\u0131\u0132\7\4\2\2"+
		"\u0132\u0135\5\60\31\2\u0133\u0134\t\4\2\2\u0134\u0136\5\60\31\2\u0135"+
		"\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\7\5"+
		"\2\2\u0138\u0139\5\4\3\2\u0139;\3\2\2\2\u013a\u013b\7#\2\2\u013b\u013c"+
		"\7\32\2\2\u013c\u0145\7#\2\2\u013d\u013e\7#\2\2\u013e\u013f\7\33\2\2\u013f"+
		"\u0145\7#\2\2\u0140\u0141\7#\2\2\u0141\u0142\7\34\2\2\u0142\u0145\t\5"+
		"\2\2\u0143\u0145\5 \21\2\u0144\u013a\3\2\2\2\u0144\u013d\3\2\2\2\u0144"+
		"\u0140\3\2\2\2\u0144\u0143\3\2\2\2\u0145=\3\2\2\2\u0146\u0152\5\6\4\2"+
		"\u0147\u0152\5\n\6\2\u0148\u0152\5\f\7\2\u0149\u0152\5\16\b\2\u014a\u0152"+
		"\5\20\t\2\u014b\u0152\5\32\16\2\u014c\u0152\5\34\17\2\u014d\u0152\5\66"+
		"\34\2\u014e\u0152\58\35\2\u014f\u0152\5:\36\2\u0150\u0152\5 \21\2\u0151"+
		"\u0146\3\2\2\2\u0151\u0147\3\2\2\2\u0151\u0148\3\2\2\2\u0151\u0149\3\2"+
		"\2\2\u0151\u014a\3\2\2\2\u0151\u014b\3\2\2\2\u0151\u014c\3\2\2\2\u0151"+
		"\u014d\3\2\2\2\u0151\u014e\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0150\3\2"+
		"\2\2\u0152?\3\2\2\2\35DFM\\bjt{\u0090\u0094\u009c\u00a4\u00ac\u00c4\u00cd"+
		"\u00d0\u00dd\u00e8\u00f1\u00f9\u0105\u0113\u011d\u0128\u0135\u0144\u0151";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
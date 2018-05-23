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
		MATRIX=6, VECTOR=7, INT=8, IF=9, ELSE=10, FOR=11, WHILE=12, RETURN=13, 
		FUNCTION=14, PRINT=15, LENGTH=16, NCOL=17, NROW=18, SET=19, GET=20, ADD=21, 
		REMOVE=22, ASSIGN=23, DOT=24, COMMA=25, PLUS=26, MINUS=27, MULTIPLY=28, 
		SEMICOLON=29, EQUAL=30, NON_EQUAL=31, LESS=32, GREATER=33, SPACE=34, NAME=35, 
		NUMBER=36, STRING=37;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_declaration = 2, RULE_set = 3, 
		RULE_intAssignment = 4, RULE_vectorAssignment = 5, RULE_matrixAssignment = 6, 
		RULE_assignment = 7, RULE_printFunc = 8, RULE_getFunc = 9, RULE_setFunc = 10, 
		RULE_lengthFunc = 11, RULE_ncolFunc = 12, RULE_nrowFunc = 13, RULE_addFunc = 14, 
		RULE_removeFunc = 15, RULE_inputSignature = 16, RULE_functionCall = 17, 
		RULE_type = 18, RULE_signatureFunction = 19, RULE_functionReturn = 20, 
		RULE_functionNonReturn = 21, RULE_blockReturn = 22, RULE_blockNonReturn = 23, 
		RULE_compareExpr = 24, RULE_compareOp = 25, RULE_compare = 26, RULE_elseBlock = 27, 
		RULE_ifBlock = 28, RULE_whileBlock = 29, RULE_forBlock = 30, RULE_intOperation = 31, 
		RULE_expression = 32, RULE_content = 33;
	public static final String[] ruleNames = {
		"program", "block", "declaration", "set", "intAssignment", "vectorAssignment", 
		"matrixAssignment", "assignment", "printFunc", "getFunc", "setFunc", "lengthFunc", 
		"ncolFunc", "nrowFunc", "addFunc", "removeFunc", "inputSignature", "functionCall", 
		"type", "signatureFunction", "functionReturn", "functionNonReturn", "blockReturn", 
		"blockNonReturn", "compareExpr", "compareOp", "compare", "elseBlock", 
		"ifBlock", "whileBlock", "forBlock", "intOperation", "expression", "content"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'main'", "'('", "')'", "'{'", "'}'", "'matrix'", "'vector'", "'int'", 
		"'if'", "'else'", "'for'", "'while'", "'return'", "'func'", "'print'", 
		"'length'", "'ncol'", "'nrow'", "'set'", "'get'", "'add'", "'remove'", 
		"'='", "'.'", "','", "'+'", "'-'", "'*'", "';'", "'=='", "'!='", "'<'", 
		"'>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "O_BRACKET", "C_BRACKET", "O_FIGURE_BRACKET", "C_FIGURE_BRACKET", 
		"MATRIX", "VECTOR", "INT", "IF", "ELSE", "FOR", "WHILE", "RETURN", "FUNCTION", 
		"PRINT", "LENGTH", "NCOL", "NROW", "SET", "GET", "ADD", "REMOVE", "ASSIGN", 
		"DOT", "COMMA", "PLUS", "MINUS", "MULTIPLY", "SEMICOLON", "EQUAL", "NON_EQUAL", 
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
			setState(68);
			match(T__0);
			setState(69);
			block();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				setState(72);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(70);
					functionReturn();
					}
					break;
				case 2:
					{
					setState(71);
					functionNonReturn();
					}
					break;
				}
				}
				setState(76);
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
			setState(77);
			match(O_FIGURE_BRACKET);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MATRIX) | (1L << VECTOR) | (1L << INT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << NAME))) != 0)) {
				{
				{
				setState(78);
				content();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
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
			setState(86);
			type();
			setState(87);
			match(NAME);
			setState(88);
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
			setState(90);
			match(O_FIGURE_BRACKET);
			setState(91);
			match(NUMBER);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(92);
				match(COMMA);
				setState(93);
				match(NUMBER);
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
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

	public static class IntAssignmentContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GrammarParser.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public TerminalNode INT() { return getToken(GrammarParser.INT, 0); }
		public IntAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIntAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIntAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitIntAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntAssignmentContext intAssignment() throws RecognitionException {
		IntAssignmentContext _localctx = new IntAssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_intAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(101);
				match(INT);
				}
			}

			setState(104);
			match(NAME);
			setState(105);
			match(ASSIGN);
			setState(106);
			match(NUMBER);
			setState(107);
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
		enterRule(_localctx, 10, RULE_vectorAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VECTOR) {
				{
				setState(109);
				match(VECTOR);
				}
			}

			setState(112);
			match(NAME);
			setState(113);
			match(ASSIGN);
			setState(114);
			set();
			setState(115);
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
		enterRule(_localctx, 12, RULE_matrixAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MATRIX) {
				{
				setState(117);
				match(MATRIX);
				}
			}

			setState(120);
			match(NAME);
			setState(121);
			match(ASSIGN);
			setState(122);
			match(O_FIGURE_BRACKET);
			setState(123);
			set();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(124);
				match(COMMA);
				setState(125);
				set();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			match(C_FIGURE_BRACKET);
			setState(132);
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
		enterRule(_localctx, 14, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MATRIX || _la==VECTOR) {
				{
				setState(134);
				type();
				}
			}

			setState(137);
			match(NAME);
			setState(138);
			match(ASSIGN);
			setState(139);
			expression();
			setState(140);
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
		enterRule(_localctx, 16, RULE_printFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(NAME);
			setState(143);
			match(DOT);
			setState(144);
			match(PRINT);
			setState(145);
			match(O_BRACKET);
			setState(146);
			match(C_BRACKET);
			setState(147);
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
		public List<TerminalNode> NAME() { return getTokens(GrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GrammarParser.NAME, i);
		}
		public TerminalNode DOT() { return getToken(GrammarParser.DOT, 0); }
		public TerminalNode GET() { return getToken(GrammarParser.GET, 0); }
		public TerminalNode O_BRACKET() { return getToken(GrammarParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(GrammarParser.C_BRACKET, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(GrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(GrammarParser.NUMBER, i);
		}
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
		enterRule(_localctx, 18, RULE_getFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(NAME);
			setState(150);
			match(DOT);
			setState(151);
			match(GET);
			setState(152);
			match(O_BRACKET);
			setState(153);
			_la = _input.LA(1);
			if ( !(_la==NAME || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(154);
				match(COMMA);
				setState(155);
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
			}

			setState(158);
			match(C_BRACKET);
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(159);
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

	public static class SetFuncContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(GrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GrammarParser.NAME, i);
		}
		public TerminalNode DOT() { return getToken(GrammarParser.DOT, 0); }
		public TerminalNode SET() { return getToken(GrammarParser.SET, 0); }
		public TerminalNode O_BRACKET() { return getToken(GrammarParser.O_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public TerminalNode C_BRACKET() { return getToken(GrammarParser.C_BRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(GrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(GrammarParser.NUMBER, i);
		}
		public IntOperationContext intOperation() {
			return getRuleContext(IntOperationContext.class,0);
		}
		public GetFuncContext getFunc() {
			return getRuleContext(GetFuncContext.class,0);
		}
		public SetFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSetFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSetFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSetFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetFuncContext setFunc() throws RecognitionException {
		SetFuncContext _localctx = new SetFuncContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_setFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(NAME);
			setState(163);
			match(DOT);
			setState(164);
			match(SET);
			setState(165);
			match(O_BRACKET);
			setState(166);
			_la = _input.LA(1);
			if ( !(_la==NAME || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(167);
				match(COMMA);
				setState(168);
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
			}
			setState(171);
			match(COMMA);
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(172);
				intOperation();
				}
				break;
			case 2:
				{
				setState(173);
				match(NAME);
				}
				break;
			case 3:
				{
				setState(174);
				match(NUMBER);
				}
				break;
			case 4:
				{
				setState(175);
				getFunc();
				}
				break;
			}
			setState(178);
			match(C_BRACKET);
			setState(179);
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
		enterRule(_localctx, 22, RULE_lengthFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(NAME);
			setState(182);
			match(DOT);
			setState(183);
			match(LENGTH);
			setState(184);
			match(O_BRACKET);
			setState(185);
			match(C_BRACKET);
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(186);
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
		enterRule(_localctx, 24, RULE_ncolFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(NAME);
			setState(190);
			match(DOT);
			setState(191);
			match(NCOL);
			setState(192);
			match(O_BRACKET);
			setState(193);
			match(C_BRACKET);
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(194);
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
		enterRule(_localctx, 26, RULE_nrowFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(NAME);
			setState(198);
			match(DOT);
			setState(199);
			match(NROW);
			setState(200);
			match(O_BRACKET);
			setState(201);
			match(C_BRACKET);
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(202);
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
		enterRule(_localctx, 28, RULE_addFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(NAME);
			setState(206);
			match(DOT);
			setState(207);
			match(ADD);
			setState(208);
			match(O_BRACKET);
			setState(209);
			match(NUMBER);
			setState(210);
			match(C_BRACKET);
			setState(211);
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
		enterRule(_localctx, 30, RULE_removeFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(NAME);
			setState(214);
			match(DOT);
			setState(215);
			match(REMOVE);
			setState(216);
			match(O_BRACKET);
			setState(217);
			match(NUMBER);
			setState(218);
			match(C_BRACKET);
			setState(219);
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
		enterRule(_localctx, 32, RULE_inputSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(O_BRACKET);
			setState(222);
			match(NAME);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(223);
				match(COMMA);
				setState(224);
				match(NAME);
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230);
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
		enterRule(_localctx, 34, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(NAME);
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(233);
				inputSignature();
				}
				break;
			case 2:
				{
				{
				setState(234);
				match(O_BRACKET);
				setState(235);
				match(C_BRACKET);
				}
				}
				break;
			}
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(238);
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
		enterRule(_localctx, 36, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
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
		enterRule(_localctx, 38, RULE_signatureFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(O_BRACKET);
			setState(244);
			type();
			setState(245);
			match(NAME);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(246);
				match(COMMA);
				setState(247);
				type();
				setState(248);
				match(NAME);
				}
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(255);
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
		enterRule(_localctx, 40, RULE_functionReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(FUNCTION);
			setState(258);
			type();
			setState(259);
			match(NAME);
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(260);
				signatureFunction();
				}
				break;
			case 2:
				{
				{
				setState(261);
				match(O_BRACKET);
				setState(262);
				match(C_BRACKET);
				}
				}
				break;
			}
			setState(265);
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
		enterRule(_localctx, 42, RULE_functionNonReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(FUNCTION);
			setState(268);
			match(NAME);
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(269);
				signatureFunction();
				}
				break;
			case 2:
				{
				{
				setState(270);
				match(O_BRACKET);
				setState(271);
				match(C_BRACKET);
				}
				}
				break;
			}
			setState(274);
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
		enterRule(_localctx, 44, RULE_blockReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(O_FIGURE_BRACKET);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MATRIX) | (1L << VECTOR) | (1L << INT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << NAME))) != 0)) {
				{
				{
				setState(277);
				content();
				}
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(283);
			match(RETURN);
			setState(284);
			match(NAME);
			setState(285);
			match(SEMICOLON);
			setState(286);
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
		enterRule(_localctx, 46, RULE_blockNonReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(O_FIGURE_BRACKET);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MATRIX) | (1L << VECTOR) | (1L << INT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << NAME))) != 0)) {
				{
				{
				setState(289);
				content();
				}
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(295);
			match(RETURN);
			setState(296);
			match(SEMICOLON);
			setState(297);
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
		enterRule(_localctx, 48, RULE_compareExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
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
		public TerminalNode NAME() { return getToken(GrammarParser.NAME, 0); }
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
		enterRule(_localctx, 50, RULE_compareOp);
		try {
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				match(NAME);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(303);
				getFunc();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(304);
				lengthFunc();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(305);
				ncolFunc();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(306);
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
		enterRule(_localctx, 52, RULE_compare);
		int _la;
		try {
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				compareOp();
				setState(310);
				compareExpr();
				setState(311);
				compareOp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				compareOp();
				setState(314);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLY))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(315);
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
		enterRule(_localctx, 54, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(ELSE);
			setState(320);
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
		enterRule(_localctx, 56, RULE_ifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(IF);
			setState(323);
			match(O_BRACKET);
			setState(324);
			compare();
			setState(325);
			match(C_BRACKET);
			setState(326);
			block();
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(327);
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
		enterRule(_localctx, 58, RULE_whileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(WHILE);
			setState(331);
			match(O_BRACKET);
			setState(332);
			compare();
			setState(333);
			match(C_BRACKET);
			setState(334);
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
		public IntAssignmentContext intAssignment() {
			return getRuleContext(IntAssignmentContext.class,0);
		}
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public TerminalNode NAME() { return getToken(GrammarParser.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public IntOperationContext intOperation() {
			return getRuleContext(IntOperationContext.class,0);
		}
		public TerminalNode C_BRACKET() { return getToken(GrammarParser.C_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
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
		enterRule(_localctx, 60, RULE_forBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(FOR);
			setState(337);
			match(O_BRACKET);
			setState(338);
			intAssignment();
			setState(339);
			compare();
			setState(340);
			match(SEMICOLON);
			setState(341);
			match(NAME);
			setState(342);
			match(ASSIGN);
			setState(343);
			intOperation();
			setState(344);
			match(C_BRACKET);
			setState(345);
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

	public static class IntOperationContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(GrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GrammarParser.MINUS, 0); }
		public TerminalNode MULTIPLY() { return getToken(GrammarParser.MULTIPLY, 0); }
		public List<TerminalNode> NAME() { return getTokens(GrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GrammarParser.NAME, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(GrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(GrammarParser.NUMBER, i);
		}
		public List<GetFuncContext> getFunc() {
			return getRuleContexts(GetFuncContext.class);
		}
		public GetFuncContext getFunc(int i) {
			return getRuleContext(GetFuncContext.class,i);
		}
		public IntOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIntOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIntOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitIntOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntOperationContext intOperation() throws RecognitionException {
		IntOperationContext _localctx = new IntOperationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_intOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(347);
				match(NAME);
				}
				break;
			case 2:
				{
				setState(348);
				match(NUMBER);
				}
				break;
			case 3:
				{
				setState(349);
				getFunc();
				}
				break;
			}
			setState(352);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLY))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(353);
				match(NAME);
				}
				break;
			case 2:
				{
				setState(354);
				match(NUMBER);
				}
				break;
			case 3:
				{
				setState(355);
				getFunc();
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(GrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GrammarParser.NAME, i);
		}
		public TerminalNode PLUS() { return getToken(GrammarParser.PLUS, 0); }
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public TerminalNode MINUS() { return getToken(GrammarParser.MINUS, 0); }
		public TerminalNode MULTIPLY() { return getToken(GrammarParser.MULTIPLY, 0); }
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
		enterRule(_localctx, 64, RULE_expression);
		int _la;
		try {
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				match(NAME);
				setState(359);
				match(PLUS);
				setState(360);
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
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				match(NAME);
				setState(362);
				match(MINUS);
				setState(363);
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
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(364);
				match(NAME);
				setState(365);
				match(MULTIPLY);
				setState(366);
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
				setState(367);
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
		public IntAssignmentContext intAssignment() {
			return getRuleContext(IntAssignmentContext.class,0);
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
		public SetFuncContext setFunc() {
			return getRuleContext(SetFuncContext.class,0);
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
		enterRule(_localctx, 66, RULE_content);
		try {
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				vectorAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(372);
				matrixAssignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(373);
				intAssignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(374);
				assignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(375);
				printFunc();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(376);
				addFunc();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(377);
				removeFunc();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(378);
				ifBlock();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(379);
				whileBlock();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(380);
				forBlock();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(381);
				functionCall();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(382);
				setFunc();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u0184\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\7\2K\n\2\f\2\16\2N\13\2\3\3\3\3\7\3"+
		"R\n\3\f\3\16\3U\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5a\n\5"+
		"\f\5\16\5d\13\5\3\5\3\5\3\6\5\6i\n\6\3\6\3\6\3\6\3\6\3\6\3\7\5\7q\n\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\5\by\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0081\n"+
		"\b\f\b\16\b\u0084\13\b\3\b\3\b\3\b\3\t\5\t\u008a\n\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u009f\n\13\3\13\3\13\5\13\u00a3\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u00ac\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b3\n\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u00be\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00c6\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ce\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\7\22\u00e4\n\22\f\22\16\22\u00e7\13\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\5\23\u00ef\n\23\3\23\5\23\u00f2\n\23\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\7\25\u00fd\n\25\f\25\16\25\u0100\13\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\5\26\u010a\n\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u0113\n\27\3\27\3\27\3\30\3\30\7\30\u0119\n\30\f\30\16"+
		"\30\u011c\13\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\7\31\u0125\n\31\f\31"+
		"\16\31\u0128\13\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\5\33\u0136\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u0140\n\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u014b\n"+
		"\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!"+
		"\3!\3!\5!\u0161\n!\3!\3!\3!\3!\5!\u0167\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\5\"\u0173\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0182"+
		"\n#\3#\2\2$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BD\2\6\3\2%&\3\2\b\t\3\2 #\3\2\34\36\2\u0195\2F\3\2\2\2\4O\3\2\2"+
		"\2\6X\3\2\2\2\b\\\3\2\2\2\nh\3\2\2\2\fp\3\2\2\2\16x\3\2\2\2\20\u0089\3"+
		"\2\2\2\22\u0090\3\2\2\2\24\u0097\3\2\2\2\26\u00a4\3\2\2\2\30\u00b7\3\2"+
		"\2\2\32\u00bf\3\2\2\2\34\u00c7\3\2\2\2\36\u00cf\3\2\2\2 \u00d7\3\2\2\2"+
		"\"\u00df\3\2\2\2$\u00ea\3\2\2\2&\u00f3\3\2\2\2(\u00f5\3\2\2\2*\u0103\3"+
		"\2\2\2,\u010d\3\2\2\2.\u0116\3\2\2\2\60\u0122\3\2\2\2\62\u012d\3\2\2\2"+
		"\64\u0135\3\2\2\2\66\u013f\3\2\2\28\u0141\3\2\2\2:\u0144\3\2\2\2<\u014c"+
		"\3\2\2\2>\u0152\3\2\2\2@\u0160\3\2\2\2B\u0172\3\2\2\2D\u0181\3\2\2\2F"+
		"G\7\3\2\2GL\5\4\3\2HK\5*\26\2IK\5,\27\2JH\3\2\2\2JI\3\2\2\2KN\3\2\2\2"+
		"LJ\3\2\2\2LM\3\2\2\2M\3\3\2\2\2NL\3\2\2\2OS\7\6\2\2PR\5D#\2QP\3\2\2\2"+
		"RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2US\3\2\2\2VW\7\7\2\2W\5\3\2\2"+
		"\2XY\5&\24\2YZ\7%\2\2Z[\7\37\2\2[\7\3\2\2\2\\]\7\6\2\2]b\7&\2\2^_\7\33"+
		"\2\2_a\7&\2\2`^\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2"+
		"\2\2ef\7\7\2\2f\t\3\2\2\2gi\7\n\2\2hg\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\7"+
		"%\2\2kl\7\31\2\2lm\7&\2\2mn\7\37\2\2n\13\3\2\2\2oq\7\t\2\2po\3\2\2\2p"+
		"q\3\2\2\2qr\3\2\2\2rs\7%\2\2st\7\31\2\2tu\5\b\5\2uv\7\37\2\2v\r\3\2\2"+
		"\2wy\7\b\2\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\7%\2\2{|\7\31\2\2|}\7\6\2"+
		"\2}\u0082\5\b\5\2~\177\7\33\2\2\177\u0081\5\b\5\2\u0080~\3\2\2\2\u0081"+
		"\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2"+
		"\2\2\u0084\u0082\3\2\2\2\u0085\u0086\7\7\2\2\u0086\u0087\7\37\2\2\u0087"+
		"\17\3\2\2\2\u0088\u008a\5&\24\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2"+
		"\2\u008a\u008b\3\2\2\2\u008b\u008c\7%\2\2\u008c\u008d\7\31\2\2\u008d\u008e"+
		"\5B\"\2\u008e\u008f\7\37\2\2\u008f\21\3\2\2\2\u0090\u0091\7%\2\2\u0091"+
		"\u0092\7\32\2\2\u0092\u0093\7\21\2\2\u0093\u0094\7\4\2\2\u0094\u0095\7"+
		"\5\2\2\u0095\u0096\7\37\2\2\u0096\23\3\2\2\2\u0097\u0098\7%\2\2\u0098"+
		"\u0099\7\32\2\2\u0099\u009a\7\26\2\2\u009a\u009b\7\4\2\2\u009b\u009e\t"+
		"\2\2\2\u009c\u009d\7\33\2\2\u009d\u009f\t\2\2\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\7\5\2\2\u00a1\u00a3\7\37"+
		"\2\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\25\3\2\2\2\u00a4\u00a5"+
		"\7%\2\2\u00a5\u00a6\7\32\2\2\u00a6\u00a7\7\25\2\2\u00a7\u00a8\7\4\2\2"+
		"\u00a8\u00ab\t\2\2\2\u00a9\u00aa\7\33\2\2\u00aa\u00ac\t\2\2\2\u00ab\u00a9"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b2\7\33\2\2"+
		"\u00ae\u00b3\5@!\2\u00af\u00b3\7%\2\2\u00b0\u00b3\7&\2\2\u00b1\u00b3\5"+
		"\24\13\2\u00b2\u00ae\3\2\2\2\u00b2\u00af\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2"+
		"\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\7\5\2\2\u00b5\u00b6\7\37"+
		"\2\2\u00b6\27\3\2\2\2\u00b7\u00b8\7%\2\2\u00b8\u00b9\7\32\2\2\u00b9\u00ba"+
		"\7\22\2\2\u00ba\u00bb\7\4\2\2\u00bb\u00bd\7\5\2\2\u00bc\u00be\7\37\2\2"+
		"\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\31\3\2\2\2\u00bf\u00c0"+
		"\7%\2\2\u00c0\u00c1\7\32\2\2\u00c1\u00c2\7\23\2\2\u00c2\u00c3\7\4\2\2"+
		"\u00c3\u00c5\7\5\2\2\u00c4\u00c6\7\37\2\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6"+
		"\3\2\2\2\u00c6\33\3\2\2\2\u00c7\u00c8\7%\2\2\u00c8\u00c9\7\32\2\2\u00c9"+
		"\u00ca\7\24\2\2\u00ca\u00cb\7\4\2\2\u00cb\u00cd\7\5\2\2\u00cc\u00ce\7"+
		"\37\2\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\35\3\2\2\2\u00cf"+
		"\u00d0\7%\2\2\u00d0\u00d1\7\32\2\2\u00d1\u00d2\7\27\2\2\u00d2\u00d3\7"+
		"\4\2\2\u00d3\u00d4\7&\2\2\u00d4\u00d5\7\5\2\2\u00d5\u00d6\7\37\2\2\u00d6"+
		"\37\3\2\2\2\u00d7\u00d8\7%\2\2\u00d8\u00d9\7\32\2\2\u00d9\u00da\7\30\2"+
		"\2\u00da\u00db\7\4\2\2\u00db\u00dc\7&\2\2\u00dc\u00dd\7\5\2\2\u00dd\u00de"+
		"\7\37\2\2\u00de!\3\2\2\2\u00df\u00e0\7\4\2\2\u00e0\u00e5\7%\2\2\u00e1"+
		"\u00e2\7\33\2\2\u00e2\u00e4\7%\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e7\3\2"+
		"\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e8\u00e9\7\5\2\2\u00e9#\3\2\2\2\u00ea\u00ee\7%\2\2\u00eb"+
		"\u00ef\5\"\22\2\u00ec\u00ed\7\4\2\2\u00ed\u00ef\7\5\2\2\u00ee\u00eb\3"+
		"\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00f2\7\37\2\2\u00f1"+
		"\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2%\3\2\2\2\u00f3\u00f4\t\3\2\2"+
		"\u00f4\'\3\2\2\2\u00f5\u00f6\7\4\2\2\u00f6\u00f7\5&\24\2\u00f7\u00fe\7"+
		"%\2\2\u00f8\u00f9\7\33\2\2\u00f9\u00fa\5&\24\2\u00fa\u00fb\7%\2\2\u00fb"+
		"\u00fd\3\2\2\2\u00fc\u00f8\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2"+
		"\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101"+
		"\u0102\7\5\2\2\u0102)\3\2\2\2\u0103\u0104\7\20\2\2\u0104\u0105\5&\24\2"+
		"\u0105\u0109\7%\2\2\u0106\u010a\5(\25\2\u0107\u0108\7\4\2\2\u0108\u010a"+
		"\7\5\2\2\u0109\u0106\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u010c\5.\30\2\u010c+\3\2\2\2\u010d\u010e\7\20\2\2\u010e\u0112\7%\2\2"+
		"\u010f\u0113\5(\25\2\u0110\u0111\7\4\2\2\u0111\u0113\7\5\2\2\u0112\u010f"+
		"\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\5\60\31\2"+
		"\u0115-\3\2\2\2\u0116\u011a\7\6\2\2\u0117\u0119\5D#\2\u0118\u0117\3\2"+
		"\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		"\u011d\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011e\7\17\2\2\u011e\u011f\7"+
		"%\2\2\u011f\u0120\7\37\2\2\u0120\u0121\7\7\2\2\u0121/\3\2\2\2\u0122\u0126"+
		"\7\6\2\2\u0123\u0125\5D#\2\u0124\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0126\3\2"+
		"\2\2\u0129\u012a\7\17\2\2\u012a\u012b\7\37\2\2\u012b\u012c\7\7\2\2\u012c"+
		"\61\3\2\2\2\u012d\u012e\t\4\2\2\u012e\63\3\2\2\2\u012f\u0136\7&\2\2\u0130"+
		"\u0136\7%\2\2\u0131\u0136\5\24\13\2\u0132\u0136\5\30\r\2\u0133\u0136\5"+
		"\32\16\2\u0134\u0136\5\34\17\2\u0135\u012f\3\2\2\2\u0135\u0130\3\2\2\2"+
		"\u0135\u0131\3\2\2\2\u0135\u0132\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0134"+
		"\3\2\2\2\u0136\65\3\2\2\2\u0137\u0138\5\64\33\2\u0138\u0139\5\62\32\2"+
		"\u0139\u013a\5\64\33\2\u013a\u0140\3\2\2\2\u013b\u013c\5\64\33\2\u013c"+
		"\u013d\t\5\2\2\u013d\u013e\5\64\33\2\u013e\u0140\3\2\2\2\u013f\u0137\3"+
		"\2\2\2\u013f\u013b\3\2\2\2\u0140\67\3\2\2\2\u0141\u0142\7\f\2\2\u0142"+
		"\u0143\5\4\3\2\u01439\3\2\2\2\u0144\u0145\7\13\2\2\u0145\u0146\7\4\2\2"+
		"\u0146\u0147\5\66\34\2\u0147\u0148\7\5\2\2\u0148\u014a\5\4\3\2\u0149\u014b"+
		"\58\35\2\u014a\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014b;\3\2\2\2\u014c"+
		"\u014d\7\16\2\2\u014d\u014e\7\4\2\2\u014e\u014f\5\66\34\2\u014f\u0150"+
		"\7\5\2\2\u0150\u0151\5\4\3\2\u0151=\3\2\2\2\u0152\u0153\7\r\2\2\u0153"+
		"\u0154\7\4\2\2\u0154\u0155\5\n\6\2\u0155\u0156\5\66\34\2\u0156\u0157\7"+
		"\37\2\2\u0157\u0158\7%\2\2\u0158\u0159\7\31\2\2\u0159\u015a\5@!\2\u015a"+
		"\u015b\7\5\2\2\u015b\u015c\5\4\3\2\u015c?\3\2\2\2\u015d\u0161\7%\2\2\u015e"+
		"\u0161\7&\2\2\u015f\u0161\5\24\13\2\u0160\u015d\3\2\2\2\u0160\u015e\3"+
		"\2\2\2\u0160\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0166\t\5\2\2\u0163"+
		"\u0167\7%\2\2\u0164\u0167\7&\2\2\u0165\u0167\5\24\13\2\u0166\u0163\3\2"+
		"\2\2\u0166\u0164\3\2\2\2\u0166\u0165\3\2\2\2\u0167A\3\2\2\2\u0168\u0169"+
		"\7%\2\2\u0169\u016a\7\34\2\2\u016a\u0173\t\2\2\2\u016b\u016c\7%\2\2\u016c"+
		"\u016d\7\35\2\2\u016d\u0173\t\2\2\2\u016e\u016f\7%\2\2\u016f\u0170\7\36"+
		"\2\2\u0170\u0173\t\2\2\2\u0171\u0173\5$\23\2\u0172\u0168\3\2\2\2\u0172"+
		"\u016b\3\2\2\2\u0172\u016e\3\2\2\2\u0172\u0171\3\2\2\2\u0173C\3\2\2\2"+
		"\u0174\u0182\5\6\4\2\u0175\u0182\5\f\7\2\u0176\u0182\5\16\b\2\u0177\u0182"+
		"\5\n\6\2\u0178\u0182\5\20\t\2\u0179\u0182\5\22\n\2\u017a\u0182\5\36\20"+
		"\2\u017b\u0182\5 \21\2\u017c\u0182\5:\36\2\u017d\u0182\5<\37\2\u017e\u0182"+
		"\5> \2\u017f\u0182\5$\23\2\u0180\u0182\5\26\f\2\u0181\u0174\3\2\2\2\u0181"+
		"\u0175\3\2\2\2\u0181\u0176\3\2\2\2\u0181\u0177\3\2\2\2\u0181\u0178\3\2"+
		"\2\2\u0181\u0179\3\2\2\2\u0181\u017a\3\2\2\2\u0181\u017b\3\2\2\2\u0181"+
		"\u017c\3\2\2\2\u0181\u017d\3\2\2\2\u0181\u017e\3\2\2\2\u0181\u017f\3\2"+
		"\2\2\u0181\u0180\3\2\2\2\u0182E\3\2\2\2!JLSbhpx\u0082\u0089\u009e\u00a2"+
		"\u00ab\u00b2\u00bd\u00c5\u00cd\u00e5\u00ee\u00f1\u00fe\u0109\u0112\u011a"+
		"\u0126\u0135\u013f\u014a\u0160\u0166\u0172\u0181";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
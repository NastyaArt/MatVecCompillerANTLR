package gen;// Generated from D:/Nastya/Java/MatVecCompiler/src\Grammar.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(GrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(GrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(GrammarParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(GrammarParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(GrammarParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(GrammarParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#intAssignment}.
	 * @param ctx the parse tree
	 */
	void enterIntAssignment(GrammarParser.IntAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#intAssignment}.
	 * @param ctx the parse tree
	 */
	void exitIntAssignment(GrammarParser.IntAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#vectorAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVectorAssignment(GrammarParser.VectorAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#vectorAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVectorAssignment(GrammarParser.VectorAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#matrixAssignment}.
	 * @param ctx the parse tree
	 */
	void enterMatrixAssignment(GrammarParser.MatrixAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#matrixAssignment}.
	 * @param ctx the parse tree
	 */
	void exitMatrixAssignment(GrammarParser.MatrixAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(GrammarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(GrammarParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#printFunc}.
	 * @param ctx the parse tree
	 */
	void enterPrintFunc(GrammarParser.PrintFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#printFunc}.
	 * @param ctx the parse tree
	 */
	void exitPrintFunc(GrammarParser.PrintFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#getFunc}.
	 * @param ctx the parse tree
	 */
	void enterGetFunc(GrammarParser.GetFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#getFunc}.
	 * @param ctx the parse tree
	 */
	void exitGetFunc(GrammarParser.GetFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#setFunc}.
	 * @param ctx the parse tree
	 */
	void enterSetFunc(GrammarParser.SetFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#setFunc}.
	 * @param ctx the parse tree
	 */
	void exitSetFunc(GrammarParser.SetFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#lengthFunc}.
	 * @param ctx the parse tree
	 */
	void enterLengthFunc(GrammarParser.LengthFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#lengthFunc}.
	 * @param ctx the parse tree
	 */
	void exitLengthFunc(GrammarParser.LengthFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ncolFunc}.
	 * @param ctx the parse tree
	 */
	void enterNcolFunc(GrammarParser.NcolFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ncolFunc}.
	 * @param ctx the parse tree
	 */
	void exitNcolFunc(GrammarParser.NcolFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#nrowFunc}.
	 * @param ctx the parse tree
	 */
	void enterNrowFunc(GrammarParser.NrowFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#nrowFunc}.
	 * @param ctx the parse tree
	 */
	void exitNrowFunc(GrammarParser.NrowFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#addFunc}.
	 * @param ctx the parse tree
	 */
	void enterAddFunc(GrammarParser.AddFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#addFunc}.
	 * @param ctx the parse tree
	 */
	void exitAddFunc(GrammarParser.AddFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#removeFunc}.
	 * @param ctx the parse tree
	 */
	void enterRemoveFunc(GrammarParser.RemoveFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#removeFunc}.
	 * @param ctx the parse tree
	 */
	void exitRemoveFunc(GrammarParser.RemoveFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#inputSignature}.
	 * @param ctx the parse tree
	 */
	void enterInputSignature(GrammarParser.InputSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#inputSignature}.
	 * @param ctx the parse tree
	 */
	void exitInputSignature(GrammarParser.InputSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(GrammarParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(GrammarParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#signatureFunction}.
	 * @param ctx the parse tree
	 */
	void enterSignatureFunction(GrammarParser.SignatureFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#signatureFunction}.
	 * @param ctx the parse tree
	 */
	void exitSignatureFunction(GrammarParser.SignatureFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionReturn}.
	 * @param ctx the parse tree
	 */
	void enterFunctionReturn(GrammarParser.FunctionReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionReturn}.
	 * @param ctx the parse tree
	 */
	void exitFunctionReturn(GrammarParser.FunctionReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionNonReturn}.
	 * @param ctx the parse tree
	 */
	void enterFunctionNonReturn(GrammarParser.FunctionNonReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionNonReturn}.
	 * @param ctx the parse tree
	 */
	void exitFunctionNonReturn(GrammarParser.FunctionNonReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#blockReturn}.
	 * @param ctx the parse tree
	 */
	void enterBlockReturn(GrammarParser.BlockReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#blockReturn}.
	 * @param ctx the parse tree
	 */
	void exitBlockReturn(GrammarParser.BlockReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#blockNonReturn}.
	 * @param ctx the parse tree
	 */
	void enterBlockNonReturn(GrammarParser.BlockNonReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#blockNonReturn}.
	 * @param ctx the parse tree
	 */
	void exitBlockNonReturn(GrammarParser.BlockNonReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpr(GrammarParser.CompareExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpr(GrammarParser.CompareExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#compareOp}.
	 * @param ctx the parse tree
	 */
	void enterCompareOp(GrammarParser.CompareOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#compareOp}.
	 * @param ctx the parse tree
	 */
	void exitCompareOp(GrammarParser.CompareOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(GrammarParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(GrammarParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(GrammarParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(GrammarParser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(GrammarParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(GrammarParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void enterWhileBlock(GrammarParser.WhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void exitWhileBlock(GrammarParser.WhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void enterForBlock(GrammarParser.ForBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void exitForBlock(GrammarParser.ForBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#intOperation}.
	 * @param ctx the parse tree
	 */
	void enterIntOperation(GrammarParser.IntOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#intOperation}.
	 * @param ctx the parse tree
	 */
	void exitIntOperation(GrammarParser.IntOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(GrammarParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(GrammarParser.ContentContext ctx);
}
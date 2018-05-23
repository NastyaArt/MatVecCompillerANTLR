// Generated from D:/Nastya/Java/MatVecCompiler/src\Grammar.g4 by ANTLR 4.7
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(GrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(GrammarParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(GrammarParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#vectorAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVectorAssignment(GrammarParser.VectorAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#matrixAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrixAssignment(GrammarParser.MatrixAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(GrammarParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#showFunct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowFunct(GrammarParser.ShowFunctContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#getFunct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetFunct(GrammarParser.GetFunctContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#lengthFunct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLengthFunct(GrammarParser.LengthFunctContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#addFunct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddFunct(GrammarParser.AddFunctContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#removeFunct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemoveFunct(GrammarParser.RemoveFunctContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#inputSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputSignature(GrammarParser.InputSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(GrammarParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(GrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#signatureFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignatureFunction(GrammarParser.SignatureFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#functionReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionReturn(GrammarParser.FunctionReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#functionNonReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionNonReturn(GrammarParser.FunctionNonReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#blockReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockReturn(GrammarParser.BlockReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#blockNonReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockNonReturn(GrammarParser.BlockNonReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#compareExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpr(GrammarParser.CompareExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#compareOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareOp(GrammarParser.CompareOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(GrammarParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlock(GrammarParser.ElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(GrammarParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#whileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileBlock(GrammarParser.WhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#forBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForBlock(GrammarParser.ForBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(GrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(GrammarParser.ContentContext ctx);
}
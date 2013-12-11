// Generated from C:\Users\LorddMichael\git\CC\New folder\New folder\CodeCraft-Interpreter\COMPILE-CodeCraft-Interpreter\src\gen\CodeCraftGrammar.g4 by ANTLR 4.1

package gen;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CodeCraftGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CodeCraftGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(@NotNull CodeCraftGrammarParser.AssignContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(@NotNull CodeCraftGrammarParser.ForContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#idExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(@NotNull CodeCraftGrammarParser.IdExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(@NotNull CodeCraftGrammarParser.ReturnStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#floatExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatExpr(@NotNull CodeCraftGrammarParser.FloatExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#bangExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBangExpr(@NotNull CodeCraftGrammarParser.BangExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(@NotNull CodeCraftGrammarParser.VariableDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#funcCallID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallID(@NotNull CodeCraftGrammarParser.FuncCallIDContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(@NotNull CodeCraftGrammarParser.ParameterListContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#returnDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnDataType(@NotNull CodeCraftGrammarParser.ReturnDataTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#equalityExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(@NotNull CodeCraftGrammarParser.EqualityExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#choke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoke(@NotNull CodeCraftGrammarParser.ChokeContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#funcCallExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallExpr(@NotNull CodeCraftGrammarParser.FuncCallExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#ifonly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfonly(@NotNull CodeCraftGrammarParser.IfonlyContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(@NotNull CodeCraftGrammarParser.ConditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#mainFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainFunction(@NotNull CodeCraftGrammarParser.MainFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#funcCallPrint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallPrint(@NotNull CodeCraftGrammarParser.FuncCallPrintContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#multdivmodExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultdivmodExpr(@NotNull CodeCraftGrammarParser.MultdivmodExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(@NotNull CodeCraftGrammarParser.OrExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#addminusExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddminusExpr(@NotNull CodeCraftGrammarParser.AddminusExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#funcCallPrintln}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallPrintln(@NotNull CodeCraftGrammarParser.FuncCallPrintlnContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull CodeCraftGrammarParser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#ifelse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelse(@NotNull CodeCraftGrammarParser.IfelseContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#parensExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensExpr(@NotNull CodeCraftGrammarParser.ParensExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(@NotNull CodeCraftGrammarParser.FuncCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(@NotNull CodeCraftGrammarParser.AndExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#stringExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpr(@NotNull CodeCraftGrammarParser.StringExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(@NotNull CodeCraftGrammarParser.ForStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(@NotNull CodeCraftGrammarParser.DoWhileStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull CodeCraftGrammarParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#nullExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullExpr(@NotNull CodeCraftGrammarParser.NullExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(@NotNull CodeCraftGrammarParser.BlockStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(@NotNull CodeCraftGrammarParser.BoolExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(@NotNull CodeCraftGrammarParser.WhileContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(@NotNull CodeCraftGrammarParser.ParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(@NotNull CodeCraftGrammarParser.IfContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#dowhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDowhile(@NotNull CodeCraftGrammarParser.DowhileContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#actualParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualParameters(@NotNull CodeCraftGrammarParser.ActualParametersContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#charExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharExpr(@NotNull CodeCraftGrammarParser.CharExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#returnDarkness}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnDarkness(@NotNull CodeCraftGrammarParser.ReturnDarknessContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(@NotNull CodeCraftGrammarParser.ReturnContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#varDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDec(@NotNull CodeCraftGrammarParser.VarDecContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(@NotNull CodeCraftGrammarParser.AssignmentStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#constantStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantStatement(@NotNull CodeCraftGrammarParser.ConstantStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#intExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExpr(@NotNull CodeCraftGrammarParser.IntExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(@NotNull CodeCraftGrammarParser.DataTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(@NotNull CodeCraftGrammarParser.WhileStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#relationalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(@NotNull CodeCraftGrammarParser.RelationalExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(@NotNull CodeCraftGrammarParser.FunctionDeclarationContext ctx);
}
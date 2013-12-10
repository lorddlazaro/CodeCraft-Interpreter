// Generated from C:\Users\LorddMichael\git\CC\New folder\New folder\CodeCraft-Interpreter\COMPILE-CodeCraft-Interpreter\src\gen\CodeCraftGrammar.g4 by ANTLR 4.1

package gen;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CodeCraftGrammarParser}.
 */
public interface CodeCraftGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull CodeCraftGrammarParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull CodeCraftGrammarParser.AssignContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(@NotNull CodeCraftGrammarParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(@NotNull CodeCraftGrammarParser.ForContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#idExpr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(@NotNull CodeCraftGrammarParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#idExpr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(@NotNull CodeCraftGrammarParser.IdExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(@NotNull CodeCraftGrammarParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(@NotNull CodeCraftGrammarParser.ReturnStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#floatExpr}.
	 * @param ctx the parse tree
	 */
	void enterFloatExpr(@NotNull CodeCraftGrammarParser.FloatExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#floatExpr}.
	 * @param ctx the parse tree
	 */
	void exitFloatExpr(@NotNull CodeCraftGrammarParser.FloatExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#bangExpr}.
	 * @param ctx the parse tree
	 */
	void enterBangExpr(@NotNull CodeCraftGrammarParser.BangExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#bangExpr}.
	 * @param ctx the parse tree
	 */
	void exitBangExpr(@NotNull CodeCraftGrammarParser.BangExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(@NotNull CodeCraftGrammarParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(@NotNull CodeCraftGrammarParser.VariableDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#funcCallID}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallID(@NotNull CodeCraftGrammarParser.FuncCallIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#funcCallID}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallID(@NotNull CodeCraftGrammarParser.FuncCallIDContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(@NotNull CodeCraftGrammarParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(@NotNull CodeCraftGrammarParser.ParameterListContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#returnDataType}.
	 * @param ctx the parse tree
	 */
	void enterReturnDataType(@NotNull CodeCraftGrammarParser.ReturnDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#returnDataType}.
	 * @param ctx the parse tree
	 */
	void exitReturnDataType(@NotNull CodeCraftGrammarParser.ReturnDataTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#equalityExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(@NotNull CodeCraftGrammarParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#equalityExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(@NotNull CodeCraftGrammarParser.EqualityExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#choke}.
	 * @param ctx the parse tree
	 */
	void enterChoke(@NotNull CodeCraftGrammarParser.ChokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#choke}.
	 * @param ctx the parse tree
	 */
	void exitChoke(@NotNull CodeCraftGrammarParser.ChokeContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#funcCallExpr}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallExpr(@NotNull CodeCraftGrammarParser.FuncCallExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#funcCallExpr}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallExpr(@NotNull CodeCraftGrammarParser.FuncCallExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#ifonly}.
	 * @param ctx the parse tree
	 */
	void enterIfonly(@NotNull CodeCraftGrammarParser.IfonlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#ifonly}.
	 * @param ctx the parse tree
	 */
	void exitIfonly(@NotNull CodeCraftGrammarParser.IfonlyContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull CodeCraftGrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull CodeCraftGrammarParser.ConditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void enterMainFunction(@NotNull CodeCraftGrammarParser.MainFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void exitMainFunction(@NotNull CodeCraftGrammarParser.MainFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#funcCallPrint}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallPrint(@NotNull CodeCraftGrammarParser.FuncCallPrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#funcCallPrint}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallPrint(@NotNull CodeCraftGrammarParser.FuncCallPrintContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#multdivmodExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultdivmodExpr(@NotNull CodeCraftGrammarParser.MultdivmodExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#multdivmodExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultdivmodExpr(@NotNull CodeCraftGrammarParser.MultdivmodExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(@NotNull CodeCraftGrammarParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(@NotNull CodeCraftGrammarParser.OrExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#addminusExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddminusExpr(@NotNull CodeCraftGrammarParser.AddminusExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#addminusExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddminusExpr(@NotNull CodeCraftGrammarParser.AddminusExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#funcCallPrintln}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallPrintln(@NotNull CodeCraftGrammarParser.FuncCallPrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#funcCallPrintln}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallPrintln(@NotNull CodeCraftGrammarParser.FuncCallPrintlnContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull CodeCraftGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull CodeCraftGrammarParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#ifelse}.
	 * @param ctx the parse tree
	 */
	void enterIfelse(@NotNull CodeCraftGrammarParser.IfelseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#ifelse}.
	 * @param ctx the parse tree
	 */
	void exitIfelse(@NotNull CodeCraftGrammarParser.IfelseContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#parensExpr}.
	 * @param ctx the parse tree
	 */
	void enterParensExpr(@NotNull CodeCraftGrammarParser.ParensExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#parensExpr}.
	 * @param ctx the parse tree
	 */
	void exitParensExpr(@NotNull CodeCraftGrammarParser.ParensExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(@NotNull CodeCraftGrammarParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(@NotNull CodeCraftGrammarParser.FuncCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(@NotNull CodeCraftGrammarParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(@NotNull CodeCraftGrammarParser.AndExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void enterStringExpr(@NotNull CodeCraftGrammarParser.StringExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void exitStringExpr(@NotNull CodeCraftGrammarParser.StringExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(@NotNull CodeCraftGrammarParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(@NotNull CodeCraftGrammarParser.ForStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(@NotNull CodeCraftGrammarParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(@NotNull CodeCraftGrammarParser.DoWhileStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull CodeCraftGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull CodeCraftGrammarParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#nullExpr}.
	 * @param ctx the parse tree
	 */
	void enterNullExpr(@NotNull CodeCraftGrammarParser.NullExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#nullExpr}.
	 * @param ctx the parse tree
	 */
	void exitNullExpr(@NotNull CodeCraftGrammarParser.NullExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(@NotNull CodeCraftGrammarParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(@NotNull CodeCraftGrammarParser.BlockStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(@NotNull CodeCraftGrammarParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(@NotNull CodeCraftGrammarParser.BoolExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(@NotNull CodeCraftGrammarParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(@NotNull CodeCraftGrammarParser.WhileContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(@NotNull CodeCraftGrammarParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(@NotNull CodeCraftGrammarParser.ParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(@NotNull CodeCraftGrammarParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(@NotNull CodeCraftGrammarParser.IfContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#dowhile}.
	 * @param ctx the parse tree
	 */
	void enterDowhile(@NotNull CodeCraftGrammarParser.DowhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#dowhile}.
	 * @param ctx the parse tree
	 */
	void exitDowhile(@NotNull CodeCraftGrammarParser.DowhileContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#actualParameters}.
	 * @param ctx the parse tree
	 */
	void enterActualParameters(@NotNull CodeCraftGrammarParser.ActualParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#actualParameters}.
	 * @param ctx the parse tree
	 */
	void exitActualParameters(@NotNull CodeCraftGrammarParser.ActualParametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#charExpr}.
	 * @param ctx the parse tree
	 */
	void enterCharExpr(@NotNull CodeCraftGrammarParser.CharExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#charExpr}.
	 * @param ctx the parse tree
	 */
	void exitCharExpr(@NotNull CodeCraftGrammarParser.CharExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#returnDarkness}.
	 * @param ctx the parse tree
	 */
	void enterReturnDarkness(@NotNull CodeCraftGrammarParser.ReturnDarknessContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#returnDarkness}.
	 * @param ctx the parse tree
	 */
	void exitReturnDarkness(@NotNull CodeCraftGrammarParser.ReturnDarknessContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(@NotNull CodeCraftGrammarParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(@NotNull CodeCraftGrammarParser.ReturnContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#varDec}.
	 * @param ctx the parse tree
	 */
	void enterVarDec(@NotNull CodeCraftGrammarParser.VarDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#varDec}.
	 * @param ctx the parse tree
	 */
	void exitVarDec(@NotNull CodeCraftGrammarParser.VarDecContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(@NotNull CodeCraftGrammarParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(@NotNull CodeCraftGrammarParser.AssignmentStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#constantStatement}.
	 * @param ctx the parse tree
	 */
	void enterConstantStatement(@NotNull CodeCraftGrammarParser.ConstantStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#constantStatement}.
	 * @param ctx the parse tree
	 */
	void exitConstantStatement(@NotNull CodeCraftGrammarParser.ConstantStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#intExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntExpr(@NotNull CodeCraftGrammarParser.IntExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#intExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntExpr(@NotNull CodeCraftGrammarParser.IntExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(@NotNull CodeCraftGrammarParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(@NotNull CodeCraftGrammarParser.DataTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(@NotNull CodeCraftGrammarParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(@NotNull CodeCraftGrammarParser.WhileStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(@NotNull CodeCraftGrammarParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(@NotNull CodeCraftGrammarParser.RelationalExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(@NotNull CodeCraftGrammarParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(@NotNull CodeCraftGrammarParser.FunctionDeclarationContext ctx);
}
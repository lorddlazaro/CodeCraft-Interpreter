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
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#boolTerm}.
	 * @param ctx the parse tree
	 */
	void enterBoolTerm(@NotNull CodeCraftGrammarParser.BoolTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#boolTerm}.
	 * @param ctx the parse tree
	 */
	void exitBoolTerm(@NotNull CodeCraftGrammarParser.BoolTermContext ctx);

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
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#boolFactor}.
	 * @param ctx the parse tree
	 */
	void enterBoolFactor(@NotNull CodeCraftGrammarParser.BoolFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#boolFactor}.
	 * @param ctx the parse tree
	 */
	void exitBoolFactor(@NotNull CodeCraftGrammarParser.BoolFactorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#opLess}.
	 * @param ctx the parse tree
	 */
	void enterOpLess(@NotNull CodeCraftGrammarParser.OpLessContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#opLess}.
	 * @param ctx the parse tree
	 */
	void exitOpLess(@NotNull CodeCraftGrammarParser.OpLessContext ctx);

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
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#bang}.
	 * @param ctx the parse tree
	 */
	void enterBang(@NotNull CodeCraftGrammarParser.BangContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#bang}.
	 * @param ctx the parse tree
	 */
	void exitBang(@NotNull CodeCraftGrammarParser.BangContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#numVar}.
	 * @param ctx the parse tree
	 */
	void enterNumVar(@NotNull CodeCraftGrammarParser.NumVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#numVar}.
	 * @param ctx the parse tree
	 */
	void exitNumVar(@NotNull CodeCraftGrammarParser.NumVarContext ctx);

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
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(@NotNull CodeCraftGrammarParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(@NotNull CodeCraftGrammarParser.OrContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#mod}.
	 * @param ctx the parse tree
	 */
	void enterMod(@NotNull CodeCraftGrammarParser.ModContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#mod}.
	 * @param ctx the parse tree
	 */
	void exitMod(@NotNull CodeCraftGrammarParser.ModContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#boolVar}.
	 * @param ctx the parse tree
	 */
	void enterBoolVar(@NotNull CodeCraftGrammarParser.BoolVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#boolVar}.
	 * @param ctx the parse tree
	 */
	void exitBoolVar(@NotNull CodeCraftGrammarParser.BoolVarContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#parens}.
	 * @param ctx the parse tree
	 */
	void enterParens(@NotNull CodeCraftGrammarParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#parens}.
	 * @param ctx the parse tree
	 */
	void exitParens(@NotNull CodeCraftGrammarParser.ParensContext ctx);

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
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(@NotNull CodeCraftGrammarParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(@NotNull CodeCraftGrammarParser.AndContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#opNotequal}.
	 * @param ctx the parse tree
	 */
	void enterOpNotequal(@NotNull CodeCraftGrammarParser.OpNotequalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#opNotequal}.
	 * @param ctx the parse tree
	 */
	void exitOpNotequal(@NotNull CodeCraftGrammarParser.OpNotequalContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#opGreater}.
	 * @param ctx the parse tree
	 */
	void enterOpGreater(@NotNull CodeCraftGrammarParser.OpGreaterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#opGreater}.
	 * @param ctx the parse tree
	 */
	void exitOpGreater(@NotNull CodeCraftGrammarParser.OpGreaterContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#logical}.
	 * @param ctx the parse tree
	 */
	void enterLogical(@NotNull CodeCraftGrammarParser.LogicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#logical}.
	 * @param ctx the parse tree
	 */
	void exitLogical(@NotNull CodeCraftGrammarParser.LogicalContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#factorInt}.
	 * @param ctx the parse tree
	 */
	void enterFactorInt(@NotNull CodeCraftGrammarParser.FactorIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#factorInt}.
	 * @param ctx the parse tree
	 */
	void exitFactorInt(@NotNull CodeCraftGrammarParser.FactorIntContext ctx);

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
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#opLessequal}.
	 * @param ctx the parse tree
	 */
	void enterOpLessequal(@NotNull CodeCraftGrammarParser.OpLessequalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#opLessequal}.
	 * @param ctx the parse tree
	 */
	void exitOpLessequal(@NotNull CodeCraftGrammarParser.OpLessequalContext ctx);

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
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSub(@NotNull CodeCraftGrammarParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSub(@NotNull CodeCraftGrammarParser.SubContext ctx);

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
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(@NotNull CodeCraftGrammarParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(@NotNull CodeCraftGrammarParser.DivContext ctx);

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
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#factorFloat}.
	 * @param ctx the parse tree
	 */
	void enterFactorFloat(@NotNull CodeCraftGrammarParser.FactorFloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#factorFloat}.
	 * @param ctx the parse tree
	 */
	void exitFactorFloat(@NotNull CodeCraftGrammarParser.FactorFloatContext ctx);

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
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(@NotNull CodeCraftGrammarParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(@NotNull CodeCraftGrammarParser.AddContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#opEqual}.
	 * @param ctx the parse tree
	 */
	void enterOpEqual(@NotNull CodeCraftGrammarParser.OpEqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#opEqual}.
	 * @param ctx the parse tree
	 */
	void exitOpEqual(@NotNull CodeCraftGrammarParser.OpEqualContext ctx);

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
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#numExpr}.
	 * @param ctx the parse tree
	 */
	void enterNumExpr(@NotNull CodeCraftGrammarParser.NumExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#numExpr}.
	 * @param ctx the parse tree
	 */
	void exitNumExpr(@NotNull CodeCraftGrammarParser.NumExprContext ctx);

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
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#notequal}.
	 * @param ctx the parse tree
	 */
	void enterNotequal(@NotNull CodeCraftGrammarParser.NotequalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#notequal}.
	 * @param ctx the parse tree
	 */
	void exitNotequal(@NotNull CodeCraftGrammarParser.NotequalContext ctx);

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
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#boolParen}.
	 * @param ctx the parse tree
	 */
	void enterBoolParen(@NotNull CodeCraftGrammarParser.BoolParenContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#boolParen}.
	 * @param ctx the parse tree
	 */
	void exitBoolParen(@NotNull CodeCraftGrammarParser.BoolParenContext ctx);

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
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#equal}.
	 * @param ctx the parse tree
	 */
	void enterEqual(@NotNull CodeCraftGrammarParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#equal}.
	 * @param ctx the parse tree
	 */
	void exitEqual(@NotNull CodeCraftGrammarParser.EqualContext ctx);

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
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull CodeCraftGrammarParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull CodeCraftGrammarParser.FactorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#mul}.
	 * @param ctx the parse tree
	 */
	void enterMul(@NotNull CodeCraftGrammarParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#mul}.
	 * @param ctx the parse tree
	 */
	void exitMul(@NotNull CodeCraftGrammarParser.MulContext ctx);

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
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#funcNumExpr}.
	 * @param ctx the parse tree
	 */
	void enterFuncNumExpr(@NotNull CodeCraftGrammarParser.FuncNumExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#funcNumExpr}.
	 * @param ctx the parse tree
	 */
	void exitFuncNumExpr(@NotNull CodeCraftGrammarParser.FuncNumExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#opGreaterequal}.
	 * @param ctx the parse tree
	 */
	void enterOpGreaterequal(@NotNull CodeCraftGrammarParser.OpGreaterequalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#opGreaterequal}.
	 * @param ctx the parse tree
	 */
	void exitOpGreaterequal(@NotNull CodeCraftGrammarParser.OpGreaterequalContext ctx);

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
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull CodeCraftGrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull CodeCraftGrammarParser.TermContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#relational}.
	 * @param ctx the parse tree
	 */
	void enterRelational(@NotNull CodeCraftGrammarParser.RelationalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#relational}.
	 * @param ctx the parse tree
	 */
	void exitRelational(@NotNull CodeCraftGrammarParser.RelationalContext ctx);

	/**
	 * Enter a parse tree produced by {@link CodeCraftGrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(@NotNull CodeCraftGrammarParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeCraftGrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(@NotNull CodeCraftGrammarParser.BoolContext ctx);

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
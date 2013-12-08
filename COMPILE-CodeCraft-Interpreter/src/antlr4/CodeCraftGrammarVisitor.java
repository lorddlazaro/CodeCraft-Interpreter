// Generated from C:\Users\LorddMichael\eclipse workspace\COMPILE-CodeCraft-Interpreter\src\antlr4\CodeCraftGrammar.g4 by ANTLR 4.1

package antlr4;

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
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(@NotNull CodeCraftGrammarParser.ReturnStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#functionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionList(@NotNull CodeCraftGrammarParser.FunctionListContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#assignExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(@NotNull CodeCraftGrammarParser.AssignExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#funcExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncExpr(@NotNull CodeCraftGrammarParser.FuncExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(@NotNull CodeCraftGrammarParser.VariableDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#boolTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolTerm(@NotNull CodeCraftGrammarParser.BoolTermContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#funcCallID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallID(@NotNull CodeCraftGrammarParser.FuncCallIDContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#boolFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolFactor(@NotNull CodeCraftGrammarParser.BoolFactorContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#opLess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpLess(@NotNull CodeCraftGrammarParser.OpLessContext ctx);

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
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#dataTypeInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeInt(@NotNull CodeCraftGrammarParser.DataTypeIntContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#actualParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualParameterList(@NotNull CodeCraftGrammarParser.ActualParameterListContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#bang}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBang(@NotNull CodeCraftGrammarParser.BangContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#numVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumVar(@NotNull CodeCraftGrammarParser.NumVarContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#choke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoke(@NotNull CodeCraftGrammarParser.ChokeContext ctx);

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
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(@NotNull CodeCraftGrammarParser.OrContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#Factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(@NotNull CodeCraftGrammarParser.FactorContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#mod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod(@NotNull CodeCraftGrammarParser.ModContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#boolVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolVar(@NotNull CodeCraftGrammarParser.BoolVarContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#parens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(@NotNull CodeCraftGrammarParser.ParensContext ctx);

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
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(@NotNull CodeCraftGrammarParser.AndContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#opNotequal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpNotequal(@NotNull CodeCraftGrammarParser.OpNotequalContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#Term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(@NotNull CodeCraftGrammarParser.TermContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#opGreater}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpGreater(@NotNull CodeCraftGrammarParser.OpGreaterContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#logical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical(@NotNull CodeCraftGrammarParser.LogicalContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#factorInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorInt(@NotNull CodeCraftGrammarParser.FactorIntContext ctx);

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
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#opLessequal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpLessequal(@NotNull CodeCraftGrammarParser.OpLessequalContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(@NotNull CodeCraftGrammarParser.FuncCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#dataTypeChar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeChar(@NotNull CodeCraftGrammarParser.DataTypeCharContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#assignFuncCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignFuncCall(@NotNull CodeCraftGrammarParser.AssignFuncCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(@NotNull CodeCraftGrammarParser.SubContext ctx);

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
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(@NotNull CodeCraftGrammarParser.VarContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(@NotNull CodeCraftGrammarParser.DivContext ctx);

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
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#factorFloat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorFloat(@NotNull CodeCraftGrammarParser.FactorFloatContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(@NotNull CodeCraftGrammarParser.BlockStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#dataTypeFloat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeFloat(@NotNull CodeCraftGrammarParser.DataTypeFloatContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(@NotNull CodeCraftGrammarParser.BoolExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(@NotNull CodeCraftGrammarParser.AddContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#opEqual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpEqual(@NotNull CodeCraftGrammarParser.OpEqualContext ctx);

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
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#numExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumExpr(@NotNull CodeCraftGrammarParser.NumExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(@NotNull CodeCraftGrammarParser.IfContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#notequal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotequal(@NotNull CodeCraftGrammarParser.NotequalContext ctx);

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
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#boolParen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolParen(@NotNull CodeCraftGrammarParser.BoolParenContext ctx);

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
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#dataTypeString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeString(@NotNull CodeCraftGrammarParser.DataTypeStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(@NotNull CodeCraftGrammarParser.EqualContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#varDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDec(@NotNull CodeCraftGrammarParser.VarDecContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#mul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(@NotNull CodeCraftGrammarParser.MulContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#constantStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantStatement(@NotNull CodeCraftGrammarParser.ConstantStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#funcNumExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncNumExpr(@NotNull CodeCraftGrammarParser.FuncNumExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#opGreaterequal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpGreaterequal(@NotNull CodeCraftGrammarParser.OpGreaterequalContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#dataTypeBoolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeBoolean(@NotNull CodeCraftGrammarParser.DataTypeBooleanContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(@NotNull CodeCraftGrammarParser.WhileStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#relational}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational(@NotNull CodeCraftGrammarParser.RelationalContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(@NotNull CodeCraftGrammarParser.BoolContext ctx);

	/**
	 * Visit a parse tree produced by {@link CodeCraftGrammarParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(@NotNull CodeCraftGrammarParser.FunctionDeclarationContext ctx);
}
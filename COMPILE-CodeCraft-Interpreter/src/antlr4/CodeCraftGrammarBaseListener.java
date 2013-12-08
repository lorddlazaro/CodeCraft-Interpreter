// Generated from C:\Users\LorddMichael\eclipse workspace\COMPILE-CodeCraft-Interpreter\src\antlr4\CodeCraftGrammar.g4 by ANTLR 4.1

package antlr4;


import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

/**
 * This class provides an empty implementation of {@link CodeCraftGrammarListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class CodeCraftGrammarBaseListener implements CodeCraftGrammarListener {

	public Stack<Integer> stack		= 	new Stack<Integer>();
	public Map<String, Integer> sym	=	new HashMap<String, Integer>();
	
	@Override public void enterAssign(@NotNull CodeCraftGrammarParser.AssignContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitAssign(@NotNull CodeCraftGrammarParser.AssignContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterFor(@NotNull CodeCraftGrammarParser.ForContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitFor(@NotNull CodeCraftGrammarParser.ForContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterReturnStatement(@NotNull CodeCraftGrammarParser.ReturnStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitReturnStatement(@NotNull CodeCraftGrammarParser.ReturnStatementContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterFunctionList(@NotNull CodeCraftGrammarParser.FunctionListContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitFunctionList(@NotNull CodeCraftGrammarParser.FunctionListContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterAssignExpr(@NotNull CodeCraftGrammarParser.AssignExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitAssignExpr(@NotNull CodeCraftGrammarParser.AssignExprContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterFuncExpr(@NotNull CodeCraftGrammarParser.FuncExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitFuncExpr(@NotNull CodeCraftGrammarParser.FuncExprContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterVariableDeclaration(@NotNull CodeCraftGrammarParser.VariableDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitVariableDeclaration(@NotNull CodeCraftGrammarParser.VariableDeclarationContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterBoolTerm(@NotNull CodeCraftGrammarParser.BoolTermContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitBoolTerm(@NotNull CodeCraftGrammarParser.BoolTermContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterFuncCallID(@NotNull CodeCraftGrammarParser.FuncCallIDContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitFuncCallID(@NotNull CodeCraftGrammarParser.FuncCallIDContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterBoolFactor(@NotNull CodeCraftGrammarParser.BoolFactorContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitBoolFactor(@NotNull CodeCraftGrammarParser.BoolFactorContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterOpLess(@NotNull CodeCraftGrammarParser.OpLessContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitOpLess(@NotNull CodeCraftGrammarParser.OpLessContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterParameterList(@NotNull CodeCraftGrammarParser.ParameterListContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitParameterList(@NotNull CodeCraftGrammarParser.ParameterListContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterReturnDataType(@NotNull CodeCraftGrammarParser.ReturnDataTypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitReturnDataType(@NotNull CodeCraftGrammarParser.ReturnDataTypeContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterDataTypeInt(@NotNull CodeCraftGrammarParser.DataTypeIntContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitDataTypeInt(@NotNull CodeCraftGrammarParser.DataTypeIntContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterActualParameterList(@NotNull CodeCraftGrammarParser.ActualParameterListContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitActualParameterList(@NotNull CodeCraftGrammarParser.ActualParameterListContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterBang(@NotNull CodeCraftGrammarParser.BangContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitBang(@NotNull CodeCraftGrammarParser.BangContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterNumVar(@NotNull CodeCraftGrammarParser.NumVarContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitNumVar(@NotNull CodeCraftGrammarParser.NumVarContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterChoke(@NotNull CodeCraftGrammarParser.ChokeContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitChoke(@NotNull CodeCraftGrammarParser.ChokeContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterIfonly(@NotNull CodeCraftGrammarParser.IfonlyContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitIfonly(@NotNull CodeCraftGrammarParser.IfonlyContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterCondition(@NotNull CodeCraftGrammarParser.ConditionContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitCondition(@NotNull CodeCraftGrammarParser.ConditionContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterOr(@NotNull CodeCraftGrammarParser.OrContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitOr(@NotNull CodeCraftGrammarParser.OrContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterFactor(@NotNull CodeCraftGrammarParser.FactorContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitFactor(@NotNull CodeCraftGrammarParser.FactorContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterMod(@NotNull CodeCraftGrammarParser.ModContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitMod(@NotNull CodeCraftGrammarParser.ModContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterBoolVar(@NotNull CodeCraftGrammarParser.BoolVarContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitBoolVar(@NotNull CodeCraftGrammarParser.BoolVarContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterParens(@NotNull CodeCraftGrammarParser.ParensContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitParens(@NotNull CodeCraftGrammarParser.ParensContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterMainFunction(@NotNull CodeCraftGrammarParser.MainFunctionContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitMainFunction(@NotNull CodeCraftGrammarParser.MainFunctionContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterFuncCallPrint(@NotNull CodeCraftGrammarParser.FuncCallPrintContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitFuncCallPrint(@NotNull CodeCraftGrammarParser.FuncCallPrintContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterAnd(@NotNull CodeCraftGrammarParser.AndContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitAnd(@NotNull CodeCraftGrammarParser.AndContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterOpNotequal(@NotNull CodeCraftGrammarParser.OpNotequalContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitOpNotequal(@NotNull CodeCraftGrammarParser.OpNotequalContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterTerm(@NotNull CodeCraftGrammarParser.TermContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitTerm(@NotNull CodeCraftGrammarParser.TermContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterOpGreater(@NotNull CodeCraftGrammarParser.OpGreaterContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitOpGreater(@NotNull CodeCraftGrammarParser.OpGreaterContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterLogical(@NotNull CodeCraftGrammarParser.LogicalContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitLogical(@NotNull CodeCraftGrammarParser.LogicalContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterFactorInt(@NotNull CodeCraftGrammarParser.FactorIntContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitFactorInt(@NotNull CodeCraftGrammarParser.FactorIntContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterFuncCallPrintln(@NotNull CodeCraftGrammarParser.FuncCallPrintlnContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitFuncCallPrintln(@NotNull CodeCraftGrammarParser.FuncCallPrintlnContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterProgram(@NotNull CodeCraftGrammarParser.ProgramContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitProgram(@NotNull CodeCraftGrammarParser.ProgramContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterIfelse(@NotNull CodeCraftGrammarParser.IfelseContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitIfelse(@NotNull CodeCraftGrammarParser.IfelseContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterOpLessequal(@NotNull CodeCraftGrammarParser.OpLessequalContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitOpLessequal(@NotNull CodeCraftGrammarParser.OpLessequalContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterFuncCall(@NotNull CodeCraftGrammarParser.FuncCallContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitFuncCall(@NotNull CodeCraftGrammarParser.FuncCallContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterDataTypeChar(@NotNull CodeCraftGrammarParser.DataTypeCharContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitDataTypeChar(@NotNull CodeCraftGrammarParser.DataTypeCharContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterAssignFuncCall(@NotNull CodeCraftGrammarParser.AssignFuncCallContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitAssignFuncCall(@NotNull CodeCraftGrammarParser.AssignFuncCallContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterSub(@NotNull CodeCraftGrammarParser.SubContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitSub(@NotNull CodeCraftGrammarParser.SubContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterStringExpr(@NotNull CodeCraftGrammarParser.StringExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitStringExpr(@NotNull CodeCraftGrammarParser.StringExprContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterForStatement(@NotNull CodeCraftGrammarParser.ForStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitForStatement(@NotNull CodeCraftGrammarParser.ForStatementContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterDoWhileStatement(@NotNull CodeCraftGrammarParser.DoWhileStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitDoWhileStatement(@NotNull CodeCraftGrammarParser.DoWhileStatementContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterVar(@NotNull CodeCraftGrammarParser.VarContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitVar(@NotNull CodeCraftGrammarParser.VarContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterDiv(@NotNull CodeCraftGrammarParser.DivContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitDiv(@NotNull CodeCraftGrammarParser.DivContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterBlock(@NotNull CodeCraftGrammarParser.BlockContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitBlock(@NotNull CodeCraftGrammarParser.BlockContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterNullExpr(@NotNull CodeCraftGrammarParser.NullExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitNullExpr(@NotNull CodeCraftGrammarParser.NullExprContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterFactorFloat(@NotNull CodeCraftGrammarParser.FactorFloatContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitFactorFloat(@NotNull CodeCraftGrammarParser.FactorFloatContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterBlockStatement(@NotNull CodeCraftGrammarParser.BlockStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitBlockStatement(@NotNull CodeCraftGrammarParser.BlockStatementContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterDataTypeFloat(@NotNull CodeCraftGrammarParser.DataTypeFloatContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitDataTypeFloat(@NotNull CodeCraftGrammarParser.DataTypeFloatContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterBoolExpr(@NotNull CodeCraftGrammarParser.BoolExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitBoolExpr(@NotNull CodeCraftGrammarParser.BoolExprContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterAdd(@NotNull CodeCraftGrammarParser.AddContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitAdd(@NotNull CodeCraftGrammarParser.AddContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterOpEqual(@NotNull CodeCraftGrammarParser.OpEqualContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitOpEqual(@NotNull CodeCraftGrammarParser.OpEqualContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterWhile(@NotNull CodeCraftGrammarParser.WhileContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitWhile(@NotNull CodeCraftGrammarParser.WhileContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterParameter(@NotNull CodeCraftGrammarParser.ParameterContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitParameter(@NotNull CodeCraftGrammarParser.ParameterContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterNumExpr(@NotNull CodeCraftGrammarParser.NumExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitNumExpr(@NotNull CodeCraftGrammarParser.NumExprContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterIf(@NotNull CodeCraftGrammarParser.IfContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitIf(@NotNull CodeCraftGrammarParser.IfContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterNotequal(@NotNull CodeCraftGrammarParser.NotequalContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitNotequal(@NotNull CodeCraftGrammarParser.NotequalContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterDowhile(@NotNull CodeCraftGrammarParser.DowhileContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitDowhile(@NotNull CodeCraftGrammarParser.DowhileContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterActualParameters(@NotNull CodeCraftGrammarParser.ActualParametersContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitActualParameters(@NotNull CodeCraftGrammarParser.ActualParametersContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterCharExpr(@NotNull CodeCraftGrammarParser.CharExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitCharExpr(@NotNull CodeCraftGrammarParser.CharExprContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterBoolParen(@NotNull CodeCraftGrammarParser.BoolParenContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitBoolParen(@NotNull CodeCraftGrammarParser.BoolParenContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterReturnDarkness(@NotNull CodeCraftGrammarParser.ReturnDarknessContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitReturnDarkness(@NotNull CodeCraftGrammarParser.ReturnDarknessContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterReturn(@NotNull CodeCraftGrammarParser.ReturnContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitReturn(@NotNull CodeCraftGrammarParser.ReturnContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterDataTypeString(@NotNull CodeCraftGrammarParser.DataTypeStringContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitDataTypeString(@NotNull CodeCraftGrammarParser.DataTypeStringContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterEqual(@NotNull CodeCraftGrammarParser.EqualContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitEqual(@NotNull CodeCraftGrammarParser.EqualContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterVarDec(@NotNull CodeCraftGrammarParser.VarDecContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitVarDec(@NotNull CodeCraftGrammarParser.VarDecContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterMul(@NotNull CodeCraftGrammarParser.MulContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitMul(@NotNull CodeCraftGrammarParser.MulContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterConstantStatement(@NotNull CodeCraftGrammarParser.ConstantStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitConstantStatement(@NotNull CodeCraftGrammarParser.ConstantStatementContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterFuncNumExpr(@NotNull CodeCraftGrammarParser.FuncNumExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitFuncNumExpr(@NotNull CodeCraftGrammarParser.FuncNumExprContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterOpGreaterequal(@NotNull CodeCraftGrammarParser.OpGreaterequalContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitOpGreaterequal(@NotNull CodeCraftGrammarParser.OpGreaterequalContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterDataTypeBoolean(@NotNull CodeCraftGrammarParser.DataTypeBooleanContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitDataTypeBoolean(@NotNull CodeCraftGrammarParser.DataTypeBooleanContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterWhileStatement(@NotNull CodeCraftGrammarParser.WhileStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitWhileStatement(@NotNull CodeCraftGrammarParser.WhileStatementContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterRelational(@NotNull CodeCraftGrammarParser.RelationalContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitRelational(@NotNull CodeCraftGrammarParser.RelationalContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterBool(@NotNull CodeCraftGrammarParser.BoolContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitBool(@NotNull CodeCraftGrammarParser.BoolContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterFunctionDeclaration(@NotNull CodeCraftGrammarParser.FunctionDeclarationContext ctx) 
	{
		String functionName = ctx.ID().getText();
		this.sym.put(functionName, null);
	}
	
	@Override public void exitFunctionDeclaration(@NotNull CodeCraftGrammarParser.FunctionDeclarationContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterEveryRule(@NotNull ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitEveryRule(@NotNull ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void visitTerminal(@NotNull TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void visitErrorNode(@NotNull ErrorNode node) { }
}
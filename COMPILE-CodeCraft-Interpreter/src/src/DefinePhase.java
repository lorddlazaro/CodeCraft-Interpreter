package src;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import src.Symbol.Type;

import gen.CodeCraftGrammarBaseVisitor;
import gen.CodeCraftGrammarParser;
import gen.CodeCraftGrammarParser.AddminusExprContext;
import gen.CodeCraftGrammarParser.AndExprContext;
import gen.CodeCraftGrammarParser.AssignContext;
import gen.CodeCraftGrammarParser.AssignmentStatementContext;
import gen.CodeCraftGrammarParser.BangExprContext;
import gen.CodeCraftGrammarParser.BlockContext;
import gen.CodeCraftGrammarParser.BlockStatementContext;
import gen.CodeCraftGrammarParser.BoolExprContext;
import gen.CodeCraftGrammarParser.CharExprContext;
import gen.CodeCraftGrammarParser.ConditionContext;
import gen.CodeCraftGrammarParser.ConstantStatementContext;
import gen.CodeCraftGrammarParser.DoWhileStatementContext;
import gen.CodeCraftGrammarParser.DowhileContext;
import gen.CodeCraftGrammarParser.EqualityExprContext;
import gen.CodeCraftGrammarParser.FloatExprContext;
import gen.CodeCraftGrammarParser.ForContext;
import gen.CodeCraftGrammarParser.ForStatementContext;
import gen.CodeCraftGrammarParser.FuncCallContext;
import gen.CodeCraftGrammarParser.FuncCallExprContext;
import gen.CodeCraftGrammarParser.FuncCallIDContext;
import gen.CodeCraftGrammarParser.FuncCallPrintContext;
import gen.CodeCraftGrammarParser.FuncCallPrintlnContext;
import gen.CodeCraftGrammarParser.FunctionDeclarationContext;
import gen.CodeCraftGrammarParser.IdExprContext;
import gen.CodeCraftGrammarParser.IfContext;
import gen.CodeCraftGrammarParser.IfelseContext;
import gen.CodeCraftGrammarParser.IfonlyContext;
import gen.CodeCraftGrammarParser.IntExprContext;
import gen.CodeCraftGrammarParser.MainFunctionContext;
import gen.CodeCraftGrammarParser.MultdivmodExprContext;
import gen.CodeCraftGrammarParser.NullExprContext;
import gen.CodeCraftGrammarParser.OrExprContext;
import gen.CodeCraftGrammarParser.ParameterContext;
import gen.CodeCraftGrammarParser.ParameterListContext;
import gen.CodeCraftGrammarParser.ProgramContext;
import gen.CodeCraftGrammarParser.RelationalExprContext;
import gen.CodeCraftGrammarParser.ReturnContext;
import gen.CodeCraftGrammarParser.ReturnStatementContext;
import gen.CodeCraftGrammarParser.StatementContext;
import gen.CodeCraftGrammarParser.StringExprContext;
import gen.CodeCraftGrammarParser.VarDecContext;
import gen.CodeCraftGrammarParser.VariableDeclarationContext;
import gen.CodeCraftGrammarParser.WhileContext;
import gen.CodeCraftGrammarParser.WhileStatementContext;

public class DefinePhase extends CodeCraftGrammarBaseVisitor<Symbol>{
	ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
    GlobalScope globals;
    Scope currentScope; // define symbols in this scope
    
    void saveScope(ParserRuleContext ctx, Scope s) { scopes.put(ctx, s); }
    
    public Symbol visitProgram(ProgramContext ctx) {
    	globals = new GlobalScope(null);
    	currentScope = globals;
    	//visit
    	for(FunctionDeclarationContext funcDecl: ctx.functionDeclaration()){
    		this.visit(funcDecl);
    	}
    	Main.displayScope(globals);
    	return new Symbol(Type.tNULL,null);
    }
    public Symbol visitFunctionDeclaration(FunctionDeclarationContext ctx) {
    	String name = ctx.ID().getText();
    	int typeTokenType = ctx.returnType().start.getType(); //UNSURE
    	Symbol.Type type = Main.getType(typeTokenType);
    	// push new scope by making new one that points to enclosing scope
    	FunctionSymbol function = new FunctionSymbol(name, type, currentScope,ctx);
    	
    	GlobalScope temp = (GlobalScope) currentScope;
    	if(temp.symbols.containsKey(function.name)){
    		//multiple function declaration in same global scope
    		Main.error(ctx.ID().getSymbol(), "Function already declared: "+name);
    	}//UNSURE should i let it continue saving in symbol table
    	currentScope.define(function); // Define function in current scope
    	saveScope(ctx, function); // Push: set function's parent to current
    	currentScope = function; // Current scope is now function scope
    	if(currentScope.getClass()==FunctionSymbol.class)
    		currentScope = (FunctionSymbol)currentScope;
    	
    	this.visit(ctx.parameterList());
    	
    	Main.displayScope(currentScope);
    	currentScope = currentScope.getEnclosingScope(); // pop scope
    	if(currentScope.getClass()==GlobalScope.class)
    		currentScope = (GlobalScope)currentScope;
    	
    	return new Symbol(Type.tNULL,null);
    }

    @Override
    public Symbol visitParameterList(ParameterListContext ctx) {
    	
    	for(ParameterContext paramCtx: ctx.parameter()){
    		this.visit(paramCtx);
    	}
    	return new Symbol(Type.tNULL,null);
    }
    public Symbol visitParameter(ParameterContext ctx) {
    	FunctionSymbol temp = (FunctionSymbol) currentScope;
    	String name = ctx.ID().getText();
    	if(temp.arguments.containsKey(name)){
    		//multiple function declaration in same global scope
    		Main.error(ctx.ID().getSymbol(), "Parameter already declared: "+name);
    	}
    	defineVar(ctx.dataType(), ctx.ID().getSymbol(),false,temp.arguments.size());
    	
    	return new Symbol(Type.tNULL,null);
    }
    void defineVar(CodeCraftGrammarParser.DataTypeContext typeCtx, Token nameToken, Boolean isConstant,int order) {
        int typeTokenType = typeCtx.start.getType(); //UNSURE
        Symbol.Type type = Main.getType(typeTokenType);
        VariableSymbol var = new VariableSymbol(nameToken.getText(), type, isConstant,order);
        currentScope.define(var); // Define symbol in current scope
    }
}

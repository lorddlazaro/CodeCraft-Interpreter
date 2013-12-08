import javax.swing.JTextArea;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import antlr4.CodeCraftGrammarBaseListener;
import antlr4.CodeCraftGrammarParser;
import antlr4.CodeCraftGrammarParser.AssignContext;
import antlr4.CodeCraftGrammarParser.BlockContext;
import antlr4.CodeCraftGrammarParser.BoolExprContext;
import antlr4.CodeCraftGrammarParser.FuncCallIDContext;
import antlr4.CodeCraftGrammarParser.FunctionDeclarationContext;
import antlr4.CodeCraftGrammarParser.NumExprContext;
import antlr4.CodeCraftGrammarParser.NumVarContext;
import antlr4.CodeCraftGrammarParser.ProgramContext;
import antlr4.CodeCraftGrammarParser.VarDecContext;


public class SecondPass extends CodeCraftGrammarBaseListener{
	ParseTreeProperty<Scope> scopes;
    GlobalScope globals;
    Scope currentScope; // resolve symbols starting in this scope
    JTextArea ta;
    
    public SecondPass(GlobalScope globals, ParseTreeProperty<Scope> scopes,JTextArea ta) {
        this.scopes = scopes;
        this.globals = globals;
        this.ta=ta;
    }
    
    public void enterProgram(@NotNull ProgramContext ctx) {
    	currentScope = globals;
    }
    public void enterFunctionDeclaration(@NotNull FunctionDeclarationContext ctx) {
    	currentScope = scopes.get(ctx);
    }
    public void exitFunctionDeclaration(@NotNull FunctionDeclarationContext ctx) {
    	currentScope = currentScope.getEnclosingScope();
    }
    public void enterBlock(@NotNull BlockContext ctx) {
    	currentScope = scopes.get(ctx);
    }
    public void exitBlock(@NotNull BlockContext ctx) {
    	currentScope = currentScope.getEnclosingScope();
    }
    
    public void exitVar(CodeCraftGrammarParser.VarContext ctx) {
        String name = ctx.ID().getSymbol().getText();
        Symbol var = currentScope.resolve(name);
        if ( var==null ) {
            Main.error(ctx.ID().getSymbol(), "no such variable: "+name);
        }
        if ( var instanceof FunctionSymbol ) {
        	Main.error(ctx.ID().getSymbol(), name+" is not a variable");
        }
    }
    
    public void exitNumVar(@NotNull NumVarContext ctx) {
    	String name = ctx.ID().getSymbol().getText();
        Symbol var = currentScope.resolve(name);
        if ( var==null ) {
            Main.error(ctx.ID().getSymbol(), "no such variable: "+name);
        }
        if ( var instanceof FunctionSymbol ) {
        	Main.error(ctx.ID().getSymbol(), name+" is not a variable");
        }
    }
    
    @Override
    public void exitFuncCallID(@NotNull FuncCallIDContext ctx) {
    	String funcName = ctx.ID().getText();
        Symbol meth = currentScope.resolve(funcName);
        if ( meth==null ) {
            Main.error(ctx.ID().getSymbol(), "no such function: "+funcName);
        }
        if ( meth instanceof VariableSymbol ) {
        	Main.error(ctx.ID().getSymbol(), funcName+" is not a function");
        }
    }
    
    @Override
    public void exitVarDec(@NotNull VarDecContext ctx) {
    	// TODO Auto-generated method stub
    	String name = ctx.variableDeclaration().ID().getSymbol().getText();
        Symbol var = currentScope.resolve(name);
        if ( var==null ) {
            Main.error(ctx.variableDeclaration().ID().getSymbol(), "no such variable: "+name);
        }
        if ( var instanceof FunctionSymbol ) {
        	Main.error(ctx.variableDeclaration().ID().getSymbol(), name+" is not a variable");
        }
        System.out.println(name);
        ta.setText(ta.getText() +"\n"+ name);
        
    }
    
    public void exitAssign(@NotNull AssignContext ctx) {
    	/*
    	String name = ctx.assignmentStatement().getSymbol().getText();
        Symbol var = currentScope.resolve(name);
        if ( var==null ) {
            Main.error(ctx.ID().getSymbol(), "no such variable: "+name);
        }
        if ( var instanceof FunctionSymbol ) {
        	Main.error(ctx.ID().getSymbol(), name+" is not a variable");
        }
        */

        
  
    }
    
    
    public void exitNumExpr(@NotNull NumExprContext ctx) {
    }
    
    public void exitBoolExpr(@NotNull BoolExprContext ctx) {
    }
    
    
}

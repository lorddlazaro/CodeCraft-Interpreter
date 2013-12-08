package src;
import gen.CodeCraftGrammarBaseListener;
import gen.CodeCraftGrammarParser;
import gen.CodeCraftGrammarParser.AssignContext;
import gen.CodeCraftGrammarParser.AssignExprContext;
import gen.CodeCraftGrammarParser.AssignmentStatementContext;
import gen.CodeCraftGrammarParser.BlockContext;
import gen.CodeCraftGrammarParser.BoolExprContext;
import gen.CodeCraftGrammarParser.FuncCallIDContext;
import gen.CodeCraftGrammarParser.FunctionDeclarationContext;
import gen.CodeCraftGrammarParser.IdExprContext;
import gen.CodeCraftGrammarParser.NumExprContext;
import gen.CodeCraftGrammarParser.NumVarContext;
import gen.CodeCraftGrammarParser.ProgramContext;
import gen.CodeCraftGrammarParser.VarDecContext;

import javax.swing.JTextArea;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeProperty;


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
    public void exitIdExpr(IdExprContext ctx) {
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
    
    public void exitAssignmentStatement(AssignmentStatementContext ctx) {
    	String name = ctx.ID().getSymbol().getText();
    	Symbol var = currentScope.resolve(name);
    	
    	ctx.expression();
    }
    
    public void enterIdExpr(IdExprContext ctx) {
    	
    }
}

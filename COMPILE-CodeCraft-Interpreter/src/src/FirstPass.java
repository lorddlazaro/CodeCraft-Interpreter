package src;
import gen.CodeCraftGrammarBaseListener;
import gen.CodeCraftGrammarParser;
import gen.CodeCraftGrammarParser.ConstantStatementContext;
import gen.CodeCraftGrammarParser.FunctionDeclarationContext;
import gen.CodeCraftGrammarParser.MainFunctionContext;
import gen.CodeCraftGrammarParser.ParameterContext;
import gen.CodeCraftGrammarParser.ProgramContext;
import gen.CodeCraftGrammarParser.VariableDeclarationContext;

import javax.swing.JTextArea;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeProperty;


public class FirstPass extends CodeCraftGrammarBaseListener{
	ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
    GlobalScope globals;
    Scope currentScope; // define symbols in this scope
    JTextArea ta;
    void saveScope(ParserRuleContext ctx, Scope s) { scopes.put(ctx, s); }
    
    public FirstPass(JTextArea ta){
    	this.ta =ta;
    }
    public void enterProgram(@NotNull ProgramContext ctx) {
    	globals = new GlobalScope(null);
    	currentScope = globals;
    }
    
    public void exitProgram(@NotNull ProgramContext ctx) {
    	Main.displayScope(globals);
    	ta.setText(ta.getText() +"\n"+ globals);
    }
  
    public void enterFunctionDeclaration(@NotNull FunctionDeclarationContext ctx) {
    	String name = ctx.ID().getText();
    	int typeTokenType = ctx.returnType().start.getType(); //UNSURE
    	Symbol.Type type = Main.getType(typeTokenType);
    	// push new scope by making new one that points to enclosing scope
    	FunctionSymbol function = new FunctionSymbol(name, type, currentScope);
    	
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
    }
    
    public void enterMainFunction(@NotNull MainFunctionContext ctx) {
    	String name = ctx.MINE().getText();
    	int typeTokenType = ctx.DARKNESS().getSymbol().getType(); //UNSURE
    	Symbol.Type type = Main.getType(typeTokenType);
    	// push new scope by making new one that points to enclosing scope
    	FunctionSymbol function = new FunctionSymbol(name, type, currentScope);
    	
    	GlobalScope temp = (GlobalScope) currentScope;
    	if(temp.symbols.containsKey(function.name)){
    		//multiple function declaration in same global scope
    		Main.error(ctx.MINE().getSymbol(), "Main already declared: "+name);
    	}//UNSURE should i let it continue saving in symbol table
    	currentScope.define(function); // Define function in current scope
    	saveScope(ctx, function); // Push: set function's parent to current
    	currentScope = function; // Current scope is now function scope
    	if(currentScope.getClass()==FunctionSymbol.class)
    		currentScope = (FunctionSymbol)currentScope;
    }
    
    public void exitFunctionDeclaration(@NotNull FunctionDeclarationContext ctx) {
    	Main.displayScope(currentScope);
    	currentScope = currentScope.getEnclosingScope(); // pop scope
    	if(currentScope.getClass()==GlobalScope.class)
    		currentScope = (GlobalScope)currentScope;
    }
    
    public void exitMainFunction(@NotNull MainFunctionContext ctx) {
    	Main.displayScope(currentScope);
    	currentScope = currentScope.getEnclosingScope(); // pop scope
    	if(currentScope.getClass()==GlobalScope.class)
    		currentScope = (GlobalScope)currentScope;
    }
    
    public void enterBlock(CodeCraftGrammarParser.BlockContext ctx) {
        // push new local scope
        currentScope = new LocalScope(currentScope);
        currentScope = (LocalScope)currentScope;
        saveScope(ctx, currentScope);
    }

    public void exitBlock(CodeCraftGrammarParser.BlockContext ctx) {
    	Main.displayScope(currentScope);
        currentScope = currentScope.getEnclosingScope(); // pop scope
        if(currentScope.getClass()==FunctionSymbol.class)
        	currentScope = (FunctionSymbol)currentScope;
    }
    
    public void exitParameter(@NotNull ParameterContext ctx) {
    	FunctionSymbol temp = (FunctionSymbol) currentScope;
    	String name = ctx.ID().getText();
    	if(temp.arguments.containsKey(name)){
    		//multiple function declaration in same global scope
    		Main.error(ctx.ID().getSymbol(), "Parameter already declared: "+name);
    	}
    	defineVar(ctx.dataType(), ctx.ID().getSymbol(),false);
    }
    
    public void exitVariableDeclaration(@NotNull VariableDeclarationContext ctx) {
    	LocalScope temp = (LocalScope) currentScope;
    	String name = ctx.ID().getText();
    	if(temp.symbols.containsKey(name)){
    		//multiple function declaration in same global scope
    		Main.error(ctx.ID().getSymbol(), "Variable already declared: "+name);
    	}
    	defineVar(ctx.dataType(), ctx.ID().getSymbol(),false);
    }
    
    public void exitConstantStatement(@NotNull ConstantStatementContext ctx) {
    	GlobalScope temp = (GlobalScope) currentScope;
    	ConstantStatementContext ctx2 = ctx;
    	
    	String name = ctx2.ID().getText();
    	if(temp.symbols.containsKey(name)){
    		//multiple function declaration in same global scope
    		Main.error(ctx2.ID().getSymbol(), "Constant already declared: "+name);
    	}
    	defineVar(ctx2.dataType(), ctx2.ID().getSymbol(),true);
    }
    
    void defineVar(CodeCraftGrammarParser.DataTypeContext typeCtx, Token nameToken, Boolean isConstant) {
        int typeTokenType = typeCtx.start.getType(); //UNSURE
        Symbol.Type type = Main.getType(typeTokenType);
        VariableSymbol var = new VariableSymbol(nameToken.getText(), type, isConstant);
        currentScope.define(var); // Define symbol in current scope
    }
    
    
}

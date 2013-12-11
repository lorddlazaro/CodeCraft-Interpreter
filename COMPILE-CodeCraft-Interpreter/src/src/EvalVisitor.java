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

public class EvalVisitor extends CodeCraftGrammarBaseVisitor<Symbol>{
	ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
    GlobalScope globals;
    Scope currentScope; // define symbols in this scope
    
    void saveScope(ParserRuleContext ctx, Scope s) { scopes.put(ctx, s); }
    
    public Symbol visitProgram(ProgramContext ctx) {
    	System.out.println("visitProgram");
    	globals = new GlobalScope(null);
    	currentScope = globals;
    	//visit
    	for(ConstantStatementContext conStmnt: ctx.constantStatement()){
    		this.visit(conStmnt);
    	}
    	this.visit(ctx.mainFunction());
    	for(FunctionDeclarationContext funcDecl: ctx.functionDeclaration()){
    		this.visit(funcDecl);
    	}
    	Main.displayScope(globals);
    	return new Symbol(Type.tNULL,null);
    }
    
    public Symbol visitConstantStatement(ConstantStatementContext ctx) {
    	
    	GlobalScope temp = (GlobalScope) currentScope;
    	ConstantStatementContext ctx2 = ctx;
    	
    	String name = ctx2.ID().getText();
    	if(temp.symbols.containsKey(name)){
    		//multiple function declaration in same global scope
    		Main.error(ctx2.ID().getSymbol(), "Constant already declared: "+name);
    	}
    	defineVar(ctx2.dataType(), ctx2.ID().getSymbol(),true);
    	return new Symbol(Type.tNULL,null);
    }
    
    public Symbol visitMainFunction(MainFunctionContext ctx) {
    	
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
    	
    	//VISIT
    	this.visit(ctx.parameterList());
    	this.visit(ctx.block());
    	
    	Main.displayScope(currentScope);
    	currentScope = currentScope.getEnclosingScope(); // pop scope
    	if(currentScope.getClass()==GlobalScope.class)
    		currentScope = (GlobalScope)currentScope;
    	
    	return new Symbol(Type.tNULL,null);
    	
    }
    public Symbol visitFunctionDeclaration(FunctionDeclarationContext ctx) {
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
    	
    	//VISIT

    	this.visit(ctx.parameterList());
    	this.visit(ctx.block());
    	
    	
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
    	defineVar(ctx.dataType(), ctx.ID().getSymbol(),false);
    	
    	return new Symbol(Type.tNULL,null);
    }
    public Symbol visitBlock(BlockContext ctx) {
    	// push new local scope
        currentScope = new LocalScope(currentScope);
        currentScope = (LocalScope)currentScope;
        saveScope(ctx, currentScope);
        
        //VISIT
        for(StatementContext stmntCtx: ctx.statement()){
        	this.visit(stmntCtx);
        }
        
        
        Main.displayScope(currentScope);
        currentScope = currentScope.getEnclosingScope(); // pop scope
        if(currentScope.getClass()==FunctionSymbol.class)
        	currentScope = (FunctionSymbol)currentScope;
        
        return new Symbol(Type.tNULL,null);
    }
    public Symbol visitBlockStatement(BlockStatementContext ctx) {
    	
    	this.visit(ctx.block());
    	
    	return new Symbol(Type.tNULL,null);
    }
    
    public Symbol visitVarDec(VarDecContext ctx) {
    	this.visit(ctx.variableDeclaration());
    	return new Symbol(Type.tNULL,null);
    	
    }
    public Symbol visitVariableDeclaration(VariableDeclarationContext ctx) {
    	LocalScope temp = (LocalScope) currentScope;
    	String name = ctx.ID().getText();
    	if(temp.symbols.containsKey(name)){
    		//multiple function declaration in same global scope
    		Main.error(ctx.ID().getSymbol(), "Variable already declared: "+name);
    	}
    	defineVar(ctx.dataType(), ctx.ID().getSymbol(),false);
    	
    	return new Symbol(Type.tNULL,null);
    }
    
    void defineVar(CodeCraftGrammarParser.DataTypeContext typeCtx, Token nameToken, Boolean isConstant) {
        int typeTokenType = typeCtx.start.getType(); //UNSURE
        Symbol.Type type = Main.getType(typeTokenType);
        VariableSymbol var = new VariableSymbol(nameToken.getText(), type, isConstant);
        currentScope.define(var); // Define symbol in current scope
    }
    //----
    
    public Symbol visitIf(IfContext ctx) {
    	this.visit(ctx.ifStatement());
    	return new Symbol(Type.tNULL,null);
    }
    public Symbol visitIfonly(IfonlyContext ctx) {
    	if(this.visit(ctx.condition()).asBoolean()==true){
    		this.visit(ctx.block());
    	}
    	return new Symbol(Type.tNULL,null);
    }
    public Symbol visitIfelse(IfelseContext ctx) {
    	if(this.visit(ctx.condition()).asBoolean()==true){
    		this.visit(ctx.getChild(2));
    	}else{
    		this.visit(ctx.getChild(4));
    	}
    	return new Symbol(Type.tNULL,null);
    }
    public Symbol visitWhile(WhileContext ctx) {
    	this.visit(ctx.whileStatement());
    	return new Symbol(Type.tNULL,null);
    }
    public Symbol visitWhileStatement(WhileStatementContext ctx) {
    	while(this.visit(ctx.condition()).asBoolean()==true){
    		this.visit(ctx.block());
    	}
    	return new Symbol(Type.tNULL,null);
    }
    public Symbol visitDowhile(DowhileContext ctx) {
    	this.visit(ctx.doWhileStatement());
    	return new Symbol(Type.tNULL,null);
    }
    public Symbol visitDoWhileStatement(DoWhileStatementContext ctx) {
    	do{
    		this.visit(ctx.block());
    	}while(this.visit(ctx.condition()).asBoolean()==true);
    	return new Symbol(Type.tNULL,null);
    }
    public Symbol visitFor(ForContext ctx) {
    	this.visit(ctx.forStatement());
    	return new Symbol(Type.tNULL,null);
    }
    @Override
    public Symbol visitForStatement(ForStatementContext ctx) {
    	for(this.visit(ctx.assignmentStatement(0));this.visit(ctx.expression()).asBoolean();this.visit(ctx.assignmentStatement(1))){
    		this.visit(ctx.block());
    	}

    	return new Symbol(Type.tNULL,null);
    }
    @Override
    public Symbol visitFuncCall(FuncCallContext ctx) {
    	this.visit(ctx.functionCallStatement());
    	return new Symbol(Type.tNULL,null);
    }
    @Override
    public Symbol visitFuncCallID(FuncCallIDContext ctx) {
    	//WHAT
    	//this.visitFunctionDeclaration();
    	FunctionSymbol s = (FunctionSymbol)scopes.get(ctx);
    	return s;
    }
    @Override
    public Symbol visitFuncCallPrint(FuncCallPrintContext ctx) {
    	// TODO Auto-generated method stub
    	return super.visitFuncCallPrint(ctx);
    }
    @Override
    public Symbol visitFuncCallPrintln(FuncCallPrintlnContext ctx) {
    	// TODO Auto-generated method stub
    	System.out.println(ctx.toString());
    	return super.visitFuncCallPrintln(ctx);
    }
    @Override
    public Symbol visitFuncCallExpr(FuncCallExprContext ctx) {
    	// TODO Auto-generated method stub
    	return super.visitFuncCallExpr(ctx);
    }
    public Symbol visitReturn(ReturnContext ctx) {
    	this.visit(ctx.returnStatement());
    	return new Symbol(Type.tNULL,null);
    }
    public Symbol visitReturnStatement(ReturnStatementContext ctx) {
    	FunctionSymbol s =(FunctionSymbol)currentScope;
    	s.value = this.visit(ctx.expression());
    	return new Symbol(Type.tNULL,null);
    }
    public Symbol visitCondition(ConditionContext ctx) {
    	return this.visit(ctx.expression());
    }
    public Symbol visitAssign(AssignContext ctx) {
    	this.visit(ctx.assignmentStatement());
    	return new Symbol(Type.tNULL,null);
    }
    
    public Symbol visitAssignmentStatement(AssignmentStatementContext ctx) {
    	String name = ctx.ID().getSymbol().getText();
    	Symbol var = currentScope.resolve(name);
    	if ( var==null ) {
            Main.error(ctx.ID().getSymbol(), "no such variable: "+name);
        }
        if ( var instanceof FunctionSymbol ) {
        	Main.error(ctx.ID().getSymbol(), name+" is not a variable");
        }
        
        Symbol x = this.visit(ctx.expression());
        if(var.type == x.type){
        	currentScope.resolve(name).value = x.value;
        }else if (var.type == Type.tFLOAT && x.type== Type.tINT){
        	currentScope.resolve(name).value = x.asFloat();
        }
        return new Symbol(Type.tNULL,null);
        
    }
    
    //---
    public Symbol visitBangExpr(@NotNull BangExprContext ctx) {
    	Symbol op1 = this.visit(ctx.getChild(1));
    	Symbol ans=null;
    	String operator = ctx.getChild(0).getText();
    	if(op1.isBoolean()){
			if (operator.equals("!")){
				ans = new Symbol(Type.tBOOLEAN, !op1.asBoolean());
			}
    		return ans;
    	}else{
    		TerminalNode tn = (TerminalNode) ctx.getChild(1);
			String msg = "The operator " + operator +" is undefined for the argument type(s)" + op1;
			Main.semanticError(tn.getSymbol(),msg);
    	}
    	return new Symbol(Type.tNULL,null);
    }
    
    public Symbol visitOrExpr(@NotNull OrExprContext ctx) {
    	Symbol op1 = this.visit(ctx.getChild(2));
    	Symbol op2 = this.visit(ctx.getChild(0));
    	Symbol ans=null;
    	String operator = ctx.getChild(1).getText();
    	if(op1.isBoolean()&&op2.isBoolean()){
			if (operator.equals("||")){
				ans = new Symbol(Type.tBOOLEAN, op2.asBoolean() || op1.asBoolean());
			}
    		return ans;
    	}else{
    		TerminalNode tn = (TerminalNode) ctx.getChild(1);
			String msg = "The operator " + operator +" is undefined for the argument type(s)" + op2 +", "+ op1;
			Main.semanticError(tn.getSymbol(),msg);
    	}
    	return new Symbol(Type.tNULL,null);
    }
    public Symbol visitAndExpr(@NotNull AndExprContext ctx) {
    	Symbol op1 = this.visit(ctx.getChild(2));
    	Symbol op2 = this.visit(ctx.getChild(0));
    	Symbol ans=null;
    	String operator = ctx.getChild(1).getText();
    	if(op1.isBoolean()&&op2.isBoolean()){
			if (operator.equals("&&")){
				ans = new Symbol(Type.tBOOLEAN, op2.asBoolean() && op1.asBoolean());
			}
    		return ans;
    	}else{
    		TerminalNode tn = (TerminalNode) ctx.getChild(1);
			String msg = "The operator " + operator +" is undefined for the argument type(s)" + op2 +", "+ op1;
			Main.semanticError(tn.getSymbol(),msg);
    	}
    	return new Symbol(Type.tNULL,null);
    }
    
    public Symbol visitEqualityExpr(@NotNull EqualityExprContext ctx) {
    	Symbol op1 = this.visit(ctx.getChild(2));
    	Symbol op2 = this.visit(ctx.getChild(0));
    	Symbol ans=null;
    	String operator = ctx.getChild(1).getText();
    	if((op1.isFloat() || op1.isInt())&&(op2.isFloat() || op2.isInt())){
			if (operator.equals("==")){
				ans = new Symbol(Type.tBOOLEAN, op2.asFloat() == op1.asFloat());
			}else if (operator.equals("!=")){
				ans = new Symbol(Type.tBOOLEAN, op2.asFloat() != op1.asFloat());
			}
    		return ans;
    	}else if(op1.isBoolean()&&op2.isBoolean()){
    		if (operator.equals("==")){
				ans = new Symbol(Type.tBOOLEAN, op2.asBoolean() == op1.asBoolean());
			}else if (operator.equals("!=")){
				ans = new Symbol(Type.tBOOLEAN, op2.asBoolean() != op1.asBoolean());
			}
    		return ans;
    	}else if(op1.isString()&&op2.isString()){
    		if (operator.equals("==")){
				ans = new Symbol(Type.tBOOLEAN, op2.asString() == op1.asString());
			}else if (operator.equals("!=")){
				ans = new Symbol(Type.tBOOLEAN, op2.asString() != op1.asString());
			}
    		return ans;
    	}else if(op1.isChar()&&op2.isChar()){
    		if (operator.equals("==")){
				ans = new Symbol(Type.tBOOLEAN, op2.asChar() == op1.asChar());
			}else if (operator.equals("!=")){
				ans = new Symbol(Type.tBOOLEAN, op2.asChar() != op1.asChar());
			}
    		return ans;
    	}else{
    		//error expression type mismatch
    		//The operator - is undefined for the argument type(s) java.lang.String, java.lang.String
    		TerminalNode tn = (TerminalNode) ctx.getChild(1);
			String msg = "The operator " + operator +" is undefined for the argument type(s)" + op2 +", "+ op1;
			Main.semanticError(tn.getSymbol(),msg);
    	}
    	return new Symbol(Type.tNULL,null);
    }
    
    public Symbol visitRelationalExpr(@NotNull RelationalExprContext ctx) {
    	Symbol op1 = this.visit(ctx.getChild(2));
    	Symbol op2 = this.visit(ctx.getChild(0));
    	Symbol ans=null;
    	String operator = ctx.getChild(1).getText();
    	if((op1.isFloat() || op1.isInt())&&(op2.isFloat() || op2.isInt())){
			if (operator.equals(">")){
				ans = new Symbol(Type.tBOOLEAN, op2.asFloat() > op1.asFloat());
			}else if (operator.equals("<")){
				ans = new Symbol(Type.tBOOLEAN, op2.asFloat() < op1.asFloat());
			}else if (operator.equals(">=")){
				ans = new Symbol(Type.tBOOLEAN, op2.asFloat() >= op1.asFloat());
			}else if (operator.equals("<=")){
				ans = new Symbol(Type.tBOOLEAN, op2.asFloat() <= op1.asFloat());
			}
    		return ans;
    	}else{
    		//error expression type mismatch
    		//The operator - is undefined for the argument type(s) java.lang.String, java.lang.String
    		TerminalNode tn = (TerminalNode) ctx.getChild(1);
			String msg = "The operator " + operator +" is undefined for the argument type(s)" + op2 +", "+ op1;
			Main.semanticError(tn.getSymbol(),msg);
    	}
    	return new Symbol(Type.tNULL,null);
    }
    
    public Symbol visitMultdivmodExpr(MultdivmodExprContext ctx) {
    	Symbol op1 = this.visit(ctx.getChild(2));
    	Symbol op2 = this.visit(ctx.getChild(0));
    	Symbol ans=null;
    	String operator = ctx.getChild(1).getText();
    	if((op1.isFloat() || op1.isInt())&&(op2.isFloat() || op2.isInt())){
    		if(op1.asFloat()==0 && (operator.equals("/")||operator.equals("%"))){
    			//error div/mod by zero
    			TerminalNode tn = (TerminalNode) ctx.getChild(1);
    			String msg = "Arithmetic Error: " + operator +" by zero";
    			Main.semanticError(tn.getSymbol(),msg);
    		}else {
    			if(op1.isFloat()||op2.isFloat()){ //push as float
	    			if (operator.equals("*")){
	    				ans = new Symbol(Type.tFLOAT, op2.asFloat() * op1.asFloat());
	    			}else if(operator.equals("/")){
	    				ans = new Symbol(Type.tFLOAT, op2.asFloat() / op1.asFloat());
	    			}else if(operator.equals("%")){
	    				ans = new Symbol(Type.tFLOAT, op2.asFloat() % op1.asFloat());
	    			}
	    		}else{ //push as int
	    			if (operator.equals("*")){
	    				ans = new Symbol(Type.tINT, op2.asInt() * op1.asInt());
	    			}else if(operator.equals("/")){
	    				ans = new Symbol(Type.tINT, op2.asInt() / op1.asInt());
	    			}else if(operator.equals("%")){
	    				ans = new Symbol(Type.tINT, op2.asInt() % op1.asInt());
	    			}
	    		}
	    		return ans;
    		}
    	}else{
    		//error expression type mismatch
    		TerminalNode tn = (TerminalNode) ctx.getChild(1);
			String msg = "The operator " + operator +" is undefined for the argument type(s)" + op2 +", "+ op1;
			Main.semanticError(tn.getSymbol(),msg);
    	}
    	return new Symbol(Type.tNULL,null);
    }
    
    public Symbol visitAddminusExpr(AddminusExprContext ctx) {
    	Symbol op1 = this.visit(ctx.getChild(2));
    	Symbol op2 = this.visit(ctx.getChild(0));
    	Symbol ans;
    	String operator = ctx.getChild(1).getText();
    	if((op1.isFloat() || op1.isInt())&&(op2.isFloat() || op2.isInt())){
    		if(op1.isFloat()||op2.isFloat()){ //push as float
    			
    			if (operator.equals("-")){
    				ans = new Symbol(Type.tFLOAT, op2.asFloat() - op1.asFloat());
    			}else{
    				ans = new Symbol(Type.tFLOAT, op2.asFloat() + op1.asFloat());
    			}
    		}else{ //push as int
    			if (operator.equals("-")){	
    				ans = new Symbol(Type.tINT, op2.asInt() -  op1.asInt());
 			    }
 			    else{
 			    	ans = new Symbol(Type.tINT, op2.asInt() + op1.asInt() );
 			    }
    		}
    		return ans;
    	}else if(op1.isString() && op2.isString() && operator.equals("+")){
    		ans = new Symbol(Type.tSTRING, op2.asString() + op1.asString());
    		return ans;
    	}else{
    		//error expression type mismatch
    		//The operator - is undefined for the argument type(s) java.lang.String, java.lang.String
    		TerminalNode tn = (TerminalNode) ctx.getChild(1);
			String msg = "The operator " + operator +" is undefined for the argument type(s)" + op2 +", "+ op1;
			Main.semanticError(tn.getSymbol(),msg);
    	}
    	return new Symbol(Type.tNULL,null);
    }
    public Symbol visitNullExpr(NullExprContext ctx) {
    	Symbol s = new Symbol(Type.tNULL,null);
    	return s;
    }
    public Symbol visitIdExpr(IdExprContext ctx) {
    	String name = ctx.ID().getSymbol().getText();
        Symbol var = currentScope.resolve(name);
        if ( var==null ) {
            Main.semanticError(ctx.ID().getSymbol(), "no such variable: "+name);
        }else if ( var instanceof FunctionSymbol ) {
        	Main.semanticError(ctx.ID().getSymbol(), name+" is not a variable");
        }else{
        	return var;
        }
        return new Symbol(Type.tNULL,null);
    }
    public Symbol visitIntExpr(IntExprContext ctx) {
    	String valueInString = ctx.IntegerLiteral().getSymbol().getText();
    	Integer valueInInteger = Integer.valueOf(valueInString);
    	Symbol s = new Symbol(Type.tINT,valueInInteger);
    	return s;
    }
    public Symbol visitFloatExpr(FloatExprContext ctx) {
    	String valueInString = ctx.FloatingPointLiteral().getSymbol().getText();
    	Float valueInFloat = Float.valueOf(valueInString);
    	Symbol s = new Symbol(Type.tFLOAT,valueInFloat);
    	return s;
    }
    public Symbol visitBoolExpr(BoolExprContext ctx) {String value = ctx.BooleanLiteral().getSymbol().getText();  
		Symbol s = null;
		if("true".equals(value)){
			s = new Symbol(Type.tBOOLEAN,true);
		}else if("false".equals(value)){
			s = new Symbol(Type.tBOOLEAN,false);
		}
		return s;
    }
    public Symbol visitStringExpr(StringExprContext ctx) {
    	String value = ctx.StringLiteral().getSymbol().getText();
    	Symbol s;
    	if(value.length()==2){ //String is blank
    		s = new Symbol(Type.tSTRING,"");
    	}else{
    		s = new Symbol(Type.tSTRING,value.substring(1, value.length()-1));
    	}
    	return s;
    }
    
    public Symbol visitCharExpr(CharExprContext ctx) {
    	String value = ctx.CharacterLiteral().getSymbol().getText();
    	Symbol s = new Symbol(Type.tCHAR,value.charAt(1));
    	return s;
    }
    
    
}

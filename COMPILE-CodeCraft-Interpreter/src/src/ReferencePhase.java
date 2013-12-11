package src;

import gen.CodeCraftGrammarBaseVisitor;
import gen.CodeCraftGrammarParser;
import gen.CodeCraftGrammarParser.ActualParametersContext;
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
import gen.CodeCraftGrammarParser.ExpressionContext;
import gen.CodeCraftGrammarParser.FloatExprContext;
import gen.CodeCraftGrammarParser.ForContext;
import gen.CodeCraftGrammarParser.ForStatementContext;
import gen.CodeCraftGrammarParser.FuncCallContext;
import gen.CodeCraftGrammarParser.FuncCallExprContext;
import gen.CodeCraftGrammarParser.FuncCallIDContext;
import gen.CodeCraftGrammarParser.FuncCallPrintContext;
import gen.CodeCraftGrammarParser.FuncCallPrintlnContext;
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
import gen.CodeCraftGrammarParser.ParensExprContext;
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

import java.util.ArrayList;
import java.util.Collection;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import src.Symbol.Type;

public class ReferencePhase extends CodeCraftGrammarBaseVisitor<Symbol>{
	ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
    GlobalScope globals;
    Scope currentScope; // define symbols in this scope
    
    void saveScope(ParserRuleContext ctx, Scope s) { scopes.put(ctx, s); }
    
    public ReferencePhase(ParseTreeProperty<Scope> scopes, GlobalScope globals){
    	this.scopes = scopes;
    	this.globals = globals;
    }
    
    public Symbol visitProgram(ProgramContext ctx) {
    	currentScope = globals;
    	//visit
    	for(ConstantStatementContext conStmnt: ctx.constantStatement()){
    		this.visit(conStmnt);
    	}
    	this.visit(ctx.mainFunction());
    	Main.displayScope(globals);
    	return new Symbol(Type.tNULL,null);
    }
    
    public Symbol visitConstantStatement(ConstantStatementContext ctx) {
    	
    	Main.debug("<start>ConstDecl:");
    	GlobalScope temp = (GlobalScope) currentScope;
    	ConstantStatementContext ctx2 = ctx;
    	
    	String name = ctx2.ID().getText();
    	if(temp.symbols.containsKey(name)){
    		//multiple function declaration in same global scope
    		Main.error(ctx2.ID().getSymbol(), "Constant already declared: "+name);
    	}
    	defineVar(ctx2.dataType(), ctx2.ID().getSymbol(),true,0);
    	Main.debug("<end>ConstDecl");
    	return new Symbol(Type.tNULL,null);
    }
    
    public Symbol visitMainFunction(MainFunctionContext ctx) {
    	
    	Main.debug("<start>Mainfunc");
    	
    	String name = ctx.MINE().getText();
    	int typeTokenType = ctx.DARKNESS().getSymbol().getType(); //UNSURE
    	Symbol.Type type = Main.getType(typeTokenType);
    	// push new scope by making new one that points to enclosing scope
    	FunctionSymbol function = new FunctionSymbol(name, type, currentScope,null);
    	
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
    	
    	Main.debug("<end>Mainfunc");
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
    public Symbol visitBlock(BlockContext ctx) {
    	// push new local scope
    	Main.debug("<start>block");
    	
        currentScope = new LocalScope(currentScope);
        currentScope = (LocalScope)currentScope;
        saveScope(ctx, currentScope);
        Symbol retVal = new Symbol(Type.tNULL,null);
        //VISIT
        for(StatementContext stmntCtx: ctx.statement()){
        	Symbol sym = this.visit(stmntCtx);
        	if(sym.type!=Type.tNULL){
        		retVal = sym;
        	}
        }
        
        
        Main.displayScope(currentScope);
        currentScope = currentScope.getEnclosingScope(); // pop scope
        if(currentScope.getClass()==FunctionSymbol.class)
        	currentScope = (FunctionSymbol)currentScope;
        
        Main.debug("<end>block");
        
        return retVal;
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
    	
    	Main.debug("<start>varDecl");
    	LocalScope temp = (LocalScope) currentScope;
    	String name = ctx.ID().getText();
    	if(temp.symbols.containsKey(name)){
    		//multiple function declaration in same global scope
    		Main.error(ctx.ID().getSymbol(), "Variable already declared: "+name);
    	}
    	defineVar(ctx.dataType(), ctx.ID().getSymbol(),false,0);
    	
    	//Main.debug("Variable Declared: "+)
    	Main.debug("<end>varDecl");
    	return new Symbol(Type.tNULL,null);
    }
    
    void defineVar(CodeCraftGrammarParser.DataTypeContext typeCtx, Token nameToken, Boolean isConstant,int order) {
        int typeTokenType = typeCtx.start.getType(); //UNSURE
        Symbol.Type type = Main.getType(typeTokenType);
        VariableSymbol var = new VariableSymbol(nameToken.getText(), type, isConstant,order);
        currentScope.define(var); // Define symbol in current scope
        Main.debug("Variable Declared: "+type+" "+nameToken.getText());
    }
    //----
    
    public Symbol visitIf(IfContext ctx) {
    	Main.debug("<start>ifStmnt");
    	this.visit(ctx.ifStatement());
    	Main.debug("<end>ifStmnt");
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
    	Main.debug("<start>whileStmnt");
    	this.visit(ctx.whileStatement());
    	Main.debug("<end>whileStmnt");
    	return new Symbol(Type.tNULL,null);
    }
    public Symbol visitWhileStatement(WhileStatementContext ctx) {
    	while(this.visit(ctx.condition()).asBoolean()==true){
    		this.visit(ctx.block());
    	}
    	return new Symbol(Type.tNULL,null);
    }
    public Symbol visitDowhile(DowhileContext ctx) {
    	Main.debug("<start>dowhileStmnt");
    	this.visit(ctx.doWhileStatement());
    	Main.debug("<end>dowhileStmnt");
    	return new Symbol(Type.tNULL,null);
    }
    public Symbol visitDoWhileStatement(DoWhileStatementContext ctx) {
    	do{
    		this.visit(ctx.block());
    	}while(this.visit(ctx.condition()).asBoolean()==true);
    	return new Symbol(Type.tNULL,null);
    }
    public Symbol visitFor(ForContext ctx) {
    	Main.debug("<start>forStmnt");
    	this.visit(ctx.forStatement());
    	Main.debug("<end>forStmnt");
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
    	Main.debug("<start>funcCall");
    	this.visit(ctx.functionCallStatement());
    	Main.debug("<end>funcCall");
    	return new Symbol(Type.tNULL,null);
    }
    @Override
    public Symbol visitFuncCallID(FuncCallIDContext ctx) {
    	
    	
    	FunctionSymbol s = (FunctionSymbol)globals.symbols.get(ctx.ID().getText());
    	
    	GlobalScope temp = (GlobalScope) currentScope;
    	if(temp.symbols.containsKey(s.name)){
    		//multiple function declaration in same global scope
    		Main.error(ctx.ID().getSymbol(), "Function already declared: "+s.name);
    	}//UNSURE should i let it continue saving in symbol table
    	currentScope.define(s); // Define function in current scope
    	saveScope(s.ctx, s); // Push: set function's parent to current
    	currentScope = s; // Current scope is now function scope
    	if(currentScope.getClass()==FunctionSymbol.class)
    		currentScope = (FunctionSymbol)currentScope;
    	
    	ActualParametersContext paramCtx = ctx.actualParameters();
    	
    	FunctionSymbol params = (FunctionSymbol)this.visit(paramCtx);
    	for(Symbol sym: s.arguments.values()){
    		VariableSymbol sym2 = (VariableSymbol)sym;
    		sym.value = params.arguments.get(String.valueOf(sym2.order));
    	}
    	Symbol ans = this.visit(s.ctx.block());
    	
    	s.value = ans.value;
    	
    	Main.displayScope(currentScope);
    	currentScope = currentScope.getEnclosingScope(); // pop scope
    	if(currentScope.getClass()==GlobalScope.class)
    		currentScope = (GlobalScope)currentScope;
    	
    	
    	Main.debug("<end>funcCallID");
    	return ans;
    }
    @Override
    public Symbol visitActualParameters(ActualParametersContext ctx) {
    	
    	Main.debug("<start>actualParams");
    	FunctionSymbol t = new FunctionSymbol(null,null,null,null);
    	Integer i=0;
    	for(ExpressionContext s :ctx.expression()){
    		t.arguments.put(i.toString(),this.visit(s));
    		i++;
    	}
    	Main.debug("<end>ActualParams");
    	return t;
    }
    
    @Override
    public Symbol visitFuncCallPrint(FuncCallPrintContext ctx) {
    	
    	Main.debug("<start>funcPrint");
    	FunctionSymbol t = (FunctionSymbol) this.visit(ctx.actualParameters());
    	
    	ArrayList<String> msgArray = new ArrayList<String>();
    	
    	for(int i=0;i<t.arguments.size();i++){
    		msgArray.add(t.arguments.get(String.valueOf(i)).value.toString());
    	}
    	for(String str: msgArray){
    		Main.printMsg(str);
    	}
    	Main.debug("<end>funcPrint");
    	return new Symbol(Type.tNULL,null);
    }
    @Override
    public Symbol visitFuncCallPrintln(FuncCallPrintlnContext ctx) {
    	Main.debug("<start>funcPrintLN");
    	FunctionSymbol t = (FunctionSymbol) this.visit(ctx.actualParameters());
    	
    	ArrayList<String> msgArray = new ArrayList<String>();
    	
    	for(int i=0;i<t.arguments.size();i++){
    		msgArray.add(t.arguments.get(String.valueOf(i)).value.toString());
    	}
    	for(String str: msgArray){
    		Main.printMsg(str);
    	}
    	Main.printMsg("\n");
    	Main.debug("<end>funcPrintLN");
    	return new Symbol(Type.tNULL,null);
    }
    @Override
    public Symbol visitFuncCallExpr(FuncCallExprContext ctx) {
    	Main.debug("<start>funcCallExpr");
    	FunctionSymbol s = (FunctionSymbol)globals.symbols.get(ctx.ID().getText());
    	
    	
    	
    	//currentScope.define(s); // Define function in current scope
    	//saveScope(s.ctx, s); // Push: set function's parent to current
    	//currentScope = s; // Current scope is now function scope
    	//if(currentScope.getClass()==FunctionSymbol.class)
    	//	currentScope = (FunctionSymbol)currentScope;
    	
    	ActualParametersContext paramCtx = ctx.actualParameters();
    	
    	FunctionSymbol params = (FunctionSymbol)this.visit(paramCtx);
    	for(Symbol sym: s.arguments.values()){
    		VariableSymbol sym2 = (VariableSymbol)sym;
    		sym.value = params.arguments.get(String.valueOf(sym2.order));
    	}
    	Symbol ans = this.visit(s.ctx.block());
    	
    	s.value = ans.value;
    	
    	//Main.displayScope(currentScope);
    	//currentScope = currentScope.getEnclosingScope(); // pop scope
    	//if(currentScope.getClass()==GlobalScope.class)
    	//	currentScope = (GlobalScope)currentScope;
    	
    	
    	Main.debug("<end>funcCallExpr");
    	return ans;
    }
    public Symbol visitReturn(ReturnContext ctx) {
    	Main.debug("<start>returnStmnt");
    	Symbol s = this.visit(ctx.returnStatement());
    	Main.debug("<end>returnStmnt");
    	return s;
    }
    public Symbol visitReturnStatement(ReturnStatementContext ctx) {
    	FunctionSymbol s =(FunctionSymbol)currentScope.getEnclosingScope();
    	s.value = this.visit(ctx.expression());
    	return s;
    }
    public Symbol visitCondition(ConditionContext ctx) {
    	Main.debug("<start&end>condition");
    	
    	return this.visit(ctx.expression());
    	
    }
    public Symbol visitAssign(AssignContext ctx) {
    	Main.debug("<start>assignStmnt");
    	this.visit(ctx.assignmentStatement());
    	Main.debug("<end>assignStmnt");
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
        
        Main.debug(">>>>>>>>>ASSIGNMENT: "+ var.name + "=" +var.value);
        return new Symbol(Type.tNULL,null);
        
    }
    
    //---
    public Symbol visitBangExpr(@NotNull BangExprContext ctx) {
    	Main.debug("<start>BangExpr");
    	Symbol op1 = this.visit(ctx.getChild(1));
    	Symbol ans=null;
    	String operator = ctx.getChild(0).getText();
    	if(op1.isBoolean()){
			if (operator.equals("!")){
				ans = new Symbol(Type.tBOOLEAN, !op1.asBoolean());
			}
			Main.debug("<end>BangExpr");
    		return ans;
    	}else{
    		TerminalNode tn = (TerminalNode) ctx.getChild(1);
			String msg = "The operator " + operator +" is undefined for the argument type(s)" + op1;
			Main.semanticError(tn.getSymbol(),msg);
    	}
    	Main.debug("<end>BangExpr");
    	return new Symbol(Type.tNULL,null);
    }
    
    public Symbol visitOrExpr(@NotNull OrExprContext ctx) {
    	Main.debug("<start>OrExpr");
    	Symbol op1 = this.visit(ctx.getChild(2));
    	Symbol op2 = this.visit(ctx.getChild(0));
    	Symbol ans=null;
    	String operator = ctx.getChild(1).getText();
    	if(op1.isBoolean()&&op2.isBoolean()){
			if (operator.equals("||")){
				ans = new Symbol(Type.tBOOLEAN, op2.asBoolean() || op1.asBoolean());
			}
			Main.debug("<end>OrExpr");
    		return ans;
    	}else{
    		TerminalNode tn = (TerminalNode) ctx.getChild(1);
			String msg = "The operator " + operator +" is undefined for the argument type(s)" + op2 +", "+ op1;
			Main.semanticError(tn.getSymbol(),msg);
    	}
    	Main.debug("<end>OrExpr");
    	return new Symbol(Type.tNULL,null);
    }
    public Symbol visitAndExpr(@NotNull AndExprContext ctx) {
    	Main.debug("<start>AndExpr");
    	Symbol op1 = this.visit(ctx.getChild(2));
    	Symbol op2 = this.visit(ctx.getChild(0));
    	Symbol ans=null;
    	String operator = ctx.getChild(1).getText();
    	if(op1.isBoolean()&&op2.isBoolean()){
			if (operator.equals("&&")){
				ans = new Symbol(Type.tBOOLEAN, op2.asBoolean() && op1.asBoolean());
			}
			Main.debug("<end>AndExpr");
    		return ans;
    	}else{
    		TerminalNode tn = (TerminalNode) ctx.getChild(1);
			String msg = "The operator " + operator +" is undefined for the argument type(s)" + op2 +", "+ op1;
			Main.semanticError(tn.getSymbol(),msg);
    	}
    	Main.debug("<end>AndExpr");
    	return new Symbol(Type.tNULL,null);
    }
    
    public Symbol visitEqualityExpr(@NotNull EqualityExprContext ctx) {
    	Main.debug("<start>EqualityExpr");
    	Symbol op1 = this.visit(ctx.getChild(2));
    	Symbol op2 = this.visit(ctx.getChild(0));
    	Symbol ans=null;
    	String operator = ctx.getChild(1).getText();
    	if((op1.isFloat() || op1.isInt())&&(op2.isFloat() || op2.isInt())){
			if (operator.equals("==")){
				ans = new Symbol(Type.tBOOLEAN, op2.asFloat().floatValue() == op1.asFloat().floatValue());
			}else if (operator.equals("!=")){
				ans = new Symbol(Type.tBOOLEAN, op2.asFloat().floatValue() != op1.asFloat().floatValue());
			}
			Main.debug("<end>EqltyExpr");
    		return ans;
    	}else if(op1.isBoolean()&&op2.isBoolean()){
    		if (operator.equals("==")){
				ans = new Symbol(Type.tBOOLEAN, op2.asBoolean() == op1.asBoolean());
			}else if (operator.equals("!=")){
				ans = new Symbol(Type.tBOOLEAN, op2.asBoolean() != op1.asBoolean());
			}
    		Main.debug("<end>EqltyExpr");
			
    		return ans;
    	}else if(op1.isString()&&op2.isString()){
    		if (operator.equals("==")){
				ans = new Symbol(Type.tBOOLEAN, op2.asString() == op1.asString());
			}else if (operator.equals("!=")){
				ans = new Symbol(Type.tBOOLEAN, op2.asString() != op1.asString());
			}
    		Main.debug("<end>EqltyExpr");
    		return ans;
    	}else if(op1.isChar()&&op2.isChar()){
    		if (operator.equals("==")){
				ans = new Symbol(Type.tBOOLEAN, op2.asChar() == op1.asChar());
			}else if (operator.equals("!=")){
				ans = new Symbol(Type.tBOOLEAN, op2.asChar() != op1.asChar());
			}
    		Main.debug("<end>EqltyExpr");
    		return ans;
    	}else{
    		//error expression type mismatch
    		//The operator - is undefined for the argument type(s) java.lang.String, java.lang.String
    		TerminalNode tn = (TerminalNode) ctx.getChild(1);
			String msg = "The operator " + operator +" is undefined for the argument type(s)" + op2 +", "+ op1;
			Main.semanticError(tn.getSymbol(),msg);
    	}
    	Main.debug("<end>EqltyExpr");
    	return new Symbol(Type.tNULL,null);
    }
    
    public Symbol visitRelationalExpr(@NotNull RelationalExprContext ctx) {
    	Main.debug("<Start>rltnlExpr");
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
			Main.debug("<end>rltnlExpr");
    		return ans;
    	}else{
    		//error expression type mismatch
    		//The operator - is undefined for the argument type(s) java.lang.String, java.lang.String
    		TerminalNode tn = (TerminalNode) ctx.getChild(1);
			String msg = "The operator " + operator +" is undefined for the argument type(s)" + op2 +", "+ op1;
			Main.semanticError(tn.getSymbol(),msg);
    	}
    	Main.debug("<end>rltnlExpr");
    	return new Symbol(Type.tNULL,null);
    }
    @Override
    public Symbol visitParensExpr(ParensExprContext ctx) {
    	return this.visit(ctx.expression());
    }
    public Symbol visitMultdivmodExpr(MultdivmodExprContext ctx) {
    	Main.debug("<start>multdivmodexpr");
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
    			Main.debug("<end>multdivmodexpr");
	    		return ans;
    		}
    	}else{
    		//error expression type mismatch
    		TerminalNode tn = (TerminalNode) ctx.getChild(1);
			String msg = "The operator " + operator +" is undefined for the argument type(s)" + op2 +", "+ op1;
			Main.semanticError(tn.getSymbol(),msg);
    	}
    	Main.debug("<end>multdivmodexpr");
    	return new Symbol(Type.tNULL,null);
    }
    
    public Symbol visitAddminusExpr(AddminusExprContext ctx) {
    	Main.debug("<start>addminusexpr");
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
    		Main.debug("<end>addminusexpr");
    		return ans;
    	}else if(op1.isString() && op2.isString() && operator.equals("+")){
    		ans = new Symbol(Type.tSTRING, op2.asString() + op1.asString());
    		Main.debug("<end>addminusexpr");
    		return ans;
    	}else{
    		//error expression type mismatch
    		//The operator - is undefined for the argument type(s) java.lang.String, java.lang.String
    		TerminalNode tn = (TerminalNode) ctx.getChild(1);
			String msg = "The operator " + operator +" is undefined for the argument type(s)" + op2 +", "+ op1;
			Main.semanticError(tn.getSymbol(),msg);
    	}
    	Main.debug("<end>addminusexpr");
    	return new Symbol(Type.tNULL,null);
    }
    public Symbol visitNullExpr(NullExprContext ctx) {
    	Main.debug("<start>nullExpr");
    	Symbol s = new Symbol(Type.tNULL,null);
    	Main.debug("<end>nullExpr");
    	return s;
    }
    public Symbol visitIdExpr(IdExprContext ctx) {
    	Main.debug("<start>idExpr");
    	String name = ctx.ID().getSymbol().getText();
        Symbol var = currentScope.resolve(name);
        if ( var==null ) {
            Main.semanticError(ctx.ID().getSymbol(), "no such variable: "+name);
        }else if ( var instanceof FunctionSymbol ) {
        	Main.semanticError(ctx.ID().getSymbol(), name+" is not a variable");
        }else{
        	Main.debug("<end>idExpr");
        	return var;
        }
        Main.debug("<end>idExpr");
        return new Symbol(Type.tNULL,null);
    }
    public Symbol visitIntExpr(IntExprContext ctx) {
    	Main.debug("<start>intexpr");
    	String valueInString = ctx.IntegerLiteral().getSymbol().getText();
    	Integer valueInInteger = Integer.valueOf(valueInString);
    	Symbol s = new Symbol(Type.tINT,valueInInteger);
    	Main.debug("<end>intexpr");
    	return s;
    }
    public Symbol visitFloatExpr(FloatExprContext ctx) {
    	Main.debug("<start>floatexpr");
    	String valueInString = ctx.FloatingPointLiteral().getSymbol().getText();
    	Float valueInFloat = Float.valueOf(valueInString);
    	Symbol s = new Symbol(Type.tFLOAT,valueInFloat);
    	Main.debug("<end>floatexpr");
    	return s;
    }
    public Symbol visitBoolExpr(BoolExprContext ctx) {String value = ctx.BooleanLiteral().getSymbol().getText();  
    	Main.debug("<start>boolexpr");
    	Symbol s = null;
		if("true".equals(value)){
			s = new Symbol(Type.tBOOLEAN,true);
		}else if("false".equals(value)){
			s = new Symbol(Type.tBOOLEAN,false);
		}
		Main.debug("<end>boolexpr");
		return s;
    }
    public Symbol visitStringExpr(StringExprContext ctx) {
    	Main.debug("<start>stringExpr");
    	String value = ctx.StringLiteral().getSymbol().getText();
    	Symbol s;
    	if(value.length()==2){ //String is blank
    		s = new Symbol(Type.tSTRING,"");
    	}else{
    		s = new Symbol(Type.tSTRING,value.substring(1, value.length()-1));
    	}
    	Main.debug("<end>stringExpr");
    	return s;
    }
    
    public Symbol visitCharExpr(CharExprContext ctx) {
    	Main.debug("<start>charExpr");
    	String value = ctx.CharacterLiteral().getSymbol().getText();
    	Symbol s = new Symbol(Type.tCHAR,value.charAt(1));
    	Main.debug("<end>charExpr");
    	return s;
    }
    
    
}

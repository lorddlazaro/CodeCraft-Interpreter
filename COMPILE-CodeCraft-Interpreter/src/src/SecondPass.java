package src;
import gen.CodeCraftGrammarBaseListener;
import gen.CodeCraftGrammarParser;
import gen.CodeCraftGrammarParser.AddminusExprContext;
import gen.CodeCraftGrammarParser.AndExprContext;
import gen.CodeCraftGrammarParser.AssignmentStatementContext;
import gen.CodeCraftGrammarParser.BangExprContext;
import gen.CodeCraftGrammarParser.BlockContext;
import gen.CodeCraftGrammarParser.BoolExprContext;
import gen.CodeCraftGrammarParser.CharExprContext;
import gen.CodeCraftGrammarParser.ConditionContext;
import gen.CodeCraftGrammarParser.EqualityExprContext;
import gen.CodeCraftGrammarParser.FloatExprContext;
import gen.CodeCraftGrammarParser.FuncCallExprContext;
import gen.CodeCraftGrammarParser.FuncCallIDContext;
import gen.CodeCraftGrammarParser.FunctionDeclarationContext;
import gen.CodeCraftGrammarParser.IfContext;
import gen.CodeCraftGrammarParser.IntExprContext;
import gen.CodeCraftGrammarParser.MultdivmodExprContext;
import gen.CodeCraftGrammarParser.NullExprContext;
import gen.CodeCraftGrammarParser.OrExprContext;
import gen.CodeCraftGrammarParser.ParensExprContext;
import gen.CodeCraftGrammarParser.ProgramContext;
import gen.CodeCraftGrammarParser.RelationalExprContext;
import gen.CodeCraftGrammarParser.StringExprContext;

import java.util.Stack;

import javax.swing.JTextArea;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import src.Symbol.Type;


public class SecondPass extends CodeCraftGrammarBaseListener{
	ParseTreeProperty<Scope> scopes;
    GlobalScope globals;
    Scope currentScope; // resolve symbols starting in this scope
    JTextArea ta;
    Stack<Symbol> stack = new Stack<Symbol>();
    
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
    public void exitIf(@NotNull IfContext ctx) {
    	
    }
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
    
    public void exitAssignmentStatement(AssignmentStatementContext ctx) {
    	String name = ctx.ID().getSymbol().getText();
    	Symbol var = currentScope.resolve(name);
    	if ( var==null ) {
            Main.error(ctx.ID().getSymbol(), "no such variable: "+name);
        }
        if ( var instanceof FunctionSymbol ) {
        	Main.error(ctx.ID().getSymbol(), name+" is not a variable");
        }
        System.out.println(name);
        ta.setText(ta.getText() +"\n"+ name);
        
        Symbol x = stack.pop();
        System.out.println("==\n::assign value"+x.value + " assign type:" + x.type.toString());
        if(var.type == x.type){
        	
        	
        	currentScope.resolve(name).value = x.value;
        	System.out.println("assignment name:"+name +" value: "+currentScope.resolve(name).value+" type:"+currentScope.resolve(name).type+"===\n");
        }else if (var.type == Type.tFLOAT && x.type== Type.tINT){
        	currentScope.resolve(name).value = x.asFloat();
        	System.out.println("assignment name:"+name +" value: "+currentScope.resolve(name).value+" type:"+currentScope.resolve(name).type+"===\n");
        }else{
        	//TODO: error type mismatch
        }
    }
    public void exitFuncCallExpr(@NotNull FuncCallExprContext ctx) {
    	String funcName = ctx.ID().getText();
        Symbol meth = currentScope.resolve(funcName);
        if ( meth==null ) {
            Main.error(ctx.ID().getSymbol(), "no such function: "+funcName);
        }
        if ( meth instanceof VariableSymbol ) {
        	Main.error(ctx.ID().getSymbol(), funcName+" is not a function");
        }
        //#WHAT THE HECK 
    }
    public void exitBangExpr(@NotNull BangExprContext ctx) {
    	Symbol op1 = stack.pop();
    	Symbol ans=null;
    	String operator = ctx.getChild(1).getText();
    	if(op1.isBoolean()){
			if (operator.equals("!")){
				ans = new Symbol(Type.tBOOLEAN, !op1.asBoolean());
			}
    		stack.push(ans);
    	}else{
    		TerminalNode tn = (TerminalNode) ctx.getChild(1);
			String msg = "The operator " + operator +" is undefined for the argument type(s)" + op1;
			Main.semanticError(tn.getSymbol(),msg);
    	}
    }
    public void exitOrExpr(@NotNull OrExprContext ctx) {
    	Symbol op1 = stack.pop();
    	Symbol op2 = stack.pop();
    	Symbol ans=null;
    	String operator = ctx.getChild(1).getText();
    	if(op1.isBoolean()&&op2.isBoolean()){
			if (operator.equals("||")){
				ans = new Symbol(Type.tBOOLEAN, op2.asBoolean() || op1.asBoolean());
			}
    		stack.push(ans);
    	}else{
    		TerminalNode tn = (TerminalNode) ctx.getChild(1);
			String msg = "The operator " + operator +" is undefined for the argument type(s)" + op2 +", "+ op1;
			Main.semanticError(tn.getSymbol(),msg);
    	}
    }
    public void exitAndExpr(@NotNull AndExprContext ctx) {
    	Symbol op1 = stack.pop();
    	Symbol op2 = stack.pop();
    	Symbol ans=null;
    	String operator = ctx.getChild(1).getText();
    	if(op1.isBoolean()&&op2.isBoolean()){
			if (operator.equals("&&")){
				ans = new Symbol(Type.tBOOLEAN, op2.asBoolean() && op1.asBoolean());
			}
    		stack.push(ans);
    	}else{
    		TerminalNode tn = (TerminalNode) ctx.getChild(1);
			String msg = "The operator " + operator +" is undefined for the argument type(s)" + op2 +", "+ op1;
			Main.semanticError(tn.getSymbol(),msg);
    	}
    }
    public void exitEqualityExpr(@NotNull EqualityExprContext ctx) {
    	Symbol op1 = stack.pop();
    	Symbol op2 = stack.pop();
    	Symbol ans=null;
    	String operator = ctx.getChild(1).getText();
    	if((op1.isFloat() || op1.isInt())&&(op2.isFloat() || op2.isInt())){
			if (operator.equals("==")){
				ans = new Symbol(Type.tBOOLEAN, op2.asFloat() == op1.asFloat());
			}else if (operator.equals("!=")){
				ans = new Symbol(Type.tBOOLEAN, op2.asFloat() != op1.asFloat());
			}
    		stack.push(ans);
    	}else if(op1.isBoolean()&&op2.isBoolean()){
    		if (operator.equals("==")){
				ans = new Symbol(Type.tBOOLEAN, op2.asBoolean() == op1.asBoolean());
			}else if (operator.equals("!=")){
				ans = new Symbol(Type.tBOOLEAN, op2.asBoolean() != op1.asBoolean());
			}
    		stack.push(ans);
    	}else if(op1.isString()&&op2.isString()){
    		if (operator.equals("==")){
				ans = new Symbol(Type.tBOOLEAN, op2.asString() == op1.asString());
			}else if (operator.equals("!=")){
				ans = new Symbol(Type.tBOOLEAN, op2.asString() != op1.asString());
			}
    		stack.push(ans);
    	}else if(op1.isChar()&&op2.isChar()){
    		if (operator.equals("==")){
				ans = new Symbol(Type.tBOOLEAN, op2.asChar() == op1.asChar());
			}else if (operator.equals("!=")){
				ans = new Symbol(Type.tBOOLEAN, op2.asChar() != op1.asChar());
			}
    		stack.push(ans);
    	}else{
    		//error expression type mismatch
    		//The operator - is undefined for the argument type(s) java.lang.String, java.lang.String
    		TerminalNode tn = (TerminalNode) ctx.getChild(1);
			String msg = "The operator " + operator +" is undefined for the argument type(s)" + op2 +", "+ op1;
			Main.semanticError(tn.getSymbol(),msg);
    	}
    }
    public void exitRelationalExpr(@NotNull RelationalExprContext ctx) {
    	Symbol op1 = stack.pop();
    	Symbol op2 = stack.pop();
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
    		stack.push(ans);
    	}else{
    		//error expression type mismatch
    		//The operator - is undefined for the argument type(s) java.lang.String, java.lang.String
    		TerminalNode tn = (TerminalNode) ctx.getChild(1);
			String msg = "The operator " + operator +" is undefined for the argument type(s)" + op2 +", "+ op1;
			Main.semanticError(tn.getSymbol(),msg);
    	}
    }
    public void exitMultdivmodExpr(MultdivmodExprContext ctx) {
    	Symbol op1 = stack.pop();
    	Symbol op2 = stack.pop();
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
	    		stack.push(ans);
    		}
    	}else{
    		//error expression type mismatch
    		TerminalNode tn = (TerminalNode) ctx.getChild(1);
			String msg = "The operator " + operator +" is undefined for the argument type(s)" + op2 +", "+ op1;
			Main.semanticError(tn.getSymbol(),msg);
    	}
    }
    
    public void exitAddminusExpr(AddminusExprContext ctx) {
    	Symbol op1 = stack.pop();
    	Symbol op2 = stack.pop();
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
    		stack.push(ans);
    	}else if(op1.isString() && op2.isString() && operator.equals("+")){
    		ans = new Symbol(Type.tSTRING, op2.asString() + op1.asString());
    		stack.push(ans);
    	}else{
    		//error expression type mismatch
    		//The operator - is undefined for the argument type(s) java.lang.String, java.lang.String
    		TerminalNode tn = (TerminalNode) ctx.getChild(1);
			String msg = "The operator " + operator +" is undefined for the argument type(s)" + op2 +", "+ op1;
			Main.semanticError(tn.getSymbol(),msg);
    	}
    }
    public void exitNullExpr(NullExprContext ctx) {
    	Symbol s = new Symbol(Type.tNULL,null);
    	stack.push(s);
    }
    public void exitIdExpr(@NotNull CodeCraftGrammarParser.IdExprContext ctx) {
    	String name = ctx.ID().getSymbol().getText();
        Symbol var = currentScope.resolve(name);
        if ( var==null ) {
            Main.semanticError(ctx.ID().getSymbol(), "no such variable: "+name);
        }else if ( var instanceof FunctionSymbol ) {
        	Main.semanticError(ctx.ID().getSymbol(), name+" is not a variable");
        }else{
        	stack.push(var);
        }
    }
    public void exitIntExpr(IntExprContext ctx) {
    	String valueInString = ctx.IntegerLiteral().getSymbol().getText();
    	Integer valueInInteger = Integer.valueOf(valueInString);
    	Symbol s = new Symbol(Type.tINT,valueInInteger);
    	stack.push(s);
    }
    public void exitFloatExpr(FloatExprContext ctx) {
    	String valueInString = ctx.FloatingPointLiteral().getSymbol().getText();
    	Float valueInFloat = Float.valueOf(valueInString);
    	Symbol s = new Symbol(Type.tFLOAT,valueInFloat);
    	stack.push(s);
    }
    public void exitBoolExpr(BoolExprContext ctx) {
    	String value = ctx.BooleanLiteral().getSymbol().getText();  
    	Symbol s = null;
    	if("true".equals(value)){
    		s = new Symbol(Type.tBOOLEAN,true);
    	}else if("false".equals(value)){
    		s = new Symbol(Type.tBOOLEAN,false);
    	}
    	stack.push(s);
    }
    public void exitStringExpr(StringExprContext ctx) {
    	String value = ctx.StringLiteral().getSymbol().getText();
    	Symbol s;
    	if(value.length()==2){ //String is blank
    		s = new Symbol(Type.tSTRING,"");
    	}else{
    		s = new Symbol(Type.tSTRING,value.substring(1, value.length()-1));
    	}
    	stack.push(s);
    }
    public void exitCharExpr(CharExprContext ctx) {
    	String value = ctx.CharacterLiteral().getSymbol().getText();
    	Symbol s = new Symbol(Type.tCHAR,value.charAt(1));
    	stack.push(s);
    }   
}

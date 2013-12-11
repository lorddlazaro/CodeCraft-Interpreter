package src;
import gen.CodeCraftGrammarLexer;
import gen.CodeCraftGrammarParser;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JTextArea;


import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.gui.TreeViewer;




public class Main {
	static JTextArea ta;
	public static Symbol.Type getType(int tokenType) {
        switch ( tokenType ) {
            case CodeCraftGrammarParser.NULL :  return Symbol.Type.tNULL;
            case CodeCraftGrammarParser.INT :   return Symbol.Type.tINT;
            case CodeCraftGrammarParser.FLOAT : return Symbol.Type.tFLOAT;
            case CodeCraftGrammarParser.DARKNESS : return Symbol.Type.tVOID;
            case CodeCraftGrammarParser.CHAR : return Symbol.Type.tCHAR;
            case CodeCraftGrammarParser.STRING : return Symbol.Type.tSTRING;
            case CodeCraftGrammarParser.BOOLEAN : return Symbol.Type.tBOOLEAN;
            
        }
        return Symbol.Type.tINVALID;
    }

    public static void error(Token t, String msg) {
    	System.out.println("Error Found. Program will not state what kind of error, we just want you to know you " +
    						"made a bad mistake and now we're printing it on your screen");
    	System.out.printf("line %d:%d %s\n", t.getLine(), t.getCharPositionInLine(),
                          msg);
        
        ta.setText(ta.getText() +"\n"+ "line "+  t.getLine() +":"+ t.getCharPositionInLine() + msg + "\n");
    }
    public static void syntaxError(Token t, String msg) {
        System.out.println("Syntax Error Encountered. Thou shout at yourself for your mistake and thou make sudden libre to friends" +
        					" but please do look for the error contained with the corresponding line number and thou fix your wrongs");
    	System.out.printf("line %d:%d %s\n", t.getLine(), t.getCharPositionInLine(),
                          msg);
        
        ta.setText(ta.getText() +"\n"+ "line "+  t.getLine() +":"+ t.getCharPositionInLine() + msg + "\n");
    }
   
    public static void semanticError(Token t, String msg){
    	System.out.println("Semantic Error. Thou feel thy wrath. Semantic error's definition can be found in dictionary but you " +
    						"should probably know that because you are here making a code");
    	System.out.printf("line %d:%d %s\n", t.getLine(), t.getCharPositionInLine(),
                          msg);
        
        ta.setText(ta.getText() +"\n"+ "line "+  t.getLine() +":"+ t.getCharPositionInLine() + msg + "\n");
    }
    
    public static void displayScope(Scope s){
    	System.out.println(s);
    }
    public static void printMsg(String msg){
    	System.out.print(msg);
    }
    public static void debug(String msg){
    	//System.out.println(">:"+msg);
    }
    
	public Main(String code, String[] args,JTextArea ta)throws Exception {
		this.ta =ta;
		String inputFile = "src/sample_code.cc";
        InputStream is=null;
        if ( inputFile!=null ) {
            is = new FileInputStream(inputFile);
        }
        //is = new StringBufferInputStream(code);
        ANTLRInputStream input = new ANTLRInputStream(is);
		CodeCraftGrammarLexer lexer = new CodeCraftGrammarLexer(input);
		CodeCraftGrammarParser parser = new CodeCraftGrammarParser(new CommonTokenStream(lexer));
        parser.setBuildParseTree(true);
        
        ParseTree tree = parser.program();
        List<String> ruleNames = Arrays.asList(parser.getRuleNames());
        TreeViewer tv = new TreeViewer(ruleNames, tree);
        
        DefinePhase visitor = new DefinePhase();
        visitor.visit(tree);
        ReferencePhase visitor2 = new ReferencePhase(visitor.scopes,visitor.globals);
        visitor2.visit(tree);
        
	}
}

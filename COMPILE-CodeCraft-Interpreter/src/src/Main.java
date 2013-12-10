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
     
    	System.out.printf("line %d:%d %s\n", t.getLine(), t.getCharPositionInLine(),
                          msg);
        
        ta.setText(ta.getText() +"\n"+ "line "+  t.getLine() +":"+ t.getCharPositionInLine() + msg + "\n");
    }
    public static void syntaxError(Token t, String msg) {
        
    	System.out.printf("line %d:%d %s\n", t.getLine(), t.getCharPositionInLine(),
                          msg);
        
        ta.setText(ta.getText() +"\n"+ "line "+  t.getLine() +":"+ t.getCharPositionInLine() + msg + "\n");
    }
   
    public static void semanticError(Token t, String msg){

    	System.out.printf("line %d:%d %s\n", t.getLine(), t.getCharPositionInLine(),
                          msg);
        
        ta.setText(ta.getText() +"\n"+ "line "+  t.getLine() +":"+ t.getCharPositionInLine() + msg + "\n");
    }
    
    public static void displayScope(Scope s){
    	System.out.println(s);
    }
    
	public Main(String code, String[] args,JTextArea ta)throws Exception {
		this.ta =ta;
		String inputFile = "src/sample_code.cc";
        InputStream is = System.in;
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
        //tv.
        
        ParseTreeWalker walker = new ParseTreeWalker();
        
        FirstPass def = new FirstPass(ta);
        walker.walk(def, tree);
        // create next phase and feed symbol table info from def to ref phase
        SecondPass ref = new SecondPass(def.globals, def.scopes,ta);
        walker.walk(ref, tree);
	}
}

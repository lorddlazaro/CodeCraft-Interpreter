package src;
	// import ANTLR's runtime libraries
import gen.CodeCraftGrammarLexer;
import gen.CodeCraftGrammarParser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
public class Test {
	
	public static void main(String[] args) throws Exception {
		
		// create a CharStream that reads from standard input
		ANTLRInputStream input = new ANTLRInputStream(System.in);
		
		// create a lexer that feeds off of input CharStream
		CodeCraftGrammarLexer lexer = new CodeCraftGrammarLexer(input);
		
		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		// create a parser that feeds off the tokens buffer
		CodeCraftGrammarParser parser = new CodeCraftGrammarParser(tokens);
		
		ParseTree tree = parser.program(); // begin parsing at init rule
		System.out.println(tree.toStringTree(parser)); // print LISP-style tree
		
		// create a standard ANTLR parse tree walker
		ParseTreeWalker walker = new ParseTreeWalker();
		// create listener then feed to walker
		CodeCraftLoader loader = new CodeCraftLoader();
		walker.walk(loader, tree); // walk parse tree
		System.out.println(loader.SymbolTable); // print results
		
	}
}
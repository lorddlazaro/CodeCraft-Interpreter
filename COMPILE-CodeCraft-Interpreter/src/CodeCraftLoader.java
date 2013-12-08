import java.util.Map;

import org.antlr.v4.misc.OrderedHashMap;
import org.antlr.v4.runtime.misc.NotNull;

import antlr4.CodeCraftGrammarBaseListener;
import antlr4.CodeCraftGrammarParser;


public class CodeCraftLoader extends CodeCraftGrammarBaseListener{

	Map<String,String> SymbolTable = new OrderedHashMap<String, String>();

	@Override
	public void enterProgram(@NotNull CodeCraftGrammarParser.ProgramContext ctx) {
		/*
		String id = ctx.ID().getText(); // prop : ID '=' STRING '\n' ;
		String value = ctx.STRING().getText();
		SymbolTable.put(id, value);
		*/
		//test
	}
	
}

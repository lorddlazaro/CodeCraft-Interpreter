package src;

/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/
/** Represents a variable definition (name,type) in symbol table */
public class VariableSymbol extends Symbol {
	public boolean isConstant = false;
	public int order;
	
    public VariableSymbol(String name, Type type, boolean isConstant,int order) { 
    	super(name, type);
    	this.isConstant = isConstant;
    	this.order = order;
    }
    
    public VariableSymbol (String name, Type type, boolean isConstant)
    {
    	super (name, type);
    	this.isConstant		= 	isConstant;
    }
}

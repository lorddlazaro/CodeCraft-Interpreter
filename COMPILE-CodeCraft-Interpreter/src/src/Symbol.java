package src;

/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/
public class Symbol { // A generic programming language symbol
    public static enum Type {tNULL,tCHAR,tSTRING,tBOOLEAN,tINVALID, tVOID, tINT, tFLOAT}

    String name;      // All symbols at least have a name
    Type type;
    Object value;
    Scope scope;      // All symbols know what scope contains them.

    public Symbol(String name) { this.name = name; }
    public Symbol(String name, Type type) { this(name); this.type = type; }
    public Symbol(Type type, Object value){
    	this.type = type;
    	this.value =value;
    }
    
    public boolean asBoolean(){
    	return (boolean) value;
    }
    public String asString() {
        return (String)value;
    }
    public Integer asInt(){
    	return (Integer)value;
    }
    public Float asFloat(){
    	if(type==type.tINT){
    		Integer n = (Integer)value;
    		return Float.valueOf(((float)n.intValue()));
    	}
    	return (Float)value;
    }
    public Character asChar(){
    	return (Character)value;
    }
    
    public boolean isBoolean(){
    	if(type==Type.tBOOLEAN)
    		return true;
    	return false;
    }
    public boolean isString(){
    	if(type==Type.tSTRING)
    		return true;
    	return false;
    }
    public boolean isInt(){
    	if(type==Type.tINT)
    		return true;
    	return false;
    }
    public boolean isFloat(){
    	if(type==Type.tFLOAT)
    		return true;
    	return false;
    }
    public boolean isChar(){
    	if(type==Type.tCHAR)
    		return true;
    	return false;
    }
    
    public String getName() { return name; }

    public String toString() {
        if ( type!=Type.tINVALID && name !=null) return '<'+getName()+":"+type+'>';
        if( type!=Type.tINVALID )
        	return (""+type).substring(1);
        return getName();
    }
}

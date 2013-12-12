package gen;

import java.util.List;

public class CodeCraftGrammarValue implements Comparable<CodeCraftGrammarValue>
{

	public static final CodeCraftGrammarValue NULL	=	new CodeCraftGrammarValue();
	public static final CodeCraftGrammarValue VOID 	=	new CodeCraftGrammarValue();
	
	private Object value;
	
	private CodeCraftGrammarValue()
	{
		value = new Object();
	}
	
	public CodeCraftGrammarValue(Object obj)
	{
		if(obj == null)
		{
			throw new RuntimeException("obj == null");
		}
		value = obj;
		
		
	}
	
	
	
	
	@Override
	public int compareTo(CodeCraftGrammarValue arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}

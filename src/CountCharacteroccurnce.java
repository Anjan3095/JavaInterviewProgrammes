import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountCharacteroccurnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		findDuplicatewords("java is a java until a java program java");
	}

	private static void findDuplicatewords(String inputstring) {
		// TODO Auto-generated method stub
		
	String words[]=	inputstring.split(" ");
	
	Map<String,Integer> wordcount=new HashMap<String,Integer>();
	
	for(String word:words)
	{
		if(wordcount.containsKey(word))
		{
			wordcount.put(word.toLowerCase(), wordcount.get(word)+1);
		}
		else
		{
			wordcount.put(word,1);
		}
	}
	
	Set<String> wordstring=wordcount.keySet();
	for(String word:wordstring)
	{
		if(wordcount.get(word)>1)
		{
			System.out.println(word + " : "+ wordcount.get(word));
		}
	}
	
	}

}

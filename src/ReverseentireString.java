
public class ReverseentireString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		
		String str="Welcome To Home"; //original String
	String words[]=	str.split(" ");
	
	String reversestring="";
	for(String word:words)
	{
		String reverseword="";
		
		for(int i=word.length()-1;i>=0;i--)
		{
			reverseword=reverseword+word.charAt(i);
		}
		reversestring=reversestring+reverseword+" ";
	}
		System.out.println(reversestring);
		
		
	}*/
String 	parameter="";
String s="Bharath";
for(int i=s.length()-1;i>=0;i--)
{
	parameter=parameter+s.charAt(i);

}
System.out.println(parameter);
}
}


public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="DAD";
		String t= "";
		for(int i=s.length()-1;i>=0;i--)
		{
			t=t+s.charAt(i);
		}
		System.out.println(t);
		if(s.equals(t))
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}

}

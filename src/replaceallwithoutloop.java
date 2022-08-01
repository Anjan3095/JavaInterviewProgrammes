
public class replaceallwithoutloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Bharath";
		
		String s="i";
		
		s=s.replaceAll("i", "iiiiiiiiii");
		s=s.replaceAll("i","iiiiiiiiii");
		s=s.replaceAll("i", name+"\n");
		System.out.println(s);
	}

}

import java.util.ArrayList;
import java.util.Arrays;

public class evenandodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * This is the program to find
		 * out even number and odd number
		 * by using Java 8 streams concept
		 * 
		 * 
		 * 
		 */
		ArrayList<Integer> numbers= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		numbers.removeIf(num -> num%2 == 0);
		System.out.println(numbers);
		
		ArrayList<Integer> numbers1= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		numbers1.removeIf(num -> num%2 != 0);
		System.out.println(numbers1);
	}

}

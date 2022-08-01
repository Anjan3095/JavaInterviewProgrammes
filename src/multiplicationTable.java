//Print 5 multiplication table without using multiply operator
public class multiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result=multiply(5,10);
		System.out.println(result);
	}

	private static int multiply(int i, int j) {
		// TODO Auto-generated method stub
		
		//I has to sum itself j times to get result
		int sum=0;
		//int k=1;
		/*
		 * while(k<=j) { sum=sum+i; k++; }
		 */
		for(int k=1;k<=j;k++)
		{
			sum=sum+i;
		}
		
		return sum;
	}

}

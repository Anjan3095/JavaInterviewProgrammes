import java.util.Scanner;

public class swappingIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*System.out.println("Enter the values of X and Y");
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int Y=sc.nextInt();
		
		System.out.println("Before swapping of two numbers"+X +" "+Y);
		//x=10 y=20
		X=X+Y;//X=30
		Y=X-Y;//Y=30-20=10
		X=X-Y;//X=30-10=20
		System.out.println("After swapping "+X +" "+Y);*/
		
		int x=10;
		int y=20;
		
		/*x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swapping"+ x+ " "+y);*/
		
		/*x=x*y;
		 * y=x/y;
		 * x=x/y;
		 */
		
		//using XoR operator:
		/*	x=x ^ y;
			y=x ^ y;
			x=x ^ y;
			System.out.println("After swapping " + x+ " "+y);*/
		
		String a="Hello";
		String b="World";
		
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("After swapping "+ a+ " "+ b);
	}

}

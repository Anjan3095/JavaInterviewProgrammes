
public class maxValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * int abc[][]= {{2,4,5},{5,9,1},{4,5,10}};
		 * 
		 * int min=abc[0][0];
		 * 
		 * for(int i=0;i<3;i++) { for(int j=0;j<3;j++) { if(abc[i][j]<min) {
		 * min=abc[i][j]; } } } System.out.println(min);
		 */
		
		int a[][]= {{1,3,5},{2,4,7},{4,7,9}};
		int max=a[0][0];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][i]>max)
				{
					max=a[i][j];
					
				}
			}
		}
		System.out.println(max);
	}

}

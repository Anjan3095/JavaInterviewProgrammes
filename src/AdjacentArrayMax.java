//Maximum difference between any adjacent index in array
public class AdjacentArrayMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {1,4,8,15,17};//3,4,7,2
		int diff=0;//This difference variable is used to hold the previous iteration value.
		for(int i=0;i<a.length-1;i++)
		{
			
			if(a[i+1]-a[i]>diff)
			{
				diff=a[i+1]-a[i];
			}
	
		}
		System.out.println(diff);
	}

}

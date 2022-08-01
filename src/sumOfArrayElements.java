//Create a method which accepts Array and returns sum of all the elements in array

public class sumOfArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] a = {1,2,3,4,5};
	      // int sum=sumArray(a);
	       //System.out.println(sum);
		
		int sum=0;
		int[] a = {1,2,3,4,5};
	//Here in for loop we are extracting every value of array and sum each value with other
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		}
	}




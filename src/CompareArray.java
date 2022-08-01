import java.util.ArrayList;

//Compare same indexes of 2 different arrays and create another array for matching values.
public class CompareArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,4,6,8};
		int b[]= {2,4,7,8};
		ArrayList<Integer> a1=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
		    if(a[i]==b[i])
		    {
		    	a1.add(a[i]);
		    }
		}
	Object[] c=	a1.toArray();
	for(Object c1:c)
	{
		System.out.println(c1);
	}
	}

}

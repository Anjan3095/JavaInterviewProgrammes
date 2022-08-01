import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class sortAscending {

	
	public static void main(String[] args)
	{

int a[]= {1,5,6,7,3,4};

int temp=0;

for(int i=0;i<a.length;i++)
{
	for(int j=i+1;j<a.length;j++)
	{
		if(a[i]>a[j])
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
		}
		
	}
}
for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]);
}
}
}
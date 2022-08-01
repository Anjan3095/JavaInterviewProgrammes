
public class fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int a=0;
int b=1;
int sum=0;
int k=1;

while(k<=9)
{
	sum=a+b;
	System.out.println(sum);
	a=b;
	b=sum;
	k++;
}
}
}
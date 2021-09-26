import java.util.*;
class fibanoci
{
	public static void main(String args[])
	{
		int a,b,c,n,i;
	Scanner s1=new Scanner(System.in);
	System.out.println("enter fibanoci series upto given limit");
	n=s1.nextInt();
	a=0;
	b=1;
	System.out.print("Fibonacci Series is:\n "+ a+ "\t " + b);
	for(i=3;i<=n;i++)
	{
		c=a+b;
		System.out.print("\t" +c);
	a=b;
	b=c;
}

	}
}
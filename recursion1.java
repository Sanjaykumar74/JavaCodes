import java.util.*;
class recursion1
{
	public static int fib(int n)
	{
		if(n==0||n==1)
			return n;
		else
			return(fib(n-1)+fib(n-2));
	}
	public static void main(String args[])
	{
		int i,n,f;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter any number");
		n=s1.nextInt();
		for(i=0;i<n;i++)
		{
		f=fib(i);
		System.out.print( "\t"+f);
	}
 }
}
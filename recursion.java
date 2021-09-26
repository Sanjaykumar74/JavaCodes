import java.util.*;
class recursion
{
	public static int factorial(int n)
	{
		if(n==0)
			return 1;
		else
			return(n*factorial(n-1));
	}
	public static void main(String args[])
	{
		int n,f;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter any number");
		n=s1.nextInt();
		f=factorial(n);
		System.out.println("factorial "+f);
	}
}
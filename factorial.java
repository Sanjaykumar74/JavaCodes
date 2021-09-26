import java.util.*;
class factorial
{
	public static void main(String args[])
	{
	 Scanner s1=new Scanner(System.in);
	 int i,n,fact=1;
	 System.out.println("enter number");
	 n=s1.nextInt();
	 for(i=1;i<=n;i++)
	 {
	 	fact=fact*i;
	 }
	 System.out.println("factorial "+fact);
	}
}


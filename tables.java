import java.util.*;
class tables
{
	public static void main(String []args)
	{
	Scanner s1=new Scanner(System.in);
	int n,i,r;
	System.out.println("enter number");
	n=s1.nextInt();
	System.out.println("enter a number of tables ");
	for(i=1;i<=10;i++)
	{ 
	r=n*i;
	System.out.println(n + "*" + i + "=" +r);
   }
	}
}
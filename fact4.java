import java.util.*;
class fact4
{
    public static void fact(int z)
	{
		int i,fa=1;
		for (i=1;i<=z;i++)
		{
	 		fa=fa*i;
		}
		System.out.println("factorial=  "+fa);
    }

	public static void main(String args[])
	{	
	int n;
	Scanner s1=new Scanner(System.in);
	System.out.println("enter number: ");
	n=s1.nextInt();
	fact(n);
	}
}
import java.util.*;
class fact3
{
    public static int fact(int z)
	{
		int i,f=1;
		for (i=1;i<=z;i++)
		{
	 		f=f*i;
		}
		return f;
    }

	public static void main(String args[])
	{	
	int n,c;
	Scanner s1=new Scanner(System.in);
	System.out.println("enter number: ");
	n=s1.nextInt();
	c=fact(n);
	System.out.println("factorial=  "+c);
	}
}																																																															
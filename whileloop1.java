import java.util.*;
class whileloop1
{
	public static void main(String args[])
	{
		int i,n,fact=1;
		i=1;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the  number ");
		n=s1.nextInt();
        while(i<=n)
		{
			fact=fact*i;
			i++;
			
		}
		  System.out.println("factorial :  "+fact);
			  
	}
}
import java.util.*;
class prime
{
	public static void main(String args[])
	{
	 Scanner s1=new Scanner(System.in);
	 int i,n;
	 System.out.println("Enter any number ");
	 n=s1.nextInt();
	 
	 for(i=2;i<n;i++)
	 {
	 	if(n%i==0)
	 	{
	 		System.out.println(n+ " is not a prime number ");
	 		break;
	 	}
	 }
	 //check for prime number //
	if(i==n)
	System.out.println(n+ " is a prime number"); 
 }
}
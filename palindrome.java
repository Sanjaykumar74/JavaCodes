import java.util.*;
class palindrome
{
	public static void main(String ars[])
	{
	  Scanner s1=new Scanner(System.in);
	  int i,rem,n,sum=0;
	  System.out.println("Enter number ");
	  n=s1.nextInt();
	  for(i=n;i>0;i=i/10)
	  {
	  	rem=i%10;
	  	sum=(sum*10)+rem;
		}
	  	 if(sum==n)
	     	System.out.println(n+ "it is a palindrome");
	     else  
	      System.out.println(n+ "it is not a palindrome");
	}
}
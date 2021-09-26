import java.util.*;
class leap
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		int n;
		System.out.println("enter number ");
		n=s1.nextInt();
		if ((n%4==0) &&  (n%100!=0))
		{
			System.out.println(" leap year ");
		}
		else
			System.out.println("not a leap year ");
	}
}
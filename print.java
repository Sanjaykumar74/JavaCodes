import java.util.*;
class print
{
	public static void main(String args[])
	{
	int n;
	Scanner s1=new Scanner(System.in);
	System.out.println("enter 1,2 or 3");
	n=s1.nextInt();

	switch (n)
	{
	   case 1:System.out.println("one");
             break;
       case 2:System.out.println("two");
             break;
       case 3:System.out.println("three");
             break;
       default:System.out.println("wrong value");

       }
    }
}

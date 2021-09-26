import java.util.*;
class linearsreach
{
	public static void main(String args[])
	{
	Scanner s1=new Scanner(System.in);
	int n;
	System.out.println("Enter the size of the array: ");
	n=s1.nextInt();
	int a[]=new int[n];
	int i;
	System.out.println("enter elements in array");
	for(i=0;i<n;i++)
	{
	 a[i]=s1.nextInt();
	}
	 int item;
	 System.out.println("enter the element who want to sreach");
	 item=s1.nextInt();
	for(i=0;i<n;i++)
	{
	 	if(item==a[i])
		{
		 	System.out.println(item + " is present in "+i+" index position");
		 	break;
	 	}
	}
	if(i==n)
		System.out.println(item + " does not exist in the list");
	
	}
}
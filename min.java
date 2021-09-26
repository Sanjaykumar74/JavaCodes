import java.util.*;
class min
{
	public static void main(String args[])
	{
	int a[]=new int[5];
	Scanner s1=new Scanner(System.in);
	int i;
	System.out.println("enter 5 elements in array");
	for(i=0;i<=4;i++)
	{
	 a[i]=s1.nextInt();
	}
	int min=a[0];
	for(i=0;i<=4;i++)
	{
	 if(min>a[i])
	  min=a[i];
	  
	}
	System.out.println("min is "+min);
	}
}
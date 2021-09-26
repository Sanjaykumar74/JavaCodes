import java.util.*;
class max1
{
	public static void main(String args[])
	{
	int a[]=new int[5];
	Scanner s1=new Scanner(System.in);
	int i;
	System.out.println("enter 5 elements in array ");
	for(i=0;i<=4;i++)
	 {
      a[i]=s1.nextInt();
     }
     int max=a[0];
      for(i=0;i<=4;i++)
      {
      	if(max<a[i])
      	max=a[i];
      }
      System.out.println("max is "+max);
	
	}
}
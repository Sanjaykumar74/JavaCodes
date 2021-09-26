import java .util.*;
class mreverseorder
{
	public static void main(String args[])
	{
	int a[]=new int [5];
	int i;
	Scanner s1=new Scanner(System.in);
	System.out.println("enter any 5 elements in the array:");
	for(i=0;i<5;i++)
	{
       a[i]=s1.nextInt();

	} 
	System.out.println("elements in the array : \n index \tvalue");
	for(i=0;i<5;i++)
	{
		System.out.println(i+ "\t" +a[i]);
		
       }
       System.out.println("elements in the array are reverse order : \n index \tvalue");
       for(i=4;i>=0;i--)
       {
       	System.out.println(i+  "\t" +a[i]);
       }
	}

}
import java .util.*;
class sum3
{
	public static void main(String args[])
	{
	int a[]=new int [5];
	int i,sum=0,avg;
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
		sum=sum+a[i];
		
       }
      avg=sum/5;
      System.out.println("sum of the array: " +sum + " avarage= " +avg);
      
	}

}
import java.util.*;
class bubblesort
{
	public static void main(String args[])
	{
	Scanner s1=new Scanner(System.in);
	int n;
	System.out.println("Enter the size of the array: ");
	n=s1.nextInt();
	int a[]=new int[n];
	int i,j;
	System.out.println("enter elements in array");
	for(i=0;i<n;i++)
	{
	 a[i]=s1.nextInt();
	}
	int temp;
	for(i=0;i<n;i++)

	{
		for(j=0;j<n-i-1;j++)
		{
			if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	System.out.println("elements is sorted order are");
	for(i=0;i<n;i++)
	{
    System.out.println(i+  "\t" +a[i]);  
	}

  }
}
 
 import java.util.*;
 class binarysreach
 {
 	public static void main(String args[])
 	{
 		Scanner s1=new Scanner(System.in);
 		int n;
	    System.out.println("Enter the size of the array: ");
	    n=s1.nextInt();
	    int a[]=new int[n];
	    int beg,end,mid,item,i;
	    System.out.println("enter elements in array");
	    for(i=0;i<n;i++)
	    {
	    	a[i]=s1.nextInt();
	    }
	    System.out.println("Enter the element you want to search: ");
	    item=s1.nextInt();
	    beg=0;
	    end=n-1;
	    while(beg<=end)
	     {
	     	mid=(beg+end)/2;

	     	if(a[mid]==item)
	     	{
	     		System.out.println(item+ "is found at location "+mid);
	     	     break;
	     	}
	     
	     else if(a[mid]<item)
	     	beg=mid+1;
	     else
	     	end=mid-1;
	 }
	 
	    if(beg>end)
        System.out.println(item+" does not exist");
 	}
 }
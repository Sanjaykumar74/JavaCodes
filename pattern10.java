import java.util.*;
class pattern10
{
	public static void main(String args[])
	{
	int i,j,k;
	System.out.println("pattern10: ");
	for(i=1;i<=5;i++)
	{
		for(j=5;j>=i;j--)
		{
			System.out.print(" ");
		  }
	       for(k=i;k>=1;k--)
           {
           System.out.print(k);
	     }
	       System.out.println();
	     
        }
 }

}
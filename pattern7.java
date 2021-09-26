import java.util.*;
class pattern7
{
	public static void main(String args[])
	{
	int i,j,k;
	System.out.println("pattern7: ");
	for(i=1;i<=5;i++)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print(" ");
		  }
	       for(k=5;k>=i;k--)
           {
           System.out.print(k);
	     }
	       System.out.println();
	     
        }
 }

}
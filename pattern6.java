import java.util.*;
class pattern6
{
	public static void main(String args[])
	{
	int i,j,k;
	System.out.println("pattern6: ");
	for(i=5;i>=1;i--)
	{
		for(j=5;j>=i;j--)
		{
			System.out.print(" ");
		  }
	       for(k=1;k<=i;k++)
           {
           System.out.print(k);
	     }
	       System.out.println();
	     
        }
 }

}
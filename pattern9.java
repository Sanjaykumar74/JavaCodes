import java.util.*;
class pattern9
{
	public static void main(String args[])
	{
	int i,j,k;
	System.out.println("pattern9: ");
	for(i=1;i<=5;i++)
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
import java.util.*;
class prime2
{
	public static void main(String args[])
	{
	int i,j;
	System.out.println("enter prime number 1 to 100: ");
	for(i=1;i<=100;i++)
	{
	   for(j=2;j<i;j++)
       {
       	if(i%j==0)
         break;  
	  }
	  if(i==j)
	  System.out.print("\t" +i);
 }

  }
}
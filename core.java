import java.util.*;
class core
{
	public static void main(String args[])
	{ 
		
	Scanner s1= new Scanner(System.in);
	int r,c;
    System.out.println("Enter the  number of rows in the matrix ");  
    r=s1.nextInt();
    System.out.println("Enter the number of colms in the matrix ");
    c=s1.nextInt();
    int matrix[][]= new int[r][c];
    int i,j;
    System.out.println("Enter the elements of the matrix");
    for(i=0;i<r;i++)
    {
    	for(j=0;j<c;j++)
    	{
         matrix[i][j]=s1.nextInt();
       }
    }
 
  // System.out.println("Enter the element of the matix");
  /* for(i=0;i<r;i++)
   {
   	for (j=0;j<c;j++)
   	*/
   //	System.out.print("\t"+matrix[i][j]);
  
   	
   System.out.println("\t"+matrix[i][j]);
    
  }
  
}

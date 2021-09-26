import java.util.*;
class summatrix
{
	public static void main(String args[])
	{
	Scanner s1=new Scanner(System.in);
	int r,c;
	System.out.println("enter the numbers of rows and cols in the first matrix");
	r=s1.nextInt();
	c=s1.nextInt();
	int matrix[][]=new int[r][c];
	int matrix2[][]=new int[r][c];
	int matrix3[][]=new int[r][c];
	int i,j;
	System.out.println("enter the elements of the  first matrix");
	for(i=0;i<r;i++)  
	{
		for(j=0;j<c;j++)
		{
			matrix[i][j]=s1.nextInt();
		}
	}
	System.out.println("ELements in the first matris are: \n");
         for(i=0;i<r;i++)  
	    {
		  for(j=0;j<c;j++)
		{
	
			System.out.print("\t" +matrix[i][j]);
		}
	    System.out.println();
	}
	System.out.println("enter the elements of the second matrix");
	for(i=0;i<r;i++)  
	{
		for(j=0;j<c;j++)
		{
			matrix2[i][j]=s1.nextInt();
		}
	}
		System.out.println("ELements in the Second matrix are: \n");
          for(i=0;i<r;i++)  
	     {
		  for(j=0;j<c;j++)
		 {
			System.out.print("\t" +matrix2[i][j]);
		}
		System.out.println();
	}
	System.out.println(" elements of the third matrix");
	for(i=0;i<r;i++)  
	{
		for(j=0;j<c;j++)
		{
		matrix3[i][j]=matrix[i][j]+matrix2[i][j];
		}
	}
	System.out.println("sum of matrixs:");
	for(i=0;i<r;i++)  
	{
		for(j=0;j<c;j++)
		{
			System.out.print("\t" +matrix3[i][j]);
		}
		System.out.println();
	}
	}
}
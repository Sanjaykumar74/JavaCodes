import java.util.*;
class matrix
{
	public static void main(String args[])
	{
		
	Scanner s1=new Scanner(System.in);
	int r,c;
	System.out.println("enter the numbers of rows in the matrix");
	r=s1.nextInt();
	System.out.println("enter the numbers of cols in the matrix");
	c=s1.nextInt();
    int matrix[][]= new int[r][c];
	int i,j;
	System.out.println("enter the elements of the matrix");
	for(i=0;i<r;i++)  
	{
		for(j=0;j<c;j++)
		{
			matrix[i][j]=s1.nextInt();
		}
	}
	System.out.println("enter the elements of the matrix");
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			System.out.print("\t" +matrix[i][j]);
		}
		System.out.println();
	 }
	}
}


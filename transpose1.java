import java.util.*;
class transpose1
{
	public static void main(String args[])
	{
	Scanner s1=new Scanner(System.in);
	int r,c;
	System.out.println("enter the numbers of rows in the matrix");
	r=s1.nextInt();
	System.out.println("enter the numbers of cols in the matrix");
	c=s1.nextInt();
	int matrix[][]=new int[r][c];
	int i,j;
	System.out.println("enter the elements of the matrix");
	for(i=0;i<r;i++)  
	{
		for(j=0;j<c;j++)
		{
			matrix[i][j]=s1.nextInt();
		}
	}
	    System.out.println("matrix at the given number is :");
    for(i=0;i<r;i++)  
	{
		for(j=0;j<c;j++)
		{
			System.out.print("\t"+matrix[i][j]);
		}
		System.out.println();
	}
	int transpose[][]=new int[c][r];
	for(i=0;i<r;i++)  
	{
		for(j=0;j<c;j++)
		{
			transpose[j][i]=matrix[i][j];
		}
	}
    System.out.println("transpose at the given number is :");
    for(i=0;i<c;i++)  
	{
		for(j=0;j<r;j++)
		{
			System.out.print("\t"+transpose[i][j]);
		}
		System.out.println();
	}
}

}
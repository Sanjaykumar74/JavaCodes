import java.util.*;
class test3
{
	public static void search(int b[])
	{
        int i;
		for(i=0;i<5;i++)
		{
			System.out.print(b[i]);
		}
	}
	public static void main(String args[])
	{
        int i;
		int[]a=new int[5];
		Scanner s1=new Scanner(System.in);
		for(i=0;i<5;i++)
		{
			a[i]=s1.nextInt();
		}
		search(a);
	} 

}
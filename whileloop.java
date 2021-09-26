import java.util.*;
class whileloop
{
	public static void main(String args[])
	{
		int i,n,r;
		i=1;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter any number ");
		n=s1.nextInt();
        while(i<=10)
		{
			r=n*i;
			System.out.println(n+ "*" +i+ "=" +r);
			 i++;
		}
	}
}
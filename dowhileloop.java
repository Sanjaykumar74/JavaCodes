import java.util.*;
class dowhileloop
{
	public static void main(String args[])
	{
		int i,n,r;
		i=1;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter any number ");
		n=s1.nextInt();
        do
		{
			r=n*i;
			System.out.println(n+ "*" +i+ "=" +r);
			 i++;
		}
		while(i<=10);
	}
}
//return type
import java.util.*;
class ReturnType
{
	public static int add(int x,int y)//int is the return type of the function, this func will return an int data
	{
		int z;
		z=x+y;
//		System.out.println("SUm = "+z);
		return z; //return statement is used to return the output to the callinf function such as main
		//return 0;
		//only 1 value can be returned from the function.
	}
	public static void main(String args[])
	{
		int a,b,c;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter 2 nmbers a and b:");
		a=s1.nextInt();
		b=s1.nextInt();
		c=add(a,b);	//c will get the result of add
		System.out.println("Sum of 2 numbers  ="+ c);
		//add(a,b); will not work as the result passed by add, is not used
		//System.out.println("Sum of 2 numbers="+ add(a,b));
	}
}
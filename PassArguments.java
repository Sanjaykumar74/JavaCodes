//program to pass the arguments to a function
import java.util.*;
class PassArguments
{
	//data type of arguments, number of arguments of call as well as defintion should match

	//number of arguments -> number of input variables required in the program
	public static void add(int x, int y)
	{
		int c;
//		a=10;
//		b=20;
		c=x+y;
		System.out.println("SUm of 2 numbers = "+ c);
	//		System.out.println(a);, varaibles of other function cannot be accessed in other functions

	}
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		int a,b;
		System.out.println("Enter the value of a and b: ");
		a=s1.nextInt();
		b=s1.nextInt();
		//number of parameters in the call should match with number of arguments in the definition.
		add(a,b); //a and b are arguments that are passed to the add function.
		add(9,8);

	}
}
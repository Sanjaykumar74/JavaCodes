class Testfunctions
{
//	static void add();//declaration
	//no return type since void is used.
	//() no arguments are used
	static void add()//definition of the function
	{
		int a,b,c;
		a=10;
		b=20;
		c=a+b;
		System.out.println("Value of a = "+a);
		System.out.println("Value of b = "+b);
		System.out.println("Sum of a and b = "+c);		
	}
	static void sub()
	{
		int a,b,c;
		a=10;
		b=20;
		c=a-b;
		System.out.println("Value of a = "+a);
		System.out.println("Value of b = "+b);
		System.out.println("Subtract of a and b = "+c);			
	}
	public static void main(String args[])
	{
		//calling of the function
		add();	//funciton name and arguments. no return type is mentioned
		sub();
	}
}
class swap1
{
	public static void main(String args[])
	{
	 int a,b;
	 a=30;
	 b=15;
	 System.out.println("Before swapping:");
	 System.out.println("a = "+a+" b = "+b);
	 a=a+b;
	 b=a-b;
	 a=a-b;
	 System.out.println("After swapping:");
	 System.out.println("a = "+a+" b = "+b);
}

}
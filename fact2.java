class fact2
{
	static void factorial()
	{
		int i=1,n=5,fact=1;
		for (i=1;i<=3;i++)
	    {
	     fact=fact*i;
        }
	    System.out.println("factorial=  "+fact);

	  }
	  static void fibanoci()
	  {
	  	int a,b,c,i,n;
	  	a=0;
	    b=1;
	    n=5;
	    System.out.print("Fibonacci Series is:\n "+ a+ "\t " + b);
	    for(i=3;i<=5;i++)
	   {
		c=a+b;
		System.out.print("\t" +c);
	    a=b;
	    b=c;
        }
	  }
	   public static void main(String args[])
	 {
		factorial();
		fibanoci();

	}
}
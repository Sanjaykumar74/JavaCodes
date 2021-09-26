import java.util.*;
class ab
{
	public static void table(int x)
	{
       int i,r;
       for(i=1;i<=10;i++)
	   { 
	    r=x*i;
	   System.out.println(r);
	   }

	}
	public static int factorial(int x)
	{
      int i,fa=1;
		for (i=1;i<=x;i++)
		{
	 		fa=fa*i;
		}
		return fa;
    
	}
	public static void fibonacci(int x)
	{
		int a,b,c,i;
		a=0;
	    b=1;
	    System.out.print("Fibonacci Series is:\n "+ a+ "\t " + b);
	    for(i=3;i<=x;i++)
	{
		c=a+b;
		System.out.print("\t" +c);
	    a=b;
	    b=c;
 
       }
 	} 
 	public static void prime(int x)
 	{
 		int i,j;
 	    for(i=1;i<=x;i++)
	   {
	     for(j=2;j<i;j++)
         {
       	   if(i%j==0)
           break;  
	     }
	       if(i==j)
	       System.out.print("\t" +i);

          }
 	  }
 	 
}
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		int n,x,c;
		while(true)
		{
        System.out.println("press 1 to Multiplication table");
		System.out.println("press 2 to factorial");
		System.out.println("press 3 to fibonacci");
		System.out.println("press 4 to prime");
		System.out.println("press 5 to exit");
		System.out.println("enter your choice");
	    n=s1.nextInt();
	    switch(n)
	    {
	    	case 1:
	    	System.out.println("Enter any number : ");
	    	x=s1.nextInt();
	    		table(x);
	    		break;
	    	case 2:
	    	System.out.println("enter any number");
	    	x=s1.nextInt();
	    	c=factorial(x);
	    	System.out.println("factorial=  "+c);
	    	   break;
	    	case 3:
	    	System.out.println("enter any number");
	    	x=s1.nextInt();
	    	    fibonacci(x);
	    	    break;
	    	case 4:
	    	System.out.println("enter any number");
	    	x=s1.nextInt();
	    	    prime(x);
	    	    break;
	    	case 5:
			    	System.exit(0);
			default:
			System.out.println("Invalid choice:");
	    }
		}
	}


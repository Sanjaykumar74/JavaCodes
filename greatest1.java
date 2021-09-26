import java.util.*;
class greatest1
{
	public static void main(String args[])
	{
	Scanner s1=new Scanner(System.in);
	int a,b,c;
	System.out.println("enter 3 number a,b and c ");
	a=s1.nextInt(); 
	b=s1.nextInt();
	c=s1.nextInt();
	if(a>b)
    {
    	if(a>c) 
   			System.out.println("greatest of a ");
  	   else
  	    System.out.println("greatest of c ");
  }
  else
  {
  		if(b>c)
	System.out.println("greatest of b");
else
	System.out.println("greatest of c");

}

}
}
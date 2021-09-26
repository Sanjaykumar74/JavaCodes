import java.util.*;
class bill
{
	public static void main(String args[])
	{
	Scanner s1=new Scanner(System.in);
	int price=0,qty,totalbill,n;
	System.out.println("customer menu");
	System.out.println("press 1 for pizza");
	System.out.println("press 2 for burger");
	System.out.println("press 3 for noodles");
	System.out.println("press 4 for hot dogs");
	System.out.println("enter your choice");
	n=s1.nextInt();
	switch(n)
	{
		case 1:
			price=5;
			break;
		case 2:
		     price=7;
		    break;
		case 3:
		     price=4;
		    break;
		case 4:
		     price=9;
		    break;
		default:
			System.out.println("invalid input");
	}//end of switch
	System.out.println("The Price = "+price+"$");
	System.out.println("Enter Number of items to order: ");
	qty=s1.nextInt();
	totalbill=qty*price;
   System.out.println("Your Total Bill = "+totalbill +"$");	
	}//end of main
}//end of class

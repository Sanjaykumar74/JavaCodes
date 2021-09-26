import java.util.*;
class simpleCalculator
{
	public static void main(String args[])
	{
	Scanner s1=new Scanner(System.in);
	int a,b;
	System.out.println("enter 2 number a and b ");
	a=s1.nextInt();
	b=s1.nextInt();
	System.out.println("press 1 for +");
	System.out.println("press 2 for -");
	System.out.println("press 3 for *");
	System.out.println("press 4 for /");
	System.out.println("press 5 for exit");
	System.out.println("Enter your choice:");
	int n=s1.nextInt();
	 switch(n)
	 { 
	 	
        case 1:
        	System.out.println("enter number a,b "+ (a+b));
	 		break;
	 	case 2:
	 		System.out.println("enter number a,b " + (a-b));
	 		break;
	    case 3:
	    	System.out.println("enter number a,b " + (a*b));
	 		break;
	 	case 4:
	 		System.out.println("enter number a,b " + (a/b));
	 		break;
	 	case 5:
	 		System.exit(0);
	 	default:
	 	System.out.println("Invalid option. Try again: "); 	
	 }
	}
}
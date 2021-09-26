import java.util.*;
class Bank1
{
	int accountno;
	double balance,deposit,withdraw;
	String name;
	Scanner s1=new Scanner(System.in);
	void get()
	{
		Random random = new Random();
		accountno = random.nextInt(100-10)+10;
		System.out.println("\n Welcome:  Your account no is : "+accountno);
		System.out.println("enter name & balance of the customer ");
		name=s1.nextLine();
		balance=s1.nextDouble();
	}
	void show()
	{
		System.out.println(accountno+ "\t" +name+ "\t" +balance);
	}
	 void deposit()
    {
     System.out.println("enter the deposit amount");
     deposit=s1.nextInt();
     balance=balance+deposit;
     System.out.println("deposit amount of the customer "+deposit);
    }
    void withdraw()
    {
    System.out.println("enter the withdraw amount");
    withdraw=s1.nextInt();
    balance=balance-withdraw;	
    System.out.println("withdraw amount of the customer "+withdraw);
    }
}
class bankpractice2
{
	public static void main(String args[])
	{
		 Scanner s1=new Scanner(System.in);
		 Bank1 b[] = new Bank1[100];
		 int choice;
		 int count=0,i;	 
		 while(true)
		 {
			System.out.println("press 1 to create new account: ");
			System.out.println("press 2 to display All accounts:");
			System.out.println("press 3 to display Individual accounts:");
			System.out.println("press 4 to deposit amount");
			System.out.println("press 5 to withdraw amount");
			System.out.println("press 6 to exit");
			System.out.println("enter your choice");
			choice=s1.nextInt();
			switch(choice)
			{
			case 1:
					b[count] = new Bank1();
					b[count].get();
					count++;
					break;
    		case 2:
	     			System.out.println("bank details are: \n");
         			System.out.println("accountno \t name \t balance");
         			for(i=0;i<count;i++)
         			{
           				b[i].show();
         			}
        			break;  
          case 3:
              int item;
	          System.out.println("enter your account number ");
	          item=s1.nextInt();
	          for(i=0;i<=count;i++)
              { 
	           if(b[i].accountno==item)
	           {
	       	    System.out.println("Welcome.. Your Details are: ");
	       	    b[i].show();
		 	    break;
	 	       }
	 	       if(i>count)
			 System.out.println(item + " is not present in the bank");	  
        }
        break;
	case 4:
	    System.out.println("enter your Account no");
	    item=s1.nextInt();
	     for(i=0;i<=count;i++)
         { 
	      if(b[i].accountno==item)
	       {
	       	System.out.println("Welcome.. Your Details are: ");  
		    b[i].show();
		    b[i].deposit();
		    break;
		}
		 if(i>count)
			 System.out.println(item + " is not present in the bank");	
	    }
	    break;
	case 5:
	    System.out.println("enterYour Account No:");
	    item=s1.nextInt();
	     for(i=0;i<=count;i++)
         { 
	      if(b[i].accountno==item)
	       {
	       	System.out.println("Welcome.. Your Details are: ");
	       	b[i].show();  
		    b[i].withdraw();
		    break;
		 }
		  if(i>count)
			 System.out.println(item + " is not present in the bank");	
	  }
	  break;   
	case 6:
		System.exit(0);
	default:
	System.out.println("Invalid choice:");
	
	}
  }
	}
}
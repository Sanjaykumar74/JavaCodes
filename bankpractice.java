import java.util.*;
class Bank
{
	int accountno;
	double balance,deposit,withdraw;
	String name;
	Scanner s1=new Scanner(System.in);
	void get()
	{
	System.out.println("enter name ,accountno and balance of the customer");
	name=s1.nextLine();
	accountno=s1.nextInt();
	balance=s1.nextDouble();
	}
	void show()
	{ 

      System.out.println("name of the customer "+name);
      System.out.println("balance of the customer "+balance);
      System.out.println("accountno of the customer "+accountno);
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

class bankpractice
{
	public static void main(String args[])
	{
     
     int choice;
     Scanner s1=new Scanner(System.in);
     Bank b1=new Bank();
     while(true)
     {
	System.out.println("press 1 to create new account");
	System.out.println("press 2 to display account");
	System.out.println("press 3 to deposit amount");
	System.out.println("press 4 to withdraw amount");
	System.out.println("press 5 to exit");
	System.out.println("enter your choice");
	choice=s1.nextInt();
	switch(choice)
	{
	case 1:
	b1.get();
	break;
	case 2:
	b1.show();
	break;
	case 3:
	b1.deposit();
	break;
	case 4:
    b1.withdraw();
	break;
	case 5:
	System.exit(0);
	default:
	System.out.println("Invalid choice:");
	
	}
  }
 }
}
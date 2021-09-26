import java.util.*;
class Bank
{
	int accountno;
	double balance;
	String name;
	Scanner s1=new Scanner(System.in);
	void get()
	{
	System.out.println("enter name ,accountno and balance of the customer");
	name=s1.nextLine();
	balance=s1.nextDouble();
	accountno=s1.nextInt();
	}
	void show()
	{
	System.out.println("name of the customer "+name);
	System.out.println("balance of the customer "+balance);
	System.out.println("accountno of the customer "+accountno);
	}
}
	class employee1
	{
	public static void main(String args[])
	{
     Bank b1=new Bank();
     b1.get();
     b1.show();
	}
} 

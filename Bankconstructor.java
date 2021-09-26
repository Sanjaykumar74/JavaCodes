import java.util.*;
class Bank
{
  String name;
  int accountno;
  double balance,interest;
  Bank()
 {
	System.out.println("default constructor called");
	name="not given";
	accountno=112;
	balance=0;
	interest=3;
 }
  Bank(String n,int x,double y,double z)
  {
  	System.out.println("parameterised constructor called");
    name=n;
    accountno=x;
    balance=y;
    interest=z;
  }
   Bank(Bank b1)
   {
   	System.out.println("copy constructor called");
   	name=b1.name;
   	accountno=b1.accountno;
   	balance=b1.balance;
   	interest=b1.interest;
   }
 void show()
 {
   System.out.println("name \t accountno \t balance \t interest");
   System.out.println(name +"\t"+ accountno +"\t"+ balance +"\t"+ interest);
 }
	
}
class Bankconstructor
{
	public static void main(String args[])
	{
	 Bank b1=new Bank();
	 b1.show();
	 Bank b2=new Bank("naveen",1111,15000,4);
	 b2.show();
	 Bank b3=new Bank(b2);
	 b3.show();
	}
}
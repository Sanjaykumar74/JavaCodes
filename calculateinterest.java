import java.util.*;
class customer
{
	int id;
	String name;
	double salary;
	Scanner s1=new Scanner(System.in);
	void get()
	{
		System.out.println("enter name ,id and salary");
		name=s1.nextLine();
		id=s1.nextInt();
		salary=s1.nextDouble();
	}
}
	class account extends customer
	{
		int accountno;
		int balance;
		void getdetails()
		{
			System.out.println("enter accountno and balance");
			accountno=s1.nextInt();
			balance=s1.nextInt();
		}
	}
    class interest extends account
    {
    	int totalbalance;
    	void display()
    	{
    	 totalbalance=(4*balance);
    	 System.out.println("totalbalance  "+totalbalance);
    	}
    	void showall()
	{
		 System.out.println("name \t id \t salary \t accountno \t balamce");
	     System.out.println(name +"\t"+ id +"\t"+ salary +"\t"+ accountno +"\t"+ balance);
	}
}
	


class calculateinterest
{
	public static void main(String[] args)
    {
    	interest i=new interest();
    	i.get();
    	i.getdetails();
    	i.display();
    	i.showall();
	}
	
}
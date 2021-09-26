import java.util.*;
class Employee
{
	String name;
	int eid;
	double salary;
	Employee()		//default constructor
	{
	System.out.println("Default constructor called: ");
	name="noname";
	eid=0;
	salary=0;
	}
	Employee(String n,int x,double s)
	{
		System.out.println(" Parameterized Construcotr called: ");
		name=n;
		eid=x;
		salary=s;
	}
	Employee(Employee e1)
	{
		System.out.println("COpy Construcotr called: ");
		name=e1.name;
		eid=e1.eid;
		salary=e1.salary;
	}
	void show()
	{
			System.out.println("Name \t EID  \t Salary");
			System.out.println(name +"\t" + eid + "\t" + salary);
	}
}
class TestConstructor
{
	public static void main(String args[])
	{
		Employee e1=new Employee();
		e1.show();
		Employee e2=new Employee("Abhay",12,52000.50);
		e2.show();
		Employee e3=new Employee(e2);
		e3.show();
	}
}
import java.util.*;																																						
class Employee
{
	int eid;
	double salary;
	String name;
	Scanner s1=new Scanner(System.in);
	void get()
	{
	System.out.println("enter Name, ID and Salary of the Employee");
	name=s1.nextLine();
	eid=s1.nextInt();
	salary=s1.nextDouble();
	}
	void show()
	{
	System.out.println(name +"\t" +eid +"\t"+salary);
	
	}
}
class ArrayofObjects
	{
	public static void main(String args[])
	{
		//array of objects
     Employee e[]=new Employee[3];
     int i;
     System.out.println("Enter employee details of 3 Employees: ");
     for(i=0;i<3;i++)
     {
     	e[i]=new Employee();
     	e[i].get();
     }
     System.out.println("Employee Details are: \n");
	System.out.println("employeeName \t employeeID \t salary");
     for(i=0;i<3;i++)
     {
     	e[i].show();
     }
	}
} 


import java.util.*;
class student
{
	int rollno;
	String name;
	Scanner s1=new Scanner(System.in);
	void get()
	{
	System.out.println("enter rollno and name of the student ");
	rollno=s1.nextInt();
	s1.nextLine();
	name=s1.nextLine();

	}
	void show()
	{
	System.out.println("student details:\n rollno\tname");
	System.out.println(rollno   +"\t"+  name);
	}
}

class abc
{
	public static void main(String args[])
	{
	student r1=new student();
	r1.get();
	r1.show();
}
}
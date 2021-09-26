//program of class and object
import java.util.*;
class Student
{
	int rno;
	String name;
	Scanner s1=new Scanner(System.in);
	void get()
	{
	System.out.println("Enter name and rno of the student: ");
	name=s1.nextLine();
	rno=s1.nextInt();
	}
	void show()
	{
	System.out.println("Name of the student = "+ name);
	System.out.println("Rno of the student = "+ rno);
	}
}
class Practiceclass
{
	public static void main(String args[])
	{
		Student sb1=new Student();
		sb1.get();
		sb1.show();
	}
}
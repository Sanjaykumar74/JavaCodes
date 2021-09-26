import java.util.*;
class student
{
	int rollno;
	String name;
	static int count;
	Scanner s1=new Scanner(System.in);
	student()
	{
	System.out.println("Default constructor call");
	 roll=1;
	 name="not given";
	}
	void get()
	{
    System.out.println("enter name and rollno");
     name=s1.nextline();
     rollno=s1.nextInt();
     count++;
	}
	static void showcount()
	{
		system.out.println("enter")
	}
	void show()
	{
	System.out.println(rollno+ "\t" +name);
	}
	class test2
	{
	public static void main(String args[])
	{
	 Scanner s1=new Scanner(System.in);
	 student r1=new student();
	  r1.get();
	  r1.show();
	}
	}
}
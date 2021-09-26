//program to test all datatype
import java.util.*;
class datatypes
{
	
	public static void main(String args[])
	{
	Scanner s1=new Scanner(System.in);
	int age,empid;
	String name,address;
	double sal;
	char gender;
	System.out.println("enter your name");
	name=s1.nextLine();
	System.out.println("enter your age");
	age=s1.nextInt();
	System.out.println("enter your empid");
	empid=s1.nextInt();
	System.out.println("enter your sal");
	sal=s1.nextDouble();
	s1.nextLine();
	System.out.println("choose your gender M for male,F for female");
	gender=s1.nextLine().charAt(0);
	System.out.println("enter your address");
	address=s1.nextLine();
	System.out.println("*******************student details************************");
	System.out.println("name \t empid \t age \t gender \t sal \t address");
	System.out.println(name +"\t"+empid +"\t" +age +"\t" +gender +"\t" +sal +"\t" +address);


	}
}

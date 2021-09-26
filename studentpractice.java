import java.util.*;
class student
{
	int rollno;
	String name;
	Scanner s1=new Scanner(System.in);
	void getdetail()
	{
	System.out.println("enter name and rollno");
     name=s1.nextLine();
     rollno=s1.nextInt();
	}
	
}
class result extends student
{   
    int sb1,sb2,total;
    void getmarks()
    {
	System.out.println("enter marks of 2 subjects");
	sb1=s1.nextInt();
	sb2=s1.nextInt();
  }

   void showall()
	{
	  total=sb1+sb2;
    System.out.println("name \t rollno");
	System.out.println(name +"\t"+ rollno);
	System.out.println("value of sb1 "+sb1);
	System.out.println("value of sb2 "+sb2);
	System.out.println("total "+total);
	}
}
class studentpractice
{
	public static void main(String args[])
	{
     result r1=new result();
     r1.getdetail();
     r1.getmarks();
     r1.showall();     
	}
}
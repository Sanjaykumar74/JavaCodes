import java.util.*;
class test
{
     Scanner s1=new Scanner(System.in);
	 static int count;
	 int sal;
	 String name;
	 void get()
	 {
      System.out.println("enter sal and name");
      sal=s1.nextInt();
      s1.nextLine();
      name=s1.nextLine();
      count++; 
	 }
	  static void showcount()
	 {
	 	System.out.println("number of sals are "+count);
	 }
	 void show()
	 {
	 	System.out.println("salesmanager details \n name \t sal");
	 	System.out.println(name+ "\t" +sal);	 
	 }

}
class sales
{
	public static void main(String args[])
	{
      test t1=new test();
      t1.get();
      t1.show();
      t1.showcount();
      test t2=new test();
      t2.get();
      t2.show();
      t2.showcount();
      test t3=new test();
      t3.get();
      t3.show();
      t3.showcount();
      }
}


















	


import java.util.*;
 abstract class shape
  {
	final double pi=3.14;
	abstract void calculateArea();
	}
	class circle extends shape
	{
		Scanner s1=new Scanner(System.in);
		double r,area;
		void get()
		{
         System.out.println("enter the radius of the circle ");
         r=s1.nextInt();
        }
       void calculateArea()
       {
       	 area=pi*r*r;
         System.out.println("area of circle "+area);
       }
}
public class shapes
{ 
	public static void main(String args[])
	{
	 int choice;
     Scanner s1=new Scanner(System.in);
     while(true)
     {
	System.out.println("press 1 to area of circle");
	System.out.println("press 2 to area of rectangle");
	System.out.println("press 3 to area of sphere");
	System.out.println("press 4 to area of cylinder");
	System.out.println("press 5 to exit");
	System.out.println("enter your choice");
	choice=s1.nextInt();
	switch(choice)
	{
	case 1:
	circle c1=new circle();
	c1.get();
	c1.calculatearea();
	break;
	}
   }
  }
}
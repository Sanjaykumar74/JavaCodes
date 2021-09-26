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
         r=s1.nextDouble();
       }
       void calculateArea()
       {
       	 area=pi*r*r;
         System.out.println("area of circle "+area);
       }
}
class rectangle extends shape
{
	Scanner s1=new Scanner(System.in);
	double l,b,rectangle;
	void get()
	{
         System.out.println("enter the rectangle length and bidth ");
         l=s1.nextDouble();
         b=s1.nextDouble();
       }
       void calculateArea()
       {
       	 rectangle=l*b;
         System.out.println("area of rectangle "+rectangle);
       }
}
class sphere extends shape
{
	Scanner s1=new Scanner(System.in);
	double r,sphere;
	void get()
	{
         System.out.println("enter the radius of the sphere ");
         r=s1.nextDouble();
       }
       void calculateArea()
       {
       	 sphere=4*pi*r*r;
         System.out.println("area of circle "+sphere);
       }
}
class cylinder extends shape
{
	Scanner s1=new Scanner(System.in);
	double r,h,area;
	void get()
	{
         System.out.println("enter the radius and height of the cylinder ");
         r=s1.nextDouble();
         h=s1.nextDouble();
       }
       void calculateArea()
       {
       	 area=(2*pi*r*h+2*pi*r*r);
         System.out.println("area of cylinder "+area);
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
	c1.calculateArea();
	break;
	case 2:
	rectangle r=new rectangle();
	r.get();
	r.calculateArea();
	break;
	case 3:
	sphere s=new sphere();
	s.get();
	s.calculateArea();
	break;
	case 4:
	cylinder c=new cylinder();
	c.get();
	c.calculateArea();
	break;
	case 5:
		System.exit(0);
	default:
	System.out.println("Invalid choice:");
	
	}
   }
  }
}
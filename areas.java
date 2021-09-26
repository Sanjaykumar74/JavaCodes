import java.lang.Math;
import java.util.Scanner;
class areas
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("press1:Selecting area of the triangle \n press2:Selecting area of the rectangle\n press3:Selecting area of the square\n press4:Selecting area of the circle");
int press=sc.nextInt();
switch(press)
{
case 1:
      System.out.println(" Area of triangle");
      System.out.println("Enter the breadth of the triangle:");
      double b=sc.nextDouble();
      System.out.println("Enter the height of the triangle:");
      double h=sc.nextDouble();
      double area=(b*h)*1/2;
      System.out.println("Calculate the area of triangle:"+area);
      break;
case 2:
      System.out.println("Area of the rectangle:");
      System.out.println("Enter the length of the rectangle:");
      double l=sc.nextDouble();
      System.out.println("Enter the breadth of the rectangle:");
      double br=sc.nextDouble();
      double area1=l*br;
      System.out.println("Calculate the area of rectangle:"+area1);
      break;
case 3:
      System.out.println("Area of the Square:");
      System.out.println("Side of the square:");
      double s=sc.nextDouble();
      double area2=s*s;
      System.out.println("Calculate the area of square:"+area2);
      break;
case 4:
      System.out.println("Area of the circle:");
      double pi=3.14;
      System.out.println("Enter the radius of the Circle:");
      double r=sc.nextDouble();
      double area3=pi*r*r;
      System.out.println("Calculate the area of Circle:"+area3);
      break;
default :
      System.out.println("Wrong input:");
}
}
}

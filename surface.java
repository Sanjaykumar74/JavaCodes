import java.lang.Math;
import java.util.Scanner;
class surface
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the sides of triangles:");
System.out.println("Enter the a side of triangle:");
double a=sc.nextDouble();
System.out.println("Enter the b side of triangle:");
double b=sc.nextDouble();
System.out.println("Enter the c side of triangle:");
double c=sc.nextDouble();
double s=(a+b+c)/2;
double area=s*(s-a)*(s-b)*(s-c);
System.out.println("area of surface:"+s);
System.out.println("area of triangle:"+Math.sqrt(area));
}
}
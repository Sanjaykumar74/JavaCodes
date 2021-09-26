import java.util.Scanner;
class circle
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of pi");
float pi=sc.nextFloat();
System.out.println("Enter the radius");
float radius=sc.nextFloat();
float area=pi*(radius)*(radius);
System.out.println("area="+area);
}
}
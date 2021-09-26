import java.lang.Math;
import java.util.Scanner;
class min
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of a:");
double a=sc.nextDouble();
System.out.println("Enter the value of b:");
double b=sc.nextDouble();
System.out.println("Enter the min value:");
System.out.println("Calculate the min value:"+Math.min(a,b));
}
}
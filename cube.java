import java.lang.Math;
import java.util.Scanner;
class cube
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the a value:");
double a=sc.nextDouble();
System.out.println("Enter the a value:");
double b=sc.nextDouble();
double cube=(5*a*a*a)+(Math.sqrt(625)*b)-(Math.cbrt(27));
System.out.println("Calculate the value of cubic equation:"+cube);
}
}  


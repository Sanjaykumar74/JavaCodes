import java.lang.Math;
import java.util.Scanner;
class quadratic
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the quadratic equation:");
System.out.println("Enter the a value of quadratic equation:");
double a=sc.nextDouble();
System.out.println("Enter the b value of quadratic equation:");
double b=sc.nextDouble();
System.out.println("Enter the c value of quadratic equation:");
double c=sc.nextDouble();
double d=((b*b)-(4*a*c));
double r1=(-b+d*d)/(2*a);
double r2=(-b-d*d)/(2*a);
System.out.println("Calculate d:"+d);
if (d>0)
{
System.out.println("Roots are real:");
System.out.println("Calculate root1:"+r1);
System.out.println("Calculate roo2:"+r2);
}
else
{
System.out.println("Roots are imaginary:");
}
}
}


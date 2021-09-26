import java.lang.Math;
import java.util.Scanner;
class pow
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of a:");
double a=sc.nextDouble();
System.out.println("Enter the value of b:");
double b=sc.nextDouble();
System.out.println("Calculate the pow value:"+Math.pow(a,b));
}
}

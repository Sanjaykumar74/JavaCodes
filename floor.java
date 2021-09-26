import java.lang.Math;
import java.util.Scanner;
class floor
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value in round format:");
double a=sc.nextDouble();
System.out.println("Calculate value in applying floor formula:"+Math.floor(a));
}
}
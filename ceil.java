import java.lang.Math;
import java.util.Scanner;
class ceil
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter  the value in round format:");
double a=sc.nextDouble();
System.out.println("Calculate value after applying ceiling formula:"+Math.ceil(a));
}
}
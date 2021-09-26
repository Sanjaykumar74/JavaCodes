import java.lang.Math;
import java.util.Scanner;
class round
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value in round:");
double a=sc.nextDouble();
System.out.println("without round value is:"+Math.round(a));
}
}
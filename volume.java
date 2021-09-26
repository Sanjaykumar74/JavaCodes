import java.util.*;
class volume
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the radius of sphere:");
double radius=sc.nextDouble();
double pi;
pi=3.14;
double volume=((Math.cbrt(radius))*(pi)*(4))/3;
System.out.println("Calculate the volume of sphere:"+volume);
}
}
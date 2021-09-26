import java.util.*;
class equilateral
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the side of equilateral triangle:");
double side=sc.nextDouble();
double area=(Math.sqrt(3)/4)*(side*side);
System.out.println("Calculate the area of equilateral triangle:"+area);
}
}
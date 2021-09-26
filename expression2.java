import java.util.Scanner;
class expression2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the a");
double a= sc.nextDouble();
System.out.println("Enter the b");
double b=sc.nextDouble();
System.out.println("Enter the c");
double c=sc.nextDouble();
double d=4*a+9*(b-c);
System.out.println("Second expression d="+d);
}
}
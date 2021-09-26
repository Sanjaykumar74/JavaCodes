import java.util.Scanner;
class salary2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name:");
String name=sc.nextLine();
System.out.println("basic salary:");
double basic=sc.nextDouble();
System.out.println("Enter the DA rate:");
double D=sc.nextDouble();
double DA=(basic*D)/100;
System.out.println("Calculate DA="+DA);
System.out.println("Enter the bonus:");
double b=sc.nextDouble();
double bonus=(basic*b)/100;
System.out.println("calculate bonus="+bonus);
System.out.println("Enter the loandet:");
double loandet=sc.nextDouble();
double salary=(basic+ DA +bonus-loandet);
System.out.println("salary of employee:"+salary);
}
}
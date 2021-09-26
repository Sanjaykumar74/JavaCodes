import java.util.Scanner;
class metre
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter distance in metre");
double metre=sc.nextDouble();
double kilometre=metre*0.001;
System.out.println("kilometre="+kilometre);
}
}
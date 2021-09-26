import java.util.Scanner;
class basetriangle
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter area of triangle:");
float area=sc.nextFloat();
System.out.println("Enter the height of triangle:");
float height=sc.nextFloat();
float base=(2*area)/height;
System.out.println("base="+base);
}
}


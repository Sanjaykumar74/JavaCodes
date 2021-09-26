import java.util.Scanner;
class item
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the amount of product:");
double amount=sc.nextDouble();
System.out.println("Enter the quantity of product:");
double quantity=sc.nextDouble();
double rate=amount/quantity;
System.out.println("rate="+rate);
}
}

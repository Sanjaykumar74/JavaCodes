import java.util.Scanner;
class discount
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the product name:");
String name=sc.nextLine();
System.out.println("Enter the quantity of product:");
float quantity=sc.nextFloat();
System.out.println("Enter the rate of product:");
float rate=sc.nextFloat();
float amount =quantity*rate;
System.out.println("amount="+amount);
if (amount>=10000)
{
float discount=(amount*8)/100;
float af=amount-discount;
System.out.println("8%  cash discount:");
System.out.println("discount="+discount);
System.out.println("af="+af);
System.out.println("amount before discount="+amount);
}
else
{
System.out.println("there will be no discount:");
}
}
}

import java.util.Scanner;
class shopping
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter quantity of product");
int quantity=sc.nextInt();
System.out.println("Enter rate of product");
int rate=sc.nextInt();
int amount= quantity*rate;
int dis = (amount*5)/100;
int af= amount-dis;
System.out.println("amount="+amount);
System.out.println("dis="+dis);
System.out.println("af="+af);
}
}
import java.util.Scanner;
class nested
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("code1:Selecting computer stationary\n code2:Selecting fixed disks\n code3:Selecting computers:");
int code=sc.nextInt();
if (code==1)
{
System.out.println("computer stationary:");
System.out.println("Enter the order amount:");
int amount=sc.nextInt();
if(amount<=300)
{
System.out.println("you have earned 2% cash discount on Order:");
int discount=(amount*2)/100;
System.out.println("Discount amount is:"+discount);
}
else if(amount>300 && amount<=500)
{
System.out.println("you have earned 8% cash discount");
int discount=(amount*8)/100;
System.out.println("Discount amount is:"+discount);
}
else
{
System.out.println("you have earned 12% cash discount:");
int discount=(amount*12)/100;
System.out.println("Discount amount is:"+discount);
}
}
else if(code==2)
{
System.out.println("fixed disks:");
System.out.println("Enter the order amount:");
int amount=sc.nextInt();
if(amount<=1500 && amount<=2000)
{
System.out.println("You have earned 5% cash discount on order:");
int discount=(amount*5)/100;
System.out.println("Discount amount is:"+discount);
}
else
{
System.out.println("you have earned 10% cash discount on order:");
int discount=(amount*10)/100;
System.out.println("Discount amount is:"+discount);
}
}
else if(code==3)
{
System.out.println("computers:");
System.out.println("Enter the order amount:");
int amount=sc.nextInt();
if(amount<=2500 && amount<=5000)
{
System.out.println(" you have earned 5% cash discount on order:");
int discount=(amount*5)/100;
System.out.println("Discount amount is:"+discount);
}
else
{
System.out.println("you have earned 10% cash discount on order:");
int discount=(amount*10)/100;
System.out.println("Discount amount is:"+discount);
}
}
}
}


 
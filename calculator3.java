import java.lang.Math;
import java.util.Scanner;
class calculator3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("press1:Selecting the addition \n press2:Selecting the Subtraction \n press3:Selecting the multiplication \n press4:Selecting the divison");
int press=sc.nextInt();
System.out.println("Enter the a:");
int a=sc.nextInt();
System.out.println("Enter the b:");
int b=sc.nextInt(); 
switch(press)
{
case 1:
      System.out.println("perform function addition:");
      int sum=a+b;
      System.out.println("Calculate addition:"+sum);
      break;
case 2:
      System.out.println("perform function subtraction:");
      int sub=a-b;
      System.out.println("Calculate subtraction:"+sub);
      break;
case 3:
      System.out.println("perform function multiplication:");
      int mul=a*b;
      System.out.println("Calculate Multiplication:"+mul);
      break;
case 4:
      System.out.println("perform function divison:");
      int div=a/b;
      System.out.println("Calculate divison:"+div);
      break;
default:
      System.out.println("Wrong input:");
}
}
}


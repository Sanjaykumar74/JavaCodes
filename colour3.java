import java.lang.Math;
import java.util.Scanner;
class colour3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("press1:Selected the red colour \n press2:Selecting the green colour \n press3:Selecting the blue colour");
int press=sc.nextInt();
switch(press)
{
case 1:
      System.out.println("Selected red colour:");
      break;
case 2:
      System.out.println("Selected green colour:");
      break;
case 3:
      System.out.println("Selected blue colour:");
      break;
default:
      System.out.println("Wrong input:");
}
}
}


       
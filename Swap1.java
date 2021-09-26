import java.util.Scanner;
class Swap1
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter a:");
int a=sc.nextInt();
System.out.println("Enter b:");
int b=sc.nextInt();
a=(a*b);
 b=a/b;
 a=a/b;
System.out.println("value of a after swapping="+a);
System.out.println("Value of b after swapping="+b);
}
}
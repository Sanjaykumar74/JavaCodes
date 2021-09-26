import java.util.Scanner;
class reverse
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a five digit no:");
int a=sc.nextInt();
int d1 = a%10;
a = a/10;
int d2 =a%10;
a =a/10;
int d3 =a%10;
a =a/10;
int d4 =a%10;
a =a/10;
int d5 =a%10;

System.out.println("New no after reversing digits: "+d1+d2+d3+d4+d5);
}
}
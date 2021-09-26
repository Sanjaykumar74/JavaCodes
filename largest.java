import java.util.Scanner;
class largest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number:");
int first =sc.nextInt();
System.out.println("Enter the Second number:");
int Second =sc.nextInt();
if (first>Second)
{
System.out.println("First number: "+first+" is the largest than Second number: "+Second);
}
else
{
System.out.println("Second number: "+Second+" is the largest than first number:"+first);
}
}
}
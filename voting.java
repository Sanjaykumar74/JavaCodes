import java.util.Scanner;
class voting
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the  age:");
int age=sc.nextInt();
if (age>=18)
{
System.out.println("Candidate is eligible for voting:");
}
else
{
System.out.println("Candidate is not eligible  for voting:");
}
}
}
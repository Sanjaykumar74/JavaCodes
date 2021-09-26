import java.util.Scanner;
class calculator2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Press1:Select addition\n Press2:Select substraction\n Press3:Select multiplication\n Press4:Select division");
int Press=sc.nextInt();
if(Press==1)
{
System.out.println("perform function addition:");
System.out.println("Enter the a:");
int a=sc.nextInt();
System.out.println("Enter the b:");
int b=sc.nextInt();
int sum=a+b;
System.out.println("Calculate addition:"+sum);
}
else if(Press=2)
{
System.out.println("perform function substraction:");
System.out.println("Enter the a:");
int a=sc.nextInt();
System.out.println("Enter the b:");
int b=sc.nextInt();
int sub=a-b;
System.out.println("Calculate the substraction:"+sub);
}
else if(Press==3)
{
System.out.println("perform function multiplication:");
System.out.println("Enter the a:");
int a=sc.nextInt();
System.out.println("Enter the b:");
int b=sc.nextInt();
int mul=a*b;
System.out.println("Calculate the multiplication:"+mul);
}
else if(Press==4)
{
System.out.println("perform function division:");
System.out.println("Enter the a:");
int a=sc.nextInt();
System.out.println("Enter the b:");
int b=sc.nextInt();
int div=a/b;
System.out.println("Calculate the division:"+div);
}
else
{
System.out.println("Wrong input:");
}
}
}  
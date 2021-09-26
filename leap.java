import java.util.*;
class leap
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the starting year:");
int starting=sc.nextInt();
System.out.println("Enter the ending year:");
int n=sc.nextInt();
int i=n;
while(i>=starting)
{
if(i%4==0 && i%100!=0 || i%400==0)
{
System.out.println(i);}
i--;
}
}
}
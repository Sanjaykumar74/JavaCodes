import java.util.*;
class root
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
System.out.println("square root of "+i+" is equal to:"+Math.sqrt(i));
}
}
}
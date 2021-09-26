import java.util.*;
class loop
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your name:");
String name=sc.nextLine();
System.out.println("How many time print your name:");
int n=sc.nextInt();
for (int i=1;i<=n;i++)
{
System.out.println(name);
}
}
}
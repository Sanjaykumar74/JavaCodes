import java.util.*;
class prime1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
int no=sc.nextInt();
int temp=0;
for(int j=1;j<=100;j++)
{ 
for(int i=2;i<=no-1;i++)
{
if(no%i==0)
{
temp=temp+1;
}
}
}

if(temp>0)
{
System.out.println("Number is not prime:");
}
else
{
System.out.println("Number is prime:");
}
} 
}


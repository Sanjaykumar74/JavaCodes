import java.util.Scanner;
class number
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter six number:");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int d=sc.nextInt();
int e=sc.nextInt();
int f=sc.nextInt();
if (a<b && a<c && a<d && a<e && a<f)
{
System.out.println("a is the smallest value="+a);
}
else if(b<a && b<c && b<d && b<e && b<f)
{
System.out.println("b is the smallest value="+b);
}
else if(c<a && c<b && c<d && c<e && c<f)
{
System.out.println("c is the smallest value="+c);
}
else if(d<a && d<b && d<c && d<e && d<f)
{
System.out.println("d is the smallest value="+d);
}
else if(e<a && e<b && e<c && e<d && e<f)
{
System.out.println("e is the smallest value="+e);
}
else
{
System.out.println("f is the smallest value="+f);
}
}
}




































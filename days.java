import java.util.Scanner;
class days
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the days work will be completed by 3 person:");
System.out.println("Enter the x days:");
int x=sc.nextInt();
System.out.println("Enter the y days:");
int y=sc.nextInt();
System.out.println("Enter the z days:");
int z=sc.nextInt();
int days=((x*y*z)/(x*y+y*z+z*x));
System.out.println("Calculate days:"+days);
}
}




import java.util.Scanner;
class speed
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the speed");
int speed=sc.nextInt();
System.out.println("Enter the time");
int time=sc.nextInt();
int distance=speed*time;
System.out.println("distance="+distance);
}
}

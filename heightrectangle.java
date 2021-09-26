import java.util.Scanner;
class heightrectangle
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the area of rectangle:");
float area=sc.nextFloat();
System.out.println("Enter the length of rectangle:");
float length=sc.nextFloat();
System.out.println("Enter the width of rectangle:");
float width=sc.nextFloat();
float height=(area)/(length*width);
System.out.println("height="+height);
}
}
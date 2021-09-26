import java.util.Scanner;
class conversion
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value in tonnes:");
int tonnes=sc.nextInt(); 
int qt=tonnes*10;
System.out.println("qt="+qt);
int kilogram=tonnes*1000;
System.out.println("kilogram="+kilogram);
System.out.println("Enter the value in qt:");
qt=sc.nextInt();
kilogram=qt*100;
System.out.println("kilogram="+kilogram);

}
}


import java.util.Scanner;
class temp1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the temperature in fern");
float fern=sc.nextFloat();
float celcius=((fern-32)*5)/9;
System.out.println("the temperature in celcius="+celcius);
}
}

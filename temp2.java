 import java.util.Scanner;
class temp2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in); 
System.out.println("Enter the temperature in celcius");
float celcius=sc.nextFloat();
 float fern =((celcius*9)/5+32);
System.out.println("calculate temperature in fern="+fern);
}
}
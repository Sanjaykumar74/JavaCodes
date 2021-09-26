import java.util.Scanner;
class Salary
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the basic Salary");
int Salary=sc.nextInt();
int HRA=(Salary*2)/100;
System.out.println("HRA="+HRA);
int DA=(Salary*3)/100;
System.out.println("DA="+DA);
int PF=(Salary*12)/100;
System.out.println("PF="+PF);
int ESI=(Salary*1)/100;
System.out.println("ESI="+ESI);
int GS=(Salary+HRA+DA)-PF-ESI;
System.out.println("GS="+GS);
}
}
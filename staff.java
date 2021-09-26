import java.util.Scanner;
class staff
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter basic salary:");
int salary=sc.nextInt();
int HRA=(salary*2)/100;
System.out.println("HRA="+HRA);
int DA=(salary*3)/100;
System.out.println("DA="+DA);
int PF=(salary*12)/100;
System.out.println("PF="+PF);
int EST=(salary*1)/100;
System.out.println("EST="+EST);
int GS=(salary+HRA+DA-PF-EST);
System.out.println("GS="+GS);
}
}


import java.util.Scanner;
class netsalary
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double HRA,TA,Others;
HRA=150;
TA=120;
Others=450; 
System.out.println("Enter basic salary:");
double basic=sc.nextDouble();
System.out.println("Enter the DA rate:");
double D=sc.nextDouble();
double DA=(basic*12)/100;
System.out.println("Calculate DA:"+DA);
System.out.println("Tax cuts:");
System.out.println("Enter the PF rate:");
double P=sc.nextDouble();
double PF=(basic*14)/100;
System.out.println("PF="+PF);
System.out.println("Enter the IT rate:");
double I=sc.nextDouble(); 
double IT=(basic*15)/100;
System.out.println("IT="+IT);
double salary=basic+DA+HRA+TA+Others-(PF+IT);
System.out.println("Calculate net salary of employee:"+salary);
}
}


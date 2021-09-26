import java.util.*;
class tax
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Employ name:");
String name=sc.nextLine();
System.out.println("Enter the employment id:");
double id=sc.nextDouble(); 
System.out.println("Enter the Basic salary:");
double salary=sc.nextDouble();
double oneday=(salary/30);
System.out.println("Calculate one day salary of employ:"+oneday);
System.out.println("Enter the leave of employ:");
double leave=sc.nextDouble();
double deduction=leave*oneday;
System.out.println("Calculate the leave deduction:"+deduction);
double basic=salary-(leave*oneday);
System.out.println("Calculate the basic salary:"+basic);
double HRA=(basic*2)/100;
System.out.println("Calculate the HRA:"+HRA);
double DA=(basic*3)/100;
System.out.println("Calculate the DA:"+DA);
double PF=(basic*12.5)/100;
System.out.println("Calculate the PF:"+PF);
double ESI=(basic*1)/100;
System.out.println("Calculate the ESI:"+ESI);
double GS=((basic+HRA+DA)-PF-ESI);
System.out.println("Calculate the Gross salary:"+GS);
double it;
if (GS<=8000)
{
it=(GS*2)/100;
System.out.println("Calculate the  tax:"+it);
}
else if(GS<8000 && GS<=15000)
{
 it=(((GS-8000)*4)/100)+((8000*2)/100);
System.out.println("Calculate the  tax:"+it);
}
else if(GS<15000 && GS<=30000)
{
 it=(((GS-15000)*7)/100)+((7000*4)/100)+((8000*2)/100);
System.out.println("Calculate the  tax:"+it);
}
else if(GS<30000 && GS<=50000)
{
 it=(((GS-20000)*10)/100)+((15000*7)/100)+((7000*4)/100)+((8000*2)/100);
System.out.println("Calculate the  tax:"+it);
}
else if(GS<50000 && GS<=100000)
{
  it=(((GS-50000)*15)/100)+((20000*10)/100)+((15000*7)/100)+((7000*4)/100)+((8000*2)/100);
System.out.println("Calculate the  tax:"+it);
}
else if (GS<100000 && GS<=180000)
{
  it=(((GS-80000)*20)/100)+((50000*15)/100)+((20000*10)/100)+((15000*7)/100)+((7000*4)/100)+((8000*2)/100);
System.out.println("Calculate the  tax:"+it);
}
else
{
 it=(((GS-180000)*25)/100)+((80000*20)/100)+((50000*15)/100)+((20000*10)/100)+((15000*7)/100)+((7000*4)/100)+((8000*2)/100);
System.out.println("Calculate the  tax:"+it);
}
double net;
 net=GS-it;
System.out.println("Calculate the net salary:"+net);
}
}








 

 
 
 
 
 
 

 
 
 

 
  
  
  
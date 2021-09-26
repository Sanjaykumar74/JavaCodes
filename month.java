import java.util.*;
class month
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("press1:Selecting the jan\n press2:Selecting the feb\n press3:Selecting the Mar \n press4:Selecting the April \n press5:Selecting the May\n press6:Selecting the june \n press7:Selecting the july \n press8:Selecting the August\n press9:Selecting the Sep\n press10:Selecting the Oct \n press11:Selecting the Nov \n Press12:Selecting the Dec ");
int press=sc.nextInt();
switch(press)
{
case 1:
      System.out.println("January:");
      System.out.println("31:");
      break;
case 2:
	System.out.println("Enter the year:");
	int year=sc.nextInt();  
      if((year%400==0) || ((year%4==0) && (year%100!=0)))
     {
     System.out.println("Febuary:");
     System.out.println("Number of the days is 29:"); 
     }
     else 
     {  
      System.out.println("Number of the days is 28:");
     }
break;
case 3:
       System.out.println("March:");
       System.out.println("31:");
       break;
case 4:
       System.out.println("april:");
       System.out.println("30:");
       break;
case 5:
      System.out.println("May:");
      System.out.println("31:");
      break;
case 6:
      System.out.println("June:");
      System.out.println("30:");
      break;
case 7:
      System.out.println("July:");
      System.out.println("31:");
      break;
case 8:
      System.out.println("August:");
      System.out.println("31:");
      break;
case 9:
      System.out.println("September:");
      System.out.println("30:");
      break;
case 10:
      System.out.println("October:");
      System.out.println("31:");
      break;
case 11:
      System.out.println("November:");
      System.out.println("30:");
      break;
case 12:
      System.out.println("December:");
      System.out.println("31:");
      break;
default:
       System.out.println("Wrong input:");
}
}
}
                
     


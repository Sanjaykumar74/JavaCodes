import java.util.*;
class bill
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the metre no.:");
int metre=sc.nextInt();
System.out.println("Enter the last metre reading:");
int last=sc.nextInt();
System.out.println("Enter the current metre reading:");
int current=sc.nextInt();
int UC=current-last;
System.out.println("Calculate the unit consumed:"+UC);
if(UC<=250)
{
System.out.println("Rate of per unit is 4:");
int bill=(UC*4);
System.out.println("Calculate the bill:"+bill);
} 
else if (UC>250 && UC<=500)
{
System.out.println("Rate of per unit is 6:");
int bill=((UC-250)*6)+(250*4);
System.out.println("Calculate the bill:"+bill);
}
else if(UC>500 && UC<=1000)
{
System.out.println("Rate of per unit is 8:");
int bill=((UC-500)*8)+(250*6)+(250*4);
System.out.println("Calculate the bill:"+bill);
} 
else if(UC>1000 && UC<=1800)
{
System.out.println("Rate of per unit is 12:");
int bill=((UC-1000)*12)+(500*8)+(250*6)+(250*4);
System.out.println("Calculate the bill:"+bill);
} 
else if(UC>1800 && UC<=3000)
{
System.out.println("Rate of per unit is 18:");
int bill=((UC-1800)*18)+(800*12)+(500*8)+(250*6)+(250*4);
System.out.println("Calculate the bill:"+bill);
} 
else 
{
System.out.println("Rate of per unit is 20:");
int bill=((UC-3000)*20)+(1200*18)+(800*12)+(500*8)+(250*6)+(250*4);
System.out.println("Calculate the bill:"+bill);
} 
}
}      
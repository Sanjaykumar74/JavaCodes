import java.util.Scanner;
class colour
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Press1:Selecting red colour\n Press2:Selecting green colour\n Press3:Selecting blue colour\n Enter your choice:");
int press=sc.nextInt();
if(press==1)
{
System.out.println("red colour");
}
else if(press==2)
{
System.out.println("green colour");
}
else if (press==3)
{
System.out.println("blue colour");
}
else
{
System.out.println("Enter your choice");
}
}
} 		


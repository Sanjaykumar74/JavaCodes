import java.util.*;
class bitwise
{
	public static void main(String args[])
	{
	Scanner s1=new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter 2 number");
	a=s1.nextInt();
	b=s1.nextInt();
	c=a&b;
	System.out.println("enter bitwise a & b "+c);
	c=a|b;
	System.out.println("enter bitwise a|b "+c);
	c=a<<3;
	System.out.println("enter bitwise a << "+c);
	c=a>>3;
	System.out.println("enter bitwise a >> "+c);
	a=-1;
	c=a>>>24;
	System.out.println("enter bitwise a >>> "+c);

    }
}
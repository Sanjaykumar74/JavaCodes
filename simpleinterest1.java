import java.util.*;
class simpleinterest1
{
	public static void main(String args[])
	{
	
		Scanner s1=new Scanner(System.in);
		Double p,r,t,SI;
		
		System.out.println("Enter 3 numbers p,r and t:");
		p=s1.nextDouble();
		r=s1.nextDouble();
		t=s1.nextDouble();
		SI=(p*r*t)/100;
		System.out.println("Value of p = "+p);
		System.out.println("Value of r = "+r);
		System.out.println("Value of t = "+t);
		System.out.println("SI = "+SI);

	}
}
import java.util.*;
class area
{
	public static void main(String args[])
	{
	double r,ar;
	Scanner s1=new Scanner(System.in);
	System.out.println("enter the radius of circle");
	r=s1.nextDouble();
	System.out.println("square root= "+Math.sqrt(r));
	System.out.println("power of 3 raise of 3 is "+Math.pow(3,3));
    ar=Math.PI*r*r;
    System.out.println("area of circle="+ar);

	}
}
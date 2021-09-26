import java.util.*;
class simple
{
	public static void interest(int x,int y,int z)
	{
	int SI;
	SI=(x*y*z)/100;
	System.out.println("SI "+SI);

}

public static void main(String args[])
{
	int p,r,t;
	Scanner s1=new Scanner(System.in);
	System.out.println("enter of number p,r and t");
	p=s1.nextInt();
	r=s1.nextInt();
	t=s1.nextInt();
	interest(p,r,t);


}
}
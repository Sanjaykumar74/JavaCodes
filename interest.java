import java.util.*;
class simpleinterest
{
	int p,r,t,SI;
	Scanner s1=new Scanner(System.in);
	void get()
	{
	System.out.println("Enter numbers of p,r and t ");
	p=s1.nextInt();
	r=s1.nextInt();
	t=s1.nextInt();
	}
	void show()
	{
	 SI=(p*r*t)/100;
	 System.out.println("values of p "+p);
	 System.out.println("values of r "+r);
	 System.out.println("values of t "+t);
	 System.out.println("SI "+SI);
    }
}
class interest
{
	public static void main(String args[])
	{
	simpleinterest s2=new simpleinterest();
	s2.get();
	s2.show();
	}
}

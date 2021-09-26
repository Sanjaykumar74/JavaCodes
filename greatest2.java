import java.util.*;
class greatest2  
{
	public static void main(String args[])
	{
	Scanner s1=new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter 2 number ");
	a=s1.nextInt();
	b=s1.nextInt();
	c=a<b?a:b;
	System.out.println("greatest of c:  "+c);

}
}
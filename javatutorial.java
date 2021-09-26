import java.util.*;
class javatutorial
{
	public static void main(String args[])
	{
	Scanner s1=new Scanner(System.in);
	int hour,minute,seconds,n;
	System.out.println(" Enter the no. of seconds:");
	n=s1.nextInt();
	hour=n/3600;
	n=n%3600;
	minute=n/60;
    seconds=n%60;
    System.out.println("hour="+hour);
    System.out.println("minute="+minute);
    System.out.println("second="+seconds);

	
	}
}
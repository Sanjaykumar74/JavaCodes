import java.util.*;
class Myclass
{
	Myclass()
	{
	System.out.println("default constructor");
	}
	void finalise()
	{
	System.out.println("finalise method called");
	}
}
class javafinalise
{
	public static void main(String args[])
	{
	 Myclass c1=new Myclass();
     c1=null;
	 System.gc();
	 System.out.println("end of the garbage collection");
	}

}

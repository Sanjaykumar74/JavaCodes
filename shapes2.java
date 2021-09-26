import java.util.*;
 interface area
{
	final double pi=3.14;
	void calculateArea();
}
 class circle implements area
 {
    double radius,area;
    Scanner s1=new Scanner(System.in);
    void getRadius()
    {
        System.out.println("enter radius of circle");
        radius=s1.nextDouble();
   }
   public void calculateArea()
   { 
      area=pi*radius*radius;
      System.out.println("area of circle "+area);

   }
}
class shapes2
{
	public static void main(String args[])
	{
     circle c1=new circle();
     c1.getRadius();
     c1.calculateArea();
    }

}
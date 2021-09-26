import java.util.*;
class captain
  {
    int teamid;
	String name;
	int totalmatches,wins;
	double ratio;
	Scanner s1=new Scanner(System.in);
	void get()
	{
	System.out.println("enter name,teamid,totalmatches and wins");
	name=s1.nextLine();
	teamid=s1.nextInt();
	totalmatches=s1.nextInt();
	wins=s1.nextInt();
   }
	 void show()
	{
	ratio=(double)wins/totalmatches*100;
	System.out.println(name+ "\t" +teamid+ "\t" +totalmatches+ "\t"+wins+ "\t"+ratio);
    }
}
 class team1
   {
	public static void main(String args[])
	{
	  captain c[]=new captain[3];
	  System.out.println("enter captain details of 3 captain");
	  int i;
	  for(i=0;i<3;i++)
	  {
		c[i]=new captain();
		c[i].get();
      }
	  System.out.println("captain Details are: \n");
	  System.out.println("name \t teamid \t totalmatches \t wins \t ratio");
      for(i=0;i<3;i++)
      {
     	c[i].show();
      }
   }
}
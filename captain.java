import java.util.*;
 class team
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
	System.out.println("name of the team "+name);
	System.out.println("teamid of the team "+teamid);
	System.out.println("totalmatches "+totalmatches);
	System.out.println("nos of wins "+wins);
	System.out.println("ratio of team "+ratio);
    }

}
class captain
{
	public static void main(String args[])
	{
	team t1=new team();
	t1.get();
	t1.show();

	}
}
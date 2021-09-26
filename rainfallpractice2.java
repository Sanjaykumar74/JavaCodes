import java.util.*;
class Rainfall
{
	double monthrain[]=new double[12];
	int i;
	String name[]={"Jan","Feb","March","April","May","Jun","July","Aug","Sept","Oct","Nov","Dec"};
	double totalrainfall=0,avg;
	Scanner s1 = new Scanner(System.in);
	void get()
	{
		for(i=0;i<12;i++)
		{
			System.out.println("enter the monthrain "+name[i]);
			monthrain[i]=s1.nextDouble();
		   }
	}
	void show()
	{
			System.out.println("Month \t Rainfall in MM");
		for(i=0;i<12;i++)
		{
	        System.out.println(name[i]+ "\t" +monthrain[i]);
	       
	     }

     }
     void totalrainfall()
     {
     	for(i=0;i<12;i++)
     	{
     	    totalrainfall=totalrainfall+monthrain[i];
     	}
     	 System.out.println("Total rainfall in year is: "+totalrainfall);
     	 avg=totalrainfall/12;
     	 System.out.println("Average rainfall in mm is: "+avg);
     } 
     void most()
     {  
     	double most=monthrain[0];
     	for(i=0;i<12;i++)
     	{
          if(most<monthrain[i])
          {
          	most=monthrain[i];
          }     	 
       }
        System.out.println("most rainfall in months "+most);
    }
   void least()
   {
   		double least=monthrain[0];
     	for(i=0;i<12;i++)
     	{
          if(least>monthrain[i])
          {
          	least=monthrain[i];
          }
      }
         System.out.println("least rainfall in months "+least);
     }
     void sort()
     { 
      int j;
	  double temp;
	   for(i=0;i<12;i++)
	   {
		for(j=0;j<12-i-1;j++)
		{
			if(monthrain[j]>monthrain[j+1])
			{
				temp=monthrain[j];
				monthrain[j]=monthrain[j+1];
				monthrain[j+1]=temp;
			}
		}
	}
	System.out.println("elements is sorted order are");
	for(i=0;i<12;i++)
	{
    System.out.println(name[i]+ "\t" +monthrain[i]);
   
	}
  }
  void search()
  {
  	int item;
	System.out.println("enter the rainfall who want to sreach");
  	item=s1.nextInt();
	for(i=0;i<12;i++)
	{
	 	if(item==monthrain[i])
		{
		 	System.out.println(item + " is present in "+i+" index position");
		 	break;
	 	}
	}
	if(i==12)
	System.out.println(item + " does not exist in the rainfall");
	
  }

}
	class rainfallpractice2
	   {
	    public static void main(String args[])
	    {

	    	int choice;
	    	Scanner s1=new Scanner(System.in);
            Rainfall t=new Rainfall();
	        while(true)
	    {
		System.out.println("press 1 to Read the rainfall for 12 months");
		System.out.println("press 2 to Display the rainfall for 12 months");
		System.out.println("press 3 to Display the total rainfall and the average monthly rainfall");
		System.out.println("press 4 to Display the month with the most rainfall");
		System.out.println("press 5 to Display the month with the least rainfall");
		System.out.println("press 6 to Sort the rainfall in ascending order ");
		System.out.println("press 7 to Search and display the month which has rainfall equal to the given rainfall");
		System.out.println("press 8 to Exit from application");
		choice=s1.nextInt();
		switch(choice)
		{
			case 1:
			t.get();
			break;
			case 2:
			t.show();
			break;
			case 3:
            t.totalrainfall();
			break;
			case 4:
			t.most();
			break;
			case 5:
			t.least();
			break;
            case 6:
            t.sort();
            break;
            case 7:
            t.search();
            break;
            case 8:
            System.exit(0);
	        default:
	        System.out.println("Invalid choice:");
		}
	}
  }
}
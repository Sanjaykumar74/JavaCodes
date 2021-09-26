import java.util.*;
class Sale1
{
    int Salesman[]=new int[10];
    int i;
	String name;
	double commissions;
	Scanner s1=new Scanner(System.in);
	void get()
	{
	 for(i=0;i<10;i++)
	 {
        System.out.println("enter name "+name);
		name=s1.nextLine();
		Salesman[i]=s1.nextInt();
		
	 }
	}
	void show()
	{
	for(i=0;i<10;i++)
	{
	System.out.println("salesman"+Salesman[i]);
	}
  }
}
class salepractice
{
	public static void main(String args[])
	{
		int choice;
		Scanner s1=new Scanner(System.in);
		Sale1 s=new Sale1();
		while(true)
		{
		System.out.println("press 1 to Input & validate data");
		System.out.println("press 2 to Display");
		System.out.println("press 3 to Sort by name");
		System.out.println("press 4 to Sort by sales");
		System.out.println("press 5 to Search by name");
		System.out.println("press 6 to Search by sales");
		System.out.println("press 7 to Display statistics");
		System.out.println("press 8 to Exit");
		choice=s1.nextInt();
		switch(choice)
		{
			case 1:
			s.get();
			break;
			case 2:
			s.show();
			break;
			case 3:
			break;
			case 4:
			break;
			case 5:
			break;
			case 6:
			break;
			case 7:
			break;
			case 8:
			System.exit(0);
	        default:
	        System.out.println("Invalid choice:");
		}
		}
	}
}
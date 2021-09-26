import java.util.*;
class grades
{
	public static void main(String args[])
	{
	Scanner s1=new Scanner(System.in);
	int marks;
	System.out.println("enter marks 1 to 100 ");
	marks=s1.nextInt();
	
   if(marks>80) 
     	System.out.println("grade A ");
	else if((marks>60) && (marks<80))
       System.out.println("grade B ");
	else if((marks>40) && (marks<60))
     	System.out.println("grades C");
	else
		System.out.println("fail");


	}

}




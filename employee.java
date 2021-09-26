import java.util.*;
class employee
{
	public static void main(String args[])
	{
	
		Scanner s1=new Scanner(System.in);
		int id;
		double ha,da,com,pf;
		double sal,totalsal;
		System.out.println("Enter id and sal  :");
		id=s1.nextInt();
		sal=s1.nextDouble();
		ha=(sal*10)/100;
		da=(sal*20)/100;
		com=(sal*5)/100;
		pf=(sal*10)/100;
		totalsal=sal+ha+da+com-pf;
		System.out.println("HA @ 10% = "+ha);
		System.out.println("value of da = "+da);
		System.out.println("value of com = "+com);
		System.out.println("value of pf = "+pf);
		System.out.println("total sal = "+totalsal);

		
		

	}
}
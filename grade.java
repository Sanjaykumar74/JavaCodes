import java.util.Scanner;
class grade
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the six subject marks:");
int hindi=sc.nextInt();
int punjabi=sc.nextInt();
int english=sc.nextInt();
int math=sc.nextInt();
int science=sc.nextInt();
int socialstudies=sc.nextInt();
int totalmarks=hindi+punjabi+english+math+science+socialstudies;
int percentage=(totalmarks*100)/600;
System.out.println("Total marks of subjects="+totalmarks);
System.out.println("Percentage of student="+percentage);
if(percentage<=40)
{
System.out.println( "grade is fail");
}
else if(percentage>40 && percentage<=55)
{
System.out.println("grade is third");
}
else if(percentage>55 && percentage<=70)
{
System.out.println("grade is second");
}
else if(percentage>70 && percentage<=85)
{
System.out.println("grade is first");
}
else
{
System.out.println("grade is excellent");
}
}
}
import java.util.*;
class year
{
  public static void main(String args[])
  {
  Scanner s1=new Scanner(System.in);
  int year,month,week,days;
  System.out.println("Enter the no. of days ");
  days=s1.nextInt();
  year=days/365;
  days=days%365;
  month=days/30;
  days=days%30;
  week=days/7;
  days=days%7;
  System.out.println("year "+year);
  System.out.println("month "+month);
  System.out.println("week "+week);
  System.out.println("days "+days);

}
}
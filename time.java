import java.util.*;
class time
{
  public static void main(String args[])
  {
  Scanner s1=new Scanner(System.in);
  int hours,min,sec,n;
  System.out.println("Enter time  is second ");
  n=s1.nextInt();
  hours=n/3600;
  n=n%3600;
  min=n/60;
  sec=n%60;
  System.out.println("Hours "+hours);
  System.out.println("min "+min);
  System.out.println("sec "+sec);

}
}
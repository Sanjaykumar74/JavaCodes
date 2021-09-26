class swap2
{
   public static void main(String args[])
   {
   int a,b;
   a=30;
   b=15;
   System.out.println(" Before Swapping:");
   System.out.println("a = " +a+" b = " +b);
   a=a+b;
   b=a-b;
   a=a-b;
   System.out.println(" after Swapping:");
   System.out.println(" a = " +a+ " b = " +b);
   }
}
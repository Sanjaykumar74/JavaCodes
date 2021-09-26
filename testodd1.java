import java.util.Scanner;
public class Testodd1 {
    public static void main(String args[]) {
        int num, i;
        Scanner sc = new Scanner(System.in);
       
        for (i = 1; i <= 10; i++)
        {
             System.out.println("Enter the number:");
             num = sc.nextInt();
            if (num % 2 == 0)
            {
                System.out.println("This number is even:");
            }
            else
            {
                System.out.println("This number is odd:");
            }
        }
    }
}
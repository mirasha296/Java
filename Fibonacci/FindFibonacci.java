
/**
 * Write a description of class FindFibonacci here.
 *
 * @Miriam Shamsiev
 * Findind Fibonacci Number
*/
import java.util.Scanner;

public class FindFibonacci {
   public static void main(String[] args) {
      Scanner keyb = new Scanner(System.in);
      System.out.print("Enter a positive number: ");
      int n = keyb.nextInt();

      if (n < 0) {
         System.out.println("Error: input must be a positive");
         return;
      }

      int fib0 = 0;
      int fib1 = 1;
      int fibn = 0;

      if (n == 0) {
         fibn = fib0;
      } else if (n == 1) {
         fibn = fib1;
      } else {
         for (int i = 2; i <= n; i++) {
            fibn = fib0 + fib1;
            fib0 = fib1;
            fib1 = fibn;
         }
      }

      System.out.println("The " + n + "th Fibonacci number is " + fibn);
   }
}
/*
 * output:
Enter a positive number: 4
The 4th Fibonacci number is 3

 */

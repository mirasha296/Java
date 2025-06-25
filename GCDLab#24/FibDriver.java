
/**
 *
 */
import java.util.Scanner;
public class FibDriver
{
    public static void main(String[] args)
    {
        int i = 0;
        for(i = 0; i < 2; i++){
            Scanner keyb = new Scanner(System.in);
            Fib Object = new Fib();
            
            int n;
            System.out.println("What value of Fibonacci do you want to locate? ");
            n = keyb.nextInt();
            
            System.out.println("The "+ n + "th Fibonacci number is: " + Object.fib(n));
        }
    }
}

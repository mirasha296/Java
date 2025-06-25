
/**
 */
public class Fib {
    // fib() - A Recursive Fibonacci function
    public int fib(int n) {
        if (n <= 1)
        // The simple case
            return(n);
        else
        // The Recursive case
            return(fib(n-1) + fib(n-2));
    }
}
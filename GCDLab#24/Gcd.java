
public class Gcd {
    // gcd() - Finds the Greatest Common Divisor
    public int gcd(int x, int y) {
        if (x < y)
        // Reverse the parameter
        // y cannot be larger
            return(gcd(y, x));
        else if (x % y == 0)
        // The simple case
            return(y);
        else // The Recursive case
            return(gcd(y, x % y));
    }
}
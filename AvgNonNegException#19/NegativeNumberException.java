
/**throw NegativeNumberException
 */
public class NegativeNumberException extends Exception {
    public NegativeNumberException() {
        super("Please enter non-negative numbers[Negative Num Error]");
    }

    public NegativeNumberException(String message) {
        super(message);
    }
}

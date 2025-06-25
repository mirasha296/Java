
/**
 * * If the user enter anything other than a legal month number (integers 1 
 * through 12), your program will throw and catch MonthException and ask the 
 * user to re-enter the month.
 */
public class MonthException extends Exception
{
    public MonthException()
    {
        super("[Error] Please enter only number months within the year(ex: 1-12)...");

    }
    public MonthException(String message)
    {
        super(message);
    }
}

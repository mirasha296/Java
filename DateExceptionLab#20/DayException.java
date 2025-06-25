
/**
 *  * Similarly, if the user enters anything other than a valid day number 
 * (integers 1 through 28, 29, 30, or 31 depending on the month and year), 
 * then your program will throw and catch a DayException and ask the user to
 * re-enter the day.
 */
public class DayException extends Exception
{
    public DayException()
    {
        super("[Error] Please enter only numbers within a month(ex: 1-31)...");

    }
    public DayException(String message)
    {
        super(message);
    }
}

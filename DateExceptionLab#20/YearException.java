
/**
 * If the user enter a year outside the range 1000 through 3000 (inclusive), 
 * then your program will throw and catch a YearException and ask the user
 * to re-enter the year
 */
public class YearException extends Exception
{
    public YearException()
    {
        super("[Error] Please enter only numbers within the years(ex:1000-3000)...");

    }
    public YearException(String message)
    {
        super(message);
    }
}

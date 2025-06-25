
/**
 * Write a description of class Drama here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Drama extends Movie
{
    public Drama(String MPAA, String ID, String MovTitle)
    {
        super(MPAA, ID, MovTitle);
    }
    public double calcLateFees(int LateFee)
    {
        return LateFee * 2.0;
    }
    //overriding
    public String VideoRentalSummary(String MPAA, String ID, String MovTitle, int LateFee)
    {
        return "Video Rental Summary: \n "+ "MPAA rating:  "+ MPAA + "|\n" + 
                        "Movie ID number: " + ID + "|\n" + "Movie Title Name:"
                        + MovTitle + "|\n" + "Your Calculated Total Late Fee: $" + 
                        LateFee;
    }
}

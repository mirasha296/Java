
/**
 * 
 */
public class Comedy extends Movie
{
    public Comedy(String MPAA, String ID, String MovTitle)
    {
        super(MPAA, ID, MovTitle);
    }
    public double calcLateFees(int LateFee)
    {
        return LateFee * 2.5;
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

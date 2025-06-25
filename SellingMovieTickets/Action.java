
/**
 * Next, create three additional classes named Action,
 * Comedy and Drama that are derived from Movie.
 */
public class Action extends Movie
{
    public Action(String MPAA, String ID, String MovTitle){
        super(MPAA,ID,MovTitle);//incorporating super()
    }
    //override 
    public double calcLateFees(int LateFee)
    {
        return LateFee * 3.0;
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

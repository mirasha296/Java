
/**
 * Movie Class #16
 *
 * Miriam Shamsiev
 * 04/18/2023
 * Create a class called Movie that can be used with your video rental 
 * business. The Movie class should track the movie Picture Association of
 * America (MPAA) rating (e.g., Rated G, PG, PG-13, R), ID Number, 
 * and movie title with appropriate accessor and mutator methods.
 * Also, create an equals() method that overrides Object's method, 
 * where two movies are equal if their ID number is identical.
 * Next, create three additional classes named Action, Comedy and Drama 
 * that are derived from Movie.
 * Finally, create an an overidden method called calcLateFees that takes an 
 * input the number of days a movie is late and returns a late fee for that 
 * movie. The default late fee is $2/day. Action movies have a late fee of 
 * $3/day, comedies are $2.50/day and drama are $2/day. Test your classes 
 * from a main method.
 */
public class Movie
{
    protected String MPAA;//Movie rating:pg,pg13,rated r
    protected String ID;//movie id number
    protected String MovTitle;//movie title
    
    //default
    public Movie()
    {
        MPAA = new String();
        ID = new String();
        MovTitle = new String();
    }
    //conversion
    public Movie(String newMPAA, String newID, String newMovTitle)
    {
        MPAA = newMPAA;
        ID = newID;
        MovTitle = newMovTitle;
    }
    //copy
    public Movie(Movie other)
    {
        MPAA = other.MPAA;
        ID = other.ID;
        MovTitle = other.MovTitle;
    }
    //accessors
    public String getMPAA()
    {
        return MPAA;
    }
    //mutators
    public void setMPAA(String newMPAA)
    {
        MPAA = newMPAA;
    }
    
    public String getID()
    {
        return ID;
    }
    public void setID(String newID)
    {
        ID = newID;
    }
    
    public String getMovTitle()
    {
        return MovTitle;
    }
    public void setMovTitle(String newMovTitle)
    {
        MovTitle = newMovTitle;
    }
    //equals
    public boolean equals(Movie other)
    {
        return ID == other.ID;
    }
    //calcfees overiding
    public double calcLateFees(int LateFee)
    {
        return LateFee * 2.0;
    }
    
    public String VideoRentalSummary(String MPAA, String ID, String MovTitle)//, int LateFee)
    {
        return "Video Rental Summary: \n "+ "MPAA rating:  "+ MPAA + "|\n" + 
                        "Movie ID number: " + ID + "|\n" + "Movie Title Name:"
                        + MovTitle + "|\n" + "Your Calculated Total Late Fee: $";// + 
                       // LateFee;
    }
}

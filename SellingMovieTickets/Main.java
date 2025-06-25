
/**
 * 
 */
public class Main
{
    public static void main(String[] args)
    {
        // Create a new Movie object
        Movie m = new Movie("PG", "12345", "The Lion King");
        
        // Print the movie's details and late fee
        System.out.println("Movie Details |");
        System.out.println("Rating | " + m.getMPAA());
        System.out.println("ID | " + m.getID());
        System.out.println("Title | " + m.getMovTitle());
        System.out.println("Late Fee | $" + m.calcLateFees(3)); // assuming 3 days late
        
        // Create a new Action object
        Action a = new Action("PG", "67890", "Super Mario Bros.");
        
        // Print the action movie's details and late fee
        System.out.println("\nAction Movie Details |");
        System.out.println("Rating |  " + a.getMPAA());
        System.out.println("ID | " + a.getID());
        System.out.println("Title | " + a.getMovTitle());
        System.out.println("Late Fee | $" + a.calcLateFees(0)); // assuming 2 days late
        
        // Create a new Comedy object
        Comedy c = new Comedy("Rated R", "24680", "The Hangover");
        
        // Print the comedy movie's details and late fee
        System.out.println("\nComedy Movie Details |");
        System.out.println("Rating | " + c.getMPAA());
        System.out.println("ID | " + c.getID());
        System.out.println("Title | " + c.getMovTitle());
        System.out.println("Late Fee | $" + c.calcLateFees(5)); // assuming 5 days late
        
        // Create a new Drama object
        Drama d = new Drama("PG", "13579", "Hidden Figures");
        
        // Print the drama movie's details and late fee
        System.out.println("\nDrama Movie Details |");
        System.out.println("Rating | " + d.getMPAA());
        System.out.println("ID | " + d.getID());
        System.out.println("Title | " + d.getMovTitle());
        System.out.println("Late Fee | $" + d.calcLateFees(1)); // assuming 1 day late
}
}
/*
 * OUTPUT:
        Movie Details |
        Rating | PG
        ID | 12345
        Title | The Lion King
        Late Fee | $6.0
        
        Action Movie Details |
        Rating |  PG
        ID | 67890
        Title | Super Mario Bros.
        Late Fee | $0.0
        
        Comedy Movie Details |
        Rating | Rated R
        ID | 24680
        Title | The Hangover
        Late Fee | $12.5
        
        Drama Movie Details |
        Rating | PG
        ID | 13579
        Title | Hidden Figures
        Late Fee | $2.0
        
 */

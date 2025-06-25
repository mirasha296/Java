import java.util.Scanner;
/**
 * 
 */
public class Game //driver
{ 
    public static void main()
    {
        
        boolean loop = true;
        boolean playAgain = false;
        
        
        System.out.println("Welcome to the King Of Stacks!\n");
    
        do
        {
            Scanner keyb = new Scanner(System.in);
            System.out.println("Enter the number of rounds (no less than 30)");
            int turns = keyb.nextInt();
            
        
            
            while (turns < 30)
            {
                System.out.println("Please enter a number greater than 30");
                turns = keyb.nextInt();
            }
            
            KingOfStacks game = new KingOfStacks(turns);
            game.playGame();
            game.UpdateScore(); 
            
            System.out.println("Do you want to play again? Y or N");
            String returnValue = keyb.next();
            
            if(returnValue.equalsIgnoreCase("y"))
            {
                playAgain = true;
            }
            
            if(returnValue.equalsIgnoreCase("n"))
            {
                playAgain = false;
            } 
            
        }
        while(playAgain == true);
    }
}
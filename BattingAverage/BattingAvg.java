
/**
 * Write a description of class BattingAvg here.
 * The manager of the New York Mets know how many times his starting line-up 
 * has gone to bat. He even knows how many hits they each have.
 * But he doesn't know their batting averages (explains a lot about this 
 * season, wouldn't you say?).
Your program will read in the number of times at bat and the number of hits
 for nine (9) players. Then you will calculate the batting average using the 
 formula:
Batting Average = Hits / At Bats
After you calculate the batting average for each player, 
print his hits, at bats and batting average.
 *
 * Miriam Shamsiev
 * assignment #6
 */

import java.util.Scanner;

public class BattingAvg{ //plan is to create a for loop 
    public static void main(String[] args){
        Scanner keyb = new Scanner(System.in);
        int PlayerAtBat, HitsPerPlayer;
        double BattingAvg;
        
        for(int player = 1; player <= 9; player++) {
            System.out.println("Enter amount at bat for player "+player+": " );
            PlayerAtBat = keyb.nextInt();
            System.out.println("Enter amount of hits for player "+player+": ");
            HitsPerPlayer = keyb.nextInt();
            BattingAvg = (HitsPerPlayer)/PlayerAtBat;
            System.out.println("The batting average for player "+player+ " is: ");
            System.out.println(BattingAvg);
            
        }
        
    }
}
/*
 * OUTPUT SHOULD BE: I put 3 for every input
 * Enter amount at bat for player 1: 
3
Enter amount of hits for player 1: 
3
The batting average for player 1 is: 
1.0
Enter amount at bat for player 2: 
3
Enter amount of hits for player 2: 
3
The batting average for player 2 is: 
1.0
Enter amount at bat for player 3: 
3
Enter amount of hits for player 3: 
3
The batting average for player 3 is: 
1.0
Enter amount at bat for player 4: 
3
Enter amount of hits for player 4: 
3
The batting average for player 4 is: 
1.0
Enter amount at bat for player 5: 
3
Enter amount of hits for player 5: 
3
The batting average for player 5 is: 
1.0
Enter amount at bat for player 6: 
3
Enter amount of hits for player 6: 
3
The batting average for player 6 is: 
1.0
Enter amount at bat for player 7: 
3
Enter amount of hits for player 7: 
3
The batting average for player 7 is: 
1.0
Enter amount at bat for player 8: 
3
Enter amount of hits for player 8: 
3
The batting average for player 8 is: 
1.0
Enter amount at bat for player 9: 
3
Enter amount of hits for player 9: 
3
The batting average for player 9 is: 
1.0
 */

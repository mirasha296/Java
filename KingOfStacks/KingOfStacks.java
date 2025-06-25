import java.util.Random; //import randomizer
import java.util.EmptyStackException;

/**
 * 
 */
public class KingOfStacks 
{
    StackInterface<Disk> stack1;
    StackInterface<Disk> stack2;
    StackInterface<Disk> stack3;
    
    private int P1Score;
    private int P2Score;
    private int currentRound;
    private int totalRounds;
    
    //initialize and call methods 
    public KingOfStacks(int turns)
    {
        totalRounds = turns;
        currentRound = 0;
        P1Score = 0;
        P2Score = 0;
        
        //initalizing the 3 stacks from StackInterface
        stack1 = new ArrayStack();
        stack2 = new LinkedStack();
        stack3 = new VectorStack();
        
        
        
    }
    //playGame(), this is where the game happens
    public void playGame()
    {
        //System.out.println("Welcome to King Of Stacks Game!");

        P1Score = 0;//set scores back to 0
        P2Score = 0;
    
        currentRound = 1;
        stack1.clear();
        stack2.clear();
        stack3.clear();//sets the stack() to clear/empty
        //game reset
        for (int i = 0; i <= totalRounds - 1; i++)
        {
            playRound();
            currentRound++; //so we know what round this currently is on
        
        }  
    }
    
    public void UpdateScore()//using the isEmpty method to check and update score
    {
        //check/update the score
        //display winner 
        while(!stack1.isEmpty())//tutor helped me with this one from L&W center
        {
            Disk popDisk = stack1.pop();
            if (popDisk.getPlayerMarker() == 1){
                P1Score++;
            }
            else  if(popDisk.getPlayerMarker() == 2){
                P2Score++;
            }
        }
         while(!stack2.isEmpty())
        {
            Disk popDisk = stack2.pop();
            if (popDisk.getPlayerMarker() == 1){
                P1Score++;
            }
            else  if(popDisk.getPlayerMarker() == 2){
                P2Score++;
            }
        }
        //System.out.println("\nHere are the score stats through rounds: ");
         while(!stack3.isEmpty())
        {
            Disk popDisk = stack3.pop();
            if (popDisk.getPlayerMarker() == 1){
                P1Score++;
                //System.out.println("Player1 score: "+ P1Score);
            }
            else  if(popDisk.getPlayerMarker() == 2){
                P2Score++;
                //System.out.println("Player2 score: "+ P2Score);
            }
        }
        System.out.println("\nPlayer1 final score: "+ P1Score);
        System.out.println("Player2 final score: "+ P2Score);
        if(P1Score > P2Score){
            System.out.println("\nPlayer 1 has won the game!");
        }
        else if(P2Score > P1Score){
            System.out.println("\nPlayer 2 has won the game!");
        }
        else if(P1Score == P2Score){
            System.out.println("\nIt's a tie!");
        }
        
    }
    public void playRound()
    {
        
        System.out.println("\nRound number: " + currentRound);
        
        playerTurn(1);
        playerTurn(2);
        checkPop();
    }
    
    //push()
    public void playerTurn(int playerNum)
    {
        //make the disk for players
        Disk pushDisk = new Disk(playerNum);
        
        //import random will take place here now to choose a random stack
        Random randomStack = new Random();//makes random
        int stack = randomStack.nextInt(3);//goes up to the index - 1
        //so ex: 0,1,2,3 -1 = 2
        //heres how its used with stacks
        
        if(stack == 0) //this is stack1 but has the index of 0
        {
            //let the players know who initiate what stack
            System.out.println("Player" + playerNum + " pushed disk onto stack 1.");
            
            //pushes onto disk that we initialized previously
            stack1.push(pushDisk);
        }
        
        if(stack == 1)
        {
            System.out.println("Player" + playerNum + " pushed disk onto stack 2.");
            
            stack2.push(pushDisk);
        }
        
        if(stack == 2)
        {
            System.out.println("Player" + playerNum + " pushed disk onto stack 3.");
            
            stack3.push(pushDisk);
        }
        //pushed disks to stacks 1,2 & 3 with indexes of 0,1,2
        
    }
    //pop()
    public void checkPop()
    {
        //pop disc from stack 1 every 3 rounds:
        if(currentRound % 3 == 0)
        {
            //exception
            try
            {
                Disk returned = stack1.pop();
                int playerNum = returned.getPlayerMarker();
                System.out.println("Player" + playerNum + "'s disk was popped from stack 1");
            }
            catch(EmptyStackException error)
            {
                System.out.println("Stack 1 is now empty\n");
            }
        }
        //from stack 2 every 5 rounds:
        if(currentRound % 5 == 0)
        {
            //exception
            try
            {
                Disk returned = stack2.pop();
                int playerNum = returned.getPlayerMarker();
                System.out.println("Player" + playerNum + "'s disk was popped from stack 2");
            }
            catch(EmptyStackException error)
            {
                System.out.println("Stack 2 is now empty\n");
            }
        }
        //from stack 3 every 8 rounds:
        if(currentRound % 8 == 0)
        {
            //exception
            try
            {
                Disk returned = stack3.pop();
                int playerNum = returned.getPlayerMarker();
                System.out.println("Player" + playerNum + "'s disk was popped from stack 3");
            }
            catch(EmptyStackException error)
            {
                System.out.println("Stack 3 is now empty\n");
            }
        }
    }
        
}

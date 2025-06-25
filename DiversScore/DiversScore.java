
/**
 * Write a description of class DiversScore here.
 *
 * Miriam Shamsiev
 * 03/20/2023

 * Assignment #13 - Calculating A Diver's Score in a Competition
In the sport of diving, seven judges award a score between 0 and 10,
 where each score may be a floating point value. 
 The highest and lowest scores are thrown out and the remaining scores are added together. 
 The sum is then multiplied by the degree of difficulty for the dive. The degree of difficulty
 ranges from 1.2 to 3.8 points. The total is then multiplied by 0.6 to determine the diver's score.
Write a computer program that inputs a degree of difficult and seven judges' scores and output the
 overall score for that dive. The program should ensure that all inputs are within the allowable data
 ranges. Your program should be well designed and divided between various methods that are designed 
 to do a specific task. And, of course, well-commented.

 */

import java.util.Scanner;
public class DiversScore
{
    public static void main(String[] args)
    {
        double[] scores = new double[7]; //Declaring array
        int i = 0;//initializing variable i
        
        Scanner keyb = new Scanner(System.in);//user input to get 7 judge scores
        
        double sum = 0;
        //int index = i +1; 
        //System.out.println("Please enter dive score" + index + " [0-10]: ");
        //scores[i] = keyb.nextDouble();
        //while(scores[i] >= 0 || scores[i] <= 10)
      for(i = 0; i < scores.length; i++)
        {
            //array loop
            int index = i + 1;
            System.out.println("Please enter dive score " + index + " [0-10]: ");
            scores[i] = keyb.nextDouble();
            while(scores[i] < 0 || scores[i] > 10)
            {  
            System.out.println("Score out of bounds. Please enter score for dive "+ index + "[0-10]: ");
            scores[i] = keyb.nextDouble();
            }
            sum += scores[i];//adds to the sum with every round of input
        }
        
        double maxScore = 0, minScore = 10;
        //find the highest score
        for(i = 0; i < scores.length; i++)
        {
            if(scores[i] > maxScore)
                maxScore = scores[i];
        }
        System.out.println("Maximum Score: " + maxScore);//print the max value
            //starter   //finished    //increment
        for(i = 0; i < scores.length; i++)
        {
            if(scores[i] < minScore)
                minScore = scores[i];
        }
        System.out.println("Minimum Score: " + minScore);//print minimum value
        System.out.println(sum);//prints total sum after user input 
        double minMaxTotal = minScore + maxScore;
        sum = sum - minMaxTotal; //subract from sum
        System.out.println("Total Sum after reduction of the min and max score: " +sum);
        
        double degreeDifficulty;//ranges from 1.2 to 2.8 and then multiplied to the final sum
        System.out.println("Enter a degree of difficulty:[1.2 - 2.8] ");
        degreeDifficulty = keyb.nextDouble();
        System.out.println(degreeDifficulty);
        while(degreeDifficulty < 1.2 || degreeDifficulty > 2.8)
        {
            System.out.println("Value out of bounds. Enter a degree of difficulty:[1.2 - 2.8] ");
            degreeDifficulty = keyb.nextDouble();
            System.out.println(degreeDifficulty);
        }   
        double finalScore = sum * degreeDifficulty * 0.6;//multiply the degree of difficulty to the sum
        System.out.println("The Divers final score: " + finalScore);
        
    }
}
/*
 * Output:
Please enter dive score 1 [0-10]: 
1
Please enter dive score 2 [0-10]: 
2
Please enter dive score 3 [0-10]: 
3
Please enter dive score 4 [0-10]: 
1
Please enter dive score 5 [0-10]: 

2
Please enter dive score 6 [0-10]: 
3
Please enter dive score 7 [0-10]: 
1
Maximum Score: 3.0
Minimum Score: 1.0
13.0
Total Sum after reduction of the min and max score: 9.0
Enter a degree of difficulty:[1.2 - 2.8] 
2
2.0
The Divers final score: 10.799999999999999

 */
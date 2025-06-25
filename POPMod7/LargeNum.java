//Miriam Shamsiev
//Programming Module Assignment #7

import java.util.*;
import java.lang.*;
 
public class LargeNum
{
    public static void main(String args[])
    {
        final int SIZE = 1000000;
        int[] intArray = new int[SIZE];
        float[] floatArray = new float[SIZE];
        Random rand = new Random();
        
        
        //1. Allocating random numbers in INT array 
        double intArrayStartTime = System.nanoTime();
        for(int i = 0; i < SIZE - 1; i++)
        {
            intArray[i] = rand.nextInt();
        } 
        double intArrayEndTime = System.nanoTime();
        double intArrayTotalTime = (intArrayEndTime - intArrayStartTime) / 1000000;//converting nanoseconds to milliseconds
        System.out.println("Time to run allocating Int Array: " + intArrayTotalTime + "ms");
        
        
        //1. Allocating random numbers in FLOAT array 
        double floatArrayStartTime = System.nanoTime();
        for(int i = 0; i < SIZE - 1; i++)
        {
            floatArray[i] = rand.nextFloat();
        } 
        double floatArrayEndTime = System.nanoTime();
        double floatArrayTotalTime = (floatArrayEndTime - floatArrayStartTime) / 1000000;
        System.out.println("Time to run allocating Float Array: " + floatArrayTotalTime + "ms");
        
        
        //2. Time to Iterating through Array         
        double intIterArrayStartTime = System.nanoTime();
        for(int i = 1; i < SIZE-1; i++ )
        {
            intArray[i] = 0;//nothing happening here since we are just trying to see how long to iterate through array
        }
        double intIterArrayEndTime = System.nanoTime();
        double intIterArrayTotalTime = (intIterArrayEndTime - intIterArrayStartTime) / 1000000;
        System.out.println("\nTime to iterate through Int Array: " + intIterArrayTotalTime + "ms");
        
        
        //2. Same thing but now for Float Array
        double floatIterArrayStartTime = System.nanoTime();
        for(int i = 1; i < SIZE-1; i++ )
        {
            floatArray[i] = 0;
        }
        double floatIterArrayEndTime = System.nanoTime();
        double floatIterArrayTotalTime = (floatIterArrayEndTime - floatIterArrayStartTime) / 1000000;
        System.out.println("Time to iterate through Float Array: " + floatIterArrayTotalTime + "ms");
        
        
        //3. Calculating and replacing the index before and the index after
        double intStartTime = System.nanoTime();
        for(int i = 1; i < SIZE-1; i++ )//starting at 1 to not going into IndexOutOfBounds
        {
            intArray[i] = (((i-1) + (i+1))/2);
        }
        double intEndTime = System.nanoTime();
        double intTotalTime = (intEndTime - intStartTime) / 1000000;
        System.out.println( "\nTime to calculate average of Int Array: " + intTotalTime +  "ms");
        
        //3. float calculation
        double floatStartTime = System.nanoTime();
        for(int i = 1; i < SIZE-1; i++ )//starting at 1 to not going into IndexOutOfBounds
        {
            floatArray[i] = (((i-1) + (i+1))/2);
        }
        double floatEndTime = System.nanoTime();
        double floatTotalTime = (floatEndTime - floatStartTime) / 1000000;
        System.out.println( "Time to calculate average of Float Array: " + floatTotalTime +  "ms");
        
        
        //4. Calculate the time difference between #2 & #3 for Int 
        System.out.println("\nSystem Integer Difference: " + Math.abs(intTotalTime - intIterArrayTotalTime));
        System.out.println("\nSystem Float Difference: " + Math.abs(floatTotalTime - floatIterArrayTotalTime));
    }
 }

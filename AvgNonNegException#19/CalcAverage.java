
/**
 * Write a program that will ask the user for the number of values 
 * to be averaged. Then it will allow the user to enter that number 
 * of non-negative values. If the user enters a negative value, 
 * handle it by throwing a NegativeNumberException.
 * 
 * This will require to write a subclass of Exception called 
 * NegativeNumberException, which will need its own constructors
 * 
 * Miriam Shamsiev
 * April 2023
 * Lab #19
 **/
import java.util.Scanner;
import java.util.InputMismatchException;

public class CalcAverage {
    
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        boolean x = true;//for while loop
        
        //implement a while loop to continue program after catches
        while (x) {
            double value = 0;
            int count = 0;
            
            //implement the try and catch method for all possible error
            try {
                System.out.println("Enter the number of values to average: ");
                int values = keyb.nextInt();
                //if statement to throw the Negative Number Exception extended class
                //user should not be able to use a negative
                if (values < 0) {
                    throw new NegativeNumberException("[Error]Please enter a non-negative number");
                }
                for (int i = 0; i < values; i++) {
                    System.out.println("Enter the number for value " + (i + 1) + ":");
                    double input = keyb.nextDouble();
                    value += input;
                    count++;
                }
                double average = 0;
                if (count > 0) {
                    average = value / count;
                }
                System.out.print("Total average = " + average);
                
                //here the while loop continues unless user inputs otherwise
                System.out.println("\nWould you like to go again?[Y/N]");
                String answer = keyb.next().toLowerCase();
                
                if (answer.equals("y")) {
                    x = true;
                    
                } else {
                    x = false;
                    
                }
            } catch (NegativeNumberException e) {
                System.out.println(e.getMessage());
                //error caught only negative numbers
            } catch (InputMismatchException e) {
                System.out.println("Please enter numbers only. ");
                keyb.nextLine();
                //error caught any input other than a number(could be negative or positive)
            }
        }
    }
}

/**
 * OUTPUT:
    Enter the number of values to average: 
    2
    Enter the number for value 1:
    3
    Enter the number for value 2:
    5
    Total average = 4.0
    Would you like to go again?[Y/N]
    y
    Enter the number of values to average: 
    -1
    [Error]Please enter a non-negative number
    Enter the number of values to average: 
    f
    Please enter numbers only. 
    Enter the number of values to average: 
    1
    Enter the number for value 1:
    1
    Total average = 1.0
    Would you like to go again?[Y/N]
    n
 */


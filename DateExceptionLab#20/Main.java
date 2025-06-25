/**
 * Write a program that converts dates from numerical month/day/year format 
 * to normal "month day, year" format (e.g., 4/6/2018 becomes April 6, 2018).
 * You will define three exception classes one called MonthException, 
 * another called DayException , and a third called YearException 
 * 
 * If the user enter anything other than a legal month number (integers 1 
 * through 12), your program will throw and catch MonthException and ask the 
 * user to re-enter the month.
 * 
 * Similarly, if the user enters anything other than a valid day number 
 * (integers 1 through 28, 29, 30, or 31 depending on the month and year), 
 * then your program will throw and catch a DayException and ask the user to
 * re-enter the day.
 * 
 * If the user enter a year outside the range 1000 through 3000 (inclusive), 
 * then your program will throw and catch a YearException and ask the user
 * to re-enter the year
 * 
 * Miriam Shamsiev 
 * Lab #20 
 * 29 April 2023
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main
{
    public static void main(String args[]){
        Scanner keyb = new Scanner(System.in);
        boolean x = true;
        int Month = 0;
        int Day = 0;
        String MonthName = new String();
        
        while(x){
            try {
                System.out.println("Enter the number of the Month: ");
                Month = keyb.nextInt();
                
                if(Month > 12){
                    throw new MonthException("[Error] Please enter correct month date(ex: 1-12)...");
                }
                
                System.out.println("Please Enter the day of the month: ");
                Day = keyb.nextInt();
                if (Month  == 1 && Day <= 31 ){
                    MonthName = "January";
                } else if (Month  == 2 && Day <= 28){
                    MonthName = "February";
                } else if (Month  == 3 && Day <= 31){
                    MonthName = "March";
                } else if (Month  == 4 && Day <= 30){
                    MonthName = "April";
                } else if (Month  == 5 && Day <= 31){
                    MonthName = "May";
                } else if (Month  == 6 && Day <= 30){
                    MonthName = "June";
                } else if (Month  == 7 && Day <= 31){
                    MonthName = "July";
                } else if (Month  == 8 && Day <= 31){
                    MonthName = "August";
                } else if (Month  == 9 && Day <= 30){
                    MonthName = "September";
                } else if (Month  == 10 && Day <= 31){
                    MonthName = "October";
                } else if (Month  == 11 && Day <= 30){
                    MonthName = "November";
                } else if (Month  == 12 && Day <= 31){
                    MonthName = "December";
                }
                
                if(Day > 31){
                    throw new DayException("[Error] Please enter only numbers within a month(ex: 1-31)...");
                }
                
                System.out.println("Please Enter the year: ");
                int Year = keyb.nextInt();
                
                if(Year > 3000 || Year < 1000){
                    throw new YearException("[Error] Please enter only numbers within the years(ex:1000-3000)...");
                }
                
                System.out.println(MonthName + " "+ Day +", " + Year);
                
                System.out.println("Would you like to go again?[Y/N]");
                String input = keyb.next().toLowerCase();
                if (input.equals("y")) {
                    x = true;
                    
                } else {
                    x = false;
                    
                }
            }   catch(MonthException e){
                    System.out.println(e.getMessage());
            }   catch(DayException e){
                    System.out.println(e.getMessage());
            }   catch(YearException e){
                    System.out.println(e.getMessage());
            }   catch (InputMismatchException e) {
                    System.out.println("Please enter numbers only. ");
                    keyb.nextLine();
                }
            // if (Month  == 1 && Day <= 31 ){
                // MonthName = "January";
            // } else if (Month  == 2 && Day <= 28){
                // MonthName = "February";
            // } else if (Month  == 3 && Day <= 31){
                // MonthName = "March";
            // } else if (Month  == 4 && Day <= 30){
                // MonthName = "April";
            // } else if (Month  == 5 && Day <= 31){
                // MonthName = "May";
            // } else if (Month  == 6 && Day <= 30){
                // MonthName = "June";
            // } else if (Month  == 7 && Day <= 31){
                // MonthName = "July";
            // } else if (Month  == 8 && Day <= 31){
                // MonthName = "August";
            // } else if (Month  == 9 && Day <= 30){
                // MonthName = "September";
            // } else if (Month  == 10 && Day <= 31){
                // MonthName = "October";
            // } else if (Month  == 11 && Day <= 30){
                // MonthName = "November";
            // } else if (Month  == 12 && Day <= 31){
                // MonthName = "December";
            // }
            
            
            
        }
    }
}
/**
 * OUTPUT
 * Enter the number of the Month: 
    2
    Please Enter the day of the month: 
    29
    Please Enter the year: 
    2023
     29, 2023
    Would you like to go again?[Y/N]
    y
    Enter the number of the Month: 
    n
    Please enter numbers only. 
    Enter the number of the Month: 
    13
    [Error] Please enter correct month date(ex: 1-12)...
    Enter the number of the Month: 
    6
    Please Enter the day of the month: 
    29
    Please Enter the year: 
    2004
    June 29, 2004
    Would you like to go again?[Y/N]
    n
 */
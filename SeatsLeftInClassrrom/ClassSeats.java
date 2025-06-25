
/**
 * Write a description of class ClassSeats here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner; 

public class ClassSeats {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter total number of students in classroom: ");
        int students = user.nextInt();
        
        System.out.println("Enter total number of seats in classroom: ");
        int seats = user.nextInt();
        
        if (students < 0 || seats< 0) {
            System.out.println("Number of students cannot be less than 0 ");
            return;
        }
        if (seats - students >= 0) {
            System.out.println("There's " + (seats - students)  
            + " seat(s) available in the classroom");
            
        } else{
            System.out.println("There are no seats left; the class is full");
        }
    }
}
/*
 * Output:
 * Enter total number of students in classroom: 
29
Enter total number of seats in classroom: 
30
There's 1 seat(s) available in the classroom
 */



/**
 * Write a description of class TheEndPartII here.
 *
 * Miriam Shamsiev
 * 12b | 03/23/2023
 */
import java.util.Scanner;
public class TheEndPartII{
public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        String line = "";
        int count = 0;
        while (!line.equals("The end")) {
            System.out.print("Enter a line of text: ");
            line = keyb.nextLine();

            if (line.indexOf("is") != -1) {
                count++;
            }
        }

        System.out.println("Number of lines containing 'is': " + count);
    }
}
/*
 * output:
 * Enter a line of text: my name is Mira
Enter a line of text: The end
Number of lines containing 'is': 1

 */
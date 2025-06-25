
/**
 * Write a description of class TheEnd here.
 *
 * Miriam Shamsiev
 * 12A | 03/23/2023
 */
import java.util.Scanner;

public class TheEnd {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        String input = "";
        while (!input.equals("The end")) {
            System.out.print("Please enter a line of text (or 'The end' to quit): ");
            input = keyb.nextLine();
            System.out.println("You entered: " + input);
        }
        System.out.println("Goodbye! :)");
    }
}
/*
 * Output:
 * Please enter a line of text (or 'The end' to quit): Hi
You entered: Hi
Please enter a line of text (or 'The end' to quit): good night
You entered: good night
Please enter a line of text (or 'The end' to quit): The end
You entered: The end
Goodbye! :)

 */
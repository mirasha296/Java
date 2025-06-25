
/**
 * Write a description of class IsToWas here.
 *
 * Miriam Shamsiev
 * 12c 03/23/2023
*/
import java.util.Scanner;

public class TheEndIsToWas {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        String line = "";
        int count = 0;
        while (!line.equals("The end")) {
            System.out.print("Enter a line of text: ");
            line = keyb.nextLine();

            //replace "is" with "was"
            String newLine = line.replace("is", "was");

            // count the amount of times there was a replacement
            int numReplacements = countReplacements(line, newLine);
            count += numReplacements;

            // print the modified line
            System.out.println("Modified line: " + newLine);
        }

        System.out.println("Number of replacements made: " + count);
    }

    // helper method to count the number of replacements made
    private static int countReplacements(String oldStr, String newStr) {
        int count = 0;
        int index = 0;
        while (index < oldStr.length()) {
            index = oldStr.indexOf("is", index);
            if (index == -1) {
                break;
            }
            count++;
            index += "is".length();
        }
        return count;
    }
}


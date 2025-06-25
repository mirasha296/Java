import java.util.ArrayList;
import java.util.Scanner;

public class ListComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create two lists A and B
        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();

        // Get user input for List A
        System.out.println("Enter elements for List A (type 'done' to finish):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            listA.add(input);
        }

        // Get user input for List B
        System.out.println("Enter elements for List B (type 'done' to finish):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            listB.add(input);
        }

        // Compare the two lists
        System.out.println("\nComparing the two lists:");
        if (listA.equals(listB)) {
            System.out.println("The lists are identical.");
        } else {
            System.out.println("The lists are not identical.");
            // Print elements unique to List A
            ArrayList<String> onlyInA = new ArrayList<>(listA);
            onlyInA.removeAll(listB);
            System.out.println("Elements only in List A: " + onlyInA);

            // Print elements unique to List B
            ArrayList<String> onlyInB = new ArrayList<>(listB);
            onlyInB.removeAll(listA);
            System.out.println("Elements only in List B: " + onlyInB);
        }

        // Close the scanner
        scanner.close();
    }
}
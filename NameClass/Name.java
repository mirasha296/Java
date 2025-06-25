
/**
 * Name Class
 *
 * Miriam Shamsiev
 * Assignment #9 part 1
 */

import java.util.Scanner;
public class Name {
    private String first;
    private char initial;
    private String last;

    public Name() {
        this.first = "";
        this.initial = ' ';
        this.last = "";
    }

    public Name(String first, String last) {
        this.first = first;
        this.initial = ' ';
        this.last = last;
    }

    public Name(String first, char initial, String last) {
        this.first = first;
        this.initial = initial;
        this.last = last;
    }

    public void readName() {
        Scanner keyb = new Scanner(System.in);
        System.out.print("Enter first name: ");
        this.first = keyb.nextLine();
        System.out.print("Enter middle initial: ");
        this.initial = keyb.nextLine().charAt(0);
        System.out.print("Enter last name: ");
        this.last = keyb.nextLine();
    }

    public void writeName() {
        System.out.print(this.first + " " + this.initial + " " + this.last);
    }

    public boolean equals(Name other) {
        return this.first.equals(other.first) &&
                this.initial == other.initial &&
                this.last.equals(other.last);
    }
}

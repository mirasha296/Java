
/**
 * MainForName Class
 *
 * Miriam Shamsiev
 * Assignment #9 part 2
 */

public class MainForName {
    public static void main(String[] args) {
        Name defaultName = new Name();
        System.out.print("Default name: ");
        defaultName.writeName();
        System.out.println();

        Name FirstLast = new Name("Miriam", "Shamsiev");
        System.out.print("Just First and Last Name: ");
        FirstLast.writeName();
        System.out.println();

        Name MiddleInitialInc = new Name("Miriam", 'V', "Shamsiev");
        System.out.print("First, Initial and Last Name: ");
        MiddleInitialInc.writeName();
        System.out.println();

        Name userInputName = new Name();
        userInputName.readName();
        System.out.print("User input name: ");
        userInputName.writeName();
        System.out.println();

        Name name1 = new Name("Miriam", 'Z', "Shamsiev");
        Name name2 = new Name("Miriam", 'Z', "Shamsiev");
        Name name3 = new Name("Miriam", 'z', "Shamsiev?");

        System.out.println("name1 equals name2: " + name1.equals(name2)); // true
        System.out.println("name1 equals name3: " + name1.equals(name3)); // false
    }
}
/*
 * Output expected  
Default name:    
Just First and Last Name: Miriam   Shamsiev
First, Initial and Last Name: Miriam V Shamsiev
Enter first name: Jane
Enter middle initial: A
Enter last name: Doe
User input name: Jane A Doe
name1 equals name2: true
name1 equals name3: false

 * 
 * 
 */
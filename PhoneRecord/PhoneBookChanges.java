
/**
 * Write a description of class PhoneBookChanges here.
 *
 * Miriam Shamsiev
 * assignment 14
 */

//import java.util.Scanner;

// public class PhoneBookChanges{//main to prompt user for the size
    // public static void main(String[] args)
    // {
        // int i;
        // int NumRec = 0;
        // Scanner keyb = new Scanner(System.in);
        // System.out.println("Enter the size: ");
        // int MaxRec = keyb.nextInt();
        // PhoneBook pb = new PhoneBook(NumRec,MaxRec);
        // pb.readRecord();
        // //pb.toString();//not necessary
        // pb.writeRecord(NumRec);
        // pb.writeBook();
    // }
// }// failed attempt
//retry
import java.util.Scanner;

public class PhoneBookChanges{
    public static void main(String[] args)
    {
        int NumRec = 0;
        Scanner keyb = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int MaxRec = keyb.nextInt();
        PhoneBook pb = new PhoneBook(NumRec,MaxRec);
        //in order to print multiple book records the array 
        //of the index needs to be looped again with the used methods
        //readRecord & writeBook calling the new phonebook object pb
        for (int i = 0; i < MaxRec; i++) 
        {
            pb.readRecord();
            //pb.writeRecord(NumRec);
            NumRec++;
        }
        
        int Record; 
        System.out.println("What record do you want to see?");
        Record = keyb.nextInt();
        pb.writeRecord(Record);
        
        System.out.println("Another record: ");
        Record = keyb.nextInt();
        pb.writeRecord(Record);
        
        pb.writeBook();
    }
}
/*
 * OUTPUT:Enter the size: 
2
Enter Your First Name: 
m
Enter Your Last Name: 
s
Enter Your Number: 
1
Enter Your First Name: 
mi
Enter Your Last Name: 
sh
Enter Your Number: 
12
What record do you want to see?
0
m	s	1
Another record: 
1
mi	sh	12
m	s	1
mi	sh	12
 */

/**
/**
 * Miriam Shamsiev
 * Assignment #14
Methods to include:
readRecord() - which reads in a new phone record.
toString(int i) - which returns a string containing record #i
writeRecord(int i) - which writes record #i.
writeBook() - which writes the entire phone book.
 */
import java.util.Scanner;
public class PhoneBook
{
    int i = 0;//initializing i
    public int MaxRec,NumRec;//Declaring variables 
    PhoneRecord[] Book;//constructing & declaring the array
    
    
    public PhoneBook()//default constructor 
    {
        Book = new PhoneRecord[10];
        MaxRec = 10;
        NumRec = 0;
    }
    public PhoneBook(int NumR, int MaxR)//conversion constructor 
    {
        Book = new PhoneRecord[MaxR];
        MaxRec = MaxR;
        NumRec = NumR;
    }
    public void readRecord()//which reads in a new phone record.
    {
        Scanner keyb = new Scanner(System.in);
        
        System.out.println("Enter Your First Name: ");
        String firstName = keyb.next();
        //Book[NumRec].firstName = keyb.next();
        
        System.out.println("Enter Your Last Name: ");
        String lastName = keyb.next();
        //Book[NumRec].lastName = keyb.next();
        
        System.out.println("Enter Your Number: ");
        String number = keyb.next();
                                    
        PhoneRecord NewPR = new PhoneRecord(firstName,lastName,number);
        Book[NumRec] = NewPR;
        //Book[NumRec].number = keyb.next();
        NumRec++;// a count increment
        
    }
    public String toString(int i)//which returns a string containing record #i
    {
        return Book[i].firstName + "\t" + Book[i].lastName + "\t" 
                                +Book[i].number;
        
    }
    public void writeRecord(int i)//which writes record #i.
    {
       System.out.println(toString(i)); 
    }
    public void writeBook()//which writes the entire phone book.
    {
        for(NumRec = 0; NumRec < MaxRec; NumRec++)
        {
            System.out.println(toString(NumRec));
        }
    }
}


/**
 * Book Class
 *
 * Miriam Shamsiev
 * Assignment 10a
 */
import java.util.Scanner;

public class Book{
    private String title;
    private String author;
    private String publisher;
    private int year;
    private String ISBN;
    
    public Book(){
        title = "";
        author = "";
        publisher = "";
        year = 0;//assigning a value
        ISBN = "";
        
        
    }
    public Book(String title, String author, String publisher, 
                int year, String ISBN){
        title = title;
        author = author;
        publisher = publisher;
        year = year;
        ISBN = ISBN;    
    }
    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.publisher = other.publisher;
        this.year = other.year;
        this.ISBN = other.ISBN;
    }//accessor(getter)
    public String getTitle(){
        return title;
    }//mutator(setter)
    public void setTitle(String title){
        this.title = title;
    }
     public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    //read from user
    public void read(){
        Scanner keyb = new Scanner(System.in);
        System.out.println("Title: ");
        setTitle(keyb.nextLine());//line for string
        System.out.println("Author: ");
        setAuthor(keyb.nextLine());
        System.out.println("Publisher: ");
        setPublisher(keyb.nextLine());
        System.out.println("Year: ");
        setYear(keyb.nextInt());//Int b/c year is an integer
        System.out.println("ISBN: ");
        setISBN(keyb.nextLine());
    }
    //equals() using boolean
    public boolean equals(Book other){
        return title == other.title && author == other.author &&
               publisher == other.publisher && year == other.year &&
               ISBN == other.ISBN;
    }
    public String toString(){
        return "Book: \n Title = " + title + " | Author = " + author 
                + "\n"+ " | Publisher = " + publisher +"\n" + " | Year = "
                + year + "| ISBN = " + ISBN; 
    }
    }
    

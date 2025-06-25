
/**
 * Write a description of class Main here.
 *
 * Miriam Shamsiev
 * 10a-10b
 */
public class Main{
    public static void main(String[] args){
    Book book1 = new Book();
    book1.read();
    System.out.println(book1);
    
    Book book2 = new Book("Winesburg, Ohio","Sherwood Anderson","Malcom Cowley",1913,"0-14-018655-7");
    System.out.println(book2);
    
    Book book3 = new Book(book2);
     book3.setTitle("Winesburg, Ohio");
        book3.setAuthor("Sherwood Anderson");
        book3.setPublisher("Malcolm Cowley");
        book3.setYear(1913);
        book3.setISBN("0-14-018655-7");
        System.out.println(book3);

    }
}

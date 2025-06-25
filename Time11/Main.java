
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main {
    public static void main(String[] args) {
        Time t1 = new Time(10, 15, 30);
        Time t2 = t1.later(4, 27, 15);
        System.out.println("Current time: " + t1.toString());
        System.out.println("Later time: " + t2.toString());
    }
}

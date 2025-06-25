
/**
 */
import java.util.Scanner;
public class GCDDriver
{

    public static void main(String[] args)
    {
        int i = 0;
        for(i = 0; i < 2; i++){
            // making the object for Gcd
            Scanner keyb = new Scanner(System.in);
            Gcd Object = new Gcd();
            
            int val1, val2;
            System.out.println("Enter 2 values: ");
            val1 = keyb.nextInt();
            val2 = keyb.nextInt();
            
            System.out.println(Object.gcd(val1,val2));
        }    
    
    }
}

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class Driver
{

    public static void main(String[] args)
    {
        //create a Dictionary
        DictionaryCounter dictionary= new DictionaryCounter();
        
        String Filename= "data.txt";
        
        dictionary.readFile(Filename);
        
         dictionary.totalNumOfLetters();
        
        dictionary.contents();
       
    }

}

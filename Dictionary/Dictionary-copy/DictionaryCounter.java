
/**
DictionaryCounter.java - DictionaryInterface implementation
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;

public class DictionaryCounter
{   
    //declaring
    DictionaryInterface < Character, Integer > dictionary;
    private Integer frequency; 

    //Default constructor
    public DictionaryCounter()     
    {  
        //initialize 
        dictionary = new SortedArrayDictionary<>(); 
    }    

    //readFile Method - reads data from a file
    public void readFile(String filename)     
    {        
        File inputFile = new File(filename);
        Scanner scan = null;   
        
        //If file is empty, an exception will be thrown
        try {
            scan = new Scanner(inputFile);//pass the File to the Scanner
        } catch (FileNotFoundException e) {
            System.out.println("Cannot open file");
            System.exit(0);
        }

        // Checks if there is a next line available in the file
        while (scan.hasNextLine())
        {
            String line =  scan.nextLine();

            for(int i=0 ; i < line.length() ; i++)
            {
                char letter= Character.toUpperCase(line.charAt(i)); 
                //case sensitivity
                
                if (letter >= 'A' && letter <='Z')
                {
                    frequency= dictionary.getValue(letter);

                    if(!dictionary.contains(letter))
                    {
                        dictionary.add(letter, new Integer(1));
                    }
                    else{
                        frequency++;
                        dictionary.add(letter, frequency); 
                    }
                }
            }
        }
    }    

    // totalNumOfLetters - Computes the total number of letters 
    public int totalNumOfLetters()
    {

        //initializing varibales
        int total = 0;

        //declaring iterator
        Iterator<Integer> vIterator= dictionary.getValueIterator();

        //Checks if there is another value in the dictionary
        while (vIterator.hasNext()) {
            total = total + vIterator.next();//increment 
        }

        return total;
    }

    //content method *had help with this in tutoring and lab
    public void contents() {
        int total = totalNumOfLetters();

        //Display the total number of letters in the file
        System.out.println("The total number of letters in this file is: "+ total);

        Iterator<Character> keyIterator = dictionary.getKeyIterator();
        Iterator<Integer> valueIterator = dictionary.getValueIterator();

        // check with iterators
        while (valueIterator.hasNext() && keyIterator.hasNext()) {
            char letter= keyIterator.next();
            int occurences= valueIterator.next();

            //calculating occurence for each letter
            float totaloccurences =  occurences / (float) total;

            //Prints out the letters with the occurences
            System.out.println(letter + "\t" + occurences + "\t" + "\t" + String.format(" %.3f",totaloccurences));
        }
    }
}


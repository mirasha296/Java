
/**
 * 04/24/2023
 */
import java.util.Scanner;

public class BadName
{
	public static void main(String[] args)
	{
		Scanner keyb = new Scanner(System.in);
		String inputName;
		try
		{
			System.out.println("What is your name? ");
			inputName = keyb.nextLine();
			inputName = input.trim();
			
			if(!Character.isUpperCase(inptName.charAT(0)))
        			throw new NoFirstCapLetterException("Does not start with a capital letter. ");
                	System.out.println("Glad to meet you "+ inputName);
		}
		catch(NoFirstCapLetterException e)
		{
        		System.out.println(e.getMessage());  
		}
	}

}

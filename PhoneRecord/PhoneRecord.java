
/**
 * Miriam Shamsiev
 * Assignment #14
 */
public class PhoneRecord
{   //public properties 
    public String firstName;
    public String lastName;
    public String number;
    //default constructor
    public PhoneRecord()
    {
        firstName = new String();
        lastName = new String();
        number = new String();
    }
    //conversion constructor
    public PhoneRecord(String firstNstr, String lastNstr, String NumStr)
    {
        firstName = firstNstr;
        lastName = lastNstr;
        number = NumStr;
    }
}
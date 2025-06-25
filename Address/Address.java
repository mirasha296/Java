
/**
 * Write a description of class Address here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Address{
    private int houseNumber;
    private String street;
    private String city;
    private String state;
    private String zip;
    
    public Address(){
        houseNumber = -1;
        city = new String();
        state = new String();
        zip = new String();
    }
    
    public Address (int newHouseNumber,String newStreet, String newCity, String newState, 
                                            String newZip){
        if (newStreet == null || newCity == null || newState == null 
                                                 ||newZip == null){
            System.out.println("Invalid data");
            System.exit(0);
        }
                                            
        houseNumber = newHouseNumber;
        city = new String(newCity);
        state = new String(newState);
        zip = new String(newZip);

    }   
    
    public Address(Address other){}
    
    public String toString(){
        return(houseNumber + " " + street + ""+ city + " " + state 
        + " "+ " "+ zip);
    }
    
    public void write() {
    }
    
    public void read() {
        Scanner Keyb = new Scanner(System.in);
        
        System.out.println("Enter house number: ");
        houseNumber
    }
}

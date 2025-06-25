
/**
 * Write a description of class CreditCardPayment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CreditCardPayment extends Payment
{
    public String Name;
    public String ExpDate;
    public String CCNumber;
    
    //default 
    public CreditCardPayment()
    {
         super();
         Name = " ";
         ExpDate = " ";
         CCNumber = " ";
    }
    //conversion
    public CreditCardPayment(double newPay, String newName, String newExpDate,
                             String newCCNumber)
    {
         super(newPay);
         Name = newName;
         ExpDate = newExpDate;
         CCNumber = newCCNumber;
    }
    //copy
    public CreditCardPayment(CreditCardPayment other)
    {
         super(other);
         Name = other.Name;
         ExpDate = other.ExpDate;
         CCNumber = other.CCNumber;
    }
        
    //overriding paymentdetail
    public String paymentDetails()//string method
    {
         return "Your total credit card payment is: $" + pay + "\nName | "+Name+
                                             "\nExpiration Date | "+ ExpDate+
                                              "\nCC Number | " +CCNumber+"\n";
    }
}

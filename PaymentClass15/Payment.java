/**
 * Miriam Shamsiev
 * Lab #15
 * 
 * Define a class named Payment that contains a instance variable of 
 * type double that stores the amount of the payment and appropriate 
 * accessor and mutator methods. Also create a method named 
 * paymentDetails that outputs an English sentence to describe the 
 * amount of the payment.
 * 
 * Next, define a class named CashPayment
 * that is derived from Payment. This class should redefine
 * the paymentDetails methods to indicate that the payment is in cash. 
 * Include appropirate constructor(s).
 * 
 * Define a class named CreditCardPayment that 
 * is derived from Payment. This class should contain member variables 
 * for the name on the card, expiration date and credit card number. 
 * Include appropriate constructor(s).
 * 
 * Finally, redefine paymentDetails method to include all
 * credit card information in the printout.
 * Create a main method that creates at least two CashPayment and 
 * two CreditCardPayment objects with different values and calls 
 * paymentDetail for each.
 */

public class Payment
{
    protected double pay;//instance variable aka properties
    
    //default 
    public Payment()
    {
        pay = 0.0;//defualt value
    }
    //conversion
    public Payment(double newPay)
    {
        pay = newPay;
    }
    //copy
    public Payment(Payment other)
    {
        pay = other.pay;
    }
    //accessors(getters)
    public double getPay()
    {
        return pay;
    }
    //mutators(setters)
    public void setPayment(double newPay)
    {
        pay = newPay;
    }
    
    public String paymentDetails()//string method
    {
        return "Total amount of payment: $" + pay +"\n";
    }
}

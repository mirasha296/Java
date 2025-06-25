
/**
 * 
 */
public class Main
{
    public static void main(String[] args)
    {
        CashPayment Ex1 = new CashPayment(3.0);
        CashPayment Ex2 = new CashPayment(4.0);
        CreditCardPayment Ex3 = new CreditCardPayment(5.0, "Miriam","0927",
                                            "1234-5678-9123");
        CreditCardPayment Ex4 = new CreditCardPayment(6.0, "Myra","0825",
                                            "9876-5432-1321");
                                            
        String output = Ex1.paymentDetails();
        String output2 = Ex2.paymentDetails();
        String output3 = Ex3.paymentDetails();
        String output4 = Ex4.paymentDetails();
        
        System.out.println(output);
        System.out.println(output2);
        System.out.println(output3);
        System.out.println(output4);
    }
    /**
     * Output:
     *  Total cash payment: $3.0

        Total cash payment: $4.0
        
        Your total credit card payment is: $5.0
        Name | Miriam
        Expiration Date | 0927
        CC Number | 1234-5678-9123
        
        Your total credit card payment is: $6.0
        Name | Myra
        Expiration Date | 0825
        CC Number | 9876-5432-1321
     */
    
    
    
    
}



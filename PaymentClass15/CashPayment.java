
/**
 * 
 */
public class CashPayment extends Payment
{
        //default 
        public CashPayment()
        {
            super();
        }
        //conversion
        public CashPayment(double newCash)
        {
            super(newCash);
        }
        //copy
        public CashPayment(CashPayment other)
        {
            super(other);
        }
        
        //overriding paymentdetail
        public String paymentDetails()//string method
        {
            return "Total cash payment: $" + pay +"\n";
        }
        

}
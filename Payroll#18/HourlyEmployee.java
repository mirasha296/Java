
/**
 * HourlyEmployee has two properties: wageRate and hours (per week). 
 * Its version of getPay() returns the weekly pay and pays time and a half
 * for over 40 hours per week.
 * 
 * Both derived classes need their own version of equals and toString
 * 
 */

public class HourlyEmployee extends Payroll
{
    public double wageRate;//new properties
    public double hoursPerWeek;
    
    //default constructor with super()
    public HourlyEmployee()
    {
        super();
        wageRate = 0.0;
        hoursPerWeek = 0.0;
    }
    //conversion constructor incorporating super
    public HourlyEmployee(String newName, String newEmplID, String newJobTitle,
                                double newWage, double newHours)
    {
        super(newName, newEmplID, newJobTitle);
        wageRate = newWage;
        hoursPerWeek = newHours;
    }
    //copy constructor with super
    public HourlyEmployee(HourlyEmployee other)
    {
        super(other);
        wageRate = other.wageRate;
        hoursPerWeek = other.hoursPerWeek;
    }
    //equals method
    public boolean equals(HourlyEmployee other)
    {
        return Name == other.Name && EmplID == other.EmplID &&
                JobTitle == other.JobTitle && 
                wageRate == other.wageRate && 
                hoursPerWeek == other.hoursPerWeek;
    }
    //calculate hourly wage 
    public double getPay()
    {
        if(hoursPerWeek > 40){
            double normalPay = wageRate * 40; //pay before overtime calculated
            double overtime = (hoursPerWeek - 40) * (1.5 * wageRate); 
            //find the overtime pay by subratcting from fulltime rate
            //and then add the hours calculated by the overtime pay
            return normalPay + overtime;
        }
        else{
            return wageRate * hoursPerWeek;
        }
        
    }
    //put it all together in a toString method
    public String toString()
    {
        return "------------------------------------------------------------------------------"+"\nPayroll for Employee: " + "\n|"+ Name + "\n|" + EmplID + 
                "\n|" + JobTitle + "\n|Hours Worked: " + hoursPerWeek 
                +"\n|Hourly Rate: $"+ wageRate 
                +"\n|Total Hourly Pay for this week's Payroll: $"
                + getPay() + "\n\nThank you for being a part of our team! :) \n"
                +"------------------------------------------------------------------------------";
    }
}


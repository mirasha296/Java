
/**
 * SalariedEmployee has one property, the annual salary.  
 * Its version of getPay returns weekly pay which is 1/52 of annual salary.
 * 
 * Both derived classes need their own version of equals and toString
 */
public class SalariedEmployee extends Payroll
{
    //this class has only one property
    public double annualSalary;
    //default constructor
    public SalariedEmployee()
    {
        super();
        annualSalary = 0.0;
    }
    //conversion constructor
    public SalariedEmployee(String newName, String newEmplID, String newJobTitle,
                                double newSalary)
    {
        super(newName, newEmplID, newJobTitle);
        annualSalary = newSalary;
    }
    //copy constructor
    public SalariedEmployee(SalariedEmployee other)
    {
        super(other);
        annualSalary = other.annualSalary;
    }
    //equals method
    public boolean equals(SalariedEmployee other)
    {
        return Name == other.Name && EmplID == other.EmplID &&
                JobTitle == other.JobTitle && annualSalary == other.annualSalary;
    }
    //calculate salary
    public double getPay()
    {
        double weekPay = annualSalary/52;//52 weeks in a year
        return weekPay;
    }
    //toString method for salary
    public String toString()
    {
        return "------------------------------------------------------------------------------"+"\nPayroll for Employee: " + "\n|"+ Name + "\n|" + EmplID + 
                "\n|" + JobTitle + "\n|Yearly Salary: $" + annualSalary
                + "\n|Total Salary pay for this week's Payroll: $" + getPay() + 
                "\n\nThank you for being a part of our team! :) \n"
                +"------------------------------------------------------------------------------";
    }
}

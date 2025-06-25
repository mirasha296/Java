
/**
 * Miriam Shamsiev
 * 04/22/2023
 * lab #18
 Create an abstract class called Payroll. It will have the following properties:
 Name (which will be a string), employee id number (which is a string that is
 exactly five digits), and job title (which is also a string).  
 In addition to default, conversion and copy constructors, it has accessors and 
 mutators for all three properties, as well as method equals. 
 It has two abstract methods:  getPay, which is weekly pay and toString.

 There are two derived classes: 
 There are two derived classes, which you will also create:
 an HourlyEmployee and SalariedEmployee.  HourlyEmployee has two properties: 
 wageRate and hours (per week).  Its version of getPay() returns the weekly 
 pay and pays time and a half for over 40 hours per week.  SalariedEmployee
 has one property, the annual salary.  Its version of getPay returns weekly
 pay which is 1/52 of annual salary.

 Both derived classes need their own version of equals and toString
 Write a main class with a main method that demonstrates that the derived 
 classes work correctly.
 */

public abstract class Payroll
{   
    //protected properties for the parent class
    protected String Name; 
    protected String EmplID;
    protected String JobTitle;
    
    //default constructor
    public Payroll()
    {
        Name = new String();
        EmplID = new String();
        JobTitle = new String();
    }
    //conversion constructor
    public Payroll(String newName, String newEmplID, String newJobTitle)
    {
        Name = newName;
        EmplID = newEmplID;
        JobTitle = newJobTitle;
    }
    //copy constructor
    public Payroll(Payroll other)
    {
        Name = other.Name;
        EmplID = other.EmplID;
        JobTitle = other.JobTitle;
    }
    //accessor(s)
    public String getName()
    {
        return Name;
    }
    public String getEmplID()
    {
        return EmplID;
    }
    public String getJobTitle()
    {
        return JobTitle;
    }
    //mutator(s)
    public void setName(String newName)
    {
        Name = newName;
    }
    public void setEmplID(String newEmplID)
    {
        EmplID = newEmplID;
    }
    public void setJobTitle(String newJobTitle)
    {
        JobTitle = newJobTitle;
    }
    //equals method
    public boolean equals(Payroll other)
    {
        return Name == other.Name && EmplID == other.EmplID &&
                JobTitle == other.JobTitle;
    }
    
    //abstract methods(two total)
    public abstract double getPay();
    public abstract String toString();//Abstract methods cannot have a body

}

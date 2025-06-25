
/**
 * Write a main class with a main method that demonstrates that the derived 
 * classes work correctly.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        System.out.println("Welcome to your Payroll,\nPlease enter your name: ");
        String Name = keyb.nextLine();
        System.out.println("Enter your Employee ID number[Only the first 5]: ");
        String EmplID = keyb.nextLine();
        System.out.println("What is your job title? ");
        String JobTitle = keyb.nextLine();

        boolean x = true;//setting an object to true for loop until declared false
        while (x) {
            System.out.println("Are you a(n)\n\n (1)Hourly based employee" + "\n or \n (2)Salary based employee? \n\n [Enter 1 or 2]");
            int EmplType = keyb.nextInt();
            keyb.nextLine(); // consume the leftover newline character for 
                             // string type or other type input

            if (EmplType == 1)//hourly
            {
                HourlyEmployee Employee;
                System.out.println("Enter your hourly wage: ");
                double wageRate = keyb.nextDouble();
                keyb.nextLine();//consume
                
                System.out.println("Enter your total number hours worked this week: ");
                double hoursPerWeek = keyb.nextDouble();
                keyb.nextLine();//consume
                
                Employee = new HourlyEmployee(Name, EmplID, JobTitle, wageRate, hoursPerWeek);
                System.out.println(Employee);
                
                System.out.println("Would you like to go again?[Y/N] ");
                String repeat = keyb.nextLine();
                repeat = repeat.toUpperCase(); //converts input to uppercase 
                if (repeat.equals("N")) {
                    x = false;
                }
            } else if (EmplType == 2)//salary
            {
                SalariedEmployee Employee;
                System.out.println("Enter your Yearly Gross Salary: ");
                double annualSalary = keyb.nextDouble();
                keyb.nextLine(); // consume the newline character
                
                Employee = new SalariedEmployee(Name, EmplID, JobTitle, annualSalary);

                System.out.println(Employee);
                
                System.out.println("Would you like to go again?[Y/N] ");
                String repeat = keyb.nextLine();
                repeat = repeat.toUpperCase(); 
                if (repeat.equals("N")) {
                    x = false;
                }
            } else {
                System.out.println("[Input Error] Please try again");
                keyb.nextLine();
            }
        }
    }
}
/**
 * OUTPUT:
    Welcome to your Payroll,
    Please enter your name: 
    Miriam Shamsiev
    Enter your Employee ID number[Only the first 5]: 
    12345
    What is your job title? 
    IT
    Are you a(n)
    
     (1)Hourly based employee
     or 
     (2)Salary based employee? 
    
     [Enter 1 or 2]
    1
    Enter your hourly wage: 
    15
    Enter your total number hours worked this week: 
    30
    ------------------------------------------------------------------------------
    Payroll for Employee: 
    |Miriam Shamsiev
    |12345
    |IT
    |Hours Worked: 30.0
    |Hourly Rate: $15.0
    |Total Hourly Pay for this week's Payroll: $450.0
    
    Thank you for being a part of our team! :) 
    ------------------------------------------------------------------------------
    Would you like to go again?[Y/N] 
    y
    Are you a(n)
    
     (1)Hourly based employee
     or 
     (2)Salary based employee? 
    
     [Enter 1 or 2]
    2
    Enter your Yearly Gross Salary: 
    120000
    ------------------------------------------------------------------------------
    Payroll for Employee: 
    |Miriam Shamsiev
    |12345
    |IT
    |Yearly Salary: $120000.0
    |Total Salary pay for this week's Payroll: $2307.6923076923076
    
    Thank you for being a part of our team! :) 
    ------------------------------------------------------------------------------
    Would you like to go again?[Y/N] 
    n
 */

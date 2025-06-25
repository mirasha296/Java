
/**
 * Write a description of class PayRollWIncTax here.
 *
 * Miriam Shamsiev
 * Rewritten Payroll with income Tax
 */
import java.util.Scanner;
public class PayRollWIncTax {
    public static void main(String[] args){
    Scanner user = new Scanner(System.in);
    System.out.print("Are you single or married? [0:Single|1:Married] ");
    int inputSM = user.nextInt();
    
    int initialPayRate;
    
    if (inputSM == 0){
        initialPayRate = 10;
        
    } else if (inputSM == 1){
        initialPayRate = 15;
        
    }else{
        System.out.println("[Error] reading input, please enter either"+
        "0 for single or 1 for Married");
        return;
    }
    
    System.out.print("How many children do you have?[enter 0 if none] ");
    int totalChildren = user.nextInt();
    if (totalChildren <0){
        System.out.println("[Error]Number of children cannot be negative ");
        return;
    }
    if (totalChildren == 1){
        totalChildren = 1;
    }
    if (totalChildren == 2){
        totalChildren = 2;
    }
    if (totalChildren == 3){
        totalChildren = 3;
    }
    if (totalChildren >= 4){
        totalChildren = 4;
    }
    
    System.out.print("Enter total number of hours worked: ");
    int totalHours = user.nextInt();
    if (totalHours < 0){
        System.out.println("[Error] Hours worked cannot be negative ");
        return;
        
    }
    int totGrossPay = initialPayRate * totalHours + totalChildren;
    if(totalHours > 40){
        totGrossPay += (totalHours - 40)* (initialPayRate/2);
    }
    
    System.out.println("Total Gross pay before tax: $"+ totGrossPay);
    double incomeTax = 0;
    double newGrossPay = 0;
    
    if (totGrossPay >= 600){
        incomeTax = (totGrossPay/100)* (10);
        newGrossPay = totGrossPay - incomeTax;
    }else if(totGrossPay >= 400 && totGrossPay <= 599.99){
        incomeTax = (totGrossPay/100)* (8);
        newGrossPay = totGrossPay - incomeTax;
    }else if (totGrossPay > 300 && totGrossPay <= 399.99 ){
        incomeTax = (totGrossPay/100)* (5);
        newGrossPay = totGrossPay - incomeTax;
    }else if (totGrossPay > 0 && totGrossPay <=299.99 ){
        incomeTax = (totGrossPay/100)* (0);
        newGrossPay = totGrossPay - incomeTax;
    }else{
        System.out.println("[Error] Gross cannot be negative: ");
    }
    System.out.println("Total Gross pay after income tax: " + newGrossPay);

}

}
/*
 * WORKING OUTPUT:
Are you single or married? [0:Single|1:Married] 0
How many children do you have?[enter 0 if none] 0
Enter total number of hours worked: 40
Total Gross pay before tax: $400
Total Gross pay after income tax: 368.0
 * 
 */
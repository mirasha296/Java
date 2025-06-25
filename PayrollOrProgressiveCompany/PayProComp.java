
/**
 * Write a description of class PayrollProgCompany here.
 *
 * Miriam Shamsiev
 * 
 * Payroll/Progressive company
 * Task: You are working for a company that is somewhat progressive in their 
 * pay scale.
 * Single people get paid $10 per hour;
 * married people get paid $15 per hour. 
 * In either case, they get paid an extra $1 per hour for their first four 
 * children.
 * Your program will ask whether the employee is married or not. 
 * You will read in a "0" for single and a"1" for married. Then you will ask
 * how many children the employee has. Then you will ask for the number of 
 * hours worked and calculate gross pay. As usual, the employee will get time 
 * and a half after 40 hours.
*/

import java.util.Scanner;

public class PayProComp {
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
    
    System.out.println("Total Gross pay: $"+ totGrossPay);
}
}

/*
Output:
Are you single or married? [0:Single|1:Married] 0
How many children do you have?[enter 0 if none] 0
Enter total number of hours worked: 41
Total Gross pay: $415
 */
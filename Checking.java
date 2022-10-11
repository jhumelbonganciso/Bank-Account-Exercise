/**
 * Java Course 3, Module 2
 * 
 * Hands-on Assignment 2: Java Collection Framework (Graded)

   *
 * @author Jhumel M. Bonganciso
 */

public class Checking extends BankAccount{

    // Constructor

    Checking() {

    }
    Checking(double balance) {
        super(balanceChecker(balance));
    }

    // Write a check method
    public void writeACheck(double check) {
        check += 1;
        balance -= check;
    }

    // Method override
    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("Checking account balance = $" + df.format(balance));
        
    }

    // Balance checker to return to 0 if input blaance is less than 0
    public static double balanceChecker(double balanceChecker) {
        if(balanceChecker < 0) {
            balanceChecker = 0;
        } 
        return balanceChecker;
        
    }
    
}

/**
 * Java Course 3, Module 2
 * 
 * Hands-on Assignment 2: Java Collection Framework (Graded)

   *
 * @author Jhumel M. Bonganciso
 */
public class Savings extends BankAccount {
    // Instance var
    private double intRate;

    // Constructor
    Savings() {

    }
    Savings(double balance, double intRate) {
        super(balance);
        this.intRate = intRate;

    }

    // Add interest
    public void addInterest() {
        double interest = balance * intRate;
        balance += interest;
    }
    // Method overriding
    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("Savings account balance = $" + df.format(balance));
    }
    
}

import java.text.DecimalFormat;

/**
 * Java Course 3, Module 2
 * 
 * Hands-on Assignment 2: Java Collection Framework (Graded)

 *
 * @author Jhumel M. Bonganciso
 */
// Abstract class to create abstract method
public abstract class BankAccount {
    DecimalFormat df = new DecimalFormat("0.00");
    protected double balance;
    // empty constructor
    BankAccount() {

    }
    // Constructor
    BankAccount(double balance) {
        this.balance = balance;

    }
    // Deposit method
    public void deposit(double deposit) {
        balance += deposit;
    }
    // Withdraw method
    public void withdraw(double withdraw) {
        double val = balance - withdraw;

        if (val < 0) {
            balance = 0;
        } else {
            balance = val;
        }
    }

    // abstract method
    public abstract void display();
}
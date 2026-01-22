// Abstract Class - Bank Account Hierarchy
//
// Problem: Write a Java program to create an abstract class BankAccount with abstract methods:
//     - deposit()
//     - withdraw()
//
// Then, create two subclasses:
//   SavingsAccount - handles deposit & withdrawal
//   CurrentAccount - handles deposit & withdrawal
//
// Sample Output:
// Savings Account:
// Deposited: 1000.0
// Withdrawn: 500.0
//
// Current Account:
// Deposited: 2000.0
// Withdrawn: 1500.0

package OOPS.JavaAbstractClasses;

abstract class BankAccount {
    protected double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    public void display() {
        System.out.println(getClass().getSimpleName().replaceAll("([A-Z])", " $1").trim() + ":");
        deposit();
        withdraw();
        System.out.println();
    }

    public abstract void deposit();

    public abstract void withdraw();
}

class SavingsAccount extends BankAccount {
    private double depositAmount;
    private double withdrawAmount;

    SavingsAccount(double balance, double depositAmount, double withdrawAmount) {
        super(balance);
        this.depositAmount = depositAmount;
        this.withdrawAmount = withdrawAmount;
    }

    @Override
    public void deposit() {
        balance += depositAmount;
        System.out.println("Deposited: " + depositAmount);
    }

    @Override
    public void withdraw() {
        if (withdrawAmount <= balance) {
            balance -= withdrawAmount;
            System.out.println("Withdrawn: " + withdrawAmount);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
}

class CurrentAccount extends BankAccount {
    private double depositAmount;
    private double withdrawAmount;

    CurrentAccount(double balance, double depositAmount, double withdrawAmount) {
        super(balance);
        this.depositAmount = depositAmount;
        this.withdrawAmount = withdrawAmount;
    }

    @Override
    public void deposit() {
        balance += depositAmount;
        System.out.println("Deposited: " + depositAmount);
    }

    @Override
    public void withdraw() {
        if (withdrawAmount <= balance) {
            balance -= withdrawAmount;
            System.out.println("Withdrawn: " + withdrawAmount);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
}

public class AbstractBankAccountHierarchy {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(1000.0, 1000.0, 500.0);
        BankAccount current = new CurrentAccount(3000.0, 2000.0, 1500.0);

        savings.display();
        current.display();
    }
}
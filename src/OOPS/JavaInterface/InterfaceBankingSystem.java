// Banking System with Interface and Inheritance
//
// Problem: Write a Java program to create a banking system with three classes - Bank,
// SavingsAccount, and CurrentAccount. The bank should have a list of accounts
// and methods for adding them. Account should be an interface with methods to
// deposit, withdraw, calculate interest, and view balances. SavingsAccount and
// CurrentAccount should implement the Account interface and have their own unique methods.
//
// Sample Output:
// Savings Account - Balance: 1050.0
// Current Account - Balance: 2000.0
// Interest on Savings Account: 50.0
// Interest on Current Account: 0.0

package OOPS.JavaInterface;

import java.util.ArrayList;
import java.util.List;

interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double calculateInterest();
    double getBalance();
}

class SavingsAccount implements Account {
    private double balance;
    private double interestRate = 0.05; // 5% interest

    public SavingsAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

class CurrentAccount implements Account {
    private double balance;

    public CurrentAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }

    @Override
    public double calculateInterest() {
        return 0.0; // No interest for current account
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void displayAccountBalances() {
        for (int i = 0; i < accounts.size(); i++) {
            Account account = accounts.get(i);
            if (account instanceof SavingsAccount) {
                System.out.println("Savings Account - Balance: " + account.getBalance());
            } else if (account instanceof CurrentAccount) {
                System.out.println("Current Account - Balance: " + account.getBalance());
            }
        }
    }

    public void displayInterests() {
        for (int i = 0; i < accounts.size(); i++) {
            Account account = accounts.get(i);
            if (account instanceof SavingsAccount) {
                System.out.println("Interest on Savings Account: " + account.calculateInterest());
            } else if (account instanceof CurrentAccount) {
                System.out.println("Interest on Current Account: " + account.calculateInterest());
            }
        }
    }
}

public class InterfaceBankingSystem {
    public static void main(String[] args) {
        Bank avdeshBank = new Bank();
        
        SavingsAccount amanSavings = new SavingsAccount(1000);
        CurrentAccount aviCurrent = new CurrentAccount(2000);
        
        amanSavings.deposit(50);
        
        avdeshBank.addAccount(amanSavings);
        avdeshBank.addAccount(aviCurrent);
        
        avdeshBank.displayAccountBalances();
        avdeshBank.displayInterests();
    }
}
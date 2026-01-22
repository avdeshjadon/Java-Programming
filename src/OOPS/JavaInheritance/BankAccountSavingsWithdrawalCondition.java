// Bank Account Savings Withdrawal Condition
//
// Problem: Write a Java program to create a class called BankAccount with methods:
//     - deposit()
//     - withdrawal()
//
// Then create a subclass called SavingAccount that:
//   Overrides the withdrawal() method
//   Prevents withdrawals if balance falls below ₹100
//
// Sample Output:
// Create a Bank Account object (A/c No. PNB1324) with initial balance of ₹23422.34:
// Deposited amount: 10000
// New balance after depositing ₹10000: ₹33422.34
// Withdraw ₹6000 from account PNB1324:
// New balance after withdrawal ₹6000: ₹27422.34
//
// Create a SavingsAccount object (A/c No. SA1234) with initial balance of ₹450:
// Minimum balance of ₹100 required!
// Balance after trying to withdraw ₹300: ₹450.0
//
// Create a SavingsAccount object (A/c No. SA1000) with initial balance of ₹300:
// Try to withdraw ₹250 from SA1000!
// Minimum balance of ₹100 required!

package OOPS.JavaInheritance;

class BankAccount {
    private String accountNumber;
    private double balance;
    
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    void deposit(double amount) {
        balance = balance + amount;
    }
    
    void withdrawal(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    
    public double getBalance() {
        return balance;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
}

class SavingAccount extends BankAccount {
    SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    
    @Override
    void withdrawal(double amount) {
        if (getBalance() - amount < 100) {
            System.out.println("Minimum balance of ₹100 required!");
        } else {
            super.withdrawal(amount);
        }
    }
}

public class BankAccountSavingsWithdrawalCondition {
    public static void main(String[] args) {
        System.out.println("Create a Bank Account object (A/c No. PNB1324) with initial balance of ₹23422.34:");
        SavingAccount avdeshAccount = new SavingAccount("PNB1324", 23422.34);
        System.out.println("Deposited amount: 10000");
        avdeshAccount.deposit(10000);
        System.out.println("New balance after depositing ₹10000: ₹" + avdeshAccount.getBalance());
        System.out.println("Withdraw ₹6000 from account PNB1324:");
        avdeshAccount.withdrawal(6000);
        System.out.println("New balance after withdrawal ₹6000: ₹" + avdeshAccount.getBalance());
        
        System.out.println("\nCreate a SavingsAccount object (A/c No. SA1234) with initial balance of ₹450:");
        SavingAccount amanAccount = new SavingAccount("SA1234", 450);
        amanAccount.withdrawal(300);
        System.out.println("Balance after trying to withdraw ₹300: ₹" + amanAccount.getBalance());
        
        System.out.println("\nCreate a SavingsAccount object (A/c No. SA1000) with initial balance of ₹300:");
        SavingAccount aviAccount = new SavingAccount("SA1000", 300);
        System.out.println("Try to withdraw ₹250 from SA1000!");
        aviAccount.withdrawal(250);
    }
}
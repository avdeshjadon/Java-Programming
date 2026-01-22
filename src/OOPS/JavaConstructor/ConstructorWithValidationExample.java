// Constructor with Validation - Account Class Example
//
// Problem: Write a Java program that demonstrates how to use a parameterized constructor with input validation.
// The Account class has two private fields: accountNumber and balance.
// The constructor checks that:
//    - accountNumber is positive
//    - balance is non-negative
// If any check fails, an error message is printed and values are not assigned.
//
// Approach: The program creates an Account object with valid values and displays its details.
//
// Sample Output:
// Account Number: 123212342
// Balance: 65347.76

package OOPS.JavaConstructor;

class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        if (accountNumber <= 0) {
            System.out.println("Error: Account number must be positive.");
            return;
        }
        if (balance < 0) {
            System.out.println("Error: Balance must be non-negative.");
            return;
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}

public class ConstructorWithValidationExample {
    public static void main(String[] args) {
        Account avdeshAccount = new Account(123212342, 65347.76);
        System.out.println("Account Number: " + avdeshAccount.getAccountNumber());
        System.out.println("Balance: " + avdeshAccount.getBalance());
    }
}
// ------------------- 🔹 Constructor with Validation - Account Class 🔹 -------------------
//
// 💡 Write a Java program that demonstrates how to use a **parameterized constructor** with input validation.
// The `Account` class has two private fields: `accountNumber` and `balance`.
// The constructor checks that:
//    - `accountNumber` is positive
//    - `balance` is non-negative
// If any check fails, an error message is printed and values are not assigned.
//
// 🧠 The program creates an `Account` object with valid values and displays its details.
//
// ------------------- 🧾 SAMPLE OUTPUT -------------------
// Account Number: 123212342
// Balance: 65347.76


package JavaConstructor;

class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        if (accountNumber <= 0) {
            System.out.println("Error: Account number must be non-null and non-empty.");
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

public class ConstructorwithValidationAccountClass {

    public static void main(String[] args) {
        Account myAccount = new Account(123212342, 65347.76);
        System.out.println("Account Number: " + myAccount.getAccountNumber());
        System.out.println("Balance: " + myAccount.getBalance());
    }
}

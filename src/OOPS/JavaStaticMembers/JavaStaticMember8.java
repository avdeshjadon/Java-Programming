// ------------------- 🔹Static Members with Bank Account -------------------
//
// 💡 Write a Java program to demonstrate use of static members in a class.
//
// Create a class `BankAccount` with the following:
// - Instance variables: `accountNumber`, `balance`
// - Static variables: `bankName`, `interestRate`
// - Static methods: `setBankName(String name)`, `setInterestRate(double rate)`
// - Instance method: `printDetails()` to print all account info including static values
//
// In the main method:
// - Set bank name and interest rate using static methods
// - Create two bank accounts with different data
// - Print their details
//
// ------------------- 🧾 SAMPLE OUTPUT -------------------
// Account Number: 123456789
// Balance: 1000.0
// Bank Name: National Bank
// Interest Rate: 3.5%
//
// Account Number: 987654321
// Balance: 2000.0
// Bank Name: National Bank
// Interest Rate: 3.5%



package JavaStaticMembers;

class BankAccount {
    private String accountNumber;
    private double balance;
    private static String bankName;
    private static double interestRate;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public static String setBankName(String name) {
        bankName = name;
        return name;
    }

    public static double setInterestRate(double rate) {
        interestRate = rate;
        return rate;
    }

    public void printDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
public class JavaStaticMember8 {
    public static void main(String[] args) {
        BankAccount.setBankName("National Bank");
        BankAccount.setInterestRate(3.5);

        BankAccount account1 = new BankAccount("123456789", 1000.00);
        BankAccount account2 = new BankAccount("987654321", 2000.00);

        account1.printDetails();
        System.out.println();
        account2.printDetails();
    }
}

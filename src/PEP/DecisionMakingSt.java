package PEP;

import java.util.Scanner;

public class DecisionMakingSt {
    public static void main(String[] args) {
        ATMMachine atm = new ATMMachine();
        atm.checkTransaction();
    }
}

class ATMMachine {
    Scanner sc = new Scanner(System.in);
    int pin = 1234;

    void checkTransaction() {
        System.out.print("Please Enter the Pin Number (XXXX) : ");
        int actualPin = sc.nextInt();
        System.out.println();

        if (pin == actualPin) {
            System.out.println("You are allowed for transaction");
            System.out.print("Please Enter the Amount you want to withdraw : ");
            int amount = sc.nextInt();

            int balance = 1000;

            if (amount <= balance) {
                System.out.println(amount + " withdrawal Successful");
            } else {
                System.out.println("Insufficient Balance, try withdrawing less amount");
                System.out.print("Check your Balance by type 1 OR type exit to exit : ");

                sc.nextLine();

                String input = sc.nextLine();

                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("You Have exited Successfully !");
                } else if (input.equals("1")) {
                    System.out.println("Your Balance is : " + balance);
                } else {
                    System.out.println("Invalid Input!");
                }
            }

        } else {
            System.out.println("Invalid Pin");
        }

        System.out.println("Thank You visit again");
    }
}

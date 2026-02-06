package PEP;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int num = 1234321;
        int oN = num;
        int rN = 0;
        while (num != 0) {
            int digit = num % 10;
            rN = rN * 10 + digit;
            num = num / 10;
        }
        if (oN == rN) {
            System.out.println(oN + " is a palindrome number");
        } else {
            System.out.println(oN + " is not a palindrome number");
        }
    }
}

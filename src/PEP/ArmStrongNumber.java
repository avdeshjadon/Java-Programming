package PEP;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int num = 153;
        int oN = num;
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum = sum + digit * digit * digit;
            num = num / 10;
        }
        if (oN == sum) {
            System.out.println(oN + " is an Armstrong number");
        } else {
            System.out.println(oN + " is not an Armstrong number");
        }
    }
}

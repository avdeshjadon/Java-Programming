package PatternPrinting.SpecialPattern;

import java.util.Scanner;

public class StarPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the N number : ");
        int n = sc.nextInt();
        int mid = n / 2;
        Math.ceil(mid);
        if (n % 2 == 0) {
            System.out.println("==== Please use Odd value for N and try Again =====");
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == mid || j == mid) {
                        System.out.print("X ");
                    } else {
                        System.out.print("  ");
                    }

                }
                System.out.println();

            }
        }
    }
}

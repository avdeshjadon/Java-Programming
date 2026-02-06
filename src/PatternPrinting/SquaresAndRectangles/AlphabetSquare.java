package PatternPrinting.SquaresAndRectangles;

import java.util.Scanner;

public class AlphabetSquare {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the N value : ");
        int n = sc.nextInt();
        char ch = 'a';
        char printChar;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                printChar = Character.toUpperCase(ch);
            } else {
                printChar = Character.toLowerCase(ch);
            }
            for (int j = 1; j <= n; j++) {
                System.out.print(printChar + " ");
            }
            System.out.println();
            ch++;
        }
    }
}

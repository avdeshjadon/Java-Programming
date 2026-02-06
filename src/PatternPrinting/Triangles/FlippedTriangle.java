package PatternPrinting.Triangles;

import java.util.Scanner;

public class FlippedTriangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = row; j >= i; j--) {
                System.out.print("X ");
            }
            System.out.println();
        }
    }
}

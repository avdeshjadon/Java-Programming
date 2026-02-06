package PatternPrinting.SquaresAndRectangles;

import java.util.Scanner;

public class StarRectangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number or Rows : ");
        int row = sc.nextInt();
        System.out.print("Enter the number of Columns : ");
        int column = sc.nextInt();
        for (int i = 0; i < row; i++) {             // Number of lines
            for (int j = 0; j < column; j++) {      // Number of Stars
                System.out.print("X ");
            }
            System.out.println();
        }
    }
}

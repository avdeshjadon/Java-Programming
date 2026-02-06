package PatternPrinting.SquaresAndRectangles;

import java.util.Scanner;

public class StarSquare {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the N value : ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("X ");
            }
            System.out.println();
        }

    }
}

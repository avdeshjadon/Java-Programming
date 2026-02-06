package PatternPrinting.SquaresAndRectangles;

import java.util.Scanner;

public class SmallAlphabetSquare2 {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the N value : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print((char)(i+96)+" ");
            }
            System.out.println();
        }
    }
}

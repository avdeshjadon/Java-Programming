package JavaSelfPractice;

import java.util.Scanner;

public class main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = -1;
        int second = -1;
        int third = -1;
        int count = 0;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int targatedNumber = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == targatedNumber) {
                        count++;
                        first = i;
                        second = j;
                        third = k;
                        System.out.println("(" + i + "," + j + "," + k + ")");
                    }
                }
            }
        }
        System.out.println(count);
    }
}

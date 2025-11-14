package JavaSelfPractice;

import java.util.Arrays;
import java.util.Scanner;

class CreateArray {
    private int[] arr;
    private int k;

    public void inputArrayAndK() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        arr = new int[n];
        System.out.print("Enter all the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is: " + Arrays.toString(arr));
        System.out.print("Enter the rotate number (k): ");
        k = sc.nextInt();
    }

    public int[] getArray() {
        return arr;
    }

    public int getK() {
        return k;
    }
}

public class practice {
    public static void main(String[] args) {
        System.out.println();
    }
}

// Rotate Array In Place with Encapsulation
//
// Problem: Write a Java program that rotates an array to the right by K positions.
// Use encapsulation by creating two classes:
// - CreateArray : for taking input and storing the array and rotation number
// - ArrayRotator : for rotating the array using reversal logic
//
// Approach: You will:
// - Use getters to access array and K
// - Rotate the array efficiently using three-step reversal
// - Display the final rotated array
//
// Sample Input:
// Enter the size of the array: 6
// Enter all the elements of the array: 1 2 3 4 5 6
// Array is: [1, 2, 3, 4, 5, 6]
// Enter the rotate number (k): 2
//
// Sample Output:
// Rotated array: [5, 6, 1, 2, 3, 4]

package Array;

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

class ArrayRotator {
    public void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        if (k < 0) k += n;
        int splitIndex = n - k;
        reverseArray(arr, 0, splitIndex - 1);
        reverseArray(arr, splitIndex, n - 1);
        reverseArray(arr, 0, n - 1);
    }

    private void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

public class RotateArrayInPlace {
    public static void main(String[] args) {
        CreateArray createArray = new CreateArray();
        createArray.inputArrayAndK();

        int[] arr = createArray.getArray();
        int k = createArray.getK();

        ArrayRotator rotator = new ArrayRotator();
        rotator.rotateArray(arr, k);

        System.out.println("Rotated array: " + Arrays.toString(arr));
    }
}
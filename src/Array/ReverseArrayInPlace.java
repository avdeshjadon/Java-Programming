// Reverse Array In Place
//
// Problem: Write a Java program that takes an integer array as input from the user,
// and returns the reversed version of that array.
// The reversal should happen in-place (i.e., without using an extra array).
//
// Sample Input:
// Enter the size of Array: 5
// Enter all the 5 elements of the array: 10 20 30 40 50
//
// Sample Output:
// Original Array is: 10 20 30 40 50
// Reversed Array is: 50 40 30 20 10

package Array;

import java.util.Scanner;

class Reverse {
    static int[] reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}

public class ReverseArrayInPlace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Enter the " + (i + 1) + " element of the array: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Original Array is: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
        int[] ans = Reverse.reverseArray(arr);
        System.out.print("Reversed Array is: ");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
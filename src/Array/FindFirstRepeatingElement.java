// Find First Repeating Element
//
// Problem: Write a Java program that takes an integer array as input from the user,
// and returns the first repeating number in the array (the one whose duplicate
// appears first in a left-to-right scan). If no such number exists, return -1.
//
// Sample Input:
// Enter the size of the array: 7
// Enter all the 7 elements of the array: 10 5 3 4 3 5 6
//
// Sample Output:
// Original Array is: 10 5 3 4 3 5 6
// First Repeated value is: 5

package Array;

import java.util.Scanner;

public class FindFirstRepeatingElement {
    static int findFirstRepeatingNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

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

        System.out.println("First Repeated value is: " + findFirstRepeatingNumber(arr));
    }
}
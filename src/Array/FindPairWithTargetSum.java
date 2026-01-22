// Find Pair with Target Sum
//
// Problem: Write a Java program to find any one pair of elements in an array that adds up to a given target number.
// If a valid pair exists, print the pair. If no such pair exists, inform the user.
//
// Approach: You will:
// - Take array input from the user
// - Ask for the target sum
// - Find and print a pair whose sum is equal to the target
//
// Sample Input:
// Enter the size of Array: 6
// Enter the 1 element of the array: 2
// Enter the 2 element of the array: 4
// Enter the 3 element of the array: 7
// Enter the 4 element of the array: 11
// Enter the 5 element of the array: 15
// Enter the 6 element of the array: 1
//
// Original Array is: 2 4 7 11 15 1
// Enter the target number: 9
//
// Sample Output:
// Pair found: 2 and 7

package Array;

import java.util.Scanner;

public class FindPairWithTargetSum {
    static int[] findPairWithTargetSum(int[] arr, int targetNumber) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == targetNumber) {
                    return new int[]{arr[i], arr[j]};
                }
            }
        }
        return new int[0];
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the " + (i + 1) + " element of the array: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Original Array is: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.print("Enter the target number: ");
        int targetNumber = sc.nextInt();
        int[] result = findPairWithTargetSum(arr, targetNumber);
        if (result.length == 0) {
            System.out.println("No pair found with the given target.");
        } else {
            System.out.println("Pair found: " + result[0] + " and " + result[1]);
        }
    }
}
// Find Pivot Index in Array
//
// Problem: Write a Java program that takes an integer array as input from the user,
// and finds the pivot index of the array. A pivot index is an index where
// the sum of the numbers to the left is equal to the sum of the numbers to the right.
//
// Sample Input:
// Enter the size of the array: 6
// Enter all the 6 elements of the array: 1 7 3 6 5 6
//
// Sample Output:
// Original Array is: 1 7 3 6 5 6
// Pivot Index is: 3

package Array;

import java.util.Scanner;

class Solution {
    public static int findPivotIndex(int[] arr) {
        int num = arr.length;
        int totalSum = 0;
        for (int i : arr) {
            totalSum += i;
        }
        int leftSum = 0;
        for (int i = 0; i < num; i++) {
            int rightSum = totalSum - leftSum - arr[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }
}

public class FindPivotIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println();
        System.out.print("Enter all the " + num + " elements of the array: ");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Original Array is: ");
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Pivot Index is: " + Solution.findPivotIndex(arr));
    }
}
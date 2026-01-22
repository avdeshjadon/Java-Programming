// Find Kth Smallest and Largest in Array
//
// Problem: Write a Java program to find the Kth smallest and Kth largest elements in an array.
// The user should input the array elements and the value of K.
// First, sort the array and then find:
// - Kth smallest → element at index (K - 1)
// - Kth largest  → element at index (length - K)
//
// Approach: Make sure to handle user input and print the sorted array for reference.
//
// Sample Input:
// Enter the size of Array: 6
// Enter the 1 element of the array: 10
// Enter the 2 element of the array: 50
// Enter the 3 element of the array: 30
// Enter the 4 element of the array: 20
// Enter the 5 element of the array: 70
// Enter the 6 element of the array: 60
//
// Original Array is: 10 50 30 20 70 60
// Enter which nth Smallest and Largest number do u want from Array: 3
//
// Sample Output:
// Sorted Array: 10 20 30 50 60 70
// Smallest: 30
// Largest: 50

package Array;

import java.util.Arrays;
import java.util.Scanner;

public class FindKthSmallestAndLargest {
    static int[] findKthSmallestAndLargest(int[] arr, int k) {
        Arrays.sort(arr);
        System.out.print("Sorted Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        int[] result = {arr[k - 1], arr[arr.length - k]};
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the " + (i + 1) + " element of the array: ");
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print("Original Array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Enter which nth Smallest and Largest number do u want from Array: ");
        int k = sc.nextInt();
        int[] result = findKthSmallestAndLargest(arr, k);
        System.out.println("Smallest: " + result[0]);
        System.out.println("Largest: " + result[1]);
    }
}
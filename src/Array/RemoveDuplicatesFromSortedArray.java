// Remove Duplicates from Sorted Array
//
// Problem: Write a Java program to remove duplicate elements from a sorted array.
// Return the length of the array after removing duplicates and modify the array in-place.
//
// Approach: Use two pointers approach:
// - Keep one pointer for unique elements
// - Use another pointer to traverse the array
// - Only copy elements that are different from the previous unique element
//
// Sample Input:
// Enter the size of Array: 7
// Enter the elements: 1 1 2 2 3 4 4
//
// Sample Output:
// Original Array is: 1 1 2 2 3 4 4
// Length after removing duplicates: 4
// Array after removing duplicates: [1, 2, 3, 4]

package Array;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {
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
        int newLength = removeDuplicateElements(arr);
        System.out.println("Length after removing duplicates: " + newLength);
        System.out.print("Array after removing duplicates: [");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i]);
            if (i < newLength - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static int removeDuplicateElements(int[] arr) {
        int count = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[count]) {
                count++;
                arr[count] = arr[j];
            }
        }
        return count + 1;
    }
}
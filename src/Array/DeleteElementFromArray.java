// Delete Element from Array
//
// Problem: Write a Java program that takes an integer array and a value from the user,
// and deletes the first occurrence of that value from the array (if it exists).
// Shift the remaining elements to the left and print the new array.
//
// Approach: If the element is not found, display: "No element were found".
// Otherwise, display the updated array after deletion.
//
// Sample Input:
// Enter the size of Array: 5
// Enter the 1 element of the array: 10
// Enter the 2 element of the array: 20
// Enter the 3 element of the array: 30
// Enter the 4 element of the array: 40
// Enter the 5 element of the array: 50
//
// Original Array is: 10 20 30 40 50
// Enter the element you want to remove: 30
//
// Sample Output:
// Array after removal of element 30: 10 20 40 50

package Array;

import java.util.Scanner;

public class DeleteElementFromArray {
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
        System.out.print("Enter the element you want to remove: ");
        int removeElement = sc.nextInt();
        System.out.println();
        int foundElement = -1;
        for (int i = 0; i < arr.length; i++) {
            if (removeElement == arr[i]) {
                foundElement = i;
                break;
            }
        }
        if (foundElement == -1) {
            System.out.println("No element were found");
        } else {
            System.out.print("Array after removal of element " + removeElement + ": ");
            for (int i = foundElement; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            for (int i = 0; i < arr.length - 1; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
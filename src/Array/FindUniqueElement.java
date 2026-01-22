// Find Unique Element in Array
//
// Problem: Write a Java program to find the unique element in an integer array.
// A unique element is the one that appears only once, while all other elements may appear multiple times.
//
// Approach: The program should check each element against the others to determine its uniqueness.
//
// Sample Input:
// Enter the size of Array: 5
// Enter the 1 element of the array: 2
// Enter the 2 element of the array: 3
// Enter the 3 element of the array: 5
// Enter the 4 element of the array: 3
// Enter the 5 element of the array: 2
//
// Sample Output:
// Original Array is: 2 3 5 3 2
// Unique Element is: 5

package Array;

import java.util.Scanner;

public class FindUniqueElement {
    public static int findUniqueElement(int[] arr) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                return arr[i];
            }
        }
        return index;
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
        int result = findUniqueElement(arr);
        System.out.println();
        System.out.println("Unique Element is: " + result);
    }
}
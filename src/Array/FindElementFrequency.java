// Find Element Frequency in Array
//
// Problem: Write a Java program to build a frequency array from user input.
// Then, allow the user to run multiple queries to check whether a particular number exists in the array.
//
// Approach: Use a frequency array to count how many times each number appears.
// Respond with "YES" if the number is found, otherwise "NO".
//
// Sample Input:
// Enter the size of Array: 6
// Enter the 1 element of the array: 3
// Enter the 2 element of the array: 5
// Enter the 3 element of the array: 3
// Enter the 4 element of the array: 1
// Enter the 5 element of the array: 7
// Enter the 6 element of the array: 9
//
// Sample Output:
// Original Array is: 3 5 3 1 7 9
// Frequency Array is: 0 1 4 0 0 0

package Array;

import java.util.Scanner;

public class FindElementFrequency {
    public static int[] buildFrequencyArray(int[] arr) {
        int[] freq = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
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
        int[] freq = buildFrequencyArray(arr);
        System.out.print("Frequency Array is: ");
        for (int i = 0; i < freq.length; i++) {
            System.out.print(freq[i] + " ");
        }
    }
}
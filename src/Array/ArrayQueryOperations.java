// Array Query Operations
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
// Enter the number of queries: 3
// Enter the number to be searched: 3
// YES
// Enter the number to be searched: 2
// NO
// Enter the number to be searched: 7
// YES

package Array;

import java.util.Scanner;

public class ArrayQueryOperations {
    public static int[] buildFrequencyArray(int[] arr) {
        int[] freq = new int[100001];
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
        int[] freq = buildFrequencyArray(arr);
        System.out.println();
        System.out.print("Enter the number of queries: ");
        int q = sc.nextInt();
        while (q > 0) {
            System.out.print("Enter the number to be searched: ");
            int number = sc.nextInt();
            if (freq[number] > 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            q--;
        }
    }
}
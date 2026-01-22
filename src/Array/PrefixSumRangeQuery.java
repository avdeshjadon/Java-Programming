// Prefix Sum with Range Query (1-Based Indexing)
//
// Problem: Write a Java program to:
// - Take an array of integers using 1-based indexing (ignore 0th index).
// - Build its prefix sum array in-place.
// - Support multiple range sum queries using the prefix array.
//
// Approach: You will:
// - Use prefix sum logic where prefix[i] = arr[1] + arr[2] + ... + arr[i]
// - Answer queries for sum from index l to r in O(1) using: prefix[r] - prefix[l-1]
// - Ensure indexing is 1-based throughout
//
// Constraints:
// - Indexing must be strictly 1-based (input/output).
// - Give an error if user inputs index 0 or invalid.
//
// Sample Input:
// Enter the size of the array: 6
// Enter all the elements of the array: 10 20 30 40 50 60
// Original Array is: 10 20 30 40 50 60
// Enter the number of queries: 2
//
// Query 1 → From index 2 to 5
// Query 2 → From index 1 to 6
//
// Sample Output:
// Prefix Sum is: 10 30 60 100 150 210
// Required Sum is: 140
// Required Sum is: 210

package Array;

import java.util.Scanner;

public class PrefixSumRangeQuery {

    static Scanner sc = new Scanner(System.in);

    static int[] createArray(int num) {
        int[] arr = new int[num + 1];
        System.out.print("Enter all the elements of the array: ");
        for (int i = 1; i <= num; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static void printArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] buildPrefixArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        int num = sc.nextInt();
        int[] arr = createArray(num);
        System.out.print("Original Array is: ");
        printArray(arr);
        System.out.println();
        System.out.print("Enter the number of queries: ");
        int q = sc.nextInt();
        int[] pref = buildPrefixArray(arr);
        System.out.print("Prefix Sum is: ");
        printArray(pref);
        System.out.println();
        while (q-- > 0) {
            System.out.print("Enter Starting Index (included): ");
            int l = sc.nextInt();
            System.out.print("Enter Ending Index (included): ");
            int r = sc.nextInt();
            if (l == 0 || r == 0) {
                System.out.println("Please Select the number from (1 to " + (arr.length - 1) + ")");
            } else {
                int ans = pref[r] - pref[l - 1];
                System.out.println("Required Sum is: " + ans);
                System.out.println();
            }
        }
    }
}
// Create Prefix Sum Array
//
// Problem: Write a Java program to:
// - Given an integer array, create its prefix sum array.
// - Prefix sum at index i = sum of all elements from index 0 to i.
// - Return the prefix sum array.
//
// Approach: Example Logic:
//   - Input:  [1, 2, 3, 4]
//   - Prefix: [1, 3, 6, 10] → (1), (1+2), (1+2+3), (1+2+3+4)
//
// Sample Input:
// Original Array: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
//
// Sample Output:
// Prefix Sum Array: [1, 3, 6, 10, 15, 21, 28, 36, 45, 55]

package Array;

import java.util.Arrays;

public class CreatePrefixSumArray {

    static int[] createPrefixSumArray(int[] arr) {
        int[] pref = new int[arr.length];
        pref[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            pref[i] = pref[i - 1] + arr[i];
        }
        return pref;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] pref = createPrefixSumArray(arr);
        System.out.print("Original Array: ");
        System.out.println(Arrays.toString(arr));
        System.out.print("Prefix Sum Array: ");
        System.out.println(Arrays.toString(pref));
    }
}
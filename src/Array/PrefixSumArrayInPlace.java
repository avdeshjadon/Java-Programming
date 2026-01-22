// Prefix Sum Array In Place
//
// Problem: Write a Java program to:
// - Convert a given integer array to its prefix sum array.
// - Do this without using any extra array (modify the original array in-place).
//
// Approach: Example Logic:
//   - Input:  [1, 2, 3, 4]
//   - Output: [1, 3, 6, 10]
//
// Constraint:
//   - Do not use a separate array for storing results.
//   - Update the input array itself.
//
// Sample Input:
// Original Array: [1, 2, 3, 4, 5]
//
// Sample Output:
// Prefix Sum Array: [1, 3, 6, 10, 15]

package Array;

import java.util.Arrays;

public class PrefixSumArrayInPlace {

    static void createPrefixSumInPlace(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Original Array: ");
        System.out.println(Arrays.toString(arr));

        createPrefixSumInPlace(arr);

        System.out.print("Prefix Sum Array: ");
        System.out.println(Arrays.toString(arr));
    }
}
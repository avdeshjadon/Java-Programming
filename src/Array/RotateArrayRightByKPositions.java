// Rotate Array Right by K Positions
//
// Problem: Write a Java program that rotates an array to the right by K positions.
// Rotation means that each element is shifted right, and the last element moves to the first position.
// Handle both positive and negative values of K appropriately.
//
// Approach: You will:
// - Input the array from the user
// - Ask for a rotation number
// - Output the rotated array
//
// Sample Input:
// Enter the size of Array: 6
// Enter the 1 element of the array: 10
// Enter the 2 element of the array: 20
// Enter the 3 element of the array: 30
// Enter the 4 element of the array: 40
// Enter the 5 element of the array: 50
// Enter the 6 element of the array: 60
//
// Original Array is: 10 20 30 40 50 60
// Enter the rotation number: 2
//
// Sample Output:
// Rotated Array is: 50 60 10 20 30 40

package Array;

import java.util.Scanner;

public class RotateArrayRightByKPositions {
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
        System.out.print("Enter the rotation number: ");
        int rotateNumber = sc.nextInt();
        rotateNumber = rotateNumber % num;
        if (rotateNumber < 0) {
            rotateNumber += num;
        }
        int[] rotated = new int[num];
        for (int i = 0; i < rotateNumber; i++) {
            rotated[i] = arr[num - rotateNumber + i];
        }
        for (int i = rotateNumber; i < num; i++) {
            rotated[i] = arr[i - rotateNumber];
        }
        System.out.print("Rotated Array is: ");
        for (int value : rotated) {
            System.out.print(value + " ");
        }
    }
}
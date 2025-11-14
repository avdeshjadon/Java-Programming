package JavaSelfPractice;

import java.util.Arrays;
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println();
        System.out.println("<--------- Enter the elements of the array -------->");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the " + (i + 1) + " element of the Array :  ");
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print("Original Array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int[] newArray = Arrays.copyOf(arr, arr.length + 1);
        System.out.print("Enter the number u want to insert : ");
        int insertNumber = sc.nextInt();
        System.out.print("Enter the Position where u want to insert the number(" + insertNumber + ") : ");
        int insertPosition = sc.nextInt();
        for (int i = newArray.length-1; i >= insertPosition; i--) {
            newArray[i] = newArray[i - 1];
        }
        newArray[insertPosition - 1] = insertNumber;
        System.out.print("Array after insertion : ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}

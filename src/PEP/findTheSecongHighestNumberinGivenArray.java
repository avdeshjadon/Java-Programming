package PEP;

import java.util.Scanner;

public class findTheSecongHighestNumberinGivenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Arrray : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter all the element of the Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the " + (i + 1) + " element of the Array : ");
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print("Original Array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("======= Finding Largest  & Second largest Number in Array =======");
        System.out.println();
        int maxNumber = Integer.MIN_VALUE;
        int seconfMaxNumber = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNumber) {
                seconfMaxNumber = maxNumber;
                maxNumber = arr[i];
            }
            else{
                if(seconfMaxNumber<arr[i]&&arr[i]!=maxNumber)
                    seconfMaxNumber=arr[i];
            }
        }

        System.out.println("Largest Number in the Array is : " + maxNumber);
        System.out.println("Second largest number in the Array is : " + seconfMaxNumber);


    }
}

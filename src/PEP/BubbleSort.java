package PEP;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int num =sc.nextInt();
        int arr[]=new int[num];
        System.out.println();
        System.out.println("========== Enter all the element of the Array ===========");
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter "+(i+1)+" Element of the Array : ");
            arr[i]=sc.nextInt();
        }
        System.out.println();
        System.out.println("===========================================================");
        System.out.print("Original Array is : ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("===========================================================");
        System.out.print("Ascending Order : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}

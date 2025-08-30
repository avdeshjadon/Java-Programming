package JavaSelfPractice;

import java.util.Arrays;
import java.util.Scanner;

public class main12 {

    static int[] AscendingOrder(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    static  int [] DescendingOrder(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;i++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.print("Enter all the element opf the array ----->");
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + (i + 1) + " element of the array : ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int[] arrasc = AscendingOrder(arr);
        System.out.println("Ascending Order : " + Arrays.toString(arrasc));
        System.out.println("Ascending Order : " + Arrays.toString(arrasc));
    }
}

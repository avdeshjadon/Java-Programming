package JavaSelfPractice;

import java.util.Arrays;

class Rotate {
    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static int[] rotateArray(int[] arr, int k) {
        int n = arr.length;
        reverseArray(arr, 0, k);
        reverseArray(arr, k + 1, n - 1);
        reverseArray(arr, 0, n - 1);
        return arr;
    }
}
public class main10 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        System.out.println(Arrays.toString(Rotate.rotateArray(arr, k)));
    }
}

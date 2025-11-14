package JavaSelfPractice;

public class main9 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5334, 4345, 576, 8454, 43546578, 4, 56, 87678, 3};
        int max = Integer.MIN_VALUE;
        int secongMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secongMax && arr[i] != max) {
                secongMax = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(secongMax);
    }
}

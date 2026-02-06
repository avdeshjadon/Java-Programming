package PEP;

public class FindHighestNumberInGivenArray {
    public static void main(String[] args) {
        int[] arr = {34, 67, 23, 89, 2, 90, 11};

        int highest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > highest) {
                highest = arr[i];
            }
        }
        System.out.println("The highest number in the array is: " + highest);
    }
}

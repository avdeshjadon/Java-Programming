package PEP;

public class FindLowestNumberinGivenArray {
    public static void main(String[] args) {
        int[] arr = {34, 67, 23, 89, 2, 90, 11};
        int lowest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < lowest) {
                lowest = arr[i];
            }
        }
        System.out.println("The lowest number in the array is: " + lowest);
    }
}

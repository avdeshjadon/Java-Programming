package JavaSelfPractice;

public class main1 {
    public static int isunique(int[] arr) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            boolean unique = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                return arr[i];
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 2, 1};
        System.out.println("Unique : " + isunique(arr));
    }
}

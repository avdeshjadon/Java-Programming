package JavaSelfPractice;

public class main5 {
    public static boolean issorted(int[] arr){
        boolean sorted=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                sorted=false;
                break;
            }
        }
        return sorted;
    }
    public static void main(String[] args) {
        int [] arr={8,7,6,5,4,3,2,1};
        System.out.println(issorted(arr));
    }
}

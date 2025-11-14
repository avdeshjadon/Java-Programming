package JavaSelfPractice;

public class main4 {
    public static int lastIndex(int[] arr,int num){
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                index=i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr={1,4,2,5,8,2,6,2,6,2,7,2,9,6,9,2,6,44,56};
        int num=2;
        System.out.println(lastIndex(arr,num));
    }
}

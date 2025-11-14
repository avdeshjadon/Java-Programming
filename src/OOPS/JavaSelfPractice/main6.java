package JavaSelfPractice;

public class main6 {
    public static void main(String[] args) {
        int[] arr = {-99999999, -9999999, -5, -1, -10};

        int maxNumber=Integer.MAX_VALUE;
        int minNumber=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>minNumber){
                minNumber=arr[i];
            }
        }
        int largestNumber=minNumber;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<maxNumber){
                maxNumber=arr[i];
            }
        }
        int smallestNumber=maxNumber;
        int[] newArray=new int[2];
        newArray[0]=smallestNumber;
        newArray[1]=largestNumber;
        for(int i=0;i<newArray.length;i++){
            System.out.print(newArray[i]+" ");
        }
    }
}

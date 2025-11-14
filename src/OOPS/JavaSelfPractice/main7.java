package JavaSelfPractice;

import java.util.Scanner;

public class main7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int first=-1;
        int second=-1;
        int count=0;
        int [] arr={1,2,3,4,5,6,7,8,9,10};
        int targatedNumber=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==targatedNumber){
                    count++;
                    first=i;
                    second=j;
                    System.out.println("("+i+","+j+")");

                }

            }
        }
        System.out.println(count);
    }
}

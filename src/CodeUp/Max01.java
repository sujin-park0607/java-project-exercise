package CodeUp;

import java.util.Scanner;

public class Max01 {
    public static void main(String[] args) {
        int[] arr = new int[9];
        int maxValue = 0;
        int maxIndex = 0;

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<arr.length; i++){
            int num = sc.nextInt();
            if(maxValue < num){
                maxValue = num;
                maxIndex = i;
            }
        }
        System.out.println(maxValue);
        System.out.println(maxIndex+1);
    }
}

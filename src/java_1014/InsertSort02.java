package java_1014;

import java.util.Arrays;
import java.util.Scanner;

public class InsertSort02 {
    void change(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    int[] sort(int[] arr, int i) {
        if ( i== arr.length){
            return arr;
        }
        for (int j = i; j > 0; j--){
            if(arr[j] < arr[j-1]){
                change(arr, j, j-1);
            }
        }
        return sort(arr, i+1);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{8, 5, 6, 2, 4};


        InsertSort02 insertSort = new InsertSort02();

        int[] resultArr = insertSort.sort(arr,1);

        System.out.println(Arrays.toString(arr));

    }
}

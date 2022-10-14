package java_1014;

import java.util.Arrays;
import java.util.Scanner;

public class InsertSort {
    void change(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++){
            for (int j = i; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    change(arr, j, j-1);
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
//        int[] arr = new int[]{8, 5, 6, 2, 4};

        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] arr = new int[cnt];
        for(int i=0; i<cnt; i++){
            arr[i] = sc.nextInt();
        }

        InsertSort insertSort = new InsertSort();

        int[] resultArr = insertSort.sort(arr);

        for(int i=0; i<resultArr.length; i++){
            System.out.println(resultArr[i]);
        }
    }
}

package java_1014;

import java.util.Arrays;

public class InsertSort {
    void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++){
            for (int j = i; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                } else{
                    break;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{8, 5, 6, 2, 4};

        InsertSort insertSort = new InsertSort();

        int[] resultArr = insertSort.sort(arr);
        System.out.println(Arrays.toString(resultArr));
    }
}

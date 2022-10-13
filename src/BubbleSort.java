import java.util.Arrays;

public class BubbleSort {
    public int[] sort(int[] arr){
        int temp;
        int min;

        for(int i=0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

//    public int[] sort(int[] arr){
//        int temp;
//        int min;
//
//        for (int j = 1; j < arr.length; j++) {
//            if (arr[j] < arr[0]) {
//                temp = arr[0];
//                arr[0] = arr[j];
//                arr[j] = temp;
//            }
//        }
//
//        return arr;
//    }

    public static void main(String[] args) {
        int[] arr = new int[]{7, 2, 3, 9, 28, 11};
        //오름차순 또는 내림차순으로 정렬하는 알고리즘을 짜보세요

        BubbleSort bs = new BubbleSort();
        System.out.println(Arrays.toString(bs.sort(arr)));
    }
}

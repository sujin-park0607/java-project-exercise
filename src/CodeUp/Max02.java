package CodeUp;

public class Max02 {
    public int getMax(int[] arr){
        int maxValue = 0;

        for(int i=0; i < arr.length; i++){
            if(maxValue < arr[i]){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{3, 29, 38, 12, 57, 74, 40, 85, 61};
        Max02 max02 = new Max02();
        int result = max02.getMax(arr);
        if (result==85){
            System.out.println("테스트 통과");
        }else{
            System.out.println("테스트 실패. result" + result);
        }


    }
}

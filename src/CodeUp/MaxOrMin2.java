package CodeUp;

interface Choice{
    boolean choiceMaxOrMin(int valueA, int valueB);
}

public class MaxOrMin2 {
    private int[] getMaxOrMin(int[][] arr, Choice choice){
        int targetValue = arr[0][0];
        int col = 0;
        int row = 0;


        for(int i=0; i< arr.length; i++){
            for(int j=0; j< arr[0].length; j++){
                boolean mom = choice.choiceMaxOrMin(targetValue, arr[i][j]);
                if(mom){
                    targetValue = arr[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        int[] result = {targetValue, col+1, row+1};
        return result;
    }

    public int[] max(int[][] arr){
        return getMaxOrMin(arr, new Choice(){

            @Override
            public boolean choiceMaxOrMin(int valueA, int valueB) {
                return valueA < valueB;
            }
        });
    }

    public int[] min(int[][] arr){
        return getMaxOrMin(arr, new Choice(){

            @Override
            public boolean choiceMaxOrMin(int valueA, int valueB) {
                return valueA > valueB;
            }
        });
    }


    public static void main(String[] args) {
        int[][] arr =new int[][]{
            {3,23,85,34,17,74,25,52,65},
            {10,7,39,42,88,52,14,72,63},
            {87,42,18,78,53,45,18,84,53},
            {34,28,64,85,12,16,75,36,55},
            {21,77,45,35,28,75,90,76,1},
            {25,87,65,15,28,11,37,28,74},
            {65,27,75,41,7,89,78,64,39},
            {47,47,70,45,23,65,3,41,44},
            {87,13,82,38,31,12,29,29,80}
        };

        MaxOrMin2 mom = new MaxOrMin2();
        int[] maxResult = mom.max(arr);
        for (int i : maxResult) {
            System.out.println(i);
        }
        System.out.println("-------------");
        int[] minResult = mom.min(arr);
        for (int i : minResult) {
            System.out.println(i);
        }
    }
}

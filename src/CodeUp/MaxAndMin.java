package CodeUp;

interface Compare{
    boolean doSomething(int valueA, int valueB);
}

public class MaxAndMin {
    private int getMaxOrMin(int[] arr, Compare compare) {
        int targetValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            boolean isSth = compare.doSomething(arr[i],targetValue);
            if (isSth) {
                targetValue = arr[i];
            }
                }
        return targetValue;

    }


    public int max(int[] arr){
        return getMaxOrMin(arr, new Compare(){
            @Override
            public boolean doSomething(int valueA, int valueB){
                return valueA > valueB;
            }
        });
    }

    public int min(int[] arr){
        return getMaxOrMin(arr, new Compare(){
            @Override
            public boolean doSomething(int valueA, int valueB){
                return valueA < valueB;
            }
        });
    }



    public static void main(String[] args) {
        int[] arr = new int[]{3, 23, 85, 34, 17, 74, 25, 52, 65};

        MaxAndMin maxAndMin = new MaxAndMin();
        System.out.println(maxAndMin.max(arr));
        System.out.println(maxAndMin.min(arr));


    }
}

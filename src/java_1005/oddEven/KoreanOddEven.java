package java_1005.oddEven;

public class KoreanOddEven implements OddEvenImple {
    @Override
    public String findOddEven(int num) {
        if(num%2 == 0){
            return "짝";
        }else{
            return "홀";
        }
    }
}

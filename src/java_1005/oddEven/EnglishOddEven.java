package java_1005.oddEven;

public class EnglishOddEven implements OddEvenImple {
    @Override
    public String findOddEven(int num) {
        if(num%2 == 0){
            return "Even";
        }else{
            return "Odd";
        }
    }
}

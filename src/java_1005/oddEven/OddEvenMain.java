package java_1005.oddEven;

public class OddEvenMain {
    public static void main(String[] args) {
        int num1 = 13;
        int num2 = 20;
//        OddEvenImple oddEvenImple = new KoreanOddEven(); //짝, 홀
        OddEvenImple oddEvenImple = new EnglishOddEven(); //Even, Odd
        OddEven oddEven = new OddEven(oddEvenImple, num1, num2);
        oddEven.run();
    }
}

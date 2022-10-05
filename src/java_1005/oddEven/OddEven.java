package java_1005.oddEven;

public class OddEven {
    private OddEvenImple oddEvenImple;
    private int num1;
    private int num2;

    public OddEven(OddEvenImple oddEvenImple, int num1, int num2){
        this.oddEvenImple = oddEvenImple;
        this.num1 = num1;
        this.num2 = num2;
    }
    public void run() {
        System.out.println(oddEvenImple.findOddEven(num1) +  "+" + oddEvenImple.findOddEven(num2) + "=" + oddEvenImple.findOddEven(num1+num2));
    }
}

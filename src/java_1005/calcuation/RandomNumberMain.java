package java_1005.calcuation;

public class RandomNumberMain {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new SpecificNumberGenerator();
        Calculator calculator = new Calculator(numberGenerator);

        calculator.plus(10);



    }
}

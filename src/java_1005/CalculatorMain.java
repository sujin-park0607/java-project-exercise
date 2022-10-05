package java_1005;

public class CalculatorMain {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new SpecificNumberGenerator();
//        NumberGenerator numberGenerator = new RandomNumberGenerator();

        Calculator randomCalculator = new Calculator(numberGenerator);
        randomCalculator.plus(10);


    }
}

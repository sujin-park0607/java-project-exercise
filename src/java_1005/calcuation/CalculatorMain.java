package java_1005.calcuation;

public class CalculatorMain {
    public static void main(String[] args) {
//        NumberGenerator numberGenerator = new SpecificNumberGenerator(); //고정숫자
        NumberGenerator numberGenerator = new RandomNumberGenerator(); //랜덤숫자

        Calculator calculator = new Calculator(numberGenerator);
        calculator.plus(10);


    }
}

package java_1005.calcuation;

public class CalculatorMain {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new SpecificNumberGenerator(); //고정숫자
//        NumberGenerator numberGenerator = new RandomNumberGenerator(); //랜덤숫자

//        Calculator calculator = new Calculator(numberGenerator); //고정값 사용
        Calculator calculator = new Calculator(numberGenerator, 20); //입력값 사용
        calculator.plus(10);


    }
}

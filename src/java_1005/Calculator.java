package java_1005;

public class Calculator {
    private int inputNum;
    private NumberGenerator numberGenerator;

    public Calculator(NumberGenerator numberGenerator) {
        inputNum = 10;
        this.numberGenerator = numberGenerator;
    }

    public void plus(int num) {
        System.out.println(inputNum + numberGenerator.generate(num));
    }
}

package java_1005;

public class Calculator {
    private NumberGenerator numberGenerator;

    public Calculator(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public void plus(int num) {
        System.out.println(num + numberGenerator.generate(num));
    }
}

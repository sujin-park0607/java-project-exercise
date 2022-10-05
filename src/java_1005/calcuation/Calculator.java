package java_1005.calcuation;

public class Calculator {
    private NumberGenerator numberGenerator;
    private int baseNum;

    public Calculator(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
        this.baseNum = 10;
    }

    public Calculator(NumberGenerator numberGenerator, int baseNum) {
        this.numberGenerator = numberGenerator;
        this.baseNum = baseNum;
    }

    public void plus(int num) {
        System.out.println(baseNum + numberGenerator.generate(num));
    }
}

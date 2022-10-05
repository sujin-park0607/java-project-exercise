package java_1005;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int a = 10;
        int b = 3;

        System.out.println(cal.plus(a,b));
        System.out.println(cal.minus(a,b));
        System.out.println(cal.multiple(a,b));
        System.out.println(cal.divide(a,b));
    }
}

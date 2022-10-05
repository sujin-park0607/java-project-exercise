package java_1005;

public class RandomNumberMain {
    public static void main(String[] args) {
        RandomNumber random = new RandomNumber(10);
        random.randomNum();

        System.out.println(random.plus());
        System.out.println(random.minus());
        System.out.println(random.multiple());
        System.out.println(random.divide());


    }
}

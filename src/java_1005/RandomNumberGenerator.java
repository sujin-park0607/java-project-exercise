package java_1005;

public class RandomNumberGenerator implements NumberGenerator {

    @Override
    public int generate(int num) {
        return (int)(Math.random() * 10) + 1;
    }
}

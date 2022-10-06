package java_1006.randomChar;

public class RandomCharGenerator {

    public char generate(int num) {
        return (char)((Math.random() * num)+97);
    }
}

package java_1006.randomChar;

import java.util.HashSet;
import java.util.Set;

public class RndCharWithoutDuplicated {
    public static void main(String[] args) {
        Set<Character> randomArpabet = new HashSet<>();
        RandomCharGenerator randomCharGenerator = new RandomCharGenerator();
        for(int i=0; i<50; i++){
            char r = randomCharGenerator.generate();
            System.out.println(r);
            randomArpabet.add(r);
        }
        System.out.println(randomArpabet);
        System.out.println(randomArpabet.size());

    }
}

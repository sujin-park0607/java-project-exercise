package java_1006.collection.set;

import java.util.HashSet;
import java.util.Set;

public class RndNumbersWithoutDuplicated {
    public static void main(String[] args) {
        Set<Integer> randomNum = new HashSet<>();
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        for(int i=0; i<50; i++){
            int r = randomNumberGenerator.generate(10);
            System.out.println(r);
            randomNum.add(r);
        }
        System.out.println(randomNum);

    }
}

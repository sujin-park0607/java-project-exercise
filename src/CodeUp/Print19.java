package CodeUp;

import java.util.Scanner;

//CodeUp1018
public class Print19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] str = line.split("\\."); //.을 문자열로 인식하기 위해서는 \\. 하거나 [.] 해주어야 한다.
        System.out.printf("04%d.%02d.%02d", Integer.parseInt(str[0]), Integer.parseInt(str[1]), Integer.parseInt(str[2]));
    }
}
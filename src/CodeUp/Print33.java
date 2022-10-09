package CodeUp;

import java.util.Scanner;

public class Print33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String octal = sc.next();
        int num = Integer.parseInt(octal,8);

        System.out.println(num);

    }
}

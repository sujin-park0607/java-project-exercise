package CodeUp.solution100;

import java.util.Scanner;

public class Print32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String hexString = Integer.toHexString(num);

        System.out.println(hexString);

    }
}

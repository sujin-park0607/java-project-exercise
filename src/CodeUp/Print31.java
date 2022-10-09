package CodeUp;

import java.util.Scanner;

public class Print31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String octalString = Integer.toOctalString(num);

        System.out.println(octalString);

    }
}

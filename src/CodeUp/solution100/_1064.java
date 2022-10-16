package CodeUp.solution100;

import java.util.Scanner;

public class _1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = a < b? (a < c? a: c):(b < c? b: c);
        System.out.println(result);

    }
}

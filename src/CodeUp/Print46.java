package CodeUp;

import java.util.Scanner;

public class Print46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println((int)(a+b+c));
        System.out.printf("%.1f",(a+b+c)/3.0);

    }
}

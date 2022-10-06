package CodeUp;

import java.util.Scanner;

//CodeUp1012
public class Print12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        String str = String.format("%.6f",x);
        System.out.println(str);
    }
}

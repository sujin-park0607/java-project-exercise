package CodeUp.solution100;

import java.util.Scanner;

//CodeUp1023
public class Print23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] num = str.split("\\.");

        System.out.println(num[0]);
        System.out.println(num[1]);
    }
}
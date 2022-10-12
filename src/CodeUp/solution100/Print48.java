package CodeUp.solution100;

import java.util.Scanner;

public class Print48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        double powNum = Math.pow(2,b);
        System.out.println((int)(a*powNum));


    }
}

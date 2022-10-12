package CodeUp.solution100;

import java.util.Scanner;

public class Print34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String octalNum = sc.next();
        int integerNum = Integer.parseInt(octalNum,8);
        System.out.println(integerNum);

    }
}

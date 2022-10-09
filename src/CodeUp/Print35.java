package CodeUp;

import java.util.Scanner;

public class Print35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hex = sc.next();
        int integerNum = Integer.parseInt(hex,16);
        String octalNum = Integer.toOctalString(integerNum);

        System.out.println(octalNum);

    }
}

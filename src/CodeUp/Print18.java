package CodeUp;

import java.util.Scanner;

//CodeUp1018
public class Print18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] str = line.split(":");

        System.out.printf(str[0]+":"+str[1]);
    }
}

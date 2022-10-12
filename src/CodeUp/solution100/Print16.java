package CodeUp.solution100;

import java.util.Scanner;

//CodeUp1016
public class Print16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] str = line.split(":");

        System.out.printf("%d:%d",str[0],str[1]);
    }
}

package CodeUp;

import java.util.Scanner;

//CodeUp1026
public class Print26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] str = line.split(":");
        System.out.printf("%d",Integer.parseInt(str[1]));
    }
}
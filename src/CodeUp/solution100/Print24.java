package CodeUp.solution100;

import java.util.Scanner;

//CodeUp1024
public class Print24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for(int i=0; i < str.length(); i++){
            System.out.printf("\'%c\'",str.charAt(i));
            System.out.println();
        }
    }
}
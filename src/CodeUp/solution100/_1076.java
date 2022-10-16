package CodeUp.solution100;

import java.util.Scanner;

public class _1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        for(int i=97; i <= (int)ch; i++){
            System.out.print((char)i+" ");
        }
    }
}




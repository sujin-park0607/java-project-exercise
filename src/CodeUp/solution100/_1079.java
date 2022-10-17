package CodeUp.solution100;

import java.util.Scanner;

public class _1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");

        for (String s : arr) {
            System.out.println(s);
            if(s.equals("q")){
                break;
            }

        }
    }
}




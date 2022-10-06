package CodeUp;

import java.util.Scanner;

//CodeUp1025
public class Print25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        String letter = "10000";
        for(int i=0; i < num.length(); i++){
            String str = ""+num.charAt(i);
            letter = letter.substring(0,num.length()-i);
            System.out.println("[" + Integer.parseInt(str) * Integer.parseInt(letter)  + "]");
        }
    }
}
package CodeUp;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;
        while(num > 0){
            num = num/ 10;
            result ++;
        }
        System.out.println(result);
    }
}

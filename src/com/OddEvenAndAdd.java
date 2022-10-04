package com;

import java.util.Scanner;

public class OddEvenAndAdd {
    public static String findOddEven(int num){
        if(num % 2 == 0){
            return "짝수";
        }else{
            return "홀수";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(findOddEven(num1) + "+" + findOddEven(num2) + "=" + findOddEven(num1+num2));

    }
}

package com;

import java.util.Scanner;
    public class CoinTest {
        public static void main(String[] args) {

            System.out.println("금액을 넣으세요: ");
            Scanner sc = new Scanner(System.in);
            int money = sc.nextInt();

            int money50000 = 50000;
            int money10000 = 10000;
            int money5000 = 5000;
            int money1000 = 1000;
            int money500 = 500;
            int money100 = 100;
            int money50 = 50;
            int money10 = 10;

            System.out.println("50000원 " + money/money50000 + "개" + " 나머지는" + money%money50000);
            money = money % 50000;
            System.out.println("10000원 " + money/money10000 + "개" + " 나머지는" + money%money10000);
            money = money % 10000;
            System.out.println("5000원 " + money/money5000 + "개" + " 나머지는" + money%money5000);
            money = money % 5000;
            System.out.println("1000원 " + money/money1000 + "개" + " 나머지는" + money%money1000);
            money = money % 1000;
            System.out.println("500원 " + money/money500 + "개" +  "나머지는" + money%money500);
            money = money % 500;
            System.out.println("100원 " + money/money100 + "개" + " 나머지는" + money%money100);
            money = money % 100;
            System.out.println("50원 " + money/money50 + "개" +  "나머지는" + money%money50);
            money = money % 50;
            System.out.println("10원 " + money/money10 + "개" + "나머지는" + money%money10);
            money = money % 10;
            }

}

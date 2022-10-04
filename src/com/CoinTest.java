package com;

import java.util.Scanner;
    public class CoinTest {
        public static void main(String[] args) {
            int[] arr = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

            System.out.println("금액을 넣으세요: ");
            Scanner sc = new Scanner(System.in);
            int money = sc.nextInt();

            int money50000 = money/arr[0];
            System.out.println("50000원" + money50000 + "장" + " 나머지는" + money%arr[0]);

            int money10000 = money/arr[1];
            System.out.println("10000" + money10000 + "장" + " 나머지는" + money%arr[1]);

            int money5000 = money/arr[2];
            System.out.println("5000원" + money5000 + "장" + " 나머지는" + money%arr[2]);

            int money1000 = money/arr[3];
            System.out.println("1000원" + money1000 + "장" + " 나머지는" + money%arr[3]);

            int money500 = money/arr[4];
            System.out.println("500원" + money500 + "장"+ " 나머지는" + money%arr[4]);

            int money100 = money/arr[5];
            System.out.println("100원" + money100 + "장" + " 나머지는" + money%arr[5]);

            int money50 = money/arr[6];
            System.out.println("50원" + money50 + "장"+ " 나머지는" + money%arr[6]);

            int money10 = money/arr[7];
            System.out.println("10원" + money10 + "장"+ " 나머지는" + money%arr[7]);
            }

}

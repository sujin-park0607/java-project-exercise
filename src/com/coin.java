package com;

import java.util.Scanner;

public class coin {
    public static void main(String[] args) {
        int[] arr = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

        System.out.println("금액을 넣으세요: ");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();

        for(int i=0; i<arr.length; i++){
            int cnt = money/arr[i];
            money -= arr[i] * cnt;
            System.out.println(arr[i] + "원" + cnt + "개");
        }
    }
}

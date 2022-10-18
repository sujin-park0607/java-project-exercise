package Algorithms;

import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //공백
        for(int i=0; i<n ; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int k=0; k<n; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

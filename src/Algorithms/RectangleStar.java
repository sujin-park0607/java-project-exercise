package Algorithms;

import java.util.Scanner;

public class RectangleStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            if(i==1 || i==n){
                for(int k=1; k<=n; k++){
                    System.out.print("*");
                }
                System.out.println();
            }else{
                for(int j=1; j<=n; j++){
                    if(j==1 || j==n){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}

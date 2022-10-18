package Algorithms;

import java.util.Scanner;

public class TriangleStar {
    public void printStar(int n, String now){
        if( n== now.length()-1){
            return;
        }
        System.out.println(now);
        printStar(n,now+"*");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        TriangleStar star = new TriangleStar();
        star.printStar(n,"*");

    }
}

package CodeUp.solution100;

import java.util.Scanner;

public class _1058 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int isTrue1 = sc.nextInt();
        int isTrue2 = sc.nextInt();

        if(isTrue1==0 && isTrue2==0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}

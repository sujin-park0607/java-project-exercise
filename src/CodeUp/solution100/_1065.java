package CodeUp.solution100;

import java.util.Scanner;

public class _1065 {
    public void even(int num){
        if(num%2==0){
            System.out.println(num);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        _1065 main  = new _1065();
        main.even(a);
        main.even(b);
        main.even(c);
    }
}

package CodeUp.solution100;

import java.util.Scanner;

public class _1067 {
    public void grade(int month){
        switch(month){
            case 'A':
                System.out.println("best!!!");
                break;
            case 'B':
                System.out.println("good!!");
                break;
            case 'C':
                System.out.println("run!");
                break;
            case 'D':
                System.out.println("slowly~");
                break;
            default:
                System.out.println("what?");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        _1067 main  = new _1067();
        main.grade(month);

    }
}

package CodeUp.solution100;

import java.util.Scanner;

public class _1073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");

        for (String str : arr) {
            if(Integer.parseInt(str)==0){
                break;
            }
            System.out.println(str);
        }
    }
}

package CodeUp.solution100;


import java.io.IOException;
import java.util.Scanner;

public class _1083 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=1; i<= num; i++){
            String str = String.valueOf(i);
            if(str.contains("3") || str.contains("6") || str.contains("9")){
                System.out.print("X");
            }
            else {
                System.out.print(i);
            }
            System.out.print(" ");
        }
    }
}




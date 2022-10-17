package CodeUp.solution100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1082 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String hexInput = br.readLine();

        int decimal = Integer.parseInt(hexInput,16);
        for(int i=1; i<=15; i++){
            System.out.printf("%X*%X=%X\n",decimal,i,decimal*i);
        }
    }
}




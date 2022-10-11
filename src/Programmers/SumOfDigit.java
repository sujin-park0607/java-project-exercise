package Programmers;
import java.util.*;

public class SumOfDigit {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            answer += Integer.parseInt(String.valueOf(ch));
        }

        return answer;
    }

    public static void main(String[] args) {
        SumOfDigit sod = new SumOfDigit();
        int result1 = sod.solution(1234);

        if(result1 == 10){
            System.out.println("테스트 통과 했습니다");
        }else{
            System.out.println("테스트 실패 "+ result1);
        }
    }
}

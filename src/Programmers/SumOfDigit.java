package Programmers;
import java.util.*;

public class SumOfDigit {
    //좋은 코드 아님 - n을 String으로 변경
//    public int solution(int n) {
//        int answer = 0;
//        String str = Integer.toString(n);
//
//        for(int i=0; i<str.length(); i++){
//            char ch = str.charAt(i);
//            answer += Integer.parseInt(String.valueOf(ch));
//        }
//        return answer;
//    }

    //% 연산 이용 몫, 나머지
    public int solution(int n) {
        int answer = 0;

        while(n > 0){
            answer += n % 10;
            n = n/10;
        }
        return answer;
    }


    public static void main(String[] args) {
        SumOfDigit sod = new SumOfDigit();
        int result1 = sod.solution(1234);

        if(result1 == 10){
            System.out.println("테스트 통과 했습니다");
        }else{
            System.out.printf("테스트 실패 result: %d \n",result1);
        }
    }
}

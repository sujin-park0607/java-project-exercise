package java_1006.map;

import java.util.HashMap;

public class CountAlphabet {
    public static boolean isAlphabet(char ch){
        if(ch >= 97 && ch <=122){ //받은 String을 모두 소문자로 변경해주었기 때문에 소문자 아스키코드만 확인하면 된다
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String git = "aaaAAAbbbBB".toLowerCase(); //소문자로 변경

        HashMap<Character, Integer> alphabetCnt = new HashMap<>(); //해쉬맵 생성

        for(int i=0; i<git.length(); i++){
            if(alphabetCnt.get(git.charAt(i)) == null && isAlphabet(git.charAt(i))){ //해쉬맵에 키가 없을경우 생성
                alphabetCnt.put(git.charAt(i),1);

            }else if(alphabetCnt.get(git.charAt(i)) != null){ //해쉬맵에 키가 있을경우
                alphabetCnt.put(git.charAt(i), alphabetCnt.get(git.charAt(i))+ 1);

            }else{ //문자가 아닐경우
                continue;
            }
        }
        System.out.println(alphabetCnt);
    }
}

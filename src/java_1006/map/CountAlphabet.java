package java_1006.map;

import java.util.HashMap;

public class CountAlphabet {
    public static boolean isAlphabet(char ch){
        if(ch >= 97 && ch <=122){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String git = "aaaAAAbbbBB";
        git = git.toLowerCase();
        HashMap<Character, Integer> alphabetCnt = new HashMap<>(); //해쉬맵 생성

        for(int i=0; i<git.length(); i++){
            if(alphabetCnt.get(git.charAt(i)) == null && isAlphabet(git.charAt(i))){
                alphabetCnt.put(git.charAt(i),1);

            }else if(alphabetCnt.get(git.charAt(i)) != null){
                alphabetCnt.put(git.charAt(i), alphabetCnt.get(git.charAt(i))+ 1);

            }else{
                continue;
            }
        }
        System.out.println(alphabetCnt);
    }
}

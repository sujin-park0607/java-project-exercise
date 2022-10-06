package java_1006.map;

import java.util.HashMap;
import java.util.Locale;

public class CountArpabet {
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
        HashMap<Character, Integer> arpabetCnt = new HashMap<>(); //해쉬맵 생성

        System.out.println(git.length());

        for(int i=0; i<git.length(); i++){
            if(arpabetCnt.get(git.charAt(i)) == null && isAlphabet(git.charAt(i))){
                arpabetCnt.put(git.charAt(i),1);

            }else if(arpabetCnt.get(git.charAt(i)) != null){
                arpabetCnt.put(git.charAt(i), arpabetCnt.get(git.charAt(i))+ 1);

            }else{
                continue;
            }
        }
        System.out.println(arpabetCnt);
    }
}

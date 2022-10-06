package java_1006.map;

import java.util.HashMap;

public class CountArpabet {
    public static void main(String[] args) {
        String git = "https://github.com/dongyeon-0822/java-project-exercise";
        git = git.toLowerCase(); //소문자로 변환
        HashMap<Character, Integer> arpabetCnt = new HashMap<>(); //해쉬맵 생성

        System.out.println(git.length());

        for(int i=0; i<git.length(); i++){
            if(arpabetCnt.get(git.charAt(i)) == null && (int)git.charAt(i) >= 65 &&  (int)git.charAt(i) <= 122){
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

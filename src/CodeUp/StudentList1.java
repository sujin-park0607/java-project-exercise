package CodeUp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StudentList1 {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=0; i < num; i++){
            String[] studentArr = sc.next().split(" ");
            if(studentArr[0] == "I"){
                students.add(studentArr[1]+" "+studentArr[2]);
            }
        }

        String[] numArr = sc.nextLine().split(" ");
        for(int i=0; i < students.size(); i++){
            if(i == Integer.parseInt(numArr[i])){
                System.out.println(students.get(i));
            }
        }
    }
}

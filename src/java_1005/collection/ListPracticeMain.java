package java_1005.collection;

import java.util.List;

public class ListPracticeMain {
    public static void main(String[] args) {
        LikeLion2th likeLion2th = new LikeLion2th();
//        List<String> students = likeLion2th.getStudentList();
        List<Student> students = likeLion2th.getStudentObjsList();
        for (Student student: students) {
            System.out.println(student);
        }
        System.out.println(students.size());
    }
}

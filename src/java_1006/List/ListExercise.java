package java_1006.List;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    private List<String> students;

    public ListExercise(){
        this.students = new ArrayList<>();
        this.students.add("박수진");
        this.students.add("박수진");
        this.students.add("박수진");
    }

    public List<String> getStudents(){
        return this.students;
    }
}

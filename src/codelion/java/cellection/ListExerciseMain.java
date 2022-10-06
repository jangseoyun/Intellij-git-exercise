package codelion.java.cellection;

import java.util.List;

public class ListExerciseMain {
    public static void main(String[] args) {
        ListExercise listExercise = new ListExercise();

        List<String> students = listExercise.getStudents();
        for (String student : listExercise.getStudents()) {
            System.out.println(student);
        }

        System.out.println(students.size());
    }
}

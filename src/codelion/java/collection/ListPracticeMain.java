package codelion.java.collection;

import java.util.List;

public class ListPracticeMain {
    public static void main(String[] args) {
        LikeLion2th likeLion2th = new LikeLion2th();
        List<String> students = likeLion2th.getStudentList();
        List<Student> studentObjs = likeLion2th.getStudentObjs();

        for (String student : students) {
            System.out.println(student);
        }
        System.out.println(students.size());

        for (Student studentObj : studentObjs) {
            System.out.println(studentObj);
        }
        System.out.println(studentObjs.size());

    }
}

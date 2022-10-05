package codelion.java.collection;

import java.util.List;

public class LikeLion2th {

    private List<String> students;

    public LikeLion2th() {
        this.students = new Names().getStudents();
    }

    //  멋사자 2기 학생의 이름이 들어있는 리스트를 return 하는 method
    public List<String> getStudentList() {
        return students;
    }


}

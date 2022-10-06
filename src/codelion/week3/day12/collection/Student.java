package codelion.week3.day12.collection;

public class Student {
    private int classNo;
    private String name;
    private String gitRepositoryAddress;

    public Student(int classNo, String name, String gitRepositoryAddress) {
        this.classNo = classNo;
        this.name = name;
        this.gitRepositoryAddress = gitRepositoryAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "classNo=" + classNo +
                ", name='" + name + '\'' +
                ", gitRepositoryAddress='" + gitRepositoryAddress + '\'' +
                '}';
    }

}

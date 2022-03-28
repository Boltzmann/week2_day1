package model;

import java.util.Arrays;

public class StudentDB {
    Student[] studentArray;

    public StudentDB(Student[] studentArray) {
        this.studentArray = studentArray;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "studentArray=" + Arrays.toString(studentArray) +
                '}';
    }

    public Student[] getAllStudents() {
        return this.studentArray;
    }
}

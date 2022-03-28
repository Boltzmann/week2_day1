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

    public Student randomStudent() {
        int maxIndex = this.studentArray.length;
        return this.studentArray[(int)(Math.random()*maxIndex)];
    }

    public Student[] add(Student toDB) {
        Student[] newStudentArray = new Student[this.studentArray.length + 1];
        for (int st = 0; st < this.studentArray.length; st++)
            newStudentArray[st] = studentArray[st];
        newStudentArray[this.studentArray.length] = toDB;
        return newStudentArray;
    }

    public Student[] remove(Student peter) {
        Student[] newStudentArray = new Student[this.studentArray.length - 1];
        int counter = 0;
        for (Student student : this.studentArray) {
            if (!student.equals(peter)) {
                newStudentArray[counter] = student;
                counter++;
            }
        }
        return newStudentArray;
    }
}

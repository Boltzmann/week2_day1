package model;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentDB {
    ArrayList<Student> studentArray;

    public StudentDB(ArrayList<Student> studentArray) {
        this.studentArray = studentArray;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "studentArray=" + studentArray.toString() +
                '}';
    }

    public ArrayList<Student> getAllStudents() {
        return this.studentArray;
    }

    public Student randomStudent() {
        int maxIndex = this.studentArray.size();
        return this.studentArray.get((int)(Math.random()*maxIndex));
    }

    public ArrayList<Student> add(Student toDB) {
        this.studentArray.add(toDB);
        return this.studentArray;
    }

    public Student[] remove(Student peter) {
        Student[] newStudentArray = new Student[this.studentArray.size() - 1];
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

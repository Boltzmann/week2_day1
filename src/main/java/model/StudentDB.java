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


    public ArrayList<Student> remove(Student student) {
        this.studentArray.remove(student);
        return studentArray;
    }

    public ArrayList<Student> removeWithID(int id) {
        for (Student student : this.studentArray) {
            if(student.getId() == id) {
                return this.remove(student);
            }
        }
        return this.studentArray;
    }
}

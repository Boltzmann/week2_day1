package model;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentDB {
    HashMap<Integer, Student> studentHashMap = new HashMap<>();

    public StudentDB(ArrayList<Student> studentArray) {
        for(Student student : studentArray) {
            this.studentHashMap.put(student.getId(), student);
        }
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "studentArray=" + studentHashMap.toString() +
                '}';
    }

    public HashMap<Integer, Student> getAllStudents() {
        return this.studentHashMap;
    }

    public Student randomStudent() {
        int maxIndex = this.studentHashMap.size();
        return this.studentHashMap.get((int)(Math.random()*maxIndex));
    }

    public HashMap<Integer, Student> add(Student toDB) {
        this.studentHashMap.put(toDB.getId(), toDB);
        return this.studentHashMap;
    }

    public HashMap<Integer, Student> remove(Student toRemove) {
        this.studentHashMap.remove(toRemove.getId(), toRemove);
        return this.studentHashMap;
    }
}

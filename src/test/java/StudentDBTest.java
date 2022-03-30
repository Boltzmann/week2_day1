import model.Student;
import model.StudentDB;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class StudentDBTest {
    Student peter = new Student(28, 1, "Vorname Nachname");
    Student paul = new Student(70, 2, "Asterix der Gallier");
    ArrayList<Student> studentArray = new ArrayList<>(Arrays.asList(peter,paul));
    StudentDB studentDB = new StudentDB(studentArray);

    @Test
    void constructStudentHashMap() {
        Assertions.assertNotNull(studentDB);
    }

    @Test
    void getAllStudents() {
        HashMap<Integer, Student> expectedHashMap = new HashMap<>();
        expectedHashMap.put(1, new Student(28, 1, "Vorname Nachname"));
        expectedHashMap.put(2, new Student(70, 2, "Asterix der Gallier"));
        Assertions.assertEquals(expectedHashMap, studentDB.getAllStudents());
    }

    @Test
    void toStringTest() {
        Assertions.assertTrue(studentDB.toString().contains("Asterix der Gallier"));
        Assertions.assertTrue(studentDB.toString().contains("Vorname Nachname"));
        Assertions.assertTrue(studentDB.toString().contains("70"));
    }

    @Test
    void addTest(){
        Student soenke = new Student(23, 42, "Sönke");
        HashMap<Integer, Student> expect = new HashMap<>();
        expect.put(peter.getId(), peter);
        expect.put(paul.getId(), paul);
        expect.put(soenke.getId(), soenke);
        Assertions.assertEquals(expect, studentDB.add(soenke));
    }

    @Test
    void removeFirstStudent() {
        HashMap<Integer, Student> expect = new HashMap<>();
        expect.put(paul.getId(), paul);
        Assertions.assertEquals(expect, studentDB.remove(peter));
    }

    @Test
    void removeLastStudent() {
        HashMap<Integer, Student> expect = new HashMap<>();
        expect.put(peter.getId(), peter);
        Assertions.assertEquals(expect, studentDB.remove(paul));
    }

}

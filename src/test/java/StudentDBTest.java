import model.Student;
import model.StudentDB;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentDBTest {
    Student peter = new Student(28, 1, "Vorname Nachname");
    Student paul = new Student(70, 2, "Asterix der Gallier");
    ArrayList<Student> studentArray = new ArrayList<Student>(Arrays.asList(peter,paul));
    StudentDB studentDB = new StudentDB(studentArray);

    @Test
    void constructStudentArray() {
        Assertions.assertNotNull(studentDB);
    }

    @Test
    void getAllStudents() {
        Assertions.assertEquals(studentArray, studentDB.getAllStudents());
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
        ArrayList<Student> expect = new ArrayList<Student>();
        expect.add(peter);
        expect.add(paul);
        expect.add(soenke);
        Assertions.assertEquals(expect, studentDB.add(soenke));
    }

    @Test
    void removeFirstStudent() {
        Student[] expect = {paul};
        Assertions.assertArrayEquals(expect, studentDB.remove(peter));
    }

    @Test
    void removeLastStudent() {
        Student[] expect = {peter};
        Assertions.assertArrayEquals(expect, studentDB.remove(paul));
    }
}

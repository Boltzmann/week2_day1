import model.Student;
import model.StudentDB;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentDBTest {
    Student peter;
    Student paul;
    ArrayList<Student> studentArray;
    StudentDB studentDB;

    @BeforeEach
    void setStudentsAndStudentDBAndStudentArray() {
        peter = new Student(28, 1, "Vorname Nachname");
        paul = new Student(70, 2, "Asterix der Gallier");
        studentArray = new ArrayList<>(Arrays.asList(peter,paul));
        studentDB = new StudentDB(studentArray);
    }

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
        ArrayList<Student> expect = new ArrayList<>();
        expect.add(peter);
        expect.add(paul);
        expect.add(soenke);
        Assertions.assertEquals(expect, studentDB.add(soenke));
    }

    @Test
    void removeFirstStudent() {
        ArrayList<Student> expect = new ArrayList<>(Arrays.asList(paul));
        Assertions.assertEquals(expect, studentDB.remove(peter));
    }

    @Test
    void removeLastStudent() {
        ArrayList<Student> expect = new ArrayList<>(Arrays.asList(peter));
        Assertions.assertEquals(expect, studentDB.remove(paul));
    }

    @Test
    void removeWithID(){
        ArrayList<Student> expect = new ArrayList<>(Arrays.asList(paul));

        Assertions.assertEquals(expect, studentDB.removeWithID(1));
    }
}

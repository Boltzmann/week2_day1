import model.NoKeyPresentException;
import model.Student;
import model.StudentDB;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

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
        Map<Integer, Student> expectedMap = Map.of(
                1, new Student(28, 1, "Vorname Nachname"),
                2, new Student(70, 2, "Asterix der Gallier")
        );
        Assertions.assertEquals(expectedMap, studentDB.getAllStudents());
    }

    @Test
    void toStringTest() {
        Assertions.assertTrue(studentDB.toString().contains("Asterix der Gallier"));
        Assertions.assertTrue(studentDB.toString().contains("Vorname Nachname"));
        Assertions.assertTrue(studentDB.toString().contains("70"));
    }

    @Test
    void addTest(){
        // given
        Student soenke = new Student(23, 42, "Sönke");
        Map<Integer, Student> expect = Map.of(
                peter.getId(), peter,
                paul.getId(), paul,
                soenke.getId(), soenke
        );
        // when
        HashMap<Integer, Student> when = studentDB.add(soenke);
        // then
        Assertions.assertEquals(expect, when);
    }

    @Test
    void removeFirstStudent() {
        HashMap<Integer, Student> expect = new HashMap<>();
        expect.put(paul.getId(), paul);
        Assertions.assertEquals(expect, studentDB.remove(peter));
    }

    @Test
    void removeLastStudent() {
        Map<Integer, Student> expect = Map.of(
                peter.getId(), peter
        );
        Assertions.assertEquals(expect, studentDB.remove(paul));
    }

    @Test
    void randomStudentNotNullTest() {
        Assertions.assertNotNull(studentDB.randomStudent());
    }

    @Test
    void findByIdTest() {
        try {
            Assertions.assertEquals(peter, studentDB.findById(1));
        } catch (Exception e){
            Assertions.fail();
        }
    }

    @Test
    void exceptionIsThrownWhenFindByIdGetsIdNotKnownToStudentDB() {
        Assertions.assertThrows(NoKeyPresentException.class, () -> studentDB.findById(4711));
    }

    @Test
    void exceptionMessageTest() {
        try{
            studentDB.findById(4711);
            Assertions.fail();
        } catch (NoKeyPresentException e) {
            String expected = "This exception would usually not be thrown. Do this now, however.";
            Assertions.assertEquals(expected, e.getMessage());
        }
    }
}

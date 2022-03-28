import model.Student;
import model.StudentDB;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentDBTest {
    Student peter = new Student(28, 1, "Vorname Nachname");
    Student paul = new Student(70, 2, "Asterix der Gallier");
    Student[] studentArray = {peter, paul};
    StudentDB studentDB = new StudentDB(studentArray);

    @Test
    void constructStudentArray() {
        Assertions.assertNotNull(studentDB);
    }

    @Test
    void getAllStudents() {
        Assertions.assertArrayEquals(studentArray, studentDB.getAllStudents());
    }

    @Test
    void toStringTest() {
        System.out.println(studentDB.toString());
        Assertions.assertTrue(studentDB.toString().contains("Asterix der Gallier"));
        Assertions.assertTrue(studentDB.toString().contains("Vorname Nachname"));
        Assertions.assertTrue(studentDB.toString().contains("70"));
    }

}

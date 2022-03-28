import model.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {
    @Test
    public void ageTest() {
        Student martin = new Student();
        Assertions.assertEquals(19,martin.getAge());

    }
    @Test
    public void ageSetTest() {

        Student martin = new Student();
        martin.setAge(38);
        Assertions.assertEquals(38,martin.getAge());
    }
    @Test
    public void studentToString(){
        Student martin = new Student();
        martin.setAge(38);
        Assertions.assertTrue(martin.toString().contains("38"));
    }

    @Test
    void equalsTest() {
        Student peter = new Student(33, 2232, "Peter");
        Student klaus = new Student(33, 2232, "Peter");

        Assertions.assertNotSame(klaus, peter);
        Assertions.assertEquals(klaus, peter);
    }

    @Test
    void constructorWithThreeArgs(){
        Student peter = new Student(48, 2203281, "Peter Muster");
        Assertions.assertEquals("Peter Muster", peter.getName());
        Assertions.assertEquals(48, peter.getAge());
        Assertions.assertEquals(2203281, peter.getId());
    }

}


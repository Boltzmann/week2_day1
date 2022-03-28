import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloTest {
    @Test
    public void helloSimpleTest() {
        Assertions.assertEquals("hello", Student.helloTest());
    }

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



}


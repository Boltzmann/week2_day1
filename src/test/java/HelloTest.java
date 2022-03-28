import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloTest {
    @Test
    public void helloSimpleTest() {
        Assertions.assertEquals("hello", Student.helloTest());
    }
}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TryCatchTest {
    @Test
    void tryCatchTest() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        String message = "This exception was expected: The for loop tries " +
                " to get an element of the array that does not exist.";
        try {
            for(int i=0; i <= list.size(); i++){
                // This line is to trigger exception. No need to
                // get the result of the get method.
                //noinspection ResultOfMethodCallIgnored
                list.get(i);
            }
        } catch (IndexOutOfBoundsException iobe) {

            System.out.println(message);
            System.out.println(iobe);
        }


        // Here I want to show differences between lambda expression in Assertion and
        // what Intellij recommends.
        //noinspection ...
        Assertions.assertThrows(IndexOutOfBoundsException.class,() -> TryCatch.indexOutOfBounds());
        Assertions.assertThrows(IndexOutOfBoundsException.class, TryCatch::indexOutOfBounds);
    }
}

import java.util.ArrayList;
import java.util.Arrays;

public class TryCatch {

    public static void indexOutOfBounds() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));

            for(int i=0; i <= list.size(); i++){
                //noinspection ResultOfMethodCallIgnored
                list.get(i);
            }

    }
}

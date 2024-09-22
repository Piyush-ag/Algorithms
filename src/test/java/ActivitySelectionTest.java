
import static org.junit.Assert.assertEquals;
import org.example.ActivitySelection;
import org.junit.jupiter.api.Test;
import java.util.*;

public class ActivitySelectionTest {

    @Test
    public void testActivitySelection() {
        ActivitySelection solution = new ActivitySelection();

        // Test case 1
        int[] start1 = {1, 3, 2};
        int[] finish1 = {2, 4, 3};
        List<Integer> expected1 = Arrays.asList(0, 1, 2);
        assertEquals(expected1, solution.activitySelection(start1, finish1));

        // Test case 2
        int[] start2 = {10, 12, 20};
        int[] finish2 = {20, 25, 30};
        List<Integer> expected2 = Arrays.asList(0, 2);
        assertEquals(expected2, solution.activitySelection(start2, finish2));
    }
}

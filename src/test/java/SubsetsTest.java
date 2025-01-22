
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.practise.Subsets;
import org.junit.jupiter.api.Test;
import java.util.*;

public class SubsetsTest {

    @Test
    public void testSubsets() {
        Subsets solution = new Subsets();

        // Test case 1
        List<List<Integer>> expected1 = Arrays.asList(
            Arrays.asList(),
            Arrays.asList(1),
            Arrays.asList(2),
            Arrays.asList(1, 2),
            Arrays.asList(3),
            Arrays.asList(1, 3),
            Arrays.asList(2, 3),
            Arrays.asList(1, 2, 3)
        );
        List<List<Integer>> result1 = solution.subsets(new int[]{1, 2, 3});
        assertTrue(result1.containsAll(expected1) && expected1.containsAll(result1));
    }
}

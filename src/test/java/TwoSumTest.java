
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.example.TwoSum;
import org.junit.jupiter.api.Test;

public class TwoSumTest {

    @Test
    public void testTwoSum() {
        TwoSum solution = new TwoSum();
        // Test cases
        assertArrayEquals(new int[]{0, 1}, solution.twoSum(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{1, 2}, solution.twoSum(new int[]{3, 2, 4}, 6));
        assertArrayEquals(new int[]{0, 1}, solution.twoSum(new int[]{3, 3}, 6));
        assertArrayEquals(new int[]{0, 1}, solution.twoSum(new int[]{1, 5, 2, 4}, 6));
        assertArrayEquals(new int[]{0, 2}, solution.twoSum(new int[]{1, 4, 5, 2}, 6));
    }
}

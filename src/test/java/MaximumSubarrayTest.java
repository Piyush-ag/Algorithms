
import static org.junit.Assert.assertEquals;
import org.example.MaximumSubarray;
import org.junit.jupiter.api.Test;

public class MaximumSubarrayTest {

    @Test
    public void testMaxSubArray() {
        MaximumSubarray solution = new MaximumSubarray();
        // Test cases
        assertEquals(6, solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        assertEquals(1, solution.maxSubArray(new int[]{1}));
        assertEquals(23, solution.maxSubArray(new int[]{5, 4, -1, 7, 8}));
        assertEquals(15, solution.maxSubArray(new int[]{1, 2, 3, 4, 5}));
        assertEquals(10, solution.maxSubArray(new int[]{-1, -2, 10, -4, 2}));
    }
}

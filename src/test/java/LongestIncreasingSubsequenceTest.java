
import static org.junit.Assert.assertEquals;
import org.practise.LongestIncreasingSubsequence;
import org.junit.jupiter.api.Test;

public class LongestIncreasingSubsequenceTest {

    @Test
    public void testLengthOfLIS() {
        LongestIncreasingSubsequence solution = new LongestIncreasingSubsequence();

        // Test cases
        assertEquals(4, solution.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
        assertEquals(1, solution.lengthOfLIS(new int[]{7, 7, 7, 7}));
        assertEquals(4, solution.lengthOfLIS(new int[]{1, 3, 5, 4, 7}));
        assertEquals(0, solution.lengthOfLIS(new int[]{}));
    }
}

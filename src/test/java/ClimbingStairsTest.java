
import static org.junit.Assert.assertEquals;
import org.practise.ClimbingStairs;
import org.junit.jupiter.api.Test;

public class ClimbingStairsTest {

    @Test
    public void testClimbStairs() {
            ClimbingStairs solution = new ClimbingStairs();

        // Test cases
        assertEquals(2, solution.climbStairs(2));
        assertEquals(3, solution.climbStairs(3));
        assertEquals(5, solution.climbStairs(4));
        assertEquals(8, solution.climbStairs(5));
    }
}

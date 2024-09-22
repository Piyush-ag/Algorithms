
import static org.junit.Assert.assertEquals;
import org.example.TrappingRainWater;
import org.junit.jupiter.api.Test;

public class TrappingRainWaterTest {

    @Test
    public void testTrap() {
        TrappingRainWater solution = new TrappingRainWater();
        // Test cases
        assertEquals(6, solution.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
        assertEquals(9, solution.trap(new int[]{4, 2, 0, 3, 2, 5}));
        assertEquals(0, solution.trap(new int[]{1, 2, 3, 4, 5}));
        assertEquals(1, solution.trap(new int[]{5, 4, 1, 2}));
        assertEquals(10, solution.trap(new int[]{5, 0, 5, 0, 5}));
    }
}

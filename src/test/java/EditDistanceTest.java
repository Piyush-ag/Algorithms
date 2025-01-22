
import static org.junit.Assert.assertEquals;
import org.practise.EditDistance;
import org.junit.jupiter.api.Test;

public class EditDistanceTest {

    @Test
    public void testMinDistance() {
        EditDistance solution = new EditDistance();

        // Test cases
        assertEquals(3, solution.minDistance("horse", "ros"));
        assertEquals(5, solution.minDistance("intention", "execution"));
        assertEquals(0, solution.minDistance("", ""));
        assertEquals(1, solution.minDistance("a", ""));
        assertEquals(1, solution.minDistance("abc", "abcd"));
    }
}

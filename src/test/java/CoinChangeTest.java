
import static org.junit.Assert.assertEquals;
import org.practise.CoinChange;
import org.junit.jupiter.api.Test;

public class CoinChangeTest {

    @Test
    public void testCoinChange() {
        CoinChange solution = new CoinChange();

        // Test cases
        assertEquals(3, solution.coinChange(new int[]{1, 2, 5}, 11));
        assertEquals(-1, solution.coinChange(new int[]{2}, 3));
        assertEquals(0, solution.coinChange(new int[]{1}, 0));
        assertEquals(1, solution.coinChange(new int[]{1}, 1));
        assertEquals(2, solution.coinChange(new int[]{1}, 2));
    }
}


import static org.junit.Assert.assertEquals;
import org.practise.NQueens;
import org.junit.jupiter.api.Test;
import java.util.*;

public class NQueensTest {

    @Test
    public void testSolveNQueens() {
        NQueens solution = new NQueens();

        // Test cases
        List<List<String>> expected1 = Arrays.asList(
            Arrays.asList(".Q..", "...Q", "Q...", "..Q."),
            Arrays.asList("..Q.", "Q...", "...Q", ".Q..")
        );
        assertEquals(expected1, solution.solveNQueens(4));

        List<List<String>> expected2 = Arrays.asList(Arrays.asList("Q"));
        assertEquals(expected2, solution.solveNQueens(1));
    }
}

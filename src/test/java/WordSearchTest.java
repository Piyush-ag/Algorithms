
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.example.WordSearch;
import org.junit.jupiter.api.Test;

public class WordSearchTest {

    @Test
    public void testExist() {
        WordSearch solution = new WordSearch();

        // Test case 1
        char[][] board1 = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };
        assertTrue(solution.exist(board1, "ABCCED"));
        assertTrue(solution.exist(board1, "SEE"));
        assertFalse(solution.exist(board1, "ABCEE"));
    }
}

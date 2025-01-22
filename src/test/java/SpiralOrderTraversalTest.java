
import static org.junit.Assert.assertEquals;
import org.practise.SpiralOrderTraversal;
import org.junit.jupiter.api.Test;
import java.util.*;

public class SpiralOrderTraversalTest {

    @Test
    public void testSpiralOrder() {
        SpiralOrderTraversal solution = new SpiralOrderTraversal();

        // Test case 1
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> expected1 = Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5);
        assertEquals(expected1, solution.spiralOrder(matrix1));

        // Test case 2
        int[][] matrix2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        List<Integer> expected2 = Arrays.asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7);
        assertEquals(expected2, solution.spiralOrder(matrix2));
    }
}

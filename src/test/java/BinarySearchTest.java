
import static org.junit.Assert.assertEquals;
import org.example.BinarySearch;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {

    @Test
    public void testBinarySearch() {
        BinarySearch solution = new BinarySearch();

        // Test case 1
        int[] arr1 = {2, 3, 4, 10, 40};
        assertEquals(3, solution.binarySearch(arr1, 10));

        // Test case 2
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        assertEquals(-1, solution.binarySearch(arr2, 8));
    }
}

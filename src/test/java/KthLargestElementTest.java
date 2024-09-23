
import static org.junit.Assert.assertEquals;
import org.example.KthLargestElement;
import org.junit.jupiter.api.Test;

public class KthLargestElementTest {

    @Test
    public void testFindKthLargest() {
        KthLargestElement solution = new KthLargestElement();

        // Test case 1
        int[] nums1 = {3, 2, 1, 5, 6, 4};
        assertEquals(5, solution.findKthLargest(nums1, 2));

        // Test case 2
        int[] nums2 = {7, 6, 5, 4, 3, 2, 1};
        assertEquals(4, solution.findKthLargest(nums2, 4));
    }
}

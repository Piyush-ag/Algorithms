
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.example.ProductExceptSelf;
import org.junit.jupiter.api.Test;

public class ProductExceptSelfTest {

    @Test
    public void testProductExceptSelf() {
        ProductExceptSelf solution = new ProductExceptSelf();
        // Test cases
        assertArrayEquals(new int[]{24, 12, 8, 6}, solution.productExceptSelf(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{0, 0, 9, 0, 0}, solution.productExceptSelf(new int[]{-1, 1, 0, -3, 3}));
        assertArrayEquals(new int[]{120, 60, 40, 30, 24}, solution.productExceptSelf(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{0, 0}, solution.productExceptSelf(new int[]{0, 0}));
        assertArrayEquals(new int[]{1}, solution.productExceptSelf(new int[]{5}));
    }
}

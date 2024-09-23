
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.example.MergeSort;
import org.junit.jupiter.api.Test;

public class MergeSortTest {

    @Test
    public void testMergeSort() {
        MergeSort solution = new MergeSort();

        // Test case 1
        int[] arr1 = {12, 11, 13, 5, 6, 7};
        int[] expected1 = {5, 6, 7, 11, 12, 13};
        solution.mergeSort(arr1, 0, arr1.length - 1);
        assertArrayEquals(expected1, arr1);

        // Test case 2
        int[] arr2 = {3, 2, 1, 5, 4};
        int[] expected2 = {1, 2, 3, 4, 5};
        solution.mergeSort(arr2, 0, arr2.length - 1);
        assertArrayEquals(expected2, arr2);
    }
}

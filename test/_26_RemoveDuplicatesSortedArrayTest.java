import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class _26_RemoveDuplicatesSortedArrayTest {

    @Test
    void keepsUniqueValuesAtTheFrontAndReturnsTheirCount() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int k = _26_RemoveDuplicatesSortedArray.removeDuplicates(nums);

        assertEquals(5, k);
        assertArrayEquals(new int[] {0, 1, 2, 3, 4}, Arrays.copyOf(nums, k));
    }

    @Test
    void handlesArrayWithoutDuplicates() {
        int[] nums = {1, 2, 3};

        int k = _26_RemoveDuplicatesSortedArray.removeDuplicates(nums);

        assertEquals(3, k);
        assertArrayEquals(new int[] {1, 2, 3}, Arrays.copyOf(nums, k));
    }

    @Test
    void handlesArrayOfIdenticalValues() {
        int[] nums = {7, 7, 7, 7};

        assertEquals(1, _26_RemoveDuplicatesSortedArray.removeDuplicates(nums));
        assertEquals(7, nums[0]);
    }

    @Test
    void handlesSingleElementAndEmptyArray() {
        assertEquals(1, _26_RemoveDuplicatesSortedArray.removeDuplicates(new int[] {9}));
        assertEquals(0, _26_RemoveDuplicatesSortedArray.removeDuplicates(new int[] {}));
    }
}

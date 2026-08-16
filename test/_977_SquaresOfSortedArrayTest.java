import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class _977_SquaresOfSortedArrayTest {

    @Test
    void returnsSortedSquaresForMixedSignInput() {
        assertArrayEquals(new int[] {0, 1, 9, 16, 100},
                _977_SquaresOfSortedArray.sortedSquares(new int[] {-4, -1, 0, 3, 10}));
        assertArrayEquals(new int[] {4, 9, 9, 49, 121},
                _977_SquaresOfSortedArray.sortedSquares(new int[] {-7, -3, 2, 3, 11}));
    }

    @Test
    void handlesAllNegativeInput() {
        assertArrayEquals(new int[] {1, 4, 9}, _977_SquaresOfSortedArray.sortedSquares(new int[] {-3, -2, -1}));
    }

    @Test
    void handlesAllNonNegativeInput() {
        assertArrayEquals(new int[] {0, 1, 4}, _977_SquaresOfSortedArray.sortedSquares(new int[] {0, 1, 2}));
    }

    @Test
    void handlesSingleElementAndEmptyArray() {
        assertArrayEquals(new int[] {25}, _977_SquaresOfSortedArray.sortedSquares(new int[] {-5}));
        assertArrayEquals(new int[] {}, _977_SquaresOfSortedArray.sortedSquares(new int[] {}));
    }

    @Test
    void doesNotModifyInputArray() {
        int[] nums = {-4, -1, 0, 3, 10};

        _977_SquaresOfSortedArray.sortedSquares(nums);

        assertArrayEquals(new int[] {-4, -1, 0, 3, 10}, nums);
    }
}

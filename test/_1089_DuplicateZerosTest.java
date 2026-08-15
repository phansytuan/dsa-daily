import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class _1089_DuplicateZerosTest {

    @Test
    void duplicatesEachZeroAndShiftsRemainingElementsRight() {
        int[] arr = {1, 0, 2, 3};

        _1089_DuplicateZeros.duplicateZeros(arr);

        assertArrayEquals(new int[] {1, 0, 0, 2}, arr);
    }

    @Test
    void duplicatesMultipleZeroes() {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};

        _1089_DuplicateZeros.duplicateZeros(arr);

        assertArrayEquals(new int[] {1, 0, 0, 2, 3, 0, 0, 4}, arr);
    }

    @Test
    void ignoresZeroAtLastIndexBecauseThereIsNoRoomLeft() {
        int[] arr = {1, 2, 0};

        _1089_DuplicateZeros.duplicateZeros(arr);

        assertArrayEquals(new int[] {1, 2, 0}, arr);
    }

    @Test
    void leavesArrayWithoutZeroesUnchanged() {
        int[] arr = {1, 2, 3};

        _1089_DuplicateZeros.duplicateZeros(arr);

        assertArrayEquals(new int[] {1, 2, 3}, arr);
    }

    @Test
    void handlesEmptyArray() {
        int[] arr = {};

        _1089_DuplicateZeros.duplicateZeros(arr);

        assertArrayEquals(new int[] {}, arr);
    }
}

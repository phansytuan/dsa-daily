import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Cùng một bộ test cho 2 cách giải của bài 88: chèn vào mảng đã sắp xếp (v1) và 2 con trỏ (v2).
 */
class _88_MergeSortedArrayTest {

    private interface Merge {
        void apply(int[] nums1, int m, int[] nums2, int n);
    }

    static Stream<Arguments> solutions() {
        return Stream.of(
                Arguments.of("_88_MergeSortedArray", (Merge) _88_MergeSortedArray::merge),
                Arguments.of("_88_MergeSortedArray2", (Merge) _88_MergeSortedArray2::merge));
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("solutions")
    void mergesInterleavedArrays(String name, Merge impl) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};

        impl.apply(nums1, 3, new int[] {2, 5, 6}, 3);

        assertArrayEquals(new int[] {1, 2, 2, 3, 5, 6}, nums1);
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("solutions")
    void mergesWhenSecondArrayIsEntirelySmaller(String name, Merge impl) {
        int[] nums1 = {7, 8, 9, 0, 0, 0};

        impl.apply(nums1, 3, new int[] {4, 5, 6}, 3);

        assertArrayEquals(new int[] {4, 5, 6, 7, 8, 9}, nums1);
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("solutions")
    void keepsDuplicatesFromBothArrays(String name, Merge impl) {
        int[] nums1 = {1, 1, 0, 0};

        impl.apply(nums1, 2, new int[] {1, 1}, 2);

        assertArrayEquals(new int[] {1, 1, 1, 1}, nums1);
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("solutions")
    void copiesSecondArrayWhenFirstIsEmpty(String name, Merge impl) {
        int[] nums1 = {0};

        impl.apply(nums1, 0, new int[] {1}, 1);

        assertArrayEquals(new int[] {1}, nums1);
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("solutions")
    void leavesFirstArrayUntouchedWhenSecondIsEmpty(String name, Merge impl) {
        int[] nums1 = {1, 2, 3};

        impl.apply(nums1, 3, new int[] {}, 0);

        assertArrayEquals(new int[] {1, 2, 3}, nums1);
    }
}

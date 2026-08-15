import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Cùng một bộ test cho 2 cách giải của bài 941: duyệt với cờ tăng/giảm (v1) và 2 pha leo/xuống núi (v2).
 */
class _941_Valid_Mountain_ArrayTest {

    private interface ValidMountain {
        boolean apply(int[] arr);
    }

    static Stream<Arguments> solutions() {
        return Stream.of(
                Arguments.of("_941_Valid_Mountain_Array", (ValidMountain) _941_Valid_Mountain_Array::validMountainArray),
                Arguments.of("_941_Valid_Mountain_Array2", (ValidMountain) _941_Valid_Mountain_Array2::validMountainArray));
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("solutions")
    void acceptsArrayThatStrictlyIncreasesThenDecreases(String name, ValidMountain impl) {
        assertTrue(impl.apply(new int[] {0, 3, 2, 1}));
        assertTrue(impl.apply(new int[] {0, 2, 3, 4, 5, 2, 1, 0}));
        assertTrue(impl.apply(new int[] {1, 2, 1}));
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("solutions")
    void rejectsArrayWithoutDescendingPhase(String name, ValidMountain impl) {
        assertFalse(impl.apply(new int[] {1, 2, 3}));
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("solutions")
    void rejectsArrayWithoutAscendingPhase(String name, ValidMountain impl) {
        assertFalse(impl.apply(new int[] {3, 2, 1}));
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("solutions")
    void rejectsPlateauAndRepeatedValues(String name, ValidMountain impl) {
        assertFalse(impl.apply(new int[] {0, 2, 2, 1}));
        assertFalse(impl.apply(new int[] {2, 2, 2}));
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("solutions")
    void rejectsSecondPeak(String name, ValidMountain impl) {
        assertFalse(impl.apply(new int[] {1, 3, 2, 4, 1}));
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("solutions")
    void rejectsArraysShorterThanThree(String name, ValidMountain impl) {
        assertFalse(impl.apply(new int[] {}));
        assertFalse(impl.apply(new int[] {1}));
        assertFalse(impl.apply(new int[] {1, 2}));
    }
}

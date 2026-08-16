import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Cùng một bộ test cho 2 cách giải của bài 27: dịch phần tử (v1) và 2 con trỏ (v2).
 */
class _27_RemoveElementTest {

    private interface RemoveElement {
        int apply(int[] nums, int val);
    }

    static Stream<Arguments> solutions() {
        return Stream.of(
                Arguments.of("_27_RemoveElement", (RemoveElement) _27_RemoveElement::removeElement),
                Arguments.of("_27_RemoveElement2", (RemoveElement) _27_RemoveElement2::removeElement));
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("solutions")
    void removesEveryOccurrenceAndKeepsRemainingOrder(String name, RemoveElement impl) {
        int[] nums = {3, 2, 2, 3};

        int k = impl.apply(nums, 3);

        assertEquals(2, k);
        assertArrayEquals(new int[] {2, 2}, Arrays.copyOf(nums, k));
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("solutions")
    void removesConsecutiveAndTrailingOccurrences(String name, RemoveElement impl) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};

        int k = impl.apply(nums, 2);

        assertEquals(5, k);
        assertArrayEquals(new int[] {0, 1, 3, 0, 4}, Arrays.copyOf(nums, k));
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("solutions")
    void returnsZeroWhenAllElementsMatch(String name, RemoveElement impl) {
        assertEquals(0, impl.apply(new int[] {5, 5, 5}, 5));
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("solutions")
    void leavesArrayUntouchedWhenValueIsAbsent(String name, RemoveElement impl) {
        int[] nums = {1, 2, 3};

        assertEquals(3, impl.apply(nums, 9));
        assertArrayEquals(new int[] {1, 2, 3}, nums);
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("solutions")
    void handlesEmptyArray(String name, RemoveElement impl) {
        assertEquals(0, impl.apply(new int[] {}, 1));
    }
}

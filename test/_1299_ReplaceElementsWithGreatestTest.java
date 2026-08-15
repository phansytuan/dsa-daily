import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

class _1299_ReplaceElementsWithGreatestTest {

    @Test
    void replacesEachElementWithGreatestElementOnItsRight() {
        assertArrayEquals(new int[] {18, 6, 6, 6, 1, -1},
                _1299_ReplaceElementsWithGreatest.replaceElements(new int[] {17, 18, 5, 4, 6, 1}));
    }

    @Test
    void handlesIncreasingAndDecreasingInput() {
        assertArrayEquals(new int[] {4, 4, 4, -1},
                _1299_ReplaceElementsWithGreatest.replaceElements(new int[] {1, 2, 3, 4}));
        assertArrayEquals(new int[] {3, 2, 1, -1},
                _1299_ReplaceElementsWithGreatest.replaceElements(new int[] {4, 3, 2, 1}));
    }

    @Test
    void singleElementBecomesMinusOne() {
        assertArrayEquals(new int[] {-1}, _1299_ReplaceElementsWithGreatest.replaceElements(new int[] {400}));
    }

    @Test
    void handlesEmptyArray() {
        assertArrayEquals(new int[] {}, _1299_ReplaceElementsWithGreatest.replaceElements(new int[] {}));
    }

    @Test
    void transformsInPlaceAndReturnsSameArray() {
        int[] arr = {17, 18, 5, 4, 6, 1};

        assertSame(arr, _1299_ReplaceElementsWithGreatest.replaceElements(arr));
    }
}

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class _findMostAppearancesTest {

    @Test
    void sumsOccurrencesOfTheMostFrequentValue() {
        assertArrayEquals(new int[] {9}, _findMostAppearances.findMostAppearances(new int[] {2, 2, 3, 3, 3}));
        assertArrayEquals(new int[] {12}, _findMostAppearances.findMostAppearances(new int[] {2, 4, 4, 4, 5}));
    }

    @Test
    void addsUpEveryValueSharingTheMaxFrequency() {
        // 2 và 3 đều xuất hiện 2 lần: 2*2 + 3*2 = 10
        assertArrayEquals(new int[] {10}, _findMostAppearances.findMostAppearances(new int[] {2, 2, 3, 3}));
    }

    @Test
    void handlesSingleElement() {
        assertArrayEquals(new int[] {100}, _findMostAppearances.findMostAppearances(new int[] {100}));
    }

    @Test
    void rejectsNullOrEmptyInput() {
        assertArrayEquals(new int[] {0}, _findMostAppearances.findMostAppearances(null));
        assertArrayEquals(new int[] {0}, _findMostAppearances.findMostAppearances(new int[] {}));
    }

    @Test
    void rejectsValuesOutsideAllowedRange() {
        assertArrayEquals(new int[] {0}, _findMostAppearances.findMostAppearances(new int[] {1, 2, 3}));
        assertArrayEquals(new int[] {0}, _findMostAppearances.findMostAppearances(new int[] {2, 101}));
        assertArrayEquals(new int[] {0}, _findMostAppearances.findMostAppearances(new int[] {-5}));
    }

    @Test
    void rejectsInputLongerThan1000() {
        int[] tooLong = new int[1001];
        java.util.Arrays.fill(tooLong, 2);
        assertArrayEquals(new int[] {0}, _findMostAppearances.findMostAppearances(tooLong));
    }
}

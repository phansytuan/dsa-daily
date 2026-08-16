import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class _1295_FindNumbersWithEvenDigitsTest {

    @Test
    void countsNumbersWithAnEvenDigitCount() {
        assertEquals(2, _1295_FindNumbersWithEvenDigits.findNumbers(new int[] {12, 345, 2, 6, 7896}));
        assertEquals(2, _1295_FindNumbersWithEvenDigits.findNumbers(new int[] {1, 22, 333, 4444}));
        assertEquals(1, _1295_FindNumbersWithEvenDigits.findNumbers(new int[] {555, 901, 12}));
    }

    @Test
    void returnsZeroWhenEveryNumberHasOddDigitCount() {
        assertEquals(0, _1295_FindNumbersWithEvenDigits.findNumbers(new int[] {1, 2, 333, 12345}));
    }

    @Test
    void handlesEmptyArray() {
        assertEquals(0, _1295_FindNumbersWithEvenDigits.findNumbers(new int[] {}));
    }
}

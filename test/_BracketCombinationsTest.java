import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class _BracketCombinationsTest {

    /** bracketCombinations(n) là số Catalan thứ n. */
    @ParameterizedTest
    @CsvSource({"0,1", "1,1", "2,2", "3,5", "4,14", "5,42", "6,132", "10,16796"})
    void returnsNthCatalanNumber(int n, long expected) {
        assertEquals(expected, _BracketCombinations.bracketCombinations(n));
    }
}

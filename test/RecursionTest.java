import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RecursionTest {

    @ParameterizedTest
    @CsvSource({"1,1", "2,1", "3,2", "4,3", "5,5", "6,8", "9,34", "20,6765"})
    void computesFibonacciNumbers(int n, int expected) {
        assertEquals(expected, Recursion.Fibonacci(n));
    }

    @Test
    void baseCaseCoversNonPositiveInput() {
        assertEquals(1, Recursion.Fibonacci(0));
        assertEquals(1, Recursion.Fibonacci(-5));
    }
}

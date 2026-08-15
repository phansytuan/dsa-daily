import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void addsTwoInts() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(2, -3));
        assertEquals(0, calculator.add(0, 0));
    }

    @Test
    void addsThreeInts() {
        assertEquals(6, calculator.add(1, 2, 3));
        assertEquals(-6, calculator.add(-1, -2, -3));
    }

    @Test
    void addsDoubles() {
        assertEquals(3.5, calculator.add(1.25, 2.25), 1e-9);
        assertEquals(0.0, calculator.add(-1.5, 1.5), 1e-9);
    }

    @Test
    void concatenatesStrings() {
        assertEquals("ab", calculator.add("a", "b"));
        assertEquals("a", calculator.add("a", ""));
        assertEquals("nullb", calculator.add(null, "b"));
    }
}

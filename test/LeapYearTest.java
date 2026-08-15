import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class LeapYearTest {

    @ParameterizedTest
    @ValueSource(ints = {4, 8, 1996, 2016, 2020, 2024})
    void divisibleBy4ButNotBy100IsLeap(int year) {
        assertTrue(LeapYear.isLeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {400, 800, 1600, 2000, 2400})
    void divisibleBy400IsLeap(int year) {
        assertTrue(LeapYear.isLeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {1700, 1800, 1900, 2100})
    void divisibleBy100ButNotBy400IsNotLeap(int year) {
        assertFalse(LeapYear.isLeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 1999, 2021, 2022, 2023})
    void notDivisibleBy4IsNotLeap(int year) {
        assertFalse(LeapYear.isLeapYear(year));
    }

    @Test
    void yearsOutsideSupportedRangeAreRejected() {
        assertFalse(LeapYear.isLeapYear(0));
        assertFalse(LeapYear.isLeapYear(-4));
        assertFalse(LeapYear.isLeapYear(10000));
        assertTrue(LeapYear.isLeapYear(9996));
    }
}

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class _1662_CheckStringArraysEquivalentTest {

    private final _1662_CheckStringArraysEquivalent solution = new _1662_CheckStringArraysEquivalent();

    @Test
    void returnsTrueWhenConcatenationsMatch() {
        assertTrue(solution.arrayStringsAreEqual(new String[] {"ab", "c"}, new String[] {"a", "bc"}));
        assertTrue(solution.arrayStringsAreEqual(new String[] {"abc"}, new String[] {"a", "b", "c"}));
    }

    @Test
    void returnsFalseWhenConcatenationsDiffer() {
        assertFalse(solution.arrayStringsAreEqual(new String[] {"a", "cb"}, new String[] {"ab", "c"}));
        assertFalse(solution.arrayStringsAreEqual(new String[] {"abc"}, new String[] {"abcd"}));
    }

    @Test
    void ignoresEmptyStringsAndEmptyArrays() {
        assertTrue(solution.arrayStringsAreEqual(new String[] {"a", "", "b"}, new String[] {"ab"}));
        assertTrue(solution.arrayStringsAreEqual(new String[] {}, new String[] {""}));
        assertFalse(solution.arrayStringsAreEqual(new String[] {}, new String[] {"a"}));
    }
}

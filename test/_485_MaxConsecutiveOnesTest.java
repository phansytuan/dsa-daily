import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class _485_MaxConsecutiveOnesTest {

    @Test
    void returnsLongestRunOfOnes() {
        assertEquals(3, _485_MaxConsecutiveOnes.findMaxConsecutiveOnes(new int[] {1, 1, 0, 1, 1, 1}));
        assertEquals(4, _485_MaxConsecutiveOnes.findMaxConsecutiveOnes(new int[] {1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1}));
        assertEquals(2, _485_MaxConsecutiveOnes.findMaxConsecutiveOnes(new int[] {1, 0, 1, 1, 0, 1}));
    }

    @Test
    void countsRunThatEndsAtLastIndex() {
        assertEquals(3, _485_MaxConsecutiveOnes.findMaxConsecutiveOnes(new int[] {0, 1, 1, 1}));
    }

    @Test
    void returnsZeroWhenNoOnePresent() {
        assertEquals(0, _485_MaxConsecutiveOnes.findMaxConsecutiveOnes(new int[] {0, 0}));
        assertEquals(0, _485_MaxConsecutiveOnes.findMaxConsecutiveOnes(new int[] {}));
    }
}

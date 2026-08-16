import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class _387_FirstUniqueCharacterTest {

    @Test
    void returnsIndexOfFirstNonRepeatingCharacter() {
        assertEquals(0, _387_FirstUniqueCharacter.firstUniqChar("leetcode"));
        assertEquals(2, _387_FirstUniqueCharacter.firstUniqChar("loveleetcode"));
        assertEquals(10, _387_FirstUniqueCharacter.firstUniqChar("lovveleettcode"));
    }

    @Test
    void returnsMinusOneWhenEveryCharacterRepeats() {
        assertEquals(-1, _387_FirstUniqueCharacter.firstUniqChar("aabb"));
        assertEquals(-1, _387_FirstUniqueCharacter.firstUniqChar("aa"));
    }

    @Test
    void handlesSingleCharacterAndEmptyString() {
        assertEquals(0, _387_FirstUniqueCharacter.firstUniqChar("z"));
        assertEquals(-1, _387_FirstUniqueCharacter.firstUniqChar(""));
    }
}

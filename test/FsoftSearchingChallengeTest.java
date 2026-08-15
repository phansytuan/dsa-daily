import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FsoftSearchingChallengeTest {

    @Test
    void sumsNumbersSeparatedByNonDigits() {
        assertEquals("13", FsoftSearchingChallenge.SearchingChallenge("10 2One Number*1*"));
        assertEquals("91", FsoftSearchingChallenge.SearchingChallenge("88Hello 3World!"));
        assertEquals("10", FsoftSearchingChallenge.SearchingChallenge("5Hello 5"));
    }

    @Test
    void sumsNumberAtEndOfString() {
        assertEquals("84", FsoftSearchingChallenge.SearchingChallenge("75Number9"));
    }

    @Test
    void treatsConsecutiveDigitsAsOneNumber() {
        assertEquals("123", FsoftSearchingChallenge.SearchingChallenge("123"));
        assertEquals("6", FsoftSearchingChallenge.SearchingChallenge("1a2a3"));
    }

    @Test
    void returnsZeroWhenNoDigitPresent() {
        assertEquals("0", FsoftSearchingChallenge.SearchingChallenge(""));
        assertEquals("0", FsoftSearchingChallenge.SearchingChallenge("no digits here!"));
    }
}

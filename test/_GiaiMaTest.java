import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class _GiaiMaTest {

    @Test
    void readsGridByRowAfterFillingItByColumn() {
        // "abcdef" với 2 hàng: cột (a,b) (c,d) (e,f) -> hàng "ace" + "bdf"
        assertEquals("acebdf", _GiaiMa.decodeMessage("abcdef", 2));
        assertEquals("adgbehcfi", _GiaiMa.decodeMessage("abcdefghi", 3));
    }

    @Test
    void skipsPaddingWhenLengthIsNotDivisibleByRowCount() {
        // "abcde" với 2 hàng: cột (a,b) (c,d) (e,' ') -> "ace" + "bd"
        assertEquals("acebd", _GiaiMa.decodeMessage("abcde", 2));
    }

    @Test
    void returnsInputUnchangedForSingleRow() {
        assertEquals("abcdef", _GiaiMa.decodeMessage("abcdef", 1));
    }

    @Test
    void returnsInputUnchangedWhenRowCountEqualsLength() {
        assertEquals("abc", _GiaiMa.decodeMessage("abc", 3));
    }
}

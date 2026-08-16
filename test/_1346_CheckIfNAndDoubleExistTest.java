import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class _1346_CheckIfNAndDoubleExistTest {

    @Test
    void findsPairWhereOneValueIsDoubleTheOther() {
        assertTrue(_1346_CheckIfNAndDoubleExist.checkIfExist(new int[] {10, 2, 5, 3}));
        assertTrue(_1346_CheckIfNAndDoubleExist.checkIfExist(new int[] {10, 2, 6, 3, 6}));
        assertTrue(_1346_CheckIfNAndDoubleExist.checkIfExist(new int[] {7, 1, 14, 11}));
    }

    @Test
    void findsPairWithNegativeValues() {
        assertTrue(_1346_CheckIfNAndDoubleExist.checkIfExist(new int[] {-2, 0, 10, -4}));
    }

    @Test
    void twoZeroesFormAValidPair() {
        assertTrue(_1346_CheckIfNAndDoubleExist.checkIfExist(new int[] {0, 0}));
    }

    @Test
    void returnsFalseWhenNoSuchPairExists() {
        assertFalse(_1346_CheckIfNAndDoubleExist.checkIfExist(new int[] {3, 1, 7, 11}));
        assertFalse(_1346_CheckIfNAndDoubleExist.checkIfExist(new int[] {-2, 0, 10, -19, 4, 6, -8}));
        assertFalse(_1346_CheckIfNAndDoubleExist.checkIfExist(new int[] {0}));
        assertFalse(_1346_CheckIfNAndDoubleExist.checkIfExist(new int[] {}));
    }
}

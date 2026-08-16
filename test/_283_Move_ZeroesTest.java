import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class _283_Move_ZeroesTest {

    @Test
    void acceptsEmptyArray() {
        assertDoesNotThrow(() -> _283_Move_Zeroes.moveZeroes(new int[] {}));
    }

    @Test
    @Disabled("moveZeroes chưa được implement - bỏ @Disabled sau khi viết lời giải")
    void movesZeroesToTheEndKeepingOrderOfNonZeroes() {
        int[] nums = {0, 1, 0, 3, 12};

        _283_Move_Zeroes.moveZeroes(nums);

        org.junit.jupiter.api.Assertions.assertArrayEquals(new int[] {1, 3, 12, 0, 0}, nums);
    }
}

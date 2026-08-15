import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class _1672_RichestCustomerWealthTest {

    @Test
    void returnsMaxRowSum() {
        assertEquals(6, _1672_RichestCustomerWealth.maximumWealth(new int[][] {{1, 2, 3}, {3, 2, 1}}));
        assertEquals(10, _1672_RichestCustomerWealth.maximumWealth(new int[][] {{1, 5}, {7, 3}, {3, 5}}));
        assertEquals(17, _1672_RichestCustomerWealth.maximumWealth(new int[][] {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}}));
    }

    @Test
    void handlesSingleCustomerAndSingleBank() {
        assertEquals(5, _1672_RichestCustomerWealth.maximumWealth(new int[][] {{5}}));
        assertEquals(6, _1672_RichestCustomerWealth.maximumWealth(new int[][] {{1, 2, 3}}));
    }

    @Test
    void returnsZeroWhenEveryAccountIsEmpty() {
        assertEquals(0, _1672_RichestCustomerWealth.maximumWealth(new int[][] {{0, 0}, {0, 0}}));
    }
}

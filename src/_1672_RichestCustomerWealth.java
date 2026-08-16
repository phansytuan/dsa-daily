import util.ArrayUtils;

/**
 * Thao tác với Mảng 2 chiều
 */
public class _1672_RichestCustomerWealth {

    /**
     * Computes the maximum wealth among all customers.
     *
     * @param a 2D array where a[i][j] represents the wealth of customer i in bank j
     * @return maximum total wealth of any customer
     * <p>
     * Algorithm:
     * - Iterate over each customer (row in the 2D array).
     * - Sum all bank accounts for that customer.
     * - Keep track of the maximum sum encountered.
     * 
     */
    public static int maximumWealth(int[][] a) {
        int soKhachHang = a.length;     // number of customers (rows)

        int maxWealth = 0;

        for (int i = 0; i < soKhachHang; i++) {
            // Sum wealth across all banks for this customer (tinhTongHangI)
            int tongCuaKhach = ArrayUtils.sum(a[i]);

            if (tongCuaKhach > maxWealth) {
                maxWealth = tongCuaKhach;
            }
        }

        return maxWealth;
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {3, 2, 1}};
        int[][] b = {{1, 5}, {7, 3}, {3, 5}};

        System.out.println(maximumWealth(b));
        System.out.println(maximumWealth(a));
    }
}

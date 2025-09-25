public class _1672_RichestCustomerWealth {
    public static int maximumWealth(int[][] a) {
        int soKhachHang = a.length; // số hàng i
        int soNganHang = a[0].length; // số cột j

        int maxWealth = 0;

        for (int i = 0; i < soKhachHang; i++) {
            // tính cho từng khách một
            int tinhTongHangI = 0;
            for (int j = 0; j < soNganHang; j++) {
                tinhTongHangI += a[i][j]; // theo dòng ngang
            }

            if (tinhTongHangI > maxWealth) {
                maxWealth = tinhTongHangI;
            }
        }
        return maxWealth;
    }
    public static void main(String[] args) {
        int[][] a = {{1,2,3}, {3, 2, 1}};
        int[][] b = {{1,5}, {7, 3}, {3, 5}};
        System.out.println(maximumWealth(b));;
    }
}

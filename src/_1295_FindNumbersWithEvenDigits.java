public class _1295_FindNumbersWithEvenDigits {
    public static int findNumbers(int[] nums) {
        int bienDem1 = 0;
        for (int num : nums){
//            kiểm tra số chữ số của từng num,  nếu số chữ số là chẵn => tăng biến đếm lên 1
            int soLuongChuSo = tinhSoChuSo(num);
            if (soLuongChuSo % 2 == 0){
                bienDem1++;
            }
        }
        return bienDem1;
    }

    private static int tinhSoChuSo(int num) {
        int bienDem2 = 0;
        int kq =num;
        while (kq !=0){
            kq = num/ 10;
            num = kq;
            bienDem2++;
        }
        return bienDem2;
    }

    public static void main(String[] args) {
        int[] nums = {1,22,333,4444};
        System.out.println(findNumbers(nums));
        System.out.println(tinhSoChuSo(4444));
    }
}

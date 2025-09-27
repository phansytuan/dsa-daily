/** Thao tác Duyệt mảng
 *
 * This class provides methods to determine how many numbers in an array have an even number of digits.
 */
public class _1295_FindNumbersWithEvenDigits {

    /**
     * Count how many numbers in the given array have an even number of digits.
     *
     * @param nums input array of integers
     * @return number of elements that have an even digit count
     *
     * Ex:
     * nums = [12, 345, 2, 6, 7896] => return 2 (12 and 7896 have even digits)
     */
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            // Lấy số chữ số của num, nếu số chữ số là chẵn thì tăng biến đếm ++
            int digitCount = countDigits(num);
            if (digitCount % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * Calculate the number of digits in a given integer.
     *
     * @param num the input integer (assumed non-negative)
     * @return number of digits of num
     *
     * Ex:
     * num = 4444 => return 4
     */
    private static int countDigits(int num) {
        int digitCount = 0;
        int current = num;

        // Lặp cho đến khi current = 0
        // Chia 10 liên tục để loại bỏ chữ số cuối cùng
        while (current != 0) {
            current = current / 10;
            digitCount++;
        }
        return digitCount;
    }

    public static void main(String[] args) {
        int[] nums = {1, 22, 333, 4444};
        System.out.println(findNumbers(nums));       // Expect: 2 (22, 4444)
        System.out.println(countDigits(4444));       // Expect: 4
    }
}

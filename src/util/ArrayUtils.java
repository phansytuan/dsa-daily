package util;

/**
 * Các thao tác dùng chung trên mảng: in mảng, dịch phần tử, đếm tần suất, tính tổng.
 */
public final class ArrayUtils {

    private ArrayUtils() {
    }

    /**
     * In các phần tử của mảng trên một dòng, cách nhau bằng dấu cách.
     */
    public static void printArray(int[] arr) {
        printArray(arr, arr.length);
    }

    /**
     * In {@code length} phần tử đầu tiên của mảng (dùng cho các bài trả về độ dài logic).
     */
    public static void printArray(int[] arr, int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(arr[i]).append(' ');
        }
        System.out.println(sb.toString().trim());
    }

    /**
     * Dịch arr[from..to] sang phải 1 đơn vị, tức arr[to+1] = arr[to], ..., arr[from+1] = arr[from].
     * Giá trị tại arr[from] được giữ nguyên (thường sẽ bị ghi đè bởi phần tử mới được chèn vào).
     *
     * @param from chỉ số đầu (bao gồm) của đoạn cần dịch
     * @param to   chỉ số cuối (bao gồm) của đoạn cần dịch; arr[to+1] phải tồn tại
     */
    public static void shiftRight(int[] arr, int from, int to) {
        for (int i = to; i >= from; i--) {
            arr[i + 1] = arr[i];
        }
    }

    /**
     * Dịch arr[from+1..to+1] sang trái 1 đơn vị, tức arr[from] = arr[from+1], ..., arr[to] = arr[to+1].
     *
     * @param from chỉ số đầu (bao gồm) sẽ bị ghi đè
     * @param to   chỉ số cuối (bao gồm) sẽ bị ghi đè; arr[to+1] phải tồn tại
     */
    public static void shiftLeft(int[] arr, int from, int to) {
        for (int i = from; i <= to; i++) {
            arr[i] = arr[i + 1];
        }
    }

    /**
     * Tổng các phần tử của mảng.
     */
    public static int sum(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }

    /**
     * Tổng các phần tử của một danh sách số nguyên.
     */
    public static int sum(Iterable<Integer> values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    /**
     * Đếm số lần xuất hiện của từng giá trị trong khoảng [0, maxValue].
     *
     * @return mảng độ dài maxValue + 1, phần tử thứ v là số lần giá trị v xuất hiện
     */
    public static int[] countValues(int[] values, int maxValue) {
        int[] counts = new int[maxValue + 1];
        for (int value : values) {
            counts[value]++;
        }
        return counts;
    }
}

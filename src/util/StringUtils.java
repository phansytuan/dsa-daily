package util;

import java.util.LinkedHashMap;

/**
 * Các thao tác dùng chung trên chuỗi: đếm tần suất ký tự.
 */
public final class StringUtils {

    /** Số lượng ký tự ASCII được hỗ trợ bởi {@link #countAscii(String)}. */
    public static final int ASCII_SIZE = 128;

    private StringUtils() {
    }

    /**
     * Đếm số lần xuất hiện của từng ký tự ASCII, tra cứu theo mã ASCII.
     *
     * @return mảng độ dài {@link #ASCII_SIZE}, phần tử thứ c là số lần ký tự có mã c xuất hiện
     */
    public static int[] countAscii(String s) {
        int[] counts = new int[ASCII_SIZE];
        for (char c : s.toCharArray()) {
            counts[c]++;
        }
        return counts;
    }

    /**
     * Đếm số lần xuất hiện của từng ký tự, giữ nguyên thứ tự ký tự xuất hiện đầu tiên trong chuỗi.
     */
    public static LinkedHashMap<Character, Integer> countCharacters(String s) {
        LinkedHashMap<Character, Integer> counts = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
        return counts;
    }
}

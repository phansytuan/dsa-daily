package util;

import java.util.Scanner;
import java.util.function.BiConsumer;

/**
 * Đọc dữ liệu vào theo định dạng quen thuộc của các bài thi: dòng đầu là số test case,
 * mỗi dòng sau là một test case.
 */
public final class ConsoleInput {

    private ConsoleInput() {
    }

    /**
     * Đọc số test case ở dòng đầu tiên rồi gọi {@code handler} cho từng dòng test case.
     * Scanner được đóng lại khi đọc xong.
     *
     * @param handler nhận (số thứ tự test case bắt đầu từ 1, nội dung dòng test case)
     */
    public static void forEachCase(BiConsumer<Integer, String> handler) {
        try (Scanner scanner = new Scanner(System.in)) {
            int cases = Integer.parseInt(scanner.nextLine().trim());
            for (int i = 1; i <= cases; i++) {
                handler.accept(i, scanner.nextLine());
            }
        }
    }
}

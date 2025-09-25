package java_core.Lambda_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaStreamExample {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

    // 1. Lọc số chẵn và in ra
    numbers.stream()
        .filter(n -> n % 2 == 0)
        .forEach(n -> System.out.println("Số chẵn: " + n));

    // 2. Nhân đôi giá trị các phần tử và tạo thành một List mới
    List<Integer> doubled = numbers.stream()
        .map(n -> n * 2)  // Nhân đôi từng phần tử
        .collect(Collectors.toList());

    System.out.println("List ban đầu: " + numbers);
    System.out.println("List nhân đôi: " + doubled);

    // 3. Tính tổng các phần tử trong danh sách (terminal operation)
    int sum = numbers.stream()
        /* reduce() nhận 2 tham số:
          - Giá trị khởi tạo: 0
          - Hàm lambda: cộng dồn subtotal và từng phần tử n */
        .reduce(0, (subtotal, n) -> subtotal + n);

    System.out.println("Tổng các số: " + sum);
  }
}
package java_core;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Java8Examples {
  public static void main(String[] args) {

    // 1. Lambda & Functional Interface
    Runnable r = () -> System.out.println("Hello from Lambda!");
    r.run();

    List<String> names = Arrays.asList("Anna", "Jonathan", "Bob", "Christine");
    Comparator<String> cmp = (String a, String b) -> Integer.compare(a.length(), b.length());
    names.sort(cmp);

    System.out.println("Sorted by length (via variable): " + names);


    // 2. Stream API
    List<Integer> numbers = Arrays.asList(3, 7, 10, 15, 20);
    List<Integer> processed = numbers.stream()
        .filter(n -> n % 2 == 0)       // chỉ giữ số chẵn
        .map(n -> n * n)               // bình phương
        .collect(Collectors.toList()); // gom vào list

    System.out.println("Even squares: " + processed);
    // 3. Method Reference
    processed.forEach(System.out::println); // hãy gọi hàm này với tham số n... Tương đương với: processed.forEach(n -> System.out.println(n));


    // 4. Default & Static Methods in Interface
    MyInterface.sayStatic();       // gọi static method

    MyInterface impl = new MyClass();
    impl.defaultHello();           // gọi default method
    impl.existing();               // gọi method existing()


    // 5. Optional
    Optional<String> maybe = Optional.ofNullable(null); // có thể chứa một giá trị kiểu String, hoặc có thể là null. Ở đây truyền null vào ofNullable(), nên maybe sẽ là một Optional rỗng
    System.out.println("Has value? " + maybe.isPresent());
    maybe.ifPresent(s -> System.out.println("Value: " + s));

    String result = maybe.orElse("Default String"); // lấy giá trị hoặc trả về giá trị thay thế (đang được truyền vào) nếu rỗng.
    System.out.println("Result: " + result);


    // 6. java.time API
    LocalDate today = LocalDate.now();
    LocalDate nextMonth = today.plusMonths(1);
    System.out.println("Today: " + today);
    System.out.println("One month later: " + nextMonth);
  }


  // Ví dụ Default & Static methods
  interface MyInterface {

    void existing(); // một abstract method mặc định trong interface, yêu cầu lớp triển khai phải Override.

    default void defaultHello() {
      System.out.println("Hello from default method!");
    } /**/

    static void sayStatic() {
      System.out.println("Hello from static interface method!");
    }
  }


  static class MyClass implements MyInterface {

    @Override
    public void existing() {
      System.out.println("Implementing default method existing()"); /**/
    }

    /*
    Class Impl có thể override loại method nào của class Interface
      existing()	✅ Bắt buộc override	Vì là abstract  -(Abstract methods trong interface: instance-level nhưng chưa có implementation.)
      defaultHello()	✅ Tùy chọn override	Là default method  -(Default methods trong interface: instance-level và có implementation.)
      sayStatic()	❌ Không thể override	Static methods thuộc interface, không thuộc instance
    */
  }
}
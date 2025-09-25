package java_core.Variables;

public class Main {
  public static void main(String[] args) {

    // Tạo các instance và gọi instance method- printInfo()
    Person p1 = new Person("Alice");
    p1.printInfo();   // Output: Name: Alice, Total Persons: 1

    Person p2 = new Person("Blice");
    p2.printInfo();   // Output: Name: Bob, Total Persons: 2

    // Gọi  static method - printCount()  mà không cần instance
    Person.printCount();   // Output: Total Persons (via static method): 2

    // Ví dụ với biến local trong một method khác
    demoLocalVariable();
  }

  private static void demoLocalVariable() {
    int x = 10;    // Biến local 'x' chỉ sống trong demoLocalVariable()

    System.out.println("Local variable x = " + x);
    // x biến mất khi method kết thúc
  }
}
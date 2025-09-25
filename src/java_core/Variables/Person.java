package java_core.Variables;

public class Person {
  static int count = 0;  // Biến static: chỉ có duy nhất 1 vùng nhớ, gắn với class

  String name;  // Biến instance: mỗi đối tượng Person có 1 name riêng

  public Person(String name) {  // Constructor: mỗi khi tạo mới Person, biến static count sẽ tăng
    this.name = name;
    count++;
  }

  // instance method để in thông tin Person và count hiện tại
  public void printInfo() {
    String info = "Name: " + name + ", Total Persons: " + count;    // Biến local: chỉ tồn tại trong phương thức này

    System.out.println(info);
  }

  // static method: có thể gọi trực tiếp qua class
  public static void printCount() {
    System.out.println("Total Persons (via static method): " + count);
  }
}

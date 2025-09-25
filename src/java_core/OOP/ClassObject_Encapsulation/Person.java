package java_core.OOP.ClassObject_Encapsulation;

public class Person {

  // Biến private (đóng gói)
  private String name;
  private int age;

  // Constructor khởi tạo đối tượng
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // Getter và Setter (cho phép đọc/ghi biến Private)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if (age < 0) {
      System.out.println("Tuổi phải >= 0");
      return;
    }
    this.age = age;
  }

  // Phương thức để hiển thị thông tin
  public void introduce() {
    System.out.println("Xin chào, tôi là " + name + ", " + age + " tuổi.");
  }
}
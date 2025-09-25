package java_core.OOP.ClassObject_Encapsulation;

public class Main {
  public static void main(String[] args) {

    // Tạo một đối tượng Person (Object)
    Person p = new Person("An", 25);

    // Đọc thông tin qua getter
    System.out.println("Tên: " + p.getName());
    System.out.println("Tuổi: " + p.getAge());

    // Thay đổi tên và tuổi qua setter
    p.setName("An Nguyễn");
    p.setAge(26);

    // Gọi phương thức introduce()
    p.introduce();
  }
}

/*
  Person là class (công thức).

  Khi viết new Person("An", 25), JVM tạo một object cụ thể.

  Biến name, age để private để bảo vệ dữ liệu bên trong; muốn đọc/ghi phải qua getter/setter (tính đóng gói).
*/
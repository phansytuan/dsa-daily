package java_core.OOP.Inheritance_Polymorphism;

public class Main_Inheritance {

  public static void main(String[] args) {
    Animal a1 = new Animal();
    Animal a2 = new Dog();  // Tham chiếu kiểu Animal, thực thể là Dog
    Animal a3 = new Cat();  // Tham chiếu kiểu Animal, thực thể là Cat

    a1.makeSound(); // In: Some generic animal sound...
    a2.makeSound(); // In: Gâu gâu!   (gọi phiên bản override của Dog)
    a3.makeSound(); // In: Meo meo!   (gọi phiên bản override của Cat)

    // Với đa hình, nếu muốn truy cập phương thức riêng của Dog, phải ép kiểu:
    if (a2 instanceof Dog) {
      // Kiểm tra kiểu (type check): xác định xem a2 có phải là instance của Dog (hoặc lớp con) không
      Dog d = (Dog) a2;  // Nếu đúng, có thể ép kiểu an toàn
      d.wagTail();       // In: Con chó vẫy đuôi.
      ((Dog) a2).wagTail();
    }
  }
}
/*
  Dog và Cat kế thừa (extends) từ Animal, dùng chung phương thức makeSound() nhưng có cách kêu khác nhau (override).

  Gán Animal a2 = new Dog() là đa hình: biến tham chiếu kiểu cha nhưng runtime gọi đúng method của class con.
*/
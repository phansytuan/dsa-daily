package java_core.OOP.Interface_Abstraction;

public class Main_Interface {

  public static void main(String[] args) {
    Shape r = new Rectangle(3, 4);
    Shape c = new Circle(2);

    System.out.println("Hình chữ nhật: diện tích = " + r.getArea() + ", chu vi = " + r.getPerimeter());

    System.out.println("Hình tròn: diện tích = " + c.getArea() + ", chu vi = " + c.getPerimeter());
  }
}
/*
  Shape là interface (giấy hợp đồng) chứ không có cài đặt (chỉ có chữ ký method).

  Rectangle và Circle “thi hành” hợp đồng đó bằng cách implement các method.
  Giúp nhiều lớp khác nhau tuân theo cùng interface, dễ xử lý chung (đa hình).
*/
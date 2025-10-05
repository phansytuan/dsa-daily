package DesignPattern;

/** FactoryMethod:

 * Ưu 
    Giấu đi chi tiết tạo đối tượng.
    Dễ mở rộng: chỉ cần thêm lớp Concrete Product, Concrete Factory mới. Không sửa code client.
    Giảm phụ thuộc giữa client vs các lớp sản phẩm cụ thể.
  
 * Nhược 
    Tạo thêm nhiều lớp.
    Nếu đối tượng đơn giản, dùng Factory hơi rườm.

👉 Factory Method là “nhà máy” tạo ra đối tượng. Chỉ cần gọi, còn việc tạo cái gì cụ thể → lớp con quyết định. */

 
interface Product {  // Product
  void display();
}

interface Factory {  // Factory
  Product factoryMethod();
}



// Concrete Products
class Phone implements Product {
  public void display() {
    System.out.println("This is a Phone.");
  }
}

class Laptop implements Product {
  public void display() {
    System.out.println("This is a Laptop.");
  }
}


// Concrete Factories
class PhoneFactory implements Factory {

  public Product factoryMethod() {
    return new Phone();
  }
}

class LaptopFactory implements Factory {

  public Product factoryMethod() {
    return new Laptop();
  }
}



// Client
public class FactoryDP {
  public static void main(String[] args) {
    Factory phoneFactory = new PhoneFactory();

    Product phone = phoneFactory.factoryMethod();
    phone.display();

    
    Factory laptopFactory = new LaptopFactory();
    
    Product laptop = laptopFactory.factoryMethod();
    laptop.display();
  }
}

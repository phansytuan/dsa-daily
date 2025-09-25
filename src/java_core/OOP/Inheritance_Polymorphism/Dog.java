package java_core.OOP.Inheritance_Polymorphism;

public class Dog extends Animal {

  // Ghi đè (override) phương thức của class cha
  @Override
  public void makeSound() {
    System.out.println("Gâu gâu!");
  }

  // Phương thức riêng của Dog
  public void wagTail() {
    System.out.println("Con chó vẫy đuôi.");
  }
}
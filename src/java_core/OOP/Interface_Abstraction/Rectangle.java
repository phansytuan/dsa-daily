package java_core.OOP.Interface_Abstraction;

public class Rectangle implements Shape {

  private double width;
  private double height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  // Bắt buộc phải override cả hai method của Shape
  @Override
  public double getArea() {
    return width * height;
  }

  @Override
  public double getPerimeter() {
    return 2 * (width + height);
  }
}
package DesignPattern;

// Prototype interface 
interface Shape {
    Shape clone(); // Tạo bản sao
    void draw();   // Vẽ hình
}

// Concrete Prototype
class Circle implements Shape {
    private String color;

    public Circle(String color) { this.color = color; }

    @Override
    public Shape clone() { return new Circle(this.color); }  // Sao chép với cùng màu

    @Override
    public void draw() { System.out.println("Drawing a " + color + " circle."); }
}

class Rectangle implements Shape {
    private String color;
    public Rectangle(String color) { this.color = color; }

    @Override public Shape clone() { return new Rectangle(this.color); }
    @Override public void draw() { System.out.println("Drawing a " + color + " rectangle."); }
}


// Client
class ShapeClient {
    private Shape shapePrototype;

    public ShapeClient(Shape shapePrototype) { this.shapePrototype = shapePrototype; }

    public Shape createShape() {
        return shapePrototype.clone();
    }
}

// Main
public class PrototypeDP {
    public static void main(String[] args) {

        // Prototype gốc: hình tròn màu đỏ
        Shape circlePrototype = new Circle("red");
        circlePrototype.draw();

        // Client dùng prototype để tạo bản sao
        ShapeClient client = new ShapeClient(circlePrototype);

        Shape redCircle = client.createShape();
        redCircle.draw();  // Vẽ hình tròn mới được clone

        

        Shape rectanglePrototype = new Rectangle("blue");
        ShapeClient rectClient = new ShapeClient(rectanglePrototype);
        Shape blueRectangle = rectClient.createShape();
        blueRectangle.draw();
    }
}

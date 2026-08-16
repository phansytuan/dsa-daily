package java_core.OOP.Interface_Abstraction;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ShapeTest {

    private static final double DELTA = 1e-9;

    @Test
    void circleComputesAreaAndPerimeter() {
        Shape circle = new Circle(2.0);

        assertEquals(Math.PI * 4, circle.getArea(), DELTA);
        assertEquals(Math.PI * 4, circle.getPerimeter(), DELTA);
    }

    @Test
    void degenerateCircleHasZeroAreaAndPerimeter() {
        Shape circle = new Circle(0);

        assertEquals(0.0, circle.getArea(), DELTA);
        assertEquals(0.0, circle.getPerimeter(), DELTA);
    }

    @Test
    void rectangleComputesAreaAndPerimeter() {
        Shape rectangle = new Rectangle(3.0, 4.0);

        assertEquals(12.0, rectangle.getArea(), DELTA);
        assertEquals(14.0, rectangle.getPerimeter(), DELTA);
    }

    @Test
    void squareIsARectangleWithEqualSides() {
        Shape square = new Rectangle(5.0, 5.0);

        assertEquals(25.0, square.getArea(), DELTA);
        assertEquals(20.0, square.getPerimeter(), DELTA);
    }
}

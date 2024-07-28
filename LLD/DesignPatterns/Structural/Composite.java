import java.util.ArrayList;
import java.util.List;

// Component Interface
interface Shape {
    void draw();
}

// Leaf Class - Circle
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Leaf Class - Rectangle
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Composite Class
class CompositeShape implements Shape {
    private List<Shape> shapes = new ArrayList<>();

    public void add(Shape shape) {
        shapes.add(shape);
    }

    public void remove(Shape shape) {
        shapes.remove(shape);
    }

    @Override
    public void draw() {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}

// Main Class to demonstrate the Composite Pattern
class CompositePatternExample {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        CompositeShape composite = new CompositeShape();
        composite.add(circle);
        composite.add(rectangle);

        System.out.println("Drawing composite shape:");
        composite.draw();
    }
}

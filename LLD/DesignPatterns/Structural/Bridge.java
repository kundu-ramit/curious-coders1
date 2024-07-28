// Implementor interface
interface DrawingAPI {
    void drawCircle(double x, double y, double radius);
    void drawSquare(double x, double y, double side);
}

// ConcreteImplementor 1
class DrawingAPI1 implements DrawingAPI {
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.println("DrawingAPI1 drawing a circle at (" + x + ", " + y + ") with radius " + radius);
    }

    @Override
    public void drawSquare(double x, double y, double side) {
        System.out.println("DrawingAPI1 drawing a square at (" + x + ", " + y + ") with side " + side);
    }
}

// ConcreteImplementor 2
class DrawingAPI2 implements DrawingAPI {
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.println("DrawingAPI2 drawing a circle at (" + x + ", " + y + ") with radius " + radius);
    }

    @Override
    public void drawSquare(double x, double y, double side) {
        System.out.println("DrawingAPI2 drawing a square at (" + x + ", " + y + ") with side " + side);
    }
}

// Abstraction
abstract class Shape {
    protected DrawingAPI drawingAPI;

    protected Shape(DrawingAPI drawingAPI) {
        this.drawingAPI = drawingAPI;
    }

    public abstract void draw(); // low-level
    public abstract void resizeByPercentage(double pct); // high-level
}

// RefinedAbstraction - Circle
class CircleShape extends Shape {
    private double x, y, radius;

    public CircleShape(double x, double y, double radius, DrawingAPI drawingAPI) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawingAPI.drawCircle(x, y, radius);
    }

    @Override
    public void resizeByPercentage(double pct) {
        radius *= (1.0 + pct / 100.0);
    }
}

// RefinedAbstraction - Square
class SquareShape extends Shape {
    private double x, y, side;

    public SquareShape(double x, double y, double side, DrawingAPI drawingAPI) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.side = side;
    }

    @Override
    public void draw() {
        drawingAPI.drawSquare(x, y, side);
    }

    @Override
    public void resizeByPercentage(double pct) {
        side *= (1.0 + pct / 100.0);
    }
}

// Main class to demonstrate the Bridge Pattern
public class BridgePatternExample {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
            new CircleShape(1, 2, 3, new DrawingAPI1()),
            new CircleShape(5, 7, 11, new DrawingAPI2()),
            new SquareShape(2, 3, 4, new DrawingAPI1()),
            new SquareShape(6, 8, 12, new DrawingAPI2())
        };

        for (Shape shape : shapes) {
            shape.draw();
            shape.resizeByPercentage(10);
            shape.draw();
        }
    }
}

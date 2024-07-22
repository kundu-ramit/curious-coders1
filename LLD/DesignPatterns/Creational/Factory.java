// Interface for all shapes
interface Shape {
    void draw();
  }
  
  // Concrete classes for different shapes
  class Circle implements Shape {
  
    @Override
    public void draw() {
      System.out.println("Drawing Circle");
    }
  }
  
  class Rectangle implements Shape {
  
    @Override
    public void draw() {
      System.out.println("Drawing Rectangle");
    }
  }
  
  class Square implements Shape {
  
    @Override
    public void draw() {
      System.out.println("Drawing Square");
    }
  }
  
  // Factory class to create different shapes
  class ShapeFactory {
  
    public static Shape getShape(String shapeType) {
      if (shapeType.equalsIgnoreCase("CIRCLE")) {
        return new Circle();
      } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
        return new Rectangle();
      } else if (shapeType.equalsIgnoreCase("SQUARE")) {
        return new Square();
      } else {
        throw new IllegalArgumentException("Invalid shape type provided");
      }
    }
  }
  
   class ShapeFactoryDemo {
    public static void main(String[] args) {
  
      Shape shape1 = ShapeFactory.getShape("CIRCLE");
      shape1.draw();
  
      Shape shape2 = ShapeFactory.getShape("RECTANGLE");
      shape2.draw();
  
      // Shape shape3 = ShapeFactory.getShape("Triangle"); // This will throw an exception
    }
  }
  
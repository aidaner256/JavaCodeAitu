abstract class Shape {
    // Abstract method to calculate area
    public abstract double calculateArea();

    public static void main(String[] args) {
    Circle circle = new Circle(5.0);
    Rectangle rectangle = new Rectangle(4.0, 6.0);
    System.out.println("Area of Circle: " + circle.calculateArea());
    System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
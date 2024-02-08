public class Shapes {

    public static void main(String[] args) {
        // Create a square with side length 5
        Square square = new Square(5);
        System.out.println("Square area: " + square.getArea());
        System.out.println("Square perimeter: " + square.getPerimeter());

        // Create a circle with radius 3
        Circle circle = new Circle(3);
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle circumference: " + circle.getCircumference());
    }

    public static class Square {

        private double sideLength;

        public Square(double sideLength) {
            this.sideLength = sideLength;
        }

        public double getArea() {
            return sideLength * sideLength;
        }

        public double getPerimeter() {
            return 4 * sideLength;
        }
    }

    public static class Circle {

        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }

        public double getCircumference() {
            return 2 * Math.PI * radius;
        }
    }
}

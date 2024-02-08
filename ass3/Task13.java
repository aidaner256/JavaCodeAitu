
public class Task13 {
    private double side1;
    private double side2;
    private double side3;

    // Constructor
    public Task13(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Method to calculate the perimeter
    public double calculatePerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    // Method to calculate the area using Heron's formula
    public double calculateArea() {
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
    }

    // Main method
    public static void main(String[] args) {
        // Create a new triangle
        Task13 triangle = new Task13(3, 4, 5);

        // Calculate and display the perimeter
        System.out.println("Perimeter: " + triangle.calculatePerimeter());

        // Calculate and display the area
        System.out.println("Area: " + triangle.calculateArea());
    }
}

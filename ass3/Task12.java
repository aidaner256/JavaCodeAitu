public class Task12 {
    private String name;
    private int age;
    private double GPA;

    // Constructor
    public Task12(String name, int age, double GPA) {
        this.name = name;
        this.age = age;
        this.GPA = GPA;
    }

    // Method to display student information
    public void displayStudentInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("GPA: " + this.GPA);
    }

    // Method to update GPA
    public void updateGPA(double newGPA) {
        this.GPA = newGPA;
    }

    // Main method
    public static void main(String[] args) {
        // Create a new student
        Task12 student = new Task12("John Doe", 20, 3.5);

        // Display student information
        student.displayStudentInfo();

        // Update GPA
        student.updateGPA(3.8);

        // Display updated student information
        student.displayStudentInfo();
    }
}

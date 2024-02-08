
public class Student extends Person {
    private int studentId;

    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Student ID: " + studentId);
        System.out.println();
    }
    
    public static void main(String[] args) {
        Student Aidan = new Student("Aidan", 18, 12345);
        Person Hon = new Person("Hon", 99);
        Hon.printDetails();
        
    }
}

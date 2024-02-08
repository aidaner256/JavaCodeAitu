public class Task11 {
    private String subjectName;
    private int numberOfHours;

    // Constructor
    public Task11(String subjectName, int numberOfHours) {
        this.subjectName = subjectName;
        this.numberOfHours = numberOfHours;
    }

    // Getter for subjectName
    public String getSubjectName() {
        return subjectName;
    }

    // Setter for subjectName
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    // Getter for numberOfHours
    public int getNumberOfHours() {
        return numberOfHours;
    }

    // Setter for numberOfHours
    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    // Main method
    public static void main(String[] args) {
        Task11 math = new Task11("Mathematics", 6);
        System.out.println("Subject Name: " + math.getSubjectName());
        System.out.println("Number of Hours: " + math.getNumberOfHours());
    }
}

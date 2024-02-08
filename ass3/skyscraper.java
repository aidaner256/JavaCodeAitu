public class skyscraper {
    // Private instance variables to store information about the skyscraper
    private int floorsCount;
    private String developer;

    // Default constructor initializes the skyscraper with default values
    public skyscraper() {
        floorsCount = 5;
        developer = "JavaRushDevelopment";
    }

    // Parameterized constructor allows customization of skyscraper properties
    public skyscraper(int floorsCount, String developer) {
        floorsCount = floorsCount;
        developer = developer;
    }
    
    // Method to display information about the skyscraper
    public void displayInfo() {
        System.out.println("floorsCount: " + floorsCount);
        System.out.println("developer: " + developer);
    }

    // Main method to demonstrate the usage of the skyscraper class
    public static void main(String[] args) {
        // Create an instance of the skyscraper class using the default constructor
        skyscraper skyscraper = new skyscraper();

        // Create another instance with customized values using the parameterized constructor
        skyscraper skyscraperUnknown = new skyscraper(50, "Unknown");

        // Display information about both skyscrapers
        skyscraper.displayInfo();
        skyscraperUnknown.displayInfo();
    }
}

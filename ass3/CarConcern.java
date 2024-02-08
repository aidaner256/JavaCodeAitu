public class CarConcern {

    // Private fields to store car details
    private final String manufacturer = "Lamborghini"; 
    private final String model; 
    private final int year; 
    private final String color;

    // Constructor to create a car with all details
    private CarConcern(String modelInput, int yearInput, String colorInput) {
        model = modelInput;
        year = yearInput;
        color = colorInput;
    }

    // Constructor to create a car with model and year, defaulting color to "Orange"
    public CarConcern(String modelInput, int yearInput) {
        model = modelInput;
        year = yearInput;
        color = "Orange";
    }

    // Constructor to create a car with only model, using default year and color
    public CarConcern(String modelInput) {
        model = modelInput;
        year = 4321;
        color = "Orange";
    }

    // Main method to create and print car objects
    public static void main(String[] args) {

        // Create three car objects with different information
        CarConcern car1 = new CarConcern("Model S", 2022, "Red");
        System.out.println("Manufacturer: " + car1.manufacturer);
        System.out.println("Model: " + car1.model);
        System.out.println("Year: " + car1.year);
        System.out.println("Color: " + car1.color);

        CarConcern car2 = new CarConcern("Model X", 2023);
        System.out.println("Manufacturer: " + car2.manufacturer);
        System.out.println("Model: " + car2.model);
        System.out.println("Year: " + car2.year);
        System.out.println("Color: " + car2.color);

        CarConcern car3 = new CarConcern("Model Y");
        System.out.println("Manufacturer: " + car3.manufacturer);
        System.out.println("Model: " + car3.model);
        System.out.println("Year: " + car3.year);
        System.out.println("Color: " + car3.color);
    }
}

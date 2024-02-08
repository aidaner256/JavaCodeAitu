public class Building {
    private String type;

    public void initialize(String type) {
        this.type = type;
    }

    public static void main(String[] args) {
        // Create a new instance of the Building class
        Building building = new Building();
        // Initialize the building as a "Ресторан" (Restaurant)
        building.initialize("Ресторан");
        // Change the type of the building to a "Барбершоп" (Barbershop)
        building.initialize("Барбершоп");
    }
}

// Main class that contains the main method
public class Polymorphism{

    public static void main(String[] args) {
        // Compile-time Polymorphism (Method Overloading)
        System.out.println("Compile-time Polymorphism:");

        // Call the overloaded methods with different parameters
        printVehicleType(new Car());
        printVehicleType(new Bike());

        System.out.println("\nRuntime Polymorphism:");

        // Runtime Polymorphism (Method Overriding)
        // Create an array of Vehicle references
        Vehicle[] vehicles = { new Car(), new Bike() };

        // Loop through the array and call the start method
        for (Vehicle v : vehicles) {
            v.start();  // The start method is dynamically bound at runtime
        }
    }

    // Method demonstrating compile-time polymorphism (method overloading)
    // This method will print the type of vehicle
    public static void printVehicleType(Vehicle v) {
        if (v instanceof Car) {
            System.out.println("This is a Car.");
        } else if (v instanceof Bike) {
            System.out.println("This is a Bike.");
        }
    }
}

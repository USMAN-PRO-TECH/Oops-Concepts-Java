// Another child class or Subclass that inherits from Vehicle
public class Bike extends Vehicle {

    // Overriding the start method from the Vehicle class
    @Override
    public void start() {
        System.out.println("Bike is starting with a vroom.");
    }

    // Method specific to Bike class
    public void ringBell() {
        System.out.println("Bike bell is ringing.");
    }
}
// Child class or Subclass that inherits from Vehicle
public class Car extends Vehicle {

    // Overriding the start method from the Vehicle class
    @Override
    public void start() {
        System.out.println("Car is starting with a roar.");
    }

    // Method specific to Car class
    public void honk() {
        System.out.println("Car is honking.");
    }
}
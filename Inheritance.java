// Parent class or Superclass
class Animal {
    
    // Field or attribute for the Animal class
    String name;

    // Constructor for Animal class to initialize the name
    public Animal(String name) {
        this.name = name;
    }

    // Method to make the animal eat
    public void eat() {
        System.out.println(name + " is eating.");
    }

    // Method to make the animal sleep
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Child class or Subclass that inherits from Animal
class Dog extends Animal {
    
    // Constructor for Dog class, which calls the constructor of the parent class (Animal)
    public Dog(String name) {
        super(name);  // Calling the parent class constructor to initialize the name
    }

    // New method specific to the Dog class
    public void bark() {
        System.out.println(name + " is barking.");
    }
}

// Main class that contains the main method
public class Inheritance {

    public static void main(String[] args) {
        // Create an instance of the Dog class (subclass)
        Dog myDog = new Dog("Buddy");

        // Call methods inherited from the Animal class (parent class)
        myDog.eat();   // Output: Buddy is eating.
        myDog.sleep(); // Output: Buddy is sleeping.

        // Call method specific to the Dog class
        myDog.bark();  // Output: Buddy is barking.
    }
}

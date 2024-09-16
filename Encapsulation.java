/**
 * This class demonstrates the concept of Encapsulation in Java.
 * Encapsulation is one of the fundamental principles of Object-Oriented Programming (OOP).
 * It refers to the bundling of data (fields) and methods (functions) that operate on that data 
 * into a single unit or class, and restricting access to some of the object's components.
 */
public class Encapsulation {

    // Main method - Entry point of the Java program
    public static void main(String[] args) {

        // Creating an object (or instance) of the Employee class
        // The Employee class demonstrates encapsulation by restricting direct access
        // to its private fields and providing public getter and setter methods
        Employee emp = new Employee();

        // Setting the name of the employee using the public setter method
        // This setter allows indirect access to the private 'name' field
        emp.SetName("User");

        // Getting the name of the employee using the public getter method
        // This getter method retrieves the value of the private 'name' field
        System.out.println(emp.getName()); // Output: User
    }
}
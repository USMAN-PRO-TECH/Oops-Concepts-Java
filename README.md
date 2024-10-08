# Oops-Concepts-Java

# Object-Oriented Programming (OOP)

Object-Oriented Programming (OOP) is a programming paradigm centered around the concept of "objects." Objects are instances of classes, which are blueprints that define the properties (attributes) and behaviors (methods) that objects possess.

# Core Concepts of OOP

Classes: A class is a blueprint for creating objects. It defines attributes (fields) and methods (functions) that the objects created from the class will have.

Objects: An object is an instance of a class. Objects have states and behaviors, defined by the class they are instantiated from.

Methods: Methods are functions defined within a class that specify the behaviors or actions an object can perform.

# Pillars of OOP

Object-Oriented Programming is based on four main pillars:

# 1. Encapsulation

Definition: Encapsulation is the process of bundling the data (attributes) and the methods (functions) that operate on the data into a single unit or class. It also restricts direct access to some of an object's components and protects the object's internal state from unauthorized access.

# Example:

java
Copy code
public class Person {
private String name; // Private field (cannot be accessed directly)
private int age;

    // Public getter method to access the private field
    public String getName() {
        return name;
    }

    // Public setter method to modify the private field
    public void setName(String name) {
        this.name = name;
    }

}

# Benefits:

Protects object integrity by preventing unintended modifications.
Simplifies code maintenance and improves flexibility.

# 2. Inheritance

Definition: Inheritance allows a class (child class) to inherit properties and behaviors (methods and fields) from another class (parent class). It enables code reuse and establishes a relationship between classes.

# Example:

java
Copy code
public class Animal {
public void eat() {
System.out.println("This animal is eating.");
}
}

public class Dog extends Animal {
public void bark() {
System.out.println("The dog is barking.");
}
}

# Benefits:

Promotes code reuse.
Establishes a natural hierarchy between classes.

# 3. Polymorphism

Definition: Polymorphism allows objects to be treated as instances of their parent class or interface. The two types of polymorphism are:
Compile-time Polymorphism (Method Overloading): Multiple methods in the same class with the same name but different parameter lists.
Runtime Polymorphism (Method Overriding): A subclass provides a specific implementation of a method that is already defined in its superclass.

# Example:

java
Copy code

# // Compile-time Polymorphism (Overloading)

public class Calculator {
public int add(int a, int b) {
return a + b;
}
public double add(double a, double b) {
return a + b;
}
}

# // Runtime Polymorphism (Overriding)

public class Animal {
public void sound() {
System.out.println("Some sound...");
}
}

public class Dog extends Animal {

# @Override

public void sound() {
System.out.println("Bark");
}
}

# Benefits:

Flexibility in code.
Simplifies interface design by allowing different implementations for the same interface.

# 4. Abstraction

Definition: Abstraction is the process of hiding the implementation details and showing only the functionality to the user. It reduces complexity and increases efficiency by focusing on what an object does rather than how it does it.

# Example:

java
Copy code
abstract class Vehicle {
// Abstract method (does not have a body)
public abstract void start();

    // Concrete method (has a body)
    public void stop() {
        System.out.println("Vehicle stopped.");
    }

}

public class Car extends Vehicle {

# @Override

public void start() {
System.out.println("Car started.");
}
}
Benefits:
Simplifies the complexity by hiding unnecessary details.
Increases flexibility in code.

/**
 * Employee class demonstrates the concept of encapsulation.
 * Encapsulation hides the internal data and functionality of a class
 * and provides controlled access through getter and setter methods.
 */
class Employee {

    // Private fields (attributes) - cannot be accessed directly from outside the
    // class
    // These fields store the employee's name, ID, basic salary, and incentive
    private String name = "John"; // Default name for the employee
    private int empID = 1; // Default employee ID
    private int basicSal = 20000; // Basic salary for the employee
    private int incentive = 200; // Incentive amount for the employee

    /**
     * Private method to calculate and print the total salary.
     * This method is private because it is meant to be used internally by the class
     * and should not be accessible from outside the class.
     */
    private void CountSal() {
        // Print the total salary by adding basic salary and incentive
        System.out.println(basicSal + incentive);
    }

    /**
     * Public getter method for the 'name' field.
     * This method provides controlled access to the private 'name' field.
     * 
     * @return the name of the employee
     */
    String getName() {
        return name; // Return the current value of the name field
    }

    /**
     * Public setter method for the 'name' field.
     * This method allows controlled modification of the private 'name' field.
     * 
     * @param name the new name of the employee
     * @return the updated name of the employee
     */
    String SetName(String name) {
        // 'this.name' refers to the class-level 'name' field, while 'name' is the
        // parameter passed to the method
        return this.name = name; // Assign the new name to the class field and return it
    }
}

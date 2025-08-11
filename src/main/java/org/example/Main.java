package org.example;

// import static org.example.ParameterPassing.modifyValue;
// import static org.example.VarargsExample.printMessages;
// import static org.example.VarargsExample.findLargest;

public class Main {
    // public static void changeStudentName(Student student, String newName) {
    // student.setName(newName);
    // System.out.println("Name after change: " + student.getName());
    // }

    public static void main(String[] args) {
        // Car myCar = new Car();
        // myCar.startEngine();
        // String status = myCar.drive(60);
        // System.out.println(status);
        // myCar.turnOffEngine();

        // int originalValue = 50;
        // System.out.println("Before method call: " + originalValue);
        // modifyValue(originalValue);
        // System.out.println("After method call: " + originalValue);
        // Student student = new Student("Alex");
        // changeStudentName(student, "Jordan");

        // printMessages("Hello", "World");
        // printMessages("Testing", "Varargs", "Here");
        // printMessages();
        // System.out.print("The largest in (10, 5, 25, 15) is: ");
        // System.out.println(findLargest(10, 5, 25, 15));
        // System.out.print("The largest in (-5, -1, -10) is: ");
        // System.out.println(findLargest(-5, -1, -10));
        // System.out.print("The largest with no numbers is: ");
        // System.out.println(findLargest());

        // Account myAccount = new Account();
        // myAccount.displayAccountDetails();
        // SmartDoor smartDoor = new SmartDoor();
        // System.out.println("Is the door locked? " + smartDoor.isLocked());
        // smartDoor.lockDoor();
        // System.out.println("Is the door locked? " + smartDoor.isLocked());
        // smartDoor.unlockDoor();
        // System.out.println("Is the door locked? " + smartDoor.isLocked());

        // System.out.println("App Name: " + Utility.getAppName());
        // Utility utilInstance = new Utility();
        // System.out.println("Instance ID: " + utilInstance.getInstanceId());
        // double celsius = 25.0;
        // double fahrenheit = Converter.celsiusToFahrenheit(celsius);
        // System.out.println(celsius + " degrees C is " + fahrenheit + " degrees F.");

        // Display d = new Display();
        // d.show(42);
        // d.show("Hello");
        // d.show("Goodbye", 3);
        // double celsius = 25.0;
        // double fahrenheit = Converter.celsiusToFahrenheit(celsius);
        // System.out.println(celsius + " degrees C is " + fahrenheit + " degrees F.");
        // double fahrenheit1 = 77.0;
        // double celsius1 = Converter.fahrenheitToCelsius(fahrenheit1);
        // System.out.println(fahrenheit1 + " degrees F is " + celsius1 + " degrees
        // C.");

        // Pizza pizza1 = new Pizza();
        // pizza1.display();
        // Pizza pizza2 = new Pizza("Pepperoni");
        // pizza2.display();
        // Pizza pizza3 = new Pizza("Mushroom and Onion", 16);
        // pizza3.display();
        Computer computer1 = new Computer();
        System.out.println("Computer 1: " + computer1.display());
        Computer computer2 = new Computer("Dell");
        System.out.println("Computer 2: " + computer2.display());
        Computer computer3 = new Computer("Apple", 16);
        System.out.println("Computer 3: " + computer3.display());
    }
}
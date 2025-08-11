package org.example;

// import static org.example.ParameterPassing.modifyValue;
import static org.example.VarargsExample.printMessages;
import static org.example.VarargsExample.findLargest;

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
        System.out.print("The largest in (10, 5, 25, 15) is: ");
        System.out.println(findLargest(10, 5, 25, 15));
        System.out.print("The largest in (-5, -1, -10) is: ");
        System.out.println(findLargest(-5, -1, -10));
        System.out.print("The largest with no numbers is: ");
        System.out.println(findLargest());
    }
}
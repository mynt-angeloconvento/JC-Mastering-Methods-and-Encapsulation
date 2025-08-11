package org.example;

// import static org.example.ParameterPassing.modifyValue;

public class Main {
    public static void changeStudentName(Student student, String newName) {
        student.setName(newName);
        System.out.println("Name after change: " + student.getName());
    }

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
        Student student = new Student("Alex");
        changeStudentName(student, "Jordan");
    }
}
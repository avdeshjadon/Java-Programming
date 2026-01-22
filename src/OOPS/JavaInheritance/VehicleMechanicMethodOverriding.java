// Vehicle Mechanic Method Overriding
//
// Problem: Write a Java program to create a class called Vehicle with a method called:
//     - drive()
//
// Then create a subclass called Mechanic that overrides the drive() method
// to print: "Repairing a car"
//
// Sample Output:
// Repairing a car

package OOPS.JavaInheritance;

class Vehicle {
    void drive() {
        System.out.println("You are driving a vehicle");
    }
}

class Mechanic extends Vehicle {
    @Override
    void drive() {
        System.out.println("Repairing a car");
    }
}

public class VehicleMechanicMethodOverriding {
    public static void main(String[] args) {
        Mechanic avdeshMechanic = new Mechanic();
        avdeshMechanic.drive();
    }
}
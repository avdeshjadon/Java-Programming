// Abstract Class - Vehicle Engine Control
//
// Problem: Write a Java program to create an abstract class Vehicle with two abstract methods:
//     - startEngine()
//     - stopEngine()
//
// Then create two subclasses that extend Vehicle:
//   Car         - starts and stops a car engine
//   Motorcycle  - starts and stops a motorcycle engine
//
// Sample Output:
// Car engine started
// Car engine stopped
// Motorcycle engine started
// Motorcycle engine stopped

package OOPS.JavaAbstractClasses;

abstract class Vehicle {
    public void display() {
        startEngine();
        stopEngine();
    }

    public abstract void startEngine();

    public abstract void stopEngine();
}

class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped");
    }
}

class MotorCycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine stopped");
    }
}

public class AbstractVehicleEngineControl {
    public static void main(String[] args) {
        Vehicle avdeshCar = new Car();
        Vehicle amanMotorcycle = new MotorCycle();
        avdeshCar.display();
        amanMotorcycle.display();
    }
}
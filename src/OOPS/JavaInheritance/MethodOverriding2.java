// ------------------- 🔹 2. Method Overriding 🔹 -------------------
//
// 💡 Write a Java program to create a class called `Vehicle` with a method called:
//     - `drive()`
//
// Then create a subclass called `Car` that overrides the `drive()` method
// to print: "Repairing a car"
//
// ------------------- 🧾 SAMPLE OUTPUT -------------------
// Repairing a car


package OOPS.JavaInheritance;

class Vehicle {
    void drive() {
        System.out.println("You are driving a car");
    }
}

class Mechanic extends Vehicle {
    @Override
    void drive() {
        System.out.println("Repairing a car");
    }
}

public class MethodOverriding2 {
    public static void main(String[] args) {
        Mechanic mechanic = new Mechanic();
        mechanic.drive();
    }
}

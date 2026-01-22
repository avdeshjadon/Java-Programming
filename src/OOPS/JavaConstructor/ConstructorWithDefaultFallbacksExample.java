// Constructor with Default Fallbacks - Car Class Example
//
// Problem: Write a Java program to demonstrate constructor input validation with default fallback values.
// The Car class has three fields: make, model, and year.
// - If make or model is null or empty, default values are assigned.
// - If year is negative, it's defaulted to 2000.
//
// Approach: The program creates two Car objects:
//    1. With invalid input (to test fallback logic)
//    2. With valid input (to verify correct assignment)
//
// Sample Output:
// Make: Unknown Make
// Model: Unknown Model
// Year: 2000
// Make: Toyota
// Model: Corolla
// Year: 2022

package OOPS.JavaConstructor;

class Car {
    private String make;
    private String model;
    int year;

    public Car(String make, String model, int year) {
        if (make == null || make.isEmpty()) {
            this.make = "Unknown Make";
        } else {
            this.make = make;
        }
        if (model == null || model.isEmpty()) {
            this.model = "Unknown Model";
        } else {
            this.model = model;
        }
        if (year < 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}

public class ConstructorWithDefaultFallbacksExample {
    public static void main(String[] args) {
        // Invalid data entries or wrong entries
        Car avdeshCar = new Car("", "", -7);
        System.out.println("Make: " + avdeshCar.getMake());
        System.out.println("Model: " + avdeshCar.getModel());
        System.out.println("Year: " + avdeshCar.getYear());

        // Second object creation with proper values
        Car amanCar = new Car("Toyota", "Corolla", 2022);
        System.out.println("Make: " + amanCar.getMake());
        System.out.println("Model: " + amanCar.getModel());
        System.out.println("Year: " + amanCar.getYear());
    }
}
// ------------------- 🔹 9. Vehicle Class Hierarchy 🔹 -------------------
//
// 💡 Write a Java program to create a vehicle class hierarchy.
// The base class should be `Vehicle`, with subclasses:
//     - `Truck`
//     - `Car`
//     - `Motorcycle`
//
// Each subclass should include properties like:
//     ✅ make
//     ✅ model
//     ✅ year
//     ✅ fuel type
//
// Implement methods in each subclass to calculate:
//     🔸 Fuel efficiency
//     🔸 Distance traveled
//     🔸 Maximum speed
//
// ------------------- 🧾 SAMPLE OUTPUT -------------------
// Truck: Make - Ford, Model - F-150, Year - 2020, Fuel Type - Diesel
// Fuel Efficiency: 15 mpg
// Distance Traveled: 300 miles
// Maximum Speed: 100 mph
//
// Car: Make - Toyota, Model - Camry, Year - 2019, Fuel Type - Petrol
// Fuel Efficiency: 25 mpg
// Distance Traveled: 450 miles
// Maximum Speed: 120 mph
//
// Motorcycle: Make - Yamaha, Model - YZF-R3, Year - 2021, Fuel Type - Petrol
// Fuel Efficiency: 60 mpg
// Distance Traveled: 180 miles
// Maximum Speed: 180 mph


package OOPS.JavaInheritance;

class Vehicle1 {
    private String make;
    private String model;
    private int year;
    private String fuelType;

    Vehicle1(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    String getMake() {
        return make;
    }

    String getModel() {
        return model;
    }

    int getYear() {
        return year;
    }

    String getFuelType() {
        return fuelType;
    }

    public void displayInfo() {
        System.out.println(getClass().getSimpleName() + ": Make - " + make + ", Model - " + model + ", Year - " + year + ", Fuel Type - " + fuelType);
    }

    int fuelEfficiency() {
        return 0;
    }

    int distanceTraveled() {
        return 0;
    }

    int maxSpeed() {
        return 0;
    }

    void showStats() {
        System.out.println("Fuel Efficiency: " + fuelEfficiency() + " mpg");
        System.out.println("Distance Traveled: " + distanceTraveled() + " miles");
        System.out.println("Maximum Speed: " + maxSpeed() + " mph\n");
    }
}

class Truck extends Vehicle1 {
    Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    int fuelEfficiency() {
        return 15;
    }

    @Override
    int distanceTraveled() {
        return 300;
    }

    @Override
    int maxSpeed() {
        return 100;
    }
}

class Car extends Vehicle1 {
    Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    int fuelEfficiency() {
        return 25;
    }

    @Override
    int distanceTraveled() {
        return 450;
    }

    @Override
    int maxSpeed() {
        return 120;
    }
}

class MotorCycle extends Vehicle1 {
    MotorCycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    int fuelEfficiency() {
        return 60;
    }

    @Override
    int distanceTraveled() {
        return 180;
    }

    @Override
    int maxSpeed() {
        return 180;
    }
}

public class VehicleClassHierarchy {
    public static void main(String[] args) {
        Truck truck = new Truck("Ford", "f-150", 2020, "Diesel");
        Car car = new Car("Toyota", "Camery", 2019, "Petrol");
        MotorCycle motorCycle = new MotorCycle("Royal Enfied", "Bullet", 2025, "Petrol");
        System.out.println();
        truck.displayInfo();
        truck.showStats();
        car.displayInfo();
        car.showStats();
        motorCycle.displayInfo();
        motorCycle.showStats();
    }
}

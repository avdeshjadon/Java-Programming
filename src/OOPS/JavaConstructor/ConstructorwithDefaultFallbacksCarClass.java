// ------------------- 🔹 Constructor with Default Fallbacks - Car Class 🔹 -------------------
//
// 💡 Write a Java program to demonstrate **constructor input validation with default fallback values**.
// The `Car` class has three fields: `make`, `model`, and `year`.
// - If `make` or `model` is `null` or empty, default values are assigned.
// - If `year` is negative, it's defaulted to `2000`.
//
// 🧠 The program creates two `Car` objects:
//    1. With invalid input (to test fallback logic)
//    2. With valid input (to verify correct assignment)
//
// ------------------- 🧾 SAMPLE OUTPUT -------------------
// Make : Unknown Make
// Model : Unkonown Model
// Year : 2000
// Make : Toyota
// Model : Corolla
// Year : 2022


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
            this.model = "Unkonown Model";
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

public class ConstructorwithDefaultFallbacksCarClass {

    public static void main(String[] args) {
        // unfield data entries or wrong entries
        Car myCar1 = new Car("", "", -7);
        System.out.println("Make : " + myCar1.getMake());
        System.out.println("Model : " + myCar1.getModel());
        System.out.println("Year : " + myCar1.getYear());

        //second object creation with proper values
        Car myCar2 = new Car("Toyota", "Corolla", 2022);
        System.out.println("Make : " + myCar2.getMake());
        System.out.println("Model : " + myCar2.getModel());
        System.out.println("Year : " + myCar2.getYear());


    }
}

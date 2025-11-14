// ------------------- 🔹Local Inner Class -------------------
//
// 💡 Write a Java program to demonstrate a **local inner class**.
// Create an outer class `Car` with a method `startEngine()`.
// Inside this method, define a local class `Engine` that has a method:
//     - `run()` to print "Engine is running".
//
// The `startEngine()` method should create an instance of the local class
// and call the `run()` method.
//
// ------------------- 🧾 SAMPLE OUTPUT -------------------
// Engine is running


package JavaNestedClass;

class Car1 {
    public void startEngine() {
        class Engine {
            public void run() {
                System.out.println("Engine is running -----");
            }
        }
        Engine engine = new Engine();
        engine.run();
    }
}

public class JavaNestedClasses3 {
    public static void main(String[] args) {
        Car1 car = new Car1();
        car.startEngine();
    }
}

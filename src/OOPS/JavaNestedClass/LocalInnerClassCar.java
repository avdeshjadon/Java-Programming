// Local Inner Class - Car Engine
//
// Problem: Write a Java program to demonstrate a local inner class.
// Create an outer class Car with a method startEngine().
// Inside this method, define a local class Engine that has a method:
//     - run() to print "Engine is running".
//
// The startEngine() method should create an instance of the local class
// and call the run() method.
//
// Sample Output:
// Engine is running

package OOPS.JavaNestedClass;

class Car1 {
    public void startEngine() {
        class Engine {
            public void run() {
                System.out.println("Engine is running");
            }
        }
        Engine avdeshEngine = new Engine();
        avdeshEngine.run();
    }
}

public class LocalInnerClassCar {
    public static void main(String[] args) {
        Car1 amanCar = new Car1();
        amanCar.startEngine();
    }
}
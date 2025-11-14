// ------------------- 🔹 Member Inner Class 🔹 -------------------
//
// 💡 Write a Java program to demonstrate a **member inner class**.
// Create an outer class `Computer` with an inner class `Processor`. The inner class should have a method:
//     - `displayDetails()` to print processor information.
//
// The outer class should include a method `processorDetails()` which creates an instance of the inner class
// and calls the `displayDetails()` method.
//
// ------------------- 🧾 SAMPLE OUTPUT -------------------
// Processor Brand : intel
// Processor Speed : 3.6 GHz


package OOPS.JavaNestedClass;

class Computer {
    public class Processor {
        public void displayDetails() {
            System.out.println("Processor Brand : intel");
            System.out.println("Processor Speed : 3.6 GHz");
        }
    }

    public void processorDetails() {
        Processor processor = new Processor();
        processor.displayDetails();
    }
}

public class JavaNestedClasses1 {


    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.processorDetails();
    }
}

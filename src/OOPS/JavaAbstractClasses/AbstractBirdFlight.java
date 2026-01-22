// Abstract Class - Bird Flight
//
// Problem: Write a Java program to create an abstract class Bird with two abstract methods:
//     - fly()
//     - makeSound()
//
// Then create two subclasses that extend Bird:
//   Eagle - soars high and screeches
//   Hawk  - glides swiftly and chirps
//
// Sample Output:
// Eagle soars high and screeches
// Hawk glides swiftly and chirps

package OOPS.JavaAbstractClasses;

abstract class Bird {

    public void display() {
        fly();
        makeSound();
    }

    public abstract void fly();

    public abstract void makeSound();
}

class Eagle extends Bird {
    @Override
    public void fly() {
        System.out.print("Eagle soars high and ");
    }

    @Override
    public void makeSound() {
        System.out.println("screeches");
    }
}

class Hawk extends Bird {
    @Override
    public void fly() {
        System.out.print("Hawk glides swiftly and ");
    }

    @Override
    public void makeSound() {
        System.out.println("chirps");
    }
}

public class AbstractBirdFlight {
    public static void main(String[] args) {
        Bird avdeshEagle = new Eagle();
        Bird amanHawk = new Hawk();
        avdeshEagle.display();
        amanHawk.display();
    }
}
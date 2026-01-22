// Interface and Implementation - Animal Dog
//
// Problem: Write a Java program to create an interface called Animal with a method:
//     - bark()
//
// Then create a class called Dog that implements the Animal interface and
// overrides the bark() method to display a barking message.
//
// Sample Output:
// Dog is barking

package OOPS.JavaInterface;

interface Animal {
    void bark();
}

class Dog implements Animal {
    @Override
    public void bark() {
        System.out.println("Dog is barking");
    }
}

public class InterfaceAnimalDog {
    public static void main(String[] args) {
        Dog avdeshDog = new Dog();
        avdeshDog.bark();
    }
}
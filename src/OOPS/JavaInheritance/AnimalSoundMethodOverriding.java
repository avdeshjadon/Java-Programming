// Animal Sound Method Overriding
//
// Problem: Write a Java program to create a class called Animal with a method called:
//     - makeSound()
//
// Then create a subclass called Cat that overrides the makeSound() method
// to print a cat-specific message.
//
// Sample Output:
// Cat makes a meowing sound

package OOPS.JavaInheritance;

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat makes a meowing sound");
    }
}

public class AnimalSoundMethodOverriding {
    public static void main(String[] args) {
        Cat avdeshCat = new Cat();
        avdeshCat.makeSound();
    }
}
// Abstract Class and Method - Animal Sounds
//
// Problem: Write a Java program to create an abstract class Animal with an abstract
// method sound(). Then, create subclasses Lion and Tiger that extend Animal
// and implement the sound() method with their own unique animal sounds.
//
// Approach: Use runtime polymorphism by calling sound() through the Animal reference.
//
// Sample Output:
// Lion roars
// Tiger growls

package OOPS.JavaAbstractClasses;

abstract class Animal {
    public abstract void sound();
}

class Lion extends Animal {
    @Override
    public void sound() {
        System.out.println("Lion roars");
    }
}

class Tiger extends Animal {
    @Override
    public void sound() {
        System.out.println("Tiger growls");
    }
}

public class AbstractAnimalSounds {
    public static void main(String[] args) {
        Animal lion = new Lion();
        lion.sound();

        Animal tiger = new Tiger();
        tiger.sound();
    }
}
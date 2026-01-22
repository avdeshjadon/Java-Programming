// Anonymous Inner Class - Animal Sound
//
// Problem: Write a Java program to demonstrate an anonymous inner class.
// Create an abstract class Animal with an abstract method makeSound().
//
// In the main() method, instantiate Animal using an anonymous inner class
// that overrides makeSound() to print "meow".
//
// Sample Output:
// meow

package OOPS.JavaNestedClass;

abstract class Animal {
    abstract void makeSound();
}

public class AnonymousInnerClassAnimal {
    public static void main(String[] args) {
        Animal avdeshCat = new Animal() {
            void makeSound() {
                System.out.println("meow");
            }
        };
        avdeshCat.makeSound();
    }
}
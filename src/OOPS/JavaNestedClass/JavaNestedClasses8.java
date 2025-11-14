// ------------------- 🔹Anonymous Inner Class -------------------
//
// 💡 Write a Java program to demonstrate an **anonymous inner class**.
// Create an abstract class `Animal` with an abstract method `makeSound()`.
//
// In the `main()` method, instantiate `Animal` using an anonymous inner class
// that overrides `makeSound()` to print `"meow"`.
//
// ------------------- 🧾 SAMPLE OUTPUT -------------------
// meow



package JavaNestedClass;

abstract class Animal {
    abstract void makeSound();
}
public class JavaNestedClasses8 {
    public static void main(String[] args) {
        Animal cat = new Animal() {
            void makeSound() {
                System.out.println("meow");
            }
        };
        cat.makeSound();
    }
}

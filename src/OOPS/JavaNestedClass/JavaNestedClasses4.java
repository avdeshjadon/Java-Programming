// ------------------- 🔹Anonymous Inner Class -------------------
//
// 💡 Write a Java program to demonstrate an **anonymous inner class**.
// Create an interface `Greeting` with a method `sayHello()`.
// In the `main` method, create an instance of `Greeting` using an **anonymous inner class**
// that overrides the `sayHello()` method to print "Hello, World!".
//
// ------------------- 🧾 SAMPLE OUTPUT -------------------
// Hello, World!


package OOPS.JavaNestedClass;

interface Greeting {
    void sayHello();
}

public class JavaNestedClasses4 {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            public void sayHello() {
                System.out.println("Hello, World!");
            }
        };
        greeting.sayHello();
    }
}

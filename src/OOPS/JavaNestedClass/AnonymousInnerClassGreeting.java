// Anonymous Inner Class - Greeting Interface
//
// Problem: Write a Java program to demonstrate an anonymous inner class.
// Create an interface Greeting with a method sayHello().
// In the main method, create an instance of Greeting using an anonymous inner class
// that overrides the sayHello() method to print "Hello, World!".
//
// Sample Output:
// Hello, World!

package OOPS.JavaNestedClass;

interface Greeting {
    void sayHello();
}

public class AnonymousInnerClassGreeting {
    public static void main(String[] args) {
        Greeting avdeshGreeting = new Greeting() {
            public void sayHello() {
                System.out.println("Hello, World!");
            }
        };
        avdeshGreeting.sayHello();
    }
}
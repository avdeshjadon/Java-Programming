// Abstract Class - Person Lifestyle
//
// Problem: Write a Java program to create an abstract class Person with two abstract methods:
//     - eat()
//     - exercise()
//
// Then create two subclasses that extend Person:
//   Athlete     - eats healthy and exercises daily
//   LazyPerson  - eats junk food and rarely exercises
//
// Sample Output:
// Athlete eats healthy and exercises daily
// LazyPerson eats junk food and rarely exercises

package OOPS.JavaAbstractClasses;

abstract class Person {
    public void display() {
        eat();
        exercise();
    }

    public abstract void eat();

    public abstract void exercise();
}

class Athlete extends Person {
    @Override
    public void eat() {
        System.out.print("Athlete eats healthy and ");
    }

    @Override
    public void exercise() {
        System.out.println("exercises daily");
    }
}

class LazyPerson extends Person {
    @Override
    public void eat() {
        System.out.print("LazyPerson eats junk food and ");
    }

    @Override
    public void exercise() {
        System.out.println("rarely exercises");
    }
}

public class AbstractPersonLifestyle {
    public static void main(String[] args) {
        Person avdeshAthlete = new Athlete();
        Person amanLazyPerson = new LazyPerson();

        avdeshAthlete.display();
        amanLazyPerson.display();
    }
}
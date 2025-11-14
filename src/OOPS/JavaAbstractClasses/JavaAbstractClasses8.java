// ------------------- 🔹 8. Abstract Class - Person 🔹 -------------------
//
// 💡 Write a Java program to create an abstract class `Person` with two abstract methods:
//     - `eat()`
//     - `exercise()`
//
// Then create two subclasses that extend `Person`:
//   ➤ `Athlete`     - eats healthy and exercises daily
//   ➤ `LazyPerson`  - eats junk food and rarely exercises
//
// ------------------- 🧾 SAMPLE OUTPUT -------------------
// Athlete eats healthy and exercises daily
// LazyPerson eats junk food and rarely exercises

package JavaAbstractClasses;

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

public class JavaAbstractClasses8 {
    public static void main(String[] args) {
        Person athlete = new Athlete();
        Person lazyPerson = new LazyPerson();

        athlete.display();
        lazyPerson.display();
    }
}

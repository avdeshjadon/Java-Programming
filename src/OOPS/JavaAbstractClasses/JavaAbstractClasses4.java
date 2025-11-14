// ------------------- 🔹 4. Abstract Class - Animal with Multiple Methods 🔹 -------------------
//
// 💡 Write a Java program to create an abstract class `Animal` with two abstract methods:
//     - `eat()`
//     - `sleep()`
//
// Then create three subclasses that extend `Animal`:
//   ➤ `Lion`  - eats meat, sleeps 8 hours
//   ➤ `Tiger` - eats meat, sleeps 10 hours
//   ➤ `Deer`  - eats plants, sleeps 6 hours
//
// ------------------- 🧾 SAMPLE OUTPUT -------------------
// Lion eats meat and sleeps 8 hours
// Tiger eats meat and sleeps 10 hours
// Deer eats plants and sleeps 6 hours


package JavaAbstractClasses;

abstract class Animal1 {
    public abstract void eat();

    public abstract void sleep();

    public void display() {
        eat();
        sleep();
    }
}

class Lion1 extends Animal1 {
    @Override
    public void eat() {
        System.out.print("Lion eats meat");
    }

    @Override
    public void sleep() {
        System.out.println(" and sleep for 8 hours");
    }
}

class Tiger1 extends Animal1 {
    @Override
    public void eat() {
        System.out.print("Tiger eats meat and ");
    }

    @Override
    public void sleep() {
        System.out.println("sleep for 10 hours");
    }
}

class Deer extends Animal1 {
    @Override
    public void eat() {
        System.out.print("Deer eats plants and ");
    }

    @Override
    public void sleep() {
        System.out.println("sleeps for 6 hours");
    }
}

public class JavaAbstractClasses4 {
    public static void main(String[] args) {
        Animal1 lion1 = new Lion1();
        Animal1 tiger1 = new Tiger1();
        Animal1 deer = new Deer();

        lion1.display();
        tiger1.display();
        deer.display();
    }
}

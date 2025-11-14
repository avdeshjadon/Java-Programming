// ------------------- 🔹 11. Abstract Class - Bird 🔹 -------------------
//
// 💡 Write a Java program to create an abstract class `Bird` with two abstract methods:
//     - `fly()`
//     - `makeSound()`
//
// Then create two subclasses that extend `Bird`:
//   ➤ `Eagle` - soars high and screeches
//   ➤ `Hawk`  - glides swiftly and chirps
//
// ------------------- 🧾 SAMPLE OUTPUT -------------------
// Eagle soars high and screeches
// Hawk glides swiftly and chirps


package OOPS.JavaAbstractClasses;

abstract class Bird {

    public void display() {
        fly();
        makeSound();
    }

    public abstract void fly();

    public abstract void makeSound();
}

class Eagle extends Bird {
    @Override
    public void fly() {
        System.out.print("Eagle soars high and ");
    }

    @Override
    public void makeSound() {
        System.out.println("screeches");
    }
}

class Hawk extends Bird {
    @Override
    public void fly() {
        System.out.print("Eagle glides swiftly and ");
    }

    @Override
    public void makeSound() {
        System.out.println("chirps");
    }
}

public class JavaAbstractClasses11 {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird hawk = new Hawk();
        eagle.display();
        hawk.display();
    }
}

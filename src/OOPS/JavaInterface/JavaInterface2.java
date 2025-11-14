// ------------------- 🔹Interface and Implementation 🔹 -------------------
//
// 💡 Write a Java program to create an interface called `Animal` with a method:
//     - `bark()`
//
// Then create a class called `Dog` that implements the `Animal` interface and
// overrides the `bark()` method to display a barking message.
//
// ------------------- 🧾 SAMPLE OUTPUT -------------------
// Dog is barking


package JavaInterface;
interface Animal {
    void bark();
}
class Dog implements Animal {
    @Override
    public void bark() {
        System.out.println("Dog is barking");
    }
}
public class JavaInterface2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
    }
}


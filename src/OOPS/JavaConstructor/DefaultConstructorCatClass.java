// ------------------- 🔹 Default Constructor - Cat Class 🔹 -------------------
//
// 💡 Write a Java program that demonstrates the use of a **default constructor** in a class.
// The program defines a `Cat` class with two private fields: `name` and `age`.
// The default constructor initializes the name to `"Unknown"` and age to `0`.
//
// 🧠 The program then creates a `Cat` object and prints its name and age using getter methods.
//
// ------------------- 🧾 SAMPLE OUTPUT -------------------
// Cat Name : Unknown
// Cat Age : 0


package OOPS.JavaConstructor;

class Cat {
    private String name;
    private int age;

    public Cat() {
        this.name = "Unknown";
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class DefaultConstructorCatClass {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        System.out.println("Cat Name : " + myCat.getName());
        System.out.println("Cat Age : " + myCat.getAge());

    }
}

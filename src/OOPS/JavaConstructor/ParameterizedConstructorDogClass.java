// ------------------- 🔹 Parameterized Constructor - Dog Class 🔹 -------------------
//
// 💡 Write a Java program to demonstrate the use of a **parameterized constructor**.
// The program defines a `Dog` class with two private fields: `name` and `colour`.
// The constructor takes two parameters to initialize these fields.
//
// 🧠 The program creates a `Dog` object with specific values and displays them using getter methods.
//
// ------------------- 🧾 SAMPLE OUTPUT -------------------
// Dog Name: Sheru
// Dog Colour: Kala


package JavaConstructor;

class Dog {
    private String name;
    private String colour;

    public Dog(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

}

public class ParameterizedConstructorDogClass {


    public static void main(String[] args) {
        Dog myDog = new Dog("Sheru", "Kala");
        System.out.println("Dog Name: " + myDog.getName());
        System.out.println("Dog Colour: " + myDog.getColour());


    }
}

// ------------------- 🔹 6. Method Overriding 🔹 -------------------
//
// 💡 Write a Java program to create a class called `Animal1` with a method:
//     - `move()`
//
// Then create a subclass called `Cheetah` that:
//   ✅ Overrides the `move()` method to describe how a cheetah moves
//
// ------------------- 🧾 SAMPLE OUTPUT -------------------
// I am Running


package OOPS.JavaInheritance;
class Animal1{
    void move(){
        System.out.println("I am moving");
    }
}
class Cheetah extends Animal1{
    @Override
    void move() {
        System.out.println("I am Running");
    }
}
public class MethodOverriding4 {
    public static void main(String[] args) {
        Cheetah cheetah=new Cheetah();
        cheetah.move();
    }
}

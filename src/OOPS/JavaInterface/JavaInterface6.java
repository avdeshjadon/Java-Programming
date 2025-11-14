// ------------------- 🔹Drawable Interface -------------------
//
// 💡 Write a Java program to create an interface called `Drawable` with a method:
//     - `draw()`
//
// Then implement this interface in three classes: `Circle1`, `Rectangle2`, and `Triangle1`.
// Each class should override the `draw()` method to display a shape-specific message.
//
// ------------------- 🧾 SAMPLE OUTPUT -------------------
// Drawing Circle
// Drawing Rectangle
// Drawing Triangle

package OOPS.JavaInterface;
interface Drawable {
    void draw();
}
class Circle1 implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
class Rectangle2 implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}
class Triangle1 implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }
}
public class JavaInterface6 {
    public static void main(String[] args) {
        Circle1 circle1 = new Circle1();
        Rectangle2 rectangle2 = new Rectangle2();
        Triangle1 triangle1 = new Triangle1();
        circle1.draw();
        rectangle2.draw();
        triangle1.draw();
    }
}

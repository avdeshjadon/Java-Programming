// Drawable Interface
//
// Problem: Write a Java program to create an interface called Drawable with a method:
//     - draw()
//
// Then implement this interface in three classes: Circle1, Rectangle2, and Triangle1.
// Each class should override the draw() method to display a shape-specific message.
//
// Sample Output:
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

public class InterfaceDrawable {
    public static void main(String[] args) {
        Circle1 avdeshCircle = new Circle1();
        Rectangle2 amanRectangle = new Rectangle2();
        Triangle1 aviTriangle = new Triangle1();
        
        avdeshCircle.draw();
        amanRectangle.draw();
        aviTriangle.draw();
    }
}
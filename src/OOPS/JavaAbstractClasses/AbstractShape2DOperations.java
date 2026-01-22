// Abstract Class - Shape2D Operations
//
// Problem: Write a Java program to create an abstract class Shape2D with two abstract methods:
//     - draw()
//     - resize()
//
// Then create two subclasses that extend Shape2D:
//   Rectangle - prints: Rectangle drawn and resized
//   Circle1    - prints: Circle drawn and resized
//
// Sample Output:
// Rectangle drawn and resized
// Circle drawn and resized

package OOPS.JavaAbstractClasses;

abstract class Shape2D {

    public void display() {
        draw();
        resize();
    }

    public abstract void draw();

    public abstract void resize();
}

class Rectangle extends Shape2D {
    @Override
    public void draw() {
        System.out.print("Rectangle drawn and ");
    }

    @Override
    public void resize() {
        System.out.println("resized");
    }
}

class Circle1 extends Shape2D {
    @Override
    public void draw() {
        System.out.print("Circle drawn and ");
    }

    @Override
    public void resize() {
        System.out.println("resized");
    }
}

public class AbstractShape2DOperations {
    public static void main(String[] args) {
        Shape2D avdeshRectangle = new Rectangle();
        Shape2D amanCircle = new Circle1();
        avdeshRectangle.display();
        amanCircle.display();
    }
}
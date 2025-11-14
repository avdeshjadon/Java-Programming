// ------------------- 🔹Interface with Multiple Implementations 🔹 -------------------
//
// 💡 Write a Java program to create an interface named as `Shape` with a method:
//     - `getArea()`
//
// Add a default method:
//     - `display()` that prints the area of the shape
//
// Then create the following classes that implement the `Shape` interface:
//     ✅ `Rectangle` with `length` and `breadth`
//     ✅ `Circle` with `radius`
//     ✅ `Triangle` with `base` and `height`
//
// ------------------- 🧾 SAMPLE OUTPUT -------------------
// Area of Rectangle : 200.0
// Area of Circle : 78.5
// Area of Triangle : 5.0



package OOPS.JavaInterface;

interface Shape {
    double getArea();

    default void display() {
        System.out.println("Area of " + getClass().getSimpleName() + " : " + getArea());
    }
}

class Rectangle implements Shape {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double getArea() {
        return length * breadth;
    }
}

class Circle implements Shape {
    int rad;

    Circle(int rad) {
        this.rad = rad;
    }

    @Override
    public double getArea() {
        return 3.14 * rad * rad;
    }
}

class Triangle implements Shape {
    int base;
    int height;

    Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}

public class JavaInterface1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(2, 5);
        rectangle.display();
        circle.display();
        triangle.display();
    }
}

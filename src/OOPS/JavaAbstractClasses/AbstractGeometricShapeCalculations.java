// Abstract Class - Geometric Shape Calculations
//
// Problem: Write a Java program to create an abstract class GeometricShape with two abstract methods:
//     - area()
//     - perimeter()
//
// Then create two subclasses that extend GeometricShape:
//   Triangle1 - calculates area using Heron's formula and sums sides for perimeter
//   Square   - area = side × side, perimeter = 4 × side
//
// Sample Output:
// Triangle Area: 15.59
// Triangle Perimeter: 18
// Square Area: 25
// Square Perimeter: 20

package OOPS.JavaAbstractClasses;

abstract class GeometricShape {
    public void display() {
        area();
        perimeter();
    }

    public abstract void area();
    public abstract void perimeter();
}

class Square extends GeometricShape {
    int side;

    Square(int side) {
        this.side = side;
    }

    @Override
    public void area() {
        int area = side * side;
        System.out.println("Square Area: " + area);
    }

    @Override
    public void perimeter() {
        int perimeter = 4 * side;
        System.out.println("Square Perimeter: " + perimeter);
    }
}

class Triangle1 extends GeometricShape {
    int a, b, c;

    Triangle1(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void area() {
        double s = (a + b + c) / 2.0;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Triangle Area: " + String.format("%.2f", area));
    }

    @Override
    public void perimeter() {
        int perimeter = a + b + c;
        System.out.println("Triangle Perimeter: " + perimeter);
    }
}

public class AbstractGeometricShapeCalculations {
    public static void main(String[] args) {
        GeometricShape avdeshTriangle = new Triangle1(6, 6, 6);
        GeometricShape amanSquare = new Square(5);
        avdeshTriangle.display();
        amanSquare.display();
    }
}
// Shape Rectangle Area Calculation
//
// Problem: Write a Java program to create a class called Shape with a method:
//     - getArea()
//
// Then create a subclass called Rectangle that overrides the getArea()
// method to calculate the area of a rectangle.
//
// Sample Output:
// Area of Rectangle: 799.19

package OOPS.JavaInheritance;

class Shape {
    double getArea() {
        return 0.0;
    }
}

class Rectangle extends Shape {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double getArea() {
        return length * breadth;
    }
}

public class ShapeRectangleAreaCalculation {
    public static void main(String[] args) {
        Rectangle avdeshRectangle = new Rectangle(23.3, 34.3);
        double area = avdeshRectangle.getArea();
        System.out.println("Area of Rectangle: " + String.format("%.2f", area));
    }
}
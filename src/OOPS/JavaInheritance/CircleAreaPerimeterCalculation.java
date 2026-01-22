// Circle Area and Perimeter Calculation
//
// Problem: Write a Java program to create a class called Shape1 with methods:
//     - getArea()
//     - getPerimeter()
//
// Then create a subclass called Circle that:
//   Overrides both getArea() and getPerimeter() methods
//   Calculates the actual area and perimeter of the circle using radius
//
// Sample Output:
// Area
// Perimeter
// Area of circle: 314.00
// Perimeter of circle: 62.80

package OOPS.JavaInheritance;

class Shape1 {
    private final double PI = 3.14;
    private double radius;

    Shape1(double radius) {
        this.radius = radius;
    }

    void getPerimeter() {
        System.out.println("Perimeter");
    }

    void getArea() {
        System.out.println("Area");
    }

    double getPI() {
        return PI;
    }

    double getRadius() {
        return radius;
    }
}

class Circle extends Shape1 {

    Circle(double radius) {
        super(radius);
    }

    @Override
    void getArea() {
        double area = getPI() * getRadius() * getRadius();
        System.out.println("Area of circle: " + String.format("%.2f", area));
    }

    @Override
    void getPerimeter() {
        double perimeter = 2 * getPI() * getRadius();
        System.out.println("Perimeter of circle: " + String.format("%.2f", perimeter));
    }
}

public class CircleAreaPerimeterCalculation {
    public static void main(String[] args) {
        Shape1 avdeshShape = new Shape1(20);
        avdeshShape.getArea();
        avdeshShape.getPerimeter();

        Circle amanCircle = new Circle(10);
        amanCircle.getArea();
        amanCircle.getPerimeter();
    }
}
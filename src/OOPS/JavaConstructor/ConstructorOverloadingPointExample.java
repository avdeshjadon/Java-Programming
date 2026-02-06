// Constructor Overloading - Point Class Example
//
// Problem: Write a Java program to demonstrate constructor overloading using different parameter types.
// The Point class includes:
//   - One constructor that accepts int x and int y
//   - Another that accepts double x and double y and converts them to integers
//
// Approach: The program creates two points:
//   1. One using integer coordinates
//   2. One using decimal coordinates (which are typecasted to integers)
//
// Sample Output:
// Point(X,Y): (5, 7)
// Point(X,Y): (2, 3)

package OOPS.JavaConstructor;

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(double x, double y) {
        this.x = (int) x;  //typecasting double to int
        this.y = (int) y;  //typecasting double to int
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void display() {
        System.out.println("Point(X,Y): (" + getX() + ", " + getY() + ")");
    }
}

public class ConstructorOverloadingPointExample {
    public static void main(String[] args) {
        Point avdeshPoint = new Point(5, 7);
        avdeshPoint.display();
        Point amanPoint = new Point(2.23, 3.43);
        amanPoint.display();
    }
}
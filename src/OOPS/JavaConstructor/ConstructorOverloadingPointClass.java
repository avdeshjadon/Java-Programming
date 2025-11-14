// ------------------- 🔹 Constructor Overloading - Point Class 🔹 -------------------
//
// 💡 Write a Java program to demonstrate **constructor overloading** using different parameter types.
// The `Point` class includes:
//   - One constructor that accepts `int x` and `int y`
//   - Another that accepts `double x` and `double y` and converts them to integers
//
// 🧠 The program creates two points:
//   1. One using integer coordinates
//   2. One using decimal coordinates (which are typecasted to integers)
//
// ------------------- 🧾 SAMPLE OUTPUT -------------------
// Point(X,Y) : (5, 7)
// Point(X,Y) : (2, 3)


package JavaConstructor;

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(double x, double y) {
        this.x = (int) x;
        this.y = (int) y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void display() {
        System.out.println("Point(X,Y) : (" + getX() + ", " + getY() + ")");
    }
}

public class ConstructorOverloadingPointClass {


    public static void main(String[] args) {
        Point myPoint1 = new Point(5, 7);
        myPoint1.display();
        Point myPoint2 = new Point(2.23, 3.43);
        myPoint2.display();
    }
}

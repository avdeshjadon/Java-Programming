// ------------------- 🔹 6. Abstract Class - Shape3D 🔹 -------------------
//
// 💡 Write a Java program to create an abstract class `Shape3D` with two abstract methods:
//     - `calculateVolume()`
//     - `calculateSurfaceArea()`
//
// Then create two subclasses that extend `Shape3D`:
//   ➤ `Sphere` - use radius to calculate volume and surface area
//   ➤ `Cube`   - use side length to calculate volume and surface area
//
// 📐 Use π ≈ 3.14
//
// ------------------- 🧾 SAMPLE OUTPUT -------------------
// Sphere Volume: 7234.56
// Sphere Surface Area: 1808.64
// Cube Volume: 343.0
// Cube Surface Area: 294.0

package JavaAbstractClasses;

abstract class Shape3D {
    final double PI = 3.14;

    public abstract void calculateVolume();
    public abstract void calculateSurfaceArea();

    public void display() {
        calculateVolume();
        calculateSurfaceArea();
    }
}

class Sphere extends Shape3D {
    private double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateVolume() {
        double volume = (4.0 / 3.0) * PI * radius * radius * radius;
        System.out.println("Sphere Volume: " + String.format("%.2f", volume));
    }

    @Override
    public void calculateSurfaceArea() {
        double surfaceArea = 4 * PI * radius * radius;
        System.out.println("Sphere Surface Area: " + String.format("%.2f", surfaceArea));
    }
}

class Cube extends Shape3D {
    private double side;

    Cube(double side) {
        this.side = side;
    }

    @Override
    public void calculateVolume() {
        double volume = side * side * side;
        System.out.println("Cube Volume: " + String.format("%.2f", volume));
    }

    @Override
    public void calculateSurfaceArea() {
        double surfaceArea = 6 * side * side;
        System.out.println("Cube Surface Area: " + String.format("%.2f", surfaceArea));
    }
}

public class JavaAbstractClasses6 {
    public static void main(String[] args) {
        Shape3D sphere = new Sphere(12);
        Shape3D cube = new Cube(7);

        sphere.display();
        cube.display();
    }
}

// ------------------- 🔹Static Initialization with Logic -------------------
//
// 💡 Write a Java program to demonstrate static block initialization with logic.
//
// Create a class `ComplexInitializer` with static variables `x`, `y`, and `z`.
// Use a static block to initialize `x` and `y` with values, and compute `z` using a private static method `calculateZ(int a, int b)`.
//
// Provide static getter methods `getX()`, `getY()`, and `getZ()` to access the values.
//
// In the main method, print all the values to verify initialization.
//
// ------------------- 🧾 SAMPLE OUTPUT -------------------
// Value of x: 10
// Value of y: 20
// Value of z: 210


package OOPS.JavaStaticMembers;

class ComplexInitializer {
    private static int x;
    private static int y;
    private static int z;

    static {
        x = 10;
        y = 20;
        z = calculateZ(x, y);
    }

    private static int calculateZ(int a, int b) {
        return a * b + (a - b);
    }

    public static int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }

    public static int getZ() {
        return z;
    }
}

public class JavaStaticMember7 {


    public static void main(String[] args) {
        System.out.println("Value of x: " + ComplexInitializer.getX());
        System.out.println("Value of y: " + ComplexInitializer.getY());
        System.out.println("Value of z: " + ComplexInitializer.getZ());
    }
}

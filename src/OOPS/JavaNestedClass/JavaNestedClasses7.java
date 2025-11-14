// ------------------- 🔹Local Inner Class -------------------
//
// 💡 Write a Java program to demonstrate a **local inner class** inside a method.
// Create a class `House` with a method `calculateArea()`.
// Inside this method, define a local inner class `Room` with a method `getArea()`
// that returns the product of `length` and `breadth`.
//
// Instantiate the local class inside the method and print the area.
//
// ------------------- 🧾 SAMPLE OUTPUT -------------------
// Area : 240.31


package JavaNestedClass;

class House {
    public void calculateArea() {
        final double length = 34.33;
        final double breadth = 7.00;
        class Room {
            public double getArea() {
                return length * breadth;
            }
        }
        Room room = new Room();
        double area = room.getArea();
        System.out.println("Area : " + area);
    }
}

public class JavaNestedClasses7 {
    public static void main(String[] args) {
        House house = new House();
        house.calculateArea();
    }
}

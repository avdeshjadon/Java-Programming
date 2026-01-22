// Local Inner Class - House Room Area
//
// Problem: Write a Java program to demonstrate a local inner class inside a method.
// Create a class House with a method calculateArea().
// Inside this method, define a local inner class Room with a method getArea()
// that returns the product of length and breadth.
//
// Instantiate the local class inside the method and print the area.
//
// Sample Output:
// Area: 240.31

package OOPS.JavaNestedClass;

class House {
    public void calculateArea() {
        final double length = 34.33;
        final double breadth = 7.00;
        
        class Room {
            public double getArea() {
                return length * breadth;
            }
        }
        
        Room avdeshRoom = new Room();
        double area = avdeshRoom.getArea();
        System.out.println("Area: " + area);
    }
}

public class LocalInnerClassHouse {
    public static void main(String[] args) {
        House amanHouse = new House();
        amanHouse.calculateArea();
    }
}
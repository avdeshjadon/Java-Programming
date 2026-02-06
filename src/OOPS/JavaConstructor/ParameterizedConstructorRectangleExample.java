// Parameterized Constructor - Rectangle Class Example
//
// Problem: Write a Java program that uses a parameterized constructor to initialize the dimensions of a rectangle.
// The class Rectangle has two private fields: length and width.
// The constructor takes both values as parameters and stores them in the fields.
//
// Approach: The program then creates a Rectangle object with specific values and prints the length and width.
//
// Sample Output:
// Length: 5
// Width: 6

package OOPS.JavaConstructor;

class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth(){
        return width;
    }
}

public class ParameterizedConstructorRectangleExample {
    public static void main(String[] args) {
        Rectangle avdeshRectangle = new Rectangle(5, 6);
        System.out.println("Length: " + avdeshRectangle.getLength());
        System.out.println("Width: " + avdeshRectangle.getWidth());
    }
}
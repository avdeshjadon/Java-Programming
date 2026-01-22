// Resizable Interface
//
// Problem: Write a Java program to create an interface called Resizable with methods:
//     - resizeWidth(int width)
//     - resizeHeight(int height)
//
// Then create a class Rectangle1 that implements Resizable and updates its width
// and height accordingly. Include a method to display the new dimensions.
//
// Sample Output:
// Original Height: 100 Original Width: 200
// Resized Height: 30 Resized Width: 20

package OOPS.JavaInterface;

interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

class Rectangle1 implements Resizable {
    private int height;
    private int width;

    public Rectangle1(int height, int width) {
        this.height = height;
        this.width = width;
    }
    
    @Override
    public void resizeHeight(int height) {
        this.height = height;
    }
    
    @Override
    public void resizeWidth(int width) {
        this.width = width;
    }
    
    public void displayOriginal() {
        System.out.println("Original Height: " + height + " Original Width: " + width);
    }
    
    public void displayResized() {
        System.out.println("Resized Height: " + height + " Resized Width: " + width);
    }
}

public class InterfaceResizable {
    public static void main(String[] args) {
        Rectangle1 avdeshRectangle = new Rectangle1(100, 200);
        avdeshRectangle.displayOriginal();
        avdeshRectangle.resizeHeight(30);
        avdeshRectangle.resizeWidth(20);
        avdeshRectangle.displayResized();
    }
}
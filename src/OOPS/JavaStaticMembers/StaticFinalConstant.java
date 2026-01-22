// Static Final Variable (Constant)
//
// Problem: Write a Java program that demonstrates the use of a static final variable (constant) in a utility class.
// Create a class Constants with a static final variable PI. Also define a static method calculateArea(double radius)
// that returns the area of a circle using the constant PI.
//
// In the main method, prompt the user to enter a radius and display the computed area.
//
// Sample Output:
// Enter the Radius: 5
// Area: 78.53975

package OOPS.JavaStaticMembers;

import java.util.Scanner;

class Constants {
    public static final double PI = 3.14159;

    public static double calculateArea(double radius) {
        double area;
        area = PI * radius * radius;
        return area;
    }
}

public class StaticFinalConstant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius: ");
        double radius = sc.nextDouble();
        double area = Constants.calculateArea(radius);
        System.out.println("Area: " + area);
    }
}
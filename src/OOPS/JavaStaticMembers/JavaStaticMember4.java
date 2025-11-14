// ------------------- 🔹Static Final Variable -------------------
//
// 💡 Write a Java program that demonstrates the use of a **static final variable** (constant) in a utility class.
// Create a class `Constants` with a static final variable `PI`. Also define a static method `calculateArea(double radius)`
// that returns the area of a circle using the constant `PI`.
//
// In the main method, prompt the user to enter a radius and display the computed area.
//
// ------------------- 🧾 SAMPLE OUTPUT -------------------
// Enter the Radius : 5
// Area : 78.53975


package OOPS.JavaStaticMembers;

import java.util.Scanner;

class Constants {
    public static final double PI = 3.14159;

    public static double calculateArea(double rad) {
        double ans;
        ans = PI * rad * rad;
        return ans;

    }
}

public class JavaStaticMember4 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius : ");
        double rad = sc.nextDouble();
        double area = Constants.calculateArea(rad);
        System.out.println("Area : " + area);
    }
}

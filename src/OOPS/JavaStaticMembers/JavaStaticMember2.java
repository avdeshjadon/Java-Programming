// ------------------- 🔹Static Method Example -------------------
//
// 💡 Write a Java program to demonstrate the use of a **static method**.
// Create a class `MathUtility` with a static method `add(int a, int b)` that returns the sum of two integers.
//
// In the `main` method, call this static method directly using the class name and print the result.
//
// ------------------- 🧾 SAMPLE OUTPUT -------------------
// The sum of two numbers is  : 9


package JavaStaticMembers;

class MathUtility {
    public static int add(int a, int b) {
        return a + b;
    }
}

public class JavaStaticMember2 {

    public static void main(String[] args) {
        int sum = MathUtility.add(4, 5);
        System.out.println("the sum of two numbers is  : " + sum);

    }

}

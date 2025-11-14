// ------------------- 🔹Static Nested Class -------------------
//
// 💡 Write a Java program to demonstrate a **static nested class**.
// Create an outer class `MathUtil` with a static nested class `Calculator`.
// The `Calculator` class should have a method `add(int a, int b)` that returns the sum of two numbers.
//
// In the `main` method, create an instance of the static nested class and use it to perform addition.
//
// ------------------- 🧾 SAMPLE OUTPUT -------------------
// Sum is  : 11


package JavaNestedClass;

class MathUtil {
    public static class Calculator {
        public int add(int a, int b) {
            return a + b;
        }
    }
}

public class JavaNestedClasses6 {
    public static void main(String[] args) {
        MathUtil mathUtil = new MathUtil();
        MathUtil.Calculator calculator = new MathUtil.Calculator();
        System.out.println("Sum is  : " + calculator.add(5, 6));
    }
}

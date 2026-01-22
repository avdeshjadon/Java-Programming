// Static Nested Class - Math Calculator
//
// Problem: Write a Java program to demonstrate a static nested class.
// Create an outer class MathUtil with a static nested class Calculator.
// The Calculator class should have a method add(int a, int b) that returns the sum of two numbers.
//
// In the main method, create an instance of the static nested class and use it to perform addition.
//
// Sample Output:
// Sum is: 11

package OOPS.JavaNestedClass;

class MathUtil {
    public static class Calculator {
        public int add(int a, int b) {
            return a + b;
        }
    }
}

public class StaticNestedClassCalculator {
    public static void main(String[] args) {
        MathUtil.Calculator avdeshCalculator = new MathUtil.Calculator();
        System.out.println("Sum is: " + avdeshCalculator.add(5, 6));
    }
}
package PEP;

public class OperatorDemo {
    public static void main(String[] args) {
        int a = 10, b = 3;
        System.out.println("a=" + a + ", b=" + b);
        System.out.println("a+b=" + (a + b));
        System.out.println("a-b=" + (a - b));
        System.out.println("a*b=" + (a * b));
        System.out.println("a/b=" + (a / b));
        System.out.println("a%b=" + (a % b));

        System.out.println("a > b: " + (a > b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        boolean res = (a > 5) && (b < 5);
        System.out.println("(a>5) && (b<5): " + res);

        a += 5;
        System.out.println("a after a += 5: " + a);
    }
}

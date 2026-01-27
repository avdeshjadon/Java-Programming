package PEP;

public class TernaryOp {
    public static void main(String[] args) {
        int a = 10, b = 20;
        int max = (a > b) ? a : b;
        System.out.println("a=" + a + ", b=" + b + ", max=" + max);

        String parity = (a % 2 == 0) ? "even" : "odd";
        System.out.println("a is " + parity);
    }
}

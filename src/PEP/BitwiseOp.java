package PEP;

public class BitwiseOp {
    public static void main(String[] args) {
        int a = 5; // 0101
        int b = 3; // 0011
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));
    }
}

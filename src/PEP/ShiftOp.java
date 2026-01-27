package PEP;

public class ShiftOp {
    public static void main(String[] args) {
        int x = 8; // 0000_1000
        System.out.println("x = " + x);
        System.out.println("x << 2 = " + (x << 2));
        System.out.println("x >> 2 = " + (x >> 2));
        System.out.println("x >>> 1 = " + (x >>> 1));

        int n = -8;
        System.out.println("n = " + n);
        System.out.println("n >> 2 = " + (n >> 2));   // sign-preserving
        System.out.println("n >>> 2 = " + (n >>> 2)); // zero-fill
    }
}

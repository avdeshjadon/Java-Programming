package PEP;

public class aman {
    static int getFact(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
        return fact;
    }
}

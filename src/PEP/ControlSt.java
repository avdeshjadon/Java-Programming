package PEP;

public class ControlSt {
    public static void main(String[] args) {
        int x = 2;
        switch (x) {
            case 1 -> System.out.println("case 1");
            case 2 -> System.out.println("case 2");
            default -> System.out.println("default case");
        }

        for (int i = 0; i < 3; i++) System.out.println("for i=" + i);

        int j = 0;
        while (j < 2) {
            System.out.println("while j=" + j);
            j++;
        }

        int k = 0;
        do {
            System.out.println("do-while k=" + k);
            k++;
        } while (k < 1);
    }
}

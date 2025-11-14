// ------------------- 🔹Static Block Initialization -------------------
//
// 💡 Write a Java program to demonstrate the use of a **static block** for initializing static variables.
// Create a class `Initializer` with a static variable `initialValue`, and use a static block to assign it a value.
//
// The program should print messages before and after accessing the class to show when the static block is executed.
//
// ------------------- 🧾 SAMPLE OUTPUT -------------------
// Static block : initialValue initialized to : 1000
// Before creating an instance : initialValue : 1000
// After creating an instance : initialValue : 1000


package OOPS.JavaStaticMembers;

class Initializer {
    public static int initialvalue;

    static {
        initialvalue = 1000;
        System.out.println("Static block : initialValue initialized to : " + initialvalue);
    }
}

public class JavaStaticMember3 {

    public static void main(String[] args) {
        System.out.println("Before creating an instance : initialValue : " + Initializer.initialvalue);
        Initializer initializer = new Initializer();
        System.out.println("After creating an instance : initialValue : " + Initializer.initialvalue);
    }
}

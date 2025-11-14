// ------------------- 🔹Static Variable Example -------------------
//
// 💡 Write a Java program to demonstrate the use of a **static variable**.
// Create a class `Counter` with a static field `count`. Increment this field in the constructor
// each time an object is created. Add a static method `getCount()` to return the value of `count`.
//
// In the `main` method, create multiple instances of `Counter` and print the total count.
//
// ------------------- 🧾 SAMPLE OUTPUT -------------------
// Count : 3


package OOPS.JavaStaticMembers;

class Counter {
    private static int count = 0;

    public Counter() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}

public class JavaStaticMember1 {


    public static void main(String[] args) {
        Counter myCount1 = new Counter();
        Counter myCount2 = new Counter();
        Counter myCount3 = new Counter();
        System.out.println("Count : " + Counter.getCount());
    }
}

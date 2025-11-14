// ------------------- 🔹Static Block with Object Initialization -------------------
//
// 💡 Write a Java program to demonstrate how a **static block** can be used to perform
// actions during class loading, such as initializing values or creating objects.
//
// Create a class `Configuration` that has a `configValue` field. Inside a static block,
// initialize this field through an object and print a message indicating the block has executed.
//
// In the main method, instantiate the class and print the `configValue`.
//
// ------------------- 🧾 SAMPLE OUTPUT -------------------
// Static block executed: configValue initialized
// Config Value : default config value


package OOPS.JavaStaticMembers;

class configuration {
    public String configValue;

    static {
        configuration obj = new configuration();
        obj.configValue = "default config value";
        System.out.println("Static block executed: configValue initialized");
    }
}

public class JavaStaticMember5 {


    public static void main(String[] args) {
        configuration Configuration = new configuration();
        System.out.println("Config Value : " + Configuration.configValue);
    }
}

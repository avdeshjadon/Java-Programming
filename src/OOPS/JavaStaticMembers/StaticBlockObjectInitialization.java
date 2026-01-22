// Static Block with Object Initialization
//
// Problem: Write a Java program to demonstrate how a static block can be used to perform
// actions during class loading, such as initializing values or creating objects.
//
// Create a class Configuration that has a configValue field. Inside a static block,
// initialize this field through an object and print a message indicating the block has executed.
//
// In the main method, instantiate the class and print the configValue.
//
// Sample Output:
// Static block executed: configValue initialized
// Config Value: default config value

package OOPS.JavaStaticMembers;

class Configuration {
    public String configValue;

    static {
        Configuration obj = new Configuration();
        obj.configValue = "default config value";
        System.out.println("Static block executed: configValue initialized");
    }
}

public class StaticBlockObjectInitialization {
    public static void main(String[] args) {
        Configuration avdeshConfiguration = new Configuration();
        System.out.println("Config Value: " + avdeshConfiguration.configValue);
    }
}
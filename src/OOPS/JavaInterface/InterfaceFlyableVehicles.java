// Flyable Interface Implementation
//
// Problem: Write a Java program to create an interface called Flyable with:
//     - An abstract method fly_obj()
//     - A default method display() that calls fly_obj()
//
// Then create classes SpaceCraft, Airplane, and Helicopter that implement
// the Flyable interface and override the fly_obj() method to describe how each flies.
//
// Sample Output:
// Spacecraft is flying in space
// Airplane is flying in the sky
// Helicopter is hovering above ground

package OOPS.JavaInterface;

interface Flyable {
    void fly_obj();
    
    default void display() {
        fly_obj();
    }
}

class SpaceCraft implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Spacecraft is flying in space");
    }
}

class Airplane implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Airplane is flying in the sky");
    }
}

class Helicopter implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Helicopter is hovering above ground");
    }
}

public class InterfaceFlyableVehicles {
    public static void main(String[] args) {
        Flyable spacecraft = new SpaceCraft();
        Flyable airplane = new Airplane();
        Flyable helicopter = new Helicopter();
        
        spacecraft.display();
        airplane.display();
        helicopter.display();
    }
}
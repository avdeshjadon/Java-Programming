// ------------------- 🔹Flyable Interface Implementation 🔹 -------------------
//
// 💡 Write a Java program to create an interface called `Flyable` with:
//     - An abstract method `fly_obj()`
//     - A default method `dispaly()` that calls `fly_obj()`
//
// Then create classes `SpaceCraft`, `Airplane`, and `Helicopter` that implement
// the `Flyable` interface and override the `fly_obj()` method to describe how each flies.
//
// ------------------- 🧾 SAMPLE OUTPUT -------------------
// Spacecraft is flying in space
// Airplane is flying in the sky
// Helicopter is hovering above ground


package JavaInterface;
interface Flyable {
    void fly_obj();
    default void dispaly() {
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
public class JavaInterface3 {
    public static void main(String[] args) {
        SpaceCraft spaceCraft = new SpaceCraft();
        Airplane airplane = new Airplane();
        Helicopter helicopter = new Helicopter();
        spaceCraft.dispaly(); ;
        airplane.dispaly();
        helicopter.dispaly();
    }
}

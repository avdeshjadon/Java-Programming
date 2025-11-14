// ------------------- 🔹Playable Interface -------------------
//
// 💡 Write a Java program to create an interface called `Playable` with a method:
//     - `play()`
//
// Then implement this interface in three classes: `Football`, `Volleyball`, and `Basketball`.
// Each class should override the `play()` method to display a sport-specific message.
//
// ------------------- 🧾 SAMPLE OUTPUT -------------------
// Playing Football
// Playing Football
// Playing Football


package JavaInterface;
interface Playable {
    void play();
}
class Football implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Football");
    }
}
class Volleyball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Football");
    }
}
class Basketball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Football");
    }
}
public class JavaInterface8 {
    public static void main(String[] args) {
        Football football = new Football();
        Volleyball volleyball = new Volleyball();
        Basketball basketball = new Basketball();

        football.play();
        volleyball.play();
        basketball.play();
    }
}

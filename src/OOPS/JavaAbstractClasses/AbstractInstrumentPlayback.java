// Abstract Class - Instrument Playback
//
// Problem: Write a Java program to create an abstract class Instrument with two abstract methods:
//     - play()
//     - tune()
//
// Then create two subclasses that extend Instrument:
//   Glockenspiel - prints: Glockenspiel is being played and tuned
//   Violin       - prints: Violin is being played and tuned
//
// Sample Output:
// Glockenspiel is being played and tuned
// Violin is being played and tuned

package OOPS.JavaAbstractClasses;

abstract class Instrument {

    public void display() {
        play();
        tune();
    }

    public abstract void play();
    public abstract void tune();
}

class Glockenspiel extends Instrument {
    @Override
    public void play() {
        System.out.print("Glockenspiel is being played and ");
    }

    @Override
    public void tune() {
        System.out.println("tuned");
    }
}

class Violin extends Instrument {
    @Override
    public void play() {
        System.out.print("Violin is being played and ");
    }

    @Override
    public void tune() {
        System.out.println("tuned");
    }
}

public class AbstractInstrumentPlayback {
    public static void main(String[] args) {
        Instrument avdeshGlockenspiel = new Glockenspiel();
        Instrument amanViolin = new Violin();
        avdeshGlockenspiel.display();
        amanViolin.display();
    }
}
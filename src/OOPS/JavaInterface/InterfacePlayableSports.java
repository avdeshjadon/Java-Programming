// Playable Interface for Sports
//
// Problem: Write a Java program to create an interface called Playable with a method:
//     - play()
//
// Then implement this interface in three classes: Football, Volleyball, and Basketball.
// Each class should override the play() method to display a sport-specific message.
//
// Sample Output:
// Playing Football
// Playing Volleyball
// Playing Basketball

package OOPS.JavaInterface;

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
        System.out.println("Playing Volleyball");
    }
}

class Basketball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Basketball");
    }
}

public class InterfacePlayableSports {
    public static void main(String[] args) {
        Football avdeshFootball = new Football();
        Volleyball amanVolleyball = new Volleyball();
        Basketball aviBasketball = new Basketball();

        avdeshFootball.play();
        amanVolleyball.play();
        aviBasketball.play();
    }
}
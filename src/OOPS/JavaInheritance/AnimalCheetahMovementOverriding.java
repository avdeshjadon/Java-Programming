// Animal Cheetah Movement Overriding
//
// Problem: Write a Java program to create a class called Animal1 with a method:
//     - move()
//
// Then create a subclass called Cheetah that:
//   Overrides the move() method to describe how a cheetah moves
//
// Sample Output:
// I am Running

package OOPS.JavaInheritance;

class Animal1 {
    void move() {
        System.out.println("I am moving");
    }
}

class Cheetah extends Animal1 {
    @Override
    void move() {
        System.out.println("I am Running");
    }
}

public class AnimalCheetahMovementOverriding {
    public static void main(String[] args) {
        Cheetah avdeshCheetah = new Cheetah();
        avdeshCheetah.move();
    }
}
// Member Inner Class - Person Address with Outer Reference
//
// Problem: Write a Java program to demonstrate a member inner class that modifies the outer class fields.
// Create a class Person with fields city and state. Define an inner class Address
// that sets these values via the outer class reference.
//
// The outer class should include a method display() to print the city and state.
//
// Sample Output:
// City: Agra
// State: UttarPradesh

package OOPS.JavaNestedClass;

class Person {
    String city;
    String state;

    class Address {
        Address(String city, String state) {
            Person.this.city = city;
            Person.this.state = state;
        }
    }

    void display() {
        System.out.println("City: " + city);
        System.out.println("State: " + state);
    }
}

public class MemberInnerClassPerson {
    public static void main(String[] args) {
        Person avdeshPerson = new Person();
        Person.Address amanAddress = avdeshPerson.new Address("Agra", "UttarPradesh");
        avdeshPerson.display();
    }
}